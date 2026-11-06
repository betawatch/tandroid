package kd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class i extends h implements kotlin.jvm.internal.g {
    public final int a;

    public i(int i7, id.c cVar) {
        super(cVar);
        this.a = i7;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.a;
    }

    @Override // kd.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.a.getClass();
        String a10 = t.a(this);
        kotlin.jvm.internal.j.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}
