package gb;

import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class s0 extends kd.j implements rd.p {
    public x a;
    public u0 b;
    public q0 c;
    public o9.g d;
    public o0 e;
    public jb.l f;
    public int h;
    public final /* synthetic */ u0 n;
    public final /* synthetic */ o0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, o0 o0Var, id.c cVar) {
        super(2, cVar);
        this.n = u0Var;
        this.r = o0Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        return new s0(this.n, this.r, cVar);
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((zd.z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
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
        u0 u0Var;
        x xVar;
        q0 q0Var;
        o9.g firebaseApp;
        o0 sessionDetails;
        jd.a aVar = jd.a.a;
        int i7 = this.h;
        u0 u0Var2 = this.n;
        if (i7 == 0) {
            af.b.c(obj);
            this.h = 1;
            a10 = u0.a(u0Var2, this);
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionsSettings = this.f;
                    sessionDetails = this.e;
                    o9.g gVar = this.d;
                    q0 q0Var2 = this.c;
                    u0 u0Var3 = this.b;
                    x xVar2 = this.a;
                    af.b.c(obj);
                    u0Var = u0Var3;
                    xVar = xVar2;
                    q0Var = q0Var2;
                    firebaseApp = gVar;
                    b10 = obj;
                    Map subscribers = (Map) b10;
                    String str = xVar.a;
                    String firebaseAuthenticationToken = xVar.b;
                    q0Var.getClass();
                    kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.j.e(subscribers, "subscribers");
                    kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
                    n nVar = n.b;
                    String str2 = sessionDetails.a;
                    String str3 = sessionDetails.b;
                    int i10 = sessionDetails.c;
                    long j3 = sessionDetails.d;
                    aa.j jVar = (aa.j) subscribers.get(hb.d.b);
                    j jVar2 = jVar != null ? j.b : jVar.a.a() ? j.c : j.d;
                    jb.l lVar = sessionsSettings;
                    aa.j jVar3 = (aa.j) subscribers.get(hb.d.a);
                    p0 p0Var = new p0(new x0(str2, str3, i10, j3, new k(jVar2, jVar3 != null ? j.b : jVar3.a.a() ? j.c : j.d, lVar.a()), str, firebaseAuthenticationToken), q0.a(firebaseApp));
                    int i11 = u0.g;
                    u0Var.getClass();
                    try {
                        u0Var.d.a(p0Var);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    } catch (RuntimeException e10) {
                        Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
                    }
                    return gd.k.a;
                }
                af.b.c(obj);
                a11 = obj;
                x xVar3 = (x) a11;
                q0 q0Var3 = q0.a;
                o9.g gVar2 = u0Var2.a;
                jb.l lVar2 = u0Var2.c;
                hb.c cVar = hb.c.a;
                this.a = xVar3;
                this.b = u0Var2;
                this.c = q0Var3;
                this.d = gVar2;
                o0 o0Var = this.r;
                this.e = o0Var;
                this.f = lVar2;
                this.h = 3;
                b10 = cVar.b(this);
                if (b10 != aVar) {
                    sessionsSettings = lVar2;
                    u0Var = u0Var2;
                    xVar = xVar3;
                    q0Var = q0Var3;
                    firebaseApp = gVar2;
                    sessionDetails = o0Var;
                    Map subscribers2 = (Map) b10;
                    String str4 = xVar.a;
                    String firebaseAuthenticationToken2 = xVar.b;
                    q0Var.getClass();
                    kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.j.e(subscribers2, "subscribers");
                    kotlin.jvm.internal.j.e(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
                    n nVar2 = n.b;
                    String str22 = sessionDetails.a;
                    String str32 = sessionDetails.b;
                    int i102 = sessionDetails.c;
                    long j32 = sessionDetails.d;
                    aa.j jVar4 = (aa.j) subscribers2.get(hb.d.b);
                    if (jVar4 != null) {
                    }
                    jb.l lVar3 = sessionsSettings;
                    aa.j jVar32 = (aa.j) subscribers2.get(hb.d.a);
                    p0 p0Var2 = new p0(new x0(str22, str32, i102, j32, new k(jVar2, jVar32 != null ? j.b : jVar32.a.a() ? j.c : j.d, lVar3.a()), str4, firebaseAuthenticationToken2), q0.a(firebaseApp));
                    int i112 = u0.g;
                    u0Var.getClass();
                    u0Var.d.a(p0Var2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    return gd.k.a;
                }
                return aVar;
            }
            af.b.c(obj);
            a10 = obj;
        }
        if (((Boolean) a10).booleanValue()) {
            va.d dVar = u0Var2.b;
            this.h = 2;
            a11 = x.c.a(dVar, this);
        }
        return gd.k.a;
    }
}
