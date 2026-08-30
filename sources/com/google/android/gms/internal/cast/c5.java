package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c5 implements w5 {
    public static final c5 b = new c5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ c5(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.internal.cast.w5
    public final f6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!e5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (f6) e5.k(cls.asSubclass(e5.class)).h(3, null);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.w5
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return e5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
