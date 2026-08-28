package org.telegram.ui.ActionBar;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class q1 {
    public static final gr w = rh.m.V;
    public final FrameLayout a;
    public FrameLayout b;
    public ViewGroup c;
    public View d;
    public boolean f;
    public boolean g;
    public View l;
    public ValueAnimator m;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public final AnimationNotificationsLocker n = new AnimationNotificationsLocker();
    public final ArrayList o = new ArrayList();
    public final p1 t = new p1(this);
    public final boolean u = true;

    public q1(FrameLayout frameLayout) {
        this.a = frameLayout;
        AndroidUtilities.runOnUIThread(new p(this, 4));
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return a(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public abstract boolean b();

    public final void c() {
        d();
        View view = this.a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(R.id.content);
        }
        View view2 = this.b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (!(view.getParent() instanceof x3)) {
                        if (!(view.getParent() instanceof View)) {
                            break;
                        } else {
                            view = (View) view.getParent();
                        }
                    } else {
                        view2 = view;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.d = view2;
        if (view2 != null) {
            this.l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.t);
            this.l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i9, boolean z10);

    public final void h(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).getLayoutParams().height = i9;
            ((View) arrayList.get(i10)).requestLayout();
            i10++;
        }
    }

    public int i() {
        return 0;
    }

    public final void j() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f = false;
        this.e = false;
        this.n.unlock();
        this.m = null;
        h(-1);
        this.o.clear();
        this.d.requestLayout();
        boolean z10 = this.s;
        e(0.0f, z10 ? 1.0f : 0.0f, z10);
        if (!(this instanceof hg.o)) {
            this.a.setTranslationY(0.0f);
        }
        f();
    }
}
