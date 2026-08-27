package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class y0 extends ViewGroup.MarginLayoutParams {
    public o1 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public y0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        o1 o1Var = this.a;
        if (o1Var == null) {
            return -1;
        }
        return o1Var.b();
    }

    public final int b() {
        o1 o1Var = this.a;
        if (o1Var == null) {
            return -1;
        }
        return o1Var.c();
    }

    public y0(int i10, int i11) {
        super(i10, i11);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public y0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public y0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public y0(y0 y0Var) {
        super((ViewGroup.LayoutParams) y0Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
