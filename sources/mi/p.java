package mi;

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
import b8.mf;
import ci.o7;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.messenger.zv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mj;
import org.telegram.ui.mm;
import org.telegram.ui.vf0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class p extends th implements cs {
    public static final int[] R = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean E;
    public int F;
    public h1 G;
    public int H;
    public f60 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public vf0 P;
    public final d Q;
    public final int n;
    public final t3 r;
    public final y3 s;
    public fa.f w;
    public ey x;
    public boolean y;

    public p(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        l lVar = new l(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.n = i3;
        this.h = true;
        this.f = true;
        t3 t3Var = new t3(context, i3, e6Var, new m2.t(1, this, e6Var));
        this.r = t3Var;
        t3Var.setAdaptiveLinkDialogs(false);
        t3Var.setAllowTapAboveContent(false);
        addView(t3Var, mf.e(-1, -1, hs.E1));
        addView(t3Var.getOverlayView(), mf.e(-1, -1, hs.E1));
        t3Var.C4();
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.j();
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
        addView(y3Var, mf.e(-1, -1, hs.E1));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void O(p pVar) {
        int i3 = 0;
        if (!(pVar.r.n3() || pVar.y)) {
            bi biVar = pVar.b;
            if (!biVar.J1 && biVar.N2) {
                i3 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (pVar.L != i3) {
            pVar.L = i3;
            pVar.W();
        }
    }

    public static void P(p pVar) {
        t3 t3Var = pVar.r;
        if (pVar.y) {
            h1 S2 = t3Var.S2();
            if (S2 != null) {
                S2.N();
                org.telegram.messenger.g0.K3(S2);
            }
            pVar.V(true);
            return;
        }
        bi biVar = pVar.b;
        if (pVar.x == null) {
            ey eyVar = new ey(biVar.X1, true, false, false, pVar.getContext(), true, null, biVar.m3, true, pVar.a, false, false);
            pVar.x = eyVar;
            eyVar.setVisibility(8);
            ey eyVar2 = pVar.x;
            eyVar2.y2 = false;
            eyVar2.setBottomInset(org.telegram.messenger.g0.n);
            View view = pVar.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.x.setDelegate(new o(pVar));
            pVar.addView(pVar.x, mf.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.x.setLayoutParams(layoutParams);
        pVar.x.setTranslationY(0.0f);
        pVar.x.setVisibility(0);
        pVar.y = true;
        pVar.F = emojiPanelHeight;
        h1 S22 = t3Var.S2();
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

    public static h1 Q(p pVar) {
        t3 t3Var = pVar.r;
        h1 focusedEditTextOrNull = t3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            h1 h1Var = pVar.G;
            return h1Var != null ? h1Var : t3Var.S2();
        }
        pVar.G = focusedEditTextOrNull;
        pVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int R(p pVar, h1 h1Var) {
        return (h1Var != pVar.G || pVar.r.getFocusedEditTextOrNull() == h1Var) ? Math.max(0, h1Var.getSelectionEnd()) : Math.min(pVar.H, h1Var.length());
    }

    public static void S(p pVar, int i3, int i10) {
        bi biVar = pVar.b;
        if (biVar.X1 == null) {
            return;
        }
        bi biVar2 = new bi(pVar.getContext(), biVar.X1, false, false, true, pVar.a);
        biVar2.U3 = new m(pVar, biVar2);
        biVar2.b2.i0();
        biVar2.y1(1, true);
        biVar2.V0(i3);
        biVar2.r4 = new e(pVar, biVar2);
        biVar2.Q1 = new e(pVar, biVar2);
        biVar2.P1 = new n(pVar, biVar2);
        biVar2.e1();
        if (i10 != 0) {
            biVar2.o1(i10);
        }
        biVar2.A0(true);
        biVar2.show();
    }

    public static void Z(Context context, final String str, final u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i3 = k6.G6;
        ShapeDrawable d02 = k6.d0(L, k6.r1(0.05f, k6.w0(i3, e6Var)));
        n6 L2 = r6.L(0.05f, i3);
        imageView.setBackground(d02);
        r6.k(imageView, d02, L2, null, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, mf.t(-1, -2, 49, 12, 2, 12, 0));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        o7 o7Var = new o7(strArr, horizontalScrollView, h, zArr2, new gi.q4(strArr, 26), imageView, e6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, bd.M0(2131754008, null), true, false, -1, e6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        int L3 = org.telegram.messenger.g0.L(24.0f);
        int i10 = k6.d6;
        ShapeDrawable d03 = k6.d0(L3, k6.w0(i10, e6Var));
        n6 N = r6.N(i10);
        k3Var.setBackground(d03);
        r6.k(k3Var, d03, N, null, e6Var);
        k3Var.setText(strArr[0]);
        i3Var.addTextChangedListener(new ai.a0(strArr, o7Var, false, 9));
        f10.addView(k3Var, mf.t(-1, -2, 55, 12, 8, 12, 0));
        h.setText(bd.M0(2131751355, null));
        f10.addView(h, mf.t(-1, 48, 55, 12, 12, 12, 12));
        o7Var.run();
        l10.O = f10;
        l10.I0 = new DialogInterface.OnDismissListener() { // from class: mi.k
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
                u10Var.a(strArr2[0]);
            }
        };
        l10.show();
        int i11 = k6.a7;
        l10.w0(i11);
        l10.P(i11);
        h.setOnClickListener(new ei.f0(h, zArr, u10Var, strArr, l10, 4));
        org.telegram.messenger.g0.i3(new lg.n(k3Var, 10), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q = this.b.m3.Q();
        if (Q <= 0) {
            SharedPreferences d12 = hp.d1();
            Point point = org.telegram.messenger.g0.q;
            Q = d12.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", org.telegram.messenger.g0.L(200.0f));
        }
        if (Q <= 0) {
            Q = org.telegram.messenger.g0.L(200.0f);
        }
        return Q + org.telegram.messenger.g0.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int L;
        int i11;
        f60 f60Var;
        boolean z10 = this.M;
        bi biVar = this.b;
        boolean z11 = biVar.m3.Q() > org.telegram.messenger.g0.L(20.0f);
        this.M = z11;
        if (!z11 && z10 && (f60Var = this.I) != null) {
            f60Var.u();
            this.I = null;
        }
        if (this.M || this.F > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(52.0f);
            biVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    biVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(52.0f);
            if (L < 0) {
            }
            biVar.r0 = true;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + L;
        t3 t3Var = this.r;
        int C = org.telegram.messenger.k5.C(110.0f, (this.M || this.F > 0) ? 0 : org.telegram.messenger.g0.n, (t3Var.n3() || this.y || !biVar.N2) ? 0 : org.telegram.messenger.g0.L(62.0f)) + this.F;
        if (t3Var.getPaddingTop() != currentActionBarHeight || t3Var.getPaddingBottom() != C) {
            this.O = true;
            t3Var.q1(0, currentActionBarHeight, 0, C);
            this.O = false;
        }
        f0();
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        this.b.S2.setTitle("");
        this.r.g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.th
    public final boolean L(boolean z10, int i3, int i10, long j10, boolean z11) {
        zi ziVar;
        mm mmVar;
        zv zvVar;
        long j11;
        zi ziVar2;
        mj mjVar;
        uf ufVar;
        mj mjVar2;
        int i11 = this.n;
        boolean s42 = hp.s1(i11).s4();
        t3 t3Var = this.r;
        if (!s42 && !h10.i(i11).q() && b5.d(t3Var.t3, t3Var.u3)) {
            c2.u0(getContext(), new b(t3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (t3Var.n3() && !t3Var.p3()) {
            if (t3Var.P3()) {
                boolean s43 = hp.s1(i11).s4();
                bi biVar = this.b;
                if (s43) {
                    ArrayList c32 = t3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = t3Var.E2();
                        ArrayList B2 = t3Var.B2();
                        ArrayList a10 = a5.a(i11, c32);
                        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                        if (d2Var instanceof wm) {
                            wm wmVar = (wm) d2Var;
                            zi ziVar3 = wmVar.E5;
                            zi ziVar4 = wmVar.m4;
                            mm mmVar2 = wmVar.C5;
                            long h92 = wmVar.h9();
                            zvVar = wmVar.W8();
                            ziVar = ziVar4;
                            mmVar = mmVar2;
                            j11 = h92;
                            ziVar2 = ziVar3;
                        } else {
                            ziVar = null;
                            mmVar = null;
                            zvVar = null;
                            j11 = 0;
                            ziVar2 = null;
                        }
                        yy.R(org.telegram.messenger.c.a(biVar.E3), c32, E2, B2, a10, biVar.b1(), ziVar2, ziVar, mmVar, z10, i3, i10, zvVar, j10, j11, 0L);
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                        if ((d2Var2 instanceof wm) && (mjVar = ((wm) d2Var2).a0) != null && (ufVar = mjVar.a3) != null) {
                            ufVar.G(null, z10, i3, i10, 0L);
                        }
                        biVar.a(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.d2 d2Var3 = biVar.X1;
                    if ((d2Var3 instanceof wm) && (mjVar2 = ((wm) d2Var3).a0) != null) {
                        mjVar2.Q0(b5.g(t3Var.t3), z10, i3, i10);
                        biVar.a(true);
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

    @Override // org.telegram.ui.Components.th
    public final boolean M() {
        return !this.r.n3();
    }

    public final void T(f60 f60Var, a aVar, TL_iv.PageBlock pageBlock, int i3, String str, int i10, f60 f60Var2) {
        f60Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i3, null, str, new ai.z3(this, aVar, pageBlock, f60Var2, 25));
        f60Var.y().a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        f60Var.y().a.setTextSize(1, i10);
    }

    public final boolean U() {
        final int i3 = 1;
        t3 t3Var = this.r;
        if (t3Var == null || !t3Var.n3()) {
            return true;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = bd.M0(2131753993, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131753994, null);
        alertDialog$Builder.h(bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) { // from class: mi.j
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
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
        alertDialog$Builder.k(bd.M0(2131745956, null), new org.telegram.ui.ActionBar.p1(this) { // from class: mi.j
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                switch (i3) {
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

    public final void V(boolean z10) {
        if (this.E) {
            this.E = false;
            ey eyVar = this.x;
            if (eyVar != null) {
                eyVar.t(false);
                if (!z10) {
                    this.x.A();
                }
            }
        }
        this.G = null;
        ey eyVar2 = this.x;
        if (eyVar2 != null) {
            eyVar2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
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
        int L = this.E ? org.telegram.messenger.g0.L(245.0f) : this.F;
        ey eyVar = this.x;
        bi biVar = this.b;
        if (eyVar != null) {
            if (this.y) {
                f11 = (this.F - L) + (this.E ? -biVar.g4 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            eyVar.setTranslationY(f11);
        }
        y3 y3Var = this.s;
        if (y3Var != null) {
            boolean z10 = this.y;
            if (z10) {
                f10 = L;
            } else {
                f10 = (this.M || this.F > 0) ? 0 : org.telegram.messenger.g0.n;
            }
            if (!z10 || this.E) {
                f10 += biVar.g4;
            }
            y3Var.getBottomContainer().animate().cancel();
            y3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.y;
            float f12 = z11 ? L : 0.0f;
            if (!z11 || this.E) {
                f12 += biVar.g4;
            }
            y3Var.setBottomGradientTranslationY(-f12);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = y3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-r1).setDuration(320L).setInterpolator(xq.h).start();
            }
        }
    }

    public final boolean X() {
        org.telegram.ui.ActionBar.d2 d2Var = this.b.X1;
        if (!(d2Var instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) d2Var;
        t3 t3Var = this.r;
        if (!t3Var.u2()) {
            return false;
        }
        TL_iv.RichMessage m22 = t3Var.m2();
        li.b0(org.telegram.messenger.c.a(this.n).a).Q1(wmVar.a(), wmVar.P7(wmVar.E5), "", null, null, null, null, 0L, false, false, m22);
        mj mjVar = wmVar.a0;
        if (mjVar == null) {
            return true;
        }
        mjVar.setRichDraftPreview(m22);
        return true;
    }

    public final void a0(boolean z10) {
        int i3 = 0;
        boolean z11 = this.r.n3() || this.y;
        bi biVar = this.b;
        ah ahVar = biVar.s3;
        if (biVar.s4 != z11) {
            biVar.s4 = z11;
            if (biVar.N2) {
                ahVar.animate().cancel();
                if (!z11) {
                    ahVar.setVisibility(0);
                }
                if (z10) {
                    ahVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? org.telegram.messenger.g0.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new wg(biVar, z11, 3)).start();
                } else {
                    ahVar.setAlpha(z11 ? 0.0f : 1.0f);
                    ahVar.setTranslationY(z11 ? org.telegram.messenger.g0.L(48.0f) : 0.0f);
                    ahVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !biVar.J1 && biVar.N2) {
            i3 = org.telegram.messenger.g0.L(62.0f);
        }
        this.L = i3;
        W();
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
        int i3;
        boolean z10;
        boolean z11;
        int i10;
        t3 t3Var = this.r;
        h9 textSelectionHelper = t3Var.getTextSelectionHelper();
        y3 y3Var = this.s;
        if (y3Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] E4 = t3Var.E4();
        y3Var.setQuoteState(E4 != null && t3Var.K3(E4[0], E4[1]));
        boolean O3 = t3Var.O3();
        int[] iArr = R;
        if (O3) {
            h9 textSelectionHelper2 = t3Var.getTextSelectionHelper();
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
            h1 Q4 = z12 ? t3Var.Q4(i11, i12) : null;
            int max = Math.max(0, Math.min(i14, i15));
            int max2 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i14, i15), Q4.length()));
            this.s.c(i16, Q4 != null && max < max2 && d6.h(Q4.getText(), max, max2), Q4 != null && max < max2 && d6.g(Q4.getText(), max, max2), z12, t3Var.o2(), true);
            return;
        }
        if (t3Var.z3()) {
            h9 textSelectionHelper3 = t3Var.getTextSelectionHelper();
            h1 v22 = t3Var.v2(textSelectionHelper3.p0);
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
            this.s.c(i10, v22 != null && max3 < max4 && d6.h(v22.getText(), max3, max4), v22 != null && max3 < max4 && d6.g(v22.getText(), max3, max4), true, t3Var.o2(), true);
            return;
        }
        int i24 = textSelectionHelper.p0;
        int i25 = textSelectionHelper.s0;
        int i26 = textSelectionHelper.r0;
        int i27 = textSelectionHelper.u0;
        boolean z13 = i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < t3Var.x4.size();
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
            i3 = i29;
        } else {
            i3 = 0;
        }
        int i32 = i27;
        if (z13) {
            Editable K4 = t3Var.K4(i24, i26, i25, i32);
            if (K4 == null ? false : d6.h(K4, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                z10 = true;
                if (z13) {
                    Editable K42 = t3Var.K4(i24, i26, i25, i32);
                    if (K42 == null ? false : d6.g(K42, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                        z11 = true;
                        this.s.c(i3, z10, z11, !z13 && i24 == i25, t3Var.o2(), !t3Var.L3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i3, z10, z11, !z13 && i24 == i25, t3Var.o2(), !t3Var.L3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i3, z10, z11, !z13 && i24 == i25, t3Var.o2(), !t3Var.L3());
    }

    public final void c0() {
        y3 y3Var = this.s;
        if (y3Var != null) {
            t3 t3Var = this.r;
            boolean u22 = t3Var.u2();
            g2 g2Var = t3Var.R3;
            boolean z10 = (g2Var == null || g2Var.c.isEmpty()) ? false : true;
            ImageView imageView = y3Var.r;
            ImageView imageView2 = y3Var.n;
            imageView2.setEnabled(u22);
            imageView2.setAlpha(u22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void d0() {
        y3 y3Var = this.s;
        if (y3Var != null) {
            int i3 = this.n;
            boolean z10 = false;
            boolean z11 = (hp.s1(i3).s4() || h10.i(i3).q()) ? false : true;
            bg sendButton = y3Var.getSendButton();
            if (z11) {
                t3 t3Var = this.r;
                if (b5.d(t3Var.t3, t3Var.u3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            y3Var.setPremiumLocked(z11);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f5) {
            d0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        t3 t3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.X1 instanceof wm) && t3Var.u2() && X()) {
                org.telegram.messenger.k5.o(null, 2131746013, new fc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!t3Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ey eyVar;
        t3 t3Var = this.r;
        h3 h3Var = t3Var.v3;
        t9 t9Var = t3Var.w3;
        if (h3Var.x() && t9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.E || (eyVar = this.x) == null) ? getHeight() - this.F : (int) eyVar.getY()) - org.telegram.messenger.g0.L(60.0f)) - this.L;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            V(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < height)) && t9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !t3Var.l3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.th
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
        h9 textSelectionHelper = t3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            T2 = t3Var.T2();
        } else {
            int i3 = textSelectionHelper.p0;
            T2 = i3 == textSelectionHelper.s0 ? t3Var.B4(i3) : null;
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
            int i3 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < t3Var.getChildCount(); i10++) {
                View childAt = t3Var.getChildAt(i10);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i3) {
                    i3 = childAt.getTop();
                }
            }
            paddingTop = i3 == Integer.MAX_VALUE ? t3Var.getPaddingTop() : i3;
        }
        y3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        t3 t3Var = this.r;
        if (t3Var.getChildCount() <= 0) {
            int paddingTop = t3Var.getPaddingTop();
            this.J = paddingTop;
            t3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z10 = false;
        int i3 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < t3Var.getChildCount(); i10++) {
            View childAt = t3Var.getChildAt(i10);
            int R2 = RecyclerView.R(childAt);
            if (R2 == 0) {
                z10 = true;
            }
            if (R2 >= 0 && childAt.getTop() < i3) {
                i3 = childAt.getTop();
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        t3Var.setTopGlowOffset(Math.max(0, i3));
        int i11 = i3 - org.telegram.messenger.g0.m;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (i11 < org.telegram.messenger.g0.L(7.0f) || !z10) {
            i11 = L;
        }
        this.J = i11;
        return i11;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public h9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.th
    public final int j() {
        return 0;
    }

    @Override // org.telegram.ui.Components.th
    public final boolean k() {
        boolean z10 = this.E;
        if (z10) {
            if (z10) {
                this.E = false;
                ey eyVar = this.x;
                if (eyVar != null) {
                    eyVar.t(false);
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

    @Override // org.telegram.ui.Components.th
    public final void m(float f10) {
        W();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.n).c(this, hs.f5);
        d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.n).n(this, hs.f5);
    }

    @Override // org.telegram.ui.Components.th
    public final void p() {
        vf0 vf0Var = this.P;
        if (vf0Var != null) {
            vf0Var.h();
            this.P = null;
        }
        fa.f fVar = this.w;
        if (fVar != null) {
            fVar.c();
        }
        t3 t3Var = this.r;
        if (t3Var != null) {
            t3Var.y2();
        }
        ey eyVar = this.x;
        if (eyVar != null) {
            eyVar.B();
        }
    }

    @Override // org.telegram.ui.Components.th
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
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.th
    public final boolean s() {
        return U();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.th
    public final void u() {
        fa.f fVar = this.w;
        if (fVar != null) {
            fVar.c();
        }
        if (this.y) {
            V(false);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void y() {
        this.M = this.b.m3.Q() > org.telegram.messenger.g0.L(20.0f);
        W();
        f0();
    }

    @Override // org.telegram.ui.Components.th
    public final void z(int i3, boolean z10) {
        this.M = z10;
        W();
        if (z10 && this.y && !this.E) {
            V(false);
        }
        f0();
    }

    @Override // org.telegram.ui.Components.th
    public final void t() {
    }
}
