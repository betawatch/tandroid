package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class k extends f5 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    public /* synthetic */ k(j5 j5Var) {
        super(j5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e8 e8Var, j5 j5Var) {
        super(j5Var);
        this.d = e8Var;
        this.c = true;
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void o(long j10) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.o(-1L);
                break;
            case 1:
                this.a.o(-1L);
                break;
            default:
                this.a.o(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        switch (this.b) {
            case 0:
                j5 j5Var = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    j5Var.x((j5) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    j5Var.x((j5) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.time.t) ((q) this.d).t).apply((j$.time.t) obj);
                if (stream != null) {
                    try {
                        boolean z4 = this.c;
                        j5 j5Var2 = this.a;
                        if (!z4) {
                            ((Stream) stream.sequential()).forEach(j5Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!j5Var2.q() && spliterator.tryAdvance(j5Var2)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean test = ((e8) this.d).t.test(obj);
                    this.c = test;
                    if (test) {
                        this.a.x((j5) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public boolean q() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.q();
            case 2:
                return !this.c || this.a.q();
            default:
                return super.q();
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, j5 j5Var) {
        super(j5Var);
        this.d = qVar;
    }
}
