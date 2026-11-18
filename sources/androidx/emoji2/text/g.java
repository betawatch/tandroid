package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;
import v4.c0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class g {
    public int a;
    public final Object b;
    public final Object c;

    public g(c0 c0Var) {
        this.a = TLObject.FLAG_31;
        this.c = new Rect();
        this.b = c0Var;
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

    public abstract void n(int i7);

    public g(k kVar) {
        this.a = 0;
        this.c = new d();
        this.b = kVar;
    }
}
