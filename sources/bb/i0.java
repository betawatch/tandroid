package bb;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i0 extends ed.j implements ld.p {
    public k0 a;
    public f0 b;
    public l9.h c;
    public d0 d;
    public db.h e;
    public q f;
    public List h;
    public Map n;
    public int r;
    public final /* synthetic */ k0 s;
    public final /* synthetic */ d0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, d0 d0Var, cd.c cVar) {
        super(2, cVar);
        this.s = k0Var;
        this.w = d0Var;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        return new i0(this.s, this.w, cVar);
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (r5 == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x011f  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        db.h hVar;
        ArrayList a2;
        d0 d0Var;
        Object b11;
        f0 f0Var;
        q qVar;
        k0 k0Var;
        Map subscribers;
        Object a10;
        q currentProcessDetails;
        db.h sessionsSettings;
        d0 sessionDetails;
        l9.h firebaseApp;
        List appProcessDetails;
        x9.j jVar;
        k0 k0Var2 = this.s;
        l9.h hVar2 = k0Var2.a;
        dd.a aVar = dd.a.a;
        int i10 = this.r;
        if (i10 == 0) {
            l9.b.b(obj);
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
                    l9.b.b(obj);
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
                    x9.j jVar2 = (x9.j) subscribers.get(cb.d.b);
                    i iVar = i.d;
                    i iVar2 = i.c;
                    i iVar3 = i.b;
                    i iVar4 = jVar2 != null ? iVar3 : jVar2.a.a() ? iVar2 : iVar;
                    jVar = (x9.j) subscribers.get(cb.d.a);
                    if (jVar != null) {
                        iVar = iVar3;
                    } else if (jVar.a.a()) {
                        iVar = iVar2;
                    }
                    e0 e0Var = new e0(new n0(str2, str3, i11, j10, new j(iVar4, iVar, sessionsSettings.a()), str), f0.a(firebaseApp));
                    int i12 = k0.g;
                    k0Var.getClass();
                    try {
                        k0Var.d.u(e0Var);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
                    } catch (RuntimeException e) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
                    }
                    return ad.j.a;
                }
                List list = this.h;
                qVar = this.f;
                db.h hVar4 = this.e;
                d0 d0Var2 = this.d;
                l9.h hVar5 = this.c;
                f0 f0Var3 = this.b;
                k0Var = this.a;
                l9.b.b(obj);
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
                    x9.j jVar22 = (x9.j) subscribers.get(cb.d.b);
                    i iVar5 = i.d;
                    i iVar22 = i.c;
                    i iVar32 = i.b;
                    if (jVar22 != null) {
                    }
                    jVar = (x9.j) subscribers.get(cb.d.a);
                    if (jVar != null) {
                    }
                    e0 e0Var2 = new e0(new n0(str22, str32, i112, j102, new j(iVar4, iVar5, sessionsSettings.a()), str4), f0.a(firebaseApp));
                    int i122 = k0.g;
                    k0Var.getClass();
                    k0Var.d.u(e0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str22));
                    return ad.j.a;
                }
                return aVar;
            }
            l9.b.b(obj);
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
            cb.c cVar = cb.c.a;
            this.a = k0Var2;
            this.b = f0Var4;
            this.c = hVar2;
            d0Var = this.w;
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
        return ad.j.a;
    }
}
