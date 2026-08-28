package oa;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends ta.c {
    public static final m D = new m();
    public static final la.m E = new la.m("closed");
    public final ArrayList A;
    public String B;
    public la.i C;

    public n() {
        super(D);
        this.A = new ArrayList();
        this.C = la.k.a;
    }

    @Override // ta.c
    public final void b() {
        la.h hVar = new la.h();
        w(hVar);
        this.A.add(hVar);
    }

    @Override // ta.c
    public final void c() {
        la.l lVar = new la.l();
        w(lVar);
        this.A.add(lVar);
    }

    @Override // ta.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(E);
    }

    @Override // ta.c
    public final void e() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof la.h)) {
            throw new IllegalStateException();
        }
        aa.d.u(1, arrayList);
    }

    @Override // ta.c
    public final void f() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof la.l)) {
            throw new IllegalStateException();
        }
        aa.d.u(1, arrayList);
    }

    @Override // ta.c
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.A.isEmpty() || this.B != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof la.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.B = str;
    }

    @Override // ta.c
    public final ta.c i() {
        w(la.k.a);
        return this;
    }

    @Override // ta.c
    public final void n(double d) {
        if (this.n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new la.m(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // ta.c
    public final void o(long j10) {
        w(new la.m(Long.valueOf(j10)));
    }

    @Override // ta.c
    public final void p(Boolean bool) {
        if (bool == null) {
            w(la.k.a);
        } else {
            w(new la.m(bool));
        }
    }

    @Override // ta.c
    public final void q(Number number) {
        if (number == null) {
            w(la.k.a);
            return;
        }
        if (this.n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new la.m(number));
    }

    @Override // ta.c
    public final void r(String str) {
        if (str == null) {
            w(la.k.a);
        } else {
            w(new la.m(str));
        }
    }

    @Override // ta.c
    public final void s(boolean z10) {
        w(new la.m(Boolean.valueOf(z10)));
    }

    public final la.i u() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return this.C;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final la.i v() {
        return (la.i) j3.r0.j(1, this.A);
    }

    public final void w(la.i iVar) {
        if (this.B != null) {
            if (!(iVar instanceof la.k) || this.v) {
                ((la.l) v()).o(this.B, iVar);
            }
            this.B = null;
            return;
        }
        if (this.A.isEmpty()) {
            this.C = iVar;
            return;
        }
        la.i v = v();
        if (!(v instanceof la.h)) {
            throw new IllegalStateException();
        }
        ((la.h) v).a.add(iVar);
    }

    @Override // ta.c, java.io.Flushable
    public final void flush() {
    }
}
