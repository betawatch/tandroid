package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ti0 extends sj0 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.fl) this).O(false);
    }

    @Override // u4.h0
    public void f() {
        if (this.c) {
            this.d = true;
        } else {
            super.f();
        }
    }

    @Override // u4.h0
    public void g(int i3) {
        if (this.c) {
            return;
        }
        super.g(i3);
    }

    @Override // u4.h0
    public void i(int i3) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i3);
        } else {
            arrayList.add(Integer.valueOf(i3));
            arrayList.add(1);
        }
    }

    @Override // u4.h0
    public void k(int i3, int i10) {
        if (this.c) {
            return;
        }
        super.k(i3, i10);
    }

    @Override // u4.h0
    public void o(int i3, int i10) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.o(i3, i10);
        } else {
            arrayList.add(Integer.valueOf(i3));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // u4.h0
    public void p(int i3, int i10) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.p(i3, i10);
        } else {
            arrayList.add(Integer.valueOf(i3));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // u4.h0
    public void s(int i3) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.s(i3);
        } else {
            arrayList.add(Integer.valueOf(i3));
            arrayList.add(1);
        }
    }
}
