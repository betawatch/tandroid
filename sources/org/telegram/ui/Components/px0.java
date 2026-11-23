package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class px0 {
    public int a;
    public int b;
    public int c;

    public px0() {
        c();
    }

    public int a(yx0 yx0Var, rx0 rx0Var, kx0 kx0Var, int i7, boolean z10) {
        return this.a - kx0Var.a(rx0Var, i7);
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
            kx0 kx0Var = yx0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
