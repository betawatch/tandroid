package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public class v3 extends CountedCompleter {
    public final h2 a;
    public final int b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v3(v3 v3Var, h2 h2Var, int i) {
        this(v3Var, h2Var, i, (byte) 0);
        this.c = (byte) 1;
        this.d = (Object[]) v3Var.d;
    }

    public final v3 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new v3(this, ((g2) this.a).a(i), i2);
            default:
                return new v3(this, this.a.a(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.h() != 0) {
            this.setPendingCount(this.a.h() - 1);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int h = this.a.h() - 1;
                i = this.b + i3;
                if (i2 < h) {
                    v3 a = this.a(i2, i);
                    i3 = (int) (a.a.count() + i3);
                    a.fork();
                    i2++;
                }
            }
            this = this.a(i2, i);
        }
        switch (this.c) {
            case 0:
                ((g2) this.a).c(this.b, this.d);
                break;
            default:
                this.a.f((Object[]) this.d, this.b);
                break;
        }
        this.propagateCompletion();
    }

    public v3(v3 v3Var, h2 h2Var, int i, byte b) {
        super(v3Var);
        this.a = h2Var;
        this.b = i;
    }

    public v3(h2 h2Var, Object obj, byte b) {
        this.c = b;
        this.a = h2Var;
        this.b = 0;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v3(v3 v3Var, g2 g2Var, int i) {
        this(v3Var, g2Var, i, (byte) 0);
        this.c = (byte) 0;
        this.d = v3Var.d;
    }
}
