package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class cx0 {
    public int a;
    public int b;
    public int c;

    public cx0() {
        c();
    }

    public int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i3, boolean z10) {
        return this.a - xw0Var.a(ex0Var, i3);
    }

    public void b(int i3, int i10) {
        this.a = Math.max(this.a, i3);
        this.b = Math.max(this.b, i10);
    }

    public void c() {
        this.a = TLObject.FLAG_31;
        this.b = TLObject.FLAG_31;
        this.c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i3 = this.c;
            xw0 xw0Var = lx0.S;
            if ((i3 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
