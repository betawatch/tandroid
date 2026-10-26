package k1;

import a8.jd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e extends nd.i implements ud.p {
    public Iterator a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, ArrayList arrayList, ld.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f = arrayList;
    }

    @Override // nd.a
    public final ld.c create(Object obj, ld.c cVar) {
        e eVar = new e(this.e, this.f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (ld.c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        md.a aVar = md.a.a;
        int i10 = this.c;
        if (i10 == 0) {
            jd.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f;
        } else if (i10 == 1) {
            Object obj2 = this.b;
            Iterator it2 = this.a;
            List list2 = (List) this.d;
            jd.b(obj);
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
            jd.b(obj);
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
