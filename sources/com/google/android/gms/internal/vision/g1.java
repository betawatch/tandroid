package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g1 implements d2 {
    public static final g1 b = new g1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g1(int i3) {
        this.a = i3;
    }

    @Override // com.google.android.gms.internal.vision.d2
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return f1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.vision.d2
    public final l2 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!f1.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (l2) f1.d(cls.asSubclass(f1.class)).e(3);
                } catch (Exception e10) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
