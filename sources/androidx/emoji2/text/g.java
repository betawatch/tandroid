package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;
import s4.c0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

    public abstract void n(int i10);

    public g(k kVar) {
        this.a = 0;
        this.c = new d();
        this.b = kVar;
    }
}
