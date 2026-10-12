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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e2 extends a2 {
    public static final int[] n1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int d1;
    public int e1;
    public FrameLayout f1;
    public ViewGroup g1;
    public View h1;
    public DialogInterface.OnShowListener i1;
    public DialogInterface.OnDismissListener j1;
    public boolean k1;
    public long l1;
    public final p m1;

    public e2(Context context, int i10, c6 c6Var) {
        super(context, i10, c6Var);
        this.k1 = false;
        this.l1 = 0L;
        this.m1 = new p(this, 7);
    }

    public static Activity r(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return r(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.a2, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing() && !this.k1) {
            this.k1 = true;
            AndroidUtilities.cancelRunOnUIThread(this.m1);
            if (this.f1.getVisibility() != 0) {
                s().removeView(this.f1);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.e1);
            loadAnimation.setAnimationListener(new c2(this, 0));
            this.g1.clearAnimation();
            this.g1.startAnimation(loadAnimation);
            this.h1.animate().setListener(null).cancel();
            this.h1.animate().setDuration(300L).alpha(0.0f).setListener(new b2(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (s().indexOfChild(this.f1) == -1 || this.k1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.l1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.j1 = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.i1 = onShowListener;
    }

    @Override // org.telegram.ui.ActionBar.a2, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, n1);
        this.d1 = obtainStyledAttributes.getResourceId(0, -1);
        this.e1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.h0 = true;
        ViewGroup f7 = f(false);
        this.g1 = f7;
        f7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new w(this, 1));
        View view = new View(getContext());
        this.h1 = view;
        view.setBackgroundColor(g6.m1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.h1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.g1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f1 = frameLayout;
        s().addView(this.f1);
        FrameLayout frameLayout3 = this.f1;
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(frameLayout3);
        r0.b0.i(this.f1, new n(frameLayout2, 4));
        this.f1.setVisibility(4);
        long j10 = this.l1;
        p pVar = this.m1;
        if (j10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }
}
