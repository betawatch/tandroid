package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
