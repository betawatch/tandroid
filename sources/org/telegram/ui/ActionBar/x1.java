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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x1 extends u1 {
    public static final int[] v1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int l1;
    public int m1;
    public FrameLayout n1;
    public ViewGroup o1;
    public View p1;
    public DialogInterface.OnShowListener q1;
    public DialogInterface.OnDismissListener r1;
    public boolean s1;
    public long t1;
    public final oi.a2 u1;

    public x1(int i7, Context context, i6 i6Var) {
        super(i7, context, i6Var);
        this.s1 = false;
        this.t1 = 0L;
        this.u1 = new oi.a2(this, 7);
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
        if (isShowing() && !this.s1) {
            this.s1 = true;
            org.telegram.messenger.g0.r(this.u1);
            if (this.n1.getVisibility() != 0) {
                u().removeView(this.n1);
                return;
            }
            int i7 = this.m1;
            if (i7 != 0 && i7 != -1) {
                try {
                    animation = AnimationUtils.loadAnimation(getContext(), i7);
                } catch (Resources.NotFoundException e10) {
                    a8.g(e10, true);
                }
                this.o1.clearAnimation();
                if (animation == null) {
                    animation.setAnimationListener(new androidx.mediarouter.app.f0(this, 1));
                    this.o1.startAnimation(animation);
                } else {
                    this.o1.animate().cancel();
                    this.o1.animate().setDuration(300L).alpha(0.0f).start();
                }
                this.p1.animate().setListener(null).cancel();
                this.p1.animate().setDuration(300L).alpha(0.0f).setListener(new v1(this, 1)).start();
            }
            animation = null;
            this.o1.clearAnimation();
            if (animation == null) {
            }
            this.p1.animate().setListener(null).cancel();
            this.p1.animate().setDuration(300L).alpha(0.0f).setListener(new v1(this, 1)).start();
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (u().indexOfChild(this.n1) == -1 || this.s1) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void r(long j3) {
        if (isShowing()) {
            return;
        }
        this.t1 = j3;
        show();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.r1 = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.q1 = onShowListener;
    }

    @Override // org.telegram.ui.ActionBar.u1, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, v1);
        this.l1 = obtainStyledAttributes.getResourceId(0, -1);
        this.m1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.k0 = true;
        ViewGroup g10 = g(false);
        this.o1 = g10;
        g10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new hi.o0(this, 22));
        View view = new View(getContext());
        this.p1 = view;
        view.setBackgroundColor(n6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.p1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.o1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.n1 = frameLayout;
        u().addView(this.n1);
        FrameLayout frameLayout3 = this.n1;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.n1, new di.e(3, frameLayout2));
        this.n1.setVisibility(4);
        long j3 = this.t1;
        oi.a2 a2Var = this.u1;
        if (j3 == 0) {
            a2Var.run();
        } else {
            org.telegram.messenger.g0.h3(a2Var, j3);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
