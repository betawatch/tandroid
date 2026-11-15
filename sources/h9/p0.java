package h9;

import a8.ja;
import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class p0 extends c0 {
    public p1 a;
    public boolean b;

    @Override // h9.c0
    public final c0 a(Object obj) {
        c(1, obj);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:9:0x001e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, Object obj) {
        int i10;
        Objects.requireNonNull(this.a);
        if (i7 == 0) {
            return;
        }
        if (this.b) {
            p1 p1Var = this.a;
            p1 p1Var2 = new p1();
            p1Var2.d(p1Var.c);
            if (p1Var.c != 0) {
                i10 = 0;
                while (i10 != -1) {
                    ja.j(i10, p1Var.c);
                    Object obj2 = p1Var.a[i10];
                    ja.j(i10, p1Var.c);
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
        p1Var3.e(p1Var3.b(obj) + i7, obj);
    }
}
