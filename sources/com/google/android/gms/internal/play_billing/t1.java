package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class t1 implements l2 {
    public static final t1 b = new t1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ t1(int i10) {
        this.a = i10;
    }

    public static final j2 a(Object obj, Object obj2) {
        j2 j2Var = (j2) obj;
        j2 j2Var2 = (j2) obj2;
        if (!j2Var2.isEmpty()) {
            if (!j2Var.a) {
                if (j2Var.isEmpty()) {
                    j2Var = new j2();
                } else {
                    j2 j2Var3 = new j2(j2Var);
                    j2Var3.a = true;
                    j2Var = j2Var3;
                }
            }
            j2Var.b();
            if (!j2Var2.isEmpty()) {
                j2Var.putAll(j2Var2);
            }
        }
        return j2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public s2 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!v1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (s2) v1.h(cls.asSubclass(v1.class)).d(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return v1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
