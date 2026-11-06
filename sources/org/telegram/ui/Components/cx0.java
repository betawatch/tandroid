package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class cx0 {
    public int a;
    public int b;
    public int c;

    public cx0() {
        c();
    }

    public int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i7, boolean z9) {
        return this.a - xw0Var.a(ex0Var, i7);
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

    public int d(boolean z9) {
        if (!z9) {
            int i7 = this.c;
            xw0 xw0Var = lx0.R;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
