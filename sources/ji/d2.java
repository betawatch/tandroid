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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.fo;
import org.telegram.ui.hj0;
import org.telegram.ui.ic1;
import org.telegram.ui.sk;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class d2 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public wz A0;
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
    public fo J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public o1 N0;
    public v1 O;
    public hj0 O0;
    public x3 P;
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
    public w1 d0;
    public boolean e;
    public LinearLayout e0;
    public final String f;
    public final ArrayList f0;
    public ImageView g0;
    public CharSequence h;
    public ic1 h0;
    public LinearLayout i0;
    public x1 j0;
    public int k0;
    public final ArrayList l0;
    public LinearLayout m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public z1 p0;
    public z1 q0;
    public MessageObject r;
    public z1 r0;
    public ih.f s;
    public z1 s0;
    public z1 t0;
    public z1 u0;
    public sk v;
    public FrameLayout v0;
    public final Rect w;
    public bk0 w0;
    public dh.d x;
    public m80 x0;
    public RectF y;
    public y1 y0;
    public m.q3 z0;

    public d2(Editable editable) {
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

    public static void U(d2 d2Var) {
        k3 k3Var = d2Var.P.l3;
        if (k3Var != null && k3Var.x()) {
            d2Var.n0();
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        new x(d2Var.currentAccount, parentActivity, new p1(d2Var, 0), d2Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void V(d2 d2Var) {
        if (UserConfig.getInstance(d2Var.currentAccount).isPremium()) {
            return;
        }
        d2Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) d2Var, 43, true));
    }

    public static boolean W(d2 d2Var, View view) {
        fo foVar = d2Var.J;
        if (foVar != null && d2Var.r == null && !foVar.c() && d2Var.P.l3() && !d2Var.P.n3()) {
            if (!d2Var.P.N3()) {
                d2Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> a32 = d2Var.P.a3();
            if (!a32.isEmpty()) {
                hj0 hj0Var = d2Var.O0;
                if (hj0Var != null) {
                    hj0Var.h(false);
                    d2Var.O0 = null;
                }
                hj0 hj0Var2 = new hj0(d2Var.getParentActivity(), d2Var.getResourceProvider());
                d2Var.O0 = hj0Var2;
                hj0Var2.setOnDismissListener(new bi.t4(d2Var, 5));
                long a2 = d2Var.J.a();
                MessageObject messageObject = d2Var.J.n5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(d2Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(d2Var.currentAccount).getPeer(UserConfig.getInstance(d2Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = a32;
                richMessage.photos = d2Var.P.C2();
                tL_message.rich_message.documents = d2Var.P.z2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(d2Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                d2Var.O0.q(org.telegram.messenger.q.l(messageObject2));
                d2Var.y0.setScaleX(1.0f);
                d2Var.y0.setScaleY(1.0f);
                wg r10 = d2Var.O0.r(d2Var.y0, true, new j1(d2Var, 10));
                if (r10 != null) {
                    r10.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), d2Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh))));
                    hj0 hj0Var3 = d2Var.O0;
                    int dp = AndroidUtilities.dp(44.0f);
                    hj0Var3.m0 = true;
                    hj0Var3.Y = dp;
                }
                m80 H = m80.H(d2Var, d2Var.y0);
                boolean isUserSelf = UserObject.isUserSelf(d2Var.J.i());
                if (d2Var.J.G6()) {
                    H.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new bi.g(d2Var, a2, 12), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new i1(d2Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new i1(d2Var, 6), false);
                }
                H.Y();
                d2Var.O0.p(H);
                d2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void X(d2 d2Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j11) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(d2Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, d2Var.J);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(d2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j10, messageObject2, messageObject3, z10, i10, i11, sendMessageChatArguments, 0L, j11, 0L);
        }
    }

    public static void Y(final d2 d2Var, Context context, View view) {
        m80 m80Var;
        boolean z10;
        m80 m80Var2 = d2Var.x0;
        if (m80Var2 != null) {
            m80Var2.u();
            d2Var.x0 = null;
        }
        boolean z11 = (MessagesController.getInstance(d2Var.currentAccount).richEditorAllowed() || UserConfig.getInstance(d2Var.currentAccount).isPremium()) ? false : true;
        final a R2 = d2Var.P.R2();
        final m80 I = m80.I(d2Var, view);
        I.Q = true;
        m80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(I, 1), false);
        J.k();
        final int i10 = 0;
        J.j(R2 != null && (R2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(d2Var) { // from class: ji.n1
            public final /* synthetic */ d2 b;

            {
                this.b = d2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 2);
        final int i11 = 1;
        J.j(R2 != null && (R2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(d2Var) { // from class: ji.n1
            public final /* synthetic */ d2 b;

            {
                this.b = d2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 1);
        final int i12 = 2;
        J.j(R2 != null && (R2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(d2Var) { // from class: ji.n1
            public final /* synthetic */ d2 b;

            {
                this.b = d2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize);
        final int i13 = 3;
        J.j(R2 != null && (R2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(d2Var) { // from class: ji.n1
            public final /* synthetic */ d2 b;

            {
                this.b = d2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 1);
        final int i14 = 4;
        J.j(R2 != null && (R2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(d2Var) { // from class: ji.n1
            public final /* synthetic */ d2 b;

            {
                this.b = d2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 2);
        final int i15 = 5;
        J.j(R2 != null && (R2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(d2Var) { // from class: ji.n1
            public final /* synthetic */ d2 b;

            {
                this.b = d2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 3);
        if (R2 == null || !x3.D3(R2.b)) {
            m80Var = J;
            z10 = false;
        } else {
            m80Var = J;
            z10 = true;
        }
        b2 b2Var = new b2(context, R.drawable.iv_h);
        b2Var.a(z11);
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        b2Var.d = i16;
        I.j(z10, 0, b2Var, LocaleController.getString(R.string.ArticleHeading), new fi.m2(I, m80Var, 2));
        I.y().a.setTypeface(AndroidUtilities.bold());
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(R2 != null && (R2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new m1(d2Var, R2, 3));
        I.j(R2 != null && (R2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new m1(d2Var, R2, 4));
        boolean z12 = R2 != null && (R2.b instanceof TL_iv.pageBlockPullquote);
        b2 b2Var2 = new b2(context, R.drawable.iv_pullquote);
        b2Var2.a(z11);
        b2Var2.d = i16;
        I.j(z12, 0, b2Var2, LocaleController.getString(R.string.ArticlePullquote), new m1(d2Var, R2, 0));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(R2 != null && (R2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new m1(d2Var, R2, 1));
        boolean z13 = R2 != null && (R2.b instanceof TL_iv.pageBlockFooter);
        b2 b2Var3 = new b2(context, R.drawable.iv_footer);
        b2Var3.a(z11);
        b2Var3.d = i16;
        I.j(z13, 0, b2Var3, LocaleController.getString(R.string.ArticleFooter), new m1(d2Var, R2, 2));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.Z();
        d2Var.x0 = I;
    }

    public static void Z(d2 d2Var, boolean z10, boolean z11) {
        if (d2Var.J0 == z10 && z11) {
            return;
        }
        d2Var.J0 = z10;
        float f7 = z10 ? 1.15f : 1.0f;
        if (z11) {
            d2Var.w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(es.h).start();
        } else {
            d2Var.w0.animate().cancel();
            d2Var.w0.setScaleX(f7);
            d2Var.w0.setScaleY(f7);
        }
        d2Var.w0.setColorFilter(new PorterDuffColorFilter(d2Var.getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.q7 : org.telegram.ui.ActionBar.g6.G6), PorterDuff.Mode.SRC_IN));
        yj0 animatedDrawable = d2Var.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z10) {
                if (animatedDrawable.a0 > 34) {
                    animatedDrawable.N(0, false, false);
                }
                animatedDrawable.P(33);
            } else {
                animatedDrawable.P(0);
            }
            animatedDrawable.start();
        }
    }

    public static h1 a0(d2 d2Var) {
        h1 focusedEditTextOrNull = d2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            h1 h1Var = d2Var.R0;
            return h1Var != null ? h1Var : d2Var.P.Q2();
        }
        d2Var.R0 = focusedEditTextOrNull;
        d2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int b0(d2 d2Var, h1 h1Var) {
        return (h1Var != d2Var.R0 || d2Var.P.getFocusedEditTextOrNull() == h1Var) ? Math.max(0, h1Var.getSelectionEnd()) : Math.min(d2Var.S0, h1Var.length());
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

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.c6 c6Var) {
        final int i10 = 0;
        final org.telegram.ui.ActionBar.e3 i11 = yh.i(1, context, c6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        linearLayout.addView(imageView, w7.a6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.a6.t(-1, -2, 49, 25, 16, 25, 0), context);
        i13.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        i13.setTextSize(1, 14.0f);
        i13.setGravity(17);
        i13.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        linearLayout.addView(i13, w7.a6.t(-1, -2, 49, 25, 11, 25, 0));
        di.d f7 = yh.f(24, context, c6Var, true);
        f7.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(f7, w7.a6.t(-1, 48, 49, 14, 31, 14, 0));
        di.d f10 = yh.f(24, context, c6Var, false);
        f10.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(f10, w7.a6.t(-1, 48, 49, 14, 2, 14, 6));
        i11.show();
        f7.setOnClickListener(new View.OnClickListener() { // from class: ji.l1
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
        final int i14 = 1;
        f10.setOnClickListener(new View.OnClickListener() { // from class: ji.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
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
            ((z1) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        if (this.y0 == null) {
            return;
        }
        boolean N3 = this.P.N3();
        this.y0.setEnabled(N3);
        yh.r(this.y0.animate(), N3 ? 1.0f : 0.5f, 150L);
    }

    public final void C0() {
        y1 y1Var = this.y0;
        if (y1Var == null) {
            return;
        }
        y1Var.setLocked(m0());
    }

    public final z1 c0(int i10, int i11, boolean z10) {
        z1 z1Var = new z1(this.e0.getContext(), i10, getResourceProvider());
        if (z10) {
            z1Var.e();
            this.N.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(g0(i11));
        this.f0.add(z1Var);
        LinearLayout linearLayout = this.e0;
        linearLayout.addView(z1Var, w7.a6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return z1Var;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new v1(this, context);
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
        x3 x3Var = new x3(context, this.currentAccount, getResourceProvider(), new ya.c(this, 29));
        this.P = x3Var;
        x3Var.setFileRefParentObject(this.r);
        this.O.addView(this.P, w7.a6.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), w7.a6.d(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            x3 x3Var2 = this.P;
            ArrayList arrayList2 = x3Var2.j3;
            x3Var2.i3 = richMessage;
            x3.X2(arrayList2, richMessage.blocks, x3Var2.k3);
            x3Var2.W3();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                x3Var2.w4((a) arrayList2.get(i10));
            }
            x3Var2.W2.N(false);
        } else {
            String str = this.f;
            if (str != null) {
                x3 x3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = x3Var3.k3;
                ArrayList arrayList3 = x3Var3.j3;
                if (!TextUtils.isEmpty(charSequence)) {
                    x3.X2(arrayList3, g5.b(charSequence), hashMap);
                }
                arrayList3.addAll(x3Var3.x4(f4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    x3.X2(arrayList3, g5.b(charSequence2), hashMap);
                }
                x3Var3.W3();
                x3Var3.W2.N(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        h2 h2Var = this.P.H3;
        if (h2Var != null) {
            h2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i11), org.telegram.ui.ActionBar.g6.m1(0.0f, getThemedColor(i11))}));
        this.O.addView(this.Q, w7.a6.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11)}));
        this.O.addView(this.R, w7.a6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, w7.a6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.g6.i6;
        imageView3.setBackground(new c2(org.telegram.ui.ActionBar.g6.a0(themedColor, org.telegram.ui.ActionBar.g6.v(themedColor2, getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.T;
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        int themedColor3 = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        w7.c6.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.T.setOnClickListener(new j1(this, 1));
        this.S.addView(this.T, w7.a6.a(44.0f, 8.0f, 8.0f, 8.0f, 8.0f, 44, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.S.addView(this.U, w7.a6.a(44.0f, 8.0f, 8.0f, 8.0f, 8.0f, 82, 53));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        this.V.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i12), 1, -1));
        this.V.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        w7.c6.a(this.V);
        this.V.setContentDescription(LocaleController.getString(R.string.Undo));
        this.V.setOnClickListener(new j1(this, 2));
        this.U.addView(this.V, w7.a6.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        this.W.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i12), 1, -1));
        this.W.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        w7.c6.a(this.W);
        this.W.setContentDescription(LocaleController.getString(R.string.Redo));
        this.W.setOnClickListener(new j1(this, 3));
        this.U.addView(this.W, w7.a6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, w7.a6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, w7.a6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.a0.setClipChildren(false);
        this.a0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Z.addView(this.a0, w7.a6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 60.0f, -1, 87));
        ImageView imageView7 = new ImageView(context);
        this.c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.c0.setScaleType(scaleType);
        this.c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.c0.setBackground(new c2(org.telegram.ui.ActionBar.g6.a0(getThemedColor(i11), org.telegram.ui.ActionBar.g6.v(getThemedColor(i11), getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.a0.addView(this.c0, w7.a6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.c6.a(this.c0);
        this.c0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.c0.setOnClickListener(new j1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        frameLayout5.addView(frameLayout6, w7.a6.e(-2, 44, 81));
        w1 w1Var = new w1(context, 0);
        this.d0 = w1Var;
        w1Var.setClipToOutline(true);
        this.d0.setOutlineProvider(new bi.a2(3));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.e0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.e0.setOrientation(0);
        this.d0.addView(this.e0);
        frameLayout6.addView(this.d0, w7.a6.d(-1.0f, -1));
        bh bhVar = new bh(context, 24);
        this.b0 = bhVar;
        bhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.b0.setBackground(org.telegram.ui.ActionBar.g6.a0(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.b0.j(zg.e, false);
        this.e0.addView(this.b0, w7.a6.q(38, 38, 16));
        w7.c6.a(this.b0);
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
        this.g0.setBackground(org.telegram.ui.ActionBar.g6.a0(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.e0.addView(this.g0, w7.a6.t(38, 38, 16, 2, 0, 0, 0));
        w7.c6.a(this.g0);
        this.g0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.g0.setOnClickListener(new j1(this, 9));
        this.a0.addView(frameLayout5, w7.a6.l(1.0f, 0, 44));
        ic1 ic1Var = new ic1(this, context, 2);
        this.h0 = ic1Var;
        ic1Var.setOrientation(0);
        this.h0.setClipToPadding(false);
        this.h0.setClipChildren(false);
        this.h0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.h0, w7.a6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.v0.setClipToPadding(false);
        this.v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.v0, w7.a6.e(80, 60, 81));
        bk0 bk0Var = new bk0(context);
        this.w0 = bk0Var;
        bk0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        yj0 animatedDrawable = this.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.w0.setScaleType(scaleType);
        this.w0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.w0.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.v0.addView(this.w0, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(frameLayout8, w7.a6.d(44.0f, -2));
        x1 x1Var = new x1(this, context);
        this.j0 = x1Var;
        x1Var.setHorizontalScrollBarEnabled(false);
        this.j0.setClipToOutline(true);
        this.j0.setOutlineProvider(new bi.a2(4));
        frameLayout8.addView(this.j0, w7.a6.d(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.j0.addView(this.i0, new FrameLayout.LayoutParams(-2, -1));
        d0(R.drawable.formatting_bold, 1, context, false);
        d0(R.drawable.formatting_italic, 2, context, false);
        d0(R.drawable.formatting_underline, 16, context, false);
        d0(R.drawable.formatting_strikethrough, 8, context, false);
        d0(R.drawable.formatting_spoiler, 256, context, false);
        d0(R.drawable.iv_code, 4, context, false);
        d0(R.drawable.formatting_marked, 65536, context, true);
        d0(R.drawable.iv_sub, 16384, context, true);
        d0(R.drawable.iv_super, 32768, context, true);
        z1 z1Var = new z1(context, R.drawable.iv_quote, getResourceProvider());
        this.u0 = z1Var;
        z1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.u0.setOnClickListener(new j1(this, 11));
        LinearLayout linearLayout5 = this.i0;
        linearLayout5.addView(this.u0, w7.a6.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        z1 z1Var2 = new z1(context, R.drawable.iv_button, getResourceProvider());
        this.r0 = z1Var2;
        z1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.r0.setOnClickListener(new j1(this, 12));
        LinearLayout linearLayout6 = this.i0;
        linearLayout6.addView(this.r0, w7.a6.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.n0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.n0.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.n0, w7.a6.a(44.0f, 8.0f, 0.0f, 0.0f, 0.0f, -2, 80));
        z1 z1Var3 = new z1(context, R.drawable.media_link_24, getResourceProvider());
        this.q0 = z1Var3;
        z1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.q0.setOnClickListener(new j1(this, 13));
        this.n0.addView(this.q0, w7.a6.q(38, 38, 16));
        z1 z1Var4 = new z1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.s0 = z1Var4;
        z1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.s0.setOnClickListener(new j1(this, 14));
        this.n0.addView(this.s0, w7.a6.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.o0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.o0.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.o0, w7.a6.a(44.0f, 8.0f, 0.0f, 0.0f, 0.0f, -2, 80));
        z1 z1Var5 = new z1(context, R.drawable.iv_math, getResourceProvider());
        this.t0 = z1Var5;
        z1Var5.e();
        arrayList.add(this.t0);
        this.t0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.t0.setOnClickListener(new j1(this, 15));
        this.o0.addView(this.t0, w7.a6.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.m0.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.m0, 0, w7.a6.a(44.0f, 0.0f, 0.0f, 8.0f, 0.0f, -2, 80));
        z1 z1Var6 = new z1(context, 0, getResourceProvider());
        this.p0 = z1Var6;
        z1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.p0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.p0.setOnClickListener(new j1(this, 16));
        this.m0.addView(this.p0, w7.a6.q(38, 38, 16));
        y1 y1Var = new y1(this.r != null ? R.drawable.input_done : l0() ? R.drawable.input_schedule : R.drawable.send_plane_24, 0, context, this, getResourceProvider());
        this.y0 = y1Var;
        y1Var.setBackground(new c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), getThemedColor(org.telegram.ui.ActionBar.g6.Yd))));
        w7.c6.a(this.y0);
        this.a0.addView(this.y0, w7.a6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.y0.setContentDescription(LocaleController.getString(R.string.Send));
        this.y0.setOnClickListener(new j1(this, 0));
        this.y0.setOnLongClickListener(new di.l5(this, 3));
        C0();
        this.O.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        A0();
        if (this.e) {
            this.P.D2();
            this.e = false;
        }
        v1 v1Var = this.O;
        this.fragmentView = v1Var;
        return v1Var;
    }

    public final void d0(int i10, int i11, Context context, boolean z10) {
        z1 z1Var = new z1(context, i10, getResourceProvider());
        if (z10) {
            z1Var.e();
            this.N.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(i0(i11));
        z1Var.setOnClickListener(new di.m4(this, i11, 2));
        this.l0.add(z1Var);
        LinearLayout linearLayout = this.i0;
        linearLayout.addView(z1Var, w7.a6.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
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
        this.P0.setInterpolator(es.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        wz wzVar = this.A0;
        if (wzVar == null || (layoutParams = (FrameLayout.LayoutParams) wzVar.getLayoutParams()) == null) {
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
        wz wzVar = this.A0;
        if (wzVar != null && (layoutParams = (FrameLayout.LayoutParams) wzVar.getLayoutParams()) != null) {
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
        x3 x3Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        x3Var.M3 = i12;
        x3Var.N3 = i13;
        x3Var.O3 = i14;
        this.Y.setTranslationY(-max);
        this.R.setTranslationY(r0 + this.T0);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        x3 x3Var = this.P;
        if (x3Var == null || !x3Var.l3.x()) {
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
            wz wzVar = this.A0;
            if (wzVar != null) {
                wzVar.u(false);
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
        wz wzVar2 = this.A0;
        if (wzVar2 != null) {
            wzVar2.setTranslationY(0.0f);
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
        fo foVar;
        return this.r == null && (foVar = this.J) != null && foVar.c();
    }

    public final boolean m0() {
        if (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        x3 x3Var = this.P;
        return g5.f(x3Var.j3, x3Var.k3);
    }

    public final void n0() {
        o3 i22 = this.P.i2();
        if (i22 == null) {
            return;
        }
        TL_iv.RichMessage a2 = i22.a();
        if (a2.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
        e0Var.o0(a2);
        e0Var.k0 = new bi.o1(i22, 28);
        e0Var.show();
    }

    public final void o0(int i10, int i11) {
        x3 x3Var = this.P;
        x3Var.a4 = x3Var.R2();
        vi viVar = new vi(getParentActivity(), this, false, false, true, getResourceProvider());
        viVar.c2 = new s1(this, viVar);
        viVar.j0.setIncludeVideosInGallery(true);
        viVar.j0.f0();
        viVar.N1(1, true);
        viVar.j1(i10);
        viVar.w2 = new r1(this, viVar);
        viVar.Y = new r1(this, viVar);
        viVar.X = new t1(this, viVar);
        viVar.t1();
        if (i11 != 0) {
            viVar.D1(i11);
        }
        viVar.setFocusable(true);
        viVar.show();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 != -1 || i10 != 21) {
            if (i11 != -1 || (i10 != 1 && i10 != 14)) {
                super.onActivityResultFragment(i10, i11, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.P.f2(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        x3 x3Var = this.P;
        Uri data = intent.getData();
        if (data == null) {
            x3Var.getClass();
        } else {
            if (x3Var.getContext() == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new fi.q3(28, x3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.C0;
        if (z11) {
            if (z11) {
                this.C0 = false;
                wz wzVar = this.A0;
                if (wzVar != null) {
                    wzVar.u(false);
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
            if (!this.P.G2()) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        ih.f fVar = this.s;
        this.x = fVar.f;
        fVar.e = false;
        fVar.invalidate();
        this.v.setAlpha(0.0f);
        int i11 = 4;
        this.v.A1.setVisibility(4);
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
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<x3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.S;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.S;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<x3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(es.h);
        this.O.post(new tu0(animatorSet, i11));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        fi.g2 g2Var;
        NotificationCenter.ObserversGroup observersGroup;
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
        hj0 hj0Var = this.O0;
        if (hj0Var != null) {
            hj0Var.i();
            this.O0 = null;
        }
        x3 x3Var = this.P;
        if (x3Var != null) {
            x3Var.H2();
        }
        m.q3 q3Var = this.z0;
        if (q3Var != null) {
            q3Var.a();
        }
        super.onFragmentDestroy();
        wz wzVar = this.A0;
        if (wzVar != null && (observersGroup = wzVar.I2) != null) {
            observersGroup.removeAllObservers();
            wzVar.I2 = null;
        }
        v1 v1Var = this.O;
        if (v1Var == null || (g2Var = this.H0) == null) {
            return;
        }
        v1Var.r.remove(g2Var);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        h0();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        m80 m80Var;
        i0.b f7 = l1Var.a.f(3);
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
        if (!this.G0 && z10 && (m80Var = this.x0) != null) {
            m80Var.u();
            this.x0 = null;
        }
        onInsets(f7.a, f7.b, f7.c, f7.d);
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        x3 x3Var;
        int i10;
        x3 x3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.c) >= 0 && (x3Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.c = -1;
            if (x3Var2.Z1(i10, i11)) {
                return;
            }
            x3Var2.post(new p2(x3Var2, i10, i11, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.b == null && this.f == null) || (x3Var = this.P) == null || x3Var.b3()) {
            return;
        }
        x3Var.post(new b(x3Var, 5));
    }

    public final boolean q0() {
        Runnable runnable;
        if (this.J == null || this.r != null || !this.P.s2()) {
            return false;
        }
        TL_iv.RichMessage k22 = this.M ? null : this.P.k2();
        if (k22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        sk skVar = this.J.Y;
        if (k22 != null && !this.M) {
            x3 x3Var = this.P;
            if (x3Var.l3() && !g5.f(x3Var.j3, x3Var.k3) && skVar != null) {
                SpannableStringBuilder k10 = g5.k(this.P.j3);
                fo foVar = skVar.P2;
                if (skVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, skVar.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.b6.class);
                if (b6VarArr != null) {
                    for (org.telegram.ui.Components.b6 b6Var : b6VarArr) {
                        b6Var.applyFontMetrics(skVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.s5.g());
                    }
                }
                tj0.a(spannableStringBuilder);
                if (foVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(skVar.Q).saveDraft(foVar.a(), foVar.E7(foVar.n5), charSequenceArr[0], MediaDataController.getInstance(skVar.Q).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                skVar.setRichDraftPreview(null);
                if (skVar.E0.getText() != null) {
                    skVar.E0.getText().clear();
                }
                skVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        fo foVar2 = this.J;
        mediaDataController.saveDraft(a2, foVar2.E7(foVar2.n5), "", null, null, null, null, 0L, false, false, k22);
        TL_iv.RichMessage richMessage = k22;
        if (skVar == null) {
            return true;
        }
        skVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            x3 x3Var = this.P;
            Objects.requireNonNull(x3Var);
            p0(parentActivity, new b(x3Var, 0), new i1(this, 4), getResourceProvider());
            return;
        }
        if (l0()) {
            org.telegram.ui.Components.g5.L(getParentActivity(), this.J.a(), new k6.h(this, 29), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ji.o1] */
    public final void s0(final int i10, final int i11, final boolean z10) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            x3 x3Var = this.P;
            Objects.requireNonNull(x3Var);
            p0(parentActivity, new b(x3Var, 0), new i1(this, 4), getResourceProvider());
            return;
        }
        if (this.J == null || !this.P.l3() || this.P.n3()) {
            return;
        }
        if (!this.P.N3()) {
            B0();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            sk skVar = this.J.Y;
            if (skVar == null) {
                return;
            }
            this.M = true;
            Runnable runnable = this.K;
            if (runnable != null) {
                runnable.run();
            }
            skVar.P0(g5.k(this.P.j3), z10, i10, i11);
            finishFragment();
            return;
        }
        this.M = true;
        final ArrayList a32 = this.P.a3();
        if (a32.isEmpty()) {
            return;
        }
        final ArrayList C2 = this.P.C2();
        final ArrayList z22 = this.P.z2();
        final ArrayList a2 = f5.a(this.currentAccount, a32);
        final long a10 = this.J.a();
        fo foVar = this.J;
        final MessageObject messageObject = foVar.n5;
        final MessageObject messageObject2 = foVar.X3;
        final long S8 = foVar.S8();
        final SendMessageChatArguments H8 = this.J.H8();
        final MessageObject messageObject3 = this.r;
        ?? r02 = new Runnable() { // from class: ji.o1
            @Override // java.lang.Runnable
            public final void run() {
                d2.X(d2.this, messageObject3, a32, C2, z22, a2, a10, messageObject, messageObject2, z10, i10, i11, H8, S8);
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
            z1 z1Var = (z1) obj;
            if (((Integer) z1Var.getTag()).intValue() == 1) {
                z1Var.setEnabled(z10);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        z1 z1Var = this.q0;
        if (z1Var != null) {
            z1Var.setEnabled(z10);
        }
        z1 z1Var2 = this.r0;
        if (z1Var2 != null) {
            z1Var2.setEnabled(z11);
        }
        z1 z1Var3 = this.s0;
        if (z1Var3 != null) {
            z1Var3.setEnabled(z10);
        }
        z1 z1Var4 = this.t0;
        if (z1Var4 != null) {
            z1Var4.setEnabled(z10);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0() {
        a R2;
        int i10;
        int size;
        int i11;
        o9 textSelectionHelper = this.P.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            R2 = this.P.R2();
        } else {
            int i12 = textSelectionHelper.p0;
            R2 = i12 == textSelectionHelper.s0 ? this.P.z4(i12) : null;
        }
        if (this.P.S2() == null) {
            if (R2 != null) {
                if (!R2.a() && !R2.b() && !R2.c()) {
                    TL_iv.PageBlock pageBlock = R2.b;
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
                                z1 z1Var = (z1) obj;
                                int intValue = ((Integer) z1Var.getTag()).intValue();
                                z1Var.setSelected(i10 == intValue);
                                if (i10 == intValue) {
                                    z1Var.setEnabled(true);
                                    if (R2 == null) {
                                        z1Var.a();
                                    } else if (i10 == 1) {
                                        TL_iv.PageBlock pageBlock2 = R2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            z1Var.f(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            z1Var.f(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            z1Var.f(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            z1Var.f(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            z1Var.f(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            z1Var.f(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            z1Var.f(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            z1Var.f(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            z1Var.f(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            z1Var.f(R.drawable.iv_footer);
                                        } else {
                                            z1Var.a();
                                        }
                                    } else if (i10 == 2) {
                                        if (R2.a()) {
                                            z1Var.f(R.drawable.iv_todo);
                                        } else if (R2.c()) {
                                            z1Var.f(R.drawable.iv_ordered_list);
                                        } else {
                                            z1Var.a();
                                        }
                                    } else if (i10 == 8) {
                                        z1Var.f(R.drawable.iv_details);
                                    } else {
                                        z1Var.a();
                                    }
                                } else {
                                    z1Var.setEnabled(i10 != 4);
                                    z1Var.a();
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
            es esVar = es.h;
            duration.setInterpolator(esVar).withEndAction(new i1(this, 1)).start();
            this.h0.setVisibility(0);
            this.h0.animate().alpha(this.K0 == 1 ? 1.0f : 0.0f).scaleX(this.K0 == 1 ? 1.0f : 0.8f).scaleY(this.K0 == 1 ? 1.0f : 0.8f).translationY(this.K0 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(esVar).withEndAction(new i1(this, 2)).start();
            this.v0.setVisibility(0);
            this.v0.animate().alpha(this.K0 == 2 ? 1.0f : 0.0f).scaleX(this.K0 == 2 ? 1.0f : 0.8f).scaleY(this.K0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(esVar).withEndAction(new i1(this, 3)).start();
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
        o9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.l0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        z1 z1Var = this.u0;
        boolean z12 = false;
        if (z1Var != null) {
            x3 x3Var = this.P;
            int[] C4 = x3Var.C4();
            z1Var.setSelected(C4 != null && x3Var.I3(C4[0], C4[1]));
        }
        if (this.P.M3()) {
            o9 textSelectionHelper2 = this.P.getTextSelectionHelper();
            int i10 = textSelectionHelper2.p0;
            int i11 = textSelectionHelper2.q0;
            int i12 = textSelectionHelper2.t0;
            int i13 = textSelectionHelper2.r0;
            int i14 = textSelectionHelper2.u0;
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                z1 z1Var2 = (z1) obj;
                z1Var2.setSelected(this.P.L3(((Integer) z1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
            }
            boolean z13 = i11 == i12;
            h1 O4 = z13 ? this.P.O4(i10, i11) : null;
            int max = Math.max(0, Math.min(i13, i14));
            int max2 = O4 == null ? 0 : Math.max(0, Math.min(Math.max(i13, i14), O4.length()));
            z1 z1Var3 = this.q0;
            if (z1Var3 != null) {
                z1Var3.setSelected(O4 != null && max < max2 && k6.h(O4.getText(), max, max2));
            }
            z1 z1Var4 = this.s0;
            if (z1Var4 != null) {
                if (O4 != null && max < max2 && k6.g(O4.getText(), max, max2)) {
                    z12 = true;
                }
                z1Var4.setSelected(z12);
            }
            t0(true);
            u0(z13, this.P.m2());
            return;
        }
        if (this.P.x3()) {
            o9 textSelectionHelper3 = this.P.getTextSelectionHelper();
            h1 t22 = this.P.t2(textSelectionHelper3.p0);
            int i16 = textSelectionHelper3.r0;
            int i17 = textSelectionHelper3.u0;
            int max3 = t22 == null ? 0 : Math.max(0, Math.min(Math.min(i16, i17), t22.length()));
            int max4 = t22 == null ? 0 : Math.max(0, Math.min(Math.max(i16, i17), t22.length()));
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                z1 z1Var5 = (z1) obj2;
                z1Var5.setSelected((t22 == null || max3 >= max4 || (((Integer) z1Var5.getTag()).intValue() & t22.getCurrentStyle(max3, max4)) == 0) ? false : true);
            }
            z1 z1Var6 = this.q0;
            if (z1Var6 != null) {
                z1Var6.setSelected(t22 != null && max3 < max4 && k6.h(t22.getText(), max3, max4));
            }
            z1 z1Var7 = this.s0;
            if (z1Var7 != null) {
                if (t22 != null && max3 < max4 && k6.g(t22.getText(), max3, max4)) {
                    z12 = true;
                }
                z1Var7.setSelected(z12);
            }
            t0(true);
            u0(true, this.P.m2());
            return;
        }
        int i19 = textSelectionHelper.p0;
        int i20 = textSelectionHelper.s0;
        int i21 = textSelectionHelper.r0;
        int i22 = textSelectionHelper.u0;
        boolean z14 = i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.n4.size();
        int size3 = arrayList.size();
        int i23 = 0;
        while (i23 < size3) {
            int i24 = i23 + 1;
            z1 z1Var8 = (z1) arrayList.get(i23);
            z1Var8.setSelected(z14 && this.P.K3(((Integer) z1Var8.getTag()).intValue(), i19, i21, i20, i22));
            i23 = i24;
        }
        t0(!this.P.J3());
        z1 z1Var9 = this.q0;
        if (z1Var9 != null) {
            if (z14) {
                Editable I4 = this.P.I4(i19, i21, i20, i22);
                if (I4 == null ? false : k6.h(I4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z11 = true;
                    z1Var9.setSelected(z11);
                }
            }
            z11 = false;
            z1Var9.setSelected(z11);
        }
        z1 z1Var10 = this.s0;
        if (z1Var10 != null) {
            if (z14) {
                Editable I42 = this.P.I4(i19, i21, i20, i22);
                if (I42 == null ? false : k6.g(I42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z10 = true;
                    z1Var10.setSelected(z10);
                }
            }
            z10 = false;
            z1Var10.setSelected(z10);
        }
        if (z14 && i19 == i20) {
            z12 = true;
        }
        u0(z12, this.P.m2());
    }

    public final void z0() {
        boolean s22 = this.P.s2();
        h2 h2Var = this.P.H3;
        boolean z10 = (h2Var == null || h2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setEnabled(s22);
            this.V.setAlpha(s22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            this.W.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public d2(String str) {
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

    public d2(TL_iv.RichMessage richMessage) {
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
