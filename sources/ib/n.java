package ib;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n extends nb.b {
    public static final m H = new m();
    public static final fb.m I = new fb.m("closed");
    public final ArrayList E;
    public String F;
    public fb.i G;

    public n() {
        super(H);
        this.E = new ArrayList();
        this.G = fb.k.a;
    }

    @Override // nb.b
    public final void b() {
        fb.h hVar = new fb.h();
        w(hVar);
        this.E.add(hVar);
    }

    @Override // nb.b
    public final void c() {
        fb.l lVar = new fb.l();
        w(lVar);
        this.E.add(lVar);
    }

    @Override // nb.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(I);
    }

    @Override // nb.b
    public final void e() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof fb.h)) {
            throw new IllegalStateException();
        }
        a1.g.A(1, arrayList);
    }

    @Override // nb.b
    public final void f() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof fb.l)) {
            throw new IllegalStateException();
        }
        a1.g.A(1, arrayList);
    }

    @Override // nb.b
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.E.isEmpty() || this.F != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof fb.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.F = str;
    }

    @Override // nb.b
    public final nb.b i() {
        w(fb.k.a);
        return this;
    }

    @Override // nb.b
    public final void n(double d) {
        if (this.n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new fb.m(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // nb.b
    public final void o(long j10) {
        w(new fb.m(Long.valueOf(j10)));
    }

    @Override // nb.b
    public final void p(Boolean bool) {
        if (bool == null) {
            w(fb.k.a);
        } else {
            w(new fb.m(bool));
        }
    }

    @Override // nb.b
    public final void q(Number number) {
        if (number == null) {
            w(fb.k.a);
            return;
        }
        if (this.n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new fb.m(number));
    }

    @Override // nb.b
    public final void r(String str) {
        if (str == null) {
            w(fb.k.a);
        } else {
            w(new fb.m(str));
        }
    }

    @Override // nb.b
    public final void s(boolean z10) {
        w(new fb.m(Boolean.valueOf(z10)));
    }

    public final fb.i u() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.G;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final fb.i v() {
        return (fb.i) ic.a.g(1, this.E);
    }

    public final void w(fb.i iVar) {
        if (this.F != null) {
            if (!(iVar instanceof fb.k) || this.v) {
                ((fb.l) v()).n(this.F, iVar);
            }
            this.F = null;
            return;
        }
        if (this.E.isEmpty()) {
            this.G = iVar;
            return;
        }
        fb.i v = v();
        if (!(v instanceof fb.h)) {
            throw new IllegalStateException();
        }
        ((fb.h) v).a.add(iVar);
    }

    @Override // nb.b, java.io.Flushable
    public final void flush() {
    }
}
