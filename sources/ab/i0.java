package ab;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class i0 extends md.i implements td.p {
    public k0 a;
    public f0 b;
    public l9.h c;
    public d0 d;
    public cb.h e;
    public q f;
    public List h;
    public Map n;
    public int r;
    public final /* synthetic */ k0 s;
    public final /* synthetic */ d0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, d0 d0Var, kd.c cVar) {
        super(2, cVar);
        this.s = k0Var;
        this.v = d0Var;
    }

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
        return new i0(this.s, this.v, cVar);
    }

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (r5 == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0122  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @Override // md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        cb.h hVar;
        ArrayList a2;
        d0 d0Var;
        Object b11;
        f0 f0Var;
        q qVar;
        k0 k0Var;
        Map subscribers;
        Object a10;
        q currentProcessDetails;
        cb.h sessionsSettings;
        d0 sessionDetails;
        l9.h firebaseApp;
        List appProcessDetails;
        x9.j jVar;
        k0 k0Var2 = this.s;
        l9.h hVar2 = k0Var2.a;
        ld.a aVar = ld.a.a;
        int i10 = this.r;
        if (i10 == 0) {
            i8.b(obj);
            this.r = 1;
            b10 = k0.b(k0Var2, this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Map map = this.n;
                    appProcessDetails = this.h;
                    currentProcessDetails = this.f;
                    sessionsSettings = this.e;
                    sessionDetails = this.d;
                    l9.h hVar3 = this.c;
                    f0 f0Var2 = this.b;
                    k0 k0Var3 = this.a;
                    i8.b(obj);
                    k0Var = k0Var3;
                    f0Var = f0Var2;
                    firebaseApp = hVar3;
                    subscribers = map;
                    a10 = obj;
                    kotlin.jvm.internal.i.d(a10, "getFirebaseInstallationId()");
                    String str = (String) a10;
                    f0Var.getClass();
                    kotlin.jvm.internal.i.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.i.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.i.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.i.e(currentProcessDetails, "currentProcessDetails");
                    kotlin.jvm.internal.i.e(appProcessDetails, "appProcessDetails");
                    kotlin.jvm.internal.i.e(subscribers, "subscribers");
                    String str2 = sessionDetails.a;
                    String str3 = sessionDetails.b;
                    int i11 = sessionDetails.c;
                    long j10 = sessionDetails.d;
                    x9.j jVar2 = (x9.j) subscribers.get(bb.d.b);
                    i iVar = i.d;
                    i iVar2 = i.c;
                    i iVar3 = i.b;
                    i iVar4 = jVar2 != null ? iVar3 : jVar2.a.a() ? iVar2 : iVar;
                    jVar = (x9.j) subscribers.get(bb.d.a);
                    if (jVar != null) {
                        iVar = iVar3;
                    } else if (jVar.a.a()) {
                        iVar = iVar2;
                    }
                    e0 e0Var = new e0(new n0(str2, str3, i11, j10, new j(iVar4, iVar, sessionsSettings.a()), str), f0.a(firebaseApp));
                    int i12 = k0.g;
                    k0Var.getClass();
                    try {
                        k0Var.d.o(e0Var);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
                    } catch (RuntimeException e) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
                    }
                    return id.i.a;
                }
                List list = this.h;
                qVar = this.f;
                cb.h hVar4 = this.e;
                d0 d0Var2 = this.d;
                l9.h hVar5 = this.c;
                f0 f0Var3 = this.b;
                k0Var = this.a;
                i8.b(obj);
                a2 = list;
                hVar2 = hVar5;
                f0Var = f0Var3;
                d0Var = d0Var2;
                hVar = hVar4;
                b11 = obj;
                subscribers = (Map) b11;
                this.a = k0Var;
                this.b = f0Var;
                this.c = hVar2;
                this.d = d0Var;
                this.e = hVar;
                this.f = qVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = k0.a(k0Var2, this);
                if (a10 != aVar) {
                    currentProcessDetails = qVar;
                    sessionsSettings = hVar;
                    sessionDetails = d0Var;
                    firebaseApp = hVar2;
                    appProcessDetails = a2;
                    kotlin.jvm.internal.i.d(a10, "getFirebaseInstallationId()");
                    String str4 = (String) a10;
                    f0Var.getClass();
                    kotlin.jvm.internal.i.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.i.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.i.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.i.e(currentProcessDetails, "currentProcessDetails");
                    kotlin.jvm.internal.i.e(appProcessDetails, "appProcessDetails");
                    kotlin.jvm.internal.i.e(subscribers, "subscribers");
                    String str22 = sessionDetails.a;
                    String str32 = sessionDetails.b;
                    int i112 = sessionDetails.c;
                    long j102 = sessionDetails.d;
                    x9.j jVar22 = (x9.j) subscribers.get(bb.d.b);
                    i iVar5 = i.d;
                    i iVar22 = i.c;
                    i iVar32 = i.b;
                    if (jVar22 != null) {
                    }
                    jVar = (x9.j) subscribers.get(bb.d.a);
                    if (jVar != null) {
                    }
                    e0 e0Var2 = new e0(new n0(str22, str32, i112, j102, new j(iVar4, iVar5, sessionsSettings.a()), str4), f0.a(firebaseApp));
                    int i122 = k0.g;
                    k0Var.getClass();
                    k0Var.d.o(e0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str22));
                    return id.i.a;
                }
                return aVar;
            }
            i8.b(obj);
            b10 = obj;
        }
        if (((Boolean) b10).booleanValue()) {
            f0 f0Var4 = f0.a;
            hVar = k0Var2.c;
            hVar2.a();
            Context context = hVar2.a;
            kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
            q b12 = r.b(context);
            hVar2.a();
            Context context2 = hVar2.a;
            kotlin.jvm.internal.i.d(context2, "firebaseApp.applicationContext");
            a2 = r.a(context2);
            bb.c cVar = bb.c.a;
            this.a = k0Var2;
            this.b = f0Var4;
            this.c = hVar2;
            d0Var = this.v;
            this.d = d0Var;
            this.e = hVar;
            this.f = b12;
            this.h = a2;
            this.r = 2;
            b11 = cVar.b(this);
            if (b11 != aVar) {
                f0Var = f0Var4;
                qVar = b12;
                k0Var = k0Var2;
                subscribers = (Map) b11;
                this.a = k0Var;
                this.b = f0Var;
                this.c = hVar2;
                this.d = d0Var;
                this.e = hVar;
                this.f = qVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = k0.a(k0Var2, this);
                if (a10 != aVar) {
                }
            }
            return aVar;
        }
        return id.i.a;
    }
}
