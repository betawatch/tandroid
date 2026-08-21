package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class k extends c2 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    public /* synthetic */ k(g2 g2Var) {
        super(g2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(B3 b3, g2 g2Var) {
        super(g2Var);
        this.d = b3;
        this.c = true;
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final void y(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.y(-1L);
                break;
            case 1:
                this.a.y(-1L);
                break;
            default:
                this.a.y(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        switch (this.b) {
            case 0:
                g2 g2Var = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    g2Var.s((g2) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    g2Var.s((g2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.time.t) ((q) this.d).n).apply((j$.time.t) obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        g2 g2Var2 = this.a;
                        if (!z) {
                            ((Stream) stream.sequential()).forEach(g2Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!g2Var2.C() && spliterator.tryAdvance(g2Var2)) {
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
                    boolean test = ((B3) this.d).m.test(obj);
                    this.c = test;
                    if (test) {
                        this.a.s((g2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public boolean C() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.C();
            case 2:
                return !this.c || this.a.C();
            default:
                return super.C();
        }
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public void x() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.x();
                break;
            default:
                super.x();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, g2 g2Var) {
        super(g2Var);
        this.d = qVar;
    }
}
