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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x1 extends u1 {
    public static final int[] u1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int k1;
    public int l1;
    public FrameLayout m1;
    public ViewGroup n1;
    public View o1;
    public DialogInterface.OnShowListener p1;
    public DialogInterface.OnDismissListener q1;
    public boolean r1;
    public long s1;
    public final l2.w t1;

    public x1(int i7, Context context, f6 f6Var) {
        super(i7, context, f6Var);
        this.r1 = false;
        this.s1 = 0L;
        this.t1 = new l2.w(this, 21);
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
    @Override // org.telegram.ui.ActionBar.u1, android.app.Dialog, android.content.DialogInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dismiss() {
        Animation animation;
        if (isShowing() && !this.r1) {
            this.r1 = true;
            org.telegram.messenger.g0.r(this.t1);
            if (this.m1.getVisibility() != 0) {
                u().removeView(this.m1);
                return;
            }
            int i7 = this.l1;
            if (i7 != 0 && i7 != -1) {
                try {
                    animation = AnimationUtils.loadAnimation(getContext(), i7);
                } catch (Resources.NotFoundException e10) {
                    a8.g(e10, true);
                }
                this.n1.clearAnimation();
                if (animation == null) {
                    animation.setAnimationListener(new androidx.mediarouter.app.f0(this, 1));
                    this.n1.startAnimation(animation);
                } else {
                    this.n1.animate().cancel();
                    this.n1.animate().setDuration(300L).alpha(0.0f).start();
                }
                this.o1.animate().setListener(null).cancel();
                this.o1.animate().setDuration(300L).alpha(0.0f).setListener(new v1(this, 1)).start();
            }
            animation = null;
            this.n1.clearAnimation();
            if (animation == null) {
            }
            this.o1.animate().setListener(null).cancel();
            this.o1.animate().setDuration(300L).alpha(0.0f).setListener(new v1(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (u().indexOfChild(this.m1) == -1 || this.r1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void r(long j3) {
        if (isShowing()) {
            return;
        }
        this.s1 = j3;
        show();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.q1 = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.p1 = onShowListener;
    }

    @Override // org.telegram.ui.ActionBar.u1, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, u1);
        this.k1 = obtainStyledAttributes.getResourceId(0, -1);
        this.l1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.j0 = true;
        ViewGroup g10 = g(false);
        this.n1 = g10;
        g10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new ii.g(this, 14));
        View view = new View(getContext());
        this.o1 = view;
        view.setBackgroundColor(k6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.o1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.n1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.m1 = frameLayout;
        u().addView(this.m1);
        FrameLayout frameLayout3 = this.m1;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.m1, new bi.f(3, frameLayout2));
        this.m1.setVisibility(4);
        long j3 = this.s1;
        l2.w wVar = this.t1;
        if (j3 == 0) {
            wVar.run();
        } else {
            org.telegram.messenger.g0.i3(wVar, j3);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
