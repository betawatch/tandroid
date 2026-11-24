// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class kwc {
    public final ovc a;
    public final lwc[] b;
    public final double c;
    public final int d;
    public final int e;
    public final int f;
    public final rwc g;
    public final boolean h;
    public final boolean i;

    public kwc(ovc ovcVar, lwc[] lwcVarArr, double d, int i, int i2, float f, float f2, int i3, int i4, int i5, rwc rwcVar, boolean z, boolean z2) {
        this.g = rwcVar;
        this.h = z;
        this.i = z2;
        this.a = ovcVar;
        this.b = lwcVarArr;
        this.c = d;
        this.d = i;
        this.e = i2;
        this.f = i5;
    }

    public final boolean a() {
        if (this.a.e()) {
            for (lwc lwcVar : this.b) {
                if (lwcVar.a.e()) {
                }
            }
            return true;
        }
        return false;
    }
}
