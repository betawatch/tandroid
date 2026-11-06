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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class m11 extends Dialog {
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
    public final /* synthetic */ q11 P;
    public final a11 a;
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
    public org.telegram.ui.ActionBar.v2 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m11(q11 q11Var, Context context, Runnable runnable, View view, a11 a11Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z9;
        org.telegram.messenger.hc b10;
        String str;
        ColorFilter colorFilter;
        this.P = q11Var;
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
        this.a = a11Var;
        this.f = runnable;
        this.h = view;
        final g01 g01Var = (g01) this;
        k0 k0Var = new k0(24, context, g01Var);
        this.s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new l00(9, context, g01Var), c8.ha.t(org.telegram.messenger.qs.q2, org.telegram.messenger.qs.q2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, f6Var);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        final int i7 = 0;
        org.telegram.ui.ActionBar.r0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745533, null), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i10 = 1;
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745531, null), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 2;
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745530, null), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 3;
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745532, null), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745528, null), false, f6Var).setOnClickListener(new fk0(8, g01Var, context));
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
            k0Var.setOnApplyWindowInsetsListener(new ez0(g01Var, 1 == true ? 1 : 0));
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
        if (a11Var != null) {
            a11Var.b = z9;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.H0(k0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = a11Var.d;
        if (document == null) {
            Drawable drawable = a11Var.E;
            if (drawable instanceof org.telegram.ui.Components.i5) {
                document = ((org.telegram.ui.Components.i5) drawable).e;
            }
        }
        if (document != null) {
            org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.hc.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.ij.L2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.hc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.hc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((a11Var.E instanceof org.telegram.ui.Components.i5) && (org.telegram.messenger.ij.D4(document2) || ((org.telegram.ui.Components.i5) a11Var.E).c())) {
                if (!org.telegram.messenger.ij.D4(document2)) {
                    org.telegram.ui.Components.i5 i5Var = (org.telegram.ui.Components.i5) a11Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.i5.r;
                    if (i5Var == null || !i5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.k6.o0(f6Var);
                        imageReceiver.o1 = colorFilter;
                    }
                }
                colorFilter = q11Var.k1;
                imageReceiver.o1 = colorFilter;
            }
        }
        a11Var.getLocationOnScreen(iArr);
        rect.left = a11Var.getPaddingLeft() + iArr[0];
        rect.top = a11Var.getPaddingTop() + iArr[1];
        rect.right = (a11Var.getWidth() + iArr[0]) - a11Var.getPaddingRight();
        rect.bottom = (a11Var.getHeight() + iArr[1]) - a11Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.D = iArr[0];
        int i13 = iArr[1];
        this.E = i13;
        this.F = view.getHeight() + i13;
    }

    public static void a(m11 m11Var, Integer num) {
        Runnable runnable;
        g01 g01Var = (g01) m11Var;
        if (num != null && (runnable = g01Var.S.e.U1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(g01 g01Var, View view, WindowInsets windowInsets) {
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
        ofFloat.addUpdateListener(new gz0(this, 6));
        this.N.addListener(new z40(8, this, z9));
        if (z9) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.xq.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.xq.g);
        }
        this.N.start();
    }

    public final void d(final boolean z9, i11 i11Var, final i11 i11Var2, final boolean z10) {
        a11 a11Var = this.a;
        if (a11Var == null) {
            if (i11Var != null) {
                i11Var.run();
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
            a11Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z9 ? 1.0f : 0.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.k11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m11 m11Var = m11.this;
                m11Var.I = floatValue;
                org.telegram.messenger.g0.X1(m11Var.c, m11Var.d, floatValue, m11Var.e);
                m11Var.s.invalidate();
                boolean z11 = z9;
                if (!z11) {
                    m11Var.w.setAlpha(m11Var.I);
                }
                if (m11Var.I < 0.025f && !z11) {
                    if (z10) {
                        m11Var.a.b = false;
                        m11Var.P.h0.invalidate();
                    }
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 4);
                }
                if (m11Var.I >= 0.5f || z11 || (runnable = i11Var2) == null) {
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
        this.K.addListener(new l11(this, z9, i11Var2, zArr, z10, i11Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.xq.h);
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
            h01 h01Var = ((g01) this).S;
            q11 q11Var = h01Var.e;
            if (q11Var.o1 != null && h01Var.d != null) {
                rect.set(q11Var.p1);
                z9 = true;
                this.y = z9;
                int[] iArr = this.G;
                if (z9) {
                    a11 a11Var = this.a;
                    a11Var.getLocationOnScreen(iArr);
                    rect.left = a11Var.getPaddingLeft() + iArr[0];
                    rect.top = a11Var.getPaddingTop() + iArr[1];
                    rect.right = (a11Var.getWidth() + iArr[0]) - a11Var.getPaddingRight();
                    rect.bottom = (a11Var.getHeight() + iArr[1]) - a11Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new i11(this, num, 0), new i11(this, num, 1), !z9);
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
        d(false, new i11(this, num, 0), new i11(this, num, 1), !z9);
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
