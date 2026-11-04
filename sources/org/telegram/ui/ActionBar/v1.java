package org.telegram.ui.ActionBar;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
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
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v1 extends s1 {
    public static final int[] x1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int n1;
    public int o1;
    public FrameLayout p1;
    public ViewGroup q1;
    public View r1;
    public DialogInterface.OnShowListener s1;
    public DialogInterface.OnDismissListener t1;
    public boolean u1;
    public long v1;
    public final lg.n w1;

    public v1(int i3, Context context, e6 e6Var) {
        super(i3, context, e6Var);
        this.u1 = false;
        this.v1 = 0L;
        this.w1 = new lg.n(this, 24);
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // org.telegram.ui.ActionBar.s1, android.app.Dialog, android.content.DialogInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dismiss() {
        Animation animation;
        if (isShowing() && !this.u1) {
            this.u1 = true;
            org.telegram.messenger.g0.r(this.w1);
            if (this.p1.getVisibility() != 0) {
                u().removeView(this.p1);
                return;
            }
            int i3 = this.o1;
            if (i3 != 0 && i3 != -1) {
                try {
                    animation = AnimationUtils.loadAnimation(getContext(), i3);
                } catch (Resources.NotFoundException e10) {
                    a8.g(e10, true);
                }
                this.q1.clearAnimation();
                if (animation == null) {
                    animation.setAnimationListener(new androidx.mediarouter.app.g0(this, 1));
                    this.q1.startAnimation(animation);
                } else {
                    this.q1.animate().cancel();
                    this.q1.animate().setDuration(300L).alpha(0.0f).start();
                }
                this.r1.animate().setListener(null).cancel();
                this.r1.animate().setDuration(300L).alpha(0.0f).setListener(new t1(this, 1)).start();
            }
            animation = null;
            this.q1.clearAnimation();
            if (animation == null) {
            }
            this.r1.animate().setListener(null).cancel();
            this.r1.animate().setDuration(300L).alpha(0.0f).setListener(new t1(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (u().indexOfChild(this.p1) == -1 || this.u1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.s1
    public final void r(long j10) {
        if (isShowing()) {
            return;
        }
        this.v1 = j10;
        show();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.t1 = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.s1 = onShowListener;
    }

    @Override // org.telegram.ui.ActionBar.s1, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, x1);
        this.n1 = obtainStyledAttributes.getResourceId(0, -1);
        this.o1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.k0 = true;
        ViewGroup g7 = g(false);
        this.q1 = g7;
        g7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new ii.m(this, 17));
        View view = new View(getContext());
        this.r1 = view;
        view.setBackgroundColor(k6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.r1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.q1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.p1 = frameLayout;
        u().addView(this.p1);
        FrameLayout frameLayout3 = this.p1;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.p1, new ci.f(3, frameLayout2));
        this.p1.setVisibility(4);
        long j10 = this.v1;
        lg.n nVar = this.w1;
        if (j10 == 0) {
            nVar.run();
        } else {
            org.telegram.messenger.g0.i3(nVar, j10);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
