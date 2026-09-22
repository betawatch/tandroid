package kd;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class i extends h implements kotlin.jvm.internal.f {
    public final int a;

    public i(id.c cVar) {
        super(cVar);
        this.a = 2;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.a;
    }

    @Override // kd.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.a.getClass();
        String a2 = r.a(this);
        kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
