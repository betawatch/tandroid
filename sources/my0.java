// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class my0 extends Dialog implements ah0 {
    public static final /* synthetic */ int k1 = 0;
    public AnimatorSet A0;
    public byte B0;
    public ValueAnimator C0;
    public float D0;
    public boolean E;
    public boolean E0;
    public FrameLayout F;
    public float F0;
    public boolean G;
    public int G0;
    public o1 H;
    public int H0;
    public int I;
    public DialogInterface.OnDismissListener I0;
    public boolean J;
    public ylb J0;
    public final boolean K;
    public boolean K0;
    public DialogInterface.OnClickListener L;
    public boolean L0;
    public CharSequence[] M;
    public final po M0;
    public int[] N;
    public byte N0;
    public ViewGroup O;
    public boolean O0;
    public CharSequence P;
    public ValueAnimator P0;
    public boolean Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public int S;
    public boolean S0;
    public int T;
    public boolean T0;
    public int U;
    public byte U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public byte X;
    public final sy4 X0;
    public Integer Y;
    public bka Y0;
    public final hd Z;
    public eh0 Z0;
    public int a;
    public boolean a0;
    public cw6 a1;
    public ViewGroup b;
    public int b0;
    public int b1;
    public final dy0 c;
    public boolean c0;
    public int c1;
    public boolean d;
    public boolean d0;
    public int d1;
    public int e;
    public boolean e0;
    public PorterDuffColorFilter e1;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean g0;
    public int g1;
    public WindowInsets h;
    public int h0;
    public long h1;
    public boolean i0;
    public d i1;
    public final int j0;
    public dbc j1;
    public final short k0;
    public Interpolator l0;
    public ey0 m0;
    public boolean n;
    public boolean n0;
    public final byte o0;
    public boolean p0;
    public byte q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public Drawable s0;
    public int t0;
    public int u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public final ArrayList x0;
    public boolean y;
    public final zx0 y0;
    public hy0 z0;

    public my0(int i, ylb ylbVar, Context context, boolean z) {
        super(context, R.style.TransparentDialog);
        this.a = z8c.t0;
        byte b = 1;
        this.K = true;
        hd hdVar = new hd();
        this.Z = hdVar;
        this.a0 = true;
        int i2 = cmb.g5;
        this.b0 = i2;
        this.c0 = true;
        this.d0 = true;
        this.e0 = true;
        this.h0 = gm.m;
        this.k0 = (short) 400;
        this.l0 = d53.h;
        this.o0 = (byte) 16;
        this.p0 = true;
        this.q0 = (byte) 51;
        this.r0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = new ArrayList();
        this.y0 = new zx0(this, b);
        this.D0 = 0.0f;
        this.G0 = cmb.Z6;
        this.L0 = true;
        this.M0 = new po(null);
        this.T0 = true;
        this.U0 = (byte) 51;
        this.X0 = new sy4();
        this.b1 = -1;
        this.d1 = i2;
        this.h1 = -1L;
        this.J0 = ylbVar;
        if (i == 3) {
            gm.S(getWindow());
            this.n = false;
            this.r = false;
            this.s = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i != 1) {
                this.o0 = (byte) 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        ly0 ly0Var = new ly0(b10.d(context, R.drawable.sheet_shadow_round));
        this.s0 = ly0Var;
        int v0 = cmb.v0(i2, this.J0);
        this.c1 = v0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
        this.e1 = porterDuffColorFilter;
        ly0Var.setColorFilter(porterDuffColorFilter);
        this.s0.getPadding(rect);
        this.u0 = rect.left;
        this.t0 = rect.top;
        dy0 dy0Var = new dy0(this, getContext());
        this.c = dy0Var;
        dy0Var.setClipChildren(false);
        dy0Var.setClipToPadding(false);
        dy0Var.setBackground(hdVar);
        this.n0 = z;
        if (i == 1) {
            dy0Var.setFitsSystemWindows(true);
            dy0Var.setOnApplyWindowInsetsListener(new ex0(this, b));
        }
        if (i3 >= 30) {
            dy0Var.setSystemUiVisibility(1792);
        } else {
            dy0Var.setSystemUiVisibility(1280);
        }
        hdVar.setAlpha(0);
        if (i == 3) {
            nn0 nn0Var = new nn0(this);
            WeakHashMap weakHashMap = kfc.a;
            cfc.i(dy0Var, nn0Var);
        }
    }

    public boolean A0() {
        return false;
    }

    public final void B0(View view, bu5 bu5Var, boolean z) {
        if ((bu5Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && view.isLaidOut()) {
            dy0 dy0Var = this.c;
            if (dy0Var.isAttachedToWindow()) {
                if (this.Y0 == null) {
                    sy4 sy4Var = new sy4();
                    sy4Var.i(dy0Var);
                    eh0 eh0Var = new eh0(sy4Var, new nn0(this));
                    this.Z0 = eh0Var;
                    eh0Var.g(dy0Var, null, this.J0);
                    this.Z0.o = new ms0(this, (byte) 1);
                    bka bkaVar = new bka(getContext());
                    this.Y0 = bkaVar;
                    dy0Var.addView(bkaVar, qoe.c(-1.0f, -1));
                }
                bka bkaVar2 = this.Y0;
                if (bkaVar2.I) {
                    return;
                }
                cw6 cw6Var = this.a1;
                if (cw6Var == null) {
                    cw6Var = new cw6(bkaVar2, this.Z0, this.J0);
                    this.a1 = cw6Var;
                }
                if (!cw6Var.c) {
                    cw6Var.r = view;
                    cw6Var.d = z;
                }
                bu5Var.p = new cy0(bkaVar2, (byte) 0);
                bkaVar2.e(cw6Var, null, (ActionBarPopupWindow$ActionBarPopupWindowLayout) bu5Var.A);
                return;
            }
        }
        bu5Var.a0();
    }

    public boolean C() {
        return this.c0;
    }

    public final void C0() {
        int v0;
        Drawable drawable;
        int v02;
        int i = this.d1;
        dy0 dy0Var = this.c;
        if (i >= 0 && (drawable = this.s0) != null && this.e1 != null && drawable.getColorFilter() == this.e1 && (v02 = cmb.v0(this.d1, this.J0)) != this.c1) {
            Drawable drawable2 = this.s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
            this.e1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            this.c1 = v02;
            if (dy0Var != null) {
                dy0Var.invalidate();
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i2 = this.b1;
        if (i2 < 0 || this.G0 >= 0 || this.g1 != this.H0 || (v0 = cmb.v0(i2, this.J0)) == this.H0) {
            return;
        }
        this.H0 = v0;
        this.g1 = v0;
        if (dy0Var != null) {
            dy0Var.invalidate();
        }
        boolean z = ((double) gm.B(v0)) > 0.721d;
        if (this.i1 != null) {
            gm.j3(dy0Var, z);
        } else {
            gm.o3(this, v0, false, null);
            gm.i3(this, z);
        }
    }

    public boolean E() {
        return this.d0;
    }

    public boolean F(MotionEvent motionEvent) {
        return false;
    }

    public void G() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.A0 = null;
        }
        this.B0 = (byte) 0;
    }

    public void H() {
        d dVar = this.i1;
        if (dVar != null) {
            dVar.removeSheet(this);
            gm.B2(this.c);
        } else {
            try {
                super.dismiss();
            } catch (Exception e) {
                fc4.g(e, false);
            }
        }
    }

    public void I(int i) {
        Integer num;
        if (this.J) {
            return;
        }
        this.J = true;
        G();
        byte b = 2;
        this.B0 = (byte) 2;
        this.A0 = new AnimatorSet();
        byte b2 = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(gm.n, O())) + gm.L(10.0f) + P() + this.f);
        ofFloat.addUpdateListener(new ay0(this, b));
        this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, so.d, 0));
        this.A0.setDuration(this.X == 4 ? 330L : 180L);
        this.A0.setInterpolator(d53.g);
        this.A0.addListener(new co(this, i, b));
        nm7.e().k(nm7.j1, 512);
        this.A0.start();
        if (this.X != 4 || (num = this.Y) == null) {
            return;
        }
        int intValue = num.intValue();
        ArrayList arrayList = this.x0;
        int currentTextColor = ((gy0) arrayList.get(intValue)).getTextView().getCurrentTextColor();
        int currentTextColor2 = ((gy0) arrayList.get(i)).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new ay0(this, (byte) 3));
        ofArgb.setDuration(130L);
        d53 d53Var = d53.f;
        ofArgb.setInterpolator(d53Var);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new by0(this, i, b2));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(d53Var);
        ofArgb2.start();
    }

    public final void J() {
        L(cmb.Z6);
    }

    public final void K(int i) {
        this.n = !this.x;
        this.s = true;
        this.w = true;
        this.G0 = -1;
        this.b1 = -1;
        this.H0 = i;
        x0(i);
    }

    public final void L(int i) {
        K(cmb.v0(i, this.J0));
        this.b1 = i;
    }

    public final int M() {
        WindowInsets windowInsets;
        int i;
        int i2;
        int i3;
        if (!this.i0 || (windowInsets = this.h) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (this.d || !this.n || systemGestureInsets == null) {
            return 0;
        }
        i = systemGestureInsets.left;
        if (i == 0) {
            i3 = systemGestureInsets.right;
            if (i3 == 0) {
                return 0;
            }
        }
        i2 = systemGestureInsets.bottom;
        return i2;
    }

    public int O() {
        return (int) (this.S * 1.0f);
    }

    public int P() {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int Q() {
        if (this.h != null) {
            return (int) (r1.getSystemWindowInsetLeft() * 1.0f);
        }
        return 0;
    }

    public ArrayList R() {
        return null;
    }

    public final int S(int i) {
        return cmb.v0(i, this.J0);
    }

    public boolean T(float f, float f2) {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f2 >= childAt.getY() + this.F.getY()) {
                if (f2 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f >= childAt.getX() + this.F.getX()) {
                        if (f <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        return f2 < ((float) this.b.getTop()) || f < ((float) this.b.getLeft()) || f > ((float) this.b.getRight());
    }

    public final /* synthetic */ WindowInsets U(WindowInsets windowInsets) {
        q0(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void X(d dVar) {
        if (gm.O1()) {
            return;
        }
        if (dVar == null || !dVar.isSupportEdgeToEdge()) {
            this.i1 = dVar;
            hd hdVar = this.Z;
            if (hdVar != null) {
                ((Paint) hdVar.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    public void a(boolean z) {
        dismiss();
    }

    public boolean c0(MotionEvent motionEvent) {
        return false;
    }

    @Override // ah0
    public final View d() {
        return this.c;
    }

    public void d0(float f) {
        dy0 dy0Var = this.c;
        if (dy0Var != null) {
            dy0Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168  */
    @Override // android.app.Dialog, android.content.DialogInterface, ah0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j;
        u31 u31Var;
        hy0 hy0Var = this.z0;
        if ((hy0Var == null || hy0Var.x()) && !this.J) {
            byte b = 1;
            this.J = true;
            bka bkaVar = this.Y0;
            if (bkaVar != null) {
                bkaVar.a(false);
            }
            DialogInterface.OnDismissListener onDismissListener = this.I0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            G();
            k0();
            byte b2 = 2;
            if (this.O0) {
                gm.c3(new zx0(this, b2));
            } else if (!this.e0 || !g0()) {
                gm.t1(this.c);
                this.B0 = (byte) 2;
                ValueAnimator valueAnimator = this.C0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 0.0f);
                this.C0 = ofFloat;
                ofFloat.addUpdateListener(new ay0(this, (byte) 4));
                this.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    if (this.V0) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, gm.L(48.0f));
                        ofFloat2.addUpdateListener(new ay0(this, (byte) 5));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.b, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(gm.n, O())) + gm.L(10.0f) + P() + (this.f1 ? this.e : this.f));
                        ofFloat3.addUpdateListener(new ay0(this, (byte) 6));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.Z, so.d, 0));
                arrayList.add(this.C0);
                B(arrayList, false);
                this.A0.playTogether(arrayList);
                boolean z = this.V0;
                AnimatorSet animatorSet = this.A0;
                if (z) {
                    animatorSet.setDuration(200L);
                    this.A0.setInterpolator(d53.f);
                    j = 0;
                } else {
                    j = 250;
                    animatorSet.setDuration(250L);
                    this.A0.setInterpolator(d53.g);
                }
                this.A0.addListener(new fy0(this, b));
                nm7.e().k(nm7.j1, 512);
                this.A0.start();
                u31Var = u31.x;
                if (u31Var != null && u31Var.m && u31Var.s) {
                    if (j <= 0) {
                        u31Var.c((long) (j * 0.6f), oc7.d1().getBoolean("view_animations", true));
                    } else {
                        u31Var.b();
                    }
                }
                y0(false);
            }
            j = 0;
            u31Var = u31.x;
            if (u31Var != null) {
                if (j <= 0) {
                }
            }
            y0(false);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // ah0
    public final int e(int i) {
        float f;
        ViewGroup viewGroup;
        if (!y() || (viewGroup = this.b) == null) {
            f = 0.0f;
        } else if (this.V0) {
            f = viewGroup.getAlpha();
        } else {
            f = Utilities.l(1.0f - (this.b.getTranslationY() / ((gm.L(10.0f) + (P() + this.f)) + (this.w ? Math.max(0, Math.min(gm.n, O())) : 0))));
        }
        return on2.f(f, i, this.H0);
    }

    @Override // ah0
    public boolean f() {
        return this.a0;
    }

    public final void f0() {
        Window window;
        int i;
        d dVar = this.i1;
        dy0 dy0Var = this.c;
        byte b = 0;
        if (dVar != null) {
            dVar.addSheet(this);
            if (this.i1.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.i1.getLayoutContainer().getWindowToken(), 2)) {
                gm.d3(new zx0(this, b), 80L);
            } else {
                gm.B2(dy0Var);
                this.i1.getLayoutContainer().addView(dy0Var);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(dy0Var, new ViewGroup.LayoutParams(-1, -1));
        }
        byte b2 = 1;
        if (this.a0 && cmb.w0(null, cmb.r8, true) == -1) {
            dy0Var.setSystemUiVisibility(dy0Var.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        byte b3 = 5;
        if (this.b == null) {
            yd ydVar = new yd(b3, getContext(), this);
            this.b = ydVar;
            ydVar.setBackgroundDrawable(this.s0);
            this.b.setPadding(this.u0, ((this.v0 ? gm.L(8.0f) : 0) + this.t0) - 1, this.u0, this.w0 ? gm.L(8.0f) : 0);
        }
        this.b.setVisibility(4);
        dy0Var.addView(this.b, 0, qoe.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            dy0Var.addView(frameLayout, dy0Var.indexOfChild(this.b) + 1, qoe.e(-1, -2, 80));
        }
        if (this.P != null) {
            ey0 ey0Var = new ey0(b, getContext(), this);
            this.m0 = ey0Var;
            ey0Var.setText(this.P);
            boolean z = this.Q;
            ey0 ey0Var2 = this.m0;
            if (z) {
                anb.X(ey0Var2, cmb.i5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(gm.o());
                this.m0.setPadding(gm.L(21.0f), gm.L(this.R ? 14.0f : 6.0f), gm.L(21.0f), gm.L(8.0f));
            } else {
                anb.X(ey0Var2, cmb.p5, this.J0);
                this.m0.setTextSize(1, 16.0f);
                this.m0.setPadding(gm.L(16.0f), gm.L(this.R ? 8.0f : 0.0f), gm.L(16.0f), gm.L(8.0f));
            }
            boolean z2 = this.R;
            ey0 ey0Var3 = this.m0;
            if (z2) {
                ey0Var3.setSingleLine(false);
                this.m0.setMaxLines(5);
                this.m0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                ey0Var3.setLines(1);
                this.m0.setSingleLine(true);
                this.m0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.m0.setGravity(16);
            this.b.addView(this.m0, qoe.c(this.R ? -2.0f : 48.0f, -1));
            this.m0.setOnTouchListener(new p8((byte) 19));
            i = 48;
        } else {
            i = 0;
        }
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            if (viewGroup.getParent() != null) {
                ((ViewGroup) this.O.getParent()).removeView(this.O);
            }
            boolean z3 = this.T0;
            ViewGroup viewGroup2 = this.b;
            if (z3) {
                viewGroup2.addView(this.O, qoe.d(-1, -2.0f, this.U0, 0.0f, i, 0.0f, 0.0f));
            } else {
                viewGroup2.setClipToPadding(false);
                this.b.setClipChildren(false);
                dy0Var.setClipToPadding(false);
                dy0Var.setClipChildren(false);
                float f = i;
                this.b.addView(this.O, qoe.d(-1, -2.0f, this.U0, 0.0f, f, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = gm.L(f) + (-this.t0);
            }
        } else if (this.M != null) {
            int i2 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i2 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i2] != null) {
                    gy0 gy0Var = new gy0(this.X, this.J0, getContext());
                    CharSequence charSequence = this.M[i2];
                    int[] iArr = this.N;
                    gy0Var.a(charSequence, iArr != null ? iArr[i2] : 0, null, this.Q);
                    this.b.addView(gy0Var, qoe.d(-1, 48.0f, 51, 0.0f, i, 0.0f, 0.0f));
                    i += 48;
                    gy0Var.setTag(Integer.valueOf(i2));
                    gy0Var.setOnClickListener(new di(this, b2));
                    this.x0.add(gy0Var);
                }
                i2++;
            }
        }
        if (this.i1 != null || window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.flags = i3;
        if (this.n0) {
            attributes.softInputMode = this.o0;
        } else {
            i3 |= 131072;
            attributes.flags = i3;
        }
        if (this.W) {
            attributes.flags = i3 | (-2147416832);
            dy0Var.setSystemUiVisibility(1284);
        }
        attributes.height = -1;
        gm.m(attributes);
        window.setAttributes(attributes);
    }

    public boolean g0() {
        return false;
    }

    @Override // ah0
    public final boolean h() {
        return false;
    }

    public boolean h0(View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean i0(View view, int i, int i2) {
        return false;
    }

    public c41 j() {
        return new c41(this.F, this.J0);
    }

    public boolean j0() {
        return false;
    }

    public void l0() {
        dismiss();
    }

    @Override // ah0
    public void n(Runnable runnable) {
        this.I0 = new nf(runnable, (byte) 1);
    }

    public void n0(float f) {
        dy0 dy0Var = this.c;
        if (dy0Var != null) {
            dy0Var.invalidate();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        bka bkaVar = this.Y0;
        if (bkaVar != null && bkaVar.I) {
            bkaVar.a(true);
        } else if (this.i1 == null) {
            super.onBackPressed();
        } else {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f0();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    @Override // ah0
    public final void p() {
        onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p0() {
        if (!(this instanceof vlb) || this.W0) {
            return;
        }
        this.W0 = true;
        try {
            try {
                ((vlb) this).updateColors();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } finally {
            this.W0 = false;
        }
    }

    public final void q0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || gm.E) && this.h0 != systemWindowInsetTop) {
            this.h0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.c.requestLayout();
        m0();
    }

    public void r0(boolean z) {
        this.r0 = z;
        if (z) {
            return;
        }
        this.b.setTranslationY(0.0f);
        e0();
    }

    @Override // ah0
    public final boolean s() {
        return !this.J;
    }

    public final void s0(int i) {
        this.s0.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        if (this.c1 != i) {
            this.c1 = i;
            dy0 dy0Var = this.c;
            if (dy0Var != null) {
                dy0Var.invalidate(0, dy0Var.getMeasuredHeight() - dy0Var.x, dy0Var.getMeasuredWidth(), dy0Var.getMeasuredHeight());
            }
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.P = charSequence;
        this.Q = false;
    }

    @Override // android.app.Dialog
    public void show() {
        if (gm.K1(getContext())) {
            if (this.i1 != null) {
                f0();
            } else {
                super.show();
            }
            y0(true);
            if (this.n0) {
                getWindow().setSoftInputMode(this.o0);
            }
            this.J = false;
            G();
            ViewGroup viewGroup = this.b;
            Point point = gm.q;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(point.x + (this.u0 << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            boolean z = this.f0;
            hd hdVar = this.Z;
            if (z) {
                hdVar.setAlpha(this.p0 ? this.q0 : 0);
                this.b.setTranslationY(0.0f);
                e0();
                return;
            }
            hdVar.setAlpha(0);
            this.I = 2;
            this.b.setTranslationY((gm.m * 1.0f) + r0.getMeasuredHeight() + (this.w ? Math.max(0, Math.min(gm.n, O())) : 0));
            e0();
            long j = this.S0 ? 0L : 150L;
            if (this.E) {
                j = 500;
            }
            o1 o1Var = new o1(this, (byte) 9);
            this.H = o1Var;
            gm.d3(o1Var, j);
        }
    }

    @Override // ah0
    public boolean t(Dialog dialog) {
        return false;
    }

    public final void t0(int i) {
        s0(cmb.v0(i, this.J0));
        Drawable drawable = this.s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.c1, PorterDuff.Mode.MULTIPLY);
        this.e1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.d1 = i;
    }

    public final void u0(boolean z) {
        this.i0 = z;
        this.n = z;
    }

    public final void v0(boolean z) {
        if (this.n0 == z) {
            return;
        }
        this.n0 = z;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.n0) {
            attributes.softInputMode = this.o0;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void w0(int i, int i2, int i3) {
        if (i >= 0) {
            ArrayList arrayList = this.x0;
            if (i < arrayList.size()) {
                gy0 gy0Var = (gy0) arrayList.get(i);
                gy0Var.a.setTextColor(i2);
                gy0Var.b.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public void x0(int i) {
        this.g1 = i;
        dy0 dy0Var = this.c;
        if (dy0Var != null) {
            dy0Var.invalidate();
        }
        if (this.i1 != null) {
            LaunchActivity.H1.H(true, true, true);
            gm.j3(dy0Var, gm.B(e(cmb.v0(cmb.Z6, this.J0))) >= 0.721f);
        } else {
            gm.o3(this, this.g1, true, null);
            gm.i3(this, ((double) gm.B(this.g1)) > 0.721d);
        }
    }

    @Override // ah0
    public final boolean y() {
        dy0 dy0Var = this.c;
        return dy0Var != null && dy0Var.isAttachedToWindow();
    }

    public final void y0(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            if (this.N0 > 0) {
                if (z) {
                    nm7.e().k(nm7.j1, Integer.valueOf(this.N0));
                } else {
                    nm7.e().k(nm7.k1, Integer.valueOf(this.N0));
                }
            }
        }
    }

    public final void z0(boolean z) {
        this.a0 = z;
        int w0 = cmb.w0(null, cmb.r8, true);
        dy0 dy0Var = this.c;
        int systemUiVisibility = dy0Var.getSystemUiVisibility();
        dy0Var.setSystemUiVisibility((this.a0 && w0 == -1) ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        if (this.i1 != null) {
            LaunchActivity.H1.H(true, true, true);
        }
    }

    public void W(Canvas canvas) {
    }

    public wzc Y(wzc wzcVar) {
        return wzcVar;
    }

    public void Z(Configuration configuration) {
    }

    public void a0() {
    }

    @Override // ah0
    public final void b(boolean z) {
    }

    public void b0() {
    }

    public void e0() {
    }

    @Override // ah0
    public final void g(int i) {
    }

    public void k0() {
    }

    public void m0() {
    }

    public void o0() {
    }

    public void w() {
    }

    public void z(HashSet hashSet) {
    }

    public void B(ArrayList arrayList, boolean z) {
    }

    public my0(Context context, boolean z) {
        this(1, (ylb) null, context, z);
    }

    public my0(ylb ylbVar, Context context, boolean z, boolean z2) {
        this(z2 ? 2 : 1, ylbVar, context, z);
    }
}
