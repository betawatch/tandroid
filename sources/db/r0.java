package db;

import android.util.Log;
import b8.ib;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r0 extends hd.j implements od.p {
    public w a;
    public t0 b;
    public p0 c;
    public n9.h d;
    public n0 e;
    public gb.l f;
    public int h;
    public final /* synthetic */ t0 n;
    public final /* synthetic */ n0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, n0 n0Var, fd.c cVar) {
        super(2, cVar);
        this.n = t0Var;
        this.r = n0Var;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        return new r0(this.n, this.r, cVar);
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((wd.z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
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
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a10;
        Object a11;
        Object b10;
        gb.l sessionsSettings;
        t0 t0Var;
        w wVar;
        p0 p0Var;
        n9.h firebaseApp;
        n0 sessionDetails;
        gd.a aVar = gd.a.a;
        int i3 = this.h;
        t0 t0Var2 = this.n;
        if (i3 == 0) {
            ib.b(obj);
            this.h = 1;
            a10 = t0.a(t0Var2, this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionsSettings = this.f;
                    sessionDetails = this.e;
                    n9.h hVar = this.d;
                    p0 p0Var2 = this.c;
                    t0 t0Var3 = this.b;
                    w wVar2 = this.a;
                    ib.b(obj);
                    t0Var = t0Var3;
                    wVar = wVar2;
                    p0Var = p0Var2;
                    firebaseApp = hVar;
                    b10 = obj;
                    Map subscribers = (Map) b10;
                    String str = wVar.a;
                    String firebaseAuthenticationToken = wVar.b;
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
                    long j10 = sessionDetails.d;
                    z9.i iVar = (z9.i) subscribers.get(eb.d.b);
                    j jVar = iVar != null ? j.b : iVar.a.a() ? j.c : j.d;
                    gb.l lVar = sessionsSettings;
                    z9.i iVar2 = (z9.i) subscribers.get(eb.d.a);
                    o0 o0Var = new o0(new w0(str2, str3, i10, j10, new k(jVar, iVar2 != null ? j.b : iVar2.a.a() ? j.c : j.d, lVar.a()), str, firebaseAuthenticationToken), p0.a(firebaseApp));
                    int i11 = t0.g;
                    t0Var.getClass();
                    try {
                        t0Var.d.a(o0Var);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    } catch (RuntimeException e10) {
                        Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
                    }
                    return dd.k.a;
                }
                ib.b(obj);
                a11 = obj;
                w wVar3 = (w) a11;
                p0 p0Var3 = p0.a;
                n9.h hVar2 = t0Var2.a;
                gb.l lVar2 = t0Var2.c;
                eb.c cVar = eb.c.a;
                this.a = wVar3;
                this.b = t0Var2;
                this.c = p0Var3;
                this.d = hVar2;
                n0 n0Var = this.r;
                this.e = n0Var;
                this.f = lVar2;
                this.h = 3;
                b10 = cVar.b(this);
                if (b10 != aVar) {
                    sessionsSettings = lVar2;
                    t0Var = t0Var2;
                    wVar = wVar3;
                    p0Var = p0Var3;
                    firebaseApp = hVar2;
                    sessionDetails = n0Var;
                    Map subscribers2 = (Map) b10;
                    String str4 = wVar.a;
                    String firebaseAuthenticationToken2 = wVar.b;
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
                    long j102 = sessionDetails.d;
                    z9.i iVar3 = (z9.i) subscribers2.get(eb.d.b);
                    if (iVar3 != null) {
                    }
                    gb.l lVar3 = sessionsSettings;
                    z9.i iVar22 = (z9.i) subscribers2.get(eb.d.a);
                    o0 o0Var2 = new o0(new w0(str22, str32, i102, j102, new k(jVar, iVar22 != null ? j.b : iVar22.a.a() ? j.c : j.d, lVar3.a()), str4, firebaseAuthenticationToken2), p0.a(firebaseApp));
                    int i112 = t0.g;
                    t0Var.getClass();
                    t0Var.d.a(o0Var2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    return dd.k.a;
                }
                return aVar;
            }
            ib.b(obj);
            a10 = obj;
        }
        if (((Boolean) a10).booleanValue()) {
            ua.e eVar = t0Var2.b;
            this.h = 2;
            a11 = w.c.a(eVar, this);
        }
        return dd.k.a;
    }
}
