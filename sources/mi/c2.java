package mi;

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
import b8.mf;
import b8.pf;
import ci.ba;
import gi.j8;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.messenger.zv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mj;
import org.telegram.ui.mm;
import org.telegram.ui.s51;
import org.telegram.ui.vf0;
import org.telegram.ui.wm;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class c2 extends org.telegram.ui.ActionBar.d2 implements cs {
    public fa.f A0;
    public ey B0;
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
    public ii.z1 I0;
    public float J;
    public int J0;
    public wm K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public o1 O0;
    public u1 P;
    public vf0 P0;
    public t3 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public h1 S0;
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
    public hg c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public v1 e0;
    public final String f;
    public LinearLayout f0;
    public final ArrayList g0;
    public CharSequence h;
    public ImageView h0;
    public s51 i0;
    public LinearLayout j0;
    public w1 k0;
    public int l0;
    public final ArrayList m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public LinearLayout p0;
    public y1 q0;
    public zi r;
    public y1 r0;
    public kh.f s;
    public y1 s0;
    public y1 t0;
    public y1 u0;
    public y1 v0;
    public mj w;
    public FrameLayout w0;
    public final Rect x;
    public fh0 x0;
    public gh.g y;
    public f60 y0;
    public x1 z0;

    public c2(Editable editable) {
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
        this.N0 = new i1(this, 0);
        this.a = editable;
    }

    public static void Z(c2 c2Var) {
        h3 h3Var = c2Var.Q.v3;
        if (h3Var != null && h3Var.x()) {
            c2Var.s0();
            return;
        }
        Activity parentActivity = c2Var.getParentActivity();
        new v(c2Var.currentAccount, parentActivity, new j8(c2Var, 14), c2Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void a0(c2 c2Var) {
        if (h10.i(c2Var.currentAccount).q()) {
            return;
        }
        c2Var.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) c2Var, 43, true));
    }

    public static boolean b0(c2 c2Var, View view) {
        wm wmVar = c2Var.K;
        if (wmVar != null && c2Var.r == null && !wmVar.c() && c2Var.Q.n3() && !c2Var.Q.p3()) {
            if (!c2Var.Q.P3()) {
                c2Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = c2Var.Q.c3();
            if (!c32.isEmpty()) {
                vf0 vf0Var = c2Var.P0;
                if (vf0Var != null) {
                    vf0Var.g(false);
                    c2Var.P0 = null;
                }
                vf0 vf0Var2 = new vf0(c2Var.getParentActivity(), c2Var.getResourceProvider());
                c2Var.P0 = vf0Var2;
                vf0Var2.setOnDismissListener(new ba(c2Var, 8));
                long a10 = c2Var.K.a();
                zi ziVar = c2Var.K.E5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = hp.s1(c2Var.currentAccount).z1(a10);
                tL_message.from_id = hp.s1(c2Var.currentAccount).z1(h10.i(c2Var.currentAccount).e());
                tL_message.flags2 |= TLObject.FLAG_13;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = c2Var.Q.E2();
                tL_message.rich_message.documents = c2Var.Q.B2();
                if (ziVar != null && !ziVar.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = ziVar.f1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                zi ziVar2 = new zi(c2Var.currentAccount, tL_message, false, false);
                if (ziVar != null && !ziVar.p) {
                    ziVar2.C = ziVar;
                }
                ziVar2.z0 = true;
                ziVar2.U2 = Boolean.TRUE;
                ziVar2.n0(null);
                ziVar2.u1 = true;
                c2Var.P0.p(org.telegram.messenger.k5.k(ziVar2));
                c2Var.z0.setScaleX(1.0f);
                c2Var.z0.setScaleY(1.0f);
                bg q10 = c2Var.P0.q(c2Var.z0, true, new j1(c2Var, 10));
                if (q10 != null) {
                    q10.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), c2Var.getThemedColor(k6.Ci))));
                    vf0 vf0Var3 = c2Var.P0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    vf0Var3.m0 = true;
                    vf0Var3.Y = L;
                }
                f60 H = f60.H(c2Var, c2Var.z0);
                boolean B = l10.B(c2Var.K.j());
                if (c2Var.K.R6()) {
                    H.c(R.drawable.msg_calendar2, bd.M0(B ? 2131745524 : 2131745869, null), new ci.e3(c2Var, a10, 15), false);
                    if (!B && a10 > 0) {
                        H.c(R.drawable.msg_online, bd.M0(2131745596, null), new i1(c2Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(R.drawable.input_notify_off, bd.M0(2131745593, null), new i1(c2Var, 6), false);
                }
                H.Y();
                c2Var.P0.o(H);
                c2Var.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void c0(final c2 c2Var, Context context, View view) {
        f60 f60Var = c2Var.y0;
        if (f60Var != null) {
            f60Var.u();
            c2Var.y0 = null;
        }
        final int i3 = 0;
        final int i10 = 1;
        boolean z10 = (hp.s1(c2Var.currentAccount).s4() || h10.i(c2Var.currentAccount).q()) ? false : true;
        final a T2 = c2Var.Q.T2();
        final f60 I = f60.I(c2Var, view);
        I.Q = true;
        f60 J = I.J();
        J.c(R.drawable.ic_ab_back, bd.M0(2131753756, null), new ai.g4(I, 8), false);
        J.k();
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, bd.M0(2131754030, null), new Runnable(c2Var) { // from class: mi.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
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
        J.y().a.setTextSize(1, az.W0 + 2);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, bd.M0(2131754029, null), new Runnable(c2Var) { // from class: mi.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
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
        J.y().a.setTextSize(1, az.W0 + 1);
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, bd.M0(2131754028, null), new Runnable(c2Var) { // from class: mi.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
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
        J.y().a.setTextSize(1, az.W0);
        final int i12 = 3;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, bd.M0(2131754027, null), new Runnable(c2Var) { // from class: mi.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
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
        J.y().a.setTextSize(1, az.W0 - 1);
        final int i13 = 4;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, bd.M0(2131754026, null), new Runnable(c2Var) { // from class: mi.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
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
        J.y().a.setTextSize(1, az.W0 - 2);
        final int i14 = 5;
        J.j(T2 != null && (T2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, bd.M0(2131754025, null), new Runnable(c2Var) { // from class: mi.n1
            public final /* synthetic */ c2 b;

            {
                this.b = c2Var;
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
        J.y().a.setTextSize(1, az.W0 - 3);
        boolean z11 = T2 != null && t3.F3(T2.b);
        a2 a2Var = new a2(context, R.drawable.iv_h);
        a2Var.a(z10);
        int i15 = k6.G8;
        a2Var.d = i15;
        I.j(z11, 0, a2Var, bd.M0(2131754031, null), new ai.y3(I, J, i12));
        I.y().a.setTypeface(org.telegram.messenger.g0.o());
        I.y().setPadding(org.telegram.messenger.g0.L(bd.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(bd.a0 ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, bd.M0(2131753988, null), new m1(c2Var, T2, i12));
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, bd.M0(2131753996, null), new m1(c2Var, T2, 4));
        boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
        a2 a2Var2 = new a2(context, R.drawable.iv_pullquote);
        a2Var2.a(z10);
        a2Var2.d = i15;
        I.j(z12, 0, a2Var2, bd.M0(2131753997, null), new m1(c2Var, T2, i3));
        I.y().setPadding(org.telegram.messenger.g0.L(bd.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(bd.a0 ? 9.0f : 18.0f), 0);
        I.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, bd.M0(2131754055, null), new m1(c2Var, T2, i10));
        boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
        a2 a2Var3 = new a2(context, R.drawable.iv_footer);
        a2Var3.a(z10);
        a2Var3.d = i15;
        I.j(z13, 0, a2Var3, bd.M0(2131754032, null), new m1(c2Var, T2, i11));
        I.y().setPadding(org.telegram.messenger.g0.L(bd.a0 ? 18.0f : 9.0f), 0, org.telegram.messenger.g0.L(bd.a0 ? 9.0f : 18.0f), 0);
        I.Z();
        c2Var.y0 = I;
    }

    public static void d0(c2 c2Var, zi ziVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, zi ziVar2, zi ziVar3, mm mmVar, boolean z10, int i3, int i10, zv zvVar, long j11) {
        if (ziVar == null) {
            yy.R(org.telegram.messenger.c.a(c2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j10, ziVar2, ziVar3, mmVar, z10, i3, i10, zvVar, 0L, j11, 0L);
            return;
        }
        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(c2Var.currentAccount);
        wm wmVar = c2Var.K;
        org.telegram.messenger.p5 p5Var = yy.J;
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
            yy.j(pageBlock2, identityHashMap);
        }
        yy.C(a10.a).v(ziVar, richMessage, arrayList4, wmVar, false);
    }

    public static void e0(c2 c2Var, boolean z10, boolean z11) {
        if (c2Var.K0 == z10 && z11) {
            return;
        }
        c2Var.K0 = z10;
        float f10 = z10 ? 1.15f : 1.0f;
        if (z11) {
            c2Var.x0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(xq.h).start();
        } else {
            c2Var.x0.animate().cancel();
            c2Var.x0.setScaleX(f10);
            c2Var.x0.setScaleY(f10);
        }
        r6.t(c2Var.x0, z10 ? k6.q7 : k6.G6, c2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        ch0 animatedDrawable = c2Var.x0.getAnimatedDrawable();
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

    public static h1 f0(c2 c2Var) {
        h1 focusedEditTextOrNull = c2Var.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            h1 h1Var = c2Var.S0;
            return h1Var != null ? h1Var : c2Var.Q.S2();
        }
        c2Var.S0 = focusedEditTextOrNull;
        c2Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int g0(c2 c2Var, h1 h1Var) {
        return (h1Var != c2Var.S0 || c2Var.Q.getFocusedEditTextOrNull() == h1Var) ? Math.max(0, h1Var.getSelectionEnd()) : Math.min(c2Var.T0, h1Var.length());
    }

    public static String l0(int i3) {
        if (i3 == 1) {
            return bd.M0(2131754854, null);
        }
        if (i3 == 2) {
            return bd.M0(2131754860, null);
        }
        if (i3 == 4) {
            return bd.M0(2131754855, null);
        }
        if (i3 == 7) {
            return bd.M0(2131754864, null);
        }
        if (i3 != 9) {
            return null;
        }
        return bd.M0(2131754869, null);
    }

    public static String n0(int i3) {
        if (i3 == 1) {
            return bd.M0(2131753671, null);
        }
        if (i3 == 2) {
            return bd.M0(2131749095, null);
        }
        if (i3 == 16) {
            return bd.M0(2131743899, null);
        }
        if (i3 == 8) {
            return bd.M0(2131744447, null);
        }
        if (i3 == 256) {
            return bd.M0(2131745272, null);
        }
        if (i3 == 4) {
            return bd.M0(2131748358, null);
        }
        if (i3 == 65536) {
            return bd.M0(2131749311, null);
        }
        if (i3 == 16384) {
            return bd.M0(2131744435, null);
        }
        if (i3 == 32768) {
            return bd.M0(2131744337, null);
        }
        return null;
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.e6 e6Var) {
        final int i3 = 1;
        final int i10 = 0;
        final org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.O = f10;
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.large_article);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = k6.Ci;
        ShapeDrawable L2 = k6.L(L, k6.w0(i11, e6Var));
        n6 N = r6.N(i11);
        e10.setBackground(L2);
        r6.k(e10, L2, N, null, e6Var);
        f10.addView(e10, mf.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i12 = k6.G6;
        r6.V(textView, i12, e6Var);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, mf.t(-1, -2, 49, 25, 16, 25, 0), context);
        f11.setText(org.telegram.messenger.g0.X2(bd.M0(2131754042, null)));
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        r6.V(f11, i12, e6Var);
        f10.addView(f11, mf.t(-1, -2, 49, 25, 11, 25, 0));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(bd.M0(2131754043, null));
        f10.addView(h, mf.t(-1, 48, 49, 14, 31, 14, 0));
        gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, false);
        h7.setText(bd.M0(2131754044, null));
        f10.addView(h7, mf.t(-1, 48, 49, 14, 2, 14, 6));
        l10.show();
        h.setOnClickListener(new View.OnClickListener() { // from class: mi.l1
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
        h7.setOnClickListener(new View.OnClickListener() { // from class: mi.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
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
        int i3;
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
                                i3 = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i3 = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i3 = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i3 = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i3 = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i3 = 7;
                            }
                            ArrayList arrayList = this.g0;
                            size = arrayList.size();
                            i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                y1 y1Var = (y1) obj;
                                int intValue = ((Integer) y1Var.getTag()).intValue();
                                y1Var.setSelected(i3 == intValue);
                                if (i3 == intValue) {
                                    y1Var.setEnabled(true);
                                    if (T2 == null) {
                                        y1Var.a();
                                    } else if (i3 == 1) {
                                        TL_iv.PageBlock pageBlock2 = T2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            y1Var.e(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            y1Var.e(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            y1Var.e(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            y1Var.e(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            y1Var.e(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            y1Var.e(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            y1Var.e(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            y1Var.e(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            y1Var.e(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            y1Var.e(R.drawable.iv_footer);
                                        } else {
                                            y1Var.a();
                                        }
                                    } else if (i3 == 2) {
                                        if (T2.a()) {
                                            y1Var.e(R.drawable.iv_todo);
                                        } else if (T2.c()) {
                                            y1Var.e(R.drawable.iv_ordered_list);
                                        } else {
                                            y1Var.a();
                                        }
                                    } else if (i3 == 8) {
                                        y1Var.e(R.drawable.iv_details);
                                    } else {
                                        y1Var.a();
                                    }
                                } else {
                                    y1Var.setEnabled(i3 != 4);
                                    y1Var.a();
                                }
                            }
                        }
                    }
                }
                i3 = 2;
                ArrayList arrayList2 = this.g0;
                size = arrayList2.size();
                i10 = 0;
                while (i10 < size) {
                }
            }
            i3 = 0;
            ArrayList arrayList22 = this.g0;
            size = arrayList22.size();
            i10 = 0;
            while (i10 < size) {
            }
        }
        i3 = 4;
        ArrayList arrayList222 = this.g0;
        size = arrayList222.size();
        i10 = 0;
        while (i10 < size) {
        }
    }

    public final void C0(int i3, boolean z10) {
        if (this.L0 == i3) {
            return;
        }
        this.L0 = i3;
        if (z10) {
            this.b0.setVisibility(0);
            ViewPropertyAnimator duration = this.b0.animate().alpha(this.L0 == 0 ? 1.0f : 0.0f).scaleX(this.L0 == 0 ? 1.0f : 0.8f).scaleY(this.L0 == 0 ? 1.0f : 0.8f).translationY(this.L0 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new i1(this, 1)).start();
            this.i0.setVisibility(0);
            this.i0.animate().alpha(this.L0 == 1 ? 1.0f : 0.0f).scaleX(this.L0 == 1 ? 1.0f : 0.8f).scaleY(this.L0 == 1 ? 1.0f : 0.8f).translationY(this.L0 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L).setInterpolator(xqVar).withEndAction(new i1(this, 2)).start();
            this.w0.setVisibility(0);
            this.w0.animate().alpha(this.L0 == 2 ? 1.0f : 0.0f).scaleX(this.L0 == 2 ? 1.0f : 0.8f).scaleY(this.L0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xqVar).withEndAction(new i1(this, 3)).start();
            return;
        }
        this.b0.setVisibility(i3 == 0 ? 0 : 8);
        this.b0.setAlpha(i3 == 0 ? 1.0f : 0.0f);
        this.b0.setScaleX(i3 == 0 ? 1.0f : 0.8f);
        this.b0.setScaleY(i3 == 0 ? 1.0f : 0.8f);
        this.b0.setTranslationY(i3 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        this.i0.setVisibility(i3 == 1 ? 0 : 8);
        this.i0.setAlpha(i3 == 1 ? 1.0f : 0.0f);
        this.i0.setScaleX(i3 == 1 ? 1.0f : 0.8f);
        this.i0.setScaleY(i3 == 1 ? 1.0f : 0.8f);
        this.i0.setTranslationY(i3 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        this.w0.setVisibility(i3 != 2 ? 8 : 0);
        this.w0.setAlpha(i3 == 2 ? 1.0f : 0.0f);
        this.w0.setScaleX(i3 == 2 ? 1.0f : 0.8f);
        this.w0.setScaleY(i3 == 2 ? 1.0f : 0.8f);
    }

    public final void D0() {
        boolean z10;
        boolean z11;
        h9 textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        y1 y1Var = this.v0;
        boolean z12 = false;
        if (y1Var != null) {
            t3 t3Var = this.Q;
            int[] E4 = t3Var.E4();
            y1Var.setSelected(E4 != null && t3Var.K3(E4[0], E4[1]));
        }
        if (this.Q.O3()) {
            h9 textSelectionHelper2 = this.Q.getTextSelectionHelper();
            int i3 = textSelectionHelper2.p0;
            int i10 = textSelectionHelper2.q0;
            int i11 = textSelectionHelper2.t0;
            int i12 = textSelectionHelper2.r0;
            int i13 = textSelectionHelper2.u0;
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                y1 y1Var2 = (y1) obj;
                y1Var2.setSelected(this.Q.N3(((Integer) y1Var2.getTag()).intValue(), i3, i10, i12, i11, i13));
            }
            boolean z13 = i10 == i11;
            h1 Q4 = z13 ? this.Q.Q4(i3, i10) : null;
            int max = Math.max(0, Math.min(i12, i13));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i12, i13), Q4.length()));
            y1 y1Var3 = this.r0;
            if (y1Var3 != null) {
                y1Var3.setSelected(Q4 != null && max < max2 && d6.h(Q4.getText(), max, max2));
            }
            y1 y1Var4 = this.t0;
            if (y1Var4 != null) {
                if (Q4 != null && max < max2 && d6.g(Q4.getText(), max, max2)) {
                    z12 = true;
                }
                y1Var4.setSelected(z12);
            }
            y0(true);
            z0(z13, this.Q.o2());
            return;
        }
        if (this.Q.z3()) {
            h9 textSelectionHelper3 = this.Q.getTextSelectionHelper();
            h1 v22 = this.Q.v2(textSelectionHelper3.p0);
            int i15 = textSelectionHelper3.r0;
            int i16 = textSelectionHelper3.u0;
            int max3 = v22 == null ? 0 : Math.max(0, Math.min(Math.min(i15, i16), v22.length()));
            int max4 = v22 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), v22.length()));
            int size2 = arrayList.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList.get(i17);
                i17++;
                y1 y1Var5 = (y1) obj2;
                y1Var5.setSelected((v22 == null || max3 >= max4 || (((Integer) y1Var5.getTag()).intValue() & v22.c(max3, max4)) == 0) ? false : true);
            }
            y1 y1Var6 = this.r0;
            if (y1Var6 != null) {
                y1Var6.setSelected(v22 != null && max3 < max4 && d6.h(v22.getText(), max3, max4));
            }
            y1 y1Var7 = this.t0;
            if (y1Var7 != null) {
                if (v22 != null && max3 < max4 && d6.g(v22.getText(), max3, max4)) {
                    z12 = true;
                }
                y1Var7.setSelected(z12);
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
            y1 y1Var8 = (y1) arrayList.get(i22);
            y1Var8.setSelected(z14 && this.Q.M3(((Integer) y1Var8.getTag()).intValue(), i18, i20, i19, i21));
            i22 = i23;
        }
        y0(!this.Q.L3());
        y1 y1Var9 = this.r0;
        if (y1Var9 != null) {
            if (z14) {
                Editable K4 = this.Q.K4(i18, i20, i19, i21);
                if (K4 == null ? false : d6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z11 = true;
                    y1Var9.setSelected(z11);
                }
            }
            z11 = false;
            y1Var9.setSelected(z11);
        }
        y1 y1Var10 = this.t0;
        if (y1Var10 != null) {
            if (z14) {
                Editable K42 = this.Q.K4(i18, i20, i19, i21);
                if (K42 == null ? false : d6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z10 = true;
                    y1Var10.setSelected(z10);
                }
            }
            z10 = false;
            y1Var10.setSelected(z10);
        }
        if (z14 && i18 == i19) {
            z12 = true;
        }
        z0(z12, this.Q.o2());
    }

    public final void E0() {
        boolean u22 = this.Q.u2();
        g2 g2Var = this.Q.R3;
        boolean z10 = (g2Var == null || g2Var.c.isEmpty()) ? false : true;
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
        int i3 = 0;
        boolean z10 = (hp.s1(this.currentAccount).s4() || h10.i(this.currentAccount).q()) ? false : true;
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y1) obj).setPremiumLocked(z10);
        }
    }

    public final void G0() {
        if (this.z0 == null) {
            return;
        }
        boolean P3 = this.Q.P3();
        this.z0.setEnabled(P3);
        org.telegram.messenger.camera.q.k(this.z0.animate(), P3 ? 1.0f : 0.5f, 150L);
    }

    public final void H0() {
        x1 x1Var = this.z0;
        if (x1Var == null) {
            return;
        }
        x1Var.setLocked(r0());
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new u1(this, context);
        int i10 = 1;
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.G0 = hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        ii.z1 z1Var = new ii.z1(this, i10);
        this.I0 = z1Var;
        this.P.r.add(z1Var);
        t3 t3Var = new t3(context, this.currentAccount, getResourceProvider(), new hi.d(this, 14));
        this.Q = t3Var;
        t3Var.setFileRefParentObject(this.r);
        this.P.addView(this.Q, mf.e(-1, -1, hs.E1));
        this.P.addView(this.Q.getOverlayView(), mf.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            t3 t3Var2 = this.Q;
            ArrayList arrayList2 = t3Var2.t3;
            t3Var2.s3 = richMessage;
            t3.Z2(arrayList2, richMessage.blocks, t3Var2.u3);
            t3Var2.Y3();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                t3Var2.y4((a) arrayList2.get(i11));
            }
            t3Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                t3 t3Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = t3Var3.u3;
                ArrayList arrayList3 = t3Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    t3.Z2(arrayList3, b5.b(charSequence), hashMap);
                }
                arrayList3.addAll(t3Var3.z4(b4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    t3.Z2(arrayList3, b5.b(charSequence2), hashMap);
                }
                t3Var3.Y3();
                t3Var3.g3.O(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.Q.setInitialText(charSequence3);
                }
            }
        }
        g2 g2Var = this.Q.R3;
        if (g2Var != null) {
            g2Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = k6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i12), k6.r1(0.0f, getThemedColor(i12))}));
        this.P.addView(this.R, mf.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{k6.r1(0.0f, getThemedColor(i12)), getThemedColor(i12)}));
        this.P.addView(this.S, mf.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, mf.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = k6.i6;
        imageView3.setBackground(new b2(k6.b0(themedColor, k6.w(themedColor2, getThemedColor(i13)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.U;
        int i14 = k6.G6;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView4, i14, resourceProvider, mode);
        pf.a(this.U);
        this.U.setContentDescription(bd.M0(2131754878, null));
        this.U.setOnClickListener(new j1(this, i10));
        this.T.addView(this.U, mf.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.T.addView(this.V, mf.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.W.setScaleType(scaleType);
        r6.R(this.W, k6.h0(getThemedColor(i13), 1, -1), null, r6.N(i13), getResourceProvider());
        r6.t(this.W, i14, getResourceProvider(), mode);
        pf.a(this.W);
        this.W.setContentDescription(bd.M0(2131743897, null));
        this.W.setOnClickListener(new j1(this, 2));
        this.V.addView(this.W, mf.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.X.setScaleType(scaleType);
        r6.R(this.X, k6.h0(getThemedColor(i13), 1, -1), null, r6.N(i13), getResourceProvider());
        r6.t(this.X, i14, getResourceProvider(), mode);
        pf.a(this.X);
        this.X.setContentDescription(bd.M0(2131746350, null));
        this.X.setOnClickListener(new j1(this, 3));
        this.V.addView(this.X, mf.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, mf.e(-1, hs.q2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.Z.addView(this.a0, mf.e(-1, hs.q2, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.b0.setClipChildren(false);
        this.b0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.a0.addView(this.b0, mf.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.a0.addView(frameLayout4, mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.d0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        this.d0.setScaleType(scaleType);
        r6.t(this.d0, i14, getResourceProvider(), mode);
        this.d0.setBackground(new b2(k6.b0(getThemedColor(i12), k6.w(getThemedColor(i12), getThemedColor(i13)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.b0.addView(this.d0, mf.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        pf.a(this.d0);
        this.d0.setContentDescription(bd.M0(2131755006, null));
        this.d0.setOnClickListener(new j1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        frameLayout5.addView(frameLayout6, mf.e(-2, 44, 81));
        v1 v1Var = new v1(context, 0);
        this.e0 = v1Var;
        v1Var.setClipToOutline(true);
        this.e0.setOutlineProvider(new cg.p0(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f0.setOrientation(0);
        this.e0.addView(this.f0);
        frameLayout6.addView(this.e0, mf.c(-1.0f, -1));
        hg hgVar = new hg(context, 24);
        this.c0 = hgVar;
        hgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        r6.t(this.c0, i14, getResourceProvider(), mode);
        r6.R(this.c0, k6.b0(getThemedColor(i12), getThemedColor(i13), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i12), r6.N(i13), getResourceProvider());
        this.c0.j(fg.e, false);
        this.f0.addView(this.c0, mf.r(38, 38, 16));
        pf.a(this.c0);
        this.c0.setContentDescription(bd.M0(2131754884, null));
        this.c0.setOnClickListener(new j1(this, 5));
        h0(R.drawable.iv_text, 1, false).setOnClickListener(new ai.d(28, this, context));
        h0(R.drawable.iv_lists, 2, true).setOnClickListener(new j1(this, 6));
        h0(R.drawable.iv_table, 4, true).setOnClickListener(new j1(this, 7));
        h0(R.drawable.iv_math, 7, true).setOnClickListener(new j1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.h0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.h0.setScaleType(scaleType);
        r6.t(this.h0, i14, getResourceProvider(), mode);
        r6.R(this.h0, k6.b0(getThemedColor(i12), getThemedColor(i13), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i12), r6.N(i13), getResourceProvider());
        this.f0.addView(this.h0, mf.t(38, 38, 16, 2, 0, 0, 0));
        pf.a(this.h0);
        this.h0.setContentDescription(bd.M0(2131754921, null));
        this.h0.setOnClickListener(new j1(this, 9));
        this.b0.addView(frameLayout5, mf.l(1.0f, 0, 44));
        s51 s51Var = new s51(7, context, this);
        this.i0 = s51Var;
        s51Var.setOrientation(0);
        this.i0.setClipToPadding(false);
        this.i0.setClipChildren(false);
        this.i0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.i0, mf.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.w0.setClipToPadding(false);
        this.w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.w0, mf.e(80, 60, 81));
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
        r6.t(this.x0, i14, getResourceProvider(), mode);
        this.x0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.w0.addView(this.x0, mf.e(-1, -1, hs.E1));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(frameLayout8, mf.c(44.0f, -2));
        w1 w1Var = new w1(this, context);
        this.k0 = w1Var;
        w1Var.setHorizontalScrollBarEnabled(false);
        this.k0.setClipToOutline(true);
        this.k0.setOutlineProvider(new cg.p0(6));
        frameLayout8.addView(this.k0, mf.c(-1.0f, -1));
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
        y1 y1Var = new y1(R.drawable.iv_quote, context, getResourceProvider());
        this.v0 = y1Var;
        y1Var.setContentDescription(bd.M0(2131746448, null));
        this.v0.setOnClickListener(new j1(this, 11));
        LinearLayout linearLayout5 = this.j0;
        linearLayout5.addView(this.v0, mf.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        y1 y1Var2 = new y1(R.drawable.iv_button, context, getResourceProvider());
        this.s0 = y1Var2;
        y1Var2.setContentDescription(bd.M0(2131746021, null));
        this.s0.setOnClickListener(new j1(this, 12));
        LinearLayout linearLayout6 = this.j0;
        linearLayout6.addView(this.s0, mf.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.o0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(this.o0, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var3 = new y1(R.drawable.media_link_24, context, getResourceProvider());
        this.r0 = y1Var3;
        y1Var3.setContentDescription(bd.M0(2131751745, null));
        this.r0.setOnClickListener(new j1(this, 13));
        this.o0.addView(this.r0, mf.r(38, 38, 16));
        y1 y1Var4 = new y1(R.drawable.msg_calendar2, context, getResourceProvider());
        this.t0 = y1Var4;
        y1Var4.setContentDescription(bd.M0(2131754862, null));
        this.t0.setOnClickListener(new j1(this, 14));
        this.o0.addView(this.t0, mf.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.p0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.p0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(this.p0, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var5 = new y1(R.drawable.iv_math, context, getResourceProvider());
        this.u0 = y1Var5;
        y1Var5.d();
        arrayList.add(this.u0);
        this.u0.setContentDescription(bd.M0(2131754864, null));
        this.u0.setOnClickListener(new j1(this, 15));
        this.p0.addView(this.u0, mf.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.n0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i12))));
        this.i0.addView(this.n0, 0, mf.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        y1 y1Var6 = new y1(0, context, getResourceProvider());
        this.q0 = y1Var6;
        y1Var6.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        this.q0.setContentDescription(bd.M0(2131755006, null));
        this.q0.setOnClickListener(new j1(this, 16));
        this.n0.addView(this.q0, mf.r(38, 38, 16));
        x1 x1Var = new x1(this, context, this.r != null ? R.drawable.input_done : q0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider());
        this.z0 = x1Var;
        x1Var.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(k6.Me))));
        pf.a(this.z0);
        this.b0.addView(this.z0, mf.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.z0.setContentDescription(bd.M0(2131745650, null));
        this.z0.setOnClickListener(new j1(this, i3));
        this.z0.setOnLongClickListener(new gi.p4(this, 3));
        H0();
        this.P.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, i10));
        F0();
        if (this.e) {
            this.Q.F2();
            this.e = false;
        }
        u1 u1Var = this.P;
        this.fragmentView = u1Var;
        return u1Var;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f5) {
            H0();
            F0();
        }
    }

    public final y1 h0(int i3, int i10, boolean z10) {
        y1 y1Var = new y1(i3, this.f0.getContext(), getResourceProvider());
        if (z10) {
            y1Var.d();
            this.O.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(l0(i10));
        this.g0.add(y1Var);
        LinearLayout linearLayout = this.f0;
        linearLayout.addView(y1Var, mf.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return y1Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i3, int i10, boolean z10) {
        y1 y1Var = new y1(i3, context, getResourceProvider());
        if (z10) {
            y1Var.d();
            this.O.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(n0(i10));
        y1Var.setOnClickListener(new bi.q(this, i10, 7));
        this.m0.add(y1Var);
        LinearLayout linearLayout = this.j0;
        linearLayout.addView(y1Var, mf.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        t3 t3Var = this.Q;
        if (t3Var == null || !t3Var.v3.x()) {
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
        ofFloat.addUpdateListener(new k1(this, 0));
        this.Q0.setInterpolator(xq.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        ey eyVar = this.B0;
        if (eyVar == null || (layoutParams = (FrameLayout.LayoutParams) eyVar.getLayoutParams()) == null) {
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
        ey eyVar = this.B0;
        if (eyVar != null && (layoutParams = (FrameLayout.LayoutParams) eyVar.getLayoutParams()) != null) {
            int i3 = layoutParams.bottomMargin;
            int i10 = this.U0;
            if (i3 != i10) {
                layoutParams.bottomMargin = i10;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        k0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, org.telegram.messenger.g0.L(60.0f), 0, org.telegram.messenger.g0.L(110.0f) + max);
        t3 t3Var = this.Q;
        int i11 = this.U0;
        int i12 = this.V0;
        int i13 = this.E0;
        t3Var.W3 = i11;
        t3Var.X3 = i12;
        t3Var.Y3 = i13;
        this.Z.setTranslationY(-max);
        this.S.setTranslationY(r0 + this.U0);
    }

    public final int o0() {
        Point point = org.telegram.messenger.g0.q;
        int i3 = point.x > point.y ? this.G0 : this.F0;
        return i3 <= 0 ? org.telegram.messenger.g0.L(200.0f) : i3;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i10 != -1 || i3 != 21) {
            if (i10 != -1 || (i3 != 1 && i3 != 14)) {
                super.onActivityResultFragment(i3, i10, intent);
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
        t3 t3Var = this.Q;
        Uri data = intent.getData();
        if (data == null) {
            t3Var.getClass();
        } else {
            if (t3Var.getContext() == null) {
                return;
            }
            Utilities.e.c(new m2.s(5, t3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.D0;
        if (z11) {
            if (z11) {
                this.D0 = false;
                ey eyVar = this.B0;
                if (eyVar != null) {
                    eyVar.t(false);
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

    @Override // org.telegram.ui.ActionBar.d2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        int i3 = 1;
        if (!z10 && !this.W0) {
            v0();
            this.W0 = true;
        }
        if (org.telegram.messenger.g0.Q1() || this.s == null || this.w == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        kh.f fVar = this.s;
        this.y = fVar.f;
        fVar.e = false;
        fVar.invalidate();
        this.w.setAlpha(0.0f);
        int i10 = 4;
        this.w.B1.setVisibility(4);
        A0();
        float f10 = z10 ? 0.0f : 1.0f;
        this.J = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        this.F = true;
        this.P.invalidate();
        ofFloat.addUpdateListener(new k1(this, i3));
        ofFloat.addListener(new bh.j(10, this, runnable));
        if (z10) {
            FrameLayout frameLayout = this.T;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.T;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<t3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.T;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.T;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<t3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(xq.h);
        this.P.post(new xp0(animatorSet, i10));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.f5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        ii.z1 z1Var;
        hs.f(this.currentAccount).n(this, hs.f5);
        if (!this.W0) {
            v0();
            this.W0 = true;
        }
        o1 o1Var = this.O0;
        if (o1Var != null) {
            this.O0 = null;
            org.telegram.messenger.g0.h3(o1Var);
        }
        vf0 vf0Var = this.P0;
        if (vf0Var != null) {
            vf0Var.h();
            this.P0 = null;
        }
        t3 t3Var = this.Q;
        if (t3Var != null) {
            t3Var.J2();
        }
        fa.f fVar = this.A0;
        if (fVar != null) {
            fVar.c();
        }
        super.onFragmentDestroy();
        ey eyVar = this.B0;
        if (eyVar != null) {
            eyVar.B();
        }
        u1 u1Var = this.P;
        if (u1Var == null || (z1Var = this.I0) == null) {
            return;
        }
        u1Var.r.remove(z1Var);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.U0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        m0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        f60 f60Var;
        i0.b f10 = k1Var.a.f(3);
        int i3 = k1Var.a.f(8).d;
        this.V0 = i3;
        int i10 = i3 - f10.d;
        boolean z10 = this.H0;
        boolean z11 = i10 > org.telegram.messenger.g0.L(20.0f);
        this.H0 = z11;
        if (z11 && i10 > org.telegram.messenger.g0.L(50.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.G0 = i10;
                hp.d1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i10;
                hp.d1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z10 && this.C0 && !this.D0) {
            p0(false);
        }
        if (!this.H0 && z10 && (f60Var = this.y0) != null) {
            f60Var.u();
            this.y0 = null;
        }
        onInsets(f10.a, f10.b, f10.c, f10.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i3 = k6.d6;
            int themedColor = getThemedColor(i3);
            int i10 = k6.i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = k6.Me;
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
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i3), k6.r1(0.0f, getThemedColor(i3))}));
            }
            View view2 = this.S;
            if (view2 != null) {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, getThemedColor(i3)), getThemedColor(i3)}));
            }
            ImageView imageView = this.U;
            if (imageView != null) {
                imageView.setBackground(new b2(k6.b0(getThemedColor(i3), k6.w(getThemedColor(i3), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
            }
            LinearLayout linearLayout = this.V;
            if (linearLayout != null) {
                linearLayout.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
            }
            ImageView imageView2 = this.d0;
            if (imageView2 != null) {
                imageView2.setBackground(new b2(k6.b0(getThemedColor(i3), k6.w(getThemedColor(i3), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
            }
            fh0 fh0Var = this.x0;
            if (fh0Var != null) {
                fh0Var.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
            }
            LinearLayout linearLayout2 = this.o0;
            if (linearLayout2 != null) {
                linearLayout2.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
            }
            LinearLayout linearLayout3 = this.p0;
            if (linearLayout3 != null) {
                linearLayout3.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
            }
            LinearLayout linearLayout4 = this.n0;
            if (linearLayout4 != null) {
                linearLayout4.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
            }
            x1 x1Var = this.z0;
            if (x1Var != null) {
                x1Var.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        t3 t3Var;
        int i3;
        t3 t3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i3 = this.c) >= 0 && (t3Var2 = this.Q) != null) {
            int i10 = this.d;
            this.d = -1;
            this.c = -1;
            if (t3Var2.c2(i3, i10)) {
                return;
            }
            t3Var2.post(new o2(t3Var2, i3, i10, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.b == null && this.f == null) || (t3Var = this.Q) == null || t3Var.d3()) {
            return;
        }
        t3Var.post(new b(t3Var, 5));
    }

    public final void p0(boolean z10) {
        if (this.D0) {
            this.D0 = false;
            ey eyVar = this.B0;
            if (eyVar != null) {
                eyVar.t(false);
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
        ey eyVar2 = this.B0;
        if (eyVar2 != null) {
            eyVar2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            m0();
        }
        hg hgVar = this.c0;
        if (hgVar != null) {
            hgVar.j(fg.e, z10);
        }
    }

    public final boolean q0() {
        wm wmVar;
        return this.r == null && (wmVar = this.K) != null && wmVar.c();
    }

    public final boolean r0() {
        if (hp.s1(this.currentAccount).s4() || h10.i(this.currentAccount).q()) {
            return false;
        }
        t3 t3Var = this.Q;
        return b5.d(t3Var.t3, t3Var.u3);
    }

    public final void s0() {
        k3 k22 = this.Q.k2();
        if (k22 == null) {
            return;
        }
        TL_iv.RichMessage a10 = k22.a();
        if (a10.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
        e0Var.s1(a10);
        e0Var.d2 = new j8(k22, 12);
        e0Var.show();
    }

    public final void t0(int i3, int i10) {
        t3 t3Var = this.Q;
        t3Var.k4 = t3Var.T2();
        bi biVar = new bi(getParentActivity(), this, false, false, true, getResourceProvider());
        biVar.U3 = new r1(this, biVar);
        biVar.b2.setIncludeVideosInGallery(true);
        biVar.b2.i0();
        biVar.y1(1, true);
        biVar.V0(i3);
        biVar.r4 = new q1(this, biVar);
        biVar.Q1 = new q1(this, biVar);
        biVar.P1 = new s1(this, biVar);
        biVar.e1();
        if (i10 != 0) {
            biVar.o1(i10);
        }
        biVar.A0(true);
        biVar.show();
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
        mj mjVar = this.K.a0;
        if (m22 != null && !this.N) {
            t3 t3Var = this.Q;
            if (t3Var.n3() && !b5.d(t3Var.t3, t3Var.u3) && mjVar != null) {
                SpannableStringBuilder g7 = b5.g(this.Q.t3);
                wm wmVar = mjVar.Q2;
                if (mjVar.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g7);
                i6.m(spannableStringBuilder, mjVar.F0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p5.class);
                if (p5VarArr != null) {
                    for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                        p5Var.applyFontMetrics(mjVar.F0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.g5.f());
                    }
                }
                xg0.a(spannableStringBuilder);
                if (wmVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    li.b0(mjVar.R).Q1(wmVar.a(), wmVar.P7(wmVar.E5), charSequenceArr[0], li.b0(mjVar.R).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                mjVar.setRichDraftPreview(null);
                if (mjVar.F0.getText() != null) {
                    mjVar.F0.getText().clear();
                }
                mjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        li mediaDataController = getMediaDataController();
        long a10 = this.K.a();
        wm wmVar2 = this.K;
        mediaDataController.Q1(a10, wmVar2.P7(wmVar2.E5), "", null, null, null, null, 0L, false, false, m22);
        TL_iv.RichMessage richMessage = m22;
        if (mjVar == null) {
            return true;
        }
        mjVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void w0() {
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.Q;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new i1(this, 4), getResourceProvider());
            return;
        }
        if (q0()) {
            org.telegram.ui.Components.t4.L(getParentActivity(), this.K.a(), new gi.w5(this, 15), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [mi.o1] */
    public final void x0(final int i3, final int i10, final boolean z10) {
        mj mjVar;
        uf ufVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.Q;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new i1(this, 4), getResourceProvider());
            return;
        }
        if (this.K == null || !this.Q.n3() || this.Q.p3()) {
            return;
        }
        if (!this.Q.P3()) {
            G0();
            return;
        }
        if (!hp.s1(this.currentAccount).s4()) {
            mj mjVar2 = this.K.a0;
            if (mjVar2 == null) {
                return;
            }
            this.N = true;
            Runnable runnable = this.L;
            if (runnable != null) {
                runnable.run();
            }
            mjVar2.Q0(b5.g(this.Q.t3), z10, i3, i10);
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
        final ArrayList a10 = a5.a(this.currentAccount, c32);
        final long a11 = this.K.a();
        wm wmVar = this.K;
        final zi ziVar = wmVar.E5;
        final zi ziVar2 = wmVar.m4;
        final mm mmVar = wmVar.C5;
        final long h92 = wmVar.h9();
        final zv W8 = this.K.W8();
        final zi ziVar3 = this.r;
        ?? r02 = new Runnable() { // from class: mi.o1
            @Override // java.lang.Runnable
            public final void run() {
                c2.d0(c2.this, ziVar3, c32, E2, B2, a10, a11, ziVar, ziVar2, mmVar, z10, i3, i10, W8, h92);
            }
        };
        Runnable runnable2 = this.L;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (ziVar3 == null && (mjVar = this.K.a0) != null && (ufVar = mjVar.a3) != null) {
            ufVar.G(null, z10, i3, i10, 0L);
        }
        if (i3 == 0 || ziVar3 != null) {
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            y1 y1Var = (y1) obj;
            if (((Integer) y1Var.getTag()).intValue() == 1) {
                y1Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        y1 y1Var = this.r0;
        if (y1Var != null) {
            y1Var.setEnabled(z10);
        }
        y1 y1Var2 = this.s0;
        if (y1Var2 != null) {
            y1Var2.setEnabled(z11);
        }
        y1 y1Var3 = this.t0;
        if (y1Var3 != null) {
            y1Var3.setEnabled(z10);
        }
        y1 y1Var4 = this.u0;
        if (y1Var4 != null) {
            y1Var4.setEnabled(z10);
        }
    }

    public c2(String str) {
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
        this.N0 = new i1(this, 0);
        this.f = str;
    }

    public c2(TL_iv.RichMessage richMessage) {
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
        this.N0 = new i1(this, 0);
        this.b = richMessage;
    }
}
