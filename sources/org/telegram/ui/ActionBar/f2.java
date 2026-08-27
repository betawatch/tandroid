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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f2 extends b2 {
    public static final int[] j1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int Z0;
    public int a1;
    public FrameLayout b1;
    public ViewGroup c1;
    public View d1;
    public DialogInterface.OnShowListener e1;
    public DialogInterface.OnDismissListener f1;
    public boolean g1;
    public long h1;
    public final p i1;

    public f2(Context context, int i10, c6 c6Var) {
        super(context, i10, c6Var);
        this.g1 = false;
        this.h1 = 0L;
        this.i1 = new p(this, 7);
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
        if (isShowing() && !this.g1) {
            this.g1 = true;
            AndroidUtilities.cancelRunOnUIThread(this.i1);
            if (this.b1.getVisibility() != 0) {
                s().removeView(this.b1);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.a1);
            loadAnimation.setAnimationListener(new d2(this, 0));
            this.c1.clearAnimation();
            this.c1.startAnimation(loadAnimation);
            this.d1.animate().setListener(null).cancel();
            this.d1.animate().setDuration(300L).alpha(0.0f).setListener(new c2(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (s().indexOfChild(this.b1) == -1 || this.g1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.h1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f1 = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.e1 = onShowListener;
    }

    @Override // org.telegram.ui.ActionBar.b2, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, j1);
        this.Z0 = obtainStyledAttributes.getResourceId(0, -1);
        this.a1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.d0 = true;
        ViewGroup f10 = f(false);
        this.c1 = f10;
        f10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.d1 = view;
        view.setBackgroundColor(g6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.d1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.c1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.b1 = frameLayout;
        s().addView(this.b1);
        FrameLayout frameLayout3 = this.b1;
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(frameLayout3);
        r0.b0.j(this.b1, new n(frameLayout2, 4));
        this.b1.setVisibility(4);
        long j10 = this.h1;
        p pVar = this.i1;
        if (j10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }
}
