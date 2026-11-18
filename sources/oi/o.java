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
import c8.ma;
import di.j7;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bw;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.fg0;
import org.telegram.ui.rj;
import org.telegram.ui.rm;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class o extends ki implements fs {
    public static final int[] R = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean E;
    public int F;
    public e1 G;
    public int H;
    public y60 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public fg0 P;
    public final d Q;
    public final int n;
    public final s3 r;
    public final x3 s;
    public ga.d w;
    public ry x;
    public boolean y;

    public o(int i7, Context context, i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        k kVar = new k(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.n = i7;
        this.h = true;
        this.f = true;
        s3 s3Var = new s3(context, i7, i6Var, new k8.a(7, this, i6Var));
        this.r = s3Var;
        s3Var.setAdaptiveLinkDialogs(false);
        s3Var.setAllowTapAboveContent(false);
        addView(s3Var, ma.e(-1, -1, ks.E1));
        addView(s3Var.getOverlayView(), ma.e(-1, -1, ks.E1));
        s3Var.C4();
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        x3 x3Var = new x3(context, kVar);
        this.s = x3Var;
        x3Var.setBackVisible(false);
        x3Var.setTopGradientVisible(false);
        d0();
        addView(x3Var, ma.e(-1, -1, ks.E1));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void P(o oVar) {
        int i7 = 0;
        if (!(oVar.r.n3() || oVar.y)) {
            si siVar = oVar.b;
            if (!siVar.M1 && siVar.Q2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (oVar.L != i7) {
            oVar.L = i7;
            oVar.X();
        }
    }

    public static void Q(o oVar) {
        s3 s3Var = oVar.r;
        if (oVar.y) {
            e1 S2 = s3Var.S2();
            if (S2 != null) {
                S2.O();
                org.telegram.messenger.g0.I3(S2);
            }
            oVar.W(true);
            return;
        }
        si siVar = oVar.b;
        if (oVar.x == null) {
            ry ryVar = new ry(siVar.a2, true, false, false, oVar.getContext(), true, null, siVar.p3, true, oVar.a, false, false);
            oVar.x = ryVar;
            ryVar.setVisibility(8);
            ry ryVar2 = oVar.x;
            ryVar2.y2 = false;
            ryVar2.setBottomInset(org.telegram.messenger.g0.n);
            View view = oVar.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            oVar.x.setDelegate(new n(oVar));
            oVar.addView(oVar.x, ma.e(-1, oVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = oVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oVar.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        oVar.x.setLayoutParams(layoutParams);
        oVar.x.setTranslationY(0.0f);
        oVar.x.setVisibility(0);
        oVar.y = true;
        oVar.F = emojiPanelHeight;
        e1 S22 = s3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        x3 x3Var = oVar.s;
        if (x3Var != null) {
            x3Var.setEmojiOpened(true);
        }
        oVar.a0(false);
        oVar.requestLayout();
    }

    public static e1 R(o oVar) {
        s3 s3Var = oVar.r;
        e1 focusedEditTextOrNull = s3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            e1 e1Var = oVar.G;
            return e1Var != null ? e1Var : s3Var.S2();
        }
        oVar.G = focusedEditTextOrNull;
        oVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int S(o oVar, e1 e1Var) {
        return (e1Var != oVar.G || oVar.r.getFocusedEditTextOrNull() == e1Var) ? Math.max(0, e1Var.getSelectionEnd()) : Math.min(oVar.H, e1Var.length());
    }

    public static void T(o oVar, int i7, int i10) {
        si siVar = oVar.b;
        if (siVar.a2 == null) {
            return;
        }
        si siVar2 = new si(oVar.getContext(), siVar.a2, false, false, true, oVar.a);
        siVar2.X3 = new l(oVar, siVar2);
        siVar2.e2.i0();
        siVar2.z1(1, true);
        siVar2.W0(i7);
        siVar2.u4 = new e(oVar, siVar2);
        siVar2.T1 = new e(oVar, siVar2);
        siVar2.S1 = new m(oVar, siVar2);
        siVar2.f1();
        if (i10 != 0) {
            siVar2.p1(i10);
        }
        siVar2.A0(true);
        siVar2.show();
    }

    public static void Z(Context context, final String str, final x10 x10Var, i6 i6Var) {
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, true);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = n6.G6;
        ShapeDrawable d02 = n6.d0(L, n6.r1(0.05f, n6.w0(i7, i6Var)));
        q6 K = u6.K(0.05f, i7);
        imageView.setBackground(d02);
        u6.j(imageView, d02, K, null, i6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        g10.addView(horizontalScrollView, ma.t(-1, -2, 49, 12, 2, 12, 0));
        hi.d g11 = n10.g(24, context, i6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        j7 j7Var = new j7(strArr, horizontalScrollView, g11, zArr2, new e7(strArr, 26), imageView, i6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, gd.M0(2131754006, null), true, false, -1, i6Var);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setMaxLines(5);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        int i10 = n6.d6;
        ShapeDrawable d03 = n6.d0(L2, n6.w0(i10, i6Var));
        q6 M = u6.M(i10);
        l3Var.setBackground(d03);
        u6.j(l3Var, d03, M, null, i6Var);
        l3Var.setText(strArr[0]);
        j3Var.addTextChangedListener(new bi.v(strArr, j7Var, false, 9));
        g10.addView(l3Var, ma.t(-1, -2, 55, 12, 8, 12, 0));
        g11.setText(gd.M0(2131751343, null));
        g10.addView(g11, ma.t(-1, 48, 55, 12, 12, 12, 12));
        j7Var.run();
        j3.O = g10;
        j3.I0 = new DialogInterface.OnDismissListener() { // from class: oi.j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.j3 j3Var2 = org.telegram.ui.Cells.l3.this.d;
                j3Var2.clearFocus();
                org.telegram.messenger.g0.v1(j3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                x10Var.a(strArr2[0]);
            }
        };
        j3.show();
        int i11 = n6.a7;
        j3.w0(i11);
        j3.Q(i11);
        g11.setOnClickListener(new fi.d0(g11, zArr, x10Var, strArr, j3, 4));
        org.telegram.messenger.g0.h3(new kg.j0(l3Var, 25), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q = this.b.p3.Q();
        if (Q <= 0) {
            SharedPreferences f12 = mp.f1();
            Point point = org.telegram.messenger.g0.q;
            Q = f12.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", org.telegram.messenger.g0.L(200.0f));
        }
        if (Q <= 0) {
            Q = org.telegram.messenger.g0.L(200.0f);
        }
        return Q + org.telegram.messenger.g0.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        y60 y60Var;
        boolean z10 = this.M;
        si siVar = this.b;
        boolean z11 = siVar.p3.Q() > org.telegram.messenger.g0.L(20.0f);
        this.M = z11;
        if (!z11 && z10 && (y60Var = this.I) != null) {
            y60Var.v();
            this.I = null;
        }
        if (this.M || this.F > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(52.0f);
            siVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    siVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(52.0f);
            if (L < 0) {
            }
            siVar.r0 = true;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + L;
        s3 s3Var = this.r;
        int C = org.telegram.messenger.f3.C(110.0f, (this.M || this.F > 0) ? 0 : org.telegram.messenger.g0.n, (s3Var.n3() || this.y || !siVar.Q2) ? 0 : org.telegram.messenger.g0.L(62.0f)) + this.F;
        if (s3Var.getPaddingTop() != currentActionBarHeight || s3Var.getPaddingBottom() != C) {
            this.O = true;
            s3Var.q1(0, currentActionBarHeight, 0, C);
            this.O = false;
        }
        f0();
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        this.b.V2.setTitle("");
        this.r.g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        fj fjVar;
        rm rmVar;
        bw bwVar;
        long j10;
        fj fjVar2;
        rj rjVar;
        kg kgVar;
        rj rjVar2;
        int i11 = this.n;
        boolean B4 = mp.u1(i11).B4();
        s3 s3Var = this.r;
        if (!B4 && !j10.i(i11).q() && z4.d(s3Var.t3, s3Var.u3)) {
            z1.u0(getContext(), new b(s3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (s3Var.n3() && !s3Var.p3()) {
            if (s3Var.P3()) {
                boolean B42 = mp.u1(i11).B4();
                si siVar = this.b;
                if (B42) {
                    ArrayList c32 = s3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = s3Var.E2();
                        ArrayList B2 = s3Var.B2();
                        ArrayList a10 = y4.a(i11, c32);
                        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
                        if (h2Var instanceof bn) {
                            bn bnVar = (bn) h2Var;
                            fj fjVar3 = bnVar.F5;
                            fj fjVar4 = bnVar.m4;
                            rm rmVar2 = bnVar.D5;
                            long j92 = bnVar.j9();
                            bwVar = bnVar.Y8();
                            fjVar = fjVar4;
                            rmVar = rmVar2;
                            j10 = j92;
                            fjVar2 = fjVar3;
                        } else {
                            fjVar = null;
                            rmVar = null;
                            bwVar = null;
                            j10 = 0;
                            fjVar2 = null;
                        }
                        zy.R(org.telegram.messenger.c.a(siVar.H3), c32, E2, B2, a10, siVar.c1(), fjVar2, fjVar, rmVar, z10, i7, i10, bwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar.a2;
                        if ((h2Var2 instanceof bn) && (rjVar = ((bn) h2Var2).a0) != null && (kgVar = rjVar.N3) != null) {
                            kgVar.H(null, z10, i7, i10, 0L);
                        }
                        siVar.a(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.h2 h2Var3 = siVar.a2;
                    if ((h2Var3 instanceof bn) && (rjVar2 = ((bn) h2Var3).a0) != null) {
                        rjVar2.q1(z4.g(s3Var.t3), z10, i7, i10);
                        siVar.a(true);
                        return true;
                    }
                }
            } else {
                x3 x3Var = this.s;
                if (x3Var != null) {
                    x3Var.setSendEnabled(s3Var.P3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean N() {
        return !this.r.n3();
    }

    public final void U(y60 y60Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, y60 y60Var2) {
        y60Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i7, null, str, new ai.s(this, aVar, pageBlock, y60Var2, 29));
        y60Var.z().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        y60Var.z().a.setTextSize(1, i10);
    }

    public final boolean V() {
        final int i7 = 1;
        s3 s3Var = this.r;
        if (s3Var == null || !s3Var.n3()) {
            return true;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = gd.M0(2131753991, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = gd.M0(2131753992, null);
        alertDialog$Builder.h(gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1(this) { // from class: oi.i
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
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
        alertDialog$Builder.k(gd.M0(2131745751, null), new org.telegram.ui.ActionBar.r1(this) { // from class: oi.i
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
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
            ry ryVar = this.x;
            if (ryVar != null) {
                ryVar.t(false);
                if (!z10) {
                    this.x.A();
                }
            }
        }
        this.G = null;
        ry ryVar2 = this.x;
        if (ryVar2 != null) {
            ryVar2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        x3 x3Var = this.s;
        if (x3Var != null) {
            x3Var.setEmojiOpened(false);
        }
        a0(false);
        requestLayout();
    }

    public final void X() {
        float f10;
        float f11;
        int L = this.E ? org.telegram.messenger.g0.L(245.0f) : this.F;
        ry ryVar = this.x;
        si siVar = this.b;
        if (ryVar != null) {
            if (this.y) {
                f11 = (this.F - L) + (this.E ? -siVar.j4 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            ryVar.setTranslationY(f11);
        }
        x3 x3Var = this.s;
        if (x3Var != null) {
            boolean z10 = this.y;
            if (z10) {
                f10 = L;
            } else {
                f10 = (this.M || this.F > 0) ? 0 : org.telegram.messenger.g0.n;
            }
            if (!z10 || this.E) {
                f10 += siVar.j4;
            }
            x3Var.getBottomContainer().animate().cancel();
            x3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.y;
            float f12 = z11 ? L : 0.0f;
            if (!z11 || this.E) {
                f12 += siVar.j4;
            }
            x3Var.setBottomGradientTranslationY(-f12);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = x3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-r1).setDuration(320L).setInterpolator(lr.h).start();
            }
        }
    }

    public final boolean Y() {
        org.telegram.ui.ActionBar.h2 h2Var = this.b.a2;
        if (!(h2Var instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) h2Var;
        s3 s3Var = this.r;
        if (!s3Var.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = s3Var.m2();
        ri.d0(org.telegram.messenger.c.a(this.n).a).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, m22);
        rj rjVar = bnVar.a0;
        if (rjVar == null) {
            return true;
        }
        rjVar.setRichDraftPreview(m22);
        return true;
    }

    public final void a0(boolean z10) {
        int i7 = 0;
        boolean z11 = this.r.n3() || this.y;
        si siVar = this.b;
        sh shVar = siVar.v3;
        if (siVar.v4 != z11) {
            siVar.v4 = z11;
            if (siVar.Q2) {
                shVar.animate().cancel();
                if (!z11) {
                    shVar.setVisibility(0);
                }
                if (z10) {
                    shVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? org.telegram.messenger.g0.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new nh(siVar, z11, 3)).start();
                } else {
                    shVar.setAlpha(z11 ? 0.0f : 1.0f);
                    shVar.setTranslationY(z11 ? org.telegram.messenger.g0.L(48.0f) : 0.0f);
                    shVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !siVar.M1 && siVar.Q2) {
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
        s3 s3Var = this.r;
        j9 textSelectionHelper = s3Var.getTextSelectionHelper();
        x3 x3Var = this.s;
        if (x3Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] E4 = s3Var.E4();
        x3Var.setQuoteState(E4 != null && s3Var.K3(E4[0], E4[1]));
        boolean O3 = s3Var.O3();
        int[] iArr = R;
        if (O3) {
            j9 textSelectionHelper2 = s3Var.getTextSelectionHelper();
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
            e1 Q4 = z12 ? s3Var.Q4(i11, i12) : null;
            int max = Math.max(0, Math.min(i14, i15));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i14, i15), Q4.length()));
            this.s.c(i16, Q4 != null && max < max2 && b6.h(Q4.getText(), max, max2), Q4 != null && max < max2 && b6.g(Q4.getText(), max, max2), z12, s3Var.o2(), true);
            return;
        }
        if (s3Var.z3()) {
            j9 textSelectionHelper3 = s3Var.getTextSelectionHelper();
            e1 v22 = s3Var.v2(textSelectionHelper3.p0);
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
            this.s.c(i10, v22 != null && max3 < max4 && b6.h(v22.getText(), max3, max4), v22 != null && max3 < max4 && b6.g(v22.getText(), max3, max4), true, s3Var.o2(), true);
            return;
        }
        int i24 = textSelectionHelper.p0;
        int i25 = textSelectionHelper.s0;
        int i26 = textSelectionHelper.r0;
        int i27 = textSelectionHelper.u0;
        boolean z13 = i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < s3Var.x4.size();
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
            Editable K4 = s3Var.K4(i24, i26, i25, i32);
            if (K4 == null ? false : b6.h(K4, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                z10 = true;
                if (z13) {
                    Editable K42 = s3Var.K4(i24, i26, i25, i32);
                    if (K42 == null ? false : b6.g(K42, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                        z11 = true;
                        this.s.c(i7, z10, z11, !z13 && i24 == i25, s3Var.o2(), !s3Var.L3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i7, z10, z11, !z13 && i24 == i25, s3Var.o2(), !s3Var.L3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i7, z10, z11, !z13 && i24 == i25, s3Var.o2(), !s3Var.L3());
    }

    public final void c0() {
        x3 x3Var = this.s;
        if (x3Var != null) {
            s3 s3Var = this.r;
            boolean u22 = s3Var.u2();
            e2 e2Var = s3Var.R3;
            boolean z10 = (e2Var == null || e2Var.c.isEmpty()) ? false : true;
            ImageView imageView = x3Var.r;
            ImageView imageView2 = x3Var.n;
            imageView2.setEnabled(u22);
            imageView2.setAlpha(u22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void d0() {
        x3 x3Var = this.s;
        if (x3Var != null) {
            int i7 = this.n;
            boolean z10 = false;
            boolean z11 = (mp.u1(i7).B4() || j10.i(i7).q()) ? false : true;
            sg sendButton = x3Var.getSendButton();
            if (z11) {
                s3 s3Var = this.r;
                if (z4.d(s3Var.t3, s3Var.u3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            x3Var.setPremiumLocked(z11);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.i5) {
            d0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        s3 s3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.a2 instanceof bn) && s3Var.u2() && Y()) {
                org.telegram.messenger.f3.n(null, 2131745808, new lc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!s3Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ry ryVar;
        s3 s3Var = this.r;
        g3 g3Var = s3Var.v3;
        v9 v9Var = s3Var.w3;
        if (g3Var.x() && v9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.E || (ryVar = this.x) == null) ? getHeight() - this.F : (int) ryVar.getY()) - org.telegram.messenger.g0.L(60.0f)) - this.L;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            W(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < height)) && v9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !s3Var.l3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ki
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
        x3 x3Var = this.s;
        if (x3Var == null) {
            return;
        }
        s3 s3Var = this.r;
        j9 textSelectionHelper = s3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = s3Var.T2();
        } else {
            int i7 = textSelectionHelper.p0;
            T2 = i7 == textSelectionHelper.s0 ? s3Var.B4(i7) : null;
        }
        int i10 = 4;
        int i11 = 0;
        if (s3Var.U2() == null) {
            if (T2 != null) {
                if (!T2.a() && !T2.b() && !T2.c()) {
                    TL_iv.PageBlock pageBlock = T2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i10 = 7;
                            } else {
                                if (!s3.F3(pageBlock)) {
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
        x3Var.d(i10, i11);
    }

    public final void f0() {
        int paddingTop;
        x3 x3Var = this.s;
        if (x3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        s3 s3Var = this.r;
        if (s3Var.getChildCount() <= 0) {
            paddingTop = s3Var.getPaddingTop();
        } else {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < s3Var.getChildCount(); i10++) {
                View childAt = s3Var.getChildAt(i10);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                }
            }
            paddingTop = i7 == Integer.MAX_VALUE ? s3Var.getPaddingTop() : i7;
        }
        x3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        s3 s3Var = this.r;
        if (s3Var.getChildCount() <= 0) {
            int paddingTop = s3Var.getPaddingTop();
            this.J = paddingTop;
            s3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z10 = false;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < s3Var.getChildCount(); i10++) {
            View childAt = s3Var.getChildAt(i10);
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
        s3Var.setTopGlowOffset(Math.max(0, i7));
        int i11 = i7 - org.telegram.messenger.g0.m;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (i11 < org.telegram.messenger.g0.L(7.0f) || !z10) {
            i11 = L;
        }
        this.J = i11;
        return i11;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public j9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.ki
    public final int j() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean k() {
        boolean z10 = this.E;
        if (z10) {
            if (z10) {
                this.E = false;
                ry ryVar = this.x;
                if (ryVar != null) {
                    ryVar.t(false);
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

    @Override // org.telegram.ui.Components.ki
    public final void m(float f10) {
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.n).c(this, ks.i5);
        d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.n).n(this, ks.i5);
    }

    @Override // org.telegram.ui.Components.ki
    public final void p() {
        fg0 fg0Var = this.P;
        if (fg0Var != null) {
            fg0Var.i();
            this.P = null;
        }
        ga.d dVar = this.w;
        if (dVar != null) {
            dVar.c();
        }
        s3 s3Var = this.r;
        if (s3Var != null) {
            s3Var.y2();
        }
        ry ryVar = this.x;
        if (ryVar != null) {
            ryVar.B();
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean q() {
        s3 s3Var = this.r;
        if (s3Var == null) {
            return false;
        }
        s3Var.y2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean s() {
        return V();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ki
    public final void u() {
        ga.d dVar = this.w;
        if (dVar != null) {
            dVar.c();
        }
        if (this.y) {
            W(false);
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void y() {
        this.M = this.b.p3.Q() > org.telegram.messenger.g0.L(20.0f);
        X();
        f0();
    }

    @Override // org.telegram.ui.Components.ki
    public final void z(int i7, boolean z10) {
        this.M = z10;
        X();
        if (z10 && this.y && !this.E) {
            W(false);
        }
        f0();
    }

    @Override // org.telegram.ui.Components.ki
    public final void t() {
    }
}
