package kd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
