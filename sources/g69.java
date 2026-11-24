// default package

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class g69 extends ViewGroup.MarginLayoutParams {
    public u69 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public g69(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        u69 u69Var = this.a;
        if (u69Var == null) {
            return -1;
        }
        return u69Var.b();
    }

    public final int b() {
        u69 u69Var = this.a;
        if (u69Var == null) {
            return -1;
        }
        return u69Var.c();
    }

    public g69(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public g69(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public g69(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public g69(g69 g69Var) {
        super((ViewGroup.LayoutParams) g69Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
