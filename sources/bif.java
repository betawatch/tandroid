// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bif implements eif {
    public final eif[] a;

    public bif(eif... eifVarArr) {
        this.a = eifVarArr;
    }

    @Override // eif
    public final tif zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            eif eifVar = this.a[i];
            if (eifVar.zzc(cls)) {
                return eifVar.zzb(cls);
            }
        }
        rjb.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // eif
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
