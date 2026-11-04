package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a5 implements u5 {
    public static final a5 b = new a5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ a5(int i3) {
        this.a = i3;
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final d6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!c5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (d6) c5.k(cls.asSubclass(c5.class)).h(3, null);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return c5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
