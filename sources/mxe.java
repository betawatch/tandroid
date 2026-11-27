// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
