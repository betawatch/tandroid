package bb;

import a8.jd;
import android.util.Log;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class v extends nd.i implements ud.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, ld.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // nd.a
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.a) {
            case 0:
                return new v((c0) this.c, cVar, 0);
            default:
                return new v((String) this.c, cVar, 1);
        }
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        ce.c0 c0Var = (ce.c0) obj;
        ld.c cVar = (ld.c) obj2;
        switch (this.a) {
        }
        return ((v) create(c0Var, cVar)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                md.a aVar = md.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    jd.b(obj);
                    c0 c0Var = (c0) this.c;
                    rf.b bVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.b = 1;
                    if (bVar.C(uVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jd.b(obj);
                }
                return jd.i.a;
            default:
                md.a aVar2 = md.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    jd.b(obj);
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
                    jd.b(obj);
                }
                Collection<y9.j> values = ((Map) obj).values();
                String str = (String) this.c;
                for (y9.j jVar : values) {
                    cb.e eVar = new cb.e(str);
                    jVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    y9.i iVar = jVar.b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.c, str)) {
                            y9.i.a(iVar.a, iVar.b, str);
                            iVar.c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + cb.d.a + " of new session " + str);
                }
                return jd.i.a;
        }
    }
}
