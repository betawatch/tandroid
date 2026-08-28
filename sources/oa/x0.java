package oa;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x0 implements la.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ la.u c;

    public /* synthetic */ x0(Object obj, la.u uVar, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = uVar;
    }

    @Override // la.v
    public final la.u create(la.g gVar, sa.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.a == ((Class) this.b)) {
                    return this.c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.a;
                if (((Class) this.b).isAssignableFrom(cls)) {
                    return new c(this, cls);
                }
                return null;
            default:
                if (aVar.equals((sa.a) this.b)) {
                    return (FileLog.ByteArrayHexAdapter) this.c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Factory[type=" + ((Class) this.b).getName() + ",adapter=" + this.c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.b).getName() + ",adapter=" + this.c + "]";
            default:
                return super.toString();
        }
    }
}
