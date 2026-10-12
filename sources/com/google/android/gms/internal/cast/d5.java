package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d5 implements x5 {
    public static final d5 b = new d5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ d5(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.internal.cast.x5
    public final h6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!f5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (h6) f5.k(cls.asSubclass(f5.class)).h(3, null);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
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
