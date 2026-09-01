package n1;

import dd.p;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import k7.q7;
import kotlin.jvm.internal.j;
import wc.i;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends i implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, uc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = (i) pVar;
                super(2, cVar);
                break;
            default:
                this.d = (i) pVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dd.p, wc.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dd.p, wc.i] */
    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
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

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        uc.c cVar = (uc.c) obj2;
        switch (this.a) {
        }
        return ((c) create(bVar, cVar)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dd.p, wc.i] */
    /* JADX WARN: Type inference failed for: r5v12, types: [dd.p, wc.i] */
    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                vc.a aVar = vc.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    q7.b(obj);
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
                    q7.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.b.set(true);
                return bVar2;
            default:
                vc.a aVar2 = vc.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.c;
                    q7.b(obj);
                    return bVar3;
                }
                q7.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.c).a);
                j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar4 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.c = bVar4;
                this.b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
