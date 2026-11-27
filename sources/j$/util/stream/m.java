package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class m extends j5 {
    public final /* synthetic */ byte b = 2;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k8 k8Var, n5 n5Var) {
        super(n5Var);
        this.d = k8Var;
        this.c = true;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        byte b = this.b;
        n5 n5Var = this.a;
        switch (b) {
            case 0:
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    n5Var.x((n5) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    n5Var.x((n5) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.time.v) ((s) this.d).m).apply((j$.time.v) obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!n5Var.q() && spliterator.tryAdvance(n5Var)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(n5Var);
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
                    boolean test = ((k8) this.d).m.test(obj);
                    this.c = test;
                    if (test) {
                        n5Var.x((n5) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void end() {
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

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void n(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.n(-1L);
                break;
            case 1:
                this.a.n(-1L);
                break;
            default:
                this.a.n(-1L);
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean q() {
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

    public /* synthetic */ m(n5 n5Var) {
        super(n5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, n5 n5Var) {
        super(n5Var);
        this.d = sVar;
    }
}
