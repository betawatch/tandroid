package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h2 implements k2 {
    public static final s1 b = new s1(4);
    public final Object a;

    public h2(k2... k2VarArr) {
        this.a = k2VarArr;
    }

    public void a(int i10, Object obj, s2 s2Var) {
        l1 l1Var = (l1) this.a;
        l1Var.m(i10, 3);
        s2Var.d((e1) obj, l1Var.a);
        l1Var.m(i10, 4);
    }

    public void b(int i10, Object obj, s2 s2Var) {
        e1 e1Var = (e1) obj;
        l1 l1Var = (l1) this.a;
        l1Var.o((i10 << 3) | 2);
        l1Var.o(e1Var.b(s2Var));
        s2Var.d(e1Var, l1Var.a);
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public r2 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            k2 k2Var = ((k2[]) this.a)[i10];
            if (k2Var.zzc(cls)) {
                return k2Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((k2[]) this.a)[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public h2() {
        p2 p2Var = p2.c;
        h2 h2Var = new h2(s1.b, b);
        Charset charset = z1.a;
        this.a = h2Var;
    }

    public h2(l1 l1Var) {
        Charset charset = z1.a;
        this.a = l1Var;
        l1Var.a = this;
    }
}
