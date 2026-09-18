package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class cz0 {
    public int a;
    public int b;
    public int c;

    public cz0() {
        c();
    }

    public int a(lz0 lz0Var, ez0 ez0Var, xy0 xy0Var, int i10, boolean z10) {
        return this.a - xy0Var.a(ez0Var, i10);
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
            xy0 xy0Var = lz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
