package gb;

import android.util.Log;
import b8.ib;
import l1.f1;
import l1.l0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, fd.c cVar, int i10) {
        super(i3, cVar);
        this.a = i10;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                c cVar2 = new c(2, cVar, 0);
                cVar2.b = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(2, cVar, 1);
                cVar3.b = obj;
                return cVar3;
            default:
                return new c((i) this.b, cVar);
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c cVar = (c) create((String) obj, (fd.c) obj2);
                dd.k kVar = dd.k.a;
                cVar.invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((c) create((f1) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
            default:
                return ((c) create((i) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
        }
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                gd.a aVar = gd.a.a;
                ib.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return dd.k.a;
            case 1:
                gd.a aVar2 = gd.a.a;
                ib.b(obj);
                return Boolean.valueOf(!(((f1) this.b) instanceof l0));
            default:
                gd.a aVar3 = gd.a.a;
                ib.b(obj);
                return (i) this.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, fd.c cVar) {
        super(2, cVar);
        this.a = 2;
        this.b = iVar;
    }
}
