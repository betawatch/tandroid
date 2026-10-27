package f9;

import a8.yb;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p0 extends c0 {
    public p1 a;
    public boolean b;

    @Override // f9.c0
    public final c0 a(Object obj) {
        c(1, obj);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:9:0x001e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, Object obj) {
        int i11;
        Objects.requireNonNull(this.a);
        if (i10 == 0) {
            return;
        }
        if (this.b) {
            p1 p1Var = this.a;
            p1 p1Var2 = new p1();
            p1Var2.d(p1Var.c);
            if (p1Var.c != 0) {
                i11 = 0;
                while (i11 != -1) {
                    yb.j(i11, p1Var.c);
                    Object obj2 = p1Var.a[i11];
                    yb.j(i11, p1Var.c);
                    p1Var2.e(p1Var.b[i11], obj2);
                    i11++;
                    if (i11 < p1Var.c) {
                    }
                }
                this.a = p1Var2;
            }
            i11 = -1;
            while (i11 != -1) {
            }
            this.a = p1Var2;
        }
        this.b = false;
        obj.getClass();
        p1 p1Var3 = this.a;
        p1Var3.e(p1Var3.b(obj) + i10, obj);
    }
}
