// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b7f extends vef {
    private static final b7f zzb;
    private int zzd;
    private int zze;

    static {
        b7f b7fVar = new b7f();
        zzb = b7fVar;
        vef.e(b7f.class, b7fVar);
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", i2f.s});
        }
        if (i2 == 3) {
            return new b7f();
        }
        if (i2 == 4) {
            return new v8e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
