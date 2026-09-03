package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class x0 extends ViewGroup.MarginLayoutParams {
    public m1 a;
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
        m1 m1Var = this.a;
        if (m1Var == null) {
            return -1;
        }
        return m1Var.b();
    }

    public final int b() {
        m1 m1Var = this.a;
        if (m1Var == null) {
            return -1;
        }
        return m1Var.c();
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
