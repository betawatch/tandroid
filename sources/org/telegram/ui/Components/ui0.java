package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class ui0 extends tj0 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.jl) this).O(false);
    }

    @Override // v4.h0
    public void f() {
        if (this.c) {
            this.d = true;
        } else {
            super.f();
        }
    }

    @Override // v4.h0
    public void g(int i7) {
        if (this.c) {
            return;
        }
        super.g(i7);
    }

    @Override // v4.h0
    public void i(int i7) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i7);
        } else {
            arrayList.add(Integer.valueOf(i7));
            arrayList.add(1);
        }
    }

    @Override // v4.h0
    public void k(int i7, int i10) {
        if (this.c) {
            return;
        }
        super.k(i7, i10);
    }

    @Override // v4.h0
    public void o(int i7, int i10) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.o(i7, i10);
        } else {
            arrayList.add(Integer.valueOf(i7));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // v4.h0
    public void p(int i7, int i10) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.p(i7, i10);
        } else {
            arrayList.add(Integer.valueOf(i7));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // v4.h0
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
