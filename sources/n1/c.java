package n1;

import bd.p;
import i7.c7;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends i implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, sc.c cVar, int i10) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [bd.p, uc.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bd.p, uc.i] */
    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
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

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        sc.c cVar = (sc.c) obj2;
        switch (this.a) {
        }
        return ((c) create(bVar, cVar)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bd.p, uc.i] */
    /* JADX WARN: Type inference failed for: r5v12, types: [bd.p, uc.i] */
    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                tc.a aVar = tc.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    c7.b(obj);
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
                    c7.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.b.set(true);
                return bVar2;
            default:
                tc.a aVar2 = tc.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.c;
                    c7.b(obj);
                    return bVar3;
                }
                c7.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.c).a);
                j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar4 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.c = bVar4;
                this.b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
