package ia;

import android.content.Context;
import android.util.Log;
import h7.k6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j0 extends tc.i implements ad.p {
    public l0 a;
    public g0 b;
    public t8.h c;
    public e0 d;
    public ka.h e;
    public r f;
    public List h;
    public Map n;
    public int r;
    public final /* synthetic */ l0 s;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, e0 e0Var, rc.c cVar) {
        super(2, cVar);
        this.s = l0Var;
        this.v = e0Var;
    }

    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
        return new j0(this.s, this.v, cVar);
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
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
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        ka.h hVar;
        ArrayList a2;
        e0 e0Var;
        Object b11;
        g0 g0Var;
        r rVar;
        l0 l0Var;
        Map subscribers;
        Object a3;
        r currentProcessDetails;
        ka.h sessionsSettings;
        e0 sessionDetails;
        t8.h firebaseApp;
        List appProcessDetails;
        f9.k kVar;
        l0 l0Var2 = this.s;
        t8.h hVar2 = l0Var2.a;
        sc.a aVar = sc.a.a;
        int i10 = this.r;
        if (i10 == 0) {
            k6.b(obj);
            this.r = 1;
            b10 = l0.b(l0Var2, this);
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
                    t8.h hVar3 = this.c;
                    g0 g0Var2 = this.b;
                    l0 l0Var3 = this.a;
                    k6.b(obj);
                    l0Var = l0Var3;
                    g0Var = g0Var2;
                    firebaseApp = hVar3;
                    subscribers = map;
                    a3 = obj;
                    kotlin.jvm.internal.j.d(a3, "getFirebaseInstallationId()");
                    String str = (String) a3;
                    g0Var.getClass();
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
                    f9.k kVar2 = (f9.k) subscribers.get(ja.d.b);
                    i iVar = i.d;
                    i iVar2 = i.c;
                    i iVar3 = i.b;
                    i iVar4 = kVar2 != null ? iVar3 : kVar2.a.a() ? iVar2 : iVar;
                    kVar = (f9.k) subscribers.get(ja.d.a);
                    if (kVar != null) {
                        iVar = iVar3;
                    } else if (kVar.a.a()) {
                        iVar = iVar2;
                    }
                    f0 f0Var = new f0(new o0(str2, str3, i11, j10, new j(iVar4, iVar, sessionsSettings.a()), str), g0.a(firebaseApp));
                    int i12 = l0.g;
                    l0Var.getClass();
                    try {
                        l0Var.d.R(f0Var);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
                    } catch (RuntimeException e9) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e9);
                    }
                    return pc.i.a;
                }
                List list = this.h;
                rVar = this.f;
                ka.h hVar4 = this.e;
                e0 e0Var2 = this.d;
                t8.h hVar5 = this.c;
                g0 g0Var3 = this.b;
                l0Var = this.a;
                k6.b(obj);
                a2 = list;
                hVar2 = hVar5;
                g0Var = g0Var3;
                e0Var = e0Var2;
                hVar = hVar4;
                b11 = obj;
                subscribers = (Map) b11;
                this.a = l0Var;
                this.b = g0Var;
                this.c = hVar2;
                this.d = e0Var;
                this.e = hVar;
                this.f = rVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a3 = l0.a(l0Var2, this);
                if (a3 != aVar) {
                    currentProcessDetails = rVar;
                    sessionsSettings = hVar;
                    sessionDetails = e0Var;
                    firebaseApp = hVar2;
                    appProcessDetails = a2;
                    kotlin.jvm.internal.j.d(a3, "getFirebaseInstallationId()");
                    String str4 = (String) a3;
                    g0Var.getClass();
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
                    f9.k kVar22 = (f9.k) subscribers.get(ja.d.b);
                    i iVar5 = i.d;
                    i iVar22 = i.c;
                    i iVar32 = i.b;
                    if (kVar22 != null) {
                    }
                    kVar = (f9.k) subscribers.get(ja.d.a);
                    if (kVar != null) {
                    }
                    f0 f0Var2 = new f0(new o0(str22, str32, i112, j102, new j(iVar4, iVar5, sessionsSettings.a()), str4), g0.a(firebaseApp));
                    int i122 = l0.g;
                    l0Var.getClass();
                    l0Var.d.R(f0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str22));
                    return pc.i.a;
                }
                return aVar;
            }
            k6.b(obj);
            b10 = obj;
        }
        if (((Boolean) b10).booleanValue()) {
            g0 g0Var4 = g0.a;
            hVar = l0Var2.c;
            hVar2.a();
            Context context = hVar2.a;
            kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
            r b12 = s.b(context);
            hVar2.a();
            Context context2 = hVar2.a;
            kotlin.jvm.internal.j.d(context2, "firebaseApp.applicationContext");
            a2 = s.a(context2);
            ja.c cVar = ja.c.a;
            this.a = l0Var2;
            this.b = g0Var4;
            this.c = hVar2;
            e0Var = this.v;
            this.d = e0Var;
            this.e = hVar;
            this.f = b12;
            this.h = a2;
            this.r = 2;
            b11 = cVar.b(this);
            if (b11 != aVar) {
                g0Var = g0Var4;
                rVar = b12;
                l0Var = l0Var2;
                subscribers = (Map) b11;
                this.a = l0Var;
                this.b = g0Var;
                this.c = hVar2;
                this.d = e0Var;
                this.e = hVar;
                this.f = rVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a3 = l0.a(l0Var2, this);
                if (a3 != aVar) {
                }
            }
            return aVar;
        }
        return pc.i.a;
    }
}
