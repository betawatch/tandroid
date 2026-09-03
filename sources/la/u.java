package la;

import android.util.Log;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;
import k7.p7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u extends wc.i implements dd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.a) {
            case 0:
                return new u((z) this.c, cVar, 0);
            default:
                return new u((String) this.c, cVar, 1);
        }
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        ld.c0 c0Var = (ld.c0) obj;
        uc.c cVar = (uc.c) obj2;
        switch (this.a) {
        }
        return ((u) create(c0Var, cVar)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                vc.a aVar = vc.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    p7.b(obj);
                    z zVar = (z) this.c;
                    f7.b bVar = zVar.d;
                    t tVar = new t(zVar, 0);
                    this.b = 1;
                    if (bVar.z(tVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj);
                }
                return sc.i.a;
            default:
                vc.a aVar2 = vc.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    p7.b(obj);
                    ma.c cVar = ma.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj);
                }
                Collection<i9.k> values = ((Map) obj).values();
                String str = (String) this.c;
                for (i9.k kVar : values) {
                    ma.e eVar = new ma.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    i9.j jVar = kVar.b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.c, str)) {
                            i9.j.a(jVar.a, jVar.b, str);
                            jVar.c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ma.d.a + " of new session " + str);
                }
                return sc.i.a;
        }
    }
}
