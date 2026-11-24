// default package

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class gb {
    public static final s33 w = la2.V;
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
    public final o1 h = new o1(this, 2);
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public final on n = new on(null);
    public final ArrayList o = new ArrayList();
    public final fb t = new fb(this, 0);
    public final boolean u = true;

    public gb(FrameLayout frameLayout) {
        this.a = frameLayout;
        gl.c3(new b1(this, (byte) 7));
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
        Activity a = a(view.getContext());
        if (a != null) {
            this.c = (ViewGroup) ((ViewGroup) a.getWindow().getDecorView()).findViewById(R.id.content);
        }
        View view2 = this.b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (!(view.getParent() instanceof mq3)) {
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

    public abstract void e(float f, float f2, boolean z);

    public abstract void g(int i, boolean z);

    public final void h(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i2)).getLayoutParams().height = i;
            ((View) arrayList.get(i2)).requestLayout();
            i2++;
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
        boolean z = this.s;
        e(0.0f, z ? 1.0f : 0.0f, z);
        if (!(this instanceof y72)) {
            this.a.setTranslationY(0.0f);
        }
        f();
    }

    public void f() {
    }
}
