// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class agf implements dgf {
    public final dgf[] a;

    public agf(dgf... dgfVarArr) {
        this.a = dgfVarArr;
    }

    @Override // dgf
    public final sgf zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            dgf dgfVar = this.a[i];
            if (dgfVar.zzc(cls)) {
                return dgfVar.zzb(cls);
            }
        }
        fyb.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // dgf
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
