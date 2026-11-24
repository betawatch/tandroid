// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
