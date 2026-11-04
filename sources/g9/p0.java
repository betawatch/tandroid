package g9;

import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 extends c0 {
    public p1 a;
    public boolean b;

    @Override // g9.c0
    public final c0 a(Object obj) {
        c(1, obj);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:9:0x001e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i3, Object obj) {
        int i10;
        Objects.requireNonNull(this.a);
        if (i3 == 0) {
            return;
        }
        if (this.b) {
            p1 p1Var = this.a;
            p1 p1Var2 = new p1();
            p1Var2.d(p1Var.c);
            if (p1Var.c != 0) {
                i10 = 0;
                while (i10 != -1) {
                    zb.j(i10, p1Var.c);
                    Object obj2 = p1Var.a[i10];
                    zb.j(i10, p1Var.c);
                    p1Var2.e(p1Var.b[i10], obj2);
                    i10++;
                    if (i10 < p1Var.c) {
                    }
                }
                this.a = p1Var2;
            }
            i10 = -1;
            while (i10 != -1) {
            }
            this.a = p1Var2;
        }
        this.b = false;
        obj.getClass();
        p1 p1Var3 = this.a;
        p1Var3.e(p1Var3.b(obj) + i3, obj);
    }
}
