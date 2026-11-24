// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class e72 extends p02 implements gk7 {
    public static final int[] R = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean E;
    public int F;
    public mc9 G;
    public int H;
    public cs5 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public j47 P;
    public final t62 Q;
    public final int n;
    public final ye9 r;
    public final df9 s;
    public eq2 w;
    public t14 x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public e72(int i, x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        a72 a72Var = new a72(this);
        this.K = true;
        this.Q = new t62(this, (byte) 3);
        this.n = i;
        this.h = true;
        this.f = true;
        Object[] objArr = 0;
        ye9 ye9Var = new ye9(context, i, wjbVar, new tg2(this, wjbVar, false, (byte) 15));
        this.r = ye9Var;
        ye9Var.setAdaptiveLinkDialogs(false);
        ye9Var.setAllowTapAboveContent(false);
        addView(ye9Var, nme.e(-1, -1, kk7.D1));
        addView(ye9Var.getOverlayView(), nme.e(-1, -1, kk7.D1));
        ye9Var.B4();
        ld9 ld9Var = ye9Var.R3;
        if (ld9Var != null) {
            ld9Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        df9 df9Var = new df9(context, a72Var);
        this.s = df9Var;
        df9Var.setBackVisible(false);
        df9Var.setTopGradientVisible(false);
        d0();
        addView(df9Var, nme.e(-1, -1, kk7.D1));
        c0();
        e0();
        Z(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new x62(this, objArr == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(Context context, final String str, final p8c p8cVar, wjb wjbVar) {
        fx0 h = de9.h(1, wjbVar, context, true);
        LinearLayout j = de9.j(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        int L = gl.L(8.0f);
        int i = bkb.F6;
        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.05f, bkb.v0(i, wjbVar)));
        vkb K = zkb.K(0.05f, i);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, K, null, wjbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        j.addView(horizontalScrollView, nme.t(-1, -2, 49, 12, 2, 12, 0));
        u41 i2 = yjb.i(24, wjbVar, context, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        ln0 ln0Var = new ln0((Object) strArr, (Object) horizontalScrollView, (Object) i2, (Object) zArr2, (Object) new f(strArr, (byte) 29), (Object) imageView, (Object) wjbVar, (Object) new int[]{6}, (byte) 2);
        final it3 it3Var = new it3(context, k96.M0(2131754005, null), true, false, -1, wjbVar);
        ht3 ht3Var = it3Var.d;
        ht3Var.setImeOptions(6);
        ht3Var.setMaxLines(5);
        int L2 = gl.L(24.0f);
        int i3 = bkb.c6;
        ShapeDrawable b02 = bkb.b0(L2, bkb.v0(i3, wjbVar));
        vkb M = zkb.M(i3);
        it3Var.setBackground(b02);
        zkb.j(it3Var, b02, M, null, wjbVar);
        it3Var.setText(strArr[0]);
        ht3Var.addTextChangedListener(new qy(strArr, ln0Var, false, (byte) 3));
        j.addView(it3Var, nme.t(-1, -2, 55, 12, 8, 12, 0));
        i2.setText(k96.M0(2131751342, null));
        j.addView(i2, nme.t(-1, 48, 55, 12, 12, 12, 12));
        ln0Var.run();
        h.O = j;
        h.I0 = new DialogInterface.OnDismissListener() { // from class: z62
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ht3 ht3Var2 = it3.this.d;
                ht3Var2.clearFocus();
                gl.t1(ht3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                p8cVar.a(strArr2[0]);
            }
        };
        h.show();
        int i4 = bkb.Z6;
        h.t0(i4);
        h.M(i4);
        i2.setOnClickListener(new ng(i2, zArr, p8cVar, strArr, h, (byte) 6));
        gl.e3(new r62(it3Var, 0 == true ? 1 : 0), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q = this.b.o3.Q();
        if (Q <= 0) {
            SharedPreferences b1 = na7.b1();
            Point point = gl.q;
            Q = b1.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", gl.L(200.0f));
        }
        if (Q <= 0) {
            Q = gl.L(200.0f);
        }
        return Q + gl.n;
    }

    @Override // p02
    public final void A(int i, boolean z) {
        this.M = z;
        S();
        if (z && this.y && !this.E) {
            R(false);
        }
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int L;
        int i3;
        cs5 cs5Var;
        boolean z = this.M;
        x02 x02Var = this.b;
        boolean z2 = x02Var.o3.Q() > gl.L(20.0f);
        this.M = z2;
        if (!z2 && z && (cs5Var = this.I) != null) {
            cs5Var.u();
            this.I = null;
        }
        if (this.M || this.F > gl.L(20.0f)) {
            L = gl.L(52.0f);
            x02Var.r0 = false;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    L = i3 - gl.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    x02Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            L = i3 - gl.L(52.0f);
            if (L < 0) {
            }
            x02Var.r0 = true;
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight() + gl.m + L;
        ye9 ye9Var = this.r;
        int w = de9.w(110.0f, (this.M || this.F > 0) ? 0 : gl.n, (ye9Var.g3() || this.y || !x02Var.P2) ? 0 : gl.L(62.0f)) + this.F;
        if (ye9Var.getPaddingTop() != currentActionBarHeight || ye9Var.getPaddingBottom() != w) {
            this.O = true;
            ye9Var.q1(0, currentActionBarHeight, 0, w);
            this.O = false;
        }
        f0();
    }

    @Override // p02
    public final void I(p02 p02Var) {
        this.b.U2.setTitle("");
        this.r.g3.O(false);
        Z(false);
        post(new t62(this, (byte) 4));
    }

    @Override // p02
    public final void K() {
        this.r.z0(0);
    }

    @Override // p02
    public final boolean M(boolean z, int i, int i2, long j, boolean z2) {
        k27 k27Var;
        bu1 bu1Var;
        j1a j1aVar;
        long j2;
        k27 k27Var2;
        ar1 ar1Var;
        hy1 hy1Var;
        ar1 ar1Var2;
        int i3 = this.n;
        boolean u4 = na7.q1(i3).u4();
        byte b = 0;
        ye9 ye9Var = this.r;
        if (!u4 && !y6c.h(i3).p() && dg9.d(ye9Var.t3, ye9Var.u3)) {
            hd9.q0(this.a, getContext(), new q62(ye9Var, b), new t62(this, (byte) 2));
            return false;
        }
        if (ye9Var.g3() && !ye9Var.i3()) {
            if (ye9Var.I3()) {
                boolean u42 = na7.q1(i3).u4();
                x02 x02Var = this.b;
                if (u42) {
                    ArrayList V2 = ye9Var.V2();
                    if (!V2.isEmpty()) {
                        ArrayList x2 = ye9Var.x2();
                        ArrayList u2 = ye9Var.u2();
                        ArrayList a = cg9.a(i3, V2);
                        d dVar = x02Var.Z1;
                        if (dVar instanceof mu1) {
                            mu1 mu1Var = (mu1) dVar;
                            k27 k27Var3 = mu1Var.F5;
                            k27 k27Var4 = mu1Var.m4;
                            bu1 bu1Var2 = mu1Var.D5;
                            long a7 = mu1Var.a7();
                            j1aVar = mu1Var.O6();
                            k27Var = k27Var4;
                            bu1Var = bu1Var2;
                            j2 = a7;
                            k27Var2 = k27Var3;
                        } else {
                            k27Var = null;
                            bu1Var = null;
                            j1aVar = null;
                            j2 = 0;
                            k27Var2 = null;
                        }
                        z3a.Q(j5.a(x02Var.G3), V2, x2, u2, a, x02Var.V0(), k27Var2, k27Var, bu1Var, z, i, i2, j1aVar, j, j2, 0L);
                        d dVar2 = x02Var.Z1;
                        if ((dVar2 instanceof mu1) && (ar1Var = ((mu1) dVar2).a0) != null && (hy1Var = ar1Var.P3) != null) {
                            hy1Var.u(null, z, i, i2, 0L);
                        }
                        x02Var.a(true);
                        return true;
                    }
                } else {
                    d dVar3 = x02Var.Z1;
                    if ((dVar3 instanceof mu1) && (ar1Var2 = ((mu1) dVar3).a0) != null) {
                        ar1Var2.t1(dg9.g(ye9Var.t3), z, i, i2);
                        x02Var.a(true);
                        return true;
                    }
                }
            } else {
                df9 df9Var = this.s;
                if (df9Var != null) {
                    df9Var.setSendEnabled(ye9Var.I3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // p02
    public final boolean N() {
        return !this.r.g3();
    }

    public final void P(cs5 cs5Var, lk0 lk0Var, TL_iv.PageBlock pageBlock, int i, String str, int i2, cs5 cs5Var2) {
        cs5Var.i(lk0Var != null && lk0Var.b.getClass() == pageBlock.getClass(), i, null, str, new hn1(this, lk0Var, pageBlock, cs5Var2, (byte) 7));
        cs5Var.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        cs5Var.z().a.setTextSize(1, i2);
    }

    public final boolean Q() {
        final byte b = 1;
        ye9 ye9Var = this.r;
        if (ye9Var == null || !ye9Var.g3()) {
            return true;
        }
        final byte b2 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = k96.M0(2131753990, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131753991, null);
        alertDialog$Builder.g(k96.M0(2131751586, null), new ed(this) { // from class: y62
            public final /* synthetic */ e72 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i) {
                byte b3 = b2;
                e72 e72Var = this.b;
                switch (b3) {
                    case 0:
                        e72Var.b.dismiss();
                        break;
                    default:
                        e72Var.U();
                        e72Var.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.j(k96.M0(2131745754, null), new ed(this) { // from class: y62
            public final /* synthetic */ e72 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i) {
                byte b3 = b;
                e72 e72Var = this.b;
                switch (b3) {
                    case 0:
                        e72Var.b.dismiss();
                        break;
                    default:
                        e72Var.U();
                        e72Var.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.c(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void R(boolean z) {
        if (this.E) {
            this.E = false;
            t14 t14Var = this.x;
            if (t14Var != null) {
                t14Var.s(false);
                if (!z) {
                    this.x.z();
                }
            }
        }
        this.G = null;
        t14 t14Var2 = this.x;
        if (t14Var2 != null) {
            t14Var2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        df9 df9Var = this.s;
        if (df9Var != null) {
            df9Var.setEmojiOpened(false);
        }
        Z(false);
        requestLayout();
    }

    public final void S() {
        float f;
        float f2;
        int L = this.E ? gl.L(245.0f) : this.F;
        t14 t14Var = this.x;
        x02 x02Var = this.b;
        if (t14Var != null) {
            if (this.y) {
                f2 = (this.F - L) + (this.E ? -x02Var.i4 : 0.0f);
            } else {
                f2 = 0.0f;
            }
            t14Var.setTranslationY(f2);
        }
        df9 df9Var = this.s;
        if (df9Var != null) {
            boolean z = this.y;
            if (z) {
                f = L;
            } else {
                f = (this.M || this.F > 0) ? 0 : gl.n;
            }
            if (!z || this.E) {
                f += x02Var.i4;
            }
            df9Var.getBottomContainer().animate().cancel();
            df9Var.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.y;
            float f3 = z2 ? L : 0.0f;
            if (!z2 || this.E) {
                f3 += x02Var.i4;
            }
            df9Var.setBottomGradientTranslationY(-f3);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = df9Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-r1).setDuration(320L).setInterpolator(s33.h).start();
            }
        }
    }

    public final void T(int i, int i2) {
        x02 x02Var = this.b;
        if (x02Var.Z1 == null) {
            return;
        }
        x02 x02Var2 = new x02(getContext(), x02Var.Z1, false, false, true, this.a);
        x02Var2.W3 = new b72(this, x02Var2);
        x02Var2.d2.h0();
        x02Var2.t1(1, true);
        x02Var2.P0(i);
        x02Var2.t4 = new u62(this, x02Var2);
        x02Var2.S1 = new u62(this, x02Var2);
        x02Var2.R1 = new c72(this, x02Var2);
        x02Var2.Z0();
        if (i2 != 0) {
            x02Var2.j1(i2);
        }
        x02Var2.v0(true);
        x02Var2.show();
    }

    public final boolean U() {
        d dVar = this.b.Z1;
        if (!(dVar instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) dVar;
        ye9 ye9Var = this.r;
        if (!ye9Var.m2()) {
            return false;
        }
        TL_iv.RichMessage e2 = ye9Var.e2();
        hq6.d0(j5.a(this.n).a).T1(mu1Var.a(), mu1Var.G5(mu1Var.F5), "", null, null, null, null, 0L, false, false, e2);
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var == null) {
            return true;
        }
        ar1Var.setRichDraftPreview(e2);
        return true;
    }

    public final mc9 V() {
        ye9 ye9Var = this.r;
        mc9 focusedEditTextOrNull = ye9Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            mc9 mc9Var = this.G;
            return mc9Var != null ? mc9Var : ye9Var.L2();
        }
        this.G = focusedEditTextOrNull;
        this.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public final int W(mc9 mc9Var) {
        return (mc9Var != this.G || this.r.getFocusedEditTextOrNull() == mc9Var) ? Math.max(0, mc9Var.getSelectionEnd()) : Math.min(this.H, mc9Var.length());
    }

    public final void Y() {
        boolean z = this.y;
        ye9 ye9Var = this.r;
        if (z) {
            mc9 L2 = ye9Var.L2();
            if (L2 != null) {
                L2.O();
                gl.F3(L2);
            }
            R(true);
            return;
        }
        if (this.x == null) {
            x02 x02Var = this.b;
            t14 t14Var = new t14(x02Var.Z1, true, false, false, getContext(), true, null, x02Var.o3, true, this.a, false, false);
            this.x = t14Var;
            t14Var.setVisibility(8);
            t14 t14Var2 = this.x;
            t14Var2.x2 = false;
            t14Var2.setBottomInset(gl.n);
            View view = this.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            this.x.setDelegate(new d72(this));
            addView(this.x, nme.e(-1, getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.x.setLayoutParams(layoutParams);
        this.x.setTranslationY(0.0f);
        this.x.setVisibility(0);
        this.y = true;
        this.F = emojiPanelHeight;
        mc9 L22 = ye9Var.L2();
        if (L22 != null) {
            gl.t1(L22);
        }
        df9 df9Var = this.s;
        if (df9Var != null) {
            df9Var.setEmojiOpened(true);
        }
        Z(false);
        requestLayout();
    }

    public final void Z(boolean z) {
        int i = 0;
        boolean z2 = this.r.g3() || this.y;
        x02 x02Var = this.b;
        wz1 wz1Var = x02Var.u3;
        if (x02Var.u4 != z2) {
            x02Var.u4 = z2;
            if (x02Var.P2) {
                wz1Var.animate().cancel();
                if (!z2) {
                    wz1Var.setVisibility(0);
                }
                if (z) {
                    wz1Var.animate().alpha(z2 ? 0.0f : 1.0f).translationY(z2 ? gl.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new qz1(x02Var, z2, (byte) 3)).start();
                } else {
                    wz1Var.setAlpha(z2 ? 0.0f : 1.0f);
                    wz1Var.setTranslationY(z2 ? gl.L(48.0f) : 0.0f);
                    wz1Var.setVisibility(z2 ? 4 : 0);
                }
            }
        }
        if (!z2 && !x02Var.L1 && x02Var.P2) {
            i = gl.L(62.0f);
        }
        this.L = i;
        S();
        if (this.K == z2) {
            this.K = !z2;
            requestLayout();
        }
    }

    public final void a0() {
        int i = 0;
        if (!(this.r.g3() || this.y)) {
            x02 x02Var = this.b;
            if (!x02Var.L1 && x02Var.P2) {
                i = gl.L(62.0f);
            }
        }
        if (this.L != i) {
            this.L = i;
            S();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        int i;
        boolean z;
        boolean z2;
        int max;
        int max2;
        int i2;
        ye9 ye9Var = this.r;
        fib textSelectionHelper = ye9Var.getTextSelectionHelper();
        df9 df9Var = this.s;
        if (df9Var == null || textSelectionHelper == null || !textSelectionHelper.w()) {
            return;
        }
        int[] D4 = ye9Var.D4();
        df9Var.setQuoteState(D4 != null && ye9Var.D3(D4[0], D4[1]));
        boolean H3 = ye9Var.H3();
        int[] iArr = R;
        if (H3) {
            fib textSelectionHelper2 = ye9Var.getTextSelectionHelper();
            int i3 = textSelectionHelper2.p0;
            int i4 = textSelectionHelper2.q0;
            int i5 = textSelectionHelper2.t0;
            int i6 = textSelectionHelper2.r0;
            int i7 = textSelectionHelper2.u0;
            int i8 = 0;
            for (int i9 = 0; i9 < 8; i9++) {
                int i10 = iArr[i9];
                if (this.r.G3(i10, i3, i4, i6, i5, i7)) {
                    i8 |= i10;
                }
            }
            boolean z3 = i4 == i5;
            mc9 Q4 = z3 ? ye9Var.Q4(i3, i4) : null;
            int max3 = Math.max(0, Math.min(i6, i7));
            int max4 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i6, i7), Q4.length()));
            this.s.c(i8, Q4 != null && max3 < max4 && yi9.h(Q4.getText(), max3, max4), Q4 != null && max3 < max4 && yi9.g(Q4.getText(), max3, max4), z3, ye9Var.g2(), true);
            return;
        }
        if (ye9Var.s3()) {
            fib textSelectionHelper3 = ye9Var.getTextSelectionHelper();
            mc9 o2 = ye9Var.o2(textSelectionHelper3.p0);
            int i11 = textSelectionHelper3.r0;
            int i12 = textSelectionHelper3.u0;
            if (o2 == null) {
                max2 = 0;
                max = 0;
            } else {
                max = Math.max(0, Math.min(Math.min(i11, i12), o2.length()));
                max2 = Math.max(0, Math.min(Math.max(i11, i12), o2.length()));
            }
            if (o2 == null || max >= max2) {
                i2 = 0;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    int i15 = iArr[i14];
                    if ((o2.c(max, max2) & i15) != 0) {
                        i13 |= i15;
                    }
                }
                i2 = i13;
            }
            this.s.c(i2, o2 != null && max < max2 && yi9.h(o2.getText(), max, max2), o2 != null && max < max2 && yi9.g(o2.getText(), max, max2), true, ye9Var.g2(), true);
            return;
        }
        int i16 = textSelectionHelper.p0;
        int i17 = textSelectionHelper.s0;
        int i18 = textSelectionHelper.r0;
        int i19 = textSelectionHelper.u0;
        boolean z4 = i16 >= 0 && i17 >= 0 && i17 >= i16 && i17 < ye9Var.x4.size();
        if (z4) {
            int i20 = 0;
            int i21 = 0;
            while (i20 < 8) {
                int i22 = iArr[i20];
                int i23 = i19;
                if (this.r.F3(i22, i16, i18, i17, i23)) {
                    i21 |= i22;
                }
                i20++;
                i19 = i23;
            }
            i = i21;
        } else {
            i = 0;
        }
        int i24 = i19;
        if (z4) {
            Editable J4 = ye9Var.J4(i16, i18, i17, i24);
            if (J4 == null ? false : yi9.h(J4, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                z = true;
                if (z4) {
                    Editable J42 = ye9Var.J4(i16, i18, i17, i24);
                    if (J42 == null ? false : yi9.g(J42, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                        z2 = true;
                        this.s.c(i, z, z2, !z4 && i16 == i17, ye9Var.g2(), !ye9Var.E3());
                    }
                }
                z2 = false;
                if (z4) {
                }
                this.s.c(i, z, z2, !z4 && i16 == i17, ye9Var.g2(), !ye9Var.E3());
            }
        }
        z = false;
        if (z4) {
        }
        z2 = false;
        if (z4) {
        }
        this.s.c(i, z, z2, !z4 && i16 == i17, ye9Var.g2(), !ye9Var.E3());
    }

    public final void c0() {
        df9 df9Var = this.s;
        if (df9Var != null) {
            ye9 ye9Var = this.r;
            boolean m2 = ye9Var.m2();
            ld9 ld9Var = ye9Var.R3;
            boolean z = (ld9Var == null || ld9Var.c.isEmpty()) ? false : true;
            ImageView imageView = df9Var.r;
            ImageView imageView2 = df9Var.n;
            imageView2.setEnabled(m2);
            imageView2.setAlpha(m2 ? 1.0f : 0.35f);
            imageView.setEnabled(z);
            imageView.setAlpha(z ? 1.0f : 0.35f);
        }
    }

    public final void d0() {
        df9 df9Var = this.s;
        if (df9Var != null) {
            int i = this.n;
            boolean z = false;
            boolean z2 = (na7.q1(i).u4() || y6c.h(i).p()) ? false : true;
            ky1 sendButton = df9Var.getSendButton();
            if (z2) {
                ye9 ye9Var = this.r;
                if (dg9.d(ye9Var.t3, ye9Var.u3)) {
                    z = true;
                }
            }
            sendButton.setLocked(z);
            df9Var.setPremiumLocked(z2);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.h5) {
            d0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        ye9 ye9Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.Z1 instanceof mu1) && ye9Var.m2() && U()) {
                ir2.v(null, 2131745810, new u21(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!ye9Var.d3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t14 t14Var;
        ye9 ye9Var = this.r;
        me9 me9Var = ye9Var.v3;
        qib qibVar = ye9Var.w3;
        if (me9Var.w() && qibVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.E || (t14Var = this.x) == null) ? getHeight() - this.F : (int) t14Var.getY()) - gl.L(60.0f)) - this.L;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            R(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > gl.L(60.0f) && motionEvent.getY() < height)) && qibVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !ye9Var.e3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // p02
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0() {
        lk0 M2;
        df9 df9Var = this.s;
        if (df9Var == null) {
            return;
        }
        ye9 ye9Var = this.r;
        fib textSelectionHelper = ye9Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.w()) {
            M2 = ye9Var.M2();
        } else {
            int i = textSelectionHelper.p0;
            M2 = i == textSelectionHelper.s0 ? ye9Var.A4(i) : null;
        }
        int i2 = 4;
        int i3 = 0;
        if (ye9Var.N2() == null) {
            if (M2 != null) {
                if (!M2.a() && !M2.b() && !M2.c()) {
                    TL_iv.PageBlock pageBlock = M2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i2 = 7;
                            } else {
                                if (!ye9.y3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = M2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i2 = 1;
                            }
                        }
                    }
                }
                i2 = 2;
            }
            i2 = 0;
        }
        if (M2 != null) {
            if (i2 == 1) {
                TL_iv.PageBlock pageBlock3 = M2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i3 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i3 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i3 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i3 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i3 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i3 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i3 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i3 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i3 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i3 = R.drawable.iv_footer;
                }
            } else if (i2 == 2) {
                if (M2.a()) {
                    i3 = R.drawable.iv_todo;
                } else if (M2.c()) {
                    i3 = R.drawable.iv_ordered_list;
                }
            }
        }
        df9Var.d(i2, i3);
    }

    public final void f0() {
        int paddingTop;
        df9 df9Var = this.s;
        if (df9Var == null) {
            return;
        }
        int currentActionBarHeight = (((a.getCurrentActionBarHeight() - gl.L(44.0f)) / 2) + gl.m) - gl.L(8.0f);
        ye9 ye9Var = this.r;
        if (ye9Var.getChildCount() <= 0) {
            paddingTop = ye9Var.getPaddingTop();
        } else {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < ye9Var.getChildCount(); i2++) {
                View childAt = ye9Var.getChildAt(i2);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i) {
                    i = childAt.getTop();
                }
            }
            paddingTop = i == Integer.MAX_VALUE ? ye9Var.getPaddingTop() : i;
        }
        df9Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // p02
    public int getCurrentItemTop() {
        ye9 ye9Var = this.r;
        if (ye9Var.getChildCount() <= 0) {
            int paddingTop = ye9Var.getPaddingTop();
            this.J = paddingTop;
            ye9Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z = false;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < ye9Var.getChildCount(); i2++) {
            View childAt = ye9Var.getChildAt(i2);
            int R2 = RecyclerView.R(childAt);
            if (R2 == 0) {
                z = true;
            }
            if (R2 >= 0 && childAt.getTop() < i) {
                i = childAt.getTop();
            }
        }
        if (i == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        ye9Var.setTopGlowOffset(Math.max(0, i));
        int i3 = i - gl.m;
        int L = gl.L(7.0f);
        if (i3 < gl.L(7.0f) || !z) {
            i3 = L;
        }
        this.J = i3;
        return i3;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - gl.m) - a.getCurrentActionBarHeight();
    }

    public fib getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // p02
    public final int j() {
        return 0;
    }

    @Override // p02
    public final boolean k() {
        boolean z = this.E;
        if (z) {
            if (z) {
                this.E = false;
                t14 t14Var = this.x;
                if (t14Var != null) {
                    t14Var.s(false);
                    this.x.z();
                }
                S();
                return false;
            }
        } else {
            if (this.y) {
                R(false);
                return false;
            }
            if (!this.r.B2() && !Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // p02
    public final void m(float f) {
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.n).b(this, kk7.h5);
        d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.n).n(this, kk7.h5);
    }

    @Override // p02
    public final void q() {
        j47 j47Var = this.P;
        if (j47Var != null) {
            j47Var.g();
            this.P = null;
        }
        eq2 eq2Var = this.w;
        if (eq2Var != null) {
            eq2Var.n();
        }
        ye9 ye9Var = this.r;
        if (ye9Var != null) {
            ye9Var.r2();
        }
        t14 t14Var = this.x;
        if (t14Var != null) {
            t14Var.A();
        }
    }

    @Override // p02
    public final boolean r() {
        ye9 ye9Var = this.r;
        if (ye9Var == null) {
            return false;
        }
        ye9Var.r2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // p02
    public final boolean t() {
        return Q();
    }

    @Override // p02
    public final void v() {
        eq2 eq2Var = this.w;
        if (eq2Var != null) {
            eq2Var.n();
        }
        if (this.y) {
            R(false);
        }
    }

    @Override // p02
    public final void z() {
        this.M = this.b.o3.Q() > gl.L(20.0f);
        S();
        f0();
    }

    @Override // p02
    public final void u() {
    }
}
