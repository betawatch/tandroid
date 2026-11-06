package li;

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
import bi.n8;
import c8.ha;
import fi.h7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.hw;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class p extends vh implements ls {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean D;
    public int E;
    public g1 F;
    public int G;
    public k60 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public bg0 O;
    public final d P;
    public final int n;
    public final t3 r;
    public final y3 s;
    public ga.d w;
    public gy x;
    public boolean y;

    public p(int i7, Context context, f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        l lVar = new l(this);
        this.J = true;
        this.P = new d(this, 3);
        this.n = i7;
        this.h = true;
        this.f = true;
        t3 t3Var = new t3(context, i7, f6Var, new wf.b(this, f6Var, false, 28));
        this.r = t3Var;
        t3Var.setAdaptiveLinkDialogs(false);
        t3Var.setAllowTapAboveContent(false);
        addView(t3Var, ha.e(-1, -1, qs.E1));
        addView(t3Var.getOverlayView(), ha.e(-1, -1, qs.E1));
        t3Var.C4();
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        y3 y3Var = new y3(context, lVar);
        this.s = y3Var;
        y3Var.setBackVisible(false);
        y3Var.setTopGradientVisible(false);
        d0();
        addView(y3Var, ha.e(-1, -1, qs.E1));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void O(p pVar) {
        int i7 = 0;
        if (!(pVar.r.n3() || pVar.y)) {
            di diVar = pVar.b;
            if (!diVar.I1 && diVar.M2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (pVar.K != i7) {
            pVar.K = i7;
            pVar.W();
        }
    }

    public static void P(p pVar) {
        t3 t3Var = pVar.r;
        if (pVar.y) {
            g1 S2 = t3Var.S2();
            if (S2 != null) {
                S2.N();
                org.telegram.messenger.g0.K3(S2);
            }
            pVar.V(true);
            return;
        }
        di diVar = pVar.b;
        if (pVar.x == null) {
            gy gyVar = new gy(diVar.W1, true, false, false, pVar.getContext(), true, null, diVar.l3, true, pVar.a, false, false);
            pVar.x = gyVar;
            gyVar.setVisibility(8);
            gy gyVar2 = pVar.x;
            gyVar2.x2 = false;
            gyVar2.setBottomInset(org.telegram.messenger.g0.n);
            View view = pVar.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.x.setDelegate(new o(pVar));
            pVar.addView(pVar.x, ha.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.x.setLayoutParams(layoutParams);
        pVar.x.setTranslationY(0.0f);
        pVar.x.setVisibility(0);
        pVar.y = true;
        pVar.E = emojiPanelHeight;
        g1 S22 = t3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        y3 y3Var = pVar.s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(true);
        }
        pVar.a0(false);
        pVar.requestLayout();
    }

    public static g1 Q(p pVar) {
        t3 t3Var = pVar.r;
        g1 focusedEditTextOrNull = t3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            g1 g1Var = pVar.F;
            return g1Var != null ? g1Var : t3Var.S2();
        }
        pVar.F = focusedEditTextOrNull;
        pVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int R(p pVar, g1 g1Var) {
        return (g1Var != pVar.F || pVar.r.getFocusedEditTextOrNull() == g1Var) ? Math.max(0, g1Var.getSelectionEnd()) : Math.min(pVar.G, g1Var.length());
    }

    public static void S(p pVar, int i7, int i10) {
        di diVar = pVar.b;
        if (diVar.W1 == null) {
            return;
        }
        di diVar2 = new di(pVar.getContext(), diVar.W1, false, false, true, pVar.a);
        diVar2.T3 = new m(pVar, diVar2);
        diVar2.a2.i0();
        diVar2.y1(1, true);
        diVar2.V0(i7);
        diVar2.q4 = new e(pVar, diVar2);
        diVar2.P1 = new e(pVar, diVar2);
        diVar2.O1 = new n(pVar, diVar2);
        diVar2.e1();
        if (i10 != 0) {
            diVar2.o1(i10);
        }
        diVar2.A0(true);
        diVar2.show();
    }

    public static void Z(Context context, final String str, final c20 c20Var, f6 f6Var) {
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = k6.G6;
        ShapeDrawable d02 = k6.d0(L, k6.r1(0.05f, k6.w0(i7, f6Var)));
        n6 L2 = r6.L(0.05f, i7);
        imageView.setBackground(d02);
        r6.k(imageView, d02, L2, null, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, ha.t(-1, -2, 49, 12, 2, 12, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        n8 n8Var = new n8(strArr, horizontalScrollView, h, zArr2, new hi.u1(strArr, 16), imageView, f6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131754008, null), true, false, -1, f6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        int L3 = org.telegram.messenger.g0.L(24.0f);
        int i10 = k6.d6;
        ShapeDrawable d03 = k6.d0(L3, k6.w0(i10, f6Var));
        n6 N = r6.N(i10);
        k3Var.setBackground(d03);
        r6.k(k3Var, d03, N, null, f6Var);
        k3Var.setText(strArr[0]);
        i3Var.addTextChangedListener(new h7(strArr, n8Var, false, 2));
        f10.addView(k3Var, ha.t(-1, -2, 55, 12, 8, 12, 0));
        h.setText(hd.M0(2131751355, null));
        f10.addView(h, ha.t(-1, 48, 55, 12, 12, 12, 12));
        n8Var.run();
        l10.N = f10;
        l10.H0 = new DialogInterface.OnDismissListener() { // from class: li.k
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
                c20Var.a(strArr2[0]);
            }
        };
        l10.show();
        int i11 = k6.a7;
        l10.w0(i11);
        l10.P(i11);
        h.setOnClickListener(new di.d0(h, zArr, c20Var, strArr, l10, 4));
        org.telegram.messenger.g0.i3(new l2.w(k3Var, 3), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q2 = this.b.l3.Q();
        if (Q2 <= 0) {
            SharedPreferences d12 = qp.d1();
            Point point = org.telegram.messenger.g0.q;
            Q2 = d12.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", org.telegram.messenger.g0.L(200.0f));
        }
        if (Q2 <= 0) {
            Q2 = org.telegram.messenger.g0.L(200.0f);
        }
        return Q2 + org.telegram.messenger.g0.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        k60 k60Var;
        boolean z9 = this.L;
        di diVar = this.b;
        boolean z10 = diVar.l3.Q() > org.telegram.messenger.g0.L(20.0f);
        this.L = z10;
        if (!z10 && z9 && (k60Var = this.H) != null) {
            k60Var.u();
            this.H = null;
        }
        if (this.L || this.E > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(52.0f);
            diVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    diVar.q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(52.0f);
            if (L < 0) {
            }
            diVar.q0 = true;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + L;
        t3 t3Var = this.r;
        int C = org.telegram.messenger.k5.C(110.0f, (this.L || this.E > 0) ? 0 : org.telegram.messenger.g0.n, (t3Var.n3() || this.y || !diVar.M2) ? 0 : org.telegram.messenger.g0.L(62.0f)) + this.E;
        if (t3Var.getPaddingTop() != currentActionBarHeight || t3Var.getPaddingBottom() != C) {
            this.N = true;
            t3Var.q1(0, currentActionBarHeight, 0, C);
            this.N = false;
        }
        f0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        this.b.R2.setTitle("");
        this.r.f3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean L(boolean z9, int i7, int i10, long j3, boolean z10) {
        ij ijVar;
        qm qmVar;
        hw hwVar;
        long j10;
        ij ijVar2;
        qj qjVar;
        wf wfVar;
        qj qjVar2;
        int i11 = this.n;
        boolean s42 = qp.s1(i11).s4();
        t3 t3Var = this.r;
        if (!s42 && !p10.i(i11).q() && a5.d(t3Var.s3, t3Var.t3)) {
            b2.u0(getContext(), new b(t3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (t3Var.n3() && !t3Var.p3()) {
            if (t3Var.P3()) {
                boolean s43 = qp.s1(i11).s4();
                di diVar = this.b;
                if (s43) {
                    ArrayList c32 = t3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = t3Var.E2();
                        ArrayList B2 = t3Var.B2();
                        ArrayList a10 = z4.a(i11, c32);
                        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                        if (f2Var instanceof an) {
                            an anVar = (an) f2Var;
                            ij ijVar3 = anVar.D5;
                            ij ijVar4 = anVar.l4;
                            qm qmVar2 = anVar.B5;
                            long h92 = anVar.h9();
                            hwVar = anVar.W8();
                            ijVar = ijVar4;
                            qmVar = qmVar2;
                            j10 = h92;
                            ijVar2 = ijVar3;
                        } else {
                            ijVar = null;
                            qmVar = null;
                            hwVar = null;
                            j10 = 0;
                            ijVar2 = null;
                        }
                        gz.R(org.telegram.messenger.c.a(diVar.D3), c32, E2, B2, a10, diVar.b1(), ijVar2, ijVar, qmVar, z9, i7, i10, hwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                        if ((f2Var2 instanceof an) && (qjVar = ((an) f2Var2).Z) != null && (wfVar = qjVar.Z2) != null) {
                            wfVar.F(null, z9, i7, i10, 0L);
                        }
                        diVar.a(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.f2 f2Var3 = diVar.W1;
                    if ((f2Var3 instanceof an) && (qjVar2 = ((an) f2Var3).Z) != null) {
                        qjVar2.R0(a5.g(t3Var.s3), z9, i7, i10);
                        diVar.a(true);
                        return true;
                    }
                }
            } else {
                y3 y3Var = this.s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(t3Var.P3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean M() {
        return !this.r.n3();
    }

    public final void T(k60 k60Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, k60 k60Var2) {
        k60Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i7, null, str, new ai.d0(this, aVar, pageBlock, k60Var2, 24));
        k60Var.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        k60Var.y().a.setTextSize(1, i10);
    }

    public final boolean U() {
        final int i7 = 1;
        t3 t3Var = this.r;
        if (t3Var == null || !t3Var.n3()) {
            return true;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = hd.M0(2131753993, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = hd.M0(2131753994, null);
        alertDialog$Builder.h(hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1(this) { // from class: li.j
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        p pVar = this.b;
                        pVar.X();
                        pVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.k(hd.M0(2131745947, null), new org.telegram.ui.ActionBar.r1(this) { // from class: li.j
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                switch (i7) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        p pVar = this.b;
                        pVar.X();
                        pVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void V(boolean z9) {
        if (this.D) {
            this.D = false;
            gy gyVar = this.x;
            if (gyVar != null) {
                gyVar.t(false);
                if (!z9) {
                    this.x.A();
                }
            }
        }
        this.F = null;
        gy gyVar2 = this.x;
        if (gyVar2 != null) {
            gyVar2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.E = 0;
        y3 y3Var = this.s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(false);
        }
        a0(false);
        requestLayout();
    }

    public final void W() {
        float f10;
        float f11;
        int L = this.D ? org.telegram.messenger.g0.L(245.0f) : this.E;
        gy gyVar = this.x;
        di diVar = this.b;
        if (gyVar != null) {
            if (this.y) {
                f11 = (this.E - L) + (this.D ? -diVar.f4 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            gyVar.setTranslationY(f11);
        }
        y3 y3Var = this.s;
        if (y3Var != null) {
            boolean z9 = this.y;
            if (z9) {
                f10 = L;
            } else {
                f10 = (this.L || this.E > 0) ? 0 : org.telegram.messenger.g0.n;
            }
            if (!z9 || this.D) {
                f10 += diVar.f4;
            }
            y3Var.getBottomContainer().animate().cancel();
            y3Var.getBottomContainer().setTranslationY(-f10);
            boolean z10 = this.y;
            float f12 = z10 ? L : 0.0f;
            if (!z10 || this.D) {
                f12 += diVar.f4;
            }
            y3Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = y3Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(xq.h).start();
            }
        }
    }

    public final boolean X() {
        org.telegram.ui.ActionBar.f2 f2Var = this.b.W1;
        if (!(f2Var instanceof an)) {
            return false;
        }
        an anVar = (an) f2Var;
        t3 t3Var = this.r;
        if (!t3Var.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = t3Var.m2();
        ui.b0(org.telegram.messenger.c.a(this.n).a).Q1(anVar.a(), anVar.P7(anVar.D5), "", null, null, null, null, 0L, false, false, m22);
        qj qjVar = anVar.Z;
        if (qjVar == null) {
            return true;
        }
        qjVar.setRichDraftPreview(m22);
        return true;
    }

    public final void a0(boolean z9) {
        int i7 = 0;
        boolean z10 = this.r.n3() || this.y;
        di diVar = this.b;
        dh dhVar = diVar.r3;
        if (diVar.r4 != z10) {
            diVar.r4 = z10;
            if (diVar.M2) {
                dhVar.animate().cancel();
                if (!z10) {
                    dhVar.setVisibility(0);
                }
                if (z9) {
                    dhVar.animate().alpha(z10 ? 0.0f : 1.0f).translationY(z10 ? org.telegram.messenger.g0.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new zg(diVar, z10, 3)).start();
                } else {
                    dhVar.setAlpha(z10 ? 0.0f : 1.0f);
                    dhVar.setTranslationY(z10 ? org.telegram.messenger.g0.L(48.0f) : 0.0f);
                    dhVar.setVisibility(z10 ? 4 : 0);
                }
            }
        }
        if (!z10 && !diVar.I1 && diVar.M2) {
            i7 = org.telegram.messenger.g0.L(62.0f);
        }
        this.K = i7;
        W();
        if (this.J == z10) {
            this.J = !z10;
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
        boolean z9;
        boolean z10;
        int i10;
        t3 t3Var = this.r;
        i9 textSelectionHelper = t3Var.getTextSelectionHelper();
        y3 y3Var = this.s;
        if (y3Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] E4 = t3Var.E4();
        y3Var.setQuoteState(E4 != null && t3Var.K3(E4[0], E4[1]));
        boolean O3 = t3Var.O3();
        int[] iArr = Q;
        if (O3) {
            i9 textSelectionHelper2 = t3Var.getTextSelectionHelper();
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
            boolean z11 = i12 == i13;
            g1 Q4 = z11 ? t3Var.Q4(i11, i12) : null;
            int max = Math.max(0, Math.min(i14, i15));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i14, i15), Q4.length()));
            this.s.c(i16, Q4 != null && max < max2 && c6.h(Q4.getText(), max, max2), Q4 != null && max < max2 && c6.g(Q4.getText(), max, max2), z11, t3Var.o2(), true);
            return;
        }
        if (t3Var.z3()) {
            i9 textSelectionHelper3 = t3Var.getTextSelectionHelper();
            g1 v22 = t3Var.v2(textSelectionHelper3.p0);
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
            this.s.c(i10, v22 != null && max3 < max4 && c6.h(v22.getText(), max3, max4), v22 != null && max3 < max4 && c6.g(v22.getText(), max3, max4), true, t3Var.o2(), true);
            return;
        }
        int i24 = textSelectionHelper.p0;
        int i25 = textSelectionHelper.s0;
        int i26 = textSelectionHelper.r0;
        int i27 = textSelectionHelper.u0;
        boolean z12 = i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < t3Var.w4.size();
        if (z12) {
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
        if (z12) {
            Editable K4 = t3Var.K4(i24, i26, i25, i32);
            if (K4 == null ? false : c6.h(K4, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                z9 = true;
                if (z12) {
                    Editable K42 = t3Var.K4(i24, i26, i25, i32);
                    if (K42 == null ? false : c6.g(K42, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                        z10 = true;
                        this.s.c(i7, z9, z10, !z12 && i24 == i25, t3Var.o2(), !t3Var.L3());
                    }
                }
                z10 = false;
                if (z12) {
                }
                this.s.c(i7, z9, z10, !z12 && i24 == i25, t3Var.o2(), !t3Var.L3());
            }
        }
        z9 = false;
        if (z12) {
        }
        z10 = false;
        if (z12) {
        }
        this.s.c(i7, z9, z10, !z12 && i24 == i25, t3Var.o2(), !t3Var.L3());
    }

    public final void c0() {
        y3 y3Var = this.s;
        if (y3Var != null) {
            t3 t3Var = this.r;
            boolean u22 = t3Var.u2();
            f2 f2Var = t3Var.Q3;
            boolean z9 = (f2Var == null || f2Var.c.isEmpty()) ? false : true;
            ImageView imageView = y3Var.r;
            ImageView imageView2 = y3Var.n;
            imageView2.setEnabled(u22);
            imageView2.setAlpha(u22 ? 1.0f : 0.35f);
            imageView.setEnabled(z9);
            imageView.setAlpha(z9 ? 1.0f : 0.35f);
        }
    }

    public final void d0() {
        y3 y3Var = this.s;
        if (y3Var != null) {
            int i7 = this.n;
            boolean z9 = false;
            boolean z10 = (qp.s1(i7).s4() || p10.i(i7).q()) ? false : true;
            dg sendButton = y3Var.getSendButton();
            if (z10) {
                t3 t3Var = this.r;
                if (a5.d(t3Var.s3, t3Var.t3)) {
                    z9 = true;
                }
            }
            sendButton.setLocked(z9);
            y3Var.setPremiumLocked(z10);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f5) {
            d0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        t3 t3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.W1 instanceof an) && t3Var.u2() && X()) {
                org.telegram.messenger.k5.o(null, 2131746004, new hc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!t3Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gy gyVar;
        t3 t3Var = this.r;
        g3 g3Var = t3Var.u3;
        u9 u9Var = t3Var.v3;
        if (g3Var.x() && u9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.D || (gyVar = this.x) == null) ? getHeight() - this.E : (int) gyVar.getY()) - org.telegram.messenger.g0.L(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            V(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < height)) && u9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !t3Var.l3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vh
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
        y3 y3Var = this.s;
        if (y3Var == null) {
            return;
        }
        t3 t3Var = this.r;
        i9 textSelectionHelper = t3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = t3Var.T2();
        } else {
            int i7 = textSelectionHelper.p0;
            T2 = i7 == textSelectionHelper.s0 ? t3Var.B4(i7) : null;
        }
        int i10 = 4;
        int i11 = 0;
        if (t3Var.U2() == null) {
            if (T2 != null) {
                if (!T2.a() && !T2.b() && !T2.c()) {
                    TL_iv.PageBlock pageBlock = T2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i10 = 7;
                            } else {
                                if (!t3.F3(pageBlock)) {
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
        y3Var.d(i10, i11);
    }

    public final void f0() {
        int paddingTop;
        y3 y3Var = this.s;
        if (y3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        t3 t3Var = this.r;
        if (t3Var.getChildCount() <= 0) {
            paddingTop = t3Var.getPaddingTop();
        } else {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < t3Var.getChildCount(); i10++) {
                View childAt = t3Var.getChildAt(i10);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                }
            }
            paddingTop = i7 == Integer.MAX_VALUE ? t3Var.getPaddingTop() : i7;
        }
        y3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        t3 t3Var = this.r;
        if (t3Var.getChildCount() <= 0) {
            int paddingTop = t3Var.getPaddingTop();
            this.I = paddingTop;
            t3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z9 = false;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < t3Var.getChildCount(); i10++) {
            View childAt = t3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z9 = true;
            }
            if (R >= 0 && childAt.getTop() < i7) {
                i7 = childAt.getTop();
            }
        }
        if (i7 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        t3Var.setTopGlowOffset(Math.max(0, i7));
        int i11 = i7 - org.telegram.messenger.g0.m;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (i11 < org.telegram.messenger.g0.L(7.0f) || !z9) {
            i11 = L;
        }
        this.I = i11;
        return i11;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public i9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean k() {
        boolean z9 = this.D;
        if (z9) {
            if (z9) {
                this.D = false;
                gy gyVar = this.x;
                if (gyVar != null) {
                    gyVar.t(false);
                    this.x.A();
                }
                W();
                return false;
            }
        } else {
            if (this.y) {
                V(false);
                return false;
            }
            if (!this.r.I2() && !U()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vh
    public final void m(float f10) {
        W();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.n).c(this, qs.f5);
        d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.n).n(this, qs.f5);
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
        bg0 bg0Var = this.O;
        if (bg0Var != null) {
            bg0Var.h();
            this.O = null;
        }
        ga.d dVar = this.w;
        if (dVar != null) {
            dVar.c();
        }
        t3 t3Var = this.r;
        if (t3Var != null) {
            t3Var.y2();
        }
        gy gyVar = this.x;
        if (gyVar != null) {
            gyVar.B();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean q() {
        t3 t3Var = this.r;
        if (t3Var == null) {
            return false;
        }
        t3Var.y2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean s() {
        return U();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        ga.d dVar = this.w;
        if (dVar != null) {
            dVar.c();
        }
        if (this.y) {
            V(false);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void y() {
        this.L = this.b.l3.Q() > org.telegram.messenger.g0.L(20.0f);
        W();
        f0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void z(int i7, boolean z9) {
        this.L = z9;
        W();
        if (z9 && this.y && !this.D) {
            V(false);
        }
        f0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void t() {
    }
}
