package cg;

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
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nh.gb;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;
import org.telegram.ui.ko;
import org.telegram.ui.tn;
import org.telegram.ui.vc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class v0 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int R0 = 0;
    public g0 A0;
    public final TextView B0;
    public nh.d C0;
    public Runnable D0;
    public boolean E0;
    public pk0 F0;
    public final org.telegram.ui.ActionBar.o2 G0;
    public h0 H0;
    public androidx.emoji2.text.o I0;
    public boolean J0;
    public TLRPC.Chat K0;
    public final n00 L0;
    public Runnable M0;
    public int N0;
    public final nh.d O0;
    public int P0;
    public String Q0;
    public int T;
    public boolean U;
    public int V;
    public long W;
    public TL_stories.TL_premium_boostsStatus X;
    public ChannelBoostsController.CanApplyBoost Y;
    public u0 Z;
    public boolean a0;
    public boolean b0;
    public org.telegram.ui.Cells.s1 c0;
    public final int d0;
    public final ArrayList e0;
    public boolean f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public ArrayList q0;
    public boolean r0;
    public int s0;
    public t0 t0;
    public final HashSet u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public ArrayList x0;
    public ArrayList y0;
    public ArrayList z0;

    public v0(int i10, int i11, Context context, org.telegram.ui.ActionBar.o2 o2Var, c6 c6Var) {
        super(context, o2Var, false, v1(i10), false, 1, c6Var);
        this.V = -1;
        this.b0 = false;
        this.e0 = new ArrayList();
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.u0 = new HashSet();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.E0 = false;
        this.N0 = 0;
        this.P0 = -4;
        fixNavigationBar(g6.v0(g6.h5, this.resourcesProvider));
        this.G0 = o2Var;
        this.currentAccount = i11;
        this.d0 = i10;
        M();
        M1();
        if (i10 == 2) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new a0(this, 0));
        } else if (i10 == 5) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new a0(this, 2));
        }
        L1();
        if (i10 == 32 || w1()) {
            n00 n00Var = new n00(getContext());
            this.L0 = n00Var;
            this.container.addView(n00Var, f6.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            h0 h0Var = this.H0;
            if (h0Var != null) {
                ((ViewGroup) h0Var.getParent()).removeView(this.H0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.B0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.A0.getTextView().getText());
            textView.setTextColor(g6.v0(g6.Sh, c6Var));
            textView.setOnClickListener(new z(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = g6.v0(g6.Oh, c6Var);
            int k9 = i0.a.k(g6.v0(g6.d6, c6Var), 120);
            textView.setBackground(g6.i0(dp, dp, dp, dp, v02, k9, k9));
        }
        if (i10 == 32) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            nh.d dVar = new nh.d(context, c6Var, true);
            this.O0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new z(this, 1));
            this.containerView.addView(dVar, f6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
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

    public static void C1(org.telegram.ui.ActionBar.o2 o2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus == null || canApplyBoost == null || o2Var.getContext() == null) {
            return;
        }
        v0 v0Var = new v0(32, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, o2Var.getResourceProvider());
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        if (z10) {
            o2Var.showDialog(v0Var);
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
        jl0 jl0Var = v0Var.d;
        ArrayList arrayList2 = v0Var.w0;
        arrayList2.clear();
        ArrayList arrayList3 = v0Var.v0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        v0Var.E0 = false;
        v0Var.F0.b(v0Var.j0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 >= jl0Var.getChildCount()) {
                i11 = 0;
                break;
            } else {
                if (jl0Var.getChildAt(i13) instanceof u0) {
                    i11 = jl0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            }
        }
        v0Var.M1();
        if (v0Var.h0 >= 0 && i11 != 0) {
            ((f2.j0) jl0Var.getLayoutManager()).h1(v0Var.h0 + 1, i11);
        }
        if (v0Var.I0 == null) {
            v0Var.I0 = u1(v0Var.d0, v0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), v0Var.I0.b);
        t0 t0Var = v0Var.t0;
        if (t0Var != null) {
            t0Var.g(max, false);
            v0Var.t0.setBagePosition(max / v0Var.I0.c);
            t0 t0Var2 = v0Var.t0;
            t0Var2.D = true;
            t0Var2.requestLayout();
        }
    }

    public static void S(v0 v0Var) {
        int i10 = v0Var.d0;
        HashSet hashSet = v0Var.u0;
        int i11 = 1;
        if (v0Var.f0) {
            org.telegram.ui.ActionBar.o2 o2Var = v0Var.G0;
            if (o2Var == null) {
                return;
            }
            org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
            m2Var.a = true;
            o2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
        } else if (i10 == 19 || i10 == 32 || v0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Y;
            if (canApplyBoost.canApply) {
                v0Var.A0.r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Y;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new b0(v0Var, i11), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && eg.q0.i() && !v0Var.Y.isMaxLvl) {
                eg.s.i(v0Var.W, v0Var);
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
        int i12 = 2;
        if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v0Var.e0.add((TLRPC.Chat) it.next());
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = formatPluralString;
            if (arrayList2.size() == 1) {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new androidx.car.app.utils.a(v0Var, arrayList2, user, i12));
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(g6.v0(g6.q7, v0Var.resourcesProvider));
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
            AndroidUtilities.runOnUIThread(new ag.z1(v0Var, arrayList, min, tL_messages_inactiveChats));
        }
    }

    public static void V(v0 v0Var, Context context) {
        org.telegram.ui.ActionBar.o2 o2Var = v0Var.G0;
        int i10 = v0Var.d0;
        if (i10 == 11 || i10 == 34) {
            return;
        }
        int i11 = 21;
        int i12 = 20;
        int i13 = 0;
        if (i10 != 19 && i10 != 32 && !v0Var.y1()) {
            if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                return;
            }
            if (UserConfig.getInstance(v0Var.currentAccount).isPremium() || MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked() || v0Var.J0) {
                v0Var.dismiss();
                return;
            } else {
                if (o2Var == null) {
                    return;
                }
                if (o2Var.getVisibleDialog() != null) {
                    o2Var.getVisibleDialog().dismiss();
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, A1(i10)));
                v0Var.dismiss();
                return;
            }
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Y;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(v0Var.currentAccount).isPremium() && eg.q0.i()) {
                eg.s.i(v0Var.W, v0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, v0Var.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(v0Var.x1() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new c0(v0Var, i13));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.f(i12));
            alertDialog$Builder.o();
            return;
        }
        boolean z10 = canApplyBoost.canApply;
        int i14 = 1;
        if (z10 && canApplyBoost.replaceDialogId == 0) {
            if (!canApplyBoost.needSelector || !eg.q0.i()) {
                v0Var.n1();
                return;
            }
            v0Var.b0 = true;
            v0Var.t0.W = false;
            org.telegram.ui.ActionBar.o2 o2Var2 = v0Var.n;
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Y;
            eg.x1 x1Var = new eg.x1(o2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
            x1Var.show();
            x1Var.setOnHideListener(new d0(v0Var, i13));
            return;
        }
        if (!z10) {
            int i15 = canApplyBoost.floodWait;
            if (i15 != 0) {
                eg.s.g(i15);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
        t9 t9Var = new t9(v0Var.getContext());
        t9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(t9Var, f6.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(g6.w0(null, g6.h5, false));
        frameLayout.addView(new i0(v0Var.getContext(), paint, v0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), f6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(v0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(g6.w0(null, g6.m6, false));
        frameLayout.addView(imageView, f6.e(24, 24, 17));
        t9 t9Var2 = new t9(v0Var.getContext());
        t9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(t9Var2, f6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(v0Var.getContext());
        frameLayout2.addView(frameLayout, f6.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(g6.w0(null, g6.j5, false));
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, f6.t(-1, -2, 0, 24, 80, 24, 0));
        e9 e9Var = new e9((c6) null);
        TLRPC.Chat chat = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.Y.replaceDialogId));
        e9Var.k(v0Var.currentAccount, chat);
        t9Var.e(chat, e9Var);
        e9 e9Var2 = new e9((c6) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.W));
        e9Var2.k(v0Var.currentAccount, chat2);
        t9Var2.e(chat2, e9Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.n(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new c0(v0Var, i14));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new a9.f(i11));
        alertDialog$Builder2.o();
    }

    public static void W(v0 v0Var, View view) {
        int i10;
        HashSet hashSet = v0Var.u0;
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
        if (view instanceof e4) {
            if (v0Var.U || !((i10 = v0Var.d0) == 11 || i10 == 34)) {
                e4 e4Var = (e4) view;
                Object object = e4Var.getObject();
                if (!e4Var.K) {
                    if (hashSet.contains(object)) {
                        hashSet.remove(object);
                    } else {
                        hashSet.add(object);
                    }
                    e4Var.c(hashSet.contains(object), true);
                    v0Var.K1();
                    return;
                }
                if (object instanceof TLRPC.User) {
                    long j10 = ((TLRPC.User) object).id;
                    int i11 = -v0Var.P0;
                    v0Var.P0 = i11;
                    AndroidUtilities.shakeViewSpring(e4Var, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j10 >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(v0Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked() ? new tc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new tc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new b0(v0Var, 0))).j();
                }
            }
        }
    }

    public static androidx.emoji2.text.o u1(int i10, int i11) {
        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o();
        oVar.a = 0;
        oVar.d = null;
        oVar.e = null;
        oVar.f = null;
        oVar.b = 0;
        oVar.c = 0;
        if (i10 == 0) {
            oVar.b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            oVar.c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            oVar.a = R.drawable.msg_limit_pin;
            oVar.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 33) {
            oVar.b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            oVar.c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            oVar.a = R.drawable.msg_limit_pin;
            oVar.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 2) {
            oVar.b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            oVar.c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 12) {
            oVar.b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            oVar.c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 13) {
            oVar.b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            oVar.c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 3) {
            oVar.b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            oVar.c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 4) {
            oVar.b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            oVar.c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            oVar.a = R.drawable.msg_limit_chats;
            oVar.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 5) {
            oVar.b = MessagesController.getInstance(i11).channelsLimitDefault;
            oVar.c = MessagesController.getInstance(i11).channelsLimitPremium;
            oVar.a = R.drawable.msg_limit_groups;
            oVar.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 6) {
            oVar.b = 100;
            oVar.c = 200;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            oVar.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            oVar.f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return oVar;
        }
        if (i10 == 7) {
            oVar.b = 3;
            oVar.c = 4;
            oVar.a = R.drawable.msg_limit_accounts;
            oVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 11) {
            oVar.b = 0;
            oVar.c = 0;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(oVar.c));
            oVar.e = "";
            oVar.f = "";
            return oVar;
        }
        if (i10 == 14) {
            oVar.b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            oVar.c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", oVar.b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", oVar.c);
            oVar.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", oVar.c);
            oVar.f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", oVar.b);
            return oVar;
        }
        if (i10 == 15) {
            oVar.b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            oVar.c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 16) {
            oVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            oVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return oVar;
        }
        oVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
        oVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
        oVar.a = R.drawable.filled_limit_boost;
        oVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
        oVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.c));
        oVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.b));
        return oVar;
    }

    public static boolean v1(int i10) {
        return i10 == 0 || i10 == 33 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16;
    }

    public final boolean B1() {
        String str;
        int i10 = 0;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.X, this.Y.copy(), Long.valueOf(this.W));
        nh.d dVar = this.O0;
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
        TransitionManager.beginDelayedTransition(this.Z, transitionSet);
        u0 u0Var = this.Z;
        eg.b bVar = u0Var.c;
        int indexOfChild = u0Var.indexOfChild(u0Var.b);
        v0 v0Var = u0Var.e;
        if (v0Var.a0) {
            int indexOfChild2 = u0Var.indexOfChild(u0Var.d);
            u0Var.removeView(u0Var.d);
            u0Var.d.removeView(u0Var.a);
            u0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(u0Var.getContext());
            u0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            u0Var.d.setWeightSum(1.0f);
            u0Var.d.addView(u0Var.a, f6.o(-2, -2, 1.0f, 0));
            u0Var.d.addView(bVar, f6.t(-2, -2, 48, 0, 2, 0, 0));
            u0Var.addView(u0Var.d, indexOfChild2, f6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = u0Var.indexOfChild(u0Var.a);
            u0Var.removeView(u0Var.a);
            TextView textView = new TextView(u0Var.getContext());
            u0Var.a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            u0Var.a.setTextSize(1, 20.0f);
            u0Var.a.setTextColor(g6.v0(g6.G6, v0Var.resourcesProvider));
            u0Var.a.setGravity(17);
            u0Var.addView(u0Var.a, indexOfChild3, f6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        u0Var.removeView(u0Var.b);
        TextView textView2 = new TextView(u0Var.getContext());
        u0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = u0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), u0Var.b.getLineSpacingMultiplier() * 1.1f);
        u0Var.b.setGravity(1);
        u0Var.b.setTextColor(g6.v0(g6.G6, v0Var.resourcesProvider));
        u0Var.addView(u0Var.b, indexOfChild, f6.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z.a.setText(r1());
        TextView textView4 = this.Z.b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i11 = this.d0;
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
        n00 n00Var = this.L0;
        n00Var.c(false);
        try {
            n00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z.c.a(this.Y.boostCount, true);
        this.d.x0(0);
        if (i11 == 32) {
            this.Z.c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.r0) {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.r0) {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new a9.s(3, this, arrayList));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.v0(g6.q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.Q0)) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.K0.id);
            if (chatFull == null) {
                dismiss();
                return;
            }
            if (this.K0.username != null) {
                str = "@" + this.K0.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.Q0;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.u0;
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
            c5.c0(this.currentAccount, arrayList3, 1, new ag.i0(this, 5));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z10 = true;
            }
            hashMap2 = hashMap;
            it2 = it3;
        }
        if (!z10) {
            AndroidUtilities.runOnUIThread(new b0(this, 2));
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.xa
    public final void F(hv0 hv0Var) {
        int i10;
        Context context = hv0Var.getContext();
        nh.d dVar = new nh.d(context, this.resourcesProvider, true);
        this.C0 = dVar;
        dVar.setFlickeringLoading(true);
        this.C0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.C0.setOnClickListener(new z(this, 2));
        g0 g0Var = new g0(this, context, this.resourcesProvider);
        this.A0 = g0Var;
        h6.b(g0Var, 0.02f, 1.2f);
        if (!this.r && (i10 = this.d0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            h0 h0Var = new h0(this, context, 0);
            this.H0 = h0Var;
            h0Var.setBackgroundColor(g6.v0(g6.h5, this.resourcesProvider));
            hv0Var.addView(this.H0, f6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g0 g0Var2 = this.A0;
        float f9 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        hv0Var.addView(g0Var2, f6.d(-1, 48.0f, 80, f9, 0.0f, f9, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        jl0 jl0Var = this.d;
        jl0Var.setPadding(0, 0, 0, dp);
        jl0Var.setClipToPadding(false);
        jl0Var.setClipChildren(false);
        int i11 = 2;
        jl0Var.setOnItemClickListener(new bg.o(this, i11));
        jl0Var.setOnItemLongClickListener(new c0(this, i11));
        this.A0.r.setOnClickListener(new ag.n(3, this, context));
        this.A0.e.setOnClickListener(new z(this, 3));
        this.F0 = new pk0(jl0Var, true);
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X = tL_premium_boostsStatus;
        this.a0 = z10;
        M1();
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.Y = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j10) {
        this.W = j10;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.K0 = chat;
        this.Q0 = str;
        this.U = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.x0 = new ArrayList(arrayList);
        this.y0 = arrayList2;
        this.z0 = arrayList3;
        HashSet hashSet = this.u0;
        hashSet.clear();
        if (this.U) {
            ArrayList arrayList4 = this.x0;
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
        int i11 = this.d0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.x0.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            g0 g0Var = this.A0;
            if (g0Var != null && g0Var.getParent() != null) {
                ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            }
            h0 h0Var = this.H0;
            if (h0Var != null && h0Var.getParent() != null) {
                ((ViewGroup) this.H0.getParent()).removeView(this.H0);
            }
            jl0 jl0Var = this.d;
            if (jl0Var != null) {
                jl0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void J1() {
        int i10;
        this.q0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i11 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.d0 == 31) {
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
            ArrayList arrayList3 = this.q0;
            arrayList3.add(new o0(i11, arrayList3.isEmpty()));
            this.q0.addAll(arrayList2);
            arrayList = arrayList2;
            i11++;
        }
    }

    public final void K1() {
        if (this.f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.d0;
        if (i10 != 19 && i10 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.u0;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() <= 0) {
                    g0 g0Var = this.A0;
                    g0Var.h = false;
                    g0Var.d(true);
                    return;
                } else {
                    if (i10 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i10 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.A0.c(str, true, true);
                    return;
                }
            }
            g0 g0Var2 = this.A0;
            if (g0Var2.C == null) {
                qq qqVar = new qq(g0Var2.getContext(), null);
                g0Var2.C = qqVar;
                qqVar.setGravity(3);
                qq qqVar2 = g0Var2.C;
                int i11 = g6.Oh;
                int i12 = g6.Sh;
                pq pqVar = qqVar2.a;
                pqVar.v = i11;
                pqVar.w = i12;
                pqVar.b = 0.8f;
                g0Var2.setClipChildren(false);
                g0Var2.addView(g0Var2.C, f6.e(-1, 24, 16));
            }
            if (!this.U) {
                this.A0.c(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.A0.c(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.A0.c(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.A0.C.a.c(hashSet.size(), true);
            this.A0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.A0.c(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            g0 g0Var3 = this.A0;
            g0Var3.h = false;
            g0Var3.d(true);
            return;
        }
        nh.d dVar = this.O0;
        if (z10) {
            if (eg.q0.i()) {
                this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                this.A0.c(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
                return;
            }
            return;
        }
        if (canApplyBoost.isMaxLvl) {
            this.C0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.A0.c(LocaleController.getString(R.string.OK), true, true);
            return;
        }
        if (eg.q0.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            return;
        }
        if (dVar != null) {
            dVar.g(LocaleController.getString(R.string.OK), true, true);
        }
        this.C0.g(LocaleController.getString(R.string.OK), true, true);
        this.A0.c(LocaleController.getString(R.string.OK), true, true);
    }

    public final void L1() {
        String string;
        if (this.f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.d0;
        if (i10 == 19 || i10 == 32 || y1()) {
            if (!eg.q0.i()) {
                this.A0.d.setText(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            b1 b1Var = this.A0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            b1Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.Y;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            this.A0.d.setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new iq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.A0.d.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.J0) {
            this.A0.d.setText(LocaleController.getString(R.string.OK));
            g0 g0Var = this.A0;
            g0Var.w.p = null;
            g0Var.y.setVisibility(8);
            return;
        }
        this.A0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
        androidx.emoji2.text.o oVar = this.I0;
        if (oVar == null) {
            g0 g0Var2 = this.A0;
            g0Var2.w.p = null;
            g0Var2.y.setVisibility(8);
            return;
        }
        int i11 = oVar.b;
        int i12 = i11 + 1;
        int i13 = oVar.c;
        if (i12 == i13) {
            this.A0.setIcon(R.raw.addone_icon);
            return;
        }
        if (i11 != 0 && i13 != 0) {
            float f9 = i13 / i11;
            if (f9 >= 1.6f && f9 <= 2.5f) {
                this.A0.setIcon(R.raw.double_icon);
                return;
            }
        }
        g0 g0Var3 = this.A0;
        g0Var3.w.p = null;
        g0Var3.y.setVisibility(8);
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.i0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.V = -1;
        this.n0 = -1;
        this.p0 = -1;
        this.g0 = 1;
        this.h0 = 0;
        int i10 = this.d0;
        if (i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 27 || i10 == 28 || i10 == 22 || i10 == 23 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 21 || i10 == 30 || i10 == 35) {
            if (i10 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i11 = this.g0;
                this.g0 = i11 + 1;
                this.V = i11;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i12 = this.g0;
                    this.g0 = i12 + 1;
                    this.o0 = i12;
                }
            }
            J1();
            int i13 = this.g0;
            int i14 = i13 + 1;
            this.g0 = i14;
            this.p0 = i13;
            this.g0 = (this.q0.size() - 1) + i14;
        } else if (i10 == 31 || i10 == 32) {
            this.v = 0.24f;
            J1();
            int i15 = this.g0;
            this.k0 = i15;
            int i16 = i15 + 1;
            this.g0 = i16;
            this.p0 = i15;
            int size = (this.q0.size() - 1) + i16;
            this.g0 = size;
            this.l0 = size;
        } else if (!v1(i10)) {
            if (i10 == 11 || i10 == 34) {
                this.v = 0.24f;
            } else {
                int i17 = this.g0;
                this.i0 = i17;
                this.g0 = i17 + 2;
                this.j0 = i17 + 1;
            }
            if (this.E0) {
                int i18 = this.g0;
                this.g0 = i18 + 1;
                this.m0 = i18;
            } else if (i10 != 11 || this.U) {
                if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.z0) == null || arrayList.isEmpty()) && ((arrayList2 = this.y0) == null || arrayList2.size() < this.x0.size())) || (arrayList3 = this.z0) == null || arrayList3.size() != 1 || (arrayList4 = this.y0) == null || arrayList4.size() != 1 || !this.U)) {
                    int i19 = this.g0;
                    this.k0 = i19;
                    if (i10 == 11 || i10 == 34) {
                        this.g0 = this.x0.size() + i19;
                    } else if (i10 == 5) {
                        this.g0 = this.v0.size() + i19;
                    } else {
                        this.g0 = this.e0.size() + i19;
                    }
                    this.l0 = this.g0;
                }
                if (this.l0 - this.k0 > 1) {
                    int i20 = this.g0;
                    this.g0 = i20 + 1;
                    this.n0 = i20;
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
            if (tL_premium_boostsStatus == null || this.Y == null) {
                return;
            }
            this.X.boosts += intValue;
            if (this.d0 == 32 && (t12 = t1()) != null) {
                t12.boosts_applied += intValue;
            }
            z1();
            F1(tL_premium_boostsStatus, this.a0);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
            canApplyBoost.isMaxLvl = this.X.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (B1()) {
                mc Q = new tc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        org.telegram.ui.ActionBar.o2 lastFragment = o2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof kg.s) {
            List fragmentStack = o2Var.getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack) : null;
            org.telegram.ui.ActionBar.o2 o2Var3 = fragmentStack.size() >= 3 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(4, fragmentStack) : null;
            if (o2Var2 instanceof ko) {
                ((ActionBarLayout) o2Var.getParentLayout()).a0(o2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                eg.s.f(o2Var3, chat, false);
                return;
            } else {
                if (o2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) o2Var.getParentLayout()).a0(o2Var3, false);
                }
                lastFragment.finishFragment();
                eg.s.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof tn) && booleanValue) {
            eg.s.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof vc) && booleanValue) {
            List fragmentStack2 = o2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) fragmentStack2.get(size);
                if ((o2Var4 instanceof tn) || (o2Var4 instanceof fy)) {
                    r6 = o2Var4;
                    break;
                }
                arrayList.add(o2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((ActionBarLayout) o2Var.getParentLayout()).a0((org.telegram.ui.ActionBar.o2) obj, false);
            }
            o2Var.finishFragment();
            dismiss();
            eg.s.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            gb gbVar = gb.B2;
            if (gbVar == null || !gbVar.d) {
                dismiss();
                eg.s.f(LaunchActivity.R(), chat, false);
                return;
            }
            tn R9 = tn.R9(-chat.id);
            LaunchActivity.R().presentFragment(R9, false, false);
            gb.x();
            dismiss();
            eg.s.f(R9, chat, false);
            return;
        }
        gb gbVar2 = gb.B2;
        if (gbVar2 != null && gbVar2.d) {
            tn R92 = tn.R9(-chat.id);
            LaunchActivity.R().presentFragment(R92, false, false);
            gb.x();
            dismiss();
            eg.s.f(R92, chat, true);
            return;
        }
        List fragmentStack3 = o2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack3) : null;
        o2Var.finishFragment();
        dismiss();
        if (r6 instanceof tn) {
            eg.s.f(r6, chat, true);
        }
    }

    public final void m1(final b90 b90Var, boolean z10) {
        if (!b90Var.b() || z10) {
            b90Var.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j10 = this.W;
            int i10 = this.Y.slot;
            final int i11 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) { // from class: cg.e0
                public final /* synthetic */ v0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new f0(this.b, b90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            b90 b90Var2 = b90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new a1.e(18, this.b, b90Var2), intValue * 1000);
                                    break;
                                } else {
                                    eg.s.g(intValue);
                                }
                            }
                            b90Var2.setLoading(false);
                            break;
                    }
                }
            };
            final int i12 = 1;
            boostsController.applyBoost(j10, i10, callback, new Utilities.Callback(this) { // from class: cg.e0
                public final /* synthetic */ v0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new f0(this.b, b90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            b90 b90Var2 = b90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new a1.e(18, this.b, b90Var2), intValue * 1000);
                                    break;
                                } else {
                                    eg.s.g(intValue);
                                }
                            }
                            b90Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void n1() {
        if (this.C0.isAttachedToWindow()) {
            m1(this.C0, false);
            return;
        }
        nh.d dVar = this.O0;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            m1(this.A0, false);
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.W;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return a4.w.m(j10, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
    }

    public final String q1(boolean z10) {
        String str;
        if (this.d0 == 32) {
            TLRPC.Chat s12 = s1();
            TLRPC.ChatFull t12 = t1();
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), s12 == null ? "" : s12.title);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
        if (chat == null) {
            str = LocaleController.getString(x1() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (y1() && this.X.next_level_boosts != 0 && z10) {
            int i10 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X;
            int i11 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i11, Integer.valueOf(i11)));
        }
        if (z11 && this.Y.alreadyActive) {
            if (this.X.level == 1) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level, new Object[0]));
        }
        if (this.Y.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X;
            if (tL_premium_boostsStatus3.level == 0) {
                int i12 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X;
                int i13 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i13, Integer.valueOf(i13)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
            }
            int i14 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X;
            int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i14, str, LocaleController.formatPluralString("MoreBoosts", i15, Integer.valueOf(i15)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X;
        if (tL_premium_boostsStatus6.level == 0) {
            int i16 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X;
            int i17 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i16, str, LocaleController.formatPluralString("MoreBoosts", i17, Integer.valueOf(i17)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
        }
        int i18 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X;
        int i19 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i19, Integer.valueOf(i19)));
    }

    public final String r1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Y.alreadyActive) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        boolean z10 = this.a0;
        int i10 = this.d0;
        if (!z10) {
            if (i10 == 32) {
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            if (this.Y.alreadyActive) {
                return LocaleController.getString(x1() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
            }
            return LocaleController.getString(x1() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
        if (i10 == 32) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
        if (this.Y.alreadyActive) {
            return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
        }
        return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.W);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        return new n0(this);
    }

    public final boolean w1() {
        int i10 = this.d0;
        return i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 27 || i10 == 28 || i10 == 23 || i10 == 30 || i10 == 35;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W)));
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        int i10 = this.d0;
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
        t0 t0Var = this.t0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        t0Var.b++;
        t0Var.a = i7.w.a((i10 - r3) / i11, 0.0f, 1.0f);
        t0Var.S = true;
        t0Var.T = t0Var.n;
        t0Var.g(i10, true);
        t0Var.E.requestLayout();
        t0Var.requestLayout();
    }
}
