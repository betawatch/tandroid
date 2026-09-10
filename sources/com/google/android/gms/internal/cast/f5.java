package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f5 implements z5 {
    public static final f5 b = new f5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ f5(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.internal.cast.z5
    public final i6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!h5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (i6) h5.k(cls.asSubclass(h5.class)).h(3, null);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.z5
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return h5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
