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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i2 extends e2 {
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
    public final q v1;

    public i2(Context context, int i10, u6 u6Var) {
        super(context, i10, u6Var);
        this.t1 = false;
        this.u1 = 0L;
        this.v1 = new q(this, 7);
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

    @Override // org.telegram.ui.ActionBar.e2, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing() && !this.t1) {
            this.t1 = true;
            AndroidUtilities.cancelRunOnUIThread(this.v1);
            if (this.o1.getVisibility() != 0) {
                u().removeView(this.o1);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.n1);
            loadAnimation.setAnimationListener(new g2(this, 0));
            this.p1.clearAnimation();
            this.p1.startAnimation(loadAnimation);
            this.q1.animate().setListener(null).cancel();
            this.q1.animate().setDuration(300L).alpha(0.0f).setListener(new f2(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (u().indexOfChild(this.o1) == -1 || this.t1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, w1);
        this.m1 = obtainStyledAttributes.getResourceId(0, -1);
        this.n1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.j0 = true;
        ViewGroup g7 = g(false);
        this.p1 = g7;
        g7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.q1 = view;
        view.setBackgroundColor(y6.o1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.q1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.p1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.o1 = frameLayout;
        u().addView(this.o1);
        FrameLayout frameLayout3 = this.o1;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.o1, new p(frameLayout2, 3));
        this.o1.setVisibility(4);
        long j10 = this.u1;
        q qVar = this.v1;
        if (j10 == 0) {
            qVar.run();
        } else {
            AndroidUtilities.runOnUIThread(qVar, j10);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
