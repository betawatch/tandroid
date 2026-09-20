package kd;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class j extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public j(int i10, id.c cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // kd.a
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
