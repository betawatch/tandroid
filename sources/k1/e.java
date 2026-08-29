package k1;

import i7.c7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends uc.i implements bd.p {
    public Iterator a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, ArrayList arrayList, sc.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f = arrayList;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        e eVar = new e(this.e, this.f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (sc.c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        tc.a aVar = tc.a.a;
        int i10 = this.c;
        if (i10 == 0) {
            c7.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f;
        } else if (i10 == 1) {
            Object obj2 = this.b;
            Iterator it2 = this.a;
            List list2 = (List) this.d;
            c7.b(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new d(1, null));
                this.d = list2;
                this.a = it2;
                this.b = null;
                this.c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.a;
            list = (List) this.d;
            c7.b(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.d = list;
        this.a = it;
        this.b = obj;
        this.c = 1;
        throw null;
    }
}
