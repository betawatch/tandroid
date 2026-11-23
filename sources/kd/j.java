package kd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
