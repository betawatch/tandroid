package j$.util.stream;

import j$.util.AbstractC0034a;
import java.util.Comparator;
/* renamed from: j$.util.stream.f4 */
/* loaded from: classes2.dex */
public abstract class AbstractC0084f4 implements j$.util.u {
    final boolean a;
    final AbstractC0188y2 b;
    private j$.util.function.y c;
    j$.util.u d;
    AbstractC0125m3 e;
    j$.util.function.c f;
    long g;
    AbstractC0073e h;
    boolean i;

    public AbstractC0084f4(AbstractC0188y2 abstractC0188y2, j$.util.function.y yVar, boolean z) {
        this.b = abstractC0188y2;
        this.c = yVar;
        this.d = null;
        this.a = z;
    }

    public AbstractC0084f4(AbstractC0188y2 abstractC0188y2, j$.util.u uVar, boolean z) {
        this.b = abstractC0188y2;
        this.c = null;
        this.d = uVar;
        this.a = z;
    }

    private boolean f() {
        boolean z;
        while (this.h.count() == 0) {
            if (!this.e.o()) {
                C0055b c0055b = (C0055b) this.f;
                switch (c0055b.a) {
                    case 4:
                        C0138o4 c0138o4 = (C0138o4) c0055b.b;
                        z = c0138o4.d.b(c0138o4.e);
                        break;
                    case 5:
                        C0150q4 c0150q4 = (C0150q4) c0055b.b;
                        z = c0150q4.d.b(c0150q4.e);
                        break;
                    case 6:
                        s4 s4Var = (s4) c0055b.b;
                        z = s4Var.d.b(s4Var.e);
                        break;
                    default:
                        L4 l4 = (L4) c0055b.b;
                        z = l4.d.b(l4.e);
                        break;
                }
                if (z) {
                    continue;
                }
            }
            if (this.i) {
                return false;
            }
            this.e.m();
            this.i = true;
        }
        return true;
    }

    public final boolean a() {
        AbstractC0073e abstractC0073e = this.h;
        boolean z = false;
        if (abstractC0073e == null) {
            if (this.i) {
                return false;
            }
            h();
            j();
            this.g = 0L;
            this.e.n(this.d.getExactSizeIfKnown());
            return f();
        }
        long j = this.g + 1;
        this.g = j;
        if (j < abstractC0073e.count()) {
            z = true;
        }
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return f();
    }

    @Override // j$.util.u
    public final int characteristics() {
        h();
        int g = EnumC0072d4.g(this.b.s0()) & EnumC0072d4.f;
        return (g & 64) != 0 ? (g & (-16449)) | (this.d.characteristics() & 16448) : g;
    }

    @Override // j$.util.u
    public final long estimateSize() {
        h();
        return this.d.estimateSize();
    }

    @Override // j$.util.u
    public Comparator getComparator() {
        if (AbstractC0034a.f(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.u
    public final long getExactSizeIfKnown() {
        h();
        if (EnumC0072d4.SIZED.d(this.b.s0())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final void h() {
        if (this.d == null) {
            this.d = (j$.util.u) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.u
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0034a.f(this, i);
    }

    abstract void j();

    abstract AbstractC0084f4 l(j$.util.u uVar);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.u
    public j$.util.u trySplit() {
        if (!this.a || this.i) {
            return null;
        }
        h();
        j$.util.u trySplit = this.d.trySplit();
        if (trySplit != null) {
            return l(trySplit);
        }
        return null;
    }
}
