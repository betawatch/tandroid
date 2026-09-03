package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class ez0 {
    public int a;
    public int b;
    public int c;

    public ez0() {
        c();
    }

    public int a(nz0 nz0Var, gz0 gz0Var, zy0 zy0Var, int i10, boolean z4) {
        return this.a - zy0Var.a(gz0Var, i10);
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

    public int d(boolean z4) {
        if (!z4) {
            int i10 = this.c;
            zy0 zy0Var = nz0.O;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
