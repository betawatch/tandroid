package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class mk0 extends kl0 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.nm) this).O(false);
    }

    @Override // s4.h0
    public void l() {
        if (this.c) {
            this.d = true;
        } else {
            super.l();
        }
    }

    @Override // s4.h0
    public void m(int i10) {
        if (this.c) {
            return;
        }
        super.m(i10);
    }

    @Override // s4.h0
    public void o(int i10) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.o(i10);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(1);
        }
    }

    @Override // s4.h0
    public void q(int i10, int i11) {
        if (this.c) {
            return;
        }
        super.q(i10, i11);
    }

    @Override // s4.h0
    public void s(int i10, int i11) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.s(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override // s4.h0
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.t(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override // s4.h0
    public void u(int i10) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.u(i10);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(1);
        }
    }
}
