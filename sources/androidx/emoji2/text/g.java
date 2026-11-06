package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;
import v4.b0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public abstract void n(int i7);

    public g(k kVar) {
        this.a = 0;
        this.c = new d();
        this.b = kVar;
    }
}
