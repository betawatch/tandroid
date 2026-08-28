package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class iy0 {
    public int a;
    public int b;
    public int c;

    public iy0() {
        c();
    }

    public int a(ry0 ry0Var, ky0 ky0Var, dy0 dy0Var, int i9, boolean z10) {
        return this.a - dy0Var.a(ky0Var, i9);
    }

    public void b(int i9, int i10) {
        this.a = Math.max(this.a, i9);
        this.b = Math.max(this.b, i10);
    }

    public void c() {
        this.a = TLObject.FLAG_31;
        this.b = TLObject.FLAG_31;
        this.c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i9 = this.c;
            dy0 dy0Var = ry0.N;
            if ((i9 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
