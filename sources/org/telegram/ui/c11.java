package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class c11 extends Dialog {
    public final int E;
    public final int F;
    public final int G;
    public final int[] H;
    public boolean I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ g11 Q;
    public final q01 a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Runnable f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final l0 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout w;
    public org.telegram.ui.ActionBar.t2 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(g11 g11Var, Context context, Runnable runnable, View view, q01 q01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.ac b10;
        String str;
        ColorFilter colorFilter;
        this.Q = g11Var;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.a = q01Var;
        this.f = runnable;
        this.h = view;
        final wz0 wz0Var = (wz0) this;
        l0 l0Var = new l0(24, context, wz0Var);
        this.s = l0Var;
        setContentView(l0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new org.telegram.ui.Components.voip.r0(11, context, wz0Var), b8.mf.t(org.telegram.messenger.hs.q2, org.telegram.messenger.hs.q2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, e6Var);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.t(-2, -2, 17, 0, 0, 0, 0));
        final int i3 = 0;
        org.telegram.ui.ActionBar.q0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745542, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i10 = 1;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745540, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 2;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745539, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 3;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745541, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745537, null), false, e6Var).setOnClickListener(new hb0(14, wz0Var, context));
        l0Var.addView(linearLayout, b8.mf.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z10 = true;
            l0Var.setOnApplyWindowInsetsListener(new uy0(wz0Var, 1 == true ? 1 : 0));
            attributes.flags |= 1024;
            l0Var.setFitsSystemWindows(true);
            l0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (q01Var != null) {
            q01Var.b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.H0(l0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = q01Var.d;
        if (document == null) {
            Drawable drawable = q01Var.F;
            if (drawable instanceof org.telegram.ui.Components.g5) {
                document = ((org.telegram.ui.Components.g5) drawable).e;
            }
        }
        if (document != null) {
            org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.ac.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.zi.L2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.ac.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.ac.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((q01Var.F instanceof org.telegram.ui.Components.g5) && (org.telegram.messenger.zi.D4(document2) || ((org.telegram.ui.Components.g5) q01Var.F).c())) {
                if (!org.telegram.messenger.zi.D4(document2)) {
                    org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) q01Var.F;
                    SparseArray sparseArray = org.telegram.ui.Components.g5.r;
                    if (g5Var == null || !g5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.k6.o0(e6Var);
                        imageReceiver.p1 = colorFilter;
                    }
                }
                colorFilter = g11Var.l1;
                imageReceiver.p1 = colorFilter;
            }
        }
        q01Var.getLocationOnScreen(iArr);
        rect.left = q01Var.getPaddingLeft() + iArr[0];
        rect.top = q01Var.getPaddingTop() + iArr[1];
        rect.right = (q01Var.getWidth() + iArr[0]) - q01Var.getPaddingRight();
        rect.bottom = (q01Var.getHeight() + iArr[1]) - q01Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i13 = iArr[1];
        this.F = i13;
        this.G = view.getHeight() + i13;
    }

    public static void a(c11 c11Var, Integer num) {
        Runnable runnable;
        wz0 wz0Var = (wz0) c11Var;
        if (num != null && (runnable = wz0Var.T.e.V1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(wz0 wz0Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            if (this.N == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.N = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, z10 ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new xy0(this, 6));
        this.O.addListener(new u40(8, this, z10));
        if (z10) {
            this.O.setDuration(360L);
            this.O.setInterpolator(org.telegram.ui.Components.xq.h);
        } else {
            this.O.setDuration(240L);
            this.O.setInterpolator(org.telegram.ui.Components.xq.g);
        }
        this.O.start();
    }

    public final void d(final boolean z10, y01 y01Var, final y01 y01Var2, final boolean z11) {
        q01 q01Var = this.a;
        if (q01Var == null) {
            if (y01Var != null) {
                y01Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            if (this.K == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.K = z10;
        if (z10) {
            q01Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z10 ? 1.0f : 0.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.a11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                c11 c11Var = c11.this;
                c11Var.J = floatValue;
                org.telegram.messenger.g0.X1(c11Var.c, c11Var.d, floatValue, c11Var.e);
                c11Var.s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    c11Var.w.setAlpha(c11Var.J);
                }
                if (c11Var.J < 0.025f && !z12) {
                    if (z11) {
                        c11Var.a.b = false;
                        c11Var.Q.i0.invalidate();
                    }
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4);
                }
                if (c11Var.J >= 0.5f || z12 || (runnable = y01Var2) == null) {
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                runnable.run();
            }
        });
        this.L.addListener(new b11(this, z10, y01Var2, zArr, z11, y01Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(org.telegram.ui.Components.xq.h);
        this.L.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.P) {
            return;
        }
        e(null);
        this.P = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent || motionEvent.getAction() != 0) {
            return dispatchTouchEvent;
        }
        dismiss();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Integer num) {
        boolean z10;
        Runnable runnable;
        if (this.I) {
            return;
        }
        this.I = true;
        Rect rect = this.c;
        if (num != null) {
            xz0 xz0Var = ((wz0) this).T;
            g11 g11Var = xz0Var.e;
            if (g11Var.p1 != null && xz0Var.d != null) {
                rect.set(g11Var.q1);
                z10 = true;
                this.y = z10;
                int[] iArr = this.H;
                if (z10) {
                    q01 q01Var = this.a;
                    q01Var.getLocationOnScreen(iArr);
                    rect.left = q01Var.getPaddingLeft() + iArr[0];
                    rect.top = q01Var.getPaddingTop() + iArr[1];
                    rect.right = (q01Var.getWidth() + iArr[0]) - q01Var.getPaddingRight();
                    rect.bottom = (q01Var.getHeight() + iArr[1]) - q01Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new y01(this, num, 0), new y01(this, num, 1), !z10);
                c(false);
            }
        }
        z10 = false;
        this.y = z10;
        int[] iArr2 = this.H;
        if (z10) {
        }
        if (num != null) {
            runnable.run();
        }
        d(false, new y01(this, num, 0), new y01(this, num, 1), !z10);
        c(false);
    }

    public final void f() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
        int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.083333336f, 0.083333336f);
        canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.M().getLastFragment().getVisibleDialog() != null) {
                launchActivity.M().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.H);
            canvas.save();
            canvas.translate(r2[0], r2[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.hs.K2));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
