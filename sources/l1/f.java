package l1;

import android.content.SharedPreferences;
import b8.ib;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends hd.j implements od.p {
    public Iterator a;
    public n1.d b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, ArrayList arrayList, fd.c cVar) {
        super(2, cVar);
        this.f = list;
        this.h = arrayList;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        f fVar = new f(this.f, this.h, cVar);
        fVar.e = obj;
        return fVar;
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        n1.d dVar;
        Iterator it2;
        Object obj2;
        gd.a aVar = gd.a.a;
        int i3 = this.d;
        if (i3 == 0) {
            ib.b(obj);
            obj = this.e;
            it = this.f.iterator();
            list = this.h;
        } else if (i3 == 1) {
            obj2 = this.c;
            n1.d dVar2 = this.b;
            it2 = this.a;
            List list2 = (List) this.e;
            ib.b(obj);
            dVar = dVar2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new e(dVar, null, 0));
                this.e = list;
                this.a = it2;
                this.b = null;
                this.c = null;
                this.d = 2;
                obj = dVar.b.a(new n1.f((SharedPreferences) dVar.e.getValue(), dVar.f), obj2, this);
                if (obj != aVar) {
                    it = it2;
                }
                return aVar;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.a;
            list = (List) this.e;
            ib.b(obj);
        }
        if (!it.hasNext()) {
            n1.d dVar3 = (n1.d) it.next();
            this.e = list;
            this.a = it;
            this.b = dVar3;
            this.c = obj;
            this.d = 1;
            Object a10 = dVar3.a(obj, this);
            if (a10 != aVar) {
                Iterator it3 = it;
                obj2 = obj;
                obj = a10;
                dVar = dVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return aVar;
        }
    }
}
