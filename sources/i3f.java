// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i3f extends vef {
    private static final i3f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        i3f i3fVar = new i3f();
        zzb = i3fVar;
        vef.e(i3f.class, i3fVar);
    }

    public static f3f l() {
        return (f3f) zzb.j();
    }

    public static /* synthetic */ void m(i3f i3fVar, String str) {
        str.getClass();
        i3fVar.zzd |= 1;
        i3fVar.zze = str;
    }

    public static /* synthetic */ void n(i3f i3fVar, String str) {
        str.getClass();
        i3fVar.zzd |= 2;
        i3fVar.zzf = str;
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
            return new i3f();
        }
        if (i2 == 4) {
            return new f3f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
