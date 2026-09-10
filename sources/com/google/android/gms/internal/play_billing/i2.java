package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i2 implements l2 {
    public static final t1 b = new t1(4);
    public final Object a;

    public i2(l2... l2VarArr) {
        this.a = l2VarArr;
    }

    public void a(int i10, Object obj, t2 t2Var) {
        m1 m1Var = (m1) this.a;
        m1Var.m(i10, 3);
        t2Var.c((e1) obj, m1Var.a);
        m1Var.m(i10, 4);
    }

    public void b(int i10, Object obj, t2 t2Var) {
        e1 e1Var = (e1) obj;
        m1 m1Var = (m1) this.a;
        m1Var.o((i10 << 3) | 2);
        m1Var.o(e1Var.b(t2Var));
        t2Var.c(e1Var, m1Var.a);
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public s2 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            l2 l2Var = ((l2[]) this.a)[i10];
            if (l2Var.zzc(cls)) {
                return l2Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((l2[]) this.a)[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public i2() {
        q2 q2Var = q2.c;
        i2 i2Var = new i2(t1.b, b);
        Charset charset = a2.a;
        this.a = i2Var;
    }

    public i2(m1 m1Var) {
        Charset charset = a2.a;
        this.a = m1Var;
        m1Var.a = this;
    }
}
