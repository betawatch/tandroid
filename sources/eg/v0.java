package eg;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.dd;
import org.telegram.ui.qy;
import org.telegram.ui.ro;
import org.telegram.ui.zn;
import ph.da;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class v0 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int S0 = 0;
    public ArrayList A0;
    public g0 B0;
    public final TextView C0;
    public ph.d D0;
    public Runnable E0;
    public boolean F0;
    public yk0 G0;
    public final org.telegram.ui.ActionBar.p2 H0;
    public h0 I0;
    public androidx.emoji2.text.p J0;
    public boolean K0;
    public TLRPC.Chat L0;
    public final s00 M0;
    public Runnable N0;
    public int O0;
    public final ph.d P0;
    public int Q0;
    public String R0;
    public int U;
    public boolean V;
    public int W;
    public long X;
    public TL_stories.TL_premium_boostsStatus Y;
    public ChannelBoostsController.CanApplyBoost Z;
    public u0 a0;
    public boolean b0;
    public boolean c0;
    public org.telegram.ui.Cells.s1 d0;
    public final int e0;
    public final ArrayList f0;
    public boolean g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public ArrayList r0;
    public boolean s0;
    public int t0;
    public t0 u0;
    public final HashSet v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public ArrayList y0;
    public ArrayList z0;

    public v0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p2 p2Var, f6 f6Var) {
        super(context, p2Var, false, v1(i10), false, 1, f6Var);
        this.W = -1;
        this.c0 = false;
        this.f0 = new ArrayList();
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.t0 = -1;
        this.v0 = new HashSet();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.F0 = false;
        this.O0 = 0;
        this.Q0 = -4;
        fixNavigationBar(j6.v0(j6.h5, this.resourcesProvider));
        this.H0 = p2Var;
        this.currentAccount = i11;
        this.e0 = i10;
        N();
        M1();
        if (i10 == 2) {
            this.F0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new a0(this, 0));
        } else if (i10 == 5) {
            this.F0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new a0(this, 2));
        }
        L1();
        if (i10 == 32 || w1()) {
            s00 s00Var = new s00(getContext());
            this.M0 = s00Var;
            this.container.addView(s00Var, b6.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.B0.getParent()).removeView(this.B0);
            h0 h0Var = this.I0;
            if (h0Var != null) {
                ((ViewGroup) h0Var.getParent()).removeView(this.I0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.C0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.B0.getTextView().getText());
            textView.setTextColor(j6.v0(j6.Sh, f6Var));
            textView.setOnClickListener(new z(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = j6.v0(j6.Oh, f6Var);
            int k10 = i0.a.k(j6.v0(j6.d6, f6Var), 120);
            textView.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        }
        if (i10 == 32) {
            ((ViewGroup) this.B0.getParent()).removeView(this.B0);
            ph.d dVar = new ph.d(context, f6Var, true);
            this.P0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new z(this, 1));
            this.containerView.addView(dVar, b6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new b0(this, 3));
        }
        if (i10 == 19 || i10 == 18) {
            this.containerView.post(new b0(this, 4));
        }
    }

    public static String A1(int i10) {
        switch (i10) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void C1(org.telegram.ui.ActionBar.p2 p2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z4) {
        if (tL_premium_boostsStatus == null || canApplyBoost == null || p2Var.getContext() == null) {
            return;
        }
        v0 v0Var = new v0(32, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, p2Var.getResourceProvider());
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        if (z4) {
            p2Var.showDialog(v0Var);
        } else {
            v0Var.show();
        }
    }

    public static /* synthetic */ void P(v0 v0Var, ArrayList arrayList, TLRPC.User user) {
        v0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(v0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(v0Var.currentAccount).deleteParticipantFromChat(chat.id, user);
        }
    }

    public static /* synthetic */ void Q(v0 v0Var, ArrayList arrayList) {
        v0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(v0Var.currentAccount).sendRequest(tL_channels_updateUsername, new a0(v0Var, 1), 64);
        }
    }

    public static void R(v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        rl0 rl0Var = v0Var.d;
        ArrayList arrayList2 = v0Var.x0;
        arrayList2.clear();
        ArrayList arrayList3 = v0Var.w0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        v0Var.F0 = false;
        v0Var.G0.b(v0Var.k0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 >= rl0Var.getChildCount()) {
                i11 = 0;
                break;
            } else {
                if (rl0Var.getChildAt(i13) instanceof u0) {
                    i11 = rl0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            }
        }
        v0Var.M1();
        if (v0Var.i0 >= 0 && i11 != 0) {
            ((f2.i0) rl0Var.getLayoutManager()).h1(v0Var.i0 + 1, i11);
        }
        if (v0Var.J0 == null) {
            v0Var.J0 = u1(v0Var.e0, v0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), v0Var.J0.b);
        t0 t0Var = v0Var.u0;
        if (t0Var != null) {
            t0Var.g(max, false);
            v0Var.u0.setBagePosition(max / v0Var.J0.c);
            t0 t0Var2 = v0Var.u0;
            t0Var2.E = true;
            t0Var2.requestLayout();
        }
    }

    public static void S(v0 v0Var) {
        int i10 = v0Var.e0;
        HashSet hashSet = v0Var.v0;
        int i11 = 1;
        if (v0Var.g0) {
            org.telegram.ui.ActionBar.p2 p2Var = v0Var.H0;
            if (p2Var == null) {
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
            n2Var.a = true;
            p2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), n2Var);
        } else if (i10 == 19 || i10 == 32 || v0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Z;
            if (canApplyBoost.canApply) {
                v0Var.B0.r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Z;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new b0(v0Var, i11), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && gg.p0.i() && !v0Var.Z.isMaxLvl) {
                gg.r.i(v0Var.X, v0Var);
                return;
            } else {
                v0Var.dismiss();
                return;
            }
        }
        if (i10 == 11 || i10 == 34) {
            if (hashSet.isEmpty()) {
                v0Var.dismiss();
                return;
            } else {
                v0Var.E1(null);
                return;
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v0Var.f0.add((TLRPC.Chat) it.next());
            }
            v0Var.D1(arrayList);
            return;
        }
        if (i10 == 5) {
            TLRPC.User user = MessagesController.getInstance(v0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(v0Var.currentAccount).getClientUserId()));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList2.add((TLRPC.Chat) it2.next());
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getContext(), 0, v0Var.resourcesProvider);
            String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = formatPluralString;
            if (arrayList2.size() == 1) {
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new androidx.car.app.utils.a(v0Var, arrayList2, user, 4));
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(j6.v0(j6.q7, v0Var.resourcesProvider));
            }
        }
    }

    public static /* synthetic */ void U(v0 v0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                int currentTime = (ConnectionsManager.getInstance(v0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new cg.v1(v0Var, arrayList, min, tL_messages_inactiveChats));
        }
    }

    public static void V(v0 v0Var, Context context) {
        org.telegram.ui.ActionBar.p2 p2Var = v0Var.H0;
        int i10 = v0Var.e0;
        if (i10 == 11 || i10 == 34) {
            return;
        }
        int i11 = 28;
        int i12 = 29;
        int i13 = 0;
        if (i10 != 19 && i10 != 32 && !v0Var.y1()) {
            if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                return;
            }
            if (UserConfig.getInstance(v0Var.currentAccount).isPremium() || MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked() || v0Var.K0) {
                v0Var.dismiss();
                return;
            } else {
                if (p2Var == null) {
                    return;
                }
                if (p2Var.getVisibleDialog() != null) {
                    p2Var.getVisibleDialog().dismiss();
                }
                p2Var.presentFragment(new PremiumPreviewFragment(0, A1(i10)));
                v0Var.dismiss();
                return;
            }
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Z;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(v0Var.currentAccount).isPremium() && gg.p0.i()) {
                gg.r.i(v0Var.X, v0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, v0Var.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(v0Var.x1() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new c0(v0Var, i13));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new af.a(i11));
            alertDialog$Builder.o();
            return;
        }
        boolean z4 = canApplyBoost.canApply;
        int i14 = 1;
        if (z4 && canApplyBoost.replaceDialogId == 0) {
            if (!canApplyBoost.needSelector || !gg.p0.i()) {
                v0Var.n1();
                return;
            }
            v0Var.c0 = true;
            v0Var.u0.a0 = false;
            org.telegram.ui.ActionBar.p2 p2Var2 = v0Var.n;
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Z;
            gg.w1 w1Var = new gg.w1(p2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
            w1Var.show();
            w1Var.setOnHideListener(new d0(v0Var, i13));
            return;
        }
        if (!z4) {
            int i15 = canApplyBoost.floodWait;
            if (i15 != 0) {
                gg.r.g(i15);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
        p9 p9Var = new p9(v0Var.getContext());
        p9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(p9Var, b6.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(j6.w0(null, j6.h5, false));
        frameLayout.addView(new i0(v0Var.getContext(), paint, v0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), b6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(v0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(j6.w0(null, j6.m6, false));
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        p9 p9Var2 = new p9(v0Var.getContext());
        p9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(p9Var2, b6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(v0Var.getContext());
        frameLayout2.addView(frameLayout, b6.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(j6.w0(null, j6.j5, false));
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, b6.t(-1, -2, 0, 24, 80, 24, 0));
        z8 z8Var = new z8((f6) null);
        TLRPC.Chat chat = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.Z.replaceDialogId));
        z8Var.k(v0Var.currentAccount, chat);
        p9Var.e(chat, z8Var);
        z8 z8Var2 = new z8((f6) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.X));
        z8Var2.k(v0Var.currentAccount, chat2);
        p9Var2.e(chat2, z8Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.n(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new c0(v0Var, i14));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new af.a(i12));
        alertDialog$Builder2.o();
    }

    public static void W(v0 v0Var, View view) {
        int i10;
        HashSet hashSet = v0Var.v0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.r.a(hashSet.contains(currentChannel), true);
            v0Var.K1();
            return;
        }
        if (view instanceof f4) {
            if (v0Var.V || !((i10 = v0Var.e0) == 11 || i10 == 34)) {
                f4 f4Var = (f4) view;
                Object object = f4Var.getObject();
                if (!f4Var.L) {
                    if (hashSet.contains(object)) {
                        hashSet.remove(object);
                    } else {
                        hashSet.add(object);
                    }
                    f4Var.c(hashSet.contains(object), true);
                    v0Var.K1();
                    return;
                }
                if (object instanceof TLRPC.User) {
                    long j10 = ((TLRPC.User) object).id;
                    int i11 = -v0Var.Q0;
                    v0Var.Q0 = i11;
                    AndroidUtilities.shakeViewSpring(f4Var, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j10 >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(v0Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked() ? new qc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new qc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new b0(v0Var, 0))).j();
                }
            }
        }
    }

    public static androidx.emoji2.text.p u1(int i10, int i11) {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p();
        pVar.a = 0;
        pVar.d = null;
        pVar.e = null;
        pVar.f = null;
        pVar.b = 0;
        pVar.c = 0;
        if (i10 == 0) {
            pVar.b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            pVar.c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 33) {
            pVar.b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            pVar.c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 2) {
            pVar.b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            pVar.c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 12) {
            pVar.b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            pVar.c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 13) {
            pVar.b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            pVar.c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 3) {
            pVar.b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            pVar.c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 4) {
            pVar.b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            pVar.c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            pVar.a = R.drawable.msg_limit_chats;
            pVar.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 5) {
            pVar.b = MessagesController.getInstance(i11).channelsLimitDefault;
            pVar.c = MessagesController.getInstance(i11).channelsLimitPremium;
            pVar.a = R.drawable.msg_limit_groups;
            pVar.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 6) {
            pVar.b = 100;
            pVar.c = 200;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            pVar.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            pVar.f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return pVar;
        }
        if (i10 == 7) {
            pVar.b = 3;
            pVar.c = 4;
            pVar.a = R.drawable.msg_limit_accounts;
            pVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 11) {
            pVar.b = 0;
            pVar.c = 0;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(pVar.c));
            pVar.e = "";
            pVar.f = "";
            return pVar;
        }
        if (i10 == 14) {
            pVar.b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            pVar.c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", pVar.b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", pVar.c);
            pVar.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", pVar.c);
            pVar.f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", pVar.b);
            return pVar;
        }
        if (i10 == 15) {
            pVar.b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            pVar.c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 16) {
            pVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            pVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return pVar;
        }
        pVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
        pVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
        pVar.a = R.drawable.filled_limit_boost;
        pVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
        pVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.c));
        pVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.b));
        return pVar;
    }

    public static boolean v1(int i10) {
        return i10 == 0 || i10 == 33 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16;
    }

    public final boolean B1() {
        String str;
        int i10 = 0;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.Y, this.Z.copy(), Long.valueOf(this.X));
        ph.d dVar = this.P0;
        if (dVar != null) {
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
            if (max == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new j0(i10));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.a0, transitionSet);
        u0 u0Var = this.a0;
        gg.b bVar = u0Var.c;
        int indexOfChild = u0Var.indexOfChild(u0Var.b);
        v0 v0Var = u0Var.e;
        if (v0Var.b0) {
            int indexOfChild2 = u0Var.indexOfChild(u0Var.d);
            u0Var.removeView(u0Var.d);
            u0Var.d.removeView(u0Var.a);
            u0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(u0Var.getContext());
            u0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            u0Var.d.setWeightSum(1.0f);
            u0Var.d.addView(u0Var.a, b6.o(-2, -2, 1.0f, 0));
            u0Var.d.addView(bVar, b6.t(-2, -2, 48, 0, 2, 0, 0));
            u0Var.addView(u0Var.d, indexOfChild2, b6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = u0Var.indexOfChild(u0Var.a);
            u0Var.removeView(u0Var.a);
            TextView textView = new TextView(u0Var.getContext());
            u0Var.a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            u0Var.a.setTextSize(1, 20.0f);
            u0Var.a.setTextColor(j6.v0(j6.G6, v0Var.resourcesProvider));
            u0Var.a.setGravity(17);
            u0Var.addView(u0Var.a, indexOfChild3, b6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        u0Var.removeView(u0Var.b);
        TextView textView2 = new TextView(u0Var.getContext());
        u0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = u0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), u0Var.b.getLineSpacingMultiplier() * 1.1f);
        u0Var.b.setGravity(1);
        u0Var.b.setTextColor(j6.v0(j6.G6, v0Var.resourcesProvider));
        u0Var.addView(u0Var.b, indexOfChild, b6.t(-2, -2, 1, 24, -2, 24, 17));
        this.a0.a.setText(r1());
        TextView textView4 = this.a0.b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i11 = this.e0;
        if (i11 == 20) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(o1()));
        } else if (i11 == 24) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(o1()));
        } else if (i11 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i11 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i11 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i11 == 25) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i11 == 26) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i11 == 27) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i11 == 28) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(x12 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i11 == 22) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i11 == 23) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            str = null;
        }
        if (str == null) {
            str = q1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        K1();
        s00 s00Var = this.M0;
        s00Var.c(false);
        try {
            s00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.a0.c.a(this.Z.boostCount, true);
        this.d.x0(0);
        if (i11 == 32) {
            this.a0.c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.s0) {
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.s0) {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new c1.b(8, this, arrayList));
        d2Var.show();
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(j6.v0(j6.q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.R0)) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.L0.id);
            if (chatFull == null) {
                dismiss();
                return;
            }
            if (this.L0.username != null) {
                str = "@" + this.L0.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.R0;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.v0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.id));
            }
            (sendPaidMessagesStars >= 0 ? arrayList : arrayList2).add(user);
        }
        int i10 = 0;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            z4.c0(this.currentAccount, arrayList3, 1, new cg.h0(this, 5));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z4 = true;
            }
            hashMap2 = hashMap;
            it2 = it3;
        }
        if (!z4) {
            AndroidUtilities.runOnUIThread(new b0(this, 2));
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.sa
    public final void F(qv0 qv0Var) {
        int i10;
        Context context = qv0Var.getContext();
        ph.d dVar = new ph.d(context, this.resourcesProvider, true);
        this.D0 = dVar;
        dVar.setFlickeringLoading(true);
        this.D0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.D0.setOnClickListener(new z(this, 2));
        g0 g0Var = new g0(this, context, this.resourcesProvider);
        this.B0 = g0Var;
        d6.b(g0Var, 0.02f, 1.2f);
        if (!this.r && (i10 = this.e0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            h0 h0Var = new h0(this, context, 0);
            this.I0 = h0Var;
            h0Var.setBackgroundColor(j6.v0(j6.h5, this.resourcesProvider));
            qv0Var.addView(this.I0, b6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g0 g0Var2 = this.B0;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        qv0Var.addView(g0Var2, b6.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        rl0 rl0Var = this.d;
        rl0Var.setPadding(0, 0, 0, dp);
        rl0Var.setClipToPadding(false);
        rl0Var.setClipChildren(false);
        int i11 = 2;
        rl0Var.setOnItemClickListener(new dg.n(this, i11));
        rl0Var.setOnItemLongClickListener(new c0(this, i11));
        this.B0.r.setOnClickListener(new cg.n(3, this, context));
        this.B0.e.setOnClickListener(new z(this, 3));
        this.G0 = new yk0(rl0Var, true);
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z4) {
        this.Y = tL_premium_boostsStatus;
        this.b0 = z4;
        M1();
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.Z = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j10) {
        this.X = j10;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.L0 = chat;
        this.R0 = str;
        this.V = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.y0 = new ArrayList(arrayList);
        this.z0 = arrayList2;
        this.A0 = arrayList3;
        HashSet hashSet = this.v0;
        hashSet.clear();
        if (this.V) {
            ArrayList arrayList4 = this.y0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        M1();
        K1();
        int i11 = this.e0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.y0.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            g0 g0Var = this.B0;
            if (g0Var != null && g0Var.getParent() != null) {
                ((ViewGroup) this.B0.getParent()).removeView(this.B0);
            }
            h0 h0Var = this.I0;
            if (h0Var != null && h0Var.getParent() != null) {
                ((ViewGroup) this.I0.getParent()).removeView(this.I0);
            }
            rl0 rl0Var = this.d;
            if (rl0Var != null) {
                rl0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void J1() {
        int i10;
        this.r0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        int i11 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.e0 == 31) {
            i11 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i12 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int max = Math.max(10, peerColors != null ? peerColors.maxLevel(x1()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int max2 = Math.max(max, peerColors2 != null ? peerColors2.maxLevel(x1()) : 0);
            i12 = x1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
        }
        ArrayList arrayList = null;
        while (i11 <= i12) {
            boolean x12 = x1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!x12 && i11 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                p0 b10 = p0.b(R.drawable.menu_feature_stories, i11, "BoostFeatureStoriesPerDay");
                b10.f = true;
                arrayList2.add(b10);
                if (!x12) {
                    p0 b11 = p0.b(R.drawable.menu_feature_reactions, i11, "BoostFeatureCustomReaction");
                    b11.f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                int colorsAvailable = peerColors3 != null ? peerColors3.colorsAvailable(i11, false) : 0;
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                int colorsAvailable2 = peerColors4 != null ? peerColors4.colorsAvailable(i11, x12) : 0;
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(p0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(p0.b(R.drawable.menu_feature_links, colorsAvailable, "BoostFeatureReplyColor"));
                }
                if (!x12 && i11 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (colorsAvailable2 > 0) {
                    arrayList2.add(p0.b(R.drawable.menu_feature_color_profile, colorsAvailable2, x12 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
                }
                if (x12 && i11 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!x12 && i11 >= messagesController2.channelProfileIconLevelMin) || (x12 && i11 >= messagesController2.groupProfileBgIconLevelMin)) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_cover, x12 ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
                }
                if (x12 && i11 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!x12 && i11 >= messagesController2.channelEmojiStatusLevelMin) || (x12 && i11 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new p0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!x12 && i11 >= messagesController2.channelWallpaperLevelMin) || (x12 && i11 >= messagesController2.groupWallpaperLevelMin)) {
                    arrayList2.add(p0.b(R.drawable.menu_feature_wallpaper, 8, x12 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
                }
                if ((!x12 && i11 >= messagesController2.channelCustomWallpaperLevelMin) || (x12 && i11 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_custombg, x12 ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
                }
                if (!x12 && i11 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                while (i10 < arrayList.size()) {
                    p0 p0Var = (p0) arrayList.get(i10);
                    p0 p0Var2 = (p0) arrayList2.get(i10);
                    int i13 = p0Var.e;
                    i10 = (p0Var2 != null && ((p0Var.f && i13 > 2) || (p0Var.a == p0Var2.a && p0Var.b == p0Var2.b && TextUtils.equals(p0Var.c, p0Var2.c) && TextUtils.equals(p0Var.d, p0Var2.d) && i13 == p0Var2.e))) ? i10 + 1 : 0;
                }
                i11++;
            }
            ArrayList arrayList3 = this.r0;
            arrayList3.add(new o0(i11, arrayList3.isEmpty()));
            this.r0.addAll(arrayList2);
            arrayList = arrayList2;
            i11++;
        }
    }

    public final void K1() {
        if (this.g0) {
            this.B0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.e0;
        if (i10 != 19 && i10 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.v0;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() <= 0) {
                    g0 g0Var = this.B0;
                    g0Var.h = false;
                    g0Var.d(true);
                    return;
                } else {
                    if (i10 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i10 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.B0.c(str, true, true);
                    return;
                }
            }
            g0 g0Var2 = this.B0;
            if (g0Var2.D == null) {
                tq tqVar = new tq(g0Var2.getContext(), null);
                g0Var2.D = tqVar;
                tqVar.setGravity(3);
                tq tqVar2 = g0Var2.D;
                int i11 = j6.Oh;
                int i12 = j6.Sh;
                sq sqVar = tqVar2.a;
                sqVar.v = i11;
                sqVar.w = i12;
                sqVar.b = 0.8f;
                g0Var2.setClipChildren(false);
                g0Var2.addView(g0Var2.D, b6.e(-1, 24, 16));
            }
            if (!this.V) {
                this.B0.c(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.B0.c(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.B0.c(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.B0.D.a.c(hashSet.size(), true);
            this.B0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.Z;
        boolean z4 = canApplyBoost.canApply;
        if ((z4 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.B0.c(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            g0 g0Var3 = this.B0;
            g0Var3.h = false;
            g0Var3.d(true);
            return;
        }
        ph.d dVar = this.P0;
        if (z4) {
            if (gg.p0.i()) {
                this.B0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                this.B0.c(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
            }
            this.D0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
                return;
            }
            return;
        }
        if (canApplyBoost.isMaxLvl) {
            this.D0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.B0.c(LocaleController.getString(R.string.OK), true, true);
            return;
        }
        if (gg.p0.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.D0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.B0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            return;
        }
        if (dVar != null) {
            dVar.g(LocaleController.getString(R.string.OK), true, true);
        }
        this.D0.g(LocaleController.getString(R.string.OK), true, true);
        this.B0.c(LocaleController.getString(R.string.OK), true, true);
    }

    public final void L1() {
        String string;
        if (this.g0) {
            this.B0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.e0;
        if (i10 == 19 || i10 == 32 || y1()) {
            if (!gg.p0.i()) {
                this.B0.d.setText(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            a1 a1Var = this.B0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Z;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            a1Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.Z;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            this.B0.d.setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new lq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.B0.d.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.K0) {
            this.B0.d.setText(LocaleController.getString(R.string.OK));
            g0 g0Var = this.B0;
            g0Var.w.p = null;
            g0Var.y.setVisibility(8);
            return;
        }
        this.B0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
        androidx.emoji2.text.p pVar = this.J0;
        if (pVar == null) {
            g0 g0Var2 = this.B0;
            g0Var2.w.p = null;
            g0Var2.y.setVisibility(8);
            return;
        }
        int i11 = pVar.b;
        int i12 = i11 + 1;
        int i13 = pVar.c;
        if (i12 == i13) {
            this.B0.setIcon(R.raw.addone_icon);
            return;
        }
        if (i11 != 0 && i13 != 0) {
            float f10 = i13 / i11;
            if (f10 >= 1.6f && f10 <= 2.5f) {
                this.B0.setIcon(R.raw.double_icon);
                return;
            }
        }
        g0 g0Var3 = this.B0;
        g0Var3.w.p = null;
        g0Var3.y.setVisibility(8);
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.j0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.W = -1;
        this.o0 = -1;
        this.q0 = -1;
        this.h0 = 1;
        this.i0 = 0;
        int i10 = this.e0;
        if (i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 27 || i10 == 28 || i10 == 22 || i10 == 23 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 21 || i10 == 30 || i10 == 35) {
            if (i10 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i11 = this.h0;
                this.h0 = i11 + 1;
                this.W = i11;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i12 = this.h0;
                    this.h0 = i12 + 1;
                    this.p0 = i12;
                }
            }
            J1();
            int i13 = this.h0;
            int i14 = i13 + 1;
            this.h0 = i14;
            this.q0 = i13;
            this.h0 = (this.r0.size() - 1) + i14;
        } else if (i10 == 31 || i10 == 32) {
            this.v = 0.24f;
            J1();
            int i15 = this.h0;
            this.l0 = i15;
            int i16 = i15 + 1;
            this.h0 = i16;
            this.q0 = i15;
            int size = (this.r0.size() - 1) + i16;
            this.h0 = size;
            this.m0 = size;
        } else if (!v1(i10)) {
            if (i10 == 11 || i10 == 34) {
                this.v = 0.24f;
            } else {
                int i17 = this.h0;
                this.j0 = i17;
                this.h0 = i17 + 2;
                this.k0 = i17 + 1;
            }
            if (this.F0) {
                int i18 = this.h0;
                this.h0 = i18 + 1;
                this.n0 = i18;
            } else if (i10 != 11 || this.V) {
                if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.A0) == null || arrayList.isEmpty()) && ((arrayList2 = this.z0) == null || arrayList2.size() < this.y0.size())) || (arrayList3 = this.A0) == null || arrayList3.size() != 1 || (arrayList4 = this.z0) == null || arrayList4.size() != 1 || !this.V)) {
                    int i19 = this.h0;
                    this.l0 = i19;
                    if (i10 == 11 || i10 == 34) {
                        this.h0 = this.y0.size() + i19;
                    } else if (i10 == 5) {
                        this.h0 = this.w0.size() + i19;
                    } else {
                        this.h0 = this.f0.size() + i19;
                    }
                    this.m0 = this.h0;
                }
                if (this.m0 - this.l0 > 1) {
                    int i20 = this.h0;
                    this.h0 = i20 + 1;
                    this.o0 = i20;
                }
            }
        }
        this.d.getAdapter().l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull t12;
        if (i10 != NotificationCenter.boostByChannelCreated) {
            if (i10 != NotificationCenter.boostedChannelByUser) {
                if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.Z == null) {
                return;
            }
            this.Y.boosts += intValue;
            if (this.e0 == 32 && (t12 = t1()) != null) {
                t12.boosts_applied += intValue;
            }
            z1();
            F1(tL_premium_boostsStatus, this.b0);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Z;
            canApplyBoost.isMaxLvl = this.Y.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (B1()) {
                ic Q = new qc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        org.telegram.ui.ActionBar.p2 lastFragment = p2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof mg.s) {
            List fragmentStack = p2Var.getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.p2 p2Var2 = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack) : null;
            org.telegram.ui.ActionBar.p2 p2Var3 = fragmentStack.size() >= 3 ? (org.telegram.ui.ActionBar.p2) ai.j(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (org.telegram.ui.ActionBar.p2) ai.j(4, fragmentStack) : null;
            if (p2Var2 instanceof ro) {
                ((ActionBarLayout) p2Var.getParentLayout()).a0(p2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                gg.r.f(p2Var3, chat, false);
                return;
            } else {
                if (p2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) p2Var.getParentLayout()).a0(p2Var3, false);
                }
                lastFragment.finishFragment();
                gg.r.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof zn) && booleanValue) {
            gg.r.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof dd) && booleanValue) {
            List fragmentStack2 = p2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) fragmentStack2.get(size);
                if ((p2Var4 instanceof zn) || (p2Var4 instanceof qy)) {
                    r6 = p2Var4;
                    break;
                }
                arrayList.add(p2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((ActionBarLayout) p2Var.getParentLayout()).a0((org.telegram.ui.ActionBar.p2) obj, false);
            }
            p2Var.finishFragment();
            dismiss();
            gg.r.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            da daVar = da.C2;
            if (daVar == null || !daVar.d) {
                dismiss();
                gg.r.f(LaunchActivity.R(), chat, false);
                return;
            }
            zn R9 = zn.R9(-chat.id);
            LaunchActivity.R().presentFragment(R9, false, false);
            da.x();
            dismiss();
            gg.r.f(R9, chat, false);
            return;
        }
        da daVar2 = da.C2;
        if (daVar2 != null && daVar2.d) {
            zn R92 = zn.R9(-chat.id);
            LaunchActivity.R().presentFragment(R92, false, false);
            da.x();
            dismiss();
            gg.r.f(R92, chat, true);
            return;
        }
        List fragmentStack3 = p2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack3) : null;
        p2Var.finishFragment();
        dismiss();
        if (r6 instanceof zn) {
            gg.r.f(r6, chat, true);
        }
    }

    public final void m1(final i90 i90Var, boolean z4) {
        if (!i90Var.b() || z4) {
            i90Var.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j10 = this.X;
            int i10 = this.Z.slot;
            final int i11 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) { // from class: eg.e0
                public final /* synthetic */ v0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.X, new f0(this.b, i90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            i90 i90Var2 = i90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new a1.e(26, this.b, i90Var2), intValue * 1000);
                                    break;
                                } else {
                                    gg.r.g(intValue);
                                }
                            }
                            i90Var2.setLoading(false);
                            break;
                    }
                }
            };
            final int i12 = 1;
            boostsController.applyBoost(j10, i10, callback, new Utilities.Callback(this) { // from class: eg.e0
                public final /* synthetic */ v0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.X, new f0(this.b, i90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            i90 i90Var2 = i90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new a1.e(26, this.b, i90Var2), intValue * 1000);
                                    break;
                                } else {
                                    gg.r.g(intValue);
                                }
                            }
                            i90Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void n1() {
        if (this.D0.isAttachedToWindow()) {
            m1(this.D0, false);
            return;
        }
        ph.d dVar = this.P0;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            m1(this.B0, false);
        } else {
            m1(dVar, false);
        }
    }

    public int o1() {
        return 0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    public final String p1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.Y.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.X;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return android.support.v4.media.a.n(j10, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
    }

    public final String q1(boolean z4) {
        String str;
        if (this.e0 == 32) {
            TLRPC.Chat s12 = s1();
            TLRPC.ChatFull t12 = t1();
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), s12 == null ? "" : s12.title);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X));
        if (chat == null) {
            str = LocaleController.getString(x1() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        boolean z10 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (y1() && this.Y.next_level_boosts != 0 && z4) {
            int i10 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.Y;
            int i11 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i11, Integer.valueOf(i11)));
        }
        if (z10 && this.Z.alreadyActive) {
            if (this.Y.level == 1) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.Y.level), LocaleController.formatPluralString("BoostStories", this.Y.level, new Object[0]));
        }
        if (this.Z.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.Y;
            if (tL_premium_boostsStatus3.level == 0) {
                int i12 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.Y;
                int i13 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i13, Integer.valueOf(i13)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.Y.level), LocaleController.formatPluralString("BoostStories", this.Y.level + 1, new Object[0]));
            }
            int i14 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.Y;
            int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i14, str, LocaleController.formatPluralString("MoreBoosts", i15, Integer.valueOf(i15)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.Y;
        if (tL_premium_boostsStatus6.level == 0) {
            int i16 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.Y;
            int i17 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i16, str, LocaleController.formatPluralString("MoreBoosts", i17, Integer.valueOf(i17)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.Y.level), LocaleController.formatPluralString("BoostStories", this.Y.level + 1, new Object[0]));
        }
        int i18 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.Y;
        int i19 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i19, Integer.valueOf(i19)));
    }

    public final String r1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Z.alreadyActive) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        boolean z4 = this.b0;
        int i10 = this.e0;
        if (!z4) {
            if (i10 == 32) {
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            if (this.Z.alreadyActive) {
                return LocaleController.getString(x1() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
            }
            return LocaleController.getString(x1() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
        if (i10 == 32) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X));
        if (this.Z.alreadyActive) {
            return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
        }
        return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.X);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        return new n0(this);
    }

    public final boolean w1() {
        int i10 = this.e0;
        return i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 27 || i10 == 28 || i10 == 23 || i10 == 30 || i10 == 35;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X)));
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        int i10 = this.e0;
        if (i10 == 11) {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
        if (i10 == 34) {
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        if (i10 == 35) {
            return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
        }
        switch (i10) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
            case 32:
                return LocaleController.getString(R.string.BoostGroup);
            default:
                return LocaleController.getString(R.string.LimitReached);
        }
    }

    public final boolean y1() {
        return w1() && ChatObject.hasAdminRights(s1());
    }

    public final void z1() {
        t0 t0Var = this.u0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        t0Var.b++;
        t0Var.a = k7.n.a((i10 - r3) / i11, 0.0f, 1.0f);
        t0Var.T = true;
        t0Var.U = t0Var.n;
        t0Var.g(i10, true);
        t0Var.F.requestLayout();
        t0Var.requestLayout();
    }
}
