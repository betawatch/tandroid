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
import bi.eb;
import c8.ha;
import c8.ka;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gz;
import org.telegram.messenger.hw;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.c61;
import org.telegram.ui.gq0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class b2 extends org.telegram.ui.ActionBar.f2 implements ls {
    public hy A0;
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
    public hi.z1 H0;
    public float I;
    public int I0;
    public an J;
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
    public bg0 O0;
    public t3 P;
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
    public jg b0;
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
    public c61 h0;
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
    public ij r;
    public x1 r0;
    public jh.f s;
    public x1 s0;
    public x1 t0;
    public x1 u0;
    public FrameLayout v0;
    public qj w;
    public ch0 w0;
    public final Rect x;
    public k60 x0;
    public fh.g y;
    public w1 y0;
    public ga.d z0;

    public b2(Editable editable) {
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
        this.M0 = new h1(this, 0);
        this.a = editable;
    }

    public static void Z(b2 b2Var) {
        g3 g3Var = b2Var.P.u3;
        if (g3Var != null && g3Var.x()) {
            b2Var.s0();
            return;
        }
        Activity parentActivity = b2Var.getParentActivity();
        new v(b2Var.currentAccount, parentActivity, new ii.c(b2Var, 11), b2Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void a0(b2 b2Var) {
        if (p10.i(b2Var.currentAccount).q()) {
            return;
        }
        b2Var.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) b2Var, 43, true));
    }

    public static boolean b0(b2 b2Var, View view) {
        an anVar = b2Var.J;
        if (anVar != null && b2Var.r == null && !anVar.c() && b2Var.P.n3() && !b2Var.P.p3()) {
            if (!b2Var.P.P3()) {
                b2Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = b2Var.P.c3();
            if (!c32.isEmpty()) {
                bg0 bg0Var = b2Var.O0;
                if (bg0Var != null) {
                    bg0Var.g(false);
                    b2Var.O0 = null;
                }
                bg0 bg0Var2 = new bg0(b2Var.getParentActivity(), b2Var.getResourceProvider());
                b2Var.O0 = bg0Var2;
                bg0Var2.setOnDismissListener(new eb(b2Var, 8));
                long a10 = b2Var.J.a();
                ij ijVar = b2Var.J.D5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = qp.s1(b2Var.currentAccount).z1(a10);
                tL_message.from_id = qp.s1(b2Var.currentAccount).z1(p10.i(b2Var.currentAccount).e());
                tL_message.flags2 |= TLObject.FLAG_13;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = b2Var.P.E2();
                tL_message.rich_message.documents = b2Var.P.B2();
                if (ijVar != null && !ijVar.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = ijVar.f1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                ij ijVar2 = new ij(b2Var.currentAccount, tL_message, false, false);
                if (ijVar != null && !ijVar.p) {
                    ijVar2.C = ijVar;
                }
                ijVar2.z0 = true;
                ijVar2.U2 = Boolean.TRUE;
                ijVar2.n0(null);
                ijVar2.u1 = true;
                b2Var.O0.p(org.telegram.messenger.k5.k(ijVar2));
                b2Var.y0.setScaleX(1.0f);
                b2Var.y0.setScaleY(1.0f);
                dg q10 = b2Var.O0.q(b2Var.y0, true, new i1(b2Var, 10));
                if (q10 != null) {
                    q10.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), b2Var.getThemedColor(k6.Ci))));
                    bg0 bg0Var3 = b2Var.O0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    bg0Var3.l0 = true;
                    bg0Var3.X = L;
                }
                k60 H = k60.H(b2Var, b2Var.y0);
                boolean B = t10.B(b2Var.J.j());
                if (b2Var.J.R6()) {
                    H.c(R.drawable.msg_calendar2, id.M0(B ? 2131745517 : 2131745862, null), new bi.r3(b2Var, a10, 14), false);
                    if (!B && a10 > 0) {
                        H.c(R.drawable.msg_online, id.M0(2131745589, null), new h1(b2Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(R.drawable.input_notify_off, id.M0(2131745586, null), new h1(b2Var, 6), false);
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

    public static void c0(final b2 b2Var, Context context, View view) {
        k60 k60Var = b2Var.x0;
        if (k60Var != null) {
            k60Var.u();
            b2Var.x0 = null;
        }
        final int i7 = 0;
        final int i10 = 1;
        boolean z9 = (qp.s1(b2Var.currentAccount).s4() || p10.i(b2Var.currentAccount).q()) ? false : true;
        final a T2 = b2Var.P.T2();
        final k60 I = k60.I(b2Var, view);
        I.Q = true;
        k60 J = I.J();
        J.c(R.drawable.ic_ab_back, id.M0(2131753756, null), new h(I, i10), false);
        J.k();
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, id.M0(2131754030, null), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
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
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        final int i11 = 2;
        J.y().a.setTextSize(1, iz.W0 + 2);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, id.M0(2131754029, null), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
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
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, iz.W0 + 1);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, id.M0(2131754028, null), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
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
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, iz.W0);
        final int i12 = 3;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, id.M0(2131754027, null), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
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
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, iz.W0 - 1);
        final int i13 = 4;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, id.M0(2131754026, null), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
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
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, iz.W0 - 2);
        final int i14 = 5;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, id.M0(2131754025, null), new Runnable(b2Var) { // from class: li.m1
            public final /* synthetic */ b2 b;

            {
                this.b = b2Var;
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
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, iz.W0 - 3);
        boolean z10 = T2 != null && t3.F3(T2.b);
        z1 z1Var = new z1(context, R.drawable.iv_h);
        z1Var.a(z9);
        int i15 = k6.G8;
        z1Var.d = i15;
        I.j(z10, 0, z1Var, id.M0(2131754031, null), new hi.h2(I, J, i11));
        I.y().a.setTypeface(org.telegram.messenger.g0.o());
        I.y().setPadding(org.telegram.messenger.g0.L(id.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(id.a0 ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, id.M0(2131753988, null), new l1(b2Var, T2, i12));
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, id.M0(2131753996, null), new l1(b2Var, T2, 4));
        boolean z11 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
        z1 z1Var2 = new z1(context, R.drawable.iv_pullquote);
        z1Var2.a(z9);
        z1Var2.d = i15;
        I.j(z11, 0, z1Var2, id.M0(2131753997, null), new l1(b2Var, T2, 0));
        I.y().setPadding(org.telegram.messenger.g0.L(id.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(id.a0 ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, id.M0(2131754055, null), new l1(b2Var, T2, i10));
        boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
        z1 z1Var3 = new z1(context, R.drawable.iv_footer);
        z1Var3.a(z9);
        z1Var3.d = i15;
        I.j(z12, 0, z1Var3, id.M0(2131754032, null), new l1(b2Var, T2, i11));
        I.y().setPadding(org.telegram.messenger.g0.L(id.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(id.a0 ? 9.0f : 18.0f), 0);
        I.Z();
        b2Var.x0 = I;
    }

    public static void d0(b2 b2Var, ij ijVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, ij ijVar2, ij ijVar3, qm qmVar, boolean z9, int i7, int i10, hw hwVar, long j10) {
        if (ijVar == null) {
            gz.R(org.telegram.messenger.c.a(b2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j3, ijVar2, ijVar3, qmVar, z9, i7, i10, hwVar, 0L, j10, 0L);
            return;
        }
        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(b2Var.currentAccount);
        an anVar = b2Var.J;
        org.telegram.messenger.p5 p5Var = gz.I;
        if (arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i11 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
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
        while (i11 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i11);
            i11++;
            gz.j(pageBlock2, identityHashMap);
        }
        gz.C(a10.a).v(ijVar, richMessage, arrayList4, anVar, false);
    }

    public static void e0(b2 b2Var, boolean z9, boolean z10) {
        if (b2Var.J0 == z9 && z10) {
            return;
        }
        b2Var.J0 = z9;
        float f10 = z9 ? 1.15f : 1.0f;
        if (z10) {
            b2Var.w0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(xq.h).start();
        } else {
            b2Var.w0.animate().cancel();
            b2Var.w0.setScaleX(f10);
            b2Var.w0.setScaleY(f10);
        }
        r6.t(b2Var.w0, z9 ? k6.q7 : k6.G6, b2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        zg0 animatedDrawable = b2Var.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z9) {
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

    public static g1 f0(b2 b2Var) {
        g1 focusedEditTextOrNull = b2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            g1 g1Var = b2Var.R0;
            return g1Var != null ? g1Var : b2Var.P.S2();
        }
        b2Var.R0 = focusedEditTextOrNull;
        b2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int g0(b2 b2Var, g1 g1Var) {
        return (g1Var != b2Var.R0 || b2Var.P.getFocusedEditTextOrNull() == g1Var) ? Math.max(0, g1Var.getSelectionEnd()) : Math.min(b2Var.S0, g1Var.length());
    }

    public static String l0(int i7) {
        if (i7 == 1) {
            return id.M0(2131754854, null);
        }
        if (i7 == 2) {
            return id.M0(2131754860, null);
        }
        if (i7 == 4) {
            return id.M0(2131754855, null);
        }
        if (i7 == 7) {
            return id.M0(2131754864, null);
        }
        if (i7 != 9) {
            return null;
        }
        return id.M0(2131754869, null);
    }

    public static String n0(int i7) {
        if (i7 == 1) {
            return id.M0(2131753671, null);
        }
        if (i7 == 2) {
            return id.M0(2131749088, null);
        }
        if (i7 == 16) {
            return id.M0(2131743892, null);
        }
        if (i7 == 8) {
            return id.M0(2131744440, null);
        }
        if (i7 == 256) {
            return id.M0(2131745265, null);
        }
        if (i7 == 4) {
            return id.M0(2131748351, null);
        }
        if (i7 == 65536) {
            return id.M0(2131749304, null);
        }
        if (i7 == 16384) {
            return id.M0(2131744428, null);
        }
        if (i7 == 32768) {
            return id.M0(2131744330, null);
        }
        return null;
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, f6 f6Var) {
        final int i7 = 1;
        final int i10 = 0;
        final org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.N = f10;
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.large_article);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = k6.Ci;
        ShapeDrawable L2 = k6.L(L, k6.w0(i11, f6Var));
        n6 N = r6.N(i11);
        e10.setBackground(L2);
        r6.k(e10, L2, N, null, f6Var);
        f10.addView(e10, ha.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i12 = k6.G6;
        r6.V(textView, i12, f6Var);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, ha.t(-1, -2, 49, 25, 16, 25, 0), context);
        f11.setText(org.telegram.messenger.g0.X2(id.M0(2131754042, null)));
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        r6.V(f11, i12, f6Var);
        f10.addView(f11, ha.t(-1, -2, 49, 25, 11, 25, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.setText(id.M0(2131754043, null));
        f10.addView(h, ha.t(-1, 48, 49, 14, 31, 14, 0));
        fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, false);
        h7.setText(id.M0(2131754044, null));
        f10.addView(h7, ha.t(-1, 48, 49, 14, 2, 14, 6));
        l10.show();
        h.setOnClickListener(new View.OnClickListener() { // from class: li.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        l10.dismiss();
                        runnable2.run();
                        break;
                    default:
                        l10.dismiss();
                        runnable2.run();
                        break;
                }
            }
        });
        h7.setOnClickListener(new View.OnClickListener() { // from class: li.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        l10.dismiss();
                        runnable.run();
                        break;
                    default:
                        l10.dismiss();
                        runnable.run();
                        break;
                }
            }
        });
    }

    public final void A0() {
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
        this.H[0] = (int) (r0[0] - (this.w.E0.getX() - org.telegram.messenger.g0.L(16.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0() {
        a T2;
        int i7;
        int size;
        int i10;
        i9 textSelectionHelper = this.P.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = this.P.T2();
        } else {
            int i11 = textSelectionHelper.p0;
            T2 = i11 == textSelectionHelper.s0 ? this.P.B4(i11) : null;
        }
        if (this.P.U2() == null) {
            if (T2 != null) {
                if (!T2.a() && !T2.b() && !T2.c()) {
                    TL_iv.PageBlock pageBlock = T2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                i7 = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i7 = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i7 = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i7 = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i7 = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i7 = 7;
                            }
                            ArrayList arrayList = this.f0;
                            size = arrayList.size();
                            i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                x1 x1Var = (x1) obj;
                                int intValue = ((Integer) x1Var.getTag()).intValue();
                                x1Var.setSelected(i7 == intValue);
                                if (i7 == intValue) {
                                    x1Var.setEnabled(true);
                                    if (T2 == null) {
                                        x1Var.a();
                                    } else if (i7 == 1) {
                                        TL_iv.PageBlock pageBlock2 = T2.b;
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
                                    } else if (i7 == 2) {
                                        if (T2.a()) {
                                            x1Var.e(R.drawable.iv_todo);
                                        } else if (T2.c()) {
                                            x1Var.e(R.drawable.iv_ordered_list);
                                        } else {
                                            x1Var.a();
                                        }
                                    } else if (i7 == 8) {
                                        x1Var.e(R.drawable.iv_details);
                                    } else {
                                        x1Var.a();
                                    }
                                } else {
                                    x1Var.setEnabled(i7 != 4);
                                    x1Var.a();
                                }
                            }
                        }
                    }
                }
                i7 = 2;
                ArrayList arrayList2 = this.f0;
                size = arrayList2.size();
                i10 = 0;
                while (i10 < size) {
                }
            }
            i7 = 0;
            ArrayList arrayList22 = this.f0;
            size = arrayList22.size();
            i10 = 0;
            while (i10 < size) {
            }
        }
        i7 = 4;
        ArrayList arrayList222 = this.f0;
        size = arrayList222.size();
        i10 = 0;
        while (i10 < size) {
        }
    }

    public final void C0(int i7, boolean z9) {
        if (this.K0 == i7) {
            return;
        }
        this.K0 = i7;
        if (z9) {
            this.a0.setVisibility(0);
            ViewPropertyAnimator duration = this.a0.animate().alpha(this.K0 == 0 ? 1.0f : 0.0f).scaleX(this.K0 == 0 ? 1.0f : 0.8f).scaleY(this.K0 == 0 ? 1.0f : 0.8f).translationY(this.K0 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new h1(this, 1)).start();
            this.h0.setVisibility(0);
            this.h0.animate().alpha(this.K0 == 1 ? 1.0f : 0.0f).scaleX(this.K0 == 1 ? 1.0f : 0.8f).scaleY(this.K0 == 1 ? 1.0f : 0.8f).translationY(this.K0 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L).setInterpolator(xqVar).withEndAction(new h1(this, 2)).start();
            this.v0.setVisibility(0);
            this.v0.animate().alpha(this.K0 == 2 ? 1.0f : 0.0f).scaleX(this.K0 == 2 ? 1.0f : 0.8f).scaleY(this.K0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xqVar).withEndAction(new h1(this, 3)).start();
            return;
        }
        this.a0.setVisibility(i7 == 0 ? 0 : 8);
        this.a0.setAlpha(i7 == 0 ? 1.0f : 0.0f);
        this.a0.setScaleX(i7 == 0 ? 1.0f : 0.8f);
        this.a0.setScaleY(i7 == 0 ? 1.0f : 0.8f);
        this.a0.setTranslationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        this.h0.setVisibility(i7 == 1 ? 0 : 8);
        this.h0.setAlpha(i7 == 1 ? 1.0f : 0.0f);
        this.h0.setScaleX(i7 == 1 ? 1.0f : 0.8f);
        this.h0.setScaleY(i7 == 1 ? 1.0f : 0.8f);
        this.h0.setTranslationY(i7 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        this.v0.setVisibility(i7 != 2 ? 8 : 0);
        this.v0.setAlpha(i7 == 2 ? 1.0f : 0.0f);
        this.v0.setScaleX(i7 == 2 ? 1.0f : 0.8f);
        this.v0.setScaleY(i7 == 2 ? 1.0f : 0.8f);
    }

    public final void D0() {
        boolean z9;
        boolean z10;
        i9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.l0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        x1 x1Var = this.u0;
        boolean z11 = false;
        if (x1Var != null) {
            t3 t3Var = this.P;
            int[] E4 = t3Var.E4();
            x1Var.setSelected(E4 != null && t3Var.K3(E4[0], E4[1]));
        }
        if (this.P.O3()) {
            i9 textSelectionHelper2 = this.P.getTextSelectionHelper();
            int i7 = textSelectionHelper2.p0;
            int i10 = textSelectionHelper2.q0;
            int i11 = textSelectionHelper2.t0;
            int i12 = textSelectionHelper2.r0;
            int i13 = textSelectionHelper2.u0;
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                x1 x1Var2 = (x1) obj;
                x1Var2.setSelected(this.P.N3(((Integer) x1Var2.getTag()).intValue(), i7, i10, i12, i11, i13));
            }
            boolean z12 = i10 == i11;
            g1 Q4 = z12 ? this.P.Q4(i7, i10) : null;
            int max = Math.max(0, Math.min(i12, i13));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i12, i13), Q4.length()));
            x1 x1Var3 = this.q0;
            if (x1Var3 != null) {
                x1Var3.setSelected(Q4 != null && max < max2 && c6.h(Q4.getText(), max, max2));
            }
            x1 x1Var4 = this.s0;
            if (x1Var4 != null) {
                if (Q4 != null && max < max2 && c6.g(Q4.getText(), max, max2)) {
                    z11 = true;
                }
                x1Var4.setSelected(z11);
            }
            y0(true);
            z0(z12, this.P.o2());
            return;
        }
        if (this.P.z3()) {
            i9 textSelectionHelper3 = this.P.getTextSelectionHelper();
            g1 v22 = this.P.v2(textSelectionHelper3.p0);
            int i15 = textSelectionHelper3.r0;
            int i16 = textSelectionHelper3.u0;
            int max3 = v22 == null ? 0 : Math.max(0, Math.min(Math.min(i15, i16), v22.length()));
            int max4 = v22 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), v22.length()));
            int size2 = arrayList.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList.get(i17);
                i17++;
                x1 x1Var5 = (x1) obj2;
                x1Var5.setSelected((v22 == null || max3 >= max4 || (((Integer) x1Var5.getTag()).intValue() & v22.c(max3, max4)) == 0) ? false : true);
            }
            x1 x1Var6 = this.q0;
            if (x1Var6 != null) {
                x1Var6.setSelected(v22 != null && max3 < max4 && c6.h(v22.getText(), max3, max4));
            }
            x1 x1Var7 = this.s0;
            if (x1Var7 != null) {
                if (v22 != null && max3 < max4 && c6.g(v22.getText(), max3, max4)) {
                    z11 = true;
                }
                x1Var7.setSelected(z11);
            }
            y0(true);
            z0(true, this.P.o2());
            return;
        }
        int i18 = textSelectionHelper.p0;
        int i19 = textSelectionHelper.s0;
        int i20 = textSelectionHelper.r0;
        int i21 = textSelectionHelper.u0;
        boolean z13 = i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.P.w4.size();
        int size3 = arrayList.size();
        int i22 = 0;
        while (i22 < size3) {
            int i23 = i22 + 1;
            x1 x1Var8 = (x1) arrayList.get(i22);
            x1Var8.setSelected(z13 && this.P.M3(((Integer) x1Var8.getTag()).intValue(), i18, i20, i19, i21));
            i22 = i23;
        }
        y0(!this.P.L3());
        x1 x1Var9 = this.q0;
        if (x1Var9 != null) {
            if (z13) {
                Editable K4 = this.P.K4(i18, i20, i19, i21);
                if (K4 == null ? false : c6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z10 = true;
                    x1Var9.setSelected(z10);
                }
            }
            z10 = false;
            x1Var9.setSelected(z10);
        }
        x1 x1Var10 = this.s0;
        if (x1Var10 != null) {
            if (z13) {
                Editable K42 = this.P.K4(i18, i20, i19, i21);
                if (K42 == null ? false : c6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z9 = true;
                    x1Var10.setSelected(z9);
                }
            }
            z9 = false;
            x1Var10.setSelected(z9);
        }
        if (z13 && i18 == i19) {
            z11 = true;
        }
        z0(z11, this.P.o2());
    }

    public final void E0() {
        boolean u22 = this.P.u2();
        f2 f2Var = this.P.Q3;
        boolean z9 = (f2Var == null || f2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setEnabled(u22);
            this.V.setAlpha(u22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setEnabled(z9);
            this.W.setAlpha(z9 ? 1.0f : 0.35f);
        }
    }

    public final void F0() {
        int i7 = 0;
        boolean z9 = (qp.s1(this.currentAccount).s4() || p10.i(this.currentAccount).q()) ? false : true;
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((x1) obj).setPremiumLocked(z9);
        }
    }

    public final void G0() {
        if (this.y0 == null) {
            return;
        }
        boolean P3 = this.P.P3();
        this.y0.setEnabled(P3);
        org.telegram.messenger.camera.q.k(this.y0.animate(), P3 ? 1.0f : 0.5f, 150L);
    }

    public final void H0() {
        w1 w1Var = this.y0;
        if (w1Var == null) {
            return;
        }
        w1Var.setLocked(r0());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new t1(this, context);
        int i10 = 1;
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.F0 = qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        hi.z1 z1Var = new hi.z1(this, i10);
        this.H0 = z1Var;
        this.O.r.add(z1Var);
        t3 t3Var = new t3(context, this.currentAccount, getResourceProvider(), new g6.d0(this, 13));
        this.P = t3Var;
        t3Var.setFileRefParentObject(this.r);
        this.O.addView(this.P, ha.e(-1, -1, qs.E1));
        this.O.addView(this.P.getOverlayView(), ha.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            t3 t3Var2 = this.P;
            ArrayList arrayList2 = t3Var2.s3;
            t3Var2.r3 = richMessage;
            t3.Z2(arrayList2, richMessage.blocks, t3Var2.t3);
            t3Var2.Y3();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                t3Var2.y4((a) arrayList2.get(i11));
            }
            t3Var2.f3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                t3 t3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = t3Var3.t3;
                ArrayList arrayList3 = t3Var3.s3;
                if (!TextUtils.isEmpty(charSequence)) {
                    t3.Z2(arrayList3, a5.b(charSequence), hashMap);
                }
                arrayList3.addAll(t3Var3.z4(b4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    t3.Z2(arrayList3, a5.b(charSequence2), hashMap);
                }
                t3Var3.Y3();
                t3Var3.f3.O(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        f2 f2Var = this.P.Q3;
        if (f2Var != null) {
            f2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = k6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i12), k6.r1(0.0f, getThemedColor(i12))}));
        this.O.addView(this.Q, ha.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{k6.r1(0.0f, getThemedColor(i12)), getThemedColor(i12)}));
        this.O.addView(this.R, ha.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, ha.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = k6.i6;
        imageView3.setBackground(new a2(k6.b0(themedColor, k6.w(themedColor2, getThemedColor(i13)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.T;
        int i14 = k6.G6;
        f6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView4, i14, resourceProvider, mode);
        ka.a(this.T);
        this.T.setContentDescription(id.M0(2131754878, null));
        this.T.setOnClickListener(new i1(this, i10));
        this.S.addView(this.T, ha.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.S.addView(this.U, ha.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        r6.R(this.V, k6.h0(getThemedColor(i13), 1, -1), null, r6.N(i13), getResourceProvider());
        r6.t(this.V, i14, getResourceProvider(), mode);
        ka.a(this.V);
        this.V.setContentDescription(id.M0(2131743890, null));
        this.V.setOnClickListener(new i1(this, 2));
        this.U.addView(this.V, ha.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        r6.R(this.W, k6.h0(getThemedColor(i13), 1, -1), null, r6.N(i13), getResourceProvider());
        r6.t(this.W, i14, getResourceProvider(), mode);
        ka.a(this.W);
        this.W.setContentDescription(id.M0(2131746343, null));
        this.W.setOnClickListener(new i1(this, 3));
        this.U.addView(this.W, ha.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, ha.e(-1, qs.q2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, ha.e(-1, qs.q2, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.a0.setClipChildren(false);
        this.a0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.a0, ha.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.u2(context));
        this.c0.setScaleType(scaleType);
        r6.t(this.c0, i14, getResourceProvider(), mode);
        this.c0.setBackground(new a2(k6.b0(getThemedColor(i12), k6.w(getThemedColor(i12), getThemedColor(i13)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.a0.addView(this.c0, ha.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ka.a(this.c0);
        this.c0.setContentDescription(id.M0(2131755006, null));
        this.c0.setOnClickListener(new i1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        frameLayout5.addView(frameLayout6, ha.e(-2, 44, 81));
        u1 u1Var = new u1(context, 0);
        this.d0 = u1Var;
        u1Var.setClipToOutline(true);
        this.d0.setOutlineProvider(new bg.q0(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.e0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.e0.setOrientation(0);
        this.d0.addView(this.e0);
        frameLayout6.addView(this.d0, ha.c(-1.0f, -1));
        jg jgVar = new jg(context, 24);
        this.b0 = jgVar;
        jgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        r6.t(this.b0, i14, getResourceProvider(), mode);
        r6.R(this.b0, k6.b0(getThemedColor(i12), getThemedColor(i13), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i12), r6.N(i13), getResourceProvider());
        this.b0.j(hg.e, false);
        this.e0.addView(this.b0, ha.r(38, 38, 16));
        ka.a(this.b0);
        this.b0.setContentDescription(id.M0(2131754884, null));
        this.b0.setOnClickListener(new i1(this, 5));
        h0(R.drawable.iv_text, 1, false).setOnClickListener(new bi.r(22, this, context));
        h0(R.drawable.iv_lists, 2, true).setOnClickListener(new i1(this, 6));
        h0(R.drawable.iv_table, 4, true).setOnClickListener(new i1(this, 7));
        h0(R.drawable.iv_math, 7, true).setOnClickListener(new i1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.g0.setScaleType(scaleType);
        r6.t(this.g0, i14, getResourceProvider(), mode);
        r6.R(this.g0, k6.b0(getThemedColor(i12), getThemedColor(i13), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i12), r6.N(i13), getResourceProvider());
        this.e0.addView(this.g0, ha.t(38, 38, 16, 2, 0, 0, 0));
        ka.a(this.g0);
        this.g0.setContentDescription(id.M0(2131754921, null));
        this.g0.setOnClickListener(new i1(this, 9));
        this.a0.addView(frameLayout5, ha.l(1.0f, 0, 44));
        c61 c61Var = new c61(6, context, this);
        this.h0 = c61Var;
        c61Var.setOrientation(0);
        this.h0.setClipToPadding(false);
        this.h0.setClipChildren(false);
        this.h0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Y.addView(this.h0, ha.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.v0.setClipToPadding(false);
        this.v0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Y.addView(this.v0, ha.e(80, 60, 81));
        ch0 ch0Var = new ch0(context);
        this.w0 = ch0Var;
        ch0Var.f(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        zg0 animatedDrawable = this.w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.w0.setScaleType(scaleType);
        r6.t(this.w0, i14, getResourceProvider(), mode);
        this.w0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.v0.addView(this.w0, ha.e(-1, -1, qs.E1));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.h0.addView(frameLayout8, ha.c(44.0f, -2));
        v1 v1Var = new v1(this, context);
        this.j0 = v1Var;
        v1Var.setHorizontalScrollBarEnabled(false);
        this.j0.setClipToOutline(true);
        this.j0.setOutlineProvider(new bg.q0(5));
        frameLayout8.addView(this.j0, ha.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.i0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.j0.addView(this.i0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, R.drawable.formatting_bold, 1, false);
        i0(context, R.drawable.formatting_italic, 2, false);
        i0(context, R.drawable.formatting_underline, 16, false);
        i0(context, R.drawable.formatting_strikethrough, 8, false);
        i0(context, R.drawable.formatting_spoiler, 256, false);
        i0(context, R.drawable.iv_code, 4, false);
        i0(context, R.drawable.formatting_marked, 65536, true);
        i0(context, R.drawable.iv_sub, TLObject.FLAG_14, true);
        i0(context, R.drawable.iv_super, 32768, true);
        x1 x1Var = new x1(R.drawable.iv_quote, context, getResourceProvider());
        this.u0 = x1Var;
        x1Var.setContentDescription(id.M0(2131746441, null));
        this.u0.setOnClickListener(new i1(this, 11));
        LinearLayout linearLayout5 = this.i0;
        linearLayout5.addView(this.u0, ha.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        x1 x1Var2 = new x1(R.drawable.iv_button, context, getResourceProvider());
        this.r0 = x1Var2;
        x1Var2.setContentDescription(id.M0(2131746014, null));
        this.r0.setOnClickListener(new i1(this, 12));
        LinearLayout linearLayout6 = this.i0;
        linearLayout6.addView(this.r0, ha.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.n0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.h0.addView(this.n0, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var3 = new x1(R.drawable.media_link_24, context, getResourceProvider());
        this.q0 = x1Var3;
        x1Var3.setContentDescription(id.M0(2131751745, null));
        this.q0.setOnClickListener(new i1(this, 13));
        this.n0.addView(this.q0, ha.r(38, 38, 16));
        x1 x1Var4 = new x1(R.drawable.msg_calendar2, context, getResourceProvider());
        this.s0 = x1Var4;
        x1Var4.setContentDescription(id.M0(2131754862, null));
        this.s0.setOnClickListener(new i1(this, 14));
        this.n0.addView(this.s0, ha.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.o0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.h0.addView(this.o0, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(R.drawable.iv_math, context, getResourceProvider());
        this.t0 = x1Var5;
        x1Var5.d();
        arrayList.add(this.t0);
        this.t0.setContentDescription(id.M0(2131754864, null));
        this.t0.setOnClickListener(new i1(this, 15));
        this.o0.addView(this.t0, ha.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.m0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.h0.addView(this.m0, 0, ha.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var6 = new x1(0, context, getResourceProvider());
        this.p0 = x1Var6;
        x1Var6.setImageDrawable(new org.telegram.ui.ActionBar.u2(context));
        this.p0.setContentDescription(id.M0(2131755006, null));
        this.p0.setOnClickListener(new i1(this, 16));
        this.m0.addView(this.p0, ha.r(38, 38, 16));
        w1 w1Var = new w1(this, context, this.r != null ? R.drawable.input_done : q0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider());
        this.y0 = w1Var;
        w1Var.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(k6.Me))));
        ka.a(this.y0);
        this.a0.addView(this.y0, ha.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.y0.setContentDescription(id.M0(2131745643, null));
        this.y0.setOnClickListener(new i1(this, i7));
        this.y0.setOnLongClickListener(new fi.s4(this, 3));
        H0();
        this.O.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, i10));
        F0();
        if (this.e) {
            this.P.F2();
            this.e = false;
        }
        t1 t1Var = this.O;
        this.fragmentView = t1Var;
        return t1Var;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f5) {
            H0();
            F0();
        }
    }

    public final x1 h0(int i7, int i10, boolean z9) {
        x1 x1Var = new x1(i7, this.e0.getContext(), getResourceProvider());
        if (z9) {
            x1Var.d();
            this.N.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(l0(i10));
        this.f0.add(x1Var);
        LinearLayout linearLayout = this.e0;
        linearLayout.addView(x1Var, ha.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return x1Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i7, int i10, boolean z9) {
        x1 x1Var = new x1(i7, context, getResourceProvider());
        if (z9) {
            x1Var.d();
            this.N.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(n0(i10));
        x1Var.setOnClickListener(new ai.v(this, i10, 7));
        this.l0.add(x1Var);
        LinearLayout linearLayout = this.i0;
        linearLayout.addView(x1Var, ha.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        t3 t3Var = this.P;
        if (t3Var == null || !t3Var.u3.x()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(boolean z9) {
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, z9 ? 1.0f : 0.0f);
        this.P0 = ofFloat;
        ofFloat.addUpdateListener(new j1(this, 0));
        this.P0.setInterpolator(xq.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        hy hyVar = this.A0;
        if (hyVar == null || (layoutParams = (FrameLayout.LayoutParams) hyVar.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.O == null ? o0() : Math.max(o0(), ((r2.getMeasuredHeight() - this.O.getPaddingTop()) - org.telegram.messenger.g0.L(240.0f)) - this.T0)) - r1) * this.Q0) + o0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.A0.setLayoutParams(layoutParams);
        }
    }

    public final void m0() {
        FrameLayout.LayoutParams layoutParams;
        hy hyVar = this.A0;
        if (hyVar != null && (layoutParams = (FrameLayout.LayoutParams) hyVar.getLayoutParams()) != null) {
            int i7 = layoutParams.bottomMargin;
            int i10 = this.T0;
            if (i7 != i10) {
                layoutParams.bottomMargin = i10;
                this.A0.setLayoutParams(layoutParams);
            }
        }
        k0();
        int max = Math.max(Math.max(this.D0, this.T0), this.U0);
        this.P.setPadding(0, org.telegram.messenger.g0.L(60.0f), 0, org.telegram.messenger.g0.L(110.0f) + max);
        t3 t3Var = this.P;
        int i11 = this.T0;
        int i12 = this.U0;
        int i13 = this.D0;
        t3Var.V3 = i11;
        t3Var.W3 = i12;
        t3Var.X3 = i13;
        this.Y.setTranslationY(-max);
        this.R.setTranslationY(r0 + this.T0);
    }

    public final int o0() {
        Point point = org.telegram.messenger.g0.q;
        int i7 = point.x > point.y ? this.F0 : this.E0;
        return i7 <= 0 ? org.telegram.messenger.g0.L(200.0f) : i7;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i10 != -1 || i7 != 21) {
            if (i10 != -1 || (i7 != 1 && i7 != 14)) {
                super.onActivityResultFragment(i7, i10, intent);
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
        t3 t3Var = this.P;
        Uri data = intent.getData();
        if (data == null) {
            t3Var.getClass();
        } else {
            if (t3Var.getContext() == null) {
                return;
            }
            Utilities.e.c(new ha.b(27, t3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        boolean z10 = this.C0;
        if (z10) {
            if (z10) {
                this.C0 = false;
                hy hyVar = this.A0;
                if (hyVar != null) {
                    hyVar.t(false);
                    this.A0.A();
                }
                j0(false);
                return false;
            }
        } else {
            if (this.B0) {
                p0(true);
                return false;
            }
            if (!this.P.I2()) {
                return super.onBackPressed(z9);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        int i7 = 1;
        if (!z9 && !this.V0) {
            v0();
            this.V0 = true;
        }
        if (org.telegram.messenger.g0.Q1() || this.s == null || this.w == null) {
            return super.onCustomTransitionAnimation(z9, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        jh.f fVar = this.s;
        this.y = fVar.f;
        fVar.e = false;
        fVar.invalidate();
        this.w.setAlpha(0.0f);
        int i10 = 4;
        this.w.A1.setVisibility(4);
        A0();
        float f10 = z9 ? 0.0f : 1.0f;
        this.I = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
        this.E = true;
        this.O.invalidate();
        ofFloat.addUpdateListener(new j1(this, i7));
        ofFloat.addListener(new ah.l(10, this, runnable));
        if (z9) {
            FrameLayout frameLayout = this.S;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.S;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<t3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.S;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.S;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<FrameLayout, Float>) property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, (Property<t3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(xq.h);
        this.O.post(new gq0(animatorSet, i10));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.f5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        hi.z1 z1Var;
        qs.f(this.currentAccount).n(this, qs.f5);
        if (!this.V0) {
            v0();
            this.V0 = true;
        }
        n1 n1Var = this.N0;
        if (n1Var != null) {
            this.N0 = null;
            org.telegram.messenger.g0.h3(n1Var);
        }
        bg0 bg0Var = this.O0;
        if (bg0Var != null) {
            bg0Var.h();
            this.O0 = null;
        }
        t3 t3Var = this.P;
        if (t3Var != null) {
            t3Var.J2();
        }
        ga.d dVar = this.z0;
        if (dVar != null) {
            dVar.c();
        }
        super.onFragmentDestroy();
        hy hyVar = this.A0;
        if (hyVar != null) {
            hyVar.B();
        }
        t1 t1Var = this.O;
        if (t1Var == null || (z1Var = this.H0) == null) {
            return;
        }
        t1Var.r.remove(z1Var);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.T0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        m0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        k60 k60Var;
        i0.b f10 = k1Var.a.f(3);
        int i7 = k1Var.a.f(8).d;
        this.U0 = i7;
        int i10 = i7 - f10.d;
        boolean z9 = this.G0;
        boolean z10 = i10 > org.telegram.messenger.g0.L(20.0f);
        this.G0 = z10;
        if (z10 && i10 > org.telegram.messenger.g0.L(50.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.F0 = i10;
                qp.d1().edit().putInt("kbd_height_land3", this.F0).commit();
            } else {
                this.E0 = i10;
                qp.d1().edit().putInt("kbd_height", this.E0).commit();
            }
        }
        if (this.G0 && !z9 && this.B0 && !this.C0) {
            p0(false);
        }
        if (!this.G0 && z9 && (k60Var = this.x0) != null) {
            k60Var.u();
            this.x0 = null;
        }
        onInsets(f10.a, f10.b, f10.c, f10.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i7 = k6.d6;
            int themedColor = getThemedColor(i7);
            int i10 = k6.i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = k6.Me;
            int themedColor3 = getThemedColor(i11);
            if (this.Z0 && themedColor == this.W0 && themedColor2 == this.X0 && themedColor3 == this.Y0) {
                return;
            }
            this.Z0 = true;
            this.W0 = themedColor;
            this.X0 = themedColor2;
            this.Y0 = themedColor3;
            View view = this.Q;
            if (view != null) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i7), k6.r1(0.0f, getThemedColor(i7))}));
            }
            View view2 = this.R;
            if (view2 != null) {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7)}));
            }
            ImageView imageView = this.T;
            if (imageView != null) {
                imageView.setBackground(new a2(k6.b0(getThemedColor(i7), k6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
            }
            LinearLayout linearLayout = this.U;
            if (linearLayout != null) {
                linearLayout.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            ImageView imageView2 = this.c0;
            if (imageView2 != null) {
                imageView2.setBackground(new a2(k6.b0(getThemedColor(i7), k6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
            }
            ch0 ch0Var = this.w0;
            if (ch0Var != null) {
                ch0Var.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            LinearLayout linearLayout2 = this.n0;
            if (linearLayout2 != null) {
                linearLayout2.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            LinearLayout linearLayout3 = this.o0;
            if (linearLayout3 != null) {
                linearLayout3.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            LinearLayout linearLayout4 = this.m0;
            if (linearLayout4 != null) {
                linearLayout4.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            w1 w1Var = this.y0;
            if (w1Var != null) {
                w1Var.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        t3 t3Var;
        int i7;
        t3 t3Var2;
        super.onTransitionAnimationStart(z9, z10);
        if (z9 && !z10 && (i7 = this.c) >= 0 && (t3Var2 = this.P) != null) {
            int i10 = this.d;
            this.d = -1;
            this.c = -1;
            if (t3Var2.c2(i7, i10)) {
                return;
            }
            t3Var2.post(new n2(t3Var2, i7, i10, 0));
            return;
        }
        if (!z9 || z10) {
            return;
        }
        if ((this.b == null && this.f == null) || (t3Var = this.P) == null || t3Var.d3()) {
            return;
        }
        t3Var.post(new b(t3Var, 5));
    }

    public final void p0(boolean z9) {
        if (this.C0) {
            this.C0 = false;
            hy hyVar = this.A0;
            if (hyVar != null) {
                hyVar.t(false);
                this.A0.A();
            }
        }
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        this.Q0 = 0.0f;
        this.R0 = null;
        hy hyVar2 = this.A0;
        if (hyVar2 != null) {
            hyVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            m0();
        }
        jg jgVar = this.b0;
        if (jgVar != null) {
            jgVar.j(hg.e, z9);
        }
    }

    public final boolean q0() {
        an anVar;
        return this.r == null && (anVar = this.J) != null && anVar.c();
    }

    public final boolean r0() {
        if (qp.s1(this.currentAccount).s4() || p10.i(this.currentAccount).q()) {
            return false;
        }
        t3 t3Var = this.P;
        return a5.d(t3Var.s3, t3Var.t3);
    }

    public final void s0() {
        k3 k22 = this.P.k2();
        if (k22 == null) {
            return;
        }
        TL_iv.RichMessage a10 = k22.a();
        if (a10.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(getParentActivity(), getResourceProvider());
        g0Var.s1(a10);
        g0Var.c2 = new ii.c(k22, 9);
        g0Var.show();
    }

    public final void t0(int i7, int i10) {
        t3 t3Var = this.P;
        t3Var.j4 = t3Var.T2();
        di diVar = new di(getParentActivity(), this, false, false, true, getResourceProvider());
        diVar.T3 = new q1(this, diVar);
        diVar.a2.setIncludeVideosInGallery(true);
        diVar.a2.i0();
        diVar.y1(1, true);
        diVar.V0(i7);
        diVar.q4 = new p1(this, diVar);
        diVar.P1 = new p1(this, diVar);
        diVar.O1 = new r1(this, diVar);
        diVar.e1();
        if (i10 != 0) {
            diVar.o1(i10);
        }
        diVar.A0(true);
        diVar.show();
    }

    public final boolean v0() {
        Runnable runnable;
        if (this.J == null || this.r != null || !this.P.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = this.M ? null : this.P.m2();
        if (m22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        qj qjVar = this.J.Z;
        if (m22 != null && !this.M) {
            t3 t3Var = this.P;
            if (t3Var.n3() && !a5.d(t3Var.s3, t3Var.t3) && qjVar != null) {
                SpannableStringBuilder g10 = a5.g(this.P.s3);
                an anVar = qjVar.P2;
                if (qjVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                i6.m(spannableStringBuilder, qjVar.E0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.r5.class);
                if (r5VarArr != null) {
                    for (org.telegram.ui.Components.r5 r5Var : r5VarArr) {
                        r5Var.applyFontMetrics(qjVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.i5.f());
                    }
                }
                ug0.a(spannableStringBuilder);
                if (anVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    ui.b0(qjVar.Q).Q1(anVar.a(), anVar.P7(anVar.D5), charSequenceArr[0], ui.b0(qjVar.Q).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                qjVar.setRichDraftPreview(null);
                if (qjVar.E0.getText() != null) {
                    qjVar.E0.getText().clear();
                }
                qjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        ui mediaDataController = getMediaDataController();
        long a10 = this.J.a();
        an anVar2 = this.J;
        mediaDataController.Q1(a10, anVar2.P7(anVar2.D5), "", null, null, null, null, 0L, false, false, m22);
        TL_iv.RichMessage richMessage = m22;
        if (qjVar == null) {
            return true;
        }
        qjVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void w0() {
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.P;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new h1(this, 4), getResourceProvider());
            return;
        }
        if (q0()) {
            org.telegram.ui.Components.v4.J(getParentActivity(), this.J.a(), new gf.g(this, 12), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [li.n1] */
    public final void x0(final int i7, final int i10, final boolean z9) {
        qj qjVar;
        wf wfVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.P;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new h1(this, 4), getResourceProvider());
            return;
        }
        if (this.J == null || !this.P.n3() || this.P.p3()) {
            return;
        }
        if (!this.P.P3()) {
            G0();
            return;
        }
        if (!qp.s1(this.currentAccount).s4()) {
            qj qjVar2 = this.J.Z;
            if (qjVar2 == null) {
                return;
            }
            this.M = true;
            Runnable runnable = this.K;
            if (runnable != null) {
                runnable.run();
            }
            qjVar2.R0(a5.g(this.P.s3), z9, i7, i10);
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
        final ArrayList a10 = z4.a(this.currentAccount, c32);
        final long a11 = this.J.a();
        an anVar = this.J;
        final ij ijVar = anVar.D5;
        final ij ijVar2 = anVar.l4;
        final qm qmVar = anVar.B5;
        final long h92 = anVar.h9();
        final hw W8 = this.J.W8();
        final ij ijVar3 = this.r;
        ?? r02 = new Runnable() { // from class: li.n1
            @Override // java.lang.Runnable
            public final void run() {
                b2.d0(b2.this, ijVar3, c32, E2, B2, a10, a11, ijVar, ijVar2, qmVar, z9, i7, i10, W8, h92);
            }
        };
        Runnable runnable2 = this.K;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (ijVar3 == null && (qjVar = this.J.Z) != null && (wfVar = qjVar.Z2) != null) {
            wfVar.F(null, z9, i7, i10, 0L);
        }
        if (i7 == 0 || ijVar3 != null) {
            r02.run();
            finishFragment();
        } else {
            this.N0 = r02;
            finishFragment();
        }
    }

    public final void y0(boolean z9) {
        ArrayList arrayList = this.l0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x1 x1Var = (x1) obj;
            if (((Integer) x1Var.getTag()).intValue() == 1) {
                x1Var.setEnabled(z9);
            }
        }
    }

    public final void z0(boolean z9, boolean z10) {
        x1 x1Var = this.q0;
        if (x1Var != null) {
            x1Var.setEnabled(z9);
        }
        x1 x1Var2 = this.r0;
        if (x1Var2 != null) {
            x1Var2.setEnabled(z10);
        }
        x1 x1Var3 = this.s0;
        if (x1Var3 != null) {
            x1Var3.setEnabled(z9);
        }
        x1 x1Var4 = this.t0;
        if (x1Var4 != null) {
            x1Var4.setEnabled(z9);
        }
    }

    public b2(String str) {
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
        this.M0 = new h1(this, 0);
        this.f = str;
    }

    public b2(TL_iv.RichMessage richMessage) {
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
        this.M0 = new h1(this, 0);
        this.b = richMessage;
    }
}
