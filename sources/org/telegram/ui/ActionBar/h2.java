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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h2 extends d2 {
    public static final int[] k1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int a1;
    public int b1;
    public FrameLayout c1;
    public ViewGroup d1;
    public View e1;
    public DialogInterface.OnShowListener f1;
    public DialogInterface.OnDismissListener g1;
    public boolean h1;
    public long i1;
    public final p j1;

    public h2(Context context, int i10, f6 f6Var) {
        super(context, i10, f6Var);
        this.h1 = false;
        this.i1 = 0L;
        this.j1 = new p(this, 7);
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

    @Override // org.telegram.ui.ActionBar.d2, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing() && !this.h1) {
            this.h1 = true;
            AndroidUtilities.cancelRunOnUIThread(this.j1);
            if (this.c1.getVisibility() != 0) {
                s().removeView(this.c1);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.b1);
            loadAnimation.setAnimationListener(new f2(this, 0));
            this.d1.clearAnimation();
            this.d1.startAnimation(loadAnimation);
            this.e1.animate().setListener(null).cancel();
            this.e1.animate().setDuration(300L).alpha(0.0f).setListener(new e2(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (s().indexOfChild(this.c1) == -1 || this.h1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.i1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.g1 = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f1 = onShowListener;
    }

    @Override // org.telegram.ui.ActionBar.d2, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, k1);
        this.a1 = obtainStyledAttributes.getResourceId(0, -1);
        this.b1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.e0 = true;
        ViewGroup f10 = f(false);
        this.d1 = f10;
        f10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.e1 = view;
        view.setBackgroundColor(j6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.e1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.d1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.c1 = frameLayout;
        s().addView(this.c1);
        FrameLayout frameLayout3 = this.c1;
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(frameLayout3);
        r0.b0.j(this.c1, new n(frameLayout2, 4));
        this.c1.setVisibility(4);
        long j10 = this.i1;
        p pVar = this.j1;
        if (j10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }
}
