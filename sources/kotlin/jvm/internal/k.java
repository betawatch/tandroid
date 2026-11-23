package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
