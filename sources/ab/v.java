package ab;

import android.util.Log;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;
import v7.i8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class v extends md.i implements td.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.a) {
            case 0:
                return new v((c0) this.c, cVar, 0);
            default:
                return new v((String) this.c, cVar, 1);
        }
    }

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        be.c0 c0Var = (be.c0) obj;
        kd.c cVar = (kd.c) obj2;
        switch (this.a) {
        }
        return ((v) create(c0Var, cVar)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                ld.a aVar = ld.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    i8.b(obj);
                    c0 c0Var = (c0) this.c;
                    n4.s sVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.b = 1;
                    if (sVar.p(uVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                }
                return id.i.a;
            default:
                ld.a aVar2 = ld.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    i8.b(obj);
                    bb.c cVar = bb.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                }
                Collection<x9.j> values = ((Map) obj).values();
                String str = (String) this.c;
                for (x9.j jVar : values) {
                    bb.e eVar = new bb.e(str);
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
                    Log.d("SessionLifecycleClient", "Notified " + bb.d.a + " of new session " + str);
                }
                return id.i.a;
        }
    }
}
