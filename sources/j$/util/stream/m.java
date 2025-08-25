package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class m extends i2 {
    public final /* synthetic */ int b = 2;
    boolean c;
    Object d;

    public /* synthetic */ m(m2 m2Var) {
        super(m2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(K3 k3, m2 m2Var) {
        super(m2Var);
        this.d = k3;
        this.c = true;
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.l(-1L);
                break;
            case 1:
                this.a.l(-1L);
                break;
            default:
                this.a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        switch (this.b) {
            case 0:
                m2 m2Var = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    m2Var.p((m2) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    m2Var.p((m2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((a) ((s) this.d).n).apply((a) obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        m2 m2Var2 = this.a;
                        if (!z) {
                            ((Stream) stream.sequential()).forEach(m2Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!m2Var2.n() && spliterator.tryAdvance(m2Var2)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean test = ((K3) this.d).m.test(obj);
                    this.c = test;
                    if (test) {
                        this.a.p((m2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public boolean n() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.n();
            case 2:
                return !this.c || this.a.n();
            default:
                return super.n();
        }
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, m2 m2Var) {
        super(m2Var);
        this.d = sVar;
    }
}
