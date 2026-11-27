// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class g69 extends c79 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((it1) this).J(false);
    }

    @Override // j79
    public void f() {
        if (this.c) {
            this.d = true;
        } else {
            super.f();
        }
    }

    @Override // j79
    public void g(int i) {
        if (this.c) {
            return;
        }
        super.g(i);
    }

    @Override // j79
    public void i(int i) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(1);
        }
    }

    @Override // j79
    public void l(int i, int i2) {
        if (this.c) {
            return;
        }
        super.l(i, i2);
    }

    @Override // j79
    public void p(int i, int i2) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.p(i, i2);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
        }
    }

    @Override // j79
    public void q(int i, int i2) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.q(i, i2);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
        }
    }

    @Override // j79
    public void s(int i) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.s(i);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(1);
        }
    }
}
