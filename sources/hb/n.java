package hb;

import i2.o1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n extends mb.b {
    public static final m H = new m();
    public static final eb.m I = new eb.m("closed");
    public final ArrayList E;
    public String F;
    public eb.i G;

    public n() {
        super(H);
        this.E = new ArrayList();
        this.G = eb.k.a;
    }

    @Override // mb.b
    public final void b() {
        eb.h hVar = new eb.h();
        w(hVar);
        this.E.add(hVar);
    }

    @Override // mb.b
    public final void c() {
        eb.l lVar = new eb.l();
        w(lVar);
        this.E.add(lVar);
    }

    @Override // mb.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(I);
    }

    @Override // mb.b
    public final void e() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof eb.h)) {
            throw new IllegalStateException();
        }
        a1.g.y(1, arrayList);
    }

    @Override // mb.b
    public final void f() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof eb.l)) {
            throw new IllegalStateException();
        }
        a1.g.y(1, arrayList);
    }

    @Override // mb.b
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.E.isEmpty() || this.F != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof eb.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.F = str;
    }

    @Override // mb.b
    public final mb.b i() {
        w(eb.k.a);
        return this;
    }

    @Override // mb.b
    public final void n(double d) {
        if (this.n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new eb.m(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // mb.b
    public final void o(long j10) {
        w(new eb.m(Long.valueOf(j10)));
    }

    @Override // mb.b
    public final void p(Boolean bool) {
        if (bool == null) {
            w(eb.k.a);
        } else {
            w(new eb.m(bool));
        }
    }

    @Override // mb.b
    public final void q(Number number) {
        if (number == null) {
            w(eb.k.a);
            return;
        }
        if (this.n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new eb.m(number));
    }

    @Override // mb.b
    public final void r(String str) {
        if (str == null) {
            w(eb.k.a);
        } else {
            w(new eb.m(str));
        }
    }

    @Override // mb.b
    public final void s(boolean z10) {
        w(new eb.m(Boolean.valueOf(z10)));
    }

    public final eb.i u() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.G;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final eb.i v() {
        return (eb.i) o1.i(1, this.E);
    }

    public final void w(eb.i iVar) {
        if (this.F != null) {
            if (!(iVar instanceof eb.k) || this.v) {
                ((eb.l) v()).n(this.F, iVar);
            }
            this.F = null;
            return;
        }
        if (this.E.isEmpty()) {
            this.G = iVar;
            return;
        }
        eb.i v = v();
        if (!(v instanceof eb.h)) {
            throw new IllegalStateException();
        }
        ((eb.h) v).a.add(iVar);
    }

    @Override // mb.b, java.io.Flushable
    public final void flush() {
    }
}
