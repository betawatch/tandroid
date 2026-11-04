package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i2 implements l2 {
    public static final t1 b = new t1(4);
    public final Object a;

    public i2(l2... l2VarArr) {
        this.a = l2VarArr;
    }

    public void a(int i3, Object obj, t2 t2Var) {
        m1 m1Var = (m1) this.a;
        m1Var.m(i3, 3);
        t2Var.c((e1) obj, m1Var.a);
        m1Var.m(i3, 4);
    }

    public void b(int i3, Object obj, t2 t2Var) {
        e1 e1Var = (e1) obj;
        m1 m1Var = (m1) this.a;
        m1Var.o((i3 << 3) | 2);
        m1Var.o(e1Var.b(t2Var));
        t2Var.c(e1Var, m1Var.a);
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public s2 zzb(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            l2 l2Var = ((l2[]) this.a)[i3];
            if (l2Var.zzc(cls)) {
                return l2Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public boolean zzc(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((l2[]) this.a)[i3].zzc(cls)) {
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
