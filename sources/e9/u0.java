package e9;

import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class u0 extends h0 {
    public u1 a;
    public boolean b;

    @Override // e9.h0
    public final h0 a(Object obj) {
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
            u1 u1Var = this.a;
            u1 u1Var2 = new u1();
            u1Var2.d(u1Var.c);
            if (u1Var.c != 0) {
                i11 = 0;
                while (i11 != -1) {
                    u6.j(i11, u1Var.c);
                    Object obj2 = u1Var.a[i11];
                    u6.j(i11, u1Var.c);
                    u1Var2.e(u1Var.b[i11], obj2);
                    i11++;
                    if (i11 < u1Var.c) {
                    }
                }
                this.a = u1Var2;
            }
            i11 = -1;
            while (i11 != -1) {
            }
            this.a = u1Var2;
        }
        this.b = false;
        obj.getClass();
        u1 u1Var3 = this.a;
        u1Var3.e(u1Var3.b(obj) + i10, obj);
    }
}
