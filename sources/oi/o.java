package oi;

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
import c8.ja;
import di.g7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.fw;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class o extends ci implements is {
    public static final int[] R = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean E;
    public int F;
    public e1 G;
    public int H;
    public m60 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public bg0 P;
    public final d Q;
    public final int n;
    public final q3 r;
    public final v3 s;
    public ga.d w;
    public ly x;
    public boolean y;

    public o(int i7, Context context, e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        k kVar = new k(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.n = i7;
        this.h = true;
        this.f = true;
        q3 q3Var = new q3(context, i7, e6Var, new k8.a(7, this, e6Var));
        this.r = q3Var;
        q3Var.setAdaptiveLinkDialogs(false);
        q3Var.setAllowTapAboveContent(false);
        addView(q3Var, ja.e(-1, -1, ns.E1));
        addView(q3Var.getOverlayView(), ja.e(-1, -1, ns.E1));
        q3Var.C4();
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        v3 v3Var = new v3(context, kVar);
        this.s = v3Var;
        v3Var.setBackVisible(false);
        v3Var.setTopGradientVisible(false);
        d0();
        addView(v3Var, ja.e(-1, -1, ns.E1));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void P(o oVar) {
        int i7 = 0;
        if (!(oVar.r.n3() || oVar.y)) {
            ki kiVar = oVar.b;
            if (!kiVar.M1 && kiVar.Q2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (oVar.L != i7) {
            oVar.L = i7;
            oVar.X();
        }
    }

    public static void Q(o oVar) {
        q3 q3Var = oVar.r;
        if (oVar.y) {
            e1 S2 = q3Var.S2();
            if (S2 != null) {
                S2.O();
                org.telegram.messenger.g0.J3(S2);
            }
            oVar.W(true);
            return;
        }
        ki kiVar = oVar.b;
        if (oVar.x == null) {
            ly lyVar = new ly(kiVar.a2, true, false, false, oVar.getContext(), true, null, kiVar.p3, true, oVar.a, false, false);
            oVar.x = lyVar;
            lyVar.setVisibility(8);
            ly lyVar2 = oVar.x;
            lyVar2.y2 = false;
            lyVar2.setBottomInset(org.telegram.messenger.g0.n);
            View view = oVar.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            oVar.x.setDelegate(new n(oVar));
            oVar.addView(oVar.x, ja.e(-1, oVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = oVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oVar.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        oVar.x.setLayoutParams(layoutParams);
        oVar.x.setTranslationY(0.0f);
        oVar.x.setVisibility(0);
        oVar.y = true;
        oVar.F = emojiPanelHeight;
        e1 S22 = q3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        v3 v3Var = oVar.s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(true);
        }
        oVar.a0(false);
        oVar.requestLayout();
    }

    public static e1 R(o oVar) {
        q3 q3Var = oVar.r;
        e1 focusedEditTextOrNull = q3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            e1 e1Var = oVar.G;
            return e1Var != null ? e1Var : q3Var.S2();
        }
        oVar.G = focusedEditTextOrNull;
        oVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int S(o oVar, e1 e1Var) {
        return (e1Var != oVar.G || oVar.r.getFocusedEditTextOrNull() == e1Var) ? Math.max(0, e1Var.getSelectionEnd()) : Math.min(oVar.H, e1Var.length());
    }

    public static void T(o oVar, int i7, int i10) {
        ki kiVar = oVar.b;
        if (kiVar.a2 == null) {
            return;
        }
        ki kiVar2 = new ki(oVar.getContext(), kiVar.a2, false, false, true, oVar.a);
        kiVar2.X3 = new l(oVar, kiVar2);
        kiVar2.e2.i0();
        kiVar2.y1(1, true);
        kiVar2.V0(i7);
        kiVar2.u4 = new e(oVar, kiVar2);
        kiVar2.T1 = new e(oVar, kiVar2);
        kiVar2.S1 = new m(oVar, kiVar2);
        kiVar2.e1();
        if (i10 != 0) {
            kiVar2.o1(i10);
        }
        kiVar2.A0(true);
        kiVar2.show();
    }

    public static void Z(Context context, final String str, final z10 z10Var, e6 e6Var) {
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = j6.G6;
        ShapeDrawable d02 = j6.d0(L, j6.r1(0.05f, j6.w0(i7, e6Var)));
        m6 K = q6.K(0.05f, i7);
        imageView.setBackground(d02);
        q6.j(imageView, d02, K, null, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, ja.t(-1, -2, 49, 12, 2, 12, 0));
        hi.d g10 = i20.g(24, context, e6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        g7 g7Var = new g7(strArr, horizontalScrollView, g10, zArr2, new hi.q4(strArr, 26), imageView, e6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131754008, null), true, false, -1, e6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        int i10 = j6.d6;
        ShapeDrawable d03 = j6.d0(L2, j6.w0(i10, e6Var));
        m6 M = q6.M(i10);
        k3Var.setBackground(d03);
        q6.j(k3Var, d03, M, null, e6Var);
        k3Var.setText(strArr[0]);
        i3Var.addTextChangedListener(new bi.v(strArr, g7Var, false, 9));
        f10.addView(k3Var, ja.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(hd.M0(2131751354, null));
        f10.addView(g10, ja.t(-1, 48, 55, 12, 12, 12, 12));
        g7Var.run();
        k10.O = f10;
        k10.I0 = new DialogInterface.OnDismissListener() { // from class: oi.j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.i3 i3Var2 = org.telegram.ui.Cells.k3.this.d;
                i3Var2.clearFocus();
                org.telegram.messenger.g0.v1(i3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                z10Var.a(strArr2[0]);
            }
        };
        k10.show();
        int i11 = j6.a7;
        k10.w0(i11);
        k10.Q(i11);
        g10.setOnClickListener(new fi.d0(g10, zArr, z10Var, strArr, k10, 4));
        org.telegram.messenger.g0.i3(new kg.j1(k3Var, 21), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q = this.b.p3.Q();
        if (Q <= 0) {
            SharedPreferences d12 = np.d1();
            Point point = org.telegram.messenger.g0.q;
            Q = d12.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", org.telegram.messenger.g0.L(200.0f));
        }
        if (Q <= 0) {
            Q = org.telegram.messenger.g0.L(200.0f);
        }
        return Q + org.telegram.messenger.g0.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        m60 m60Var;
        boolean z10 = this.M;
        ki kiVar = this.b;
        boolean z11 = kiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f);
        this.M = z11;
        if (!z11 && z10 && (m60Var = this.I) != null) {
            m60Var.u();
            this.I = null;
        }
        if (this.M || this.F > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(52.0f);
            kiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    kiVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(52.0f);
            if (L < 0) {
            }
            kiVar.r0 = true;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + L;
        q3 q3Var = this.r;
        int C = org.telegram.messenger.k5.C(110.0f, (this.M || this.F > 0) ? 0 : org.telegram.messenger.g0.n, (q3Var.n3() || this.y || !kiVar.Q2) ? 0 : org.telegram.messenger.g0.L(62.0f)) + this.F;
        if (q3Var.getPaddingTop() != currentActionBarHeight || q3Var.getPaddingBottom() != C) {
            this.O = true;
            q3Var.q1(0, currentActionBarHeight, 0, C);
            this.O = false;
        }
        f0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        this.b.V2.setTitle("");
        this.r.g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        gj gjVar;
        qm qmVar;
        fw fwVar;
        long j10;
        gj gjVar2;
        qj qjVar;
        cg cgVar;
        qj qjVar2;
        int i11 = this.n;
        boolean s42 = np.s1(i11).s4();
        q3 q3Var = this.r;
        if (!s42 && !m10.i(i11).q() && y4.d(q3Var.t3, q3Var.u3)) {
            z1.u0(getContext(), new b(q3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (q3Var.n3() && !q3Var.p3()) {
            if (q3Var.P3()) {
                boolean s43 = np.s1(i11).s4();
                ki kiVar = this.b;
                if (s43) {
                    ArrayList c32 = q3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = q3Var.E2();
                        ArrayList B2 = q3Var.B2();
                        ArrayList a10 = x4.a(i11, c32);
                        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                        if (e2Var instanceof an) {
                            an anVar = (an) e2Var;
                            gj gjVar3 = anVar.E5;
                            gj gjVar4 = anVar.m4;
                            qm qmVar2 = anVar.C5;
                            long j92 = anVar.j9();
                            fwVar = anVar.Y8();
                            gjVar = gjVar4;
                            qmVar = qmVar2;
                            j10 = j92;
                            gjVar2 = gjVar3;
                        } else {
                            gjVar = null;
                            qmVar = null;
                            fwVar = null;
                            j10 = 0;
                            gjVar2 = null;
                        }
                        ez.R(org.telegram.messenger.c.a(kiVar.H3), c32, E2, B2, a10, kiVar.b1(), gjVar2, gjVar, qmVar, z10, i7, i10, fwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
                        if ((e2Var2 instanceof an) && (qjVar = ((an) e2Var2).a0) != null && (cgVar = qjVar.H3) != null) {
                            cgVar.M(null, z10, i7, i10, 0L);
                        }
                        kiVar.a(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.e2 e2Var3 = kiVar.a2;
                    if ((e2Var3 instanceof an) && (qjVar2 = ((an) e2Var3).a0) != null) {
                        qjVar2.i1(y4.g(q3Var.t3), z10, i7, i10);
                        kiVar.a(true);
                        return true;
                    }
                }
            } else {
                v3 v3Var = this.s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(q3Var.P3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean N() {
        return !this.r.n3();
    }

    public final void U(m60 m60Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, m60 m60Var2) {
        m60Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i7, null, str, new ai.r(this, aVar, pageBlock, m60Var2, 26));
        m60Var.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        m60Var.y().a.setTextSize(1, i10);
    }

    public final boolean V() {
        final int i7 = 1;
        q3 q3Var = this.r;
        if (q3Var == null || !q3Var.n3()) {
            return true;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = hd.M0(2131753993, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131753994, null);
        alertDialog$Builder.h(hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) { // from class: oi.i
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        o oVar = this.b;
                        oVar.Y();
                        oVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.k(hd.M0(2131745946, null), new org.telegram.ui.ActionBar.q1(this) { // from class: oi.i
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                switch (i7) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        o oVar = this.b;
                        oVar.Y();
                        oVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void W(boolean z10) {
        if (this.E) {
            this.E = false;
            ly lyVar = this.x;
            if (lyVar != null) {
                lyVar.t(false);
                if (!z10) {
                    this.x.A();
                }
            }
        }
        this.G = null;
        ly lyVar2 = this.x;
        if (lyVar2 != null) {
            lyVar2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        v3 v3Var = this.s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(false);
        }
        a0(false);
        requestLayout();
    }

    public final void X() {
        float f10;
        float f11;
        int L = this.E ? org.telegram.messenger.g0.L(245.0f) : this.F;
        ly lyVar = this.x;
        ki kiVar = this.b;
        if (lyVar != null) {
            if (this.y) {
                f11 = (this.F - L) + (this.E ? -kiVar.j4 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            lyVar.setTranslationY(f11);
        }
        v3 v3Var = this.s;
        if (v3Var != null) {
            boolean z10 = this.y;
            if (z10) {
                f10 = L;
            } else {
                f10 = (this.M || this.F > 0) ? 0 : org.telegram.messenger.g0.n;
            }
            if (!z10 || this.E) {
                f10 += kiVar.j4;
            }
            v3Var.getBottomContainer().animate().cancel();
            v3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.y;
            float f12 = z11 ? L : 0.0f;
            if (!z11 || this.E) {
                f12 += kiVar.j4;
            }
            v3Var.setBottomGradientTranslationY(-f12);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = v3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-r1).setDuration(320L).setInterpolator(er.h).start();
            }
        }
    }

    public final boolean Y() {
        org.telegram.ui.ActionBar.e2 e2Var = this.b.a2;
        if (!(e2Var instanceof an)) {
            return false;
        }
        an anVar = (an) e2Var;
        q3 q3Var = this.r;
        if (!q3Var.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = q3Var.m2();
        si.b0(org.telegram.messenger.c.a(this.n).a).Q1(anVar.a(), anVar.Q7(anVar.E5), "", null, null, null, null, 0L, false, false, m22);
        qj qjVar = anVar.a0;
        if (qjVar == null) {
            return true;
        }
        qjVar.setRichDraftPreview(m22);
        return true;
    }

    public final void a0(boolean z10) {
        int i7 = 0;
        boolean z11 = this.r.n3() || this.y;
        ki kiVar = this.b;
        kh khVar = kiVar.v3;
        if (kiVar.v4 != z11) {
            kiVar.v4 = z11;
            if (kiVar.Q2) {
                khVar.animate().cancel();
                if (!z11) {
                    khVar.setVisibility(0);
                }
                if (z10) {
                    khVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? org.telegram.messenger.g0.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new eh(kiVar, z11, 3)).start();
                } else {
                    khVar.setAlpha(z11 ? 0.0f : 1.0f);
                    khVar.setTranslationY(z11 ? org.telegram.messenger.g0.L(48.0f) : 0.0f);
                    khVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !kiVar.M1 && kiVar.Q2) {
            i7 = org.telegram.messenger.g0.L(62.0f);
        }
        this.L = i7;
        X();
        if (this.K == z11) {
            this.K = !z11;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        int i7;
        boolean z10;
        boolean z11;
        int i10;
        q3 q3Var = this.r;
        h9 textSelectionHelper = q3Var.getTextSelectionHelper();
        v3 v3Var = this.s;
        if (v3Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] E4 = q3Var.E4();
        v3Var.setQuoteState(E4 != null && q3Var.K3(E4[0], E4[1]));
        boolean O3 = q3Var.O3();
        int[] iArr = R;
        if (O3) {
            h9 textSelectionHelper2 = q3Var.getTextSelectionHelper();
            int i11 = textSelectionHelper2.p0;
            int i12 = textSelectionHelper2.q0;
            int i13 = textSelectionHelper2.t0;
            int i14 = textSelectionHelper2.r0;
            int i15 = textSelectionHelper2.u0;
            int i16 = 0;
            for (int i17 = 0; i17 < 8; i17++) {
                int i18 = iArr[i17];
                if (this.r.N3(i18, i11, i12, i14, i13, i15)) {
                    i16 |= i18;
                }
            }
            boolean z12 = i12 == i13;
            e1 Q4 = z12 ? q3Var.Q4(i11, i12) : null;
            int max = Math.max(0, Math.min(i14, i15));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i14, i15), Q4.length()));
            this.s.c(i16, Q4 != null && max < max2 && a6.h(Q4.getText(), max, max2), Q4 != null && max < max2 && a6.g(Q4.getText(), max, max2), z12, q3Var.o2(), true);
            return;
        }
        if (q3Var.z3()) {
            h9 textSelectionHelper3 = q3Var.getTextSelectionHelper();
            e1 v22 = q3Var.v2(textSelectionHelper3.p0);
            int i19 = textSelectionHelper3.r0;
            int i20 = textSelectionHelper3.u0;
            int max3 = v22 == null ? 0 : Math.max(0, Math.min(Math.min(i19, i20), v22.length()));
            int max4 = v22 == null ? 0 : Math.max(0, Math.min(Math.max(i19, i20), v22.length()));
            if (v22 == null || max3 >= max4) {
                i10 = 0;
            } else {
                int i21 = 0;
                for (int i22 = 0; i22 < 8; i22++) {
                    int i23 = iArr[i22];
                    if ((v22.c(max3, max4) & i23) != 0) {
                        i21 |= i23;
                    }
                }
                i10 = i21;
            }
            this.s.c(i10, v22 != null && max3 < max4 && a6.h(v22.getText(), max3, max4), v22 != null && max3 < max4 && a6.g(v22.getText(), max3, max4), true, q3Var.o2(), true);
            return;
        }
        int i24 = textSelectionHelper.p0;
        int i25 = textSelectionHelper.s0;
        int i26 = textSelectionHelper.r0;
        int i27 = textSelectionHelper.u0;
        boolean z13 = i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < q3Var.x4.size();
        if (z13) {
            int i28 = 0;
            int i29 = 0;
            while (i28 < 8) {
                int i30 = iArr[i28];
                int i31 = i27;
                if (this.r.M3(i30, i24, i26, i25, i31)) {
                    i29 |= i30;
                }
                i28++;
                i27 = i31;
            }
            i7 = i29;
        } else {
            i7 = 0;
        }
        int i32 = i27;
        if (z13) {
            Editable K4 = q3Var.K4(i24, i26, i25, i32);
            if (K4 == null ? false : a6.h(K4, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                z10 = true;
                if (z13) {
                    Editable K42 = q3Var.K4(i24, i26, i25, i32);
                    if (K42 == null ? false : a6.g(K42, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                        z11 = true;
                        this.s.c(i7, z10, z11, !z13 && i24 == i25, q3Var.o2(), !q3Var.L3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i7, z10, z11, !z13 && i24 == i25, q3Var.o2(), !q3Var.L3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i7, z10, z11, !z13 && i24 == i25, q3Var.o2(), !q3Var.L3());
    }

    public final void c0() {
        v3 v3Var = this.s;
        if (v3Var != null) {
            q3 q3Var = this.r;
            boolean u22 = q3Var.u2();
            d2 d2Var = q3Var.R3;
            boolean z10 = (d2Var == null || d2Var.c.isEmpty()) ? false : true;
            ImageView imageView = v3Var.r;
            ImageView imageView2 = v3Var.n;
            imageView2.setEnabled(u22);
            imageView2.setAlpha(u22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void d0() {
        v3 v3Var = this.s;
        if (v3Var != null) {
            int i7 = this.n;
            boolean z10 = false;
            boolean z11 = (np.s1(i7).s4() || m10.i(i7).q()) ? false : true;
            jg sendButton = v3Var.getSendButton();
            if (z11) {
                q3 q3Var = this.r;
                if (y4.d(q3Var.t3, q3Var.u3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            v3Var.setPremiumLocked(z11);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f5) {
            d0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        q3 q3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.a2 instanceof an) && q3Var.u2() && Y()) {
                org.telegram.messenger.k5.n(null, 2131746003, new cc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!q3Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ly lyVar;
        q3 q3Var = this.r;
        e3 e3Var = q3Var.v3;
        t9 t9Var = q3Var.w3;
        if (e3Var.x() && t9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.E || (lyVar = this.x) == null) ? getHeight() - this.F : (int) lyVar.getY()) - org.telegram.messenger.g0.L(60.0f)) - this.L;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            W(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < height)) && t9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !q3Var.l3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0() {
        a T2;
        v3 v3Var = this.s;
        if (v3Var == null) {
            return;
        }
        q3 q3Var = this.r;
        h9 textSelectionHelper = q3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = q3Var.T2();
        } else {
            int i7 = textSelectionHelper.p0;
            T2 = i7 == textSelectionHelper.s0 ? q3Var.B4(i7) : null;
        }
        int i10 = 4;
        int i11 = 0;
        if (q3Var.U2() == null) {
            if (T2 != null) {
                if (!T2.a() && !T2.b() && !T2.c()) {
                    TL_iv.PageBlock pageBlock = T2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i10 = 7;
                            } else {
                                if (!q3.F3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = T2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i10 = 1;
                            }
                        }
                    }
                }
                i10 = 2;
            }
            i10 = 0;
        }
        if (T2 != null) {
            if (i10 == 1) {
                TL_iv.PageBlock pageBlock3 = T2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i11 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i11 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i11 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i11 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i11 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i11 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i11 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i11 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i11 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i11 = R.drawable.iv_footer;
                }
            } else if (i10 == 2) {
                if (T2.a()) {
                    i11 = R.drawable.iv_todo;
                } else if (T2.c()) {
                    i11 = R.drawable.iv_ordered_list;
                }
            }
        }
        v3Var.d(i10, i11);
    }

    public final void f0() {
        int paddingTop;
        v3 v3Var = this.s;
        if (v3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        q3 q3Var = this.r;
        if (q3Var.getChildCount() <= 0) {
            paddingTop = q3Var.getPaddingTop();
        } else {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < q3Var.getChildCount(); i10++) {
                View childAt = q3Var.getChildAt(i10);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                }
            }
            paddingTop = i7 == Integer.MAX_VALUE ? q3Var.getPaddingTop() : i7;
        }
        v3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        q3 q3Var = this.r;
        if (q3Var.getChildCount() <= 0) {
            int paddingTop = q3Var.getPaddingTop();
            this.J = paddingTop;
            q3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z10 = false;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < q3Var.getChildCount(); i10++) {
            View childAt = q3Var.getChildAt(i10);
            int R2 = RecyclerView.R(childAt);
            if (R2 == 0) {
                z10 = true;
            }
            if (R2 >= 0 && childAt.getTop() < i7) {
                i7 = childAt.getTop();
            }
        }
        if (i7 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        q3Var.setTopGlowOffset(Math.max(0, i7));
        int i11 = i7 - org.telegram.messenger.g0.m;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (i11 < org.telegram.messenger.g0.L(7.0f) || !z10) {
            i11 = L;
        }
        this.J = i11;
        return i11;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public h9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.ci
    public final int j() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean k() {
        boolean z10 = this.E;
        if (z10) {
            if (z10) {
                this.E = false;
                ly lyVar = this.x;
                if (lyVar != null) {
                    lyVar.t(false);
                    this.x.A();
                }
                X();
                return false;
            }
        } else {
            if (this.y) {
                W(false);
                return false;
            }
            if (!this.r.I2() && !V()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ci
    public final void m(float f10) {
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.n).c(this, ns.f5);
        d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.n).n(this, ns.f5);
    }

    @Override // org.telegram.ui.Components.ci
    public final void p() {
        bg0 bg0Var = this.P;
        if (bg0Var != null) {
            bg0Var.i();
            this.P = null;
        }
        ga.d dVar = this.w;
        if (dVar != null) {
            dVar.c();
        }
        q3 q3Var = this.r;
        if (q3Var != null) {
            q3Var.y2();
        }
        ly lyVar = this.x;
        if (lyVar != null) {
            lyVar.B();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean q() {
        q3 q3Var = this.r;
        if (q3Var == null) {
            return false;
        }
        q3Var.y2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean s() {
        return V();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        ga.d dVar = this.w;
        if (dVar != null) {
            dVar.c();
        }
        if (this.y) {
            W(false);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void y() {
        this.M = this.b.p3.Q() > org.telegram.messenger.g0.L(20.0f);
        X();
        f0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void z(int i7, boolean z10) {
        this.M = z10;
        X();
        if (z10 && this.y && !this.E) {
            W(false);
        }
        f0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void t() {
    }
}
