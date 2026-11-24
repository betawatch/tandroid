// default package

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ix2 implements u1e {
    public final /* synthetic */ byte a;
    public Object b;
    public volatile Object c;

    public ix2() {
        this.a = (byte) 0;
        this.b = new CopyOnWriteArraySet();
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                Object obj = (u1e) this.c;
                if (obj == jk2.f) {
                    obj = kt6.o("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return kt6.o("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // u1e
    public final Object zza() {
        u1e u1eVar = (u1e) this.c;
        jk2 jk2Var = jk2.f;
        if (u1eVar != jk2Var) {
            synchronized (this) {
                if (((u1e) this.c) != jk2Var) {
                    Object zza = ((u1e) this.c).zza();
                    this.b = zza;
                    this.c = jk2Var;
                    return zza;
                }
            }
        }
        return this.b;
    }

    public /* synthetic */ ix2(byte b) {
        this.a = b;
    }
}
