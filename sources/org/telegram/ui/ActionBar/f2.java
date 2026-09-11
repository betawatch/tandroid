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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class f2 extends b2 {
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
    public final q m1;

    public f2(Context context, int i10, f6 f6Var) {
        super(context, i10, f6Var);
        this.k1 = false;
        this.l1 = 0L;
        this.m1 = new q(this, 7);
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

    @Override // org.telegram.ui.ActionBar.b2, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing() && !this.k1) {
            this.k1 = true;
            AndroidUtilities.cancelRunOnUIThread(this.m1);
            if (this.f1.getVisibility() != 0) {
                s().removeView(this.f1);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.e1);
            loadAnimation.setAnimationListener(new d2(this, 0));
            this.g1.clearAnimation();
            this.g1.startAnimation(loadAnimation);
            this.h1.animate().setListener(null).cancel();
            this.h1.animate().setDuration(300L).alpha(0.0f).setListener(new c2(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (s().indexOfChild(this.f1) == -1 || this.k1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void q(long j3) {
        if (isShowing()) {
            return;
        }
        this.l1 = j3;
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

    @Override // org.telegram.ui.ActionBar.b2, android.app.Dialog
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
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.h1 = view;
        view.setBackgroundColor(j6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.h1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.g1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f1 = frameLayout;
        s().addView(this.f1);
        FrameLayout frameLayout3 = this.f1;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(frameLayout3);
        r0.a0.j(this.f1, new n(frameLayout2, 4));
        this.f1.setVisibility(4);
        long j3 = this.l1;
        q qVar = this.m1;
        if (j3 == 0) {
            qVar.run();
        } else {
            AndroidUtilities.runOnUIThread(qVar, j3);
        }
    }
}
