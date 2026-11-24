// default package

/* loaded from: classes.dex */
public final class ard implements ssd {
    public ssd[] a;

    @Override // ssd
    public final boolean zza(Class cls) {
        for (ssd ssdVar : this.a) {
            if (ssdVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // ssd
    public final iwd zzb(Class cls) {
        for (ssd ssdVar : this.a) {
            if (ssdVar.zza(cls)) {
                return ssdVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
