package bi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.sw;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zf;
import org.telegram.ui.kh0;
import org.telegram.ui.kn;
import org.telegram.ui.mk;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class t extends uh implements us {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean D;
    public int E;
    public n1 F;
    public int G;
    public z60 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public kh0 O;
    public final f P;
    public final int n;
    public final d4 r;
    public final i4 s;
    public m.p3 w;
    public vy x;
    public boolean y;

    public t(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        p pVar = new p(this);
        this.J = true;
        this.P = new f(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        d4 d4Var = new d4(context, i10, p6Var, new n4.q(this, p6Var, false));
        this.r = d4Var;
        d4Var.setAdaptiveLinkDialogs(false);
        d4Var.setAllowTapAboveContent(false);
        addView(d4Var, w7.b6.e(-1, -1, zs.E1));
        addView(d4Var.getOverlayView(), w7.b6.e(-1, -1, zs.E1));
        d4Var.C4();
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        i4 i4Var = new i4(context, pVar);
        this.s = i4Var;
        i4Var.setBackVisible(false);
        i4Var.setTopGradientVisible(false);
        b0();
        addView(i4Var, w7.b6.e(-1, -1, zs.E1));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new l(this, 0));
    }

    public static void N(t tVar) {
        int i10 = 0;
        if (!(tVar.r.n3() || tVar.y)) {
            bi biVar = tVar.b;
            if (!biVar.I1 && biVar.M2) {
                i10 = org.telegram.messenger.i0.L(62.0f);
            }
        }
        if (tVar.K != i10) {
            tVar.K = i10;
            tVar.V();
        }
    }

    public static void O(t tVar) {
        d4 d4Var = tVar.r;
        if (tVar.y) {
            n1 S2 = d4Var.S2();
            if (S2 != null) {
                S2.N();
                org.telegram.messenger.i0.J3(S2);
            }
            tVar.U(true);
            return;
        }
        bi biVar = tVar.b;
        if (tVar.x == null) {
            vy vyVar = new vy(biVar.W1, true, false, false, tVar.getContext(), true, null, biVar.l3, true, tVar.a, false, false);
            tVar.x = vyVar;
            vyVar.setVisibility(8);
            vy vyVar2 = tVar.x;
            vyVar2.x2 = false;
            vyVar2.setBottomInset(org.telegram.messenger.i0.n);
            View view = tVar.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            tVar.x.setDelegate(new s(tVar));
            tVar.addView(tVar.x, w7.b6.e(-1, tVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = tVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tVar.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        tVar.x.setLayoutParams(layoutParams);
        tVar.x.setTranslationY(0.0f);
        tVar.x.setVisibility(0);
        tVar.y = true;
        tVar.E = emojiPanelHeight;
        n1 S22 = d4Var.S2();
        if (S22 != null) {
            org.telegram.messenger.i0.v1(S22);
        }
        i4 i4Var = tVar.s;
        if (i4Var != null) {
            i4Var.setEmojiOpened(true);
        }
        tVar.Y(false);
        tVar.requestLayout();
    }

    public static n1 P(t tVar) {
        d4 d4Var = tVar.r;
        n1 focusedEditTextOrNull = d4Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            n1 n1Var = tVar.F;
            return n1Var != null ? n1Var : d4Var.S2();
        }
        tVar.F = focusedEditTextOrNull;
        tVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int Q(t tVar, n1 n1Var) {
        return (n1Var != tVar.F || tVar.r.getFocusedEditTextOrNull() == n1Var) ? Math.max(0, n1Var.getSelectionEnd()) : Math.min(tVar.G, n1Var.length());
    }

    public static void R(t tVar, int i10, int i11) {
        bi biVar = tVar.b;
        if (biVar.W1 == null) {
            return;
        }
        bi biVar2 = new bi(tVar.getContext(), biVar.W1, false, false, true, tVar.a);
        biVar2.T3 = new q(tVar, biVar2);
        biVar2.a2.g0();
        biVar2.x1(1, true);
        biVar2.U0(i10);
        biVar2.q4 = new g(tVar, biVar2);
        biVar2.P1 = new g(tVar, biVar2);
        biVar2.O1 = new r(tVar, biVar2);
        biVar2.d1();
        if (i11 != 0) {
            biVar2.n1(i11);
        }
        biVar2.A0(true);
        biVar2.show();
    }

    public static void X(Context context, final String str, final q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        int L = org.telegram.messenger.i0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.05f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        org.telegram.ui.ActionBar.w6 L2 = a7.L(0.05f, i10);
        imageView.setBackground(d02);
        a7.k(imageView, d02, L2, null, p6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f7.addView(horizontalScrollView, w7.b6.t(-1, -2, 49, 12, 2, 12, 0));
        vh.d i11 = z20.i(24, context, p6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        n nVar = new n(strArr, horizontalScrollView, i11, zArr2, new ag.a(strArr, 11), imageView, p6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, cd.L0(2131754008, null), true, false, -1, p6Var);
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        k3Var.setImeOptions(6);
        k3Var.setMaxLines(5);
        int L3 = org.telegram.messenger.i0.L(24.0f);
        int i12 = org.telegram.ui.ActionBar.t6.d6;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L3, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = a7.N(i12);
        m3Var.setBackground(d03);
        a7.k(m3Var, d03, N, null, p6Var);
        m3Var.setText(strArr[0]);
        k3Var.addTextChangedListener(new ag.u2(1, strArr, nVar));
        f7.addView(m3Var, w7.b6.t(-1, -2, 55, 12, 8, 12, 0));
        i11.setText(cd.L0(2131751355, null));
        f7.addView(i11, w7.b6.t(-1, 48, 55, 12, 12, 12, 12));
        nVar.run();
        k10.N = f7;
        k10.H0 = new DialogInterface.OnDismissListener() { // from class: bi.o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.k3 k3Var2 = org.telegram.ui.Cells.m3.this.d;
                k3Var2.clearFocus();
                org.telegram.messenger.i0.v1(k3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                q20Var.a(strArr2[0]);
            }
        };
        k10.show();
        int i13 = org.telegram.ui.ActionBar.t6.a7;
        k10.w0(i13);
        k10.Q(i13);
        i11.setOnClickListener(new c(i11, zArr, q20Var, strArr, k10, 0));
        org.telegram.messenger.i0.h3(new a3.d(m3Var, 18), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q2 = this.b.l3.Q();
        if (Q2 <= 0) {
            SharedPreferences c12 = vp.c1();
            Point point = org.telegram.messenger.i0.q;
            Q2 = c12.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", org.telegram.messenger.i0.L(200.0f));
        }
        if (Q2 <= 0) {
            Q2 = org.telegram.messenger.i0.L(200.0f);
        }
        return Q2 + org.telegram.messenger.i0.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int L;
        int i12;
        z60 z60Var;
        boolean z10 = this.L;
        bi biVar = this.b;
        boolean z11 = biVar.l3.Q() > org.telegram.messenger.i0.L(20.0f);
        this.L = z11;
        if (!z11 && z10 && (z60Var = this.H) != null) {
            z60Var.u();
            this.H = null;
        }
        if (this.L || this.E > org.telegram.messenger.i0.L(20.0f)) {
            L = org.telegram.messenger.i0.L(52.0f);
            biVar.q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    L = i12 - org.telegram.messenger.i0.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    biVar.q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            L = i12 - org.telegram.messenger.i0.L(52.0f);
            if (L < 0) {
            }
            biVar.q0 = true;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m + L;
        d4 d4Var = this.r;
        int C = org.telegram.messenger.m5.C(110.0f, (this.L || this.E > 0) ? 0 : org.telegram.messenger.i0.n, (d4Var.n3() || this.y || !biVar.M2) ? 0 : org.telegram.messenger.i0.L(62.0f)) + this.E;
        if (d4Var.getPaddingTop() != currentActionBarHeight || d4Var.getPaddingBottom() != C) {
            this.N = true;
            d4Var.q1(0, currentActionBarHeight, 0, C);
            this.N = false;
        }
        d0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        this.b.R2.setTitle("");
        this.r.f3.O(false);
        Y(false);
        post(new f(this, 4));
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean J(boolean z10, int i10, int i11, long j10, boolean z11) {
        jj jjVar;
        kn knVar;
        sw swVar;
        long j11;
        jj jjVar2;
        mk mkVar;
        sf sfVar;
        mk mkVar2;
        int i12 = this.n;
        boolean p42 = vp.r1(i12).p4();
        d4 d4Var = this.r;
        if (!p42 && !d20.i(i12).q() && n5.d(d4Var.s3, d4Var.t3)) {
            k2.t0(getContext(), new b(d4Var, 0), new f(this, 2), this.a);
            return false;
        }
        if (d4Var.n3() && !d4Var.p3()) {
            if (d4Var.P3()) {
                boolean p43 = vp.r1(i12).p4();
                bi biVar = this.b;
                if (p43) {
                    ArrayList c32 = d4Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = d4Var.E2();
                        ArrayList B2 = d4Var.B2();
                        ArrayList a2 = m5.a(i12, c32);
                        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                        if (k2Var instanceof un) {
                            un unVar = (un) k2Var;
                            jj jjVar3 = unVar.D5;
                            jj jjVar4 = unVar.l4;
                            kn knVar2 = unVar.B5;
                            long a92 = unVar.a9();
                            swVar = unVar.P8();
                            jjVar = jjVar4;
                            knVar = knVar2;
                            j11 = a92;
                            jjVar2 = jjVar3;
                        } else {
                            jjVar = null;
                            knVar = null;
                            swVar = null;
                            j11 = 0;
                            jjVar2 = null;
                        }
                        qz.R(org.telegram.messenger.c.a(biVar.D3), c32, E2, B2, a2, biVar.a1(), jjVar2, jjVar, knVar, z10, i10, i11, swVar, j10, j11, 0L);
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                        if ((k2Var2 instanceof un) && (mkVar = ((un) k2Var2).Z) != null && (sfVar = mkVar.Z2) != null) {
                            sfVar.E(null, z10, i10, i11, 0L);
                        }
                        biVar.a(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.k2 k2Var3 = biVar.W1;
                    if ((k2Var3 instanceof un) && (mkVar2 = ((un) k2Var3).Z) != null) {
                        mkVar2.P0(n5.g(d4Var.s3), z10, i10, i11);
                        biVar.a(true);
                        return true;
                    }
                }
            } else {
                i4 i4Var = this.s;
                if (i4Var != null) {
                    i4Var.setSendEnabled(d4Var.P3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean L() {
        return !this.r.n3();
    }

    public final void S(z60 z60Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, z60 z60Var2) {
        z60Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new ag.q0((Object) this, (Object) aVar, (Object) pageBlock, (Object) z60Var2, 4));
        z60Var.y().a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        z60Var.y().a.setTextSize(1, i11);
    }

    public final boolean T() {
        final int i10 = 1;
        d4 d4Var = this.r;
        if (d4Var == null || !d4Var.n3()) {
            return true;
        }
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String L0 = cd.L0(2131753993, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131753994, null);
        alertDialog$Builder.h(cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) { // from class: bi.m
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                switch (i11) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        t tVar = this.b;
                        tVar.W();
                        tVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.k(cd.L0(2131745963, null), new org.telegram.ui.ActionBar.u1(this) { // from class: bi.m
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        t tVar = this.b;
                        tVar.W();
                        tVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void U(boolean z10) {
        if (this.D) {
            this.D = false;
            vy vyVar = this.x;
            if (vyVar != null) {
                vyVar.t(false);
                if (!z10) {
                    this.x.B();
                }
            }
        }
        this.F = null;
        vy vyVar2 = this.x;
        if (vyVar2 != null) {
            vyVar2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.E = 0;
        i4 i4Var = this.s;
        if (i4Var != null) {
            i4Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void V() {
        float f7;
        float f10;
        int L = this.D ? org.telegram.messenger.i0.L(245.0f) : this.E;
        vy vyVar = this.x;
        bi biVar = this.b;
        if (vyVar != null) {
            if (this.y) {
                f10 = (this.E - L) + (this.D ? -biVar.f4 : 0.0f);
            } else {
                f10 = 0.0f;
            }
            vyVar.setTranslationY(f10);
        }
        i4 i4Var = this.s;
        if (i4Var != null) {
            boolean z10 = this.y;
            if (z10) {
                f7 = L;
            } else {
                f7 = (this.L || this.E > 0) ? 0 : org.telegram.messenger.i0.n;
            }
            if (!z10 || this.D) {
                f7 += biVar.f4;
            }
            i4Var.getBottomContainer().animate().cancel();
            i4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.y;
            float f11 = z11 ? L : 0.0f;
            if (!z11 || this.D) {
                f11 += biVar.f4;
            }
            i4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = i4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(gr.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.k2 k2Var = this.b.W1;
        if (!(k2Var instanceof un)) {
            return false;
        }
        un unVar = (un) k2Var;
        d4 d4Var = this.r;
        if (!d4Var.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = d4Var.m2();
        ui.b0(org.telegram.messenger.c.a(this.n).a).Q1(unVar.a(), unVar.J7(unVar.D5), "", null, null, null, null, 0L, false, false, m22);
        mk mkVar = unVar.Z;
        if (mkVar == null) {
            return true;
        }
        mkVar.setRichDraftPreview(m22);
        return true;
    }

    public final void Y(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.n3() || this.y;
        bi biVar = this.b;
        ah ahVar = biVar.r3;
        if (biVar.r4 != z11) {
            biVar.r4 = z11;
            if (biVar.M2) {
                ahVar.animate().cancel();
                if (!z11) {
                    ahVar.setVisibility(0);
                }
                if (z10) {
                    ahVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? org.telegram.messenger.i0.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new wg(biVar, z11, 3)).start();
                } else {
                    ahVar.setAlpha(z11 ? 0.0f : 1.0f);
                    ahVar.setTranslationY(z11 ? org.telegram.messenger.i0.L(48.0f) : 0.0f);
                    ahVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !biVar.I1 && biVar.M2) {
            i10 = org.telegram.messenger.i0.L(62.0f);
        }
        this.K = i10;
        V();
        if (this.J == z11) {
            this.J = !z11;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        d4 d4Var = this.r;
        k9 textSelectionHelper = d4Var.getTextSelectionHelper();
        i4 i4Var = this.s;
        if (i4Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] E4 = d4Var.E4();
        i4Var.setQuoteState(E4 != null && d4Var.K3(E4[0], E4[1]));
        boolean O3 = d4Var.O3();
        int[] iArr = Q;
        if (O3) {
            k9 textSelectionHelper2 = d4Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.p0;
            int i13 = textSelectionHelper2.q0;
            int i14 = textSelectionHelper2.t0;
            int i15 = textSelectionHelper2.r0;
            int i16 = textSelectionHelper2.u0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.r.N3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z12 = i13 == i14;
            n1 Q4 = z12 ? d4Var.Q4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), Q4.length()));
            this.s.c(i17, Q4 != null && max < max2 && s6.h(Q4.getText(), max, max2), Q4 != null && max < max2 && s6.g(Q4.getText(), max, max2), z12, d4Var.o2(), true);
            return;
        }
        if (d4Var.z3()) {
            k9 textSelectionHelper3 = d4Var.getTextSelectionHelper();
            n1 v22 = d4Var.v2(textSelectionHelper3.p0);
            int i20 = textSelectionHelper3.r0;
            int i21 = textSelectionHelper3.u0;
            int max3 = v22 == null ? 0 : Math.max(0, Math.min(Math.min(i20, i21), v22.length()));
            int max4 = v22 == null ? 0 : Math.max(0, Math.min(Math.max(i20, i21), v22.length()));
            if (v22 == null || max3 >= max4) {
                i11 = 0;
            } else {
                int i22 = 0;
                for (int i23 = 0; i23 < 8; i23++) {
                    int i24 = iArr[i23];
                    if ((v22.c(max3, max4) & i24) != 0) {
                        i22 |= i24;
                    }
                }
                i11 = i22;
            }
            this.s.c(i11, v22 != null && max3 < max4 && s6.h(v22.getText(), max3, max4), v22 != null && max3 < max4 && s6.g(v22.getText(), max3, max4), true, d4Var.o2(), true);
            return;
        }
        int i25 = textSelectionHelper.p0;
        int i26 = textSelectionHelper.s0;
        int i27 = textSelectionHelper.r0;
        int i28 = textSelectionHelper.u0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < d4Var.w4.size();
        if (z13) {
            int i29 = 0;
            int i30 = 0;
            while (i29 < 8) {
                int i31 = iArr[i29];
                int i32 = i28;
                if (this.r.M3(i31, i25, i27, i26, i32)) {
                    i30 |= i31;
                }
                i29++;
                i28 = i32;
            }
            i10 = i30;
        } else {
            i10 = 0;
        }
        int i33 = i28;
        if (z13) {
            Editable K4 = d4Var.K4(i25, i27, i26, i33);
            if (K4 == null ? false : s6.h(K4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable K42 = d4Var.K4(i25, i27, i26, i33);
                    if (K42 == null ? false : s6.g(K42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z11 = true;
                        this.s.c(i10, z10, z11, !z13 && i25 == i26, d4Var.o2(), !d4Var.L3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i10, z10, z11, !z13 && i25 == i26, d4Var.o2(), !d4Var.L3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i10, z10, z11, !z13 && i25 == i26, d4Var.o2(), !d4Var.L3());
    }

    public final void a0() {
        i4 i4Var = this.s;
        if (i4Var != null) {
            d4 d4Var = this.r;
            boolean u22 = d4Var.u2();
            o2 o2Var = d4Var.Q3;
            boolean z10 = (o2Var == null || o2Var.c.isEmpty()) ? false : true;
            ImageView imageView = i4Var.r;
            ImageView imageView2 = i4Var.n;
            imageView2.setEnabled(u22);
            imageView2.setAlpha(u22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void b0() {
        i4 i4Var = this.s;
        if (i4Var != null) {
            int i10 = this.n;
            boolean z10 = false;
            boolean z11 = (vp.r1(i10).p4() || d20.i(i10).q()) ? false : true;
            zf sendButton = i4Var.getSendButton();
            if (z11) {
                d4 d4Var = this.r;
                if (n5.d(d4Var.s3, d4Var.t3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            i4Var.setPremiumLocked(z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        a T2;
        i4 i4Var = this.s;
        if (i4Var == null) {
            return;
        }
        d4 d4Var = this.r;
        k9 textSelectionHelper = d4Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = d4Var.T2();
        } else {
            int i10 = textSelectionHelper.p0;
            T2 = i10 == textSelectionHelper.s0 ? d4Var.B4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (d4Var.U2() == null) {
            if (T2 != null) {
                if (!T2.a() && !T2.b() && !T2.c()) {
                    TL_iv.PageBlock pageBlock = T2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!d4.F3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = T2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i11 = 1;
                            }
                        }
                    }
                }
                i11 = 2;
            }
            i11 = 0;
        }
        if (T2 != null) {
            if (i11 == 1) {
                TL_iv.PageBlock pageBlock3 = T2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i12 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i12 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i12 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i12 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i12 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i12 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i12 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i12 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i12 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i12 = R.drawable.iv_footer;
                }
            } else if (i11 == 2) {
                if (T2.a()) {
                    i12 = R.drawable.iv_todo;
                } else if (T2.c()) {
                    i12 = R.drawable.iv_ordered_list;
                }
            }
        }
        i4Var.d(i11, i12);
    }

    public final void d0() {
        int paddingTop;
        i4 i4Var = this.s;
        if (i4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(44.0f)) / 2) + org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(8.0f);
        d4 d4Var = this.r;
        if (d4Var.getChildCount() <= 0) {
            paddingTop = d4Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < d4Var.getChildCount(); i11++) {
                View childAt = d4Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            paddingTop = i10 == Integer.MAX_VALUE ? d4Var.getPaddingTop() : i10;
        }
        i4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f5) {
            b0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        d4 d4Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.W1 instanceof un) && d4Var.u2() && W()) {
                org.telegram.messenger.m5.n(null, 2131746020, new cc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!d4Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vy vyVar;
        d4 d4Var = this.r;
        q3 q3Var = d4Var.u3;
        v9 v9Var = d4Var.v3;
        if (q3Var.x() && v9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.D || (vyVar = this.x) == null) ? getHeight() - this.E : (int) vyVar.getY()) - org.telegram.messenger.i0.L(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            U(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.i0.L(60.0f) && motionEvent.getY() < height)) && v9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !d4Var.l3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        d4 d4Var = this.r;
        if (d4Var.getChildCount() <= 0) {
            int paddingTop = d4Var.getPaddingTop();
            this.I = paddingTop;
            d4Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < d4Var.getChildCount(); i11++) {
            View childAt = d4Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z10 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        d4Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - org.telegram.messenger.i0.m;
        int L = org.telegram.messenger.i0.L(7.0f);
        if (i12 < org.telegram.messenger.i0.L(7.0f) || !z10) {
            i12 = L;
        }
        this.I = i12;
        return i12;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - org.telegram.messenger.i0.m) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }

    public k9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean j() {
        boolean z10 = this.D;
        if (z10) {
            if (z10) {
                this.D = false;
                vy vyVar = this.x;
                if (vyVar != null) {
                    vyVar.t(false);
                    this.x.B();
                }
                V();
                return false;
            }
        } else {
            if (this.y) {
                U(false);
                return false;
            }
            if (!this.r.I2() && !T()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uh
    public final void l(float f7) {
        V();
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        kh0 kh0Var = this.O;
        if (kh0Var != null) {
            kh0Var.h();
            this.O = null;
        }
        m.p3 p3Var = this.w;
        if (p3Var != null) {
            p3Var.a();
        }
        d4 d4Var = this.r;
        if (d4Var != null) {
            d4Var.y2();
        }
        vy vyVar = this.x;
        if (vyVar != null) {
            vyVar.C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.n).c(this, zs.f5);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.n).n(this, zs.f5);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean p() {
        d4 d4Var = this.r;
        if (d4Var == null) {
            return false;
        }
        d4Var.y2();
        return false;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean r() {
        return T();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        m.p3 p3Var = this.w;
        if (p3Var != null) {
            p3Var.a();
        }
        if (this.y) {
            U(false);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void y() {
        this.L = this.b.l3.Q() > org.telegram.messenger.i0.L(20.0f);
        V();
        d0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void z(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.y && !this.D) {
            U(false);
        }
        d0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void s() {
    }
}
