// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h6f extends vef {
    private static final h6f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        h6f h6fVar = new h6f();
        zzb = h6fVar;
        vef.e(h6f.class, h6fVar);
    }

    public static f6f l() {
        return (f6f) zzb.j();
    }

    public static /* synthetic */ void m(h6f h6fVar, String str) {
        str.getClass();
        h6fVar.zzd |= 1;
        h6fVar.zze = str;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new h6f();
        }
        if (i2 == 4) {
            return new f6f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
