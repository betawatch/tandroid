package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class dx0 {
    public int a;
    public int b;
    public int c;

    public dx0() {
        c();
    }

    public int a(mx0 mx0Var, fx0 fx0Var, yw0 yw0Var, int i7, boolean z9) {
        return this.a - yw0Var.a(fx0Var, i7);
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
            yw0 yw0Var = mx0.S;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
