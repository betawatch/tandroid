package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                } catch (Exception e7) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
