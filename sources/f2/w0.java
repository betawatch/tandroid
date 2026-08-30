package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class w0 extends ViewGroup.MarginLayoutParams {
    public l1 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        l1 l1Var = this.a;
        if (l1Var == null) {
            return -1;
        }
        return l1Var.b();
    }

    public final int b() {
        l1 l1Var = this.a;
        if (l1Var == null) {
            return -1;
        }
        return l1Var.c();
    }

    public w0(int i10, int i11) {
        super(i10, i11);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public w0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public w0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public w0(w0 w0Var) {
        super((ViewGroup.LayoutParams) w0Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
