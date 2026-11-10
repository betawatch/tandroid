package jb;

import android.util.Log;
import m1.e1;
import m1.l0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, id.c cVar, int i10) {
        super(i7, cVar);
        this.a = i10;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c cVar = (c) create((String) obj, (id.c) obj2);
                gd.k kVar = gd.k.a;
                cVar.invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((c) create((e1) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            default:
                return ((c) create((i) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
        }
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                af.b.c(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return gd.k.a;
            case 1:
                jd.a aVar2 = jd.a.a;
                af.b.c(obj);
                return Boolean.valueOf(!(((e1) this.b) instanceof l0));
            default:
                jd.a aVar3 = jd.a.a;
                af.b.c(obj);
                return (i) this.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, id.c cVar) {
        super(2, cVar);
        this.a = 2;
        this.b = iVar;
    }
}
