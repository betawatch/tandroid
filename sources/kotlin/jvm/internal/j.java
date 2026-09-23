package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
