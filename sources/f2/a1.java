package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a1 extends ViewGroup.MarginLayoutParams {
    public q1 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        q1 q1Var = this.a;
        if (q1Var == null) {
            return -1;
        }
        return q1Var.b();
    }

    public final int b() {
        q1 q1Var = this.a;
        if (q1Var == null) {
            return -1;
        }
        return q1Var.c();
    }

    public a1(int i9, int i10) {
        super(i9, i10);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public a1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public a1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public a1(a1 a1Var) {
        super((ViewGroup.LayoutParams) a1Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
