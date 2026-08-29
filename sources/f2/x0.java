package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class x0 extends ViewGroup.MarginLayoutParams {
    public n1 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public x0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        n1 n1Var = this.a;
        if (n1Var == null) {
            return -1;
        }
        return n1Var.b();
    }

    public final int b() {
        n1 n1Var = this.a;
        if (n1Var == null) {
            return -1;
        }
        return n1Var.c();
    }

    public x0(int i10, int i11) {
        super(i10, i11);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public x0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public x0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public x0(x0 x0Var) {
        super((ViewGroup.LayoutParams) x0Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
