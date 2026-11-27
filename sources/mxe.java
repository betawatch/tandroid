// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class mxe implements uye {
    public uye[] a;

    @Override // uye
    public final boolean zza(Class cls) {
        for (uye uyeVar : this.a) {
            if (uyeVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // uye
    public final j1f zzb(Class cls) {
        for (uye uyeVar : this.a) {
            if (uyeVar.zza(cls)) {
                return uyeVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
