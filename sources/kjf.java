// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class kjf implements Cloneable {
    public final ljf a;
    public ljf b;

    public kjf(ljf ljfVar) {
        this.a = ljfVar;
        if (ljfVar.g()) {
            lq5.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (ljf) ljfVar.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ljf a() {
        ljf b = b();
        byte byteValue = ((Byte) b.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f = glf.c.a(b.getClass()).f(b);
                b.h(2, true == f ? b : null);
            }
            throw new zp2("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b;
    }

    public final ljf b() {
        boolean g = this.b.g();
        ljf ljfVar = this.b;
        if (!g) {
            return ljfVar;
        }
        ljfVar.getClass();
        glf.c.a(ljfVar.getClass()).a(ljfVar);
        ljfVar.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        ljf ljfVar = (ljf) this.a.h(4, null);
        glf.c.a(ljfVar.getClass()).c(ljfVar, this.b);
        this.b = ljfVar;
    }

    public final Object clone() {
        kjf kjfVar = (kjf) this.a.h(5, null);
        kjfVar.b = b();
        return kjfVar;
    }
}
