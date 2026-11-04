package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class s3 extends CountedCompleter {
    public final e2 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public s3(e2 e2Var, Object obj, int i3) {
        this.c = i3;
        this.a = e2Var;
        this.b = 0;
        this.d = obj;
    }

    public s3(s3 s3Var, e2 e2Var, int i3, byte b10) {
        super(s3Var);
        this.a = e2Var;
        this.b = i3;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        s3 s3Var = this;
        while (s3Var.a.h() != 0) {
            s3Var.setPendingCount(s3Var.a.h() - 1);
            int i3 = 0;
            int i10 = 0;
            while (i3 < s3Var.a.h() - 1) {
                s3 a10 = s3Var.a(i3, s3Var.b + i10);
                i10 = (int) (a10.a.count() + i10);
                a10.fork();
                i3++;
            }
            s3Var = s3Var.a(i3, s3Var.b + i10);
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
    public s3(s3 s3Var, e2 e2Var, int i3) {
        this(s3Var, e2Var, i3, (byte) 0);
        this.c = 1;
        this.d = (Object[]) s3Var.d;
    }

    public final s3 a(int i3, int i10) {
        switch (this.c) {
            case 0:
                return new s3(this, ((d2) this.a).a(i3), i10);
            default:
                return new s3(this, this.a.a(i3), i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s3(s3 s3Var, d2 d2Var, int i3) {
        this(s3Var, d2Var, i3, (byte) 0);
        this.c = 0;
        this.d = s3Var.d;
    }
}
