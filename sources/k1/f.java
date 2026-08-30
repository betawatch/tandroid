package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.p7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends wc.i implements dd.p {
    public Iterator a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, ArrayList arrayList, uc.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f = arrayList;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        f fVar = new f(this.e, this.f, cVar);
        fVar.d = obj;
        return fVar;
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        vc.a aVar = vc.a.a;
        int i10 = this.c;
        if (i10 == 0) {
            p7.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f;
        } else if (i10 == 1) {
            Object obj2 = this.b;
            Iterator it2 = this.a;
            List list2 = (List) this.d;
            p7.b(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new e(1, null));
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
            p7.b(obj);
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
