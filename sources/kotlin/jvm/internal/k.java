package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class k implements g, Serializable {
    public final int a;

    public k(int i10) {
        this.a = i10;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.a;
    }

    public final String toString() {
        r.a.getClass();
        String a2 = s.a(this);
        j.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
