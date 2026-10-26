package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a5 implements u5 {
    public static final a5 b = new a5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ a5(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final d6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!c5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (d6) c5.k(cls.asSubclass(c5.class)).h(3, null);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return c5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
