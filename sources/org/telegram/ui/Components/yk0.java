package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class yk0 extends sl0 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.jm) this).O(false);
    }

    @Override // f2.p0
    public void l() {
        if (this.c) {
            this.d = true;
        } else {
            super.l();
        }
    }

    @Override // f2.p0
    public void m(int i10) {
        if (this.c) {
            return;
        }
        super.m(i10);
    }

    @Override // f2.p0
    public void o(int i10) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.o(i10);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(1);
        }
    }

    @Override // f2.p0
    public void q(int i10, int i11) {
        if (this.c) {
            return;
        }
        super.q(i10, i11);
    }

    @Override // f2.p0
    public void s(int i10, int i11) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.s(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override // f2.p0
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.t(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override // f2.p0
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
