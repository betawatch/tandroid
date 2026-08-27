package ia;

import android.util.Log;
import h7.k6;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w extends tc.i implements ad.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, rc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.a) {
            case 0:
                return new w((d0) this.c, cVar, 0);
            default:
                return new w((String) this.c, cVar, 1);
        }
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        id.c0 c0Var = (id.c0) obj;
        rc.c cVar = (rc.c) obj2;
        switch (this.a) {
        }
        return ((w) create(c0Var, cVar)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                sc.a aVar = sc.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    k6.b(obj);
                    d0 d0Var = (d0) this.c;
                    g5.b bVar = d0Var.d;
                    v vVar = new v(d0Var, 0);
                    this.b = 1;
                    if (bVar.q(vVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                return pc.i.a;
            default:
                sc.a aVar2 = sc.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    k6.b(obj);
                    ja.c cVar = ja.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                Collection<f9.k> values = ((Map) obj).values();
                String str = (String) this.c;
                for (f9.k kVar : values) {
                    ja.e eVar = new ja.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    f9.j jVar = kVar.b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.c, str)) {
                            f9.j.a(jVar.a, jVar.b, str);
                            jVar.c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ja.d.a + " of new session " + str);
                }
                return pc.i.a;
        }
    }
}
