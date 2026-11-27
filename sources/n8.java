// default package

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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class n8 extends PopupWindow {
    public static Method k;
    public static final Field l;
    public static final DecelerateInterpolator m = new DecelerateInterpolator();
    public static final f8 n;
    public AnimatorSet a;
    public boolean b;
    public short c;
    public boolean d;
    public boolean e;
    public long f;
    public boolean g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver i;
    public pn j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        l = field;
        n = new f8();
    }

    public n8(View view, int i, int i2) {
        super(view, i, i2);
        this.b = true;
        this.c = (short) 150;
        this.f = -1L;
        this.j = new pn(null);
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.E;
        hashMap.clear();
        int i = 0;
        for (int i2 = 0; i2 < itemsCount; i2++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2);
            if (!(childAt instanceof k8)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i));
                    i++;
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
            f = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        byte b = 3;
        ofFloat.addUpdateListener(new g0(actionBarPopupWindow$ActionBarPopupWindowLayout, b));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, jn7.d4), ofFloat);
        animatorSet.setDuration((i << 4) + jn7.f2);
        animatorSet.addListener(new h0(actionBarPopupWindow$ActionBarPopupWindowLayout, b));
        animatorSet.start();
    }

    public final void b() {
        c(0.2f);
    }

    public final void c(float f) {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    public void d(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j = this.f;
        setFocusable(false);
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i = layoutParams.flags;
                if ((i & 2) != 0) {
                    layoutParams.flags = i & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }
        AnimatorSet animatorSet = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (z && this.d) {
                return;
            }
            animatorSet.cancel();
            this.a = null;
        }
        this.d = false;
        if (!this.b || !z) {
            try {
                super.dismiss();
            } catch (Exception unused2) {
            }
            j();
            return;
        }
        byte b = 1;
        this.d = true;
        ViewGroup viewGroup = (ViewGroup) getContentView();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (viewGroup.getChildAt(i2) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i2);
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.y) != null && !arrayList.isEmpty()) {
            int size = actionBarPopupWindow$ActionBarPopupWindowLayout.y.size();
            int i3 = 0;
            while (true) {
                arrayList2 = actionBarPopupWindow$ActionBarPopupWindowLayout.y;
                if (i3 >= size) {
                    break;
                }
                AnimatorSet animatorSet2 = (AnimatorSet) arrayList2.get(i3);
                animatorSet2.removeAllListeners();
                animatorSet2.cancel();
                i3++;
            }
            arrayList2.clear();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.a = animatorSet3;
        if (j > 0) {
            animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
            this.a.setDuration(j);
        } else if (this.g) {
            animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
            this.a.setDuration(this.c);
        } else {
            animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, viewGroup.getTranslationY() + hl.L((actionBarPopupWindow$ActionBarPopupWindowLayout == null || !actionBarPopupWindow$ActionBarPopupWindowLayout.w) ? -5.0f : 5.0f)), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
            this.a.setDuration(this.c);
        }
        this.a.addListener(new h8(this, b));
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
                setTouchInterceptor(new g8(this, actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0));
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
            cc4.g(e, true);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.b && this.a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            byte b = 0;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.n = true;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.E;
            float f = 1.0f;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
            hashMap.clear();
            int i2 = 0;
            for (int i3 = 0; i3 < itemsCount; i3++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i2));
                    i2++;
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, jn7.d4));
            this.a.setDuration((i2 << 4) + jn7.f2);
            this.a.addListener(new h8(this, b));
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
    public final void showAsDropDown(View view, int i, int i2) {
        try {
            super.showAsDropDown(view, i, i2);
            f(view);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        j();
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        f(view);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2) {
        super.update(view, i, i2);
        f(view);
    }
}
