// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bhb {
    public static final bhb e = new bhb(false, new ygb(TLObject.FLAG_31, -2147483647), ehb.T, 0.0f);
    public final boolean a;
    public final ygb b;
    public final qgb c;
    public final float d;

    public bhb(boolean z, ygb ygbVar, qgb qgbVar, float f) {
        this.a = z;
        this.b = ygbVar;
        this.c = qgbVar;
        this.d = f;
    }

    public final qgb a(boolean z) {
        qgb qgbVar = ehb.T;
        qgb qgbVar2 = this.c;
        return qgbVar2 != qgbVar ? qgbVar2 : this.d == 0.0f ? z ? ehb.U : ehb.V : ehb.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bhb.class != obj.getClass()) {
            return false;
        }
        bhb bhbVar = (bhb) obj;
        return this.c.equals(bhbVar.c) && this.b.equals(bhbVar.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
