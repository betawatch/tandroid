package gb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a1 implements ce.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // ce.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, id.c cVar) {
        m1.o oVar;
        int i7;
        Object e10;
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) obj;
                f1 f1Var = (f1) this.b;
                kotlin.jvm.internal.j.e(k0Var, "<set-?>");
                f1Var.h = k0Var;
                if (f1Var.j) {
                    f1Var.j = false;
                    f1Var.c();
                }
                Object a10 = f1.a(f1Var, k0Var.a.a, c1.a, cVar);
                return a10 == jd.a.a ? a10 : gd.k.a;
            case 1:
                if (cVar instanceof m1.o) {
                    oVar = (m1.o) cVar;
                    int i10 = oVar.b;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        oVar.b = i10 - TLObject.FLAG_31;
                        Object obj2 = oVar.a;
                        jd.a aVar = jd.a.a;
                        i7 = oVar.b;
                        if (i7 != 0) {
                            af.b.c(obj2);
                            ce.d dVar = (ce.d) this.b;
                            m1.e1 e1Var = (m1.e1) obj;
                            if (e1Var instanceof m1.w0) {
                                throw ((m1.w0) e1Var).b;
                            }
                            if (!(e1Var instanceof m1.c)) {
                                if (e1Var instanceof m1.l0 ? true : e1Var instanceof m1.f1) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new androidx.car.app.j();
                            }
                            Object obj3 = ((m1.c) e1Var).b;
                            oVar.b = 1;
                            if (dVar.a(obj3, oVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            af.b.c(obj2);
                        }
                        return gd.k.a;
                    }
                }
                oVar = new m1.o(this, cVar);
                Object obj22 = oVar.a;
                jd.a aVar2 = jd.a.a;
                i7 = oVar.b;
                if (i7 != 0) {
                }
                return gd.k.a;
            default:
                m1.b0 b0Var = (m1.b0) this.b;
                return ((b0Var.h.T1() instanceof m1.l0) || (e10 = m1.b0.e(b0Var, true, cVar)) != jd.a.a) ? gd.k.a : e10;
        }
    }
}
