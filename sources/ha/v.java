package ha;

import android.util.Log;
import g7.y5;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v extends sc.i implements zc.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, qc.c cVar, int i9) {
        super(2, cVar);
        this.a = i9;
        this.c = obj;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.a) {
            case 0:
                return new v((c0) this.c, cVar, 0);
            default:
                return new v((String) this.c, cVar, 1);
        }
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        hd.c0 c0Var = (hd.c0) obj;
        qc.c cVar = (qc.c) obj2;
        switch (this.a) {
        }
        return ((v) create(c0Var, cVar)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                rc.a aVar = rc.a.a;
                int i9 = this.b;
                if (i9 == 0) {
                    y5.b(obj);
                    c0 c0Var = (c0) this.c;
                    g5.b bVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.b = 1;
                    if (bVar.q(uVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                }
                return oc.i.a;
            default:
                rc.a aVar2 = rc.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    y5.b(obj);
                    ia.c cVar = ia.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                }
                Collection<e9.k> values = ((Map) obj).values();
                String str = (String) this.c;
                for (e9.k kVar : values) {
                    ia.e eVar = new ia.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    e9.j jVar = kVar.b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.c, str)) {
                            e9.j.a(jVar.a, jVar.b, str);
                            jVar.c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ia.d.a + " of new session " + str);
                }
                return oc.i.a;
        }
    }
}
