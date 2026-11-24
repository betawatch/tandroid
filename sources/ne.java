// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ne extends he {
    public static final int[] v1 = {R.attr.windowEnterAnimation, R.attr.windowExitAnimation};
    public int l1;
    public int m1;
    public FrameLayout n1;
    public ViewGroup o1;
    public View p1;
    public DialogInterface.OnShowListener q1;
    public DialogInterface.OnDismissListener r1;
    public boolean s1;
    public short t1;
    public final b1 u1;

    public ne(int i, ylb ylbVar, Context context) {
        super(i, ylbVar, context);
        this.s1 = false;
        this.t1 = (short) 0;
        this.u1 = new b1(this, (byte) 11);
    }

    public static Activity s(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return s(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // he, android.app.Dialog, android.content.DialogInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dismiss() {
        Animation animation;
        if (!isShowing() || this.s1) {
            return;
        }
        this.s1 = true;
        gm.r(this.u1);
        if (this.n1.getVisibility() != 0) {
            t().removeView(this.n1);
            return;
        }
        int i = this.m1;
        if (i != 0 && i != -1) {
            try {
                animation = AnimationUtils.loadAnimation(getContext(), i);
            } catch (Resources.NotFoundException e) {
                fc4.g(e, true);
            }
            this.o1.clearAnimation();
            if (animation == null) {
                animation.setAnimationListener(new le(this, (byte) 0));
                this.o1.startAnimation(animation);
            } else {
                this.o1.animate().cancel();
                this.o1.animate().setDuration(300L).alpha(0.0f).start();
            }
            this.p1.animate().setListener(null).cancel();
            this.p1.animate().setDuration(300L).alpha(0.0f).setListener(new ke(this, (byte) 1)).start();
        }
        animation = null;
        this.o1.clearAnimation();
        if (animation == null) {
        }
        this.p1.animate().setListener(null).cancel();
        this.p1.animate().setDuration(300L).alpha(0.0f).setListener(new ke(this, (byte) 1)).start();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return (t().indexOfChild(this.n1) == -1 || this.s1) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    @Override // he
    public final void q(long j) {
        if (isShowing()) {
            return;
        }
        this.t1 = (int) j;
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

    @Override // he, android.app.Dialog
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, v1);
        this.l1 = obtainStyledAttributes.getResourceId(0, -1);
        this.m1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.k0 = true;
        ViewGroup f = f(false);
        this.o1 = f;
        f.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new j1(this, (byte) 8));
        View view = new View(getContext());
        this.p1 = view;
        view.setBackgroundColor(cmb.p1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.p1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.o1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.n1 = frameLayout;
        t().addView(this.n1);
        FrameLayout frameLayout3 = this.n1;
        WeakHashMap weakHashMap = kfc.a;
        afc.c(frameLayout3);
        cfc.i(this.n1, new je(frameLayout2, (byte) 0));
        this.n1.setVisibility(4);
        long j = this.t1;
        b1 b1Var = this.u1;
        if (j == 0) {
            b1Var.run();
        } else {
            gm.d3(b1Var, j);
        }
    }

    public final ViewGroup t() {
        return (ViewGroup) s(getContext()).getWindow().getDecorView();
    }
}
