package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class s3 extends CountedCompleter {
    public final e2 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public s3(e2 e2Var, Object obj, int i7) {
        this.c = i7;
        this.a = e2Var;
        this.b = 0;
        this.d = obj;
    }

    public s3(s3 s3Var, e2 e2Var, int i7, byte b10) {
        super(s3Var);
        this.a = e2Var;
        this.b = i7;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        s3 s3Var = this;
        while (s3Var.a.h() != 0) {
            s3Var.setPendingCount(s3Var.a.h() - 1);
            int i7 = 0;
            int i10 = 0;
            while (i7 < s3Var.a.h() - 1) {
                s3 a10 = s3Var.a(i7, s3Var.b + i10);
                i10 = (int) (a10.a.count() + i10);
                a10.fork();
                i7++;
            }
            s3Var = s3Var.a(i7, s3Var.b + i10);
        }
        switch (s3Var.c) {
            case 0:
                ((d2) s3Var.a).c(s3Var.b, s3Var.d);
                break;
            default:
                s3Var.a.f((Object[]) s3Var.d, s3Var.b);
                break;
        }
        s3Var.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s3(s3 s3Var, e2 e2Var, int i7) {
        this(s3Var, e2Var, i7, (byte) 0);
        this.c = 1;
        this.d = (Object[]) s3Var.d;
    }

    public final s3 a(int i7, int i10) {
        switch (this.c) {
            case 0:
                return new s3(this, ((d2) this.a).a(i7), i10);
            default:
                return new s3(this, this.a.a(i7), i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s3(s3 s3Var, d2 d2Var, int i7) {
        this(s3Var, d2Var, i7, (byte) 0);
        this.c = 0;
        this.d = s3Var.d;
    }
}
