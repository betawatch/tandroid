package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class k implements g, Serializable {
    public final int a;

    public k(int i7) {
        this.a = i7;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.a;
    }

    public final String toString() {
        s.a.getClass();
        String a10 = t.a(this);
        j.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}
