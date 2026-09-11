package ji;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.cc1;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
import org.telegram.ui.lu0;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class c2 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public kz A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public boolean E;
    public int E0;
    public final int[] F;
    public int F0;
    public int[] G;
    public boolean G0;
    public int[] H;
    public fi.g2 H0;
    public float I;
    public int I0;
    public co J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public o1 N0;
    public u1 O;
    public cj0 O0;
    public v3 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public h1 R0;
    public FrameLayout S;
    public int S0;
    public ImageView T;
    public int T0;
    public LinearLayout U;
    public int U0;
    public ImageView V;
    public boolean V0;
    public ImageView W;
    public FrameLayout X;
    public FrameLayout Y;
    public FrameLayout Z;
    public final CharSequence a;
    public LinearLayout a0;
    public final TL_iv.RichMessage b;
    public bh b0;
    public int c;
    public ImageView c0;
    public int d;
    public v1 d0;
    public boolean e;
    public LinearLayout e0;
    public final String f;
    public final ArrayList f0;
    public ImageView g0;
    public CharSequence h;
    public cc1 h0;
    public LinearLayout i0;
    public w1 j0;
    public int k0;
    public final ArrayList l0;
    public LinearLayout m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public y1 p0;
    public y1 q0;
    public MessageObject r;
    public y1 r0;
    public ih.g s;
    public y1 s0;
    public y1 t0;
    public y1 u0;
    public mk v;
    public FrameLayout v0;
    public final Rect w;
    public aj0 w0;
    public dh.d x;
    public n70 x0;
    public RectF y;
    public x1 y0;
    public m.p3 z0;

    public c2(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new i1(this, 0);
        this.a = editable;
    }

    public static void U(c2 c2Var) {
        i3 i3Var = c2Var.P.n3;
        if (i3Var != null && i3Var.y()) {
            c2Var.n0();
            return;
        }
        Activity parentActivity = c2Var.getParentActivity();
        new x(c2Var.currentAccount, parentActivity, new bi.o1(c2Var, 27), c2Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void V(c2 c2Var) {
        if (UserConfig.getInstance(c2Var.currentAccount).isPremium()) {
            return;
        }
        c2Var.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) c2Var, 43, true));
    }

    public static boolean W(c2 c2Var, View view) {
        co coVar = c2Var.J;
        if (coVar != null && c2Var.r == null && !coVar.c() && c2Var.P.j3() && !c2Var.P.l3()) {
            if (!c2Var.P.L3()) {
                c2Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Y2 = c2Var.P.Y2();
            if (!Y2.isEmpty()) {
                cj0 cj0Var = c2Var.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    c2Var.O0 = null;
                }
                cj0 cj0Var2 = new cj0(c2Var.getParentActivity(), c2Var.getResourceProvider());
                c2Var.O0 = cj0Var2;
                cj0Var2.setOnDismissListener(new bi.r4(c2Var, 5));
                long a2 = c2Var.J.a();
                MessageObject messageObject = c2Var.J.n5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(c2Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(c2Var.currentAccount).getPeer(UserConfig.getInstance(c2Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Y2;
                richMessage.photos = c2Var.P.A2();
                tL_message.rich_message.documents = c2Var.P.x2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(c2Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                c2Var.O0.q(org.telegram.messenger.w1.l(messageObject2));
                c2Var.y0.setScaleX(1.0f);
                c2Var.y0.setScaleY(1.0f);
                vg r10 = c2Var.O0.r(c2Var.y0, true, new j1(c2Var, 10));
                if (r10 != null) {
                    r10.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), c2Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh))));
                    cj0 cj0Var3 = c2Var.O0;
                    int dp = AndroidUtilities.dp(44.0f);
                    cj0Var3.m0 = true;
                    cj0Var3.Y = dp;
                }
                n70 H = n70.H(c2Var, c2Var.y0);
                boolean isUserSelf = UserObject.isUserSelf(c2Var.J.i());
                if (c2Var.J.D6()) {
                    H.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new bi.g(c2Var, a2, 11), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new i1(c2Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new i1(c2Var, 6), false);
                }
                H.Y();
                c2Var.O0.p(H);
                c2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void X(c2 c2Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(c2Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, c2Var.J);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(c2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j3, messageObject2, messageObject3, z10, i10, i11, sendMessageChatArguments, 0L, j10, 0L);
        }
    }

    public static void Y(final c2 c2Var, Context context, View view) {
        n70 n70Var;
        boolean z10;
        n70 n70Var2 = c2Var.x0;
        if (n70Var2 != null) {
            n70Var2.u();
            c2Var.x0 = null;
        }
        boolean z11 = (MessagesController.getInstance(c2Var.currentAccount).richEditorAllowed() || UserConfig.getInstance(c2Var.currentAccount).isPremium()) ? false : true;
        final a P2 = c2Var.P.P2();
        final n70 I = n70.I(c2Var, view);
        I.Q = true;
        n70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(I, 1), false);
        J.k();
        final int i10 = 0;
        J.j(P2 != null && (P2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(c2Var) { // from class: ji.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 2);
        final int i11 = 1;
        J.j(P2 != null && (P2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(c2Var) { // from class: ji.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 1);
        final int i12 = 2;
        J.j(P2 != null && (P2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(c2Var) { // from class: ji.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize);
        final int i13 = 3;
        J.j(P2 != null && (P2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(c2Var) { // from class: ji.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 1);
        final int i14 = 4;
        J.j(P2 != null && (P2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(c2Var) { // from class: ji.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 2);
        final int i15 = 5;
        J.j(P2 != null && (P2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(c2Var) { // from class: ji.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 3);
        if (P2 == null || !v3.B3(P2.b)) {
            n70Var = J;
            z10 = false;
        } else {
            n70Var = J;
            z10 = true;
        }
        a2 a2Var = new a2(context, R.drawable.iv_h);
        a2Var.a(z11);
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        a2Var.d = i16;
        I.j(z10, 0, a2Var, LocaleController.getString(R.string.ArticleHeading), new fi.m2(I, n70Var, 2));
        I.y().a.setTypeface(AndroidUtilities.bold());
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(P2 != null && (P2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new m1(c2Var, P2, 3));
        I.j(P2 != null && (P2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new m1(c2Var, P2, 4));
        boolean z12 = P2 != null && (P2.b instanceof TL_iv.pageBlockPullquote);
        a2 a2Var2 = new a2(context, R.drawable.iv_pullquote);
        a2Var2.a(z11);
        a2Var2.d = i16;
        I.j(z12, 0, a2Var2, LocaleController.getString(R.string.ArticlePullquote), new m1(c2Var, P2, 0));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(P2 != null && (P2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new m1(c2Var, P2, 1));
        boolean z13 = P2 != null && (P2.b instanceof TL_iv.pageBlockFooter);
        a2 a2Var3 = new a2(context, R.drawable.iv_footer);
        a2Var3.a(z11);
        a2Var3.d = i16;
        I.j(z13, 0, a2Var3, LocaleController.getString(R.string.ArticleFooter), new m1(c2Var, P2, 2));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.Z();
        c2Var.x0 = I;
    }

    public static void Z(c2 c2Var, boolean z10, boolean z11) {
        if (c2Var.J0 == z10 && z11) {
            return;
        }
        c2Var.J0 = z10;
        float f7 = z10 ? 1.15f : 1.0f;
        if (z11) {
            c2Var.w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(pr.h).start();
        } else {
            c2Var.w0.animate().cancel();
            c2Var.w0.setScaleX(f7);
            c2Var.w0.setScaleY(f7);
        }
        c2Var.w0.setColorFilter(new PorterDuffColorFilter(c2Var.getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN));
        xi0 animatedDrawable = c2Var.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z10) {
                if (animatedDrawable.b0 > 34) {
                    animatedDrawable.L(0, false, false);
                }
                animatedDrawable.N(33);
            } else {
                animatedDrawable.N(0);
            }
            animatedDrawable.start();
        }
    }

    public static h1 a0(c2 c2Var) {
        h1 focusedEditTextOrNull = c2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            h1 h1Var = c2Var.R0;
            return h1Var != null ? h1Var : c2Var.P.O2();
        }
        c2Var.R0 = focusedEditTextOrNull;
        c2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int b0(c2 c2Var, h1 h1Var) {
        return (h1Var != c2Var.R0 || c2Var.P.getFocusedEditTextOrNull() == h1Var) ? Math.max(0, h1Var.getSelectionEnd()) : Math.min(c2Var.S0, h1Var.length());
    }

    public static String g0(int i10) {
        if (i10 == 1) {
            return LocaleController.getString(R.string.AccDescrIVTextStyle);
        }
        if (i10 == 2) {
            return LocaleController.getString(R.string.AccDescrIVListStyle);
        }
        if (i10 == 4) {
            return LocaleController.getString(R.string.AccDescrIVTable);
        }
        if (i10 == 7) {
            return LocaleController.getString(R.string.AccDescrIVFormula);
        }
        if (i10 != 9) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrIVDetails);
    }

    public static String i0(int i10) {
        if (i10 == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i10 == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i10 == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i10 == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i10 == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i10 == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i10 == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i10 == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i10 == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.f6 f6Var) {
        final int i10 = 0;
        final org.telegram.ui.ActionBar.f3 i11 = vl.i(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        linearLayout.addView(imageView, w7.x5.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 49, 25, 16, 25, 0), context);
        h.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(h, w7.x5.t(-1, -2, 49, 25, 11, 25, 0));
        di.d g10 = vl.g(24, context, f6Var, true);
        g10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(g10, w7.x5.t(-1, 48, 49, 14, 31, 14, 0));
        di.d g11 = vl.g(24, context, f6Var, false);
        g11.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(g11, w7.x5.t(-1, 48, 49, 14, 2, 14, 6));
        i11.show();
        g10.setOnClickListener(new View.OnClickListener() { // from class: ji.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i11.dismiss();
                        runnable2.run();
                        break;
                    default:
                        i11.dismiss();
                        runnable2.run();
                        break;
                }
            }
        });
        final int i13 = 1;
        g11.setOnClickListener(new View.OnClickListener() { // from class: ji.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        i11.dismiss();
                        runnable.run();
                        break;
                    default:
                        i11.dismiss();
                        runnable.run();
                        break;
                }
            }
        });
    }

    public final void A0() {
        int i10 = 0;
        boolean z10 = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((y1) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        if (this.y0 == null) {
            return;
        }
        boolean L3 = this.P.L3();
        this.y0.setEnabled(L3);
        this.y0.animate().alpha(L3 ? 1.0f : 0.5f).setDuration(150L).start();
    }

    public final void C0() {
        x1 x1Var = this.y0;
        if (x1Var == null) {
            return;
        }
        x1Var.setLocked(m0());
    }

    public final y1 c0(int i10, int i11, boolean z10) {
        y1 y1Var = new y1(this.e0.getContext(), i10, getResourceProvider());
        if (z10) {
            y1Var.e();
            this.N.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i11));
        y1Var.setContentDescription(g0(i11));
        this.f0.add(y1Var);
        LinearLayout linearLayout = this.e0;
        linearLayout.addView(y1Var, w7.x5.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return y1Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new u1(this, context);
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.F0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        fi.g2 g2Var = new fi.g2(this, 1);
        this.H0 = g2Var;
        this.O.r.add(g2Var);
        v3 v3Var = new v3(context, this.currentAccount, getResourceProvider(), new z2.b(this));
        this.P = v3Var;
        v3Var.setFileRefParentObject(this.r);
        this.O.addView(this.P, w7.x5.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), w7.x5.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            v3 v3Var2 = this.P;
            ArrayList arrayList2 = v3Var2.l3;
            v3Var2.k3 = richMessage;
            v3.V2(arrayList2, richMessage.blocks, v3Var2.m3);
            v3Var2.U3();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                v3Var2.u4((a) arrayList2.get(i10));
            }
            v3Var2.Y2.N(false);
        } else {
            String str = this.f;
            if (str != null) {
                v3 v3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = v3Var3.m3;
                ArrayList arrayList3 = v3Var3.l3;
                if (!TextUtils.isEmpty(charSequence)) {
                    v3.V2(arrayList3, f5.b(charSequence), hashMap);
                }
                arrayList3.addAll(v3Var3.v4(d4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    v3.V2(arrayList3, f5.b(charSequence2), hashMap);
                }
                v3Var3.U3();
                v3Var3.Y2.N(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        g2 g2Var2 = this.P.J3;
        if (g2Var2 != null) {
            g2Var2.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i11), org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11))}));
        this.O.addView(this.Q, w7.x5.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11)}));
        this.O.addView(this.R, w7.x5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, w7.x5.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        imageView3.setBackground(new b2(org.telegram.ui.ActionBar.j6.Z(themedColor, org.telegram.ui.ActionBar.j6.v(themedColor2, getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.T;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        int themedColor3 = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        w7.z5.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.T.setOnClickListener(new j1(this, 1));
        this.S.addView(this.T, w7.x5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.S.addView(this.U, w7.x5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        this.V.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.V.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        w7.z5.a(this.V);
        this.V.setContentDescription(LocaleController.getString(R.string.Undo));
        this.V.setOnClickListener(new j1(this, 2));
        this.U.addView(this.V, w7.x5.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        this.W.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.W.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        w7.z5.a(this.W);
        this.W.setContentDescription(LocaleController.getString(R.string.Redo));
        this.W.setOnClickListener(new j1(this, 3));
        this.U.addView(this.W, w7.x5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, w7.x5.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, w7.x5.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.a0.setClipChildren(false);
        this.a0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Z.addView(this.a0, w7.x5.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.c0.setScaleType(scaleType);
        this.c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.c0.setBackground(new b2(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i11), org.telegram.ui.ActionBar.j6.v(getThemedColor(i11), getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.a0.addView(this.c0, w7.x5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.z5.a(this.c0);
        this.c0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.c0.setOnClickListener(new j1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        frameLayout5.addView(frameLayout6, w7.x5.e(-2, 44, 81));
        v1 v1Var = new v1(context, 0);
        this.d0 = v1Var;
        v1Var.setClipToOutline(true);
        this.d0.setOutlineProvider(new bi.z1(3));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.e0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.e0.setOrientation(0);
        this.d0.addView(this.e0);
        frameLayout6.addView(this.d0, w7.x5.c(-1.0f, -1));
        bh bhVar = new bh(context, 24);
        this.b0 = bhVar;
        bhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.b0.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.b0.j(zg.e, false);
        this.e0.addView(this.b0, w7.x5.q(38, 38, 16));
        w7.z5.a(this.b0);
        this.b0.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.b0.setOnClickListener(new j1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new bi.u1(13, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new j1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new j1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new j1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.g0.setScaleType(scaleType);
        this.g0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.g0.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.e0.addView(this.g0, w7.x5.t(38, 38, 16, 2, 0, 0, 0));
        w7.z5.a(this.g0);
        this.g0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.g0.setOnClickListener(new j1(this, 9));
        this.a0.addView(frameLayout5, w7.x5.l(1.0f, 0, 44));
        cc1 cc1Var = new cc1(this, context, 2);
        this.h0 = cc1Var;
        cc1Var.setOrientation(0);
        this.h0.setClipToPadding(false);
        this.h0.setClipChildren(false);
        this.h0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.h0, w7.x5.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.v0.setClipToPadding(false);
        this.v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.v0, w7.x5.e(80, 60, 81));
        aj0 aj0Var = new aj0(context);
        this.w0 = aj0Var;
        aj0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        xi0 animatedDrawable = this.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.w0.setScaleType(scaleType);
        this.w0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.w0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.v0.addView(this.w0, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(frameLayout8, w7.x5.c(44.0f, -2));
        w1 w1Var = new w1(this, context);
        this.j0 = w1Var;
        w1Var.setHorizontalScrollBarEnabled(false);
        this.j0.setClipToOutline(true);
        this.j0.setOutlineProvider(new bi.z1(4));
        frameLayout8.addView(this.j0, w7.x5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.j0.addView(this.i0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        y1 y1Var = new y1(context, R.drawable.iv_quote, getResourceProvider());
        this.u0 = y1Var;
        y1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.u0.setOnClickListener(new j1(this, 11));
        LinearLayout linearLayout5 = this.i0;
        linearLayout5.addView(this.u0, w7.x5.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        y1 y1Var2 = new y1(context, R.drawable.iv_button, getResourceProvider());
        this.r0 = y1Var2;
        y1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.r0.setOnClickListener(new j1(this, 12));
        LinearLayout linearLayout6 = this.i0;
        linearLayout6.addView(this.r0, w7.x5.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.n0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.n0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.n0, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var3 = new y1(context, R.drawable.media_link_24, getResourceProvider());
        this.q0 = y1Var3;
        y1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.q0.setOnClickListener(new j1(this, 13));
        this.n0.addView(this.q0, w7.x5.q(38, 38, 16));
        y1 y1Var4 = new y1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.s0 = y1Var4;
        y1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.s0.setOnClickListener(new j1(this, 14));
        this.n0.addView(this.s0, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.o0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.o0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.o0, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var5 = new y1(context, R.drawable.iv_math, getResourceProvider());
        this.t0 = y1Var5;
        y1Var5.e();
        arrayList.add(this.t0);
        this.t0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.t0.setOnClickListener(new j1(this, 15));
        this.o0.addView(this.t0, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.m0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.m0, 0, w7.x5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        y1 y1Var6 = new y1(context, 0, getResourceProvider());
        this.p0 = y1Var6;
        y1Var6.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.p0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.p0.setOnClickListener(new j1(this, 16));
        this.m0.addView(this.p0, w7.x5.q(38, 38, 16));
        x1 x1Var = new x1((Object) this, context, this.r != null ? R.drawable.input_done : l0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider(), 0);
        this.y0 = x1Var;
        x1Var.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(org.telegram.ui.ActionBar.j6.Yd))));
        w7.z5.a(this.y0);
        this.a0.addView(this.y0, w7.x5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.y0.setContentDescription(LocaleController.getString(R.string.Send));
        this.y0.setOnClickListener(new j1(this, 0));
        this.y0.setOnLongClickListener(new di.n5(this, 3));
        C0();
        this.O.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        A0();
        if (this.e) {
            this.P.B2();
            this.e = false;
        }
        u1 u1Var = this.O;
        this.fragmentView = u1Var;
        return u1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z10) {
        y1 y1Var = new y1(context, i10, getResourceProvider());
        if (z10) {
            y1Var.e();
            this.N.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i11));
        y1Var.setContentDescription(i0(i11));
        y1Var.setOnClickListener(new di.o4(this, i11, 2));
        this.l0.add(y1Var);
        LinearLayout linearLayout = this.i0;
        linearLayout.addView(y1Var, w7.x5.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            C0();
            A0();
        }
    }

    public final void e0(boolean z10) {
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, z10 ? 1.0f : 0.0f);
        this.P0 = ofFloat;
        ofFloat.addUpdateListener(new k1(this, 0));
        this.P0.setInterpolator(pr.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        kz kzVar = this.A0;
        if (kzVar == null || (layoutParams = (FrameLayout.LayoutParams) kzVar.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.O == null ? j0() : Math.max(j0(), ((r2.getMeasuredHeight() - this.O.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.T0)) - r1) * this.Q0) + j0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.A0.setLayoutParams(layoutParams);
        }
    }

    public final void h0() {
        FrameLayout.LayoutParams layoutParams;
        kz kzVar = this.A0;
        if (kzVar != null && (layoutParams = (FrameLayout.LayoutParams) kzVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.T0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.A0.setLayoutParams(layoutParams);
            }
        }
        f0();
        int max = Math.max(Math.max(this.D0, this.T0), this.U0);
        this.P.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        v3 v3Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        v3Var.O3 = i12;
        v3Var.P3 = i13;
        v3Var.Q3 = i14;
        this.Y.setTranslationY(-max);
        this.R.setTranslationY(r0 + this.T0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        v3 v3Var = this.P;
        if (v3Var == null || !v3Var.n3.y()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final int j0() {
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.F0 : this.E0;
        return i10 <= 0 ? AndroidUtilities.dp(200.0f) : i10;
    }

    public final void k0(boolean z10) {
        if (this.C0) {
            this.C0 = false;
            kz kzVar = this.A0;
            if (kzVar != null) {
                kzVar.t(false);
                this.A0.B();
            }
        }
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        this.Q0 = 0.0f;
        this.R0 = null;
        kz kzVar2 = this.A0;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            h0();
        }
        bh bhVar = this.b0;
        if (bhVar != null) {
            bhVar.j(zg.e, z10);
        }
    }

    public final boolean l0() {
        co coVar;
        return this.r == null && (coVar = this.J) != null && coVar.c();
    }

    public final boolean m0() {
        if (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        v3 v3Var = this.P;
        return f5.f(v3Var.l3, v3Var.m3);
    }

    public final void n0() {
        m3 g22 = this.P.g2();
        if (g22 == null) {
            return;
        }
        TL_iv.RichMessage a2 = g22.a();
        if (a2.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(getParentActivity(), getResourceProvider());
        f0Var.n0(a2);
        f0Var.k0 = new bi.o1(g22, 25);
        f0Var.show();
    }

    public final void o0(int i10, int i11) {
        v3 v3Var = this.P;
        v3Var.c4 = v3Var.P2();
        vi viVar = new vi(getParentActivity(), this, false, false, true, getResourceProvider());
        viVar.Z1 = new r1(this, viVar);
        viVar.j0.setIncludeVideosInGallery(true);
        viVar.j0.f0();
        viVar.J1(1, true);
        viVar.h1(i10);
        viVar.t2 = new q1(this, viVar);
        viVar.Y = new q1(this, viVar);
        viVar.X = new s1(this, viVar);
        viVar.r1();
        if (i11 != 0) {
            viVar.A1(i11);
        }
        viVar.setFocusable(true);
        viVar.show();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 != -1 || i10 != 21) {
            if (i11 != -1 || (i10 != 1 && i10 != 14)) {
                super.onActivityResultFragment(i10, i11, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.P.d2(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        v3 v3Var = this.P;
        Uri data = intent.getData();
        if (data == null) {
            v3Var.getClass();
        } else {
            if (v3Var.getContext() == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new fi.j4(26, v3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.C0;
        if (z11) {
            if (z11) {
                this.C0 = false;
                kz kzVar = this.A0;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.A0.B();
                }
                e0(false);
                return false;
            }
        } else {
            if (this.B0) {
                k0(true);
                return false;
            }
            if (!this.P.E2()) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        int i10 = 1;
        if (!z10 && !this.V0) {
            q0();
            this.V0 = true;
        }
        if (AndroidUtilities.isTablet() || this.s == null || this.v == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ih.g gVar = this.s;
        this.x = gVar.f;
        gVar.e = false;
        gVar.invalidate();
        this.v.setAlpha(0.0f);
        int i11 = 4;
        this.v.z1.setVisibility(4);
        v0();
        float f7 = z10 ? 0.0f : 1.0f;
        this.I = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
        this.E = true;
        this.O.invalidate();
        ofFloat.addUpdateListener(new k1(this, i10));
        ofFloat.addListener(new bi.t(8, this, runnable));
        if (z10) {
            FrameLayout frameLayout = this.S;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.S;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<v3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.S;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.S;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<v3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(pr.h);
        this.O.post(new lu0(animatorSet, i11));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        fi.g2 g2Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.V0) {
            q0();
            this.V0 = true;
        }
        o1 o1Var = this.N0;
        if (o1Var != null) {
            this.N0 = null;
            AndroidUtilities.runOnUIThread(o1Var);
        }
        cj0 cj0Var = this.O0;
        if (cj0Var != null) {
            cj0Var.i();
            this.O0 = null;
        }
        v3 v3Var = this.P;
        if (v3Var != null) {
            v3Var.F2();
        }
        m.p3 p3Var = this.z0;
        if (p3Var != null) {
            p3Var.a();
        }
        super.onFragmentDestroy();
        kz kzVar = this.A0;
        if (kzVar != null) {
            kzVar.D();
        }
        u1 u1Var = this.O;
        if (u1Var == null || (g2Var = this.H0) == null) {
            return;
        }
        u1Var.r.remove(g2Var);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        h0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        n70 n70Var;
        i0.c f7 = l1Var.a.f(3);
        int i10 = l1Var.a.f(8).d;
        this.U0 = i10;
        int i11 = i10 - f7.d;
        boolean z10 = this.G0;
        boolean z11 = i11 > AndroidUtilities.dp(20.0f);
        this.G0 = z11;
        if (z11 && i11 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.F0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.F0).commit();
            } else {
                this.E0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.E0).commit();
            }
        }
        if (this.G0 && !z10 && this.B0 && !this.C0) {
            k0(false);
        }
        if (!this.G0 && z10 && (n70Var = this.x0) != null) {
            n70Var.u();
            this.x0 = null;
        }
        onInsets(f7.a, f7.b, f7.c, f7.d);
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        v3 v3Var;
        int i10;
        v3 v3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.c) >= 0 && (v3Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.c = -1;
            if (v3Var2.X1(i10, i11)) {
                return;
            }
            v3Var2.post(new o2(v3Var2, i10, i11, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.b == null && this.f == null) || (v3Var = this.P) == null || v3Var.Z2()) {
            return;
        }
        v3Var.post(new b(v3Var, 5));
    }

    public final boolean q0() {
        Runnable runnable;
        if (this.J == null || this.r != null || !this.P.q2()) {
            return false;
        }
        TL_iv.RichMessage i22 = this.M ? null : this.P.i2();
        if (i22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        mk mkVar = this.J.Y;
        if (i22 != null && !this.M) {
            v3 v3Var = this.P;
            if (v3Var.j3() && !f5.f(v3Var.l3, v3Var.m3) && mkVar != null) {
                SpannableStringBuilder k10 = f5.k(this.P.l3);
                co coVar = mkVar.O2;
                if (mkVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, mkVar.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class);
                if (z5VarArr != null) {
                    for (org.telegram.ui.Components.z5 z5Var : z5VarArr) {
                        z5Var.applyFontMetrics(mkVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.q5.g());
                    }
                }
                si0.a(spannableStringBuilder);
                if (coVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(mkVar.Q).saveDraft(coVar.a(), coVar.B7(coVar.n5), charSequenceArr[0], MediaDataController.getInstance(mkVar.Q).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                mkVar.setRichDraftPreview(null);
                if (mkVar.E0.getText() != null) {
                    mkVar.E0.getText().clear();
                }
                mkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        co coVar2 = this.J;
        mediaDataController.saveDraft(a2, coVar2.B7(coVar2.n5), "", null, null, null, null, 0L, false, false, i22);
        TL_iv.RichMessage richMessage = i22;
        if (mkVar == null) {
            return true;
        }
        mkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            v3 v3Var = this.P;
            Objects.requireNonNull(v3Var);
            p0(parentActivity, new b(v3Var, 0), new i1(this, 4), getResourceProvider());
            return;
        }
        if (l0()) {
            org.telegram.ui.Components.e5.M(getParentActivity(), this.J.a(), new xa.c(this, 23), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ji.o1] */
    public final void s0(final int i10, final int i11, final boolean z10) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            v3 v3Var = this.P;
            Objects.requireNonNull(v3Var);
            p0(parentActivity, new b(v3Var, 0), new i1(this, 4), getResourceProvider());
            return;
        }
        if (this.J == null || !this.P.j3() || this.P.l3()) {
            return;
        }
        if (!this.P.L3()) {
            B0();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            mk mkVar = this.J.Y;
            if (mkVar == null) {
                return;
            }
            this.M = true;
            Runnable runnable = this.K;
            if (runnable != null) {
                runnable.run();
            }
            mkVar.R0(f5.k(this.P.l3), z10, i10, i11);
            finishFragment();
            return;
        }
        this.M = true;
        final ArrayList Y2 = this.P.Y2();
        if (Y2.isEmpty()) {
            return;
        }
        final ArrayList A2 = this.P.A2();
        final ArrayList x22 = this.P.x2();
        final ArrayList a2 = e5.a(this.currentAccount, Y2);
        final long a10 = this.J.a();
        co coVar = this.J;
        final MessageObject messageObject = coVar.n5;
        final MessageObject messageObject2 = coVar.X3;
        final long N8 = coVar.N8();
        final SendMessageChatArguments C8 = this.J.C8();
        final MessageObject messageObject3 = this.r;
        ?? r02 = new Runnable() { // from class: ji.o1
            @Override // java.lang.Runnable
            public final void run() {
                c2.X(c2.this, messageObject3, Y2, A2, x22, a2, a10, messageObject, messageObject2, z10, i10, i11, C8, N8);
            }
        };
        Runnable runnable2 = this.K;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (i10 == 0 || messageObject3 != null) {
            r02.run();
            finishFragment();
        } else {
            this.N0 = r02;
            finishFragment();
        }
    }

    public final void t0(boolean z10) {
        ArrayList arrayList = this.l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            if (((Integer) y1Var.getTag()).intValue() == 1) {
                y1Var.setEnabled(z10);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        y1 y1Var = this.q0;
        if (y1Var != null) {
            y1Var.setEnabled(z10);
        }
        y1 y1Var2 = this.r0;
        if (y1Var2 != null) {
            y1Var2.setEnabled(z11);
        }
        y1 y1Var3 = this.s0;
        if (y1Var3 != null) {
            y1Var3.setEnabled(z10);
        }
        y1 y1Var4 = this.t0;
        if (y1Var4 != null) {
            y1Var4.setEnabled(z10);
        }
    }

    public final void v0() {
        this.s.getLocationInWindow(this.F);
        if (this.y == null) {
            this.y = new RectF();
        }
        RectF rectF = new RectF(this.x.getBounds());
        this.y = rectF;
        rectF.offset(r1[0], r1[1]);
        if (this.G == null) {
            this.G = new int[2];
        }
        this.v.getLocationInWindow(this.G);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.H[0] = this.P.getPaddingLeft();
        this.H[1] = this.P.getPaddingTop();
        this.H[0] = (int) (r0[0] - (this.v.E0.getX() - AndroidUtilities.dp(16.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0() {
        a P2;
        int i10;
        int size;
        int i11;
        q9 textSelectionHelper = this.P.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            P2 = this.P.P2();
        } else {
            int i12 = textSelectionHelper.u0;
            P2 = i12 == textSelectionHelper.x0 ? this.P.x4(i12) : null;
        }
        if (this.P.Q2() == null) {
            if (P2 != null) {
                if (!P2.a() && !P2.b() && !P2.c()) {
                    TL_iv.PageBlock pageBlock = P2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                i10 = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i10 = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i10 = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i10 = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i10 = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i10 = 7;
                            }
                            ArrayList arrayList = this.f0;
                            size = arrayList.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                y1 y1Var = (y1) obj;
                                int intValue = ((Integer) y1Var.getTag()).intValue();
                                y1Var.setSelected(i10 == intValue);
                                if (i10 == intValue) {
                                    y1Var.setEnabled(true);
                                    if (P2 == null) {
                                        y1Var.a();
                                    } else if (i10 == 1) {
                                        TL_iv.PageBlock pageBlock2 = P2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            y1Var.f(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            y1Var.f(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            y1Var.f(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            y1Var.f(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            y1Var.f(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            y1Var.f(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            y1Var.f(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            y1Var.f(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            y1Var.f(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            y1Var.f(R.drawable.iv_footer);
                                        } else {
                                            y1Var.a();
                                        }
                                    } else if (i10 == 2) {
                                        if (P2.a()) {
                                            y1Var.f(R.drawable.iv_todo);
                                        } else if (P2.c()) {
                                            y1Var.f(R.drawable.iv_ordered_list);
                                        } else {
                                            y1Var.a();
                                        }
                                    } else if (i10 == 8) {
                                        y1Var.f(R.drawable.iv_details);
                                    } else {
                                        y1Var.a();
                                    }
                                } else {
                                    y1Var.setEnabled(i10 != 4);
                                    y1Var.a();
                                }
                            }
                        }
                    }
                }
                i10 = 2;
                ArrayList arrayList2 = this.f0;
                size = arrayList2.size();
                i11 = 0;
                while (i11 < size) {
                }
            }
            i10 = 0;
            ArrayList arrayList22 = this.f0;
            size = arrayList22.size();
            i11 = 0;
            while (i11 < size) {
            }
        }
        i10 = 4;
        ArrayList arrayList222 = this.f0;
        size = arrayList222.size();
        i11 = 0;
        while (i11 < size) {
        }
    }

    public final void x0(int i10, boolean z10) {
        if (this.K0 == i10) {
            return;
        }
        this.K0 = i10;
        if (z10) {
            this.a0.setVisibility(0);
            ViewPropertyAnimator duration = this.a0.animate().alpha(this.K0 == 0 ? 1.0f : 0.0f).scaleX(this.K0 == 0 ? 1.0f : 0.8f).scaleY(this.K0 == 0 ? 1.0f : 0.8f).translationY(this.K0 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new i1(this, 1)).start();
            this.h0.setVisibility(0);
            this.h0.animate().alpha(this.K0 == 1 ? 1.0f : 0.0f).scaleX(this.K0 == 1 ? 1.0f : 0.8f).scaleY(this.K0 == 1 ? 1.0f : 0.8f).translationY(this.K0 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(prVar).withEndAction(new i1(this, 2)).start();
            this.v0.setVisibility(0);
            this.v0.animate().alpha(this.K0 == 2 ? 1.0f : 0.0f).scaleX(this.K0 == 2 ? 1.0f : 0.8f).scaleY(this.K0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(prVar).withEndAction(new i1(this, 3)).start();
            return;
        }
        this.a0.setVisibility(i10 == 0 ? 0 : 8);
        this.a0.setAlpha(i10 == 0 ? 1.0f : 0.0f);
        this.a0.setScaleX(i10 == 0 ? 1.0f : 0.8f);
        this.a0.setScaleY(i10 == 0 ? 1.0f : 0.8f);
        this.a0.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.h0.setVisibility(i10 == 1 ? 0 : 8);
        this.h0.setAlpha(i10 == 1 ? 1.0f : 0.0f);
        this.h0.setScaleX(i10 == 1 ? 1.0f : 0.8f);
        this.h0.setScaleY(i10 == 1 ? 1.0f : 0.8f);
        this.h0.setTranslationY(i10 == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.v0.setVisibility(i10 != 2 ? 8 : 0);
        this.v0.setAlpha(i10 == 2 ? 1.0f : 0.0f);
        this.v0.setScaleX(i10 == 2 ? 1.0f : 0.8f);
        this.v0.setScaleY(i10 == 2 ? 1.0f : 0.8f);
    }

    public final void y0() {
        boolean z10;
        boolean z11;
        q9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.l0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        y1 y1Var = this.u0;
        boolean z12 = false;
        if (y1Var != null) {
            v3 v3Var = this.P;
            int[] A4 = v3Var.A4();
            y1Var.setSelected(A4 != null && v3Var.G3(A4[0], A4[1]));
        }
        if (this.P.K3()) {
            q9 textSelectionHelper2 = this.P.getTextSelectionHelper();
            int i10 = textSelectionHelper2.u0;
            int i11 = textSelectionHelper2.v0;
            int i12 = textSelectionHelper2.y0;
            int i13 = textSelectionHelper2.w0;
            int i14 = textSelectionHelper2.z0;
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                y1 y1Var2 = (y1) obj;
                y1Var2.setSelected(this.P.J3(((Integer) y1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
            }
            boolean z13 = i11 == i12;
            h1 M4 = z13 ? this.P.M4(i10, i11) : null;
            int max = Math.max(0, Math.min(i13, i14));
            int max2 = M4 == null ? 0 : Math.max(0, Math.min(Math.max(i13, i14), M4.length()));
            y1 y1Var3 = this.q0;
            if (y1Var3 != null) {
                y1Var3.setSelected(M4 != null && max < max2 && i6.h(M4.getText(), max, max2));
            }
            y1 y1Var4 = this.s0;
            if (y1Var4 != null) {
                if (M4 != null && max < max2 && i6.g(M4.getText(), max, max2)) {
                    z12 = true;
                }
                y1Var4.setSelected(z12);
            }
            t0(true);
            u0(z13, this.P.k2());
            return;
        }
        if (this.P.v3()) {
            q9 textSelectionHelper3 = this.P.getTextSelectionHelper();
            h1 r22 = this.P.r2(textSelectionHelper3.u0);
            int i16 = textSelectionHelper3.w0;
            int i17 = textSelectionHelper3.z0;
            int max3 = r22 == null ? 0 : Math.max(0, Math.min(Math.min(i16, i17), r22.length()));
            int max4 = r22 == null ? 0 : Math.max(0, Math.min(Math.max(i16, i17), r22.length()));
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                y1 y1Var5 = (y1) obj2;
                y1Var5.setSelected((r22 == null || max3 >= max4 || (((Integer) y1Var5.getTag()).intValue() & r22.getCurrentStyle(max3, max4)) == 0) ? false : true);
            }
            y1 y1Var6 = this.q0;
            if (y1Var6 != null) {
                y1Var6.setSelected(r22 != null && max3 < max4 && i6.h(r22.getText(), max3, max4));
            }
            y1 y1Var7 = this.s0;
            if (y1Var7 != null) {
                if (r22 != null && max3 < max4 && i6.g(r22.getText(), max3, max4)) {
                    z12 = true;
                }
                y1Var7.setSelected(z12);
            }
            t0(true);
            u0(true, this.P.k2());
            return;
        }
        int i19 = textSelectionHelper.u0;
        int i20 = textSelectionHelper.x0;
        int i21 = textSelectionHelper.w0;
        int i22 = textSelectionHelper.z0;
        boolean z14 = i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.p4.size();
        int size3 = arrayList.size();
        int i23 = 0;
        while (i23 < size3) {
            int i24 = i23 + 1;
            y1 y1Var8 = (y1) arrayList.get(i23);
            y1Var8.setSelected(z14 && this.P.I3(((Integer) y1Var8.getTag()).intValue(), i19, i21, i20, i22));
            i23 = i24;
        }
        t0(!this.P.H3());
        y1 y1Var9 = this.q0;
        if (y1Var9 != null) {
            if (z14) {
                Editable G4 = this.P.G4(i19, i21, i20, i22);
                if (G4 == null ? false : i6.h(G4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z11 = true;
                    y1Var9.setSelected(z11);
                }
            }
            z11 = false;
            y1Var9.setSelected(z11);
        }
        y1 y1Var10 = this.s0;
        if (y1Var10 != null) {
            if (z14) {
                Editable G42 = this.P.G4(i19, i21, i20, i22);
                if (G42 == null ? false : i6.g(G42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z10 = true;
                    y1Var10.setSelected(z10);
                }
            }
            z10 = false;
            y1Var10.setSelected(z10);
        }
        if (z14 && i19 == i20) {
            z12 = true;
        }
        u0(z12, this.P.k2());
    }

    public final void z0() {
        boolean q22 = this.P.q2();
        g2 g2Var = this.P.J3;
        boolean z10 = (g2Var == null || g2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setEnabled(q22);
            this.V.setAlpha(q22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            this.W.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public c2(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new i1(this, 0);
        this.f = str;
    }

    public c2(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new i1(this, 0);
        this.b = richMessage;
    }
}
