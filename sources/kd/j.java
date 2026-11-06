package kd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class j extends c implements kotlin.jvm.internal.g {
    private final int arity;

    public j(int i7, id.c cVar) {
        super(cVar);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    @Override // kd.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.a.getClass();
        String a10 = t.a(this);
        kotlin.jvm.internal.j.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}
