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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class j11 extends Dialog {
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
    public final /* synthetic */ n11 Q;
    public final x01 a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Runnable f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final k0 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout w;
    public org.telegram.ui.ActionBar.u2 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j11(n11 n11Var, Context context, Runnable runnable, View view, x01 x01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.gc b10;
        String str;
        ColorFilter colorFilter;
        this.Q = n11Var;
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
        this.a = x01Var;
        this.f = runnable;
        this.h = view;
        final d01 d01Var = (d01) this;
        k0 k0Var = new k0(24, context, d01Var);
        this.s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new rv(10, context, d01Var), c8.ja.t(org.telegram.messenger.ns.q2, org.telegram.messenger.ns.q2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, e6Var);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ja.t(-2, -2, 17, 0, 0, 0, 0));
        final int i7 = 0;
        org.telegram.ui.ActionBar.q0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745532, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.g11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i10 = 1;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745530, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.g11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 2;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745529, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.g11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 3;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745531, null), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.g11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        d01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745527, null), false, e6Var).setOnClickListener(new a90(16, d01Var, context));
        k0Var.addView(linearLayout, c8.ja.e(-2, -2, 17));
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
            k0Var.setOnApplyWindowInsetsListener(new cz0(d01Var, 1 == true ? 1 : 0));
            attributes.flags |= 1024;
            k0Var.setFitsSystemWindows(true);
            k0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (x01Var != null) {
            x01Var.b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.H0(k0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = x01Var.d;
        if (document == null) {
            Drawable drawable = x01Var.F;
            if (drawable instanceof org.telegram.ui.Components.g5) {
                document = ((org.telegram.ui.Components.g5) drawable).e;
            }
        }
        if (document != null) {
            org.telegram.messenger.pz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.gc.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.gj.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.gc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.gc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((x01Var.F instanceof org.telegram.ui.Components.g5) && (org.telegram.messenger.gj.C4(document2) || ((org.telegram.ui.Components.g5) x01Var.F).c())) {
                if (!org.telegram.messenger.gj.C4(document2)) {
                    org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) x01Var.F;
                    SparseArray sparseArray = org.telegram.ui.Components.g5.r;
                    if (g5Var == null || !g5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.j6.o0(e6Var);
                        imageReceiver.p1 = colorFilter;
                    }
                }
                colorFilter = n11Var.l1;
                imageReceiver.p1 = colorFilter;
            }
        }
        x01Var.getLocationOnScreen(iArr);
        rect.left = x01Var.getPaddingLeft() + iArr[0];
        rect.top = x01Var.getPaddingTop() + iArr[1];
        rect.right = (x01Var.getWidth() + iArr[0]) - x01Var.getPaddingRight();
        rect.bottom = (x01Var.getHeight() + iArr[1]) - x01Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i13 = iArr[1];
        this.F = i13;
        this.G = view.getHeight() + i13;
    }

    public static void a(j11 j11Var, Integer num) {
        Runnable runnable;
        d01 d01Var = (d01) j11Var;
        if (num != null && (runnable = d01Var.T.e.V1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(d01 d01Var, View view, WindowInsets windowInsets) {
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
        ofFloat.addUpdateListener(new ez0(this, 6));
        this.O.addListener(new z20(9, this, z10));
        if (z10) {
            this.O.setDuration(360L);
            this.O.setInterpolator(org.telegram.ui.Components.er.h);
        } else {
            this.O.setDuration(240L);
            this.O.setInterpolator(org.telegram.ui.Components.er.g);
        }
        this.O.start();
    }

    public final void d(final boolean z10, f11 f11Var, final f11 f11Var2, final boolean z11) {
        x01 x01Var = this.a;
        if (x01Var == null) {
            if (f11Var != null) {
                f11Var.run();
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
            x01Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z10 ? 1.0f : 0.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.h11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                j11 j11Var = j11.this;
                j11Var.J = floatValue;
                org.telegram.messenger.g0.X1(j11Var.c, j11Var.d, floatValue, j11Var.e);
                j11Var.s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    j11Var.w.setAlpha(j11Var.J);
                }
                if (j11Var.J < 0.025f && !z12) {
                    if (z11) {
                        j11Var.a.b = false;
                        j11Var.Q.i0.invalidate();
                    }
                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.k1, 4);
                }
                if (j11Var.J >= 0.5f || z12 || (runnable = f11Var2) == null) {
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
        this.L.addListener(new i11(this, z10, f11Var2, zArr, z11, f11Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(org.telegram.ui.Components.er.h);
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
            e01 e01Var = ((d01) this).T;
            n11 n11Var = e01Var.e;
            if (n11Var.p1 != null && e01Var.d != null) {
                rect.set(n11Var.q1);
                z10 = true;
                this.y = z10;
                int[] iArr = this.H;
                if (z10) {
                    x01 x01Var = this.a;
                    x01Var.getLocationOnScreen(iArr);
                    rect.left = x01Var.getPaddingLeft() + iArr[0];
                    rect.top = x01Var.getPaddingTop() + iArr[1];
                    rect.right = (x01Var.getWidth() + iArr[0]) - x01Var.getPaddingRight();
                    rect.bottom = (x01Var.getHeight() + iArr[1]) - x01Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new f11(this, num, 0), new f11(this, num, 1), !z10);
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
        d(false, new f11(this, num, 0), new f11(this, num, 1), !z10);
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
        canvas.drawColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
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
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ns.K2));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
