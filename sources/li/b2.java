package li;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
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
import bi.cb;
import bi.ce;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.hk;
import org.telegram.ui.kn;
import org.telegram.ui.ni0;
import org.telegram.ui.un;
import org.telegram.ui.xa1;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b2 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public sz A0;
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
    public hi.i2 H0;
    public float I;
    public int I0;
    public un J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public n1 N0;
    public t1 O;
    public ni0 O0;
    public v3 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public g1 R0;
    public FrameLayout S;
    public int S0;
    public ImageView T;
    public int T0;
    public LinearLayout U;
    public int U0;
    public ImageView V;
    public boolean V0;
    public ImageView W;
    public int W0;
    public FrameLayout X;
    public int X0;
    public FrameLayout Y;
    public int Y0;
    public FrameLayout Z;
    public boolean Z0;
    public final CharSequence a;
    public LinearLayout a0;
    public final TL_iv.RichMessage b;
    public ah b0;
    public int c;
    public ImageView c0;
    public int d;
    public u1 d0;
    public boolean e;
    public LinearLayout e0;
    public final String f;
    public final ArrayList f0;
    public ImageView g0;
    public CharSequence h;
    public xa1 h0;
    public LinearLayout i0;
    public v1 j0;
    public int k0;
    public final ArrayList l0;
    public LinearLayout m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public x1 p0;
    public x1 q0;
    public MessageObject r;
    public x1 r0;
    public jh.f s;
    public x1 s0;
    public x1 t0;
    public x1 u0;
    public hk v;
    public FrameLayout v0;
    public final Rect w;
    public ak0 w0;
    public eh.d x;
    public k80 x0;
    public RectF y;
    public w1 y0;
    public m.r3 z0;

    public b2(Editable editable) {
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
        this.M0 = new h1(this, 0);
        this.a = editable;
    }

    public static void V(b2 b2Var) {
        j3 j3Var = b2Var.P.v3;
        if (j3Var != null && j3Var.x()) {
            b2Var.o0();
            return;
        }
        Activity parentActivity = b2Var.getParentActivity();
        new w(b2Var.currentAccount, parentActivity, new ig.o(b2Var, 10), b2Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void W(b2 b2Var) {
        if (UserConfig.getInstance(b2Var.currentAccount).isPremium()) {
            return;
        }
        b2Var.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) b2Var, 43, true));
    }

    public static boolean X(b2 b2Var, View view) {
        un unVar = b2Var.J;
        if (unVar != null && b2Var.r == null && !unVar.c() && b2Var.P.q3() && !b2Var.P.s3()) {
            if (!b2Var.P.S3()) {
                b2Var.C0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> f32 = b2Var.P.f3();
            if (!f32.isEmpty()) {
                ni0 ni0Var = b2Var.O0;
                if (ni0Var != null) {
                    ni0Var.g(false);
                    b2Var.O0 = null;
                }
                ni0 ni0Var2 = new ni0(b2Var.getParentActivity(), b2Var.getResourceProvider());
                b2Var.O0 = ni0Var2;
                ni0Var2.setOnDismissListener(new cb(b2Var, 8));
                long a2 = b2Var.J.a();
                MessageObject messageObject = b2Var.J.z5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(b2Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(b2Var.currentAccount).getPeer(UserConfig.getInstance(b2Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = f32;
                richMessage.photos = b2Var.P.H2();
                tL_message.rich_message.documents = b2Var.P.E2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(b2Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                b2Var.O0.p(org.telegram.messenger.t.l(messageObject2));
                b2Var.y0.setScaleX(1.0f);
                b2Var.y0.setScaleY(1.0f);
                vg q5 = b2Var.O0.q(b2Var.y0, true, new i1(b2Var, 10));
                if (q5 != null) {
                    q5.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), b2Var.getThemedColor(y6.Oh))));
                    ni0 ni0Var3 = b2Var.O0;
                    int dp = AndroidUtilities.dp(44.0f);
                    ni0Var3.l0 = true;
                    ni0Var3.X = dp;
                }
                k80 H = k80.H(b2Var, b2Var.y0);
                boolean isUserSelf = UserObject.isUserSelf(b2Var.J.i());
                if (b2Var.J.I6()) {
                    H.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new bi.r3(b2Var, a2, 15), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new h1(b2Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new h1(b2Var, 6), false);
                }
                H.Y();
                b2Var.O0.o(H);
                b2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void Y(final b2 b2Var, Context context, View view) {
        k80 k80Var;
        boolean z10;
        k80 k80Var2 = b2Var.x0;
        if (k80Var2 != null) {
            k80Var2.u();
            b2Var.x0 = null;
        }
        boolean z11 = (MessagesController.getInstance(b2Var.currentAccount).richEditorAllowed() || UserConfig.getInstance(b2Var.currentAccount).isPremium()) ? false : true;
        final a W2 = b2Var.P.W2();
        final k80 I = k80.I(b2Var, view);
        I.Q = true;
        k80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(I, 1), false);
        J.k();
        final int i10 = 0;
        J.j(W2 != null && (W2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 2);
        final int i11 = 1;
        J.j(W2 != null && (W2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 1);
        final int i12 = 2;
        J.j(W2 != null && (W2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize);
        final int i13 = 3;
        J.j(W2 != null && (W2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 1);
        final int i14 = 4;
        J.j(W2 != null && (W2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 2);
        final int i15 = 5;
        J.j(W2 != null && (W2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.b5(W2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 3);
        if (W2 == null || !v3.I3(W2.b)) {
            k80Var = J;
            z10 = false;
        } else {
            k80Var = J;
            z10 = true;
        }
        z1 z1Var = new z1(context, R.drawable.iv_h);
        z1Var.a(z11);
        int i16 = y6.G8;
        z1Var.d = i16;
        I.j(z10, 0, z1Var, LocaleController.getString(R.string.ArticleHeading), new hi.o2(I, k80Var, 2));
        I.y().a.setTypeface(AndroidUtilities.bold());
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(W2 != null && (W2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new l1(b2Var, W2, 3));
        I.j(W2 != null && (W2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new l1(b2Var, W2, 4));
        boolean z12 = W2 != null && (W2.b instanceof TL_iv.pageBlockPullquote);
        z1 z1Var2 = new z1(context, R.drawable.iv_pullquote);
        z1Var2.a(z11);
        z1Var2.d = i16;
        I.j(z12, 0, z1Var2, LocaleController.getString(R.string.ArticlePullquote), new l1(b2Var, W2, 0));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(W2 != null && (W2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new l1(b2Var, W2, 1));
        boolean z13 = W2 != null && (W2.b instanceof TL_iv.pageBlockFooter);
        z1 z1Var3 = new z1(context, R.drawable.iv_footer);
        z1Var3.a(z11);
        z1Var3.d = i16;
        I.j(z13, 0, z1Var3, LocaleController.getString(R.string.ArticleFooter), new l1(b2Var, W2, 2));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.Z();
        b2Var.x0 = I;
    }

    public static /* synthetic */ void Z(b2 b2Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, MessageObject messageObject2, MessageObject messageObject3, kn knVar, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j11) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(b2Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, b2Var.J);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(b2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j10, messageObject2, messageObject3, knVar, z10, i10, i11, sendMessageChatArguments, 0L, j11, 0L);
        }
    }

    public static void a0(b2 b2Var, boolean z10, boolean z11) {
        if (b2Var.J0 == z10 && z11) {
            return;
        }
        b2Var.J0 = z10;
        float f7 = z10 ? 1.15f : 1.0f;
        if (z11) {
            b2Var.w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(ds.h).start();
        } else {
            b2Var.w0.animate().cancel();
            b2Var.w0.setScaleX(f7);
            b2Var.w0.setScaleY(f7);
        }
        f7.t(b2Var.w0, z10 ? y6.q7 : y6.G6, b2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        xj0 animatedDrawable = b2Var.w0.getAnimatedDrawable();
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

    public static g1 b0(b2 b2Var) {
        g1 focusedEditTextOrNull = b2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            g1 g1Var = b2Var.R0;
            return g1Var != null ? g1Var : b2Var.P.V2();
        }
        b2Var.R0 = focusedEditTextOrNull;
        b2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int c0(b2 b2Var, g1 g1Var) {
        return (g1Var != b2Var.R0 || b2Var.P.getFocusedEditTextOrNull() == g1Var) ? Math.max(0, g1Var.getSelectionEnd()) : Math.min(b2Var.S0, g1Var.length());
    }

    public static String h0(int i10) {
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

    public static String j0(int i10) {
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

    public static void q0(Context context, final Runnable runnable, final Runnable runnable2, u6 u6Var) {
        final int i10 = 0;
        final org.telegram.ui.ActionBar.k3 i11 = vh.i(1, context, u6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int dp = AndroidUtilities.dp(80.0f);
        int i12 = y6.Oh;
        ShapeDrawable K = y6.K(dp, y6.w0(i12, u6Var));
        b7 N = f7.N(i12);
        imageView.setBackground(K);
        f7.k(imageView, K, N, null, u6Var);
        linearLayout.addView(imageView, gb1.x(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i13 = y6.G6;
        f7.V(textView, i13, u6Var);
        TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 49, 25, 16, 25, 0), context);
        e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        e.setTextSize(1, 14.0f);
        e.setGravity(17);
        f7.V(e, i13, u6Var);
        linearLayout.addView(e, gb1.x(-1, -2, 49, 25, 11, 25, 0));
        fi.d f7 = vh.f(24, context, u6Var, true);
        f7.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(f7, gb1.x(-1, 48, 49, 14, 31, 14, 0));
        fi.d f10 = vh.f(24, context, u6Var, false);
        f10.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(f10, gb1.x(-1, 48, 49, 14, 2, 14, 6));
        i11.show();
        f7.setOnClickListener(new View.OnClickListener() { // from class: li.k1
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
        f10.setOnClickListener(new View.OnClickListener() { // from class: li.k1
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
        boolean x22 = this.P.x2();
        f2 f2Var = this.P.R3;
        boolean z10 = (f2Var == null || f2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setEnabled(x22);
            this.V.setAlpha(x22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            this.W.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void B0() {
        int i10 = 0;
        boolean z10 = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((x1) obj).setPremiumLocked(z10);
        }
    }

    public final void C0() {
        if (this.y0 == null) {
            return;
        }
        boolean S3 = this.P.S3();
        this.y0.setEnabled(S3);
        vh.p(this.y0.animate(), S3 ? 1.0f : 0.5f, 150L);
    }

    public final void D0() {
        w1 w1Var = this.y0;
        if (w1Var == null) {
            return;
        }
        w1Var.setLocked(n0());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new t1(this, context);
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.F0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        hi.i2 i2Var = new hi.i2(this, 1);
        this.H0 = i2Var;
        this.O.r.add(i2Var);
        v3 v3Var = new v3(context, this.currentAccount, getResourceProvider(), new jg.s0(this, 6));
        this.P = v3Var;
        v3Var.setFileRefParentObject(this.r);
        this.O.addView(this.P, gb1.i(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), gb1.g(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            v3 v3Var2 = this.P;
            ArrayList arrayList2 = v3Var2.t3;
            v3Var2.s3 = richMessage;
            v3.c3(arrayList2, richMessage.blocks, v3Var2.u3);
            v3Var2.b4();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                v3Var2.B4((a) arrayList2.get(i10));
            }
            v3Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                v3 v3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = v3Var3.u3;
                ArrayList arrayList3 = v3Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    v3.c3(arrayList3, c5.b(charSequence), hashMap);
                }
                arrayList3.addAll(v3Var3.C4(d4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    v3.c3(arrayList3, c5.b(charSequence2), hashMap);
                }
                v3Var3.b4();
                v3Var3.g3.O(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        f2 f2Var = this.P.R3;
        if (f2Var != null) {
            f2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = y6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i11), y6.o1(0.0f, getThemedColor(i11))}));
        this.O.addView(this.Q, gb1.i(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{y6.o1(0.0f, getThemedColor(i11)), getThemedColor(i11)}));
        this.O.addView(this.R, gb1.i(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, gb1.i(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = y6.i6;
        imageView3.setBackground(new a2(y6.a0(themedColor, y6.v(themedColor2, getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.T;
        int i13 = y6.G6;
        u6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        f7.t(imageView4, i13, resourceProvider, mode);
        gb1.b(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.T.setOnClickListener(new i1(this, 1));
        this.S.addView(this.T, gb1.h(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.S.addView(this.U, gb1.h(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        f7.R(this.V, y6.g0(getThemedColor(i12), 1, -1), null, f7.N(i12), getResourceProvider());
        f7.t(this.V, i13, getResourceProvider(), mode);
        gb1.b(this.V);
        this.V.setContentDescription(LocaleController.getString(R.string.Undo));
        this.V.setOnClickListener(new i1(this, 2));
        this.U.addView(this.V, gb1.u(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        f7.R(this.W, y6.g0(getThemedColor(i12), 1, -1), null, f7.N(i12), getResourceProvider());
        f7.t(this.W, i13, getResourceProvider(), mode);
        gb1.b(this.W);
        this.W.setContentDescription(LocaleController.getString(R.string.Redo));
        this.W.setOnClickListener(new i1(this, 3));
        this.U.addView(this.W, gb1.u(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, gb1.i(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, gb1.i(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.a0.setClipChildren(false);
        this.a0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Z.addView(this.a0, gb1.i(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.c0.setScaleType(scaleType);
        f7.t(this.c0, i13, getResourceProvider(), mode);
        this.c0.setBackground(new a2(y6.a0(getThemedColor(i11), y6.v(getThemedColor(i11), getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.a0.addView(this.c0, gb1.t(44, 44, 0.0f, 19, 0, 0, 8, 0));
        gb1.b(this.c0);
        this.c0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.c0.setOnClickListener(new i1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        frameLayout5.addView(frameLayout6, gb1.i(-2, 44, 81));
        u1 u1Var = new u1(context, 0);
        this.d0 = u1Var;
        u1Var.setClipToOutline(true);
        this.d0.setOutlineProvider(new ag.v0(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.e0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.e0.setOrientation(0);
        this.d0.addView(this.e0);
        frameLayout6.addView(this.d0, gb1.g(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.b0 = ahVar;
        ahVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        f7.t(this.b0, i13, getResourceProvider(), mode);
        f7.R(this.b0, y6.a0(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)), f7.N(i11), f7.N(i12), getResourceProvider());
        this.b0.j(yg.e, false);
        this.e0.addView(this.b0, gb1.u(38, 38, 16));
        gb1.b(this.b0);
        this.b0.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.b0.setOnClickListener(new i1(this, 5));
        d0(R.drawable.iv_text, 1, false).setOnClickListener(new bi.q(23, this, context));
        d0(R.drawable.iv_lists, 2, true).setOnClickListener(new i1(this, 6));
        d0(R.drawable.iv_table, 4, true).setOnClickListener(new i1(this, 7));
        d0(R.drawable.iv_math, 7, true).setOnClickListener(new i1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.g0.setScaleType(scaleType);
        f7.t(this.g0, i13, getResourceProvider(), mode);
        f7.R(this.g0, y6.a0(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)), f7.N(i11), f7.N(i12), getResourceProvider());
        this.e0.addView(this.g0, gb1.x(38, 38, 16, 2, 0, 0, 0));
        gb1.b(this.g0);
        this.g0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.g0.setOnClickListener(new i1(this, 9));
        this.a0.addView(frameLayout5, gb1.p(1.0f, 0, 44));
        xa1 xa1Var = new xa1(this, context, 5);
        this.h0 = xa1Var;
        xa1Var.setOrientation(0);
        this.h0.setClipToPadding(false);
        this.h0.setClipChildren(false);
        this.h0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.h0, gb1.i(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.v0.setClipToPadding(false);
        this.v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.v0, gb1.i(80, 60, 81));
        ak0 ak0Var = new ak0(context);
        this.w0 = ak0Var;
        ak0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        xj0 animatedDrawable = this.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.w0.setScaleType(scaleType);
        f7.t(this.w0, i13, getResourceProvider(), mode);
        this.w0.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.v0.addView(this.w0, gb1.i(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(frameLayout8, gb1.g(44.0f, -2));
        v1 v1Var = new v1(this, context);
        this.j0 = v1Var;
        v1Var.setHorizontalScrollBarEnabled(false);
        this.j0.setClipToOutline(true);
        this.j0.setOutlineProvider(new ag.v0(6));
        frameLayout8.addView(this.j0, gb1.g(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.j0.addView(this.i0, new FrameLayout.LayoutParams(-2, -1));
        e0(context, R.drawable.formatting_bold, 1, false);
        e0(context, R.drawable.formatting_italic, 2, false);
        e0(context, R.drawable.formatting_underline, 16, false);
        e0(context, R.drawable.formatting_strikethrough, 8, false);
        e0(context, R.drawable.formatting_spoiler, 256, false);
        e0(context, R.drawable.iv_code, 4, false);
        e0(context, R.drawable.formatting_marked, 65536, true);
        e0(context, R.drawable.iv_sub, 16384, true);
        e0(context, R.drawable.iv_super, 32768, true);
        x1 x1Var = new x1(context, R.drawable.iv_quote, getResourceProvider());
        this.u0 = x1Var;
        x1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.u0.setOnClickListener(new i1(this, 11));
        LinearLayout linearLayout5 = this.i0;
        linearLayout5.addView(this.u0, gb1.x(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        x1 x1Var2 = new x1(context, R.drawable.iv_button, getResourceProvider());
        this.r0 = x1Var2;
        x1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.r0.setOnClickListener(new i1(this, 12));
        LinearLayout linearLayout6 = this.i0;
        linearLayout6.addView(this.r0, gb1.x(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.n0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.n0.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.n0, gb1.h(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var3 = new x1(context, R.drawable.media_link_24, getResourceProvider());
        this.q0 = x1Var3;
        x1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.q0.setOnClickListener(new i1(this, 13));
        this.n0.addView(this.q0, gb1.u(38, 38, 16));
        x1 x1Var4 = new x1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.s0 = x1Var4;
        x1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.s0.setOnClickListener(new i1(this, 14));
        this.n0.addView(this.s0, gb1.u(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.o0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.o0.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.o0, gb1.h(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(context, R.drawable.iv_math, getResourceProvider());
        this.t0 = x1Var5;
        x1Var5.d();
        arrayList.add(this.t0);
        this.t0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.t0.setOnClickListener(new i1(this, 15));
        this.o0.addView(this.t0, gb1.u(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.m0.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.h0.addView(this.m0, 0, gb1.h(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var6 = new x1(context, 0, getResourceProvider());
        this.p0 = x1Var6;
        x1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.p0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.p0.setOnClickListener(new i1(this, 16));
        this.m0.addView(this.p0, gb1.u(38, 38, 16));
        w1 w1Var = new w1(this.r != null ? R.drawable.input_done : m0() ? R.drawable.input_schedule : R.drawable.send_plane_24, 0, context, this, getResourceProvider());
        this.y0 = w1Var;
        w1Var.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(y6.Yd))));
        gb1.b(this.y0);
        this.a0.addView(this.y0, gb1.t(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.y0.setContentDescription(LocaleController.getString(R.string.Send));
        this.y0.setOnClickListener(new i1(this, 0));
        this.y0.setOnLongClickListener(new fi.b5(this, 3));
        D0();
        this.O.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        i0();
        y0(0, false);
        A0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        B0();
        if (this.e) {
            this.P.I2();
            this.e = false;
        }
        t1 t1Var = this.O;
        this.fragmentView = t1Var;
        return t1Var;
    }

    public final x1 d0(int i10, int i11, boolean z10) {
        x1 x1Var = new x1(this.e0.getContext(), i10, getResourceProvider());
        if (z10) {
            x1Var.d();
            this.N.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i11));
        x1Var.setContentDescription(h0(i11));
        this.f0.add(x1Var);
        LinearLayout linearLayout = this.e0;
        linearLayout.addView(x1Var, gb1.x(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return x1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            D0();
            B0();
        }
    }

    public final void e0(Context context, int i10, int i11, boolean z10) {
        x1 x1Var = new x1(context, i10, getResourceProvider());
        if (z10) {
            x1Var.d();
            this.N.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i11));
        x1Var.setContentDescription(j0(i11));
        x1Var.setOnClickListener(new ai.w(this, i11, 7));
        this.l0.add(x1Var);
        LinearLayout linearLayout = this.i0;
        linearLayout.addView(x1Var, gb1.x(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    public final void f0(boolean z10) {
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, z10 ? 1.0f : 0.0f);
        this.P0 = ofFloat;
        ofFloat.addUpdateListener(new j1(this, 0));
        this.P0.setInterpolator(ds.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void g0() {
        FrameLayout.LayoutParams layoutParams;
        sz szVar = this.A0;
        if (szVar == null || (layoutParams = (FrameLayout.LayoutParams) szVar.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.O == null ? k0() : Math.max(k0(), ((r2.getMeasuredHeight() - this.O.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.T0)) - r1) * this.Q0) + k0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.A0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0() {
        FrameLayout.LayoutParams layoutParams;
        sz szVar = this.A0;
        if (szVar != null && (layoutParams = (FrameLayout.LayoutParams) szVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.T0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.A0.setLayoutParams(layoutParams);
            }
        }
        g0();
        int max = Math.max(Math.max(this.D0, this.T0), this.U0);
        this.P.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        v3 v3Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        v3Var.W3 = i12;
        v3Var.X3 = i13;
        v3Var.Y3 = i14;
        this.Y.setTranslationY(-max);
        this.R.setTranslationY(r0 + this.T0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        v3 v3Var = this.P;
        if (v3Var == null || !v3Var.v3.x()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final int k0() {
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.F0 : this.E0;
        return i10 <= 0 ? AndroidUtilities.dp(200.0f) : i10;
    }

    public final void l0(boolean z10) {
        if (this.C0) {
            this.C0 = false;
            sz szVar = this.A0;
            if (szVar != null) {
                szVar.t(false);
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
        sz szVar2 = this.A0;
        if (szVar2 != null) {
            szVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            i0();
        }
        ah ahVar = this.b0;
        if (ahVar != null) {
            ahVar.j(yg.e, z10);
        }
    }

    public final boolean m0() {
        un unVar;
        return this.r == null && (unVar = this.J) != null && unVar.c();
    }

    public final boolean n0() {
        if (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        v3 v3Var = this.P;
        return c5.f(v3Var.t3, v3Var.u3);
    }

    public final void o0() {
        m3 n22 = this.P.n2();
        if (n22 == null) {
            return;
        }
        TL_iv.RichMessage a2 = n22.a();
        if (a2.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
        e0Var.n0(a2);
        e0Var.k0 = new ig.o(n22, 8);
        e0Var.show();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 != -1 || i10 != 21) {
            if (i11 != -1 || (i10 != 1 && i10 != 14)) {
                super.onActivityResultFragment(i10, i11, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.P.k2(intent.getData());
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
            Utilities.globalQueue.postRunnable(new k2.e0(3, v3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.C0;
        if (z11) {
            if (z11) {
                this.C0 = false;
                sz szVar = this.A0;
                if (szVar != null) {
                    szVar.t(false);
                    this.A0.B();
                }
                f0(false);
                return false;
            }
        } else {
            if (this.B0) {
                l0(true);
                return false;
            }
            if (!this.P.L2()) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        int i10 = 1;
        if (!z10 && !this.V0) {
            r0();
            this.V0 = true;
        }
        if (AndroidUtilities.isTablet() || this.s == null || this.v == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        jh.f fVar = this.s;
        this.x = fVar.f;
        fVar.e = false;
        fVar.invalidate();
        this.v.setAlpha(0.0f);
        int i11 = 4;
        this.v.A1.setVisibility(4);
        w0();
        float f7 = z10 ? 0.0f : 1.0f;
        this.I = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
        this.E = true;
        this.O.invalidate();
        ofFloat.addUpdateListener(new j1(this, i10));
        ofFloat.addListener(new ce(9, this, runnable));
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
        animatorSet.setInterpolator(ds.h);
        this.O.post(new zt0(animatorSet, i11));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        hi.i2 i2Var;
        NotificationCenter.ObserversGroup observersGroup;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.V0) {
            r0();
            this.V0 = true;
        }
        n1 n1Var = this.N0;
        if (n1Var != null) {
            this.N0 = null;
            AndroidUtilities.runOnUIThread(n1Var);
        }
        ni0 ni0Var = this.O0;
        if (ni0Var != null) {
            ni0Var.h();
            this.O0 = null;
        }
        v3 v3Var = this.P;
        if (v3Var != null) {
            v3Var.M2();
        }
        m.r3 r3Var = this.z0;
        if (r3Var != null) {
            r3Var.a();
        }
        super.onFragmentDestroy();
        sz szVar = this.A0;
        if (szVar != null && (observersGroup = szVar.M2) != null) {
            observersGroup.removeAllObservers();
            szVar.M2 = null;
        }
        t1 t1Var = this.O;
        if (t1Var == null || (i2Var = this.H0) == null) {
            return;
        }
        t1Var.r.remove(i2Var);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        i0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        k80 k80Var;
        i0.b f7 = k1Var.a.f(3);
        int i10 = k1Var.a.f(8).d;
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
            l0(false);
        }
        if (!this.G0 && z10 && (k80Var = this.x0) != null) {
            k80Var.u();
            this.x0 = null;
        }
        onInsets(f7.a, f7.b, f7.c, f7.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i10 = y6.d6;
            int themedColor = getThemedColor(i10);
            int i11 = y6.i6;
            int themedColor2 = getThemedColor(i11);
            int i12 = y6.Yd;
            int themedColor3 = getThemedColor(i12);
            if (this.Z0 && themedColor == this.W0 && themedColor2 == this.X0 && themedColor3 == this.Y0) {
                return;
            }
            this.Z0 = true;
            this.W0 = themedColor;
            this.X0 = themedColor2;
            this.Y0 = themedColor3;
            View view = this.Q;
            if (view != null) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i10), y6.o1(0.0f, getThemedColor(i10))}));
            }
            View view2 = this.R;
            if (view2 != null) {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{y6.o1(0.0f, getThemedColor(i10)), getThemedColor(i10)}));
            }
            ImageView imageView = this.T;
            if (imageView != null) {
                imageView.setBackground(new a2(y6.a0(getThemedColor(i10), y6.v(getThemedColor(i10), getThemedColor(i11)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
            }
            LinearLayout linearLayout = this.U;
            if (linearLayout != null) {
                linearLayout.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
            }
            ImageView imageView2 = this.c0;
            if (imageView2 != null) {
                imageView2.setBackground(new a2(y6.a0(getThemedColor(i10), y6.v(getThemedColor(i10), getThemedColor(i11)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
            }
            ak0 ak0Var = this.w0;
            if (ak0Var != null) {
                ak0Var.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
            }
            LinearLayout linearLayout2 = this.n0;
            if (linearLayout2 != null) {
                linearLayout2.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
            }
            LinearLayout linearLayout3 = this.o0;
            if (linearLayout3 != null) {
                linearLayout3.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
            }
            LinearLayout linearLayout4 = this.m0;
            if (linearLayout4 != null) {
                linearLayout4.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
            }
            w1 w1Var = this.y0;
            if (w1Var != null) {
                w1Var.setBackground(new a2(y6.c0(AndroidUtilities.dp(22.0f), getThemedColor(i12))));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        v3 v3Var;
        int i10;
        v3 v3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.c) >= 0 && (v3Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.c = -1;
            if (v3Var2.e2(i10, i11)) {
                return;
            }
            v3Var2.post(new n2(v3Var2, i10, i11, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.b == null && this.f == null) || (v3Var = this.P) == null || v3Var.g3()) {
            return;
        }
        v3Var.post(new b(v3Var, 5));
    }

    public final void p0(int i10, int i11) {
        v3 v3Var = this.P;
        v3Var.k4 = v3Var.W2();
        ti tiVar = new ti(getParentActivity(), this, false, false, true, getResourceProvider());
        tiVar.c2 = new q1(this, tiVar);
        tiVar.j0.setIncludeVideosInGallery(true);
        tiVar.j0.f0();
        tiVar.Q1(1, true);
        tiVar.m1(i10);
        tiVar.z2 = new p1(this, tiVar);
        tiVar.Y = new p1(this, tiVar);
        tiVar.X = new r1(this, tiVar);
        tiVar.v1();
        if (i11 != 0) {
            tiVar.F1(i11);
        }
        tiVar.setFocusable(true);
        tiVar.show();
    }

    public final boolean r0() {
        Runnable runnable;
        if (this.J == null || this.r != null || !this.P.x2()) {
            return false;
        }
        TL_iv.RichMessage p22 = this.M ? null : this.P.p2();
        if (p22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        hk hkVar = this.J.Y;
        if (p22 != null && !this.M) {
            v3 v3Var = this.P;
            if (v3Var.q3() && !c5.f(v3Var.t3, v3Var.u3) && hkVar != null) {
                SpannableStringBuilder k10 = c5.k(this.P.t3);
                un unVar = hkVar.P2;
                if (hkVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, hkVar.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.c6.class);
                if (c6VarArr != null) {
                    for (org.telegram.ui.Components.c6 c6Var : c6VarArr) {
                        c6Var.applyFontMetrics(hkVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.t5.g());
                    }
                }
                sj0.a(spannableStringBuilder);
                if (unVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(hkVar.Q).saveDraft(unVar.a(), unVar.I7(unVar.z5), charSequenceArr[0], MediaDataController.getInstance(hkVar.Q).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                hkVar.setRichDraftPreview(null);
                if (hkVar.E0.getText() != null) {
                    hkVar.E0.getText().clear();
                }
                hkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        un unVar2 = this.J;
        mediaDataController.saveDraft(a2, unVar2.I7(unVar2.z5), "", null, null, null, null, 0L, false, false, p22);
        TL_iv.RichMessage richMessage = p22;
        if (hkVar == null) {
            return true;
        }
        hkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void s0() {
        if (n0()) {
            Activity parentActivity = getParentActivity();
            v3 v3Var = this.P;
            Objects.requireNonNull(v3Var);
            q0(parentActivity, new b(v3Var, 0), new h1(this, 4), getResourceProvider());
            return;
        }
        if (m0()) {
            org.telegram.ui.Components.g5.L(getParentActivity(), this.J.a(), new a4.l(this, 29), getResourceProvider());
        } else {
            t0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [li.n1] */
    public final void t0(final int i10, final int i11, final boolean z10) {
        hk hkVar;
        og ogVar;
        if (n0()) {
            Activity parentActivity = getParentActivity();
            v3 v3Var = this.P;
            Objects.requireNonNull(v3Var);
            q0(parentActivity, new b(v3Var, 0), new h1(this, 4), getResourceProvider());
            return;
        }
        if (this.J == null || !this.P.q3() || this.P.s3()) {
            return;
        }
        if (!this.P.S3()) {
            C0();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            hk hkVar2 = this.J.Y;
            if (hkVar2 == null) {
                return;
            }
            this.M = true;
            Runnable runnable = this.K;
            if (runnable != null) {
                runnable.run();
            }
            hkVar2.P0(c5.k(this.P.t3), z10, i10, i11);
            finishFragment();
            return;
        }
        this.M = true;
        final ArrayList f32 = this.P.f3();
        if (f32.isEmpty()) {
            return;
        }
        final ArrayList H2 = this.P.H2();
        final ArrayList E2 = this.P.E2();
        final ArrayList a2 = b5.a(this.currentAccount, f32);
        final long a10 = this.J.a();
        un unVar = this.J;
        final MessageObject messageObject = unVar.z5;
        final MessageObject messageObject2 = unVar.j4;
        final kn knVar = unVar.x5;
        final long X8 = unVar.X8();
        final SendMessageChatArguments L8 = this.J.L8();
        final MessageObject messageObject3 = this.r;
        ?? r02 = new Runnable() { // from class: li.n1
            @Override // java.lang.Runnable
            public final void run() {
                b2.Z(b2.this, messageObject3, f32, H2, E2, a2, a10, messageObject, messageObject2, knVar, z10, i10, i11, L8, X8);
            }
        };
        Runnable runnable2 = this.K;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (messageObject3 == null && (hkVar = this.J.Y) != null && (ogVar = hkVar.Z2) != null) {
            ogVar.A(null, z10, i10, i11, 0L);
        }
        if (i10 == 0 || messageObject3 != null) {
            r02.run();
            finishFragment();
        } else {
            this.N0 = r02;
            finishFragment();
        }
    }

    public final void u0(boolean z10) {
        ArrayList arrayList = this.l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            if (((Integer) x1Var.getTag()).intValue() == 1) {
                x1Var.setEnabled(z10);
            }
        }
    }

    public final void v0(boolean z10, boolean z11) {
        x1 x1Var = this.q0;
        if (x1Var != null) {
            x1Var.setEnabled(z10);
        }
        x1 x1Var2 = this.r0;
        if (x1Var2 != null) {
            x1Var2.setEnabled(z11);
        }
        x1 x1Var3 = this.s0;
        if (x1Var3 != null) {
            x1Var3.setEnabled(z10);
        }
        x1 x1Var4 = this.t0;
        if (x1Var4 != null) {
            x1Var4.setEnabled(z10);
        }
    }

    public final void w0() {
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
    public final void x0() {
        a W2;
        int i10;
        int size;
        int i11;
        s9 textSelectionHelper = this.P.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            W2 = this.P.W2();
        } else {
            int i12 = textSelectionHelper.p0;
            W2 = i12 == textSelectionHelper.s0 ? this.P.E4(i12) : null;
        }
        if (this.P.X2() == null) {
            if (W2 != null) {
                if (!W2.a() && !W2.b() && !W2.c()) {
                    TL_iv.PageBlock pageBlock = W2.b;
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
                                x1 x1Var = (x1) obj;
                                int intValue = ((Integer) x1Var.getTag()).intValue();
                                x1Var.setSelected(i10 == intValue);
                                if (i10 == intValue) {
                                    x1Var.setEnabled(true);
                                    if (W2 == null) {
                                        x1Var.a();
                                    } else if (i10 == 1) {
                                        TL_iv.PageBlock pageBlock2 = W2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            x1Var.e(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            x1Var.e(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            x1Var.e(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            x1Var.e(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            x1Var.e(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            x1Var.e(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            x1Var.e(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            x1Var.e(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            x1Var.e(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            x1Var.e(R.drawable.iv_footer);
                                        } else {
                                            x1Var.a();
                                        }
                                    } else if (i10 == 2) {
                                        if (W2.a()) {
                                            x1Var.e(R.drawable.iv_todo);
                                        } else if (W2.c()) {
                                            x1Var.e(R.drawable.iv_ordered_list);
                                        } else {
                                            x1Var.a();
                                        }
                                    } else if (i10 == 8) {
                                        x1Var.e(R.drawable.iv_details);
                                    } else {
                                        x1Var.a();
                                    }
                                } else {
                                    x1Var.setEnabled(i10 != 4);
                                    x1Var.a();
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

    public final void y0(int i10, boolean z10) {
        if (this.K0 == i10) {
            return;
        }
        this.K0 = i10;
        if (z10) {
            this.a0.setVisibility(0);
            ViewPropertyAnimator duration = this.a0.animate().alpha(this.K0 == 0 ? 1.0f : 0.0f).scaleX(this.K0 == 0 ? 1.0f : 0.8f).scaleY(this.K0 == 0 ? 1.0f : 0.8f).translationY(this.K0 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).withEndAction(new h1(this, 1)).start();
            this.h0.setVisibility(0);
            this.h0.animate().alpha(this.K0 == 1 ? 1.0f : 0.0f).scaleX(this.K0 == 1 ? 1.0f : 0.8f).scaleY(this.K0 == 1 ? 1.0f : 0.8f).translationY(this.K0 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(dsVar).withEndAction(new h1(this, 2)).start();
            this.v0.setVisibility(0);
            this.v0.animate().alpha(this.K0 == 2 ? 1.0f : 0.0f).scaleX(this.K0 == 2 ? 1.0f : 0.8f).scaleY(this.K0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(dsVar).withEndAction(new h1(this, 3)).start();
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

    public final void z0() {
        boolean z10;
        boolean z11;
        s9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.l0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        x1 x1Var = this.u0;
        boolean z12 = false;
        if (x1Var != null) {
            v3 v3Var = this.P;
            int[] H4 = v3Var.H4();
            x1Var.setSelected(H4 != null && v3Var.N3(H4[0], H4[1]));
        }
        if (this.P.R3()) {
            s9 textSelectionHelper2 = this.P.getTextSelectionHelper();
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
                x1 x1Var2 = (x1) obj;
                x1Var2.setSelected(this.P.Q3(((Integer) x1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
            }
            boolean z13 = i11 == i12;
            g1 T4 = z13 ? this.P.T4(i10, i11) : null;
            int max = Math.max(0, Math.min(i13, i14));
            int max2 = T4 == null ? 0 : Math.max(0, Math.min(Math.max(i13, i14), T4.length()));
            x1 x1Var3 = this.q0;
            if (x1Var3 != null) {
                x1Var3.setSelected(T4 != null && max < max2 && f6.h(T4.getText(), max, max2));
            }
            x1 x1Var4 = this.s0;
            if (x1Var4 != null) {
                if (T4 != null && max < max2 && f6.g(T4.getText(), max, max2)) {
                    z12 = true;
                }
                x1Var4.setSelected(z12);
            }
            u0(true);
            v0(z13, this.P.r2());
            return;
        }
        if (this.P.C3()) {
            s9 textSelectionHelper3 = this.P.getTextSelectionHelper();
            g1 y22 = this.P.y2(textSelectionHelper3.p0);
            int i16 = textSelectionHelper3.r0;
            int i17 = textSelectionHelper3.u0;
            int max3 = y22 == null ? 0 : Math.max(0, Math.min(Math.min(i16, i17), y22.length()));
            int max4 = y22 == null ? 0 : Math.max(0, Math.min(Math.max(i16, i17), y22.length()));
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                x1 x1Var5 = (x1) obj2;
                x1Var5.setSelected((y22 == null || max3 >= max4 || (((Integer) x1Var5.getTag()).intValue() & y22.getCurrentStyle(max3, max4)) == 0) ? false : true);
            }
            x1 x1Var6 = this.q0;
            if (x1Var6 != null) {
                x1Var6.setSelected(y22 != null && max3 < max4 && f6.h(y22.getText(), max3, max4));
            }
            x1 x1Var7 = this.s0;
            if (x1Var7 != null) {
                if (y22 != null && max3 < max4 && f6.g(y22.getText(), max3, max4)) {
                    z12 = true;
                }
                x1Var7.setSelected(z12);
            }
            u0(true);
            v0(true, this.P.r2());
            return;
        }
        int i19 = textSelectionHelper.p0;
        int i20 = textSelectionHelper.s0;
        int i21 = textSelectionHelper.r0;
        int i22 = textSelectionHelper.u0;
        boolean z14 = i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.x4.size();
        int size3 = arrayList.size();
        int i23 = 0;
        while (i23 < size3) {
            int i24 = i23 + 1;
            x1 x1Var8 = (x1) arrayList.get(i23);
            x1Var8.setSelected(z14 && this.P.P3(((Integer) x1Var8.getTag()).intValue(), i19, i21, i20, i22));
            i23 = i24;
        }
        u0(!this.P.O3());
        x1 x1Var9 = this.q0;
        if (x1Var9 != null) {
            if (z14) {
                Editable N4 = this.P.N4(i19, i21, i20, i22);
                if (N4 == null ? false : f6.h(N4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z11 = true;
                    x1Var9.setSelected(z11);
                }
            }
            z11 = false;
            x1Var9.setSelected(z11);
        }
        x1 x1Var10 = this.s0;
        if (x1Var10 != null) {
            if (z14) {
                Editable N42 = this.P.N4(i19, i21, i20, i22);
                if (N42 == null ? false : f6.g(N42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z10 = true;
                    x1Var10.setSelected(z10);
                }
            }
            z10 = false;
            x1Var10.setSelected(z10);
        }
        if (z14 && i19 == i20) {
            z12 = true;
        }
        v0(z12, this.P.r2());
    }

    public b2(String str) {
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
        this.M0 = new h1(this, 0);
        this.f = str;
    }

    public b2(TL_iv.RichMessage richMessage) {
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
        this.M0 = new h1(this, 0);
        this.b = richMessage;
    }
}
