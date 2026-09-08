package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
