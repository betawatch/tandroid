package la;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k7.q7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f0 extends wc.i implements dd.p {
    public h0 a;
    public c0 b;
    public w8.g c;
    public a0 d;
    public na.h e;
    public p f;
    public List h;
    public Map n;
    public int r;
    public final /* synthetic */ h0 s;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, a0 a0Var, uc.c cVar) {
        super(2, cVar);
        this.s = h0Var;
        this.v = a0Var;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        return new f0(this.s, this.v, cVar);
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
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
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        na.h hVar;
        ArrayList a2;
        a0 a0Var;
        Object b11;
        c0 c0Var;
        p pVar;
        h0 h0Var;
        Map subscribers;
        Object a10;
        p currentProcessDetails;
        na.h sessionsSettings;
        a0 sessionDetails;
        w8.g firebaseApp;
        List appProcessDetails;
        i9.k kVar;
        h0 h0Var2 = this.s;
        w8.g gVar = h0Var2.a;
        vc.a aVar = vc.a.a;
        int i10 = this.r;
        if (i10 == 0) {
            q7.b(obj);
            this.r = 1;
            b10 = h0.b(h0Var2, this);
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
                    w8.g gVar2 = this.c;
                    c0 c0Var2 = this.b;
                    h0 h0Var3 = this.a;
                    q7.b(obj);
                    h0Var = h0Var3;
                    c0Var = c0Var2;
                    firebaseApp = gVar2;
                    subscribers = map;
                    a10 = obj;
                    kotlin.jvm.internal.j.d(a10, "getFirebaseInstallationId()");
                    String str = (String) a10;
                    c0Var.getClass();
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
                    i9.k kVar2 = (i9.k) subscribers.get(ma.d.b);
                    i iVar = i.d;
                    i iVar2 = i.c;
                    i iVar3 = i.b;
                    i iVar4 = kVar2 != null ? iVar3 : kVar2.a.a() ? iVar2 : iVar;
                    kVar = (i9.k) subscribers.get(ma.d.a);
                    if (kVar != null) {
                        iVar = iVar3;
                    } else if (kVar.a.a()) {
                        iVar = iVar2;
                    }
                    b0 b0Var = new b0(new k0(str2, str3, i11, j10, new j(iVar4, iVar, sessionsSettings.a()), str), c0.a(firebaseApp));
                    int i12 = h0.g;
                    h0Var.getClass();
                    try {
                        h0Var.d.p(b0Var);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
                    } catch (RuntimeException e6) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e6);
                    }
                    return sc.i.a;
                }
                List list = this.h;
                pVar = this.f;
                na.h hVar2 = this.e;
                a0 a0Var2 = this.d;
                w8.g gVar3 = this.c;
                c0 c0Var3 = this.b;
                h0Var = this.a;
                q7.b(obj);
                a2 = list;
                gVar = gVar3;
                c0Var = c0Var3;
                a0Var = a0Var2;
                hVar = hVar2;
                b11 = obj;
                subscribers = (Map) b11;
                this.a = h0Var;
                this.b = c0Var;
                this.c = gVar;
                this.d = a0Var;
                this.e = hVar;
                this.f = pVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = h0.a(h0Var2, this);
                if (a10 != aVar) {
                    currentProcessDetails = pVar;
                    sessionsSettings = hVar;
                    sessionDetails = a0Var;
                    firebaseApp = gVar;
                    appProcessDetails = a2;
                    kotlin.jvm.internal.j.d(a10, "getFirebaseInstallationId()");
                    String str4 = (String) a10;
                    c0Var.getClass();
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
                    i9.k kVar22 = (i9.k) subscribers.get(ma.d.b);
                    i iVar5 = i.d;
                    i iVar22 = i.c;
                    i iVar32 = i.b;
                    if (kVar22 != null) {
                    }
                    kVar = (i9.k) subscribers.get(ma.d.a);
                    if (kVar != null) {
                    }
                    b0 b0Var2 = new b0(new k0(str22, str32, i112, j102, new j(iVar4, iVar5, sessionsSettings.a()), str4), c0.a(firebaseApp));
                    int i122 = h0.g;
                    h0Var.getClass();
                    h0Var.d.p(b0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str22));
                    return sc.i.a;
                }
                return aVar;
            }
            q7.b(obj);
            b10 = obj;
        }
        if (((Boolean) b10).booleanValue()) {
            c0 c0Var4 = c0.a;
            hVar = h0Var2.c;
            gVar.a();
            Context context = gVar.a;
            kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
            p b12 = q.b(context);
            gVar.a();
            Context context2 = gVar.a;
            kotlin.jvm.internal.j.d(context2, "firebaseApp.applicationContext");
            a2 = q.a(context2);
            ma.c cVar = ma.c.a;
            this.a = h0Var2;
            this.b = c0Var4;
            this.c = gVar;
            a0Var = this.v;
            this.d = a0Var;
            this.e = hVar;
            this.f = b12;
            this.h = a2;
            this.r = 2;
            b11 = cVar.b(this);
            if (b11 != aVar) {
                c0Var = c0Var4;
                pVar = b12;
                h0Var = h0Var2;
                subscribers = (Map) b11;
                this.a = h0Var;
                this.b = c0Var;
                this.c = gVar;
                this.d = a0Var;
                this.e = hVar;
                this.f = pVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = h0.a(h0Var2, this);
                if (a10 != aVar) {
                }
            }
            return aVar;
        }
        return sc.i.a;
    }
}
