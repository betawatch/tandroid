// default package

/* loaded from: classes.dex */
public final class ntd implements fvd {
    public fvd[] a;

    @Override // fvd
    public final boolean zza(Class cls) {
        for (fvd fvdVar : this.a) {
            if (fvdVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // fvd
    public final vyd zzb(Class cls) {
        for (fvd fvdVar : this.a) {
            if (fvdVar.zza(cls)) {
                return fvdVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
