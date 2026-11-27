// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ap5 extends ho5 {
    @Override // io5
    public final /* bridge */ /* synthetic */ io5 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final bp5 g() {
        int i = this.b;
        if (i == 0) {
            int i2 = bp5.c;
            return q99.s;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            bp5 p = bp5.p(i, objArr);
            this.b = p.size();
            this.c = true;
            return p;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = bp5.c;
        return new oma(obj);
    }
}
