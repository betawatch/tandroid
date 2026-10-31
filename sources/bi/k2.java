package bi;

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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.qz;
import org.telegram.messenger.sw;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zf;
import org.telegram.ui.kh0;
import org.telegram.ui.kn;
import org.telegram.ui.mk;
import org.telegram.ui.rr0;
import org.telegram.ui.u71;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class k2 extends org.telegram.ui.ActionBar.k2 implements us {
    public vy A0;
    public boolean B0;
    public boolean C0;
    public RectF D;
    public int D0;
    public boolean E;
    public int E0;
    public final int[] F;
    public int F0;
    public int[] G;
    public boolean G0;
    public int[] H;
    public s1 H0;
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
    public v1 N0;
    public b2 O;
    public kh0 O0;
    public d4 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public n1 R0;
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
    public fg b0;
    public int c;
    public ImageView c0;
    public int d;
    public c2 d0;
    public boolean e;
    public LinearLayout e0;
    public final String f;
    public final ArrayList f0;
    public ImageView g0;
    public CharSequence h;
    public u71 h0;
    public LinearLayout i0;
    public e2 j0;
    public int k0;
    public final ArrayList l0;
    public LinearLayout m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public g2 p0;
    public g2 q0;
    public jj r;
    public g2 r0;
    public zg.e s;
    public g2 s0;
    public g2 t0;
    public g2 u0;
    public FrameLayout v0;
    public mk w;
    public ei0 w0;
    public final Rect x;
    public z60 x0;
    public vg.f y;
    public f2 y0;
    public m.p3 z0;

    public k2(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new o1(this, 0);
        this.a = editable;
    }

    public static void Y(k2 k2Var) {
        q3 q3Var = k2Var.P.u3;
        if (q3Var != null && q3Var.x()) {
            k2Var.r0();
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        new z(k2Var.currentAccount, parentActivity, new ag.l(k2Var, 8), k2Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void Z(k2 k2Var) {
        if (d20.i(k2Var.currentAccount).q()) {
            return;
        }
        k2Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) k2Var, 43, true));
    }

    public static boolean a0(k2 k2Var, View view) {
        un unVar = k2Var.J;
        if (unVar != null && k2Var.r == null && !unVar.c() && k2Var.P.n3() && !k2Var.P.p3()) {
            if (!k2Var.P.P3()) {
                k2Var.F0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = k2Var.P.c3();
            if (!c32.isEmpty()) {
                kh0 kh0Var = k2Var.O0;
                if (kh0Var != null) {
                    kh0Var.g(false);
                    k2Var.O0 = null;
                }
                kh0 kh0Var2 = new kh0(k2Var.getParentActivity(), k2Var.getResourceProvider());
                k2Var.O0 = kh0Var2;
                kh0Var2.setOnDismissListener(new ag.x(k2Var, 3));
                long a2 = k2Var.J.a();
                jj jjVar = k2Var.J.D5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                int i10 = 1;
                tL_message.out = true;
                tL_message.peer_id = vp.r1(k2Var.currentAccount).y1(a2);
                tL_message.from_id = vp.r1(k2Var.currentAccount).y1(d20.i(k2Var.currentAccount).e());
                tL_message.flags2 |= TLObject.FLAG_13;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = k2Var.P.E2();
                tL_message.rich_message.documents = k2Var.P.B2();
                if (jjVar != null && !jjVar.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = jjVar.f1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                jj jjVar2 = new jj(k2Var.currentAccount, tL_message, false, false);
                if (jjVar != null && !jjVar.p) {
                    jjVar2.C = jjVar;
                }
                jjVar2.z0 = true;
                jjVar2.R2 = Boolean.TRUE;
                jjVar2.n0(null);
                jjVar2.u1 = true;
                k2Var.O0.p(org.telegram.messenger.m5.j(jjVar2));
                k2Var.y0.setScaleX(1.0f);
                k2Var.y0.setScaleY(1.0f);
                zf q6 = k2Var.O0.q(k2Var.y0, true, new p1(k2Var, 10));
                if (q6 != null) {
                    q6.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), k2Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci))));
                    kh0 kh0Var3 = k2Var.O0;
                    int L = org.telegram.messenger.i0.L(44.0f);
                    kh0Var3.l0 = true;
                    kh0Var3.X = L;
                }
                z60 H = z60.H(k2Var, k2Var.y0);
                boolean B = h20.B(k2Var.J.j());
                if (k2Var.J.L6()) {
                    H.c(R.drawable.msg_calendar2, cd.L0(B ? 2131745531 : 2131745876, null), new e(k2Var, a2, i10), false);
                    if (!B && a2 > 0) {
                        H.c(R.drawable.msg_online, cd.L0(2131745603, null), new o1(k2Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(R.drawable.input_notify_off, cd.L0(2131745600, null), new o1(k2Var, 6), false);
                }
                H.Y();
                k2Var.O0.o(H);
                k2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void b0(final k2 k2Var, Context context, View view) {
        z60 z60Var = k2Var.x0;
        if (z60Var != null) {
            z60Var.u();
            k2Var.x0 = null;
        }
        final int i10 = 0;
        final int i11 = 1;
        boolean z10 = (vp.r1(k2Var.currentAccount).p4() || d20.i(k2Var.currentAccount).q()) ? false : true;
        final a T2 = k2Var.P.T2();
        final z60 I = z60.I(k2Var, view);
        I.Q = true;
        z60 J = I.J();
        J.c(R.drawable.ic_ab_back, cd.L0(2131753756, null), new j(I, i11), false);
        J.k();
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, cd.L0(2131754030, null), new Runnable(k2Var) { // from class: bi.u1
            public final /* synthetic */ k2 b;

            {
                this.b = k2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        final int i12 = 2;
        J.y().a.setTextSize(1, tz.W0 + 2);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, cd.L0(2131754029, null), new Runnable(k2Var) { // from class: bi.u1
            public final /* synthetic */ k2 b;

            {
                this.b = k2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, tz.W0 + 1);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, cd.L0(2131754028, null), new Runnable(k2Var) { // from class: bi.u1
            public final /* synthetic */ k2 b;

            {
                this.b = k2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, tz.W0);
        final int i13 = 3;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, cd.L0(2131754027, null), new Runnable(k2Var) { // from class: bi.u1
            public final /* synthetic */ k2 b;

            {
                this.b = k2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, tz.W0 - 1);
        final int i14 = 4;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, cd.L0(2131754026, null), new Runnable(k2Var) { // from class: bi.u1
            public final /* synthetic */ k2 b;

            {
                this.b = k2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, tz.W0 - 2);
        final int i15 = 5;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, cd.L0(2131754025, null), new Runnable(k2Var) { // from class: bi.u1
            public final /* synthetic */ k2 b;

            {
                this.b = k2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, tz.W0 - 3);
        boolean z11 = T2 != null && d4.F3(T2.b);
        i2 i2Var = new i2(context, R.drawable.iv_h);
        i2Var.a(z10);
        int i16 = org.telegram.ui.ActionBar.t6.G8;
        i2Var.d = i16;
        I.j(z11, 0, i2Var, cd.L0(2131754031, null), new k(I, J, i11));
        I.y().a.setTypeface(org.telegram.messenger.i0.o());
        I.y().setPadding(org.telegram.messenger.i0.L(cd.X ? 18.0f : 9.0f), 0, org.telegram.messenger.i0.L(cd.X ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, cd.L0(2131753988, null), new t1(k2Var, T2, i13));
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, cd.L0(2131753996, null), new t1(k2Var, T2, 4));
        boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
        i2 i2Var2 = new i2(context, R.drawable.iv_pullquote);
        i2Var2.a(z10);
        i2Var2.d = i16;
        I.j(z12, 0, i2Var2, cd.L0(2131753997, null), new t1(k2Var, T2, i10));
        I.y().setPadding(org.telegram.messenger.i0.L(cd.X ? 18.0f : 9.0f), 0, org.telegram.messenger.i0.L(cd.X ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, cd.L0(2131754055, null), new t1(k2Var, T2, i11));
        boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
        i2 i2Var3 = new i2(context, R.drawable.iv_footer);
        i2Var3.a(z10);
        i2Var3.d = i16;
        I.j(z13, 0, i2Var3, cd.L0(2131754032, null), new t1(k2Var, T2, i12));
        I.y().setPadding(org.telegram.messenger.i0.L(cd.X ? 18.0f : 9.0f), 0, org.telegram.messenger.i0.L(cd.X ? 9.0f : 18.0f), 0);
        I.Z();
        k2Var.x0 = I;
    }

    public static void c0(k2 k2Var, jj jjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, jj jjVar2, jj jjVar3, kn knVar, boolean z10, int i10, int i11, sw swVar, long j11) {
        if (jjVar == null) {
            qz.R(org.telegram.messenger.c.a(k2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j10, jjVar2, jjVar3, knVar, z10, i10, i11, swVar, 0L, j11, 0L);
            return;
        }
        org.telegram.messenger.c a2 = org.telegram.messenger.c.a(k2Var.currentAccount);
        un unVar = k2Var.J;
        org.telegram.messenger.r5 r5Var = qz.I;
        if (arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i12 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock != null) {
                richMessage.blocks.add(pageBlock);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i12 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i12);
            i12++;
            qz.j(pageBlock2, identityHashMap);
        }
        qz.C(a2.a).v(jjVar, richMessage, arrayList4, unVar, false);
    }

    public static void d0(k2 k2Var, boolean z10, boolean z11) {
        if (k2Var.J0 == z10 && z11) {
            return;
        }
        k2Var.J0 = z10;
        float f7 = z10 ? 1.15f : 1.0f;
        if (z11) {
            k2Var.w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(gr.h).start();
        } else {
            k2Var.w0.animate().cancel();
            k2Var.w0.setScaleX(f7);
            k2Var.w0.setScaleY(f7);
        }
        a7.t(k2Var.w0, z10 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.G6, k2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        bi0 animatedDrawable = k2Var.w0.getAnimatedDrawable();
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

    public static n1 e0(k2 k2Var) {
        n1 focusedEditTextOrNull = k2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            n1 n1Var = k2Var.R0;
            return n1Var != null ? n1Var : k2Var.P.S2();
        }
        k2Var.R0 = focusedEditTextOrNull;
        k2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int f0(k2 k2Var, n1 n1Var) {
        return (n1Var != k2Var.R0 || k2Var.P.getFocusedEditTextOrNull() == n1Var) ? Math.max(0, n1Var.getSelectionEnd()) : Math.min(k2Var.S0, n1Var.length());
    }

    public static String k0(int i10) {
        if (i10 == 1) {
            return cd.L0(2131754854, null);
        }
        if (i10 == 2) {
            return cd.L0(2131754860, null);
        }
        if (i10 == 4) {
            return cd.L0(2131754855, null);
        }
        if (i10 == 7) {
            return cd.L0(2131754864, null);
        }
        if (i10 != 9) {
            return null;
        }
        return cd.L0(2131754869, null);
    }

    public static String m0(int i10) {
        if (i10 == 1) {
            return cd.L0(2131753671, null);
        }
        if (i10 == 2) {
            return cd.L0(2131749097, null);
        }
        if (i10 == 16) {
            return cd.L0(2131743914, null);
        }
        if (i10 == 8) {
            return cd.L0(2131744463, null);
        }
        if (i10 == 256) {
            return cd.L0(2131745280, null);
        }
        if (i10 == 4) {
            return cd.L0(2131748365, null);
        }
        if (i10 == 65536) {
            return cd.L0(2131749312, null);
        }
        if (i10 == 16384) {
            return cd.L0(2131744451, null);
        }
        if (i10 == 32768) {
            return cd.L0(2131744353, null);
        }
        return null;
    }

    public static void t0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.p6 p6Var) {
        final int i10 = 1;
        final int i11 = 0;
        final org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        k10.N = f7;
        ImageView e = z20.e(context, R.drawable.large_article);
        e.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = a7.N(i12);
        e.setBackground(L2);
        a7.k(e, L2, N, null, p6Var);
        f7.addView(e, w7.b6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(cd.L0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        a7.V(textView, i13, p6Var);
        TextView f10 = z20.f(f7, textView, w7.b6.t(-1, -2, 49, 25, 16, 25, 0), context);
        f10.setText(org.telegram.messenger.i0.W2(cd.L0(2131754042, null)));
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        a7.V(f10, i13, p6Var);
        f7.addView(f10, w7.b6.t(-1, -2, 49, 25, 11, 25, 0));
        vh.d i14 = z20.i(24, context, p6Var, true);
        i14.setText(cd.L0(2131754043, null));
        f7.addView(i14, w7.b6.t(-1, 48, 49, 14, 31, 14, 0));
        vh.d i15 = z20.i(24, context, p6Var, false);
        i15.setText(cd.L0(2131754044, null));
        f7.addView(i15, w7.b6.t(-1, 48, 49, 14, 2, 14, 6));
        k10.show();
        i14.setOnClickListener(new View.OnClickListener() { // from class: bi.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k10.dismiss();
                        runnable2.run();
                        break;
                    default:
                        k10.dismiss();
                        runnable2.run();
                        break;
                }
            }
        });
        i15.setOnClickListener(new View.OnClickListener() { // from class: bi.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k10.dismiss();
                        runnable.run();
                        break;
                    default:
                        k10.dismiss();
                        runnable.run();
                        break;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        a T2;
        int i10;
        int size;
        int i11;
        k9 textSelectionHelper = this.P.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = this.P.T2();
        } else {
            int i12 = textSelectionHelper.p0;
            T2 = i12 == textSelectionHelper.s0 ? this.P.B4(i12) : null;
        }
        if (this.P.U2() == null) {
            if (T2 != null) {
                if (!T2.a() && !T2.b() && !T2.c()) {
                    TL_iv.PageBlock pageBlock = T2.b;
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
                                g2 g2Var = (g2) obj;
                                int intValue = ((Integer) g2Var.getTag()).intValue();
                                g2Var.setSelected(i10 == intValue);
                                if (i10 == intValue) {
                                    g2Var.setEnabled(true);
                                    if (T2 == null) {
                                        g2Var.a();
                                    } else if (i10 == 1) {
                                        TL_iv.PageBlock pageBlock2 = T2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            g2Var.e(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            g2Var.e(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            g2Var.e(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            g2Var.e(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            g2Var.e(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            g2Var.e(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            g2Var.e(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            g2Var.e(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            g2Var.e(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            g2Var.e(R.drawable.iv_footer);
                                        } else {
                                            g2Var.a();
                                        }
                                    } else if (i10 == 2) {
                                        if (T2.a()) {
                                            g2Var.e(R.drawable.iv_todo);
                                        } else if (T2.c()) {
                                            g2Var.e(R.drawable.iv_ordered_list);
                                        } else {
                                            g2Var.a();
                                        }
                                    } else if (i10 == 8) {
                                        g2Var.e(R.drawable.iv_details);
                                    } else {
                                        g2Var.a();
                                    }
                                } else {
                                    g2Var.setEnabled(i10 != 4);
                                    g2Var.a();
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

    public final void B0(int i10, boolean z10) {
        if (this.K0 == i10) {
            return;
        }
        this.K0 = i10;
        if (z10) {
            this.a0.setVisibility(0);
            ViewPropertyAnimator duration = this.a0.animate().alpha(this.K0 == 0 ? 1.0f : 0.0f).scaleX(this.K0 == 0 ? 1.0f : 0.8f).scaleY(this.K0 == 0 ? 1.0f : 0.8f).translationY(this.K0 == 0 ? 0.0f : org.telegram.messenger.i0.L(30.0f)).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new o1(this, 1)).start();
            this.h0.setVisibility(0);
            this.h0.animate().alpha(this.K0 == 1 ? 1.0f : 0.0f).scaleX(this.K0 == 1 ? 1.0f : 0.8f).scaleY(this.K0 == 1 ? 1.0f : 0.8f).translationY(this.K0 == 1 ? 0.0f : org.telegram.messenger.i0.L(30.0f)).setDuration(420L).setInterpolator(grVar).withEndAction(new o1(this, 2)).start();
            this.v0.setVisibility(0);
            this.v0.animate().alpha(this.K0 == 2 ? 1.0f : 0.0f).scaleX(this.K0 == 2 ? 1.0f : 0.8f).scaleY(this.K0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(grVar).withEndAction(new o1(this, 3)).start();
            return;
        }
        this.a0.setVisibility(i10 == 0 ? 0 : 8);
        this.a0.setAlpha(i10 == 0 ? 1.0f : 0.0f);
        this.a0.setScaleX(i10 == 0 ? 1.0f : 0.8f);
        this.a0.setScaleY(i10 == 0 ? 1.0f : 0.8f);
        this.a0.setTranslationY(i10 == 0 ? 0.0f : org.telegram.messenger.i0.L(30.0f));
        this.h0.setVisibility(i10 == 1 ? 0 : 8);
        this.h0.setAlpha(i10 == 1 ? 1.0f : 0.0f);
        this.h0.setScaleX(i10 == 1 ? 1.0f : 0.8f);
        this.h0.setScaleY(i10 == 1 ? 1.0f : 0.8f);
        this.h0.setTranslationY(i10 == 1 ? 0.0f : org.telegram.messenger.i0.L(30.0f));
        this.v0.setVisibility(i10 != 2 ? 8 : 0);
        this.v0.setAlpha(i10 == 2 ? 1.0f : 0.0f);
        this.v0.setScaleX(i10 == 2 ? 1.0f : 0.8f);
        this.v0.setScaleY(i10 == 2 ? 1.0f : 0.8f);
    }

    public final void C0() {
        boolean z10;
        boolean z11;
        k9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.l0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        g2 g2Var = this.u0;
        boolean z12 = false;
        if (g2Var != null) {
            d4 d4Var = this.P;
            int[] E4 = d4Var.E4();
            g2Var.setSelected(E4 != null && d4Var.K3(E4[0], E4[1]));
        }
        if (this.P.O3()) {
            k9 textSelectionHelper2 = this.P.getTextSelectionHelper();
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
                g2 g2Var2 = (g2) obj;
                g2Var2.setSelected(this.P.N3(((Integer) g2Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
            }
            boolean z13 = i11 == i12;
            n1 Q4 = z13 ? this.P.Q4(i10, i11) : null;
            int max = Math.max(0, Math.min(i13, i14));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i13, i14), Q4.length()));
            g2 g2Var3 = this.q0;
            if (g2Var3 != null) {
                g2Var3.setSelected(Q4 != null && max < max2 && s6.h(Q4.getText(), max, max2));
            }
            g2 g2Var4 = this.s0;
            if (g2Var4 != null) {
                if (Q4 != null && max < max2 && s6.g(Q4.getText(), max, max2)) {
                    z12 = true;
                }
                g2Var4.setSelected(z12);
            }
            x0(true);
            y0(z13, this.P.o2());
            return;
        }
        if (this.P.z3()) {
            k9 textSelectionHelper3 = this.P.getTextSelectionHelper();
            n1 v22 = this.P.v2(textSelectionHelper3.p0);
            int i16 = textSelectionHelper3.r0;
            int i17 = textSelectionHelper3.u0;
            int max3 = v22 == null ? 0 : Math.max(0, Math.min(Math.min(i16, i17), v22.length()));
            int max4 = v22 == null ? 0 : Math.max(0, Math.min(Math.max(i16, i17), v22.length()));
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                g2 g2Var5 = (g2) obj2;
                g2Var5.setSelected((v22 == null || max3 >= max4 || (((Integer) g2Var5.getTag()).intValue() & v22.c(max3, max4)) == 0) ? false : true);
            }
            g2 g2Var6 = this.q0;
            if (g2Var6 != null) {
                g2Var6.setSelected(v22 != null && max3 < max4 && s6.h(v22.getText(), max3, max4));
            }
            g2 g2Var7 = this.s0;
            if (g2Var7 != null) {
                if (v22 != null && max3 < max4 && s6.g(v22.getText(), max3, max4)) {
                    z12 = true;
                }
                g2Var7.setSelected(z12);
            }
            x0(true);
            y0(true, this.P.o2());
            return;
        }
        int i19 = textSelectionHelper.p0;
        int i20 = textSelectionHelper.s0;
        int i21 = textSelectionHelper.r0;
        int i22 = textSelectionHelper.u0;
        boolean z14 = i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.w4.size();
        int size3 = arrayList.size();
        int i23 = 0;
        while (i23 < size3) {
            int i24 = i23 + 1;
            g2 g2Var8 = (g2) arrayList.get(i23);
            g2Var8.setSelected(z14 && this.P.M3(((Integer) g2Var8.getTag()).intValue(), i19, i21, i20, i22));
            i23 = i24;
        }
        x0(!this.P.L3());
        g2 g2Var9 = this.q0;
        if (g2Var9 != null) {
            if (z14) {
                Editable K4 = this.P.K4(i19, i21, i20, i22);
                if (K4 == null ? false : s6.h(K4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z11 = true;
                    g2Var9.setSelected(z11);
                }
            }
            z11 = false;
            g2Var9.setSelected(z11);
        }
        g2 g2Var10 = this.s0;
        if (g2Var10 != null) {
            if (z14) {
                Editable K42 = this.P.K4(i19, i21, i20, i22);
                if (K42 == null ? false : s6.g(K42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z10 = true;
                    g2Var10.setSelected(z10);
                }
            }
            z10 = false;
            g2Var10.setSelected(z10);
        }
        if (z14 && i19 == i20) {
            z12 = true;
        }
        y0(z12, this.P.o2());
    }

    public final void D0() {
        boolean u22 = this.P.u2();
        o2 o2Var = this.P.Q3;
        boolean z10 = (o2Var == null || o2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setEnabled(u22);
            this.V.setAlpha(u22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            this.W.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void E0() {
        int i10 = 0;
        boolean z10 = (vp.r1(this.currentAccount).p4() || d20.i(this.currentAccount).q()) ? false : true;
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g2) obj).setPremiumLocked(z10);
        }
    }

    public final void F0() {
        if (this.y0 == null) {
            return;
        }
        boolean P3 = this.P.P3();
        this.y0.setEnabled(P3);
        z20.l(this.y0.animate(), P3 ? 1.0f : 0.5f, 150L);
    }

    public final void G0() {
        f2 f2Var = this.y0;
        if (f2Var == null) {
            return;
        }
        f2Var.setLocked(q0());
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new b2(this, context);
        int i11 = 1;
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
        this.F0 = vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
        s1 s1Var = new s1(this, i10);
        this.H0 = s1Var;
        this.O.r.add(s1Var);
        d4 d4Var = new d4(context, this.currentAccount, getResourceProvider(), new a6.i(this, 10));
        this.P = d4Var;
        d4Var.setFileRefParentObject(this.r);
        this.O.addView(this.P, w7.b6.e(-1, -1, zs.E1));
        this.O.addView(this.P.getOverlayView(), w7.b6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            d4 d4Var2 = this.P;
            ArrayList arrayList2 = d4Var2.s3;
            d4Var2.r3 = richMessage;
            d4.Z2(arrayList2, richMessage.blocks, d4Var2.t3);
            d4Var2.Y3();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                d4Var2.y4((a) arrayList2.get(i12));
            }
            d4Var2.f3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                d4 d4Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = d4Var3.t3;
                ArrayList arrayList3 = d4Var3.s3;
                if (!TextUtils.isEmpty(charSequence)) {
                    d4.Z2(arrayList3, n5.b(charSequence), hashMap);
                }
                arrayList3.addAll(d4Var3.z4(l4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    d4.Z2(arrayList3, n5.b(charSequence2), hashMap);
                }
                d4Var3.Y3();
                d4Var3.f3.O(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        o2 o2Var = this.P.Q3;
        if (o2Var != null) {
            o2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.t6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i13), org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i13))}));
        this.O.addView(this.Q, w7.b6.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i13)), getThemedColor(i13)}));
        this.O.addView(this.R, w7.b6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, w7.b6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i13);
        int themedColor2 = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.t6.i6;
        imageView3.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(themedColor, org.telegram.ui.ActionBar.t6.w(themedColor2, getThemedColor(i14)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
        ImageView imageView4 = this.T;
        int i15 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView4, i15, resourceProvider, mode);
        w7.e6.a(this.T);
        this.T.setContentDescription(cd.L0(2131754878, null));
        this.T.setOnClickListener(new p1(this, i11));
        this.S.addView(this.T, w7.b6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i13))));
        this.S.addView(this.U, w7.b6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        a7.R(this.V, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i14), 1, -1), null, a7.N(i14), getResourceProvider());
        a7.t(this.V, i15, getResourceProvider(), mode);
        w7.e6.a(this.V);
        this.V.setContentDescription(cd.L0(2131743912, null));
        this.V.setOnClickListener(new p1(this, 2));
        this.U.addView(this.V, w7.b6.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        a7.R(this.W, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i14), 1, -1), null, a7.N(i14), getResourceProvider());
        a7.t(this.W, i15, getResourceProvider(), mode);
        w7.e6.a(this.W);
        this.W.setContentDescription(cd.L0(2131746357, null));
        this.W.setOnClickListener(new p1(this, 3));
        this.U.addView(this.W, w7.b6.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, w7.b6.e(-1, zs.q2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, w7.b6.e(-1, zs.q2, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.a0.setClipChildren(false);
        this.a0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.Z.addView(this.a0, w7.b6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        this.c0.setScaleType(scaleType);
        a7.t(this.c0, i15, getResourceProvider(), mode);
        this.c0.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(getThemedColor(i13), org.telegram.ui.ActionBar.t6.w(getThemedColor(i13), getThemedColor(i14)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
        this.a0.addView(this.c0, w7.b6.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.e6.a(this.c0);
        this.c0.setContentDescription(cd.L0(2131755006, null));
        this.c0.setOnClickListener(new p1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i13))));
        frameLayout5.addView(frameLayout6, w7.b6.e(-2, 44, 81));
        c2 c2Var = new c2(context, 0);
        this.d0 = c2Var;
        c2Var.setClipToOutline(true);
        this.d0.setOutlineProvider(new d2(i10));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.e0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.e0.setOrientation(0);
        this.d0.addView(this.e0);
        frameLayout6.addView(this.d0, w7.b6.c(-1.0f, -1));
        fg fgVar = new fg(context, 24);
        this.b0 = fgVar;
        fgVar.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        a7.t(this.b0, i15, getResourceProvider(), mode);
        a7.R(this.b0, org.telegram.ui.ActionBar.t6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f)), a7.N(i13), a7.N(i14), getResourceProvider());
        this.b0.j(dg.e, false);
        this.e0.addView(this.b0, w7.b6.r(38, 38, 16));
        w7.e6.a(this.b0);
        this.b0.setContentDescription(cd.L0(2131754884, null));
        this.b0.setOnClickListener(new p1(this, 5));
        g0(R.drawable.iv_text, 1, false).setOnClickListener(new ag.t0(3, this, context));
        g0(R.drawable.iv_lists, 2, true).setOnClickListener(new p1(this, 6));
        g0(R.drawable.iv_table, 4, true).setOnClickListener(new p1(this, 7));
        g0(R.drawable.iv_math, 7, true).setOnClickListener(new p1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.g0.setScaleType(scaleType);
        a7.t(this.g0, i15, getResourceProvider(), mode);
        a7.R(this.g0, org.telegram.ui.ActionBar.t6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f)), a7.N(i13), a7.N(i14), getResourceProvider());
        this.e0.addView(this.g0, w7.b6.t(38, 38, 16, 2, 0, 0, 0));
        w7.e6.a(this.g0);
        this.g0.setContentDescription(cd.L0(2131754921, null));
        this.g0.setOnClickListener(new p1(this, 9));
        this.a0.addView(frameLayout5, w7.b6.l(1.0f, 0, 44));
        u71 u71Var = new u71(this, context, 1);
        this.h0 = u71Var;
        u71Var.setOrientation(0);
        this.h0.setClipToPadding(false);
        this.h0.setClipChildren(false);
        this.h0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.Y.addView(this.h0, w7.b6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.v0.setClipToPadding(false);
        this.v0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.Y.addView(this.v0, w7.b6.e(80, 60, 81));
        ei0 ei0Var = new ei0(context);
        this.w0 = ei0Var;
        ei0Var.f(R.raw.group_pip_delete_icon, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), null);
        bi0 animatedDrawable = this.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.w0.setScaleType(scaleType);
        a7.t(this.w0, i15, getResourceProvider(), mode);
        this.w0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i13))));
        this.v0.addView(this.w0, w7.b6.e(-1, -1, zs.E1));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i13))));
        this.h0.addView(frameLayout8, w7.b6.c(44.0f, -2));
        e2 e2Var = new e2(this, context);
        this.j0 = e2Var;
        e2Var.setHorizontalScrollBarEnabled(false);
        this.j0.setClipToOutline(true);
        this.j0.setOutlineProvider(new d2(i11));
        frameLayout8.addView(this.j0, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.i0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.j0.addView(this.i0, new FrameLayout.LayoutParams(-2, -1));
        h0(context, R.drawable.formatting_bold, 1, false);
        h0(context, R.drawable.formatting_italic, 2, false);
        h0(context, R.drawable.formatting_underline, 16, false);
        h0(context, R.drawable.formatting_strikethrough, 8, false);
        h0(context, R.drawable.formatting_spoiler, 256, false);
        h0(context, R.drawable.iv_code, 4, false);
        h0(context, R.drawable.formatting_marked, 65536, true);
        h0(context, R.drawable.iv_sub, TLObject.FLAG_14, true);
        h0(context, R.drawable.iv_super, 32768, true);
        g2 g2Var = new g2(R.drawable.iv_quote, context, getResourceProvider());
        this.u0 = g2Var;
        g2Var.setContentDescription(cd.L0(2131746455, null));
        this.u0.setOnClickListener(new p1(this, 11));
        LinearLayout linearLayout5 = this.i0;
        linearLayout5.addView(this.u0, w7.b6.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        g2 g2Var2 = new g2(R.drawable.iv_button, context, getResourceProvider());
        this.r0 = g2Var2;
        g2Var2.setContentDescription(cd.L0(2131746028, null));
        this.r0.setOnClickListener(new p1(this, 12));
        LinearLayout linearLayout6 = this.i0;
        linearLayout6.addView(this.r0, w7.b6.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.n0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.n0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i13))));
        this.h0.addView(this.n0, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var3 = new g2(R.drawable.media_link_24, context, getResourceProvider());
        this.q0 = g2Var3;
        g2Var3.setContentDescription(cd.L0(2131751745, null));
        this.q0.setOnClickListener(new p1(this, 13));
        this.n0.addView(this.q0, w7.b6.r(38, 38, 16));
        g2 g2Var4 = new g2(R.drawable.msg_calendar2, context, getResourceProvider());
        this.s0 = g2Var4;
        g2Var4.setContentDescription(cd.L0(2131754862, null));
        this.s0.setOnClickListener(new p1(this, 14));
        this.n0.addView(this.s0, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.o0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.o0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i13))));
        this.h0.addView(this.o0, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var5 = new g2(R.drawable.iv_math, context, getResourceProvider());
        this.t0 = g2Var5;
        g2Var5.d();
        arrayList.add(this.t0);
        this.t0.setContentDescription(cd.L0(2131754864, null));
        this.t0.setOnClickListener(new p1(this, 15));
        this.o0.addView(this.t0, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.m0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i13))));
        this.h0.addView(this.m0, 0, w7.b6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        g2 g2Var6 = new g2(0, context, getResourceProvider());
        this.p0 = g2Var6;
        g2Var6.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        this.p0.setContentDescription(cd.L0(2131755006, null));
        this.p0.setOnClickListener(new p1(this, 16));
        this.m0.addView(this.p0, w7.b6.r(38, 38, 16));
        f2 f2Var = new f2(this, context, this.r != null ? R.drawable.input_done : p0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider());
        this.y0 = f2Var;
        f2Var.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(org.telegram.ui.ActionBar.t6.Me))));
        w7.e6.a(this.y0);
        this.a0.addView(this.y0, w7.b6.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.y0.setContentDescription(cd.L0(2131745657, null));
        this.y0.setOnClickListener(new p1(this, i10));
        this.y0.setOnLongClickListener(new h1(this, i11));
        G0();
        this.O.setPadding(0, org.telegram.messenger.i0.m, 0, 0);
        l0();
        B0(0, false);
        D0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new l(this, i11));
        E0();
        if (this.e) {
            this.P.F2();
            this.e = false;
        }
        b2 b2Var = this.O;
        this.fragmentView = b2Var;
        return b2Var;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f5) {
            G0();
            E0();
        }
    }

    public final g2 g0(int i10, int i11, boolean z10) {
        g2 g2Var = new g2(i10, this.e0.getContext(), getResourceProvider());
        if (z10) {
            g2Var.d();
            this.N.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(k0(i11));
        this.f0.add(g2Var);
        LinearLayout linearLayout = this.e0;
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return g2Var;
    }

    public final void h0(Context context, int i10, int i11, boolean z10) {
        g2 g2Var = new g2(i10, context, getResourceProvider());
        if (z10) {
            g2Var.d();
            this.N.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(m0(i11));
        g2Var.setOnClickListener(new bh.f(this, i11, 2));
        this.l0.add(g2Var);
        LinearLayout linearLayout = this.i0;
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(boolean z10) {
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, z10 ? 1.0f : 0.0f);
        this.P0 = ofFloat;
        ofFloat.addUpdateListener(new q1(this, 0));
        this.P0.setInterpolator(gr.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        d4 d4Var = this.P;
        if (d4Var == null || !d4Var.u3.x()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        FrameLayout.LayoutParams layoutParams;
        vy vyVar = this.A0;
        if (vyVar == null || (layoutParams = (FrameLayout.LayoutParams) vyVar.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.O == null ? n0() : Math.max(n0(), ((r2.getMeasuredHeight() - this.O.getPaddingTop()) - org.telegram.messenger.i0.L(240.0f)) - this.T0)) - r1) * this.Q0) + n0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.A0.setLayoutParams(layoutParams);
        }
    }

    public final void l0() {
        FrameLayout.LayoutParams layoutParams;
        vy vyVar = this.A0;
        if (vyVar != null && (layoutParams = (FrameLayout.LayoutParams) vyVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.T0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.A0.setLayoutParams(layoutParams);
            }
        }
        j0();
        int max = Math.max(Math.max(this.D0, this.T0), this.U0);
        this.P.setPadding(0, org.telegram.messenger.i0.L(60.0f), 0, org.telegram.messenger.i0.L(110.0f) + max);
        d4 d4Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        d4Var.V3 = i12;
        d4Var.W3 = i13;
        d4Var.X3 = i14;
        this.Y.setTranslationY(-max);
        this.R.setTranslationY(r0 + this.T0);
    }

    public final int n0() {
        Point point = org.telegram.messenger.i0.q;
        int i10 = point.x > point.y ? this.F0 : this.E0;
        return i10 <= 0 ? org.telegram.messenger.i0.L(200.0f) : i10;
    }

    public final void o0(boolean z10) {
        if (this.C0) {
            this.C0 = false;
            vy vyVar = this.A0;
            if (vyVar != null) {
                vyVar.t(false);
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
        vy vyVar2 = this.A0;
        if (vyVar2 != null) {
            vyVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            l0();
        }
        fg fgVar = this.b0;
        if (fgVar != null) {
            fgVar.j(dg.e, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 != -1 || i10 != 21) {
            if (i11 != -1 || (i10 != 1 && i10 != 14)) {
                super.onActivityResultFragment(i10, i11, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.P.h2(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        d4 d4Var = this.P;
        Uri data = intent.getData();
        if (data == null) {
            d4Var.getClass();
        } else {
            if (d4Var.getContext() == null) {
                return;
            }
            Utilities.e.c(new a1.f(19, d4Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.C0;
        if (z11) {
            if (z11) {
                this.C0 = false;
                vy vyVar = this.A0;
                if (vyVar != null) {
                    vyVar.t(false);
                    this.A0.B();
                }
                i0(false);
                return false;
            }
        } else {
            if (this.B0) {
                o0(true);
                return false;
            }
            if (!this.P.I2()) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        int i10 = 1;
        if (!z10 && !this.V0) {
            u0();
            this.V0 = true;
        }
        if (org.telegram.messenger.i0.Q1() || this.s == null || this.w == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        zg.e eVar = this.s;
        this.y = eVar.f;
        eVar.e = false;
        eVar.invalidate();
        this.w.setAlpha(0.0f);
        int i11 = 4;
        this.w.A1.setVisibility(4);
        z0();
        float f7 = z10 ? 0.0f : 1.0f;
        this.I = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
        this.E = true;
        this.O.invalidate();
        ofFloat.addUpdateListener(new q1(this, i10));
        ofFloat.addListener(new bg.f(2, this, runnable));
        if (z10) {
            FrameLayout frameLayout = this.S;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.S;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -org.telegram.messenger.i0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property2, org.telegram.messenger.i0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<d4, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.S;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.S;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -org.telegram.messenger.i0.L(16.0f)), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property4, org.telegram.messenger.i0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<d4, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(gr.h);
        this.O.post(new rr0(animatorSet, i11));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        zs.f(this.currentAccount).c(this, zs.f5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        s1 s1Var;
        zs.f(this.currentAccount).n(this, zs.f5);
        if (!this.V0) {
            u0();
            this.V0 = true;
        }
        v1 v1Var = this.N0;
        if (v1Var != null) {
            this.N0 = null;
            org.telegram.messenger.i0.g3(v1Var);
        }
        kh0 kh0Var = this.O0;
        if (kh0Var != null) {
            kh0Var.h();
            this.O0 = null;
        }
        d4 d4Var = this.P;
        if (d4Var != null) {
            d4Var.J2();
        }
        m.p3 p3Var = this.z0;
        if (p3Var != null) {
            p3Var.a();
        }
        super.onFragmentDestroy();
        vy vyVar = this.A0;
        if (vyVar != null) {
            vyVar.C();
        }
        b2 b2Var = this.O;
        if (b2Var == null || (s1Var = this.H0) == null) {
            return;
        }
        b2Var.r.remove(s1Var);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = org.telegram.messenger.i0.L(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        l0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final r0.j1 onInsetsInternal(View view, r0.j1 j1Var) {
        z60 z60Var;
        i0.c f7 = j1Var.a.f(3);
        int i10 = j1Var.a.f(8).d;
        this.U0 = i10;
        int i11 = i10 - f7.d;
        boolean z10 = this.G0;
        boolean z11 = i11 > org.telegram.messenger.i0.L(20.0f);
        this.G0 = z11;
        if (z11 && i11 > org.telegram.messenger.i0.L(50.0f) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                this.F0 = i11;
                vp.c1().edit().putInt("kbd_height_land3", this.F0).commit();
            } else {
                this.E0 = i11;
                vp.c1().edit().putInt("kbd_height", this.E0).commit();
            }
        }
        if (this.G0 && !z10 && this.B0 && !this.C0) {
            o0(false);
        }
        if (!this.G0 && z10 && (z60Var = this.x0) != null) {
            z60Var.u();
            this.x0 = null;
        }
        onInsets(f7.a, f7.b, f7.c, f7.d);
        return r0.j1.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i10 = org.telegram.ui.ActionBar.t6.d6;
            int themedColor = getThemedColor(i10);
            int i11 = org.telegram.ui.ActionBar.t6.i6;
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.t6.Me;
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
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i10), org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i10))}));
            }
            View view2 = this.R;
            if (view2 != null) {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10)}));
            }
            ImageView imageView = this.T;
            if (imageView != null) {
                imageView.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(getThemedColor(i10), org.telegram.ui.ActionBar.t6.w(getThemedColor(i10), getThemedColor(i11)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
            }
            LinearLayout linearLayout = this.U;
            if (linearLayout != null) {
                linearLayout.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
            }
            ImageView imageView2 = this.c0;
            if (imageView2 != null) {
                imageView2.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(getThemedColor(i10), org.telegram.ui.ActionBar.t6.w(getThemedColor(i10), getThemedColor(i11)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
            }
            ei0 ei0Var = this.w0;
            if (ei0Var != null) {
                ei0Var.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
            }
            LinearLayout linearLayout2 = this.n0;
            if (linearLayout2 != null) {
                linearLayout2.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
            }
            LinearLayout linearLayout3 = this.o0;
            if (linearLayout3 != null) {
                linearLayout3.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
            }
            LinearLayout linearLayout4 = this.m0;
            if (linearLayout4 != null) {
                linearLayout4.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
            }
            f2 f2Var = this.y0;
            if (f2Var != null) {
                f2Var.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i12))));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        d4 d4Var;
        int i10;
        d4 d4Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.c) >= 0 && (d4Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.c = -1;
            if (d4Var2.b2(i10, i11)) {
                return;
            }
            d4Var2.post(new w2(d4Var2, i10, i11, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.b == null && this.f == null) || (d4Var = this.P) == null || d4Var.d3()) {
            return;
        }
        d4Var.post(new b(d4Var, 5));
    }

    public final boolean p0() {
        un unVar;
        return this.r == null && (unVar = this.J) != null && unVar.c();
    }

    public final boolean q0() {
        if (vp.r1(this.currentAccount).p4() || d20.i(this.currentAccount).q()) {
            return false;
        }
        d4 d4Var = this.P;
        return n5.d(d4Var.s3, d4Var.t3);
    }

    public final void r0() {
        u3 k22 = this.P.k2();
        if (k22 == null) {
            return;
        }
        TL_iv.RichMessage a2 = k22.a();
        if (a2.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(getParentActivity(), getResourceProvider());
        g0Var.s1(a2);
        g0Var.c2 = new ag.l(k22, 6);
        g0Var.show();
    }

    public final void s0(int i10, int i11) {
        d4 d4Var = this.P;
        d4Var.j4 = d4Var.T2();
        bi biVar = new bi(getParentActivity(), this, false, false, true, getResourceProvider());
        biVar.T3 = new y1(this, biVar);
        biVar.a2.setIncludeVideosInGallery(true);
        biVar.a2.g0();
        biVar.x1(1, true);
        biVar.U0(i10);
        biVar.q4 = new x1(this, biVar);
        biVar.P1 = new x1(this, biVar);
        biVar.O1 = new z1(this, biVar);
        biVar.d1();
        if (i11 != 0) {
            biVar.n1(i11);
        }
        biVar.A0(true);
        biVar.show();
    }

    public final boolean u0() {
        Runnable runnable;
        if (this.J == null || this.r != null || !this.P.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = this.M ? null : this.P.m2();
        if (m22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        mk mkVar = this.J.Z;
        if (m22 != null && !this.M) {
            d4 d4Var = this.P;
            if (d4Var.n3() && !n5.d(d4Var.s3, d4Var.t3) && mkVar != null) {
                SpannableStringBuilder g10 = n5.g(this.P.s3);
                un unVar = mkVar.P2;
                if (mkVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                org.telegram.messenger.k6.m(spannableStringBuilder, mkVar.E0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.o5.class);
                if (o5VarArr != null) {
                    for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                        o5Var.applyFontMetrics(mkVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.f5.f());
                    }
                }
                wh0.a(spannableStringBuilder);
                if (unVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    ui.b0(mkVar.Q).Q1(unVar.a(), unVar.J7(unVar.D5), charSequenceArr[0], ui.b0(mkVar.Q).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                mkVar.setRichDraftPreview(null);
                if (mkVar.E0.getText() != null) {
                    mkVar.E0.getText().clear();
                }
                mkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        ui mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        un unVar2 = this.J;
        mediaDataController.Q1(a2, unVar2.J7(unVar2.D5), "", null, null, null, null, 0L, false, false, m22);
        TL_iv.RichMessage richMessage = m22;
        if (mkVar == null) {
            return true;
        }
        mkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void v0() {
        if (q0()) {
            Activity parentActivity = getParentActivity();
            d4 d4Var = this.P;
            Objects.requireNonNull(d4Var);
            t0(parentActivity, new b(d4Var, 0), new o1(this, 4), getResourceProvider());
            return;
        }
        if (p0()) {
            org.telegram.ui.Components.s4.L(getParentActivity(), this.J.a(), new k6.h(this, 11), getResourceProvider());
        } else {
            w0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [bi.v1] */
    public final void w0(final int i10, final int i11, final boolean z10) {
        mk mkVar;
        sf sfVar;
        if (q0()) {
            Activity parentActivity = getParentActivity();
            d4 d4Var = this.P;
            Objects.requireNonNull(d4Var);
            t0(parentActivity, new b(d4Var, 0), new o1(this, 4), getResourceProvider());
            return;
        }
        if (this.J == null || !this.P.n3() || this.P.p3()) {
            return;
        }
        if (!this.P.P3()) {
            F0();
            return;
        }
        if (!vp.r1(this.currentAccount).p4()) {
            mk mkVar2 = this.J.Z;
            if (mkVar2 == null) {
                return;
            }
            this.M = true;
            Runnable runnable = this.K;
            if (runnable != null) {
                runnable.run();
            }
            mkVar2.P0(n5.g(this.P.s3), z10, i10, i11);
            finishFragment();
            return;
        }
        this.M = true;
        final ArrayList c32 = this.P.c3();
        if (c32.isEmpty()) {
            return;
        }
        final ArrayList E2 = this.P.E2();
        final ArrayList B2 = this.P.B2();
        final ArrayList a2 = m5.a(this.currentAccount, c32);
        final long a10 = this.J.a();
        un unVar = this.J;
        final jj jjVar = unVar.D5;
        final jj jjVar2 = unVar.l4;
        final kn knVar = unVar.B5;
        final long a92 = unVar.a9();
        final sw P8 = this.J.P8();
        final jj jjVar3 = this.r;
        ?? r02 = new Runnable() { // from class: bi.v1
            @Override // java.lang.Runnable
            public final void run() {
                k2.c0(k2.this, jjVar3, c32, E2, B2, a2, a10, jjVar, jjVar2, knVar, z10, i10, i11, P8, a92);
            }
        };
        Runnable runnable2 = this.K;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (jjVar3 == null && (mkVar = this.J.Z) != null && (sfVar = mkVar.Z2) != null) {
            sfVar.E(null, z10, i10, i11, 0L);
        }
        if (i10 == 0 || jjVar3 != null) {
            r02.run();
            finishFragment();
        } else {
            this.N0 = r02;
            finishFragment();
        }
    }

    public final void x0(boolean z10) {
        ArrayList arrayList = this.l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g2 g2Var = (g2) obj;
            if (((Integer) g2Var.getTag()).intValue() == 1) {
                g2Var.setEnabled(z10);
            }
        }
    }

    public final void y0(boolean z10, boolean z11) {
        g2 g2Var = this.q0;
        if (g2Var != null) {
            g2Var.setEnabled(z10);
        }
        g2 g2Var2 = this.r0;
        if (g2Var2 != null) {
            g2Var2.setEnabled(z11);
        }
        g2 g2Var3 = this.s0;
        if (g2Var3 != null) {
            g2Var3.setEnabled(z10);
        }
        g2 g2Var4 = this.t0;
        if (g2Var4 != null) {
            g2Var4.setEnabled(z10);
        }
    }

    public final void z0() {
        this.s.getLocationInWindow(this.F);
        if (this.D == null) {
            this.D = new RectF();
        }
        RectF rectF = new RectF(this.y.getBounds());
        this.D = rectF;
        rectF.offset(r1[0], r1[1]);
        if (this.G == null) {
            this.G = new int[2];
        }
        this.w.getLocationInWindow(this.G);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.H[0] = this.P.getPaddingLeft();
        this.H[1] = this.P.getPaddingTop();
        this.H[0] = (int) (r0[0] - (this.w.E0.getX() - org.telegram.messenger.i0.L(16.0f)));
    }

    public k2(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new o1(this, 0);
        this.f = str;
    }

    public k2(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new o1(this, 0);
        this.b = richMessage;
    }
}
