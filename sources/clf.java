// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class clf implements jlf {
    public final zhf a;
    public final tlf b;

    public clf(tlf tlfVar, ejf ejfVar, zhf zhfVar) {
        this.b = tlfVar;
        this.a = zhfVar;
    }

    @Override // jlf
    public final void a(Object obj) {
        this.b.getClass();
        slf slfVar = ((ljf) obj).zzc;
        if (slfVar.d) {
            slfVar.d = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // jlf
    public final boolean b(ljf ljfVar, ljf ljfVar2) {
        this.b.getClass();
        return ljfVar.zzc.equals(ljfVar2.zzc);
    }

    @Override // jlf
    public final void c(Object obj, Object obj2) {
        klf.o(this.b, obj, obj2);
    }

    @Override // jlf
    public final int d(ljf ljfVar) {
        this.b.getClass();
        slf slfVar = ljfVar.zzc;
        int i = slfVar.c;
        if (i != -1) {
            return i;
        }
        slfVar.c = 0;
        return 0;
    }

    @Override // jlf
    public final int e(ljf ljfVar) {
        this.b.getClass();
        ljfVar.zzc.getClass();
        return 506991;
    }

    @Override // jlf
    public final boolean f(Object obj) {
        bs2.u(obj);
        throw null;
    }

    @Override // jlf
    public final void g(Object obj, oqd oqdVar) {
        bs2.u(obj);
        throw null;
    }

    @Override // jlf
    public final ljf zzc() {
        zhf zhfVar = this.a;
        return zhfVar instanceof ljf ? (ljf) ((ljf) zhfVar).h(4, null) : ((kjf) ((ljf) zhfVar).h(5, null)).b();
    }
}
