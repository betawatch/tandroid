// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
