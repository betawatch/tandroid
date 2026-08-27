package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s1 implements k2 {
    public static final s1 b = new s1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ s1(int i10) {
        this.a = i10;
    }

    public static final i2 a(Object obj, Object obj2) {
        i2 i2Var = (i2) obj;
        i2 i2Var2 = (i2) obj2;
        if (!i2Var2.isEmpty()) {
            if (!i2Var.a) {
                if (i2Var.isEmpty()) {
                    i2Var = new i2();
                } else {
                    i2 i2Var3 = new i2(i2Var);
                    i2Var3.a = true;
                    i2Var = i2Var3;
                }
            }
            i2Var.b();
            if (!i2Var2.isEmpty()) {
                i2Var.putAll(i2Var2);
            }
        }
        return i2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public r2 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!u1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (r2) u1.h(cls.asSubclass(u1.class)).d(3);
                } catch (Exception e9) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e9);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return u1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
