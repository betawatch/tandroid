package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import f2.m0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f {
    public int a;
    public final Object b;
    public final Object c;

    public f(m0 m0Var) {
        this.a = TLObject.FLAG_31;
        this.c = new Rect();
        this.b = m0Var;
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

    public abstract void n(int i9);

    public f(j jVar) {
        this.a = 0;
        this.c = new d();
        this.b = jVar;
    }
}
