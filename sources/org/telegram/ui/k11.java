package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class k11 extends PopupWindow {
    public static final Field c;
    public static final org.telegram.ui.ActionBar.a1 d = new org.telegram.ui.ActionBar.a1(2);
    public final ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        c = field;
    }

    public k11(t11 t11Var) {
        super(t11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = c;
        if (field != null) {
            try {
                this.a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.a = null;
            }
        }
    }

    public final void b() {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    public final void c(View view) {
        if (getContentView() instanceof t11) {
            ((t11) getContentView()).s(new j11(this, 1));
        }
        if (this.a != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.b.removeOnScrollChangedListener(this.a);
                }
                this.b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.a);
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (!(getContentView() instanceof t11)) {
            super.dismiss();
            return;
        }
        t11 t11Var = (t11) getContentView();
        j11 j11Var = new j11(this, 0);
        Integer num = t11Var.Z1;
        if (num != null) {
            t11.d2.put(num, t11Var.r0.e0());
        }
        ValueAnimator valueAnimator = t11Var.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            t11Var.W1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        t11Var.W1 = ofFloat;
        ofFloat.addUpdateListener(new wz0(t11Var, 3));
        t11Var.W1.addListener(new org.telegram.ui.Components.v50(15, t11Var, j11Var));
        t11Var.W1.setDuration(200L);
        t11Var.W1.setInterpolator(org.telegram.ui.Components.wq.h);
        t11Var.W1.start();
        l01 l01Var = t11Var.f0;
        if (l01Var != null) {
            org.telegram.messenger.g0.v1(l01Var.h);
        }
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        try {
            int i7 = layoutParams.flags;
            if ((i7 & 2) != 0) {
                layoutParams.flags = i7 & (-3);
                layoutParams.dimAmount = 0.0f;
                windowManager.updateViewLayout(rootView, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        c(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i7, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i7, i10, i11);
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i7, int i10) {
        super.showAsDropDown(view, i7, i10);
        c(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i7, int i10, int i11) {
        super.showAsDropDown(view, i7, i10, i11);
        c(view);
    }
}
