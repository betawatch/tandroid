package ce;

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m implements d {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d b;
    public final /* synthetic */ Serializable c;

    public m(d dVar, kotlin.jvm.internal.r rVar) {
        this.b = dVar;
        this.c = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    @Override // ce.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, id.c cVar) {
        l lVar;
        int i7;
        m mVar;
        q qVar;
        int i10;
        boolean z9;
        Object obj2;
        Object obj3;
        m mVar2;
        switch (this.a) {
            case 0:
                if (cVar instanceof l) {
                    lVar = (l) cVar;
                    int i11 = lVar.d;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        lVar.d = i11 - TLObject.FLAG_31;
                        Object obj4 = lVar.b;
                        jd.a aVar = jd.a.a;
                        i7 = lVar.d;
                        if (i7 != 0) {
                            af.b.c(obj4);
                            try {
                                d dVar = this.b;
                                lVar.a = this;
                                lVar.d = 1;
                                if (dVar.a(obj, lVar) == aVar) {
                                    return aVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mVar = this;
                                ((kotlin.jvm.internal.r) mVar.c).a = th;
                                throw th;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mVar = lVar.a;
                            try {
                                af.b.c(obj4);
                            } catch (Throwable th3) {
                                th = th3;
                                ((kotlin.jvm.internal.r) mVar.c).a = th;
                                throw th;
                            }
                        }
                        return gd.k.a;
                    }
                }
                lVar = new l(this, cVar);
                Object obj42 = lVar.b;
                jd.a aVar2 = jd.a.a;
                i7 = lVar.d;
                if (i7 != 0) {
                }
                return gd.k.a;
            default:
                if (cVar instanceof q) {
                    qVar = (q) cVar;
                    int i12 = qVar.c;
                    if ((i12 & TLObject.FLAG_31) != 0) {
                        qVar.c = i12 - TLObject.FLAG_31;
                        Object obj5 = qVar.b;
                        jd.a aVar3 = jd.a.a;
                        i10 = qVar.c;
                        z9 = true;
                        if (i10 != 0) {
                            af.b.c(obj5);
                            jb.c cVar2 = (jb.c) this.c;
                            qVar.a = this;
                            qVar.e = obj;
                            qVar.c = 1;
                            Object invoke = cVar2.invoke(obj, qVar);
                            if (invoke == aVar3) {
                                return aVar3;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            mVar2 = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mVar2 = qVar.a;
                                af.b.c(obj5);
                                if (z9) {
                                    return gd.k.a;
                                }
                                throw new de.a(mVar2);
                            }
                            Object obj6 = qVar.e;
                            m mVar3 = qVar.a;
                            af.b.c(obj5);
                            obj3 = obj6;
                            mVar2 = mVar3;
                            obj2 = obj5;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z9 = false;
                        } else {
                            d dVar2 = mVar2.b;
                            qVar.a = mVar2;
                            qVar.e = null;
                            qVar.c = 2;
                            if (dVar2.a(obj3, qVar) == aVar3) {
                                return aVar3;
                            }
                        }
                        if (z9) {
                        }
                    }
                }
                qVar = new q(this, cVar);
                Object obj52 = qVar.b;
                jd.a aVar32 = jd.a.a;
                i10 = qVar.c;
                z9 = true;
                if (i10 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z9) {
                }
        }
    }

    public m(jb.c cVar, d dVar) {
        this.c = cVar;
        this.b = dVar;
    }
}
