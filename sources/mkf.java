// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mkf extends okf {
    @Override // okf
    public final void a(long j, Object obj) {
        bif bifVar = (bif) ((tjf) wlf.g(obj, j));
        if (bifVar.a) {
            bifVar.a = false;
        }
    }

    @Override // okf
    public final void b(long j, Object obj, Object obj2) {
        tjf tjfVar = (tjf) wlf.g(obj, j);
        tjf tjfVar2 = (tjf) wlf.g(obj2, j);
        int size = tjfVar.size();
        int size2 = tjfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((bif) tjfVar).a) {
                tjfVar = tjfVar.zzg(size2 + size);
            }
            tjfVar.addAll(tjfVar2);
        }
        if (size > 0) {
            tjfVar2 = tjfVar;
        }
        wlf.i(obj, j, tjfVar2);
    }
}
