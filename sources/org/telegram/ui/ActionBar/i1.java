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
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class i1 {
    public static final xq w = mi.l.V;
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
    public final m.f3 h = new m.f3(this, 15);
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public final h2.f n = new h2.f((int[]) null);
    public final ArrayList o = new ArrayList();
    public final h1 t = new h1(this, 0);
    public final boolean u = true;

    public i1(FrameLayout frameLayout) {
        this.a = frameLayout;
        org.telegram.messenger.g0.h3(new l2.w(this, 19));
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
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(R.id.content);
        }
        View view2 = this.b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (!(view.getParent() instanceof n3)) {
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

    public abstract void e(float f10, float f11, boolean z9);

    public abstract void f();

    public abstract void g(int i7, boolean z9);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).getLayoutParams().height = i7;
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
        this.n.e();
        this.m = null;
        h(-1);
        this.o.clear();
        this.d.requestLayout();
        boolean z9 = this.s;
        e(0.0f, z9 ? 1.0f : 0.0f, z9);
        if (!(this instanceof ch.k)) {
            this.a.setTranslationY(0.0f);
        }
        f();
    }
}
