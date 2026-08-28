package k1;

import g7.y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends sc.i implements zc.p {
    public Iterator a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, ArrayList arrayList, qc.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f = arrayList;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        e eVar = new e(this.e, this.f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        rc.a aVar = rc.a.a;
        int i9 = this.c;
        if (i9 == 0) {
            y5.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f;
        } else if (i9 == 1) {
            Object obj2 = this.b;
            Iterator it2 = this.a;
            List list2 = (List) this.d;
            y5.b(obj);
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
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.a;
            list = (List) this.d;
            y5.b(obj);
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
