package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
