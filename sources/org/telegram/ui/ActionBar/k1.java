package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class k1 extends PopupWindow {
    public static Method k;
    public static final Field l;
    public static final DecelerateInterpolator m = new DecelerateInterpolator();
    public static final c1 n;
    public AnimatorSet a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public long f;
    public boolean g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver i;
    public e2.f j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        l = field;
        n = new c1(0);
    }

    public k1(View view, int i10, int i11) {
        super(view, i10, i11);
        this.b = true;
        this.c = zs.g2;
        this.f = -1L;
        this.j = new e2.f(null);
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f7 = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.D;
        hashMap.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < itemsCount; i11++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
            if (!(childAt instanceof h1)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i10));
                    i10++;
                }
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.s = itemsCount - 1;
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout.s = 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
            f7 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bg.k(actionBarPopupWindow$ActionBarPopupWindowLayout, 16));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f7), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, zs.e4), ofFloat);
        animatorSet.setDuration((i10 * 16) + zs.g2);
        animatorSet.addListener(new bg.e(actionBarPopupWindow$ActionBarPopupWindowLayout, 19));
        animatorSet.start();
    }

    public final void b() {
        c(0.2f);
    }

    public final void c(float f7) {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f7;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    public void d(boolean z10) {
        ArrayList arrayList;
        long j10 = this.f;
        setFocusable(false);
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i10 = layoutParams.flags;
                if ((i10 & 2) != 0) {
                    layoutParams.flags = i10 & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }
        AnimatorSet animatorSet = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (z10 && this.d) {
                return;
            }
            animatorSet.cancel();
            this.a = null;
        }
        this.d = false;
        if (!this.b || !z10) {
            try {
                super.dismiss();
            } catch (Exception unused2) {
            }
            j();
            return;
        }
        int i11 = 1;
        this.d = true;
        ViewGroup viewGroup = (ViewGroup) getContentView();
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            if (viewGroup.getChildAt(i12) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i12);
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.y) != null && !arrayList.isEmpty()) {
            int size = actionBarPopupWindow$ActionBarPopupWindowLayout.y.size();
            for (int i13 = 0; i13 < size; i13++) {
                AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindow$ActionBarPopupWindowLayout.y.get(i13);
                animatorSet2.removeAllListeners();
                animatorSet2.cancel();
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.y.clear();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.a = animatorSet3;
        if (j10 > 0) {
            animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
            this.a.setDuration(j10);
        } else if (this.g) {
            animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
            this.a.setDuration(this.c);
        } else {
            animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, viewGroup.getTranslationY() + org.telegram.messenger.i0.L((actionBarPopupWindow$ActionBarPopupWindowLayout == null || !actionBarPopupWindow$ActionBarPopupWindowLayout.w) ? -5.0f : 5.0f)), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
            this.a.setDuration(this.c);
        }
        this.a.addListener(new e1(this, i11));
        if (this.e) {
            this.j.d();
        }
        this.a.start();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        d(true);
    }

    public final void e() {
        View contentView = getContentView();
        if (contentView instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) contentView;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                setTouchInterceptor(new d1(0, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
            }
        }
        Field field = l;
        if (field != null) {
            try {
                this.h = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, n);
            } catch (Exception unused) {
                this.h = null;
            }
        }
    }

    public final void f(View view) {
        if (this.h != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.i;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.i.removeOnScrollChangedListener(this.h);
                }
                this.i = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.h);
                }
            }
        }
    }

    public final void g() {
        try {
            if (k == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            k.invoke(this, Boolean.TRUE);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.b && this.a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            int i10 = 0;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    if (viewGroup.getChildAt(i11) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.n = true;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.D;
            float f7 = 1.0f;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
            hashMap.clear();
            int i12 = 0;
            for (int i13 = 0; i13 < itemsCount; i13++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i13);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i12));
                    i12++;
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f7 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f7), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, zs.e4));
            this.a.setDuration((i12 * 16) + zs.g2);
            this.a.addListener(new e1(this, i10));
            this.a.start();
        }
    }

    public final void j() {
        ViewTreeObserver viewTreeObserver;
        if (this.h == null || (viewTreeObserver = this.i) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.i.removeOnScrollChangedListener(this.h);
        }
        this.i = null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            f(view);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i10, int i11, int i12) {
        super.showAtLocation(view, i10, i11, i12);
        j();
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
        f(view);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i10, int i11) {
        super.update(view, i10, i11);
        f(view);
    }
}
