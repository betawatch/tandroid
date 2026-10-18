package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class j implements f, Serializable {
    public final int a;

    public j(int i10) {
        this.a = i10;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.a;
    }

    public final String toString() {
        q.a.getClass();
        String a2 = r.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
