package h9;

import a8.la;
import j$.util.Objects;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class p0 extends c0 {
    public q1 a;
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
            q1 q1Var = this.a;
            q1 q1Var2 = new q1();
            q1Var2.d(q1Var.c);
            if (q1Var.c != 0) {
                i10 = 0;
                while (i10 != -1) {
                    la.j(i10, q1Var.c);
                    Object obj2 = q1Var.a[i10];
                    la.j(i10, q1Var.c);
                    q1Var2.e(q1Var.b[i10], obj2);
                    i10++;
                    if (i10 < q1Var.c) {
                    }
                }
                this.a = q1Var2;
            }
            i10 = -1;
            while (i10 != -1) {
            }
            this.a = q1Var2;
        }
        this.b = false;
        obj.getClass();
        q1 q1Var3 = this.a;
        q1Var3.e(q1Var3.b(obj) + i7, obj);
    }
}
