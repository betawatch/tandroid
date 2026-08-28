package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class bk0 extends vk0 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.bm) this).O(false);
    }

    @Override // f2.r0
    public void l() {
        if (this.c) {
            this.d = true;
        } else {
            super.l();
        }
    }

    @Override // f2.r0
    public void m(int i9) {
        if (this.c) {
            return;
        }
        super.m(i9);
    }

    @Override // f2.r0
    public void o(int i9) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.o(i9);
        } else {
            arrayList.add(Integer.valueOf(i9));
            arrayList.add(1);
        }
    }

    @Override // f2.r0
    public void q(int i9, int i10) {
        if (this.c) {
            return;
        }
        super.q(i9, i10);
    }

    @Override // f2.r0
    public void s(int i9, int i10) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.s(i9, i10);
        } else {
            arrayList.add(Integer.valueOf(i9));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // f2.r0
    public void t(int i9, int i10) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.t(i9, i10);
        } else {
            arrayList.add(Integer.valueOf(i9));
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // f2.r0
    public void u(int i9) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.u(i9);
        } else {
            arrayList.add(Integer.valueOf(i9));
            arrayList.add(1);
        }
    }
}
