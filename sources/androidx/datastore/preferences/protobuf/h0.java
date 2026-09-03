package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h0 extends i0 {
    @Override // androidx.datastore.preferences.protobuf.i0
    public final void a(Object obj, long j10) {
        ((b) ((z) s1.d.i(obj, j10))).a = false;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void b(Object obj, long j10, Object obj2) {
        r1 r1Var = s1.d;
        z zVar = (z) r1Var.i(obj, j10);
        z zVar2 = (z) r1Var.i(obj2, j10);
        int size = zVar.size();
        int size2 = zVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((b) zVar).a) {
                zVar = zVar.e(size2 + size);
            }
            zVar.addAll(zVar2);
        }
        if (size > 0) {
            zVar2 = zVar;
        }
        s1.o(obj, j10, zVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final List c(Object obj, long j10) {
        z zVar = (z) s1.d.i(obj, j10);
        if (((b) zVar).a) {
            return zVar;
        }
        int size = zVar.size();
        z e6 = zVar.e(size == 0 ? 10 : size * 2);
        s1.o(obj, j10, e6);
        return e6;
    }
}
