package org.telegram.ui.ActionBar;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b2 extends x1 {
    public static final int[] w1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int m1;
    public int n1;
    public FrameLayout o1;
    public ViewGroup p1;
    public View q1;
    public DialogInterface.OnShowListener r1;
    public DialogInterface.OnDismissListener s1;
    public boolean t1;
    public long u1;
    public final lg.s v1;

    public b2(int i10, Context context, p6 p6Var) {
        super(i10, context, p6Var);
        this.t1 = false;
        this.u1 = 0L;
        this.v1 = new lg.s(this, 20);
    }

    public static Activity t(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return t(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.x1, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing() && !this.t1) {
            this.t1 = true;
            org.telegram.messenger.i0.r(this.v1);
            if (this.o1.getVisibility() != 0) {
                u().removeView(this.o1);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.n1);
            loadAnimation.setAnimationListener(new androidx.mediarouter.app.g0(this, 1));
            this.p1.clearAnimation();
            this.p1.startAnimation(loadAnimation);
            this.q1.animate().setListener(null).cancel();
            this.q1.animate().setDuration(300L).alpha(0.0f).setListener(new z1(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (u().indexOfChild(this.o1) == -1 || this.t1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.x1
    public final void r(long j10) {
        if (isShowing()) {
            return;
        }
        this.u1 = j10;
        show();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.s1 = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.r1 = onShowListener;
    }

    @Override // org.telegram.ui.ActionBar.x1, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, w1);
        this.m1 = obtainStyledAttributes.getResourceId(0, -1);
        this.n1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.j0 = true;
        ViewGroup g10 = g(false);
        this.p1 = g10;
        g10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new ag.g(this, 17));
        View view = new View(getContext());
        this.q1 = view;
        view.setBackgroundColor(t6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.q1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.p1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.o1 = frameLayout;
        u().addView(this.o1);
        FrameLayout frameLayout3 = this.o1;
        WeakHashMap weakHashMap = r0.h0.a;
        r0.x.c(frameLayout3);
        r0.z.i(this.o1, new y1(0, frameLayout2));
        this.o1.setVisibility(4);
        long j10 = this.u1;
        lg.s sVar = this.v1;
        if (j10 == 0) {
            sVar.run();
        } else {
            org.telegram.messenger.i0.h3(sVar, j10);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
