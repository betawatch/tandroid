package ja;

import android.util.Log;
import i7.c7;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v extends uc.i implements bd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, sc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.a) {
            case 0:
                return new v((c0) this.c, cVar, 0);
            default:
                return new v((String) this.c, cVar, 1);
        }
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        jd.c0 c0Var = (jd.c0) obj;
        sc.c cVar = (sc.c) obj2;
        switch (this.a) {
        }
        return ((v) create(c0Var, cVar)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                tc.a aVar = tc.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    c7.b(obj);
                    c0 c0Var = (c0) this.c;
                    g9.l lVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.b = 1;
                    if (lVar.e(uVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                }
                return qc.i.a;
            default:
                tc.a aVar2 = tc.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    c7.b(obj);
                    ka.c cVar = ka.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                }
                Collection<g9.k> values = ((Map) obj).values();
                String str = (String) this.c;
                for (g9.k kVar : values) {
                    ka.e eVar = new ka.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    g9.j jVar = kVar.b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.c, str)) {
                            g9.j.a(jVar.a, jVar.b, str);
                            jVar.c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ka.d.a + " of new session " + str);
                }
                return qc.i.a;
        }
    }
}
