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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class c31 extends Dialog {
    public final int D;
    public final int E;
    public final int F;
    public final int[] G;
    public boolean H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public float L;
    public boolean M;
    public ValueAnimator N;
    public boolean O;
    public final /* synthetic */ g31 P;
    public final q21 a;
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
    public org.telegram.ui.ActionBar.z2 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(g31 g31Var, Context context, Runnable runnable, View view, q21 q21Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.jc b10;
        String str;
        ColorFilter colorFilter;
        this.P = g31Var;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.G = iArr;
        this.H = false;
        this.O = false;
        this.a = q21Var;
        this.f = runnable;
        this.h = view;
        final w11 w11Var = (w11) this;
        l0 l0Var = new l0(w11Var, context, 25);
        this.s = l0Var;
        setContentView(l0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new bo0(w11Var, context, 5), w7.b6.t(org.telegram.messenger.at.q2, org.telegram.messenger.at.q2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, p6Var);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        final int i10 = 0;
        org.telegram.ui.ActionBar.t0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131745549, null), false, p6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 1;
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131745547, null), false, p6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 2;
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131745546, null), false, p6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i13 = 3;
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131745548, null), false, p6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.z21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131745544, null), false, p6Var).setOnClickListener(new qv0(2, w11Var, context));
        l0Var.addView(linearLayout, w7.b6.e(-2, -2, 17));
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
            l0Var.setOnApplyWindowInsetsListener(new s01(w11Var, 1 == true ? 1 : 0));
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
        if (q21Var != null) {
            q21Var.b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.H0(l0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = q21Var.d;
        if (document == null) {
            Drawable drawable = q21Var.E;
            if (drawable instanceof org.telegram.ui.Components.f5) {
                document = ((org.telegram.ui.Components.f5) drawable).e;
            }
        }
        if (document != null) {
            org.telegram.messenger.d00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, false);
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.jc.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.kj.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.jc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.jc.c(w9, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((q21Var.E instanceof org.telegram.ui.Components.f5) && (org.telegram.messenger.kj.C4(document2) || ((org.telegram.ui.Components.f5) q21Var.E).c())) {
                if (!org.telegram.messenger.kj.C4(document2)) {
                    org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) q21Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.f5.r;
                    if (f5Var == null || !f5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.t6.o0(p6Var);
                        imageReceiver.o1 = colorFilter;
                    }
                }
                colorFilter = g31Var.k1;
                imageReceiver.o1 = colorFilter;
            }
        }
        q21Var.getLocationOnScreen(iArr);
        rect.left = q21Var.getPaddingLeft() + iArr[0];
        rect.top = q21Var.getPaddingTop() + iArr[1];
        rect.right = (q21Var.getWidth() + iArr[0]) - q21Var.getPaddingRight();
        rect.bottom = (q21Var.getHeight() + iArr[1]) - q21Var.getPaddingBottom();
        org.telegram.messenger.i0.X1(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.D = iArr[0];
        int i14 = iArr[1];
        this.E = i14;
        this.F = view.getHeight() + i14;
    }

    public static void a(c31 c31Var, Integer num) {
        Runnable runnable;
        w11 w11Var = (w11) c31Var;
        if (num != null && (runnable = w11Var.S.e.U1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(w11 w11Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            if (this.M == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.M = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, z10 ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new u01(this, 6));
        this.N.addListener(new org.telegram.ui.Components.ha0(24, this, z10));
        if (z10) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.gr.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.gr.g);
        }
        this.N.start();
    }

    public final void d(final boolean z10, y21 y21Var, final y21 y21Var2, final boolean z11) {
        q21 q21Var = this.a;
        if (q21Var == null) {
            if (y21Var != null) {
                y21Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            if (this.J == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.J = z10;
        if (z10) {
            q21Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z10 ? 1.0f : 0.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.a31
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                c31 c31Var = c31.this;
                c31Var.I = floatValue;
                org.telegram.messenger.i0.X1(c31Var.c, c31Var.d, floatValue, c31Var.e);
                c31Var.s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    c31Var.w.setAlpha(c31Var.I);
                }
                if (c31Var.I < 0.025f && !z12) {
                    if (z11) {
                        c31Var.a.b = false;
                        c31Var.P.h0.invalidate();
                    }
                    org.telegram.messenger.at.e().k(org.telegram.messenger.at.k1, 4);
                }
                if (c31Var.I >= 0.5f || z12 || (runnable = y21Var2) == null) {
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
        this.K.addListener(new b31(this, z10, y21Var2, zArr, z11, y21Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.gr.h);
        this.K.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.O) {
            return;
        }
        e(null);
        this.O = true;
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
        if (this.H) {
            return;
        }
        this.H = true;
        Rect rect = this.c;
        if (num != null) {
            x11 x11Var = ((w11) this).S;
            g31 g31Var = x11Var.e;
            if (g31Var.o1 != null && x11Var.d != null) {
                rect.set(g31Var.p1);
                z10 = true;
                this.y = z10;
                int[] iArr = this.G;
                if (z10) {
                    q21 q21Var = this.a;
                    q21Var.getLocationOnScreen(iArr);
                    rect.left = q21Var.getPaddingLeft() + iArr[0];
                    rect.top = q21Var.getPaddingTop() + iArr[1];
                    rect.right = (q21Var.getWidth() + iArr[0]) - q21Var.getPaddingRight();
                    rect.bottom = (q21Var.getHeight() + iArr[1]) - q21Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new y21(this, num, 0), new y21(this, num, 1), !z10);
                c(false);
            }
        }
        z10 = false;
        this.y = z10;
        int[] iArr2 = this.G;
        if (z10) {
        }
        if (num != null) {
            runnable.run();
        }
        d(false, new y21(this, num, 0), new y21(this, num, 1), !z10);
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
        canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.M().getLastFragment().getVisibleDialog() != null) {
                launchActivity.M().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.G);
            canvas.save();
            canvas.translate(r2[0], r2[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.at.K2));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
