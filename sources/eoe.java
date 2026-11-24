// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eoe extends c2e {
    private static final eoe zzb;
    private int zzd;
    private a3e zze = pae.e;
    private String zzf = "";
    private boolean zzg;

    static {
        eoe eoeVar = new eoe();
        zzb = eoeVar;
        c2e.k(eoe.class, eoeVar);
    }

    public static /* synthetic */ void n(eoe eoeVar, boolean z) {
        eoeVar.zzd |= 2;
        eoeVar.zzg = z;
    }

    public static eoe o() {
        return zzb;
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", vne.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new eoe();
        }
        if (i2 == 4) {
            return new fne(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
