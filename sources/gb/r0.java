package gb;

import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class r0 extends kd.j implements rd.p {
    public x a;
    public t0 b;
    public p0 c;
    public o9.g d;
    public n0 e;
    public jb.l f;
    public int h;
    public final /* synthetic */ t0 n;
    public final /* synthetic */ n0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, n0 n0Var, id.c cVar) {
        super(2, cVar);
        this.n = t0Var;
        this.r = n0Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        return new r0(this.n, this.r, cVar);
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((zd.z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        if (r2 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0046, code lost:
    
        if (r2 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c2  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a10;
        Object a11;
        Object b10;
        jb.l sessionsSettings;
        t0 t0Var;
        x xVar;
        p0 p0Var;
        o9.g firebaseApp;
        n0 sessionDetails;
        jd.a aVar = jd.a.a;
        int i7 = this.h;
        t0 t0Var2 = this.n;
        if (i7 == 0) {
            af.b.c(obj);
            this.h = 1;
            a10 = t0.a(t0Var2, this);
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionsSettings = this.f;
                    sessionDetails = this.e;
                    o9.g gVar = this.d;
                    p0 p0Var2 = this.c;
                    t0 t0Var3 = this.b;
                    x xVar2 = this.a;
                    af.b.c(obj);
                    t0Var = t0Var3;
                    xVar = xVar2;
                    p0Var = p0Var2;
                    firebaseApp = gVar;
                    b10 = obj;
                    Map subscribers = (Map) b10;
                    String str = xVar.a;
                    String firebaseAuthenticationToken = xVar.b;
                    p0Var.getClass();
                    kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.j.e(subscribers, "subscribers");
                    kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
                    m mVar = m.b;
                    String str2 = sessionDetails.a;
                    String str3 = sessionDetails.b;
                    int i10 = sessionDetails.c;
                    long j3 = sessionDetails.d;
                    aa.j jVar = (aa.j) subscribers.get(hb.d.b);
                    j jVar2 = jVar != null ? j.b : jVar.a.a() ? j.c : j.d;
                    jb.l lVar = sessionsSettings;
                    aa.j jVar3 = (aa.j) subscribers.get(hb.d.a);
                    o0 o0Var = new o0(new v0(str2, str3, i10, j3, new k(jVar2, jVar3 != null ? j.b : jVar3.a.a() ? j.c : j.d, lVar.a()), str, firebaseAuthenticationToken), p0.a(firebaseApp));
                    int i11 = t0.g;
                    t0Var.getClass();
                    try {
                        t0Var.d.a(o0Var);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    } catch (RuntimeException e10) {
                        Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
                    }
                    return gd.k.a;
                }
                af.b.c(obj);
                a11 = obj;
                x xVar3 = (x) a11;
                p0 p0Var3 = p0.a;
                o9.g gVar2 = t0Var2.a;
                jb.l lVar2 = t0Var2.c;
                hb.c cVar = hb.c.a;
                this.a = xVar3;
                this.b = t0Var2;
                this.c = p0Var3;
                this.d = gVar2;
                n0 n0Var = this.r;
                this.e = n0Var;
                this.f = lVar2;
                this.h = 3;
                b10 = cVar.b(this);
                if (b10 != aVar) {
                    sessionsSettings = lVar2;
                    t0Var = t0Var2;
                    xVar = xVar3;
                    p0Var = p0Var3;
                    firebaseApp = gVar2;
                    sessionDetails = n0Var;
                    Map subscribers2 = (Map) b10;
                    String str4 = xVar.a;
                    String firebaseAuthenticationToken2 = xVar.b;
                    p0Var.getClass();
                    kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.j.e(subscribers2, "subscribers");
                    kotlin.jvm.internal.j.e(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
                    m mVar2 = m.b;
                    String str22 = sessionDetails.a;
                    String str32 = sessionDetails.b;
                    int i102 = sessionDetails.c;
                    long j32 = sessionDetails.d;
                    aa.j jVar4 = (aa.j) subscribers2.get(hb.d.b);
                    if (jVar4 != null) {
                    }
                    jb.l lVar3 = sessionsSettings;
                    aa.j jVar32 = (aa.j) subscribers2.get(hb.d.a);
                    o0 o0Var2 = new o0(new v0(str22, str32, i102, j32, new k(jVar2, jVar32 != null ? j.b : jVar32.a.a() ? j.c : j.d, lVar3.a()), str4, firebaseAuthenticationToken2), p0.a(firebaseApp));
                    int i112 = t0.g;
                    t0Var.getClass();
                    t0Var.d.a(o0Var2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    return gd.k.a;
                }
                return aVar;
            }
            af.b.c(obj);
            a10 = obj;
        }
        if (((Boolean) a10).booleanValue()) {
            va.d dVar = t0Var2.b;
            this.h = 2;
            a11 = x.c.a(dVar, this);
        }
        return gd.k.a;
    }
}
