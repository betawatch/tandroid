package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class gx0 {
    public int a;
    public int b;
    public int c;

    public gx0() {
        c();
    }

    public int a(px0 px0Var, ix0 ix0Var, bx0 bx0Var, int i7, boolean z10) {
        return this.a - bx0Var.a(ix0Var, i7);
    }

    public void b(int i7, int i10) {
        this.a = Math.max(this.a, i7);
        this.b = Math.max(this.b, i10);
    }

    public void c() {
        this.a = TLObject.FLAG_31;
        this.b = TLObject.FLAG_31;
        this.c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i7 = this.c;
            bx0 bx0Var = px0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
