package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class w implements p0 {
    public static final w b = new w(0);
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i9) {
        this.a = i9;
    }

    @Override // com.google.android.gms.internal.clearcut.p0
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p0
    public final y0 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!z.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (y0) z.d(cls.asSubclass(z.class)).a(3);
                } catch (Exception e10) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
