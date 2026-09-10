package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g1 implements d2 {
    public static final g1 b = new g1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g1(int i10) {
        this.a = i10;
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
    public final m2 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!f1.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (m2) f1.d(cls.asSubclass(f1.class)).e(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
