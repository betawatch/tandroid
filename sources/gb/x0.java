package gb;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x0 implements db.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ db.u c;

    public /* synthetic */ x0(Object obj, db.u uVar, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = uVar;
    }

    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
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
                if (aVar.equals((kb.a) this.b)) {
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
