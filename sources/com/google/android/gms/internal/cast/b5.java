package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b5 implements v5 {
    public static final b5 b = new b5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ b5(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.internal.cast.v5
    public final e6 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!d5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (e6) d5.k(cls.asSubclass(d5.class)).h(3, null);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.v5
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return d5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
