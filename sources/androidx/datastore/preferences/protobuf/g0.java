package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g0 extends h0 {
    @Override // androidx.datastore.preferences.protobuf.h0
    public final void a(Object obj, long j10) {
        ((b) ((y) r1.d.i(obj, j10))).a = false;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void b(Object obj, long j10, Object obj2) {
        q1 q1Var = r1.d;
        y yVar = (y) q1Var.i(obj, j10);
        y yVar2 = (y) q1Var.i(obj2, j10);
        int size = yVar.size();
        int size2 = yVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((b) yVar).a) {
                yVar = yVar.b(size2 + size);
            }
            yVar.addAll(yVar2);
        }
        if (size > 0) {
            yVar2 = yVar;
        }
        r1.o(obj, j10, yVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final List c(Object obj, long j10) {
        y yVar = (y) r1.d.i(obj, j10);
        if (((b) yVar).a) {
            return yVar;
        }
        int size = yVar.size();
        y b10 = yVar.b(size == 0 ? 10 : size * 2);
        r1.o(obj, j10, b10);
        return b10;
    }
}
