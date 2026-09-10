package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$-CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class m60 {
    public static void a(org.telegram.ui.ActionBar.d2 d2Var, nf.e eVar, TLObject tLObject, final int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.p2 U;
        float f7;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (eVar != null) {
            eVar.b();
        }
        int i11 = 0;
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                if (tL_error == null || (U = LaunchActivity.U()) == null) {
                    return;
                }
                org.telegram.ui.Components.wc.a0(U).d0(tL_error, false);
                return;
            }
            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
            if (U2 != null) {
                org.telegram.messenger.a2.o(R.string.LinkIsNoActive, org.telegram.ui.Components.wc.a0(U2), R.raw.error, 36);
                return;
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        MessagesController.getInstance(i10).putUsers(groupcall.users, false);
        MessagesController.getInstance(i10).putChats(groupcall.chats, false);
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.id == groupCall.id && (launchActivity = LaunchActivity.G1) != null) {
            j60.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
            return;
        }
        ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
        zh.b bVar = new zh.b();
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, (org.telegram.ui.ActionBar.f6) bVar, false);
        h3Var.fixNavigationBar();
        LinearLayout f10 = org.telegram.messenger.em.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), bVar.F0(org.telegram.ui.ActionBar.j6.Oh)));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_calls_users);
        frameLayout.addView(imageView, w7.a6.e(56, 56, 17));
        f10.addView(frameLayout, w7.a6.t(80, 80, 1, 2, 21, 2, 13));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.m90 a2 = w7.e6.a(context, 20.0f, i12, true, bVar);
        a2.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
        a2.setGravity(17);
        f10.addView(a2, w7.a6.t(-1, -2, 1, 2, 0, 2, 4));
        List list = (List) Collection.-EL.stream(arrayList).map(new l8(5)).filter(new Predicate() { // from class: org.telegram.ui.k60
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Long l4 = (Long) obj;
                return (l4.longValue() == UserConfig.getInstance(i10).getClientUserId() || l4.longValue() == 0) ? false : true;
            }
        }).collect(Collectors.toList());
        boolean isEmpty = list.isEmpty();
        org.telegram.ui.Components.m90 a10 = w7.e6.a(context, 14.0f, i12, false, bVar);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
        a10.setGravity(17);
        a10.setMaxWidth(bi.x4.a(a10.getText(), a10.getPaint()));
        f10.addView(a10, w7.a6.t(-1, -2, 1, 2, 0, 2, 23));
        if (isEmpty) {
            f7 = 8.0f;
        } else {
            View view = new View(context);
            view.setBackgroundColor(-14012362);
            f10.addView(view, w7.a6.s(-1, 7, 0, 0, 0, 0.66f, 0));
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(context, false);
            j9Var.setCentered(true);
            j9Var.setSize(AndroidUtilities.dp(38.0f));
            int min = Math.min(3, list.size());
            j9Var.setCount(min);
            for (int i13 = 0; i13 < min; i13++) {
                j9Var.b(i13, MessagesController.getInstance(i10).getUser((Long) list.get(i13)), i10);
            }
            f7 = 8.0f;
            j9Var.a(false);
            f10.addView(j9Var, w7.a6.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
            org.telegram.ui.Components.m90 a11 = w7.e6.a(context, 14.0f, org.telegram.ui.ActionBar.j6.G6, false, bVar);
            a11.setGravity(17);
            if (list.size() == 1) {
                a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()))));
            } else if (list.size() == 2) {
                a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
            } else {
                a11.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
            }
            a11.setMaxWidth(bi.x4.a(a11.getText(), a11.getPaint()));
            f10.addView(a11, w7.a6.t(-1, -2, 1, 2, 0, 2, 25));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(bVar.F0(org.telegram.ui.ActionBar.j6.i6), 20, 20));
        org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(context, 24, bVar);
        tpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
        tpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(tpVar, w7.a6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(bVar.F0(org.telegram.ui.ActionBar.j6.j5));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 16, 9, 0, 0, 0));
        f10.addView(linearLayout, w7.a6.t(-2, 38, 1, 0, 4, 0, 12));
        w7.c6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new l60(tpVar, i11));
        bi.d dVar = new bi.d(context, bVar, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
        f10.addView(dVar, w7.a6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
        h3Var.customView = f10;
        dVar.setOnClickListener(new org.telegram.ui.Components.ro(h3Var, context, tpVar, i10, tL_inputGroupCallSlug, 1));
        h3Var.fixNavigationBar();
        h3Var.show();
    }

    public static void b(Activity activity, int i10, String str, nf.e eVar) {
        org.telegram.ui.ActionBar.d2 d2Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.G1) != null) {
                j60.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (eVar == null) {
            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(activity, 3, null);
            d2Var2.q(300L);
            d2Var = d2Var2;
        } else {
            d2Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new fg.e1(d2Var, eVar, i10, activity, tL_inputGroupCallSlug, 7));
        if (eVar != null) {
            eVar.b = new org.telegram.messenger.th(i10, sendRequest, 3);
            eVar.d();
        }
    }
}
