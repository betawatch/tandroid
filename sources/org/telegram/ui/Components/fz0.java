package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class fz0 {
    public int a;
    public int b;
    public int c;

    public fz0() {
        c();
    }

    public int a(oz0 oz0Var, hz0 hz0Var, az0 az0Var, int i10, boolean z4) {
        return this.a - az0Var.a(hz0Var, i10);
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
            az0 az0Var = oz0.O;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
