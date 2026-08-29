package ja;

import android.content.Context;
import android.util.Log;
import i7.c7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 extends uc.i implements bd.p {
    public k0 a;
    public f0 b;
    public u8.g c;
    public d0 d;
    public la.h e;
    public q f;
    public List h;
    public Map n;
    public int r;
    public final /* synthetic */ k0 s;
    public final /* synthetic */ d0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, d0 d0Var, sc.c cVar) {
        super(2, cVar);
        this.s = k0Var;
        this.v = d0Var;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        return new i0(this.s, this.v, cVar);
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.a);
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
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        la.h hVar;
        ArrayList a2;
        d0 d0Var;
        Object b11;
        f0 f0Var;
        q qVar;
        k0 k0Var;
        Map subscribers;
        Object a10;
        q currentProcessDetails;
        la.h sessionsSettings;
        d0 sessionDetails;
        u8.g firebaseApp;
        List appProcessDetails;
        g9.k kVar;
        k0 k0Var2 = this.s;
        u8.g gVar = k0Var2.a;
        tc.a aVar = tc.a.a;
        int i10 = this.r;
        if (i10 == 0) {
            c7.b(obj);
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
                    u8.g gVar2 = this.c;
                    f0 f0Var2 = this.b;
                    k0 k0Var3 = this.a;
                    c7.b(obj);
                    k0Var = k0Var3;
                    f0Var = f0Var2;
                    firebaseApp = gVar2;
                    subscribers = map;
                    a10 = obj;
                    kotlin.jvm.internal.j.d(a10, "getFirebaseInstallationId()");
                    String str = (String) a10;
                    f0Var.getClass();
                    kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.j.e(currentProcessDetails, "currentProcessDetails");
                    kotlin.jvm.internal.j.e(appProcessDetails, "appProcessDetails");
                    kotlin.jvm.internal.j.e(subscribers, "subscribers");
                    String str2 = sessionDetails.a;
                    String str3 = sessionDetails.b;
                    int i11 = sessionDetails.c;
                    long j10 = sessionDetails.d;
                    g9.k kVar2 = (g9.k) subscribers.get(ka.d.b);
                    i iVar = i.d;
                    i iVar2 = i.c;
                    i iVar3 = i.b;
                    i iVar4 = kVar2 != null ? iVar3 : kVar2.a.a() ? iVar2 : iVar;
                    kVar = (g9.k) subscribers.get(ka.d.a);
                    if (kVar != null) {
                        iVar = iVar3;
                    } else if (kVar.a.a()) {
                        iVar = iVar2;
                    }
                    e0 e0Var = new e0(new n0(str2, str3, i11, j10, new j(iVar4, iVar, sessionsSettings.a()), str), f0.a(firebaseApp));
                    int i12 = k0.g;
                    k0Var.getClass();
                    try {
                        k0Var.d.m(e0Var);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
                    } catch (RuntimeException e10) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
                    }
                    return qc.i.a;
                }
                List list = this.h;
                qVar = this.f;
                la.h hVar2 = this.e;
                d0 d0Var2 = this.d;
                u8.g gVar3 = this.c;
                f0 f0Var3 = this.b;
                k0Var = this.a;
                c7.b(obj);
                a2 = list;
                gVar = gVar3;
                f0Var = f0Var3;
                d0Var = d0Var2;
                hVar = hVar2;
                b11 = obj;
                subscribers = (Map) b11;
                this.a = k0Var;
                this.b = f0Var;
                this.c = gVar;
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
                    firebaseApp = gVar;
                    appProcessDetails = a2;
                    kotlin.jvm.internal.j.d(a10, "getFirebaseInstallationId()");
                    String str4 = (String) a10;
                    f0Var.getClass();
                    kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.j.e(currentProcessDetails, "currentProcessDetails");
                    kotlin.jvm.internal.j.e(appProcessDetails, "appProcessDetails");
                    kotlin.jvm.internal.j.e(subscribers, "subscribers");
                    String str22 = sessionDetails.a;
                    String str32 = sessionDetails.b;
                    int i112 = sessionDetails.c;
                    long j102 = sessionDetails.d;
                    g9.k kVar22 = (g9.k) subscribers.get(ka.d.b);
                    i iVar5 = i.d;
                    i iVar22 = i.c;
                    i iVar32 = i.b;
                    if (kVar22 != null) {
                    }
                    kVar = (g9.k) subscribers.get(ka.d.a);
                    if (kVar != null) {
                    }
                    e0 e0Var2 = new e0(new n0(str22, str32, i112, j102, new j(iVar4, iVar5, sessionsSettings.a()), str4), f0.a(firebaseApp));
                    int i122 = k0.g;
                    k0Var.getClass();
                    k0Var.d.m(e0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str22));
                    return qc.i.a;
                }
                return aVar;
            }
            c7.b(obj);
            b10 = obj;
        }
        if (((Boolean) b10).booleanValue()) {
            f0 f0Var4 = f0.a;
            hVar = k0Var2.c;
            gVar.a();
            Context context = gVar.a;
            kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
            q b12 = r.b(context);
            gVar.a();
            Context context2 = gVar.a;
            kotlin.jvm.internal.j.d(context2, "firebaseApp.applicationContext");
            a2 = r.a(context2);
            ka.c cVar = ka.c.a;
            this.a = k0Var2;
            this.b = f0Var4;
            this.c = gVar;
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
                this.c = gVar;
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
        return qc.i.a;
    }
}
