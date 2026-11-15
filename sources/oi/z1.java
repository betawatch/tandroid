package oi;

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
import c8.ja;
import c8.na;
import di.r9;
import hi.g7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.fw;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.fq0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class z1 extends org.telegram.ui.ActionBar.e2 implements is {
    public ga.d A0;
    public ly B0;
    public boolean C0;
    public boolean D0;
    public RectF E;
    public int E0;
    public boolean F;
    public int F0;
    public final int[] G;
    public int G0;
    public int[] H;
    public boolean H0;
    public int[] I;
    public ki.z1 I0;
    public float J;
    public int J0;
    public an K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public l1 O0;
    public r1 P;
    public bg0 P0;
    public q3 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public e1 S0;
    public FrameLayout T;
    public int T0;
    public ImageView U;
    public int U0;
    public LinearLayout V;
    public int V0;
    public ImageView W;
    public boolean W0;
    public ImageView X;
    public int X0;
    public FrameLayout Y;
    public int Y0;
    public FrameLayout Z;
    public int Z0;
    public final CharSequence a;
    public FrameLayout a0;
    public boolean a1;
    public final TL_iv.RichMessage b;
    public LinearLayout b0;
    public int c;
    public pg c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public s1 e0;
    public final String f;
    public LinearLayout f0;
    public final ArrayList g0;
    public CharSequence h;
    public ImageView h0;
    public z51 i0;
    public LinearLayout j0;
    public t1 k0;
    public int l0;
    public final ArrayList m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public LinearLayout p0;
    public v1 q0;
    public gj r;
    public v1 r0;
    public jh.f s;
    public v1 s0;
    public v1 t0;
    public v1 u0;
    public v1 v0;
    public qj w;
    public FrameLayout w0;
    public final Rect x;
    public fh0 x0;
    public fh.g y;
    public m60 y0;
    public u1 z0;

    public z1(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.a = editable;
    }

    public static void Z(z1 z1Var) {
        e3 e3Var = z1Var.Q.v3;
        if (e3Var != null && e3Var.x()) {
            z1Var.s0();
            return;
        }
        Activity parentActivity = z1Var.getParentActivity();
        new u(z1Var.currentAccount, parentActivity, new g7(z1Var, 16), z1Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void a0(z1 z1Var) {
        if (m10.i(z1Var.currentAccount).q()) {
            return;
        }
        z1Var.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) z1Var, 43, true));
    }

    public static boolean b0(z1 z1Var, View view) {
        an anVar = z1Var.K;
        if (anVar != null && z1Var.r == null && !anVar.c() && z1Var.Q.n3() && !z1Var.Q.p3()) {
            if (!z1Var.Q.P3()) {
                z1Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = z1Var.Q.c3();
            if (!c32.isEmpty()) {
                bg0 bg0Var = z1Var.P0;
                if (bg0Var != null) {
                    bg0Var.h(false);
                    z1Var.P0 = null;
                }
                bg0 bg0Var2 = new bg0(z1Var.getParentActivity(), z1Var.getResourceProvider());
                z1Var.P0 = bg0Var2;
                bg0Var2.setOnDismissListener(new r9(z1Var, 8));
                long a10 = z1Var.K.a();
                gj gjVar = z1Var.K.E5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = np.s1(z1Var.currentAccount).z1(a10);
                tL_message.from_id = np.s1(z1Var.currentAccount).z1(m10.i(z1Var.currentAccount).e());
                tL_message.flags2 |= TLObject.FLAG_13;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = z1Var.Q.E2();
                tL_message.rich_message.documents = z1Var.Q.B2();
                if (gjVar != null && !gjVar.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                gj gjVar2 = new gj(z1Var.currentAccount, tL_message, false, false);
                if (gjVar != null && !gjVar.p) {
                    gjVar2.C = gjVar;
                }
                gjVar2.B0 = true;
                gjVar2.W2 = Boolean.TRUE;
                gjVar2.n0(null);
                gjVar2.w1 = true;
                z1Var.P0.r(org.telegram.messenger.k5.j(gjVar2));
                z1Var.z0.setScaleX(1.0f);
                z1Var.z0.setScaleY(1.0f);
                jg s5 = z1Var.P0.s(z1Var.z0, true, new g1(z1Var, 10));
                if (s5 != null) {
                    s5.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), z1Var.getThemedColor(j6.Fi))));
                    bg0 bg0Var3 = z1Var.P0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    bg0Var3.p0 = true;
                    bg0Var3.Y = L;
                }
                m60 H = m60.H(z1Var, z1Var.z0);
                boolean B = q10.B(z1Var.K.j());
                if (z1Var.K.S6()) {
                    H.c(R.drawable.msg_calendar2, hd.M0(B ? 2131745514 : 2131745859, null), new di.x2(z1Var, a10, 15), false);
                    if (!B && a10 > 0) {
                        H.c(R.drawable.msg_online, hd.M0(2131745586, null), new f1(z1Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(R.drawable.input_notify_off, hd.M0(2131745583, null), new f1(z1Var, 6), false);
                }
                H.Y();
                z1Var.P0.q(H);
                z1Var.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void c0(final z1 z1Var, Context context, View view) {
        m60 m60Var = z1Var.y0;
        if (m60Var != null) {
            m60Var.u();
            z1Var.y0 = null;
        }
        final int i7 = 0;
        final int i10 = 1;
        boolean z10 = (np.s1(z1Var.currentAccount).s4() || m10.i(z1Var.currentAccount).q()) ? false : true;
        final a T2 = z1Var.Q.T2();
        final m60 I = m60.I(z1Var, view);
        I.Q = true;
        m60 J = I.J();
        J.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new bi.u3(I, 8), false);
        J.k();
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, hd.M0(2131754030, null), new Runnable(z1Var) { // from class: oi.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        final int i11 = 2;
        J.y().a.setTextSize(1, gz.W0 + 2);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, hd.M0(2131754029, null), new Runnable(z1Var) { // from class: oi.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, gz.W0 + 1);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, hd.M0(2131754028, null), new Runnable(z1Var) { // from class: oi.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, gz.W0);
        final int i12 = 3;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, hd.M0(2131754027, null), new Runnable(z1Var) { // from class: oi.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, gz.W0 - 1);
        final int i13 = 4;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, hd.M0(2131754026, null), new Runnable(z1Var) { // from class: oi.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, gz.W0 - 2);
        final int i14 = 5;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, hd.M0(2131754025, null), new Runnable(z1Var) { // from class: oi.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().a.setTextSize(1, gz.W0 - 3);
        boolean z11 = T2 != null && q3.F3(T2.b);
        x1 x1Var = new x1(context, R.drawable.iv_h);
        x1Var.a(z10);
        int i15 = j6.G8;
        x1Var.d = i15;
        I.j(z11, 0, x1Var, hd.M0(2131754031, null), new bi.n3(I, J, i12));
        I.y().a.setTypeface(org.telegram.messenger.g0.o());
        I.y().setPadding(org.telegram.messenger.g0.L(hd.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, hd.M0(2131753988, null), new j1(z1Var, T2, i12));
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, hd.M0(2131753996, null), new j1(z1Var, T2, 4));
        boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
        x1 x1Var2 = new x1(context, R.drawable.iv_pullquote);
        x1Var2.a(z10);
        x1Var2.d = i15;
        I.j(z12, 0, x1Var2, hd.M0(2131753997, null), new j1(z1Var, T2, i7));
        I.y().setPadding(org.telegram.messenger.g0.L(hd.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, hd.M0(2131754055, null), new j1(z1Var, T2, i10));
        boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
        x1 x1Var3 = new x1(context, R.drawable.iv_footer);
        x1Var3.a(z10);
        x1Var3.d = i15;
        I.j(z13, 0, x1Var3, hd.M0(2131754032, null), new j1(z1Var, T2, i11));
        I.y().setPadding(org.telegram.messenger.g0.L(hd.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 9.0f : 18.0f), 0);
        I.Z();
        z1Var.y0 = I;
    }

    public static void d0(z1 z1Var, gj gjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, gj gjVar2, gj gjVar3, qm qmVar, boolean z10, int i7, int i10, fw fwVar, long j10) {
        if (gjVar == null) {
            ez.R(org.telegram.messenger.c.a(z1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j3, gjVar2, gjVar3, qmVar, z10, i7, i10, fwVar, 0L, j10, 0L);
            return;
        }
        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(z1Var.currentAccount);
        an anVar = z1Var.K;
        org.telegram.messenger.p5 p5Var = ez.J;
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
            ez.j(pageBlock2, identityHashMap);
        }
        ez.C(a10.a).v(gjVar, richMessage, arrayList4, anVar, false);
    }

    public static void e0(z1 z1Var, boolean z10, boolean z11) {
        if (z1Var.K0 == z10 && z11) {
            return;
        }
        z1Var.K0 = z10;
        float f10 = z10 ? 1.15f : 1.0f;
        if (z11) {
            z1Var.x0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(er.h).start();
        } else {
            z1Var.x0.animate().cancel();
            z1Var.x0.setScaleX(f10);
            z1Var.x0.setScaleY(f10);
        }
        q6.s(z1Var.x0, z10 ? j6.q7 : j6.G6, z1Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        ch0 animatedDrawable = z1Var.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z10) {
                if (animatedDrawable.b0 > 34) {
                    animatedDrawable.N(0, false, false);
                }
                animatedDrawable.P(33);
            } else {
                animatedDrawable.P(0);
            }
            animatedDrawable.start();
        }
    }

    public static e1 f0(z1 z1Var) {
        e1 focusedEditTextOrNull = z1Var.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            e1 e1Var = z1Var.S0;
            return e1Var != null ? e1Var : z1Var.Q.S2();
        }
        z1Var.S0 = focusedEditTextOrNull;
        z1Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int g0(z1 z1Var, e1 e1Var) {
        return (e1Var != z1Var.S0 || z1Var.Q.getFocusedEditTextOrNull() == e1Var) ? Math.max(0, e1Var.getSelectionEnd()) : Math.min(z1Var.T0, e1Var.length());
    }

    public static String l0(int i7) {
        if (i7 == 1) {
            return hd.M0(2131754854, null);
        }
        if (i7 == 2) {
            return hd.M0(2131754860, null);
        }
        if (i7 == 4) {
            return hd.M0(2131754855, null);
        }
        if (i7 == 7) {
            return hd.M0(2131754864, null);
        }
        if (i7 != 9) {
            return null;
        }
        return hd.M0(2131754869, null);
    }

    public static String n0(int i7) {
        if (i7 == 1) {
            return hd.M0(2131753671, null);
        }
        if (i7 == 2) {
            return hd.M0(2131749087, null);
        }
        if (i7 == 16) {
            return hd.M0(2131743889, null);
        }
        if (i7 == 8) {
            return hd.M0(2131744437, null);
        }
        if (i7 == 256) {
            return hd.M0(2131745262, null);
        }
        if (i7 == 4) {
            return hd.M0(2131748350, null);
        }
        if (i7 == 65536) {
            return hd.M0(2131749303, null);
        }
        if (i7 == 16384) {
            return hd.M0(2131744425, null);
        }
        if (i7 == 32768) {
            return hd.M0(2131744327, null);
        }
        return null;
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, e6 e6Var) {
        final int i7 = 1;
        final int i10 = 0;
        final org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        k10.O = f10;
        ImageView e10 = i20.e(context, R.drawable.large_article);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = j6.Fi;
        ShapeDrawable L2 = j6.L(L, j6.w0(i11, e6Var));
        m6 M = q6.M(i11);
        e10.setBackground(L2);
        q6.j(e10, L2, M, null, e6Var);
        f10.addView(e10, ja.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i12 = j6.G6;
        q6.U(textView, i12, e6Var);
        TextView f11 = i20.f(f10, textView, ja.t(-1, -2, 49, 25, 16, 25, 0), context);
        f11.setText(org.telegram.messenger.g0.X2(hd.M0(2131754042, null)));
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        q6.U(f11, i12, e6Var);
        f10.addView(f11, ja.t(-1, -2, 49, 25, 11, 25, 0));
        hi.d g10 = i20.g(24, context, e6Var, true);
        g10.setText(hd.M0(2131754043, null));
        f10.addView(g10, ja.t(-1, 48, 49, 14, 31, 14, 0));
        hi.d g11 = i20.g(24, context, e6Var, false);
        g11.setText(hd.M0(2131754044, null));
        f10.addView(g11, ja.t(-1, 48, 49, 14, 2, 14, 6));
        k10.show();
        g10.setOnClickListener(new View.OnClickListener() { // from class: oi.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
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
        g11.setOnClickListener(new View.OnClickListener() { // from class: oi.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
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

    public final void A0() {
        this.s.getLocationInWindow(this.G);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.y.getBounds());
        this.E = rectF;
        rectF.offset(r1[0], r1[1]);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.w.getLocationInWindow(this.H);
        if (this.I == null) {
            this.I = new int[2];
        }
        this.I[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        this.I[0] = (int) (r0[0] - (this.w.F0.getX() - org.telegram.messenger.g0.L(16.0f)));
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
        h9 textSelectionHelper = this.Q.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = this.Q.T2();
        } else {
            int i11 = textSelectionHelper.p0;
            T2 = i11 == textSelectionHelper.s0 ? this.Q.B4(i11) : null;
        }
        if (this.Q.U2() == null) {
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
                            ArrayList arrayList = this.g0;
                            size = arrayList.size();
                            i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                v1 v1Var = (v1) obj;
                                int intValue = ((Integer) v1Var.getTag()).intValue();
                                v1Var.setSelected(i7 == intValue);
                                if (i7 == intValue) {
                                    v1Var.setEnabled(true);
                                    if (T2 == null) {
                                        v1Var.a();
                                    } else if (i7 == 1) {
                                        TL_iv.PageBlock pageBlock2 = T2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            v1Var.e(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            v1Var.e(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            v1Var.e(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            v1Var.e(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            v1Var.e(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            v1Var.e(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            v1Var.e(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            v1Var.e(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            v1Var.e(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            v1Var.e(R.drawable.iv_footer);
                                        } else {
                                            v1Var.a();
                                        }
                                    } else if (i7 == 2) {
                                        if (T2.a()) {
                                            v1Var.e(R.drawable.iv_todo);
                                        } else if (T2.c()) {
                                            v1Var.e(R.drawable.iv_ordered_list);
                                        } else {
                                            v1Var.a();
                                        }
                                    } else if (i7 == 8) {
                                        v1Var.e(R.drawable.iv_details);
                                    } else {
                                        v1Var.a();
                                    }
                                } else {
                                    v1Var.setEnabled(i7 != 4);
                                    v1Var.a();
                                }
                            }
                        }
                    }
                }
                i7 = 2;
                ArrayList arrayList2 = this.g0;
                size = arrayList2.size();
                i10 = 0;
                while (i10 < size) {
                }
            }
            i7 = 0;
            ArrayList arrayList22 = this.g0;
            size = arrayList22.size();
            i10 = 0;
            while (i10 < size) {
            }
        }
        i7 = 4;
        ArrayList arrayList222 = this.g0;
        size = arrayList222.size();
        i10 = 0;
        while (i10 < size) {
        }
    }

    public final void C0(int i7, boolean z10) {
        if (this.L0 == i7) {
            return;
        }
        this.L0 = i7;
        if (z10) {
            this.b0.setVisibility(0);
            ViewPropertyAnimator duration = this.b0.animate().alpha(this.L0 == 0 ? 1.0f : 0.0f).scaleX(this.L0 == 0 ? 1.0f : 0.8f).scaleY(this.L0 == 0 ? 1.0f : 0.8f).translationY(this.L0 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L);
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new f1(this, 1)).start();
            this.i0.setVisibility(0);
            this.i0.animate().alpha(this.L0 == 1 ? 1.0f : 0.0f).scaleX(this.L0 == 1 ? 1.0f : 0.8f).scaleY(this.L0 == 1 ? 1.0f : 0.8f).translationY(this.L0 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L).setInterpolator(erVar).withEndAction(new f1(this, 2)).start();
            this.w0.setVisibility(0);
            this.w0.animate().alpha(this.L0 == 2 ? 1.0f : 0.0f).scaleX(this.L0 == 2 ? 1.0f : 0.8f).scaleY(this.L0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(erVar).withEndAction(new f1(this, 3)).start();
            return;
        }
        this.b0.setVisibility(i7 == 0 ? 0 : 8);
        this.b0.setAlpha(i7 == 0 ? 1.0f : 0.0f);
        this.b0.setScaleX(i7 == 0 ? 1.0f : 0.8f);
        this.b0.setScaleY(i7 == 0 ? 1.0f : 0.8f);
        this.b0.setTranslationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        this.i0.setVisibility(i7 == 1 ? 0 : 8);
        this.i0.setAlpha(i7 == 1 ? 1.0f : 0.0f);
        this.i0.setScaleX(i7 == 1 ? 1.0f : 0.8f);
        this.i0.setScaleY(i7 == 1 ? 1.0f : 0.8f);
        this.i0.setTranslationY(i7 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        this.w0.setVisibility(i7 != 2 ? 8 : 0);
        this.w0.setAlpha(i7 == 2 ? 1.0f : 0.0f);
        this.w0.setScaleX(i7 == 2 ? 1.0f : 0.8f);
        this.w0.setScaleY(i7 == 2 ? 1.0f : 0.8f);
    }

    public final void D0() {
        boolean z10;
        boolean z11;
        h9 textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        v1 v1Var = this.v0;
        boolean z12 = false;
        if (v1Var != null) {
            q3 q3Var = this.Q;
            int[] E4 = q3Var.E4();
            v1Var.setSelected(E4 != null && q3Var.K3(E4[0], E4[1]));
        }
        if (this.Q.O3()) {
            h9 textSelectionHelper2 = this.Q.getTextSelectionHelper();
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
                v1 v1Var2 = (v1) obj;
                v1Var2.setSelected(this.Q.N3(((Integer) v1Var2.getTag()).intValue(), i7, i10, i12, i11, i13));
            }
            boolean z13 = i10 == i11;
            e1 Q4 = z13 ? this.Q.Q4(i7, i10) : null;
            int max = Math.max(0, Math.min(i12, i13));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i12, i13), Q4.length()));
            v1 v1Var3 = this.r0;
            if (v1Var3 != null) {
                v1Var3.setSelected(Q4 != null && max < max2 && a6.h(Q4.getText(), max, max2));
            }
            v1 v1Var4 = this.t0;
            if (v1Var4 != null) {
                if (Q4 != null && max < max2 && a6.g(Q4.getText(), max, max2)) {
                    z12 = true;
                }
                v1Var4.setSelected(z12);
            }
            y0(true);
            z0(z13, this.Q.o2());
            return;
        }
        if (this.Q.z3()) {
            h9 textSelectionHelper3 = this.Q.getTextSelectionHelper();
            e1 v22 = this.Q.v2(textSelectionHelper3.p0);
            int i15 = textSelectionHelper3.r0;
            int i16 = textSelectionHelper3.u0;
            int max3 = v22 == null ? 0 : Math.max(0, Math.min(Math.min(i15, i16), v22.length()));
            int max4 = v22 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), v22.length()));
            int size2 = arrayList.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList.get(i17);
                i17++;
                v1 v1Var5 = (v1) obj2;
                v1Var5.setSelected((v22 == null || max3 >= max4 || (((Integer) v1Var5.getTag()).intValue() & v22.c(max3, max4)) == 0) ? false : true);
            }
            v1 v1Var6 = this.r0;
            if (v1Var6 != null) {
                v1Var6.setSelected(v22 != null && max3 < max4 && a6.h(v22.getText(), max3, max4));
            }
            v1 v1Var7 = this.t0;
            if (v1Var7 != null) {
                if (v22 != null && max3 < max4 && a6.g(v22.getText(), max3, max4)) {
                    z12 = true;
                }
                v1Var7.setSelected(z12);
            }
            y0(true);
            z0(true, this.Q.o2());
            return;
        }
        int i18 = textSelectionHelper.p0;
        int i19 = textSelectionHelper.s0;
        int i20 = textSelectionHelper.r0;
        int i21 = textSelectionHelper.u0;
        boolean z14 = i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.Q.x4.size();
        int size3 = arrayList.size();
        int i22 = 0;
        while (i22 < size3) {
            int i23 = i22 + 1;
            v1 v1Var8 = (v1) arrayList.get(i22);
            v1Var8.setSelected(z14 && this.Q.M3(((Integer) v1Var8.getTag()).intValue(), i18, i20, i19, i21));
            i22 = i23;
        }
        y0(!this.Q.L3());
        v1 v1Var9 = this.r0;
        if (v1Var9 != null) {
            if (z14) {
                Editable K4 = this.Q.K4(i18, i20, i19, i21);
                if (K4 == null ? false : a6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z11 = true;
                    v1Var9.setSelected(z11);
                }
            }
            z11 = false;
            v1Var9.setSelected(z11);
        }
        v1 v1Var10 = this.t0;
        if (v1Var10 != null) {
            if (z14) {
                Editable K42 = this.Q.K4(i18, i20, i19, i21);
                if (K42 == null ? false : a6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z10 = true;
                    v1Var10.setSelected(z10);
                }
            }
            z10 = false;
            v1Var10.setSelected(z10);
        }
        if (z14 && i18 == i19) {
            z12 = true;
        }
        z0(z12, this.Q.o2());
    }

    public final void E0() {
        boolean u22 = this.Q.u2();
        d2 d2Var = this.Q.R3;
        boolean z10 = (d2Var == null || d2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setEnabled(u22);
            this.W.setAlpha(u22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.X;
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            this.X.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void F0() {
        int i7 = 0;
        boolean z10 = (np.s1(this.currentAccount).s4() || m10.i(this.currentAccount).q()) ? false : true;
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((v1) obj).setPremiumLocked(z10);
        }
    }

    public final void G0() {
        if (this.z0 == null) {
            return;
        }
        boolean P3 = this.Q.P3();
        this.z0.setEnabled(P3);
        i20.m(this.z0.animate(), P3 ? 1.0f : 0.5f, 150L);
    }

    public final void H0() {
        u1 u1Var = this.z0;
        if (u1Var == null) {
            return;
        }
        u1Var.setLocked(r0());
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new r1(this, context);
        int i10 = 1;
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.G0 = np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        ki.z1 z1Var = new ki.z1(this, i10);
        this.I0 = z1Var;
        this.P.r.add(z1Var);
        q3 q3Var = new q3(context, this.currentAccount, getResourceProvider(), new ia.d(this, 17));
        this.Q = q3Var;
        q3Var.setFileRefParentObject(this.r);
        this.P.addView(this.Q, ja.e(-1, -1, ns.E1));
        this.P.addView(this.Q.getOverlayView(), ja.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            q3 q3Var2 = this.Q;
            ArrayList arrayList2 = q3Var2.t3;
            q3Var2.s3 = richMessage;
            q3.Z2(arrayList2, richMessage.blocks, q3Var2.u3);
            q3Var2.Y3();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                q3Var2.y4((a) arrayList2.get(i11));
            }
            q3Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                q3 q3Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = q3Var3.u3;
                ArrayList arrayList3 = q3Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    q3.Z2(arrayList3, y4.b(charSequence), hashMap);
                }
                arrayList3.addAll(q3Var3.z4(y3.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    q3.Z2(arrayList3, y4.b(charSequence2), hashMap);
                }
                q3Var3.Y3();
                q3Var3.g3.O(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.Q.setInitialText(charSequence3);
                }
            }
        }
        d2 d2Var = this.Q.R3;
        if (d2Var != null) {
            d2Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = j6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i12), j6.r1(0.0f, getThemedColor(i12))}));
        this.P.addView(this.R, ja.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{j6.r1(0.0f, getThemedColor(i12)), getThemedColor(i12)}));
        this.P.addView(this.S, ja.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, ja.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = j6.i6;
        imageView3.setBackground(new y1(j6.b0(themedColor, j6.w(themedColor2, getThemedColor(i13)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.U;
        int i14 = j6.G6;
        e6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(imageView4, i14, resourceProvider, mode);
        na.a(this.U);
        this.U.setContentDescription(hd.M0(2131754878, null));
        this.U.setOnClickListener(new g1(this, i10));
        this.T.addView(this.U, ja.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.T.addView(this.V, ja.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.W.setScaleType(scaleType);
        q6.Q(this.W, j6.h0(getThemedColor(i13), 1, -1), null, q6.M(i13), getResourceProvider());
        q6.s(this.W, i14, getResourceProvider(), mode);
        na.a(this.W);
        this.W.setContentDescription(hd.M0(2131743887, null));
        this.W.setOnClickListener(new g1(this, 2));
        this.V.addView(this.W, ja.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.X.setScaleType(scaleType);
        q6.Q(this.X, j6.h0(getThemedColor(i13), 1, -1), null, q6.M(i13), getResourceProvider());
        q6.s(this.X, i14, getResourceProvider(), mode);
        na.a(this.X);
        this.X.setContentDescription(hd.M0(2131746342, null));
        this.X.setOnClickListener(new g1(this, 3));
        this.V.addView(this.X, ja.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, ja.e(-1, ns.q2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.Z.addView(this.a0, ja.e(-1, ns.q2, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.b0.setClipChildren(false);
        this.b0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.a0.addView(this.b0, ja.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.a0.addView(frameLayout4, ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.d0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.t2(context));
        this.d0.setScaleType(scaleType);
        q6.s(this.d0, i14, getResourceProvider(), mode);
        this.d0.setBackground(new y1(j6.b0(getThemedColor(i12), j6.w(getThemedColor(i12), getThemedColor(i13)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.b0.addView(this.d0, ja.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        na.a(this.d0);
        this.d0.setContentDescription(hd.M0(2131755006, null));
        this.d0.setOnClickListener(new g1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        frameLayout5.addView(frameLayout6, ja.e(-2, 44, 81));
        s1 s1Var = new s1(context, 0);
        this.e0 = s1Var;
        s1Var.setClipToOutline(true);
        this.e0.setOutlineProvider(new bg.p0(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f0.setOrientation(0);
        this.e0.addView(this.f0);
        frameLayout6.addView(this.e0, ja.c(-1.0f, -1));
        pg pgVar = new pg(context, 24);
        this.c0 = pgVar;
        pgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        q6.s(this.c0, i14, getResourceProvider(), mode);
        q6.Q(this.c0, j6.b0(getThemedColor(i12), getThemedColor(i13), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), q6.M(i12), q6.M(i13), getResourceProvider());
        this.c0.j(ng.e, false);
        this.f0.addView(this.c0, ja.r(38, 38, 16));
        na.a(this.c0);
        this.c0.setContentDescription(hd.M0(2131754884, null));
        this.c0.setOnClickListener(new g1(this, 5));
        h0(R.drawable.iv_text, 1, false).setOnClickListener(new ai.t2(29, this, context));
        h0(R.drawable.iv_lists, 2, true).setOnClickListener(new g1(this, 6));
        h0(R.drawable.iv_table, 4, true).setOnClickListener(new g1(this, 7));
        h0(R.drawable.iv_math, 7, true).setOnClickListener(new g1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.h0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.h0.setScaleType(scaleType);
        q6.s(this.h0, i14, getResourceProvider(), mode);
        q6.Q(this.h0, j6.b0(getThemedColor(i12), getThemedColor(i13), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), q6.M(i12), q6.M(i13), getResourceProvider());
        this.f0.addView(this.h0, ja.t(38, 38, 16, 2, 0, 0, 0));
        na.a(this.h0);
        this.h0.setContentDescription(hd.M0(2131754921, null));
        this.h0.setOnClickListener(new g1(this, 9));
        this.b0.addView(frameLayout5, ja.l(1.0f, 0, 44));
        z51 z51Var = new z51(7, context, this);
        this.i0 = z51Var;
        z51Var.setOrientation(0);
        this.i0.setClipToPadding(false);
        this.i0.setClipChildren(false);
        this.i0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.i0, ja.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.w0.setClipToPadding(false);
        this.w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.w0, ja.e(80, 60, 81));
        fh0 fh0Var = new fh0(context);
        this.x0 = fh0Var;
        fh0Var.f(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        ch0 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.x0.setScaleType(scaleType);
        q6.s(this.x0, i14, getResourceProvider(), mode);
        this.x0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.w0.addView(this.x0, ja.e(-1, -1, ns.E1));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(frameLayout8, ja.c(44.0f, -2));
        t1 t1Var = new t1(this, context);
        this.k0 = t1Var;
        t1Var.setHorizontalScrollBarEnabled(false);
        this.k0.setClipToOutline(true);
        this.k0.setOutlineProvider(new bg.p0(5));
        frameLayout8.addView(this.k0, ja.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.j0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.k0.addView(this.j0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, R.drawable.formatting_bold, 1, false);
        i0(context, R.drawable.formatting_italic, 2, false);
        i0(context, R.drawable.formatting_underline, 16, false);
        i0(context, R.drawable.formatting_strikethrough, 8, false);
        i0(context, R.drawable.formatting_spoiler, 256, false);
        i0(context, R.drawable.iv_code, 4, false);
        i0(context, R.drawable.formatting_marked, 65536, true);
        i0(context, R.drawable.iv_sub, TLObject.FLAG_14, true);
        i0(context, R.drawable.iv_super, 32768, true);
        v1 v1Var = new v1(R.drawable.iv_quote, context, getResourceProvider());
        this.v0 = v1Var;
        v1Var.setContentDescription(hd.M0(2131746440, null));
        this.v0.setOnClickListener(new g1(this, 11));
        LinearLayout linearLayout5 = this.j0;
        linearLayout5.addView(this.v0, ja.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        v1 v1Var2 = new v1(R.drawable.iv_button, context, getResourceProvider());
        this.s0 = v1Var2;
        v1Var2.setContentDescription(hd.M0(2131746011, null));
        this.s0.setOnClickListener(new g1(this, 12));
        LinearLayout linearLayout6 = this.j0;
        linearLayout6.addView(this.s0, ja.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.o0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(this.o0, ja.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var3 = new v1(R.drawable.media_link_24, context, getResourceProvider());
        this.r0 = v1Var3;
        v1Var3.setContentDescription(hd.M0(2131751744, null));
        this.r0.setOnClickListener(new g1(this, 13));
        this.o0.addView(this.r0, ja.r(38, 38, 16));
        v1 v1Var4 = new v1(R.drawable.msg_calendar2, context, getResourceProvider());
        this.t0 = v1Var4;
        v1Var4.setContentDescription(hd.M0(2131754862, null));
        this.t0.setOnClickListener(new g1(this, 14));
        this.o0.addView(this.t0, ja.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.p0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.p0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(this.p0, ja.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var5 = new v1(R.drawable.iv_math, context, getResourceProvider());
        this.u0 = v1Var5;
        v1Var5.d();
        arrayList.add(this.u0);
        this.u0.setContentDescription(hd.M0(2131754864, null));
        this.u0.setOnClickListener(new g1(this, 15));
        this.p0.addView(this.u0, ja.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.n0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(this.n0, 0, ja.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        v1 v1Var6 = new v1(0, context, getResourceProvider());
        this.q0 = v1Var6;
        v1Var6.setImageDrawable(new org.telegram.ui.ActionBar.t2(context));
        this.q0.setContentDescription(hd.M0(2131755006, null));
        this.q0.setOnClickListener(new g1(this, 16));
        this.n0.addView(this.q0, ja.r(38, 38, 16));
        u1 u1Var = new u1(this, context, this.r != null ? R.drawable.input_done : q0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider());
        this.z0 = u1Var;
        u1Var.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(j6.Pe))));
        na.a(this.z0);
        this.b0.addView(this.z0, ja.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.z0.setContentDescription(hd.M0(2131745640, null));
        this.z0.setOnClickListener(new g1(this, i7));
        this.z0.setOnLongClickListener(new hi.p4(this, 4));
        H0();
        this.P.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, i10));
        F0();
        if (this.e) {
            this.Q.F2();
            this.e = false;
        }
        r1 r1Var = this.P;
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f5) {
            H0();
            F0();
        }
    }

    public final v1 h0(int i7, int i10, boolean z10) {
        v1 v1Var = new v1(i7, this.f0.getContext(), getResourceProvider());
        if (z10) {
            v1Var.d();
            this.O.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(l0(i10));
        this.g0.add(v1Var);
        LinearLayout linearLayout = this.f0;
        linearLayout.addView(v1Var, ja.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return v1Var;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i7, int i10, boolean z10) {
        v1 v1Var = new v1(i7, context, getResourceProvider());
        if (z10) {
            v1Var.d();
            this.O.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(n0(i10));
        v1Var.setOnClickListener(new ci.q(this, i10, 7));
        this.m0.add(v1Var);
        LinearLayout linearLayout = this.j0;
        linearLayout.addView(v1Var, ja.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        q3 q3Var = this.Q;
        if (q3Var == null || !q3Var.v3.x()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(boolean z10) {
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, z10 ? 1.0f : 0.0f);
        this.Q0 = ofFloat;
        ofFloat.addUpdateListener(new h1(this, 0));
        this.Q0.setInterpolator(er.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        ly lyVar = this.B0;
        if (lyVar == null || (layoutParams = (FrameLayout.LayoutParams) lyVar.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.P == null ? o0() : Math.max(o0(), ((r2.getMeasuredHeight() - this.P.getPaddingTop()) - org.telegram.messenger.g0.L(240.0f)) - this.U0)) - r1) * this.R0) + o0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.B0.setLayoutParams(layoutParams);
        }
    }

    public final void m0() {
        FrameLayout.LayoutParams layoutParams;
        ly lyVar = this.B0;
        if (lyVar != null && (layoutParams = (FrameLayout.LayoutParams) lyVar.getLayoutParams()) != null) {
            int i7 = layoutParams.bottomMargin;
            int i10 = this.U0;
            if (i7 != i10) {
                layoutParams.bottomMargin = i10;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        k0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, org.telegram.messenger.g0.L(60.0f), 0, org.telegram.messenger.g0.L(110.0f) + max);
        q3 q3Var = this.Q;
        int i11 = this.U0;
        int i12 = this.V0;
        int i13 = this.E0;
        q3Var.W3 = i11;
        q3Var.X3 = i12;
        q3Var.Y3 = i13;
        this.Z.setTranslationY(-max);
        this.S.setTranslationY(r0 + this.U0);
    }

    public final int o0() {
        Point point = org.telegram.messenger.g0.q;
        int i7 = point.x > point.y ? this.G0 : this.F0;
        return i7 <= 0 ? org.telegram.messenger.g0.L(200.0f) : i7;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i10 != -1 || i7 != 21) {
            if (i10 != -1 || (i7 != 1 && i7 != 14)) {
                super.onActivityResultFragment(i7, i10, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.Q.h2(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        q3 q3Var = this.Q;
        Uri data = intent.getData();
        if (data == null) {
            q3Var.getClass();
        } else {
            if (q3Var.getContext() == null) {
                return;
            }
            Utilities.e.c(new kg.t1(26, q3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.D0;
        if (z11) {
            if (z11) {
                this.D0 = false;
                ly lyVar = this.B0;
                if (lyVar != null) {
                    lyVar.t(false);
                    this.B0.A();
                }
                j0(false);
                return false;
            }
        } else {
            if (this.C0) {
                p0(true);
                return false;
            }
            if (!this.Q.I2()) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        int i7 = 1;
        if (!z10 && !this.W0) {
            v0();
            this.W0 = true;
        }
        if (org.telegram.messenger.g0.Q1() || this.s == null || this.w == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        jh.f fVar = this.s;
        this.y = fVar.h;
        fVar.e = false;
        fVar.invalidate();
        this.w.setAlpha(0.0f);
        int i10 = 4;
        this.w.i2.setVisibility(4);
        A0();
        float f10 = z10 ? 0.0f : 1.0f;
        this.J = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        this.F = true;
        this.P.invalidate();
        ofFloat.addUpdateListener(new h1(this, i7));
        ofFloat.addListener(new ah.l(11, this, runnable));
        if (z10) {
            FrameLayout frameLayout = this.T;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.T;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<q3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.T;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.T;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<q3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(er.h);
        this.P.post(new fq0(animatorSet, i10));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.f5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        ki.z1 z1Var;
        ns.f(this.currentAccount).n(this, ns.f5);
        if (!this.W0) {
            v0();
            this.W0 = true;
        }
        l1 l1Var = this.O0;
        if (l1Var != null) {
            this.O0 = null;
            org.telegram.messenger.g0.h3(l1Var);
        }
        bg0 bg0Var = this.P0;
        if (bg0Var != null) {
            bg0Var.i();
            this.P0 = null;
        }
        q3 q3Var = this.Q;
        if (q3Var != null) {
            q3Var.J2();
        }
        ga.d dVar = this.A0;
        if (dVar != null) {
            dVar.c();
        }
        super.onFragmentDestroy();
        ly lyVar = this.B0;
        if (lyVar != null) {
            lyVar.B();
        }
        r1 r1Var = this.P;
        if (r1Var == null || (z1Var = this.I0) == null) {
            return;
        }
        r1Var.r.remove(z1Var);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.U0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        m0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        m60 m60Var;
        i0.c f10 = k1Var.a.f(3);
        int i7 = k1Var.a.f(8).d;
        this.V0 = i7;
        int i10 = i7 - f10.d;
        boolean z10 = this.H0;
        boolean z11 = i10 > org.telegram.messenger.g0.L(20.0f);
        this.H0 = z11;
        if (z11 && i10 > org.telegram.messenger.g0.L(50.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.G0 = i10;
                np.d1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i10;
                np.d1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z10 && this.C0 && !this.D0) {
            p0(false);
        }
        if (!this.H0 && z10 && (m60Var = this.y0) != null) {
            m60Var.u();
            this.y0 = null;
        }
        onInsets(f10.a, f10.b, f10.c, f10.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i7 = j6.d6;
            int themedColor = getThemedColor(i7);
            int i10 = j6.i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = j6.Pe;
            int themedColor3 = getThemedColor(i11);
            if (this.a1 && themedColor == this.X0 && themedColor2 == this.Y0 && themedColor3 == this.Z0) {
                return;
            }
            this.a1 = true;
            this.X0 = themedColor;
            this.Y0 = themedColor2;
            this.Z0 = themedColor3;
            View view = this.R;
            if (view != null) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i7), j6.r1(0.0f, getThemedColor(i7))}));
            }
            View view2 = this.S;
            if (view2 != null) {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7)}));
            }
            ImageView imageView = this.U;
            if (imageView != null) {
                imageView.setBackground(new y1(j6.b0(getThemedColor(i7), j6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
            }
            LinearLayout linearLayout = this.V;
            if (linearLayout != null) {
                linearLayout.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            ImageView imageView2 = this.d0;
            if (imageView2 != null) {
                imageView2.setBackground(new y1(j6.b0(getThemedColor(i7), j6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
            }
            fh0 fh0Var = this.x0;
            if (fh0Var != null) {
                fh0Var.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            LinearLayout linearLayout2 = this.o0;
            if (linearLayout2 != null) {
                linearLayout2.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            LinearLayout linearLayout3 = this.p0;
            if (linearLayout3 != null) {
                linearLayout3.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            LinearLayout linearLayout4 = this.n0;
            if (linearLayout4 != null) {
                linearLayout4.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
            }
            u1 u1Var = this.z0;
            if (u1Var != null) {
                u1Var.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        q3 q3Var;
        int i7;
        q3 q3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i7 = this.c) >= 0 && (q3Var2 = this.Q) != null) {
            int i10 = this.d;
            this.d = -1;
            this.c = -1;
            if (q3Var2.c2(i7, i10)) {
                return;
            }
            q3Var2.post(new l2(q3Var2, i7, i10, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.b == null && this.f == null) || (q3Var = this.Q) == null || q3Var.d3()) {
            return;
        }
        q3Var.post(new b(q3Var, 5));
    }

    public final void p0(boolean z10) {
        if (this.D0) {
            this.D0 = false;
            ly lyVar = this.B0;
            if (lyVar != null) {
                lyVar.t(false);
                this.B0.A();
            }
        }
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        this.R0 = 0.0f;
        this.S0 = null;
        ly lyVar2 = this.B0;
        if (lyVar2 != null) {
            lyVar2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            m0();
        }
        pg pgVar = this.c0;
        if (pgVar != null) {
            pgVar.j(ng.e, z10);
        }
    }

    public final boolean q0() {
        an anVar;
        return this.r == null && (anVar = this.K) != null && anVar.c();
    }

    public final boolean r0() {
        if (np.s1(this.currentAccount).s4() || m10.i(this.currentAccount).q()) {
            return false;
        }
        q3 q3Var = this.Q;
        return y4.d(q3Var.t3, q3Var.u3);
    }

    public final void s0() {
        h3 k22 = this.Q.k2();
        if (k22 == null) {
            return;
        }
        TL_iv.RichMessage a10 = k22.a();
        if (a10.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(getParentActivity(), getResourceProvider());
        d0Var.r1(a10);
        d0Var.g2 = new g7(k22, 14);
        d0Var.show();
    }

    public final void t0(int i7, int i10) {
        q3 q3Var = this.Q;
        q3Var.k4 = q3Var.T2();
        ki kiVar = new ki(getParentActivity(), this, false, false, true, getResourceProvider());
        kiVar.X3 = new o1(this, kiVar);
        kiVar.e2.setIncludeVideosInGallery(true);
        kiVar.e2.i0();
        kiVar.y1(1, true);
        kiVar.V0(i7);
        kiVar.u4 = new n1(this, kiVar);
        kiVar.T1 = new n1(this, kiVar);
        kiVar.S1 = new p1(this, kiVar);
        kiVar.e1();
        if (i10 != 0) {
            kiVar.o1(i10);
        }
        kiVar.A0(true);
        kiVar.show();
    }

    public final boolean v0() {
        Runnable runnable;
        if (this.K == null || this.r != null || !this.Q.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = this.N ? null : this.Q.m2();
        if (m22 == null && (runnable = this.M) != null) {
            runnable.run();
        }
        qj qjVar = this.K.a0;
        if (m22 != null && !this.N) {
            q3 q3Var = this.Q;
            if (q3Var.n3() && !y4.d(q3Var.t3, q3Var.u3) && qjVar != null) {
                SpannableStringBuilder g10 = y4.g(this.Q.t3);
                an anVar = qjVar.x3;
                if (qjVar.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                org.telegram.messenger.j6.m(spannableStringBuilder, qjVar.F0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p5.class);
                if (p5VarArr != null) {
                    for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                        p5Var.applyFontMetrics(qjVar.F0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.g5.f());
                    }
                }
                xg0.a(spannableStringBuilder);
                if (anVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    si.b0(qjVar.R).Q1(anVar.a(), anVar.Q7(anVar.E5), charSequenceArr[0], si.b0(qjVar.R).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                qjVar.setRichDraftPreview(null);
                if (qjVar.F0.getText() != null) {
                    qjVar.F0.getText().clear();
                }
                qjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        si mediaDataController = getMediaDataController();
        long a10 = this.K.a();
        an anVar2 = this.K;
        mediaDataController.Q1(a10, anVar2.Q7(anVar2.E5), "", null, null, null, null, 0L, false, false, m22);
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
            q3 q3Var = this.Q;
            Objects.requireNonNull(q3Var);
            u0(parentActivity, new b(q3Var, 0), new f1(this, 4), getResourceProvider());
            return;
        }
        if (q0()) {
            org.telegram.ui.Components.t4.J(getParentActivity(), this.K.a(), new hi.l0(this, 18), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [oi.l1] */
    public final void x0(final int i7, final int i10, final boolean z10) {
        qj qjVar;
        cg cgVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            q3 q3Var = this.Q;
            Objects.requireNonNull(q3Var);
            u0(parentActivity, new b(q3Var, 0), new f1(this, 4), getResourceProvider());
            return;
        }
        if (this.K == null || !this.Q.n3() || this.Q.p3()) {
            return;
        }
        if (!this.Q.P3()) {
            G0();
            return;
        }
        if (!np.s1(this.currentAccount).s4()) {
            qj qjVar2 = this.K.a0;
            if (qjVar2 == null) {
                return;
            }
            this.N = true;
            Runnable runnable = this.L;
            if (runnable != null) {
                runnable.run();
            }
            qjVar2.i1(y4.g(this.Q.t3), z10, i7, i10);
            finishFragment();
            return;
        }
        this.N = true;
        final ArrayList c32 = this.Q.c3();
        if (c32.isEmpty()) {
            return;
        }
        final ArrayList E2 = this.Q.E2();
        final ArrayList B2 = this.Q.B2();
        final ArrayList a10 = x4.a(this.currentAccount, c32);
        final long a11 = this.K.a();
        an anVar = this.K;
        final gj gjVar = anVar.E5;
        final gj gjVar2 = anVar.m4;
        final qm qmVar = anVar.C5;
        final long j92 = anVar.j9();
        final fw Y8 = this.K.Y8();
        final gj gjVar3 = this.r;
        ?? r02 = new Runnable() { // from class: oi.l1
            @Override // java.lang.Runnable
            public final void run() {
                z1.d0(z1.this, gjVar3, c32, E2, B2, a10, a11, gjVar, gjVar2, qmVar, z10, i7, i10, Y8, j92);
            }
        };
        Runnable runnable2 = this.L;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (gjVar3 == null && (qjVar = this.K.a0) != null && (cgVar = qjVar.H3) != null) {
            cgVar.M(null, z10, i7, i10, 0L);
        }
        if (i7 == 0 || gjVar3 != null) {
            r02.run();
            finishFragment();
        } else {
            this.O0 = r02;
            finishFragment();
        }
    }

    public final void y0(boolean z10) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            if (((Integer) v1Var.getTag()).intValue() == 1) {
                v1Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        v1 v1Var = this.r0;
        if (v1Var != null) {
            v1Var.setEnabled(z10);
        }
        v1 v1Var2 = this.s0;
        if (v1Var2 != null) {
            v1Var2.setEnabled(z11);
        }
        v1 v1Var3 = this.t0;
        if (v1Var3 != null) {
            v1Var3.setEnabled(z10);
        }
        v1 v1Var4 = this.u0;
        if (v1Var4 != null) {
            v1Var4.setEnabled(z10);
        }
    }

    public z1(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f = str;
    }

    public z1(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.b = richMessage;
    }
}
