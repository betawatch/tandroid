package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class i01 {
    public int a;
    public int b;
    public int c;

    public i01() {
        c();
    }

    public int a(r01 r01Var, k01 k01Var, kb1 kb1Var, int i10, boolean z10) {
        return this.a - kb1Var.F(k01Var, i10);
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
            d01 d01Var = r01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
