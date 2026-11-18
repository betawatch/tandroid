package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class nx0 {
    public int a;
    public int b;
    public int c;

    public nx0() {
        c();
    }

    public int a(wx0 wx0Var, px0 px0Var, ix0 ix0Var, int i7, boolean z10) {
        return this.a - ix0Var.a(px0Var, i7);
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
            ix0 ix0Var = wx0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
