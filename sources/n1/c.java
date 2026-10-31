package n1;

import ed.j;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, cd.c cVar, int i10) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [ed.j, ld.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ed.j, ld.p] */
    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
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

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        cd.c cVar = (cd.c) obj2;
        switch (this.a) {
        }
        return ((c) create(bVar, cVar)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ed.j, ld.p] */
    /* JADX WARN: Type inference failed for: r5v12, types: [ed.j, ld.p] */
    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                dd.a aVar = dd.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    l9.b.b(obj);
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
                    l9.b.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.b.set(true);
                return bVar2;
            default:
                dd.a aVar2 = dd.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.c;
                    l9.b.b(obj);
                    return bVar3;
                }
                l9.b.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.c).a);
                i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar4 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.c = bVar4;
                this.b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
