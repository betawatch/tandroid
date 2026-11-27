// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class moe extends s6e {
    private static final moe zzb;

    static {
        moe moeVar = new moe();
        zzb = moeVar;
        s6e.k(moe.class, moeVar);
    }

    public static moe n() {
        return zzb;
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new moe();
        }
        if (i2 == 4) {
            return new utd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
