package ed;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class j extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public j(int i10, cd.c cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // ed.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.a.getClass();
        String a2 = r.a(this);
        kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
