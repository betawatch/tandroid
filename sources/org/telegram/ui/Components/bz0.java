package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class bz0 {
    public int a;
    public int b;
    public int c;

    public bz0() {
        c();
    }

    public int a(kz0 kz0Var, dz0 dz0Var, wy0 wy0Var, int i10, boolean z10) {
        return this.a - wy0Var.a(dz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.a = Math.max(this.a, i10);
        this.b = Math.max(this.b, i11);
    }

    public void c() {
        this.a = TLObject.FLAG_31;
        this.b = TLObject.FLAG_31;
        this.c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.c;
            wy0 wy0Var = kz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
