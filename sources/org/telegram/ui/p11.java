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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class p11 extends Dialog {
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
    public final /* synthetic */ t11 P;
    public final d11 a;
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
    public org.telegram.ui.ActionBar.w2 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p11(t11 t11Var, Context context, Runnable runnable, View view, d11 d11Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z9;
        org.telegram.messenger.hc b10;
        String str;
        ColorFilter colorFilter;
        this.P = t11Var;
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
        this.a = d11Var;
        this.f = runnable;
        this.h = view;
        final j01 j01Var = (j01) this;
        k0 k0Var = new k0(24, context, j01Var);
        this.s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new o00(9, context, j01Var), c8.ha.t(org.telegram.messenger.qs.q2, org.telegram.messenger.qs.q2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, h6Var);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        final int i7 = 0;
        org.telegram.ui.ActionBar.r0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745532, null), false, h6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i10 = 1;
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745530, null), false, h6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 2;
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745529, null), false, h6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 3;
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745531, null), false, h6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745527, null), false, h6Var).setOnClickListener(new ik0(8, j01Var, context));
        k0Var.addView(linearLayout, c8.ha.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z9 = true;
            k0Var.setOnApplyWindowInsetsListener(new iz0(j01Var, 1 == true ? 1 : 0));
            attributes.flags |= 1024;
            k0Var.setFitsSystemWindows(true);
            k0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z9 = true;
        }
        if (d11Var != null) {
            d11Var.b = z9;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.H0(k0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = d11Var.d;
        if (document == null) {
            Drawable drawable = d11Var.E;
            if (drawable instanceof org.telegram.ui.Components.h5) {
                document = ((org.telegram.ui.Components.h5) drawable).e;
            }
        }
        if (document != null) {
            org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.hc.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.ij.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.hc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.hc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((d11Var.E instanceof org.telegram.ui.Components.h5) && (org.telegram.messenger.ij.C4(document2) || ((org.telegram.ui.Components.h5) d11Var.E).c())) {
                if (!org.telegram.messenger.ij.C4(document2)) {
                    org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) d11Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.h5.r;
                    if (h5Var == null || !h5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.m6.o0(h6Var);
                        imageReceiver.o1 = colorFilter;
                    }
                }
                colorFilter = t11Var.k1;
                imageReceiver.o1 = colorFilter;
            }
        }
        d11Var.getLocationOnScreen(iArr);
        rect.left = d11Var.getPaddingLeft() + iArr[0];
        rect.top = d11Var.getPaddingTop() + iArr[1];
        rect.right = (d11Var.getWidth() + iArr[0]) - d11Var.getPaddingRight();
        rect.bottom = (d11Var.getHeight() + iArr[1]) - d11Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.D = iArr[0];
        int i13 = iArr[1];
        this.E = i13;
        this.F = view.getHeight() + i13;
    }

    public static void a(p11 p11Var, Integer num) {
        Runnable runnable;
        j01 j01Var = (j01) p11Var;
        if (num != null && (runnable = j01Var.S.e.U1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(j01 j01Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z9) {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            if (this.M == z9) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.M = z9;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, z9 ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new kz0(this, 6));
        this.N.addListener(new c50(8, this, z9));
        if (z9) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.wq.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.wq.g);
        }
        this.N.start();
    }

    public final void d(final boolean z9, l11 l11Var, final l11 l11Var2, final boolean z10) {
        d11 d11Var = this.a;
        if (d11Var == null) {
            if (l11Var != null) {
                l11Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            if (this.J == z9) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.J = z9;
        if (z9) {
            d11Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z9 ? 1.0f : 0.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.n11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                p11 p11Var = p11.this;
                p11Var.I = floatValue;
                org.telegram.messenger.g0.X1(p11Var.c, p11Var.d, floatValue, p11Var.e);
                p11Var.s.invalidate();
                boolean z11 = z9;
                if (!z11) {
                    p11Var.w.setAlpha(p11Var.I);
                }
                if (p11Var.I < 0.025f && !z11) {
                    if (z10) {
                        p11Var.a.b = false;
                        p11Var.P.h0.invalidate();
                    }
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 4);
                }
                if (p11Var.I >= 0.5f || z11 || (runnable = l11Var2) == null) {
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
        this.K.addListener(new o11(this, z9, l11Var2, zArr, z10, l11Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.wq.h);
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
        boolean z9;
        Runnable runnable;
        if (this.H) {
            return;
        }
        this.H = true;
        Rect rect = this.c;
        if (num != null) {
            k01 k01Var = ((j01) this).S;
            t11 t11Var = k01Var.e;
            if (t11Var.o1 != null && k01Var.d != null) {
                rect.set(t11Var.p1);
                z9 = true;
                this.y = z9;
                int[] iArr = this.G;
                if (z9) {
                    d11 d11Var = this.a;
                    d11Var.getLocationOnScreen(iArr);
                    rect.left = d11Var.getPaddingLeft() + iArr[0];
                    rect.top = d11Var.getPaddingTop() + iArr[1];
                    rect.right = (d11Var.getWidth() + iArr[0]) - d11Var.getPaddingRight();
                    rect.bottom = (d11Var.getHeight() + iArr[1]) - d11Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new l11(this, num, 0), new l11(this, num, 1), !z9);
                c(false);
            }
        }
        z9 = false;
        this.y = z9;
        int[] iArr2 = this.G;
        if (z9) {
        }
        if (num != null) {
            runnable.run();
        }
        d(false, new l11(this, num, 0), new l11(this, num, 1), !z9);
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
        canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
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
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.qs.K2));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
