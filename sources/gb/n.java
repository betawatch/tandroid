package gb;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class n extends lb.b {
    public static final m H = new m();
    public static final db.m I = new db.m("closed");
    public final ArrayList E;
    public String F;
    public db.i G;

    public n() {
        super(H);
        this.E = new ArrayList();
        this.G = db.k.a;
    }

    @Override // lb.b
    public final void b() {
        db.h hVar = new db.h();
        w(hVar);
        this.E.add(hVar);
    }

    @Override // lb.b
    public final void c() {
        db.l lVar = new db.l();
        w(lVar);
        this.E.add(lVar);
    }

    @Override // lb.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(I);
    }

    @Override // lb.b
    public final void e() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof db.h)) {
            throw new IllegalStateException();
        }
        a4.a.x(1, arrayList);
    }

    @Override // lb.b
    public final void f() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof db.l)) {
            throw new IllegalStateException();
        }
        a4.a.x(1, arrayList);
    }

    @Override // lb.b
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.E.isEmpty() || this.F != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof db.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.F = str;
    }

    @Override // lb.b
    public final lb.b i() {
        w(db.k.a);
        return this;
    }

    @Override // lb.b
    public final void n(double d) {
        if (this.n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new db.m(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // lb.b
    public final void o(long j3) {
        w(new db.m(Long.valueOf(j3)));
    }

    @Override // lb.b
    public final void p(Boolean bool) {
        if (bool == null) {
            w(db.k.a);
        } else {
            w(new db.m(bool));
        }
    }

    @Override // lb.b
    public final void q(Number number) {
        if (number == null) {
            w(db.k.a);
            return;
        }
        if (this.n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new db.m(number));
    }

    @Override // lb.b
    public final void r(String str) {
        if (str == null) {
            w(db.k.a);
        } else {
            w(new db.m(str));
        }
    }

    @Override // lb.b
    public final void s(boolean z10) {
        w(new db.m(Boolean.valueOf(z10)));
    }

    public final db.i u() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.G;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final db.i v() {
        return (db.i) i2.g.h(1, this.E);
    }

    public final void w(db.i iVar) {
        if (this.F != null) {
            if (!(iVar instanceof db.k) || this.v) {
                ((db.l) v()).o(this.F, iVar);
            }
            this.F = null;
            return;
        }
        if (this.E.isEmpty()) {
            this.G = iVar;
            return;
        }
        db.i v = v();
        if (!(v instanceof db.h)) {
            throw new IllegalStateException();
        }
        ((db.h) v).a.add(iVar);
    }

    @Override // lb.b, java.io.Flushable
    public final void flush() {
    }
}
