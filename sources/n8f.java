// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n8f extends vef {
    private static final n8f zzb;
    private int zzd;
    private long zze;
    private bff zzf;
    private bff zzg;

    static {
        n8f n8fVar = new n8f();
        zzb = n8fVar;
        vef.e(n8f.class, n8fVar);
    }

    public n8f() {
        zff zffVar = zff.d;
        this.zzf = zffVar;
        this.zzg = zffVar;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new n8f();
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
