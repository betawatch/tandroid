package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class tj0 extends sk0 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.fm) this).O(false);
    }

    @Override // s4.g0
    public void f() {
        if (this.c) {
            this.d = true;
        } else {
            super.f();
        }
    }

    @Override // s4.g0
    public void g(int i10) {
        if (this.c) {
            return;
        }
        super.g(i10);
    }

    @Override // s4.g0
    public void i(int i10) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i10);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(1);
        }
    }

    @Override // s4.g0
    public void k(int i10, int i11) {
        if (this.c) {
            return;
        }
        super.k(i10, i11);
    }

    @Override // s4.g0
    public void o(int i10, int i11) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.o(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override // s4.g0
    public void p(int i10, int i11) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.p(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override // s4.g0
    public void s(int i10) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.s(i10);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(1);
        }
    }
}
