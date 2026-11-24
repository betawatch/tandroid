// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b8f extends vef {
    private static final b8f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        b8f b8fVar = new b8f();
        zzb = b8fVar;
        vef.e(b8f.class, b8fVar);
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", pd5.s, "zzf", "zzg", cff.F});
        }
        if (i2 == 3) {
            return new b8f();
        }
        if (i2 == 4) {
            return new v8e(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = vefVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
