package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class v implements o0 {
    public static final v b = new v(0);
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.o0
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return y.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.o0
    public final x0 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!y.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (x0) y.d(cls.asSubclass(y.class)).a(3);
                } catch (Exception e7) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
