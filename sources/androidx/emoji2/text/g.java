package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;
import s4.a0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class g {
    public int a;
    public final Object b;
    public final Object c;

    public g(a0 a0Var) {
        this.a = TLObject.FLAG_31;
        this.c = new Rect();
        this.b = a0Var;
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public abstract void n(int i10);

    public g(k kVar) {
        this.a = 0;
        this.c = new d();
        this.b = kVar;
    }
}
