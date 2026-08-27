package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class s3 extends CountedCompleter {
    public final e2 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public s3(e2 e2Var, Object obj, int i10) {
        this.c = i10;
        this.a = e2Var;
        this.b = 0;
        this.d = obj;
    }

    public s3(s3 s3Var, e2 e2Var, int i10, byte b10) {
        super(s3Var);
        this.a = e2Var;
        this.b = i10;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        s3 s3Var = this;
        while (s3Var.a.h() != 0) {
            s3Var.setPendingCount(s3Var.a.h() - 1);
            int i10 = 0;
            int i11 = 0;
            while (i10 < s3Var.a.h() - 1) {
                s3 a2 = s3Var.a(i10, s3Var.b + i11);
                i11 = (int) (a2.a.count() + i11);
                a2.fork();
                i10++;
            }
            s3Var = s3Var.a(i10, s3Var.b + i11);
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
    public s3(s3 s3Var, e2 e2Var, int i10) {
        this(s3Var, e2Var, i10, (byte) 0);
        this.c = 1;
        this.d = (Object[]) s3Var.d;
    }

    public final s3 a(int i10, int i11) {
        switch (this.c) {
            case 0:
                return new s3(this, ((d2) this.a).a(i10), i11);
            default:
                return new s3(this, this.a.a(i10), i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s3(s3 s3Var, d2 d2Var, int i10) {
        this(s3Var, d2Var, i10, (byte) 0);
        this.c = 0;
        this.d = s3Var.d;
    }
}
