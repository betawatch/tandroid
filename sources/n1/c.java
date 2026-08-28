package n1;

import g7.y5;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends i implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, qc.c cVar, int i9) {
        super(2, cVar);
        this.a = i9;
        switch (i9) {
            case 1:
                this.d = (i) pVar;
                super(2, cVar);
                break;
            default:
                this.d = (i) pVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [sc.i, zc.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sc.i, zc.p] */
    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.c = obj;
                return cVar3;
        }
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        qc.c cVar = (qc.c) obj2;
        switch (this.a) {
        }
        return ((c) create(bVar, cVar)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sc.i, zc.p] */
    /* JADX WARN: Type inference failed for: r5v12, types: [sc.i, zc.p] */
    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                rc.a aVar = rc.a.a;
                int i9 = this.b;
                if (i9 == 0) {
                    y5.b(obj);
                    b bVar = (b) this.c;
                    this.b = 1;
                    obj = this.d.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.b.set(true);
                return bVar2;
            default:
                rc.a aVar2 = rc.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.c;
                    y5.b(obj);
                    return bVar3;
                }
                y5.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.c).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar4 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.c = bVar4;
                this.b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
