package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d5 implements x5 {
    public static final d5 b = new d5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ d5(int i9) {
        this.a = i9;
    }

    @Override // com.google.android.gms.internal.cast.x5
    public final g6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!f5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (g6) f5.k(cls.asSubclass(f5.class)).h(3, null);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.x5
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return f5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
