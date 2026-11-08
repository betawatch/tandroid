package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class z4 implements t5 {
    public static final z4 b = new z4(0);
    public final /* synthetic */ int a;

    public /* synthetic */ z4(int i7) {
        this.a = i7;
    }

    @Override // com.google.android.gms.internal.cast.t5
    public final c6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!b5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (c6) b5.k(cls.asSubclass(b5.class)).h(3, null);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.t5
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return b5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
