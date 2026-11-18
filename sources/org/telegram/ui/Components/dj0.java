package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class dj0 extends bk0 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.kl) this).O(false);
    }

    @Override // v4.i0
    public void f() {
        if (this.c) {
            this.d = true;
        } else {
            super.f();
        }
    }

    @Override // v4.i0
    public void g(int i7) {
        if (this.c) {
            return;
        }
        super.g(i7);
    }

    @Override // v4.i0
    public void i(int i7) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i7);
        } else {
            arrayList.add(Integer.valueOf(i7));
            arrayList.add(1);
        }
    }

    @Override // v4.i0
    public void k(int i7, int i10) {
        if (this.c) {
            return;
        }
        super.k(i7, i10);
    }

    @Override // v4.i0
    public void o(int i7, int i10) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.o(i7, i10);
        } else {
            arrayList.add(Integer.valueOf(i7));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // v4.i0
    public void p(int i7, int i10) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.p(i7, i10);
        } else {
            arrayList.add(Integer.valueOf(i7));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // v4.i0
    public void s(int i7) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.s(i7);
        } else {
            arrayList.add(Integer.valueOf(i7));
            arrayList.add(1);
        }
    }
}
