package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;
import s4.b0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class g {
    public int a;
    public final Object b;
    public final Object c;

    public g(b0 b0Var) {
        this.a = TLObject.FLAG_31;
        this.c = new Rect();
        this.b = b0Var;
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
