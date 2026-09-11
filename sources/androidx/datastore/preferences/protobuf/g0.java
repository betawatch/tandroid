package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g0 extends h0 {
    @Override // androidx.datastore.preferences.protobuf.h0
    public final void a(Object obj, long j3) {
        ((b) ((y) r1.d.i(obj, j3))).a = false;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void b(Object obj, long j3, Object obj2) {
        q1 q1Var = r1.d;
        y yVar = (y) q1Var.i(obj, j3);
        y yVar2 = (y) q1Var.i(obj2, j3);
        int size = yVar.size();
        int size2 = yVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((b) yVar).a) {
                yVar = yVar.d(size2 + size);
            }
            yVar.addAll(yVar2);
        }
        if (size > 0) {
            yVar2 = yVar;
        }
        r1.o(obj, j3, yVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final List c(Object obj, long j3) {
        y yVar = (y) r1.d.i(obj, j3);
        if (((b) yVar).a) {
            return yVar;
        }
        int size = yVar.size();
        y d = yVar.d(size == 0 ? 10 : size * 2);
        r1.o(obj, j3, d);
        return d;
    }
}
