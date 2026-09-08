package n1;

import gd.i;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = (j) pVar;
                super(2, cVar);
                break;
            default:
                this.d = (j) pVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kd.j, rd.p] */
    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((c) create(bVar, cVar)).invokeSuspend(i.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r5v12, types: [kd.j, rd.p] */
    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    t7.b(obj);
                    b bVar = (b) this.c;
                    this.b = 1;
                    obj = this.d.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.b.set(true);
                return bVar2;
            default:
                jd.a aVar2 = jd.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.c;
                    t7.b(obj);
                    return bVar3;
                }
                t7.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.c).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar4 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.c = bVar4;
                this.b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
