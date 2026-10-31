package bb;

import android.util.Log;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v extends ed.j implements ld.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, cd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.a) {
            case 0:
                return new v((c0) this.c, cVar, 0);
            default:
                return new v((String) this.c, cVar, 1);
        }
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        td.c0 c0Var = (td.c0) obj;
        cd.c cVar = (cd.c) obj2;
        switch (this.a) {
        }
        return ((v) create(c0Var, cVar)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                dd.a aVar = dd.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    l9.b.b(obj);
                    c0 c0Var = (c0) this.c;
                    hf.b bVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.b = 1;
                    if (bVar.p(uVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                }
                return ad.j.a;
            default:
                dd.a aVar2 = dd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    l9.b.b(obj);
                    cb.c cVar = cb.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                }
                Collection<x9.j> values = ((Map) obj).values();
                String str = (String) this.c;
                for (x9.j jVar : values) {
                    cb.e eVar = new cb.e(str);
                    jVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    x9.i iVar = jVar.b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.c, str)) {
                            x9.i.a(iVar.a, iVar.b, str);
                            iVar.c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + cb.d.a + " of new session " + str);
                }
                return ad.j.a;
        }
    }
}
