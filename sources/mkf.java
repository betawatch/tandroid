// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
