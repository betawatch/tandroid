package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d5 implements x5 {
    public static final d5 b = new d5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ d5(int i10) {
        this.a = i10;
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
