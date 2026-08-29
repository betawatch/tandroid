package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnSuccessListener, OnFailureListener, p5.h {
    public final /* synthetic */ t a;

    public /* synthetic */ r(t tVar) {
        this.a = tVar;
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void a(p5.f fVar, String str) {
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void b(p5.f fVar) {
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void c(p5.f fVar, int i10) {
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void d(p5.f fVar) {
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void e(p5.f fVar, int i10) {
    }

    @Override // p5.h
    public void f(p5.f fVar, String str) {
        o5.k kVar;
        s5.b bVar = t.i;
        t tVar = this.a;
        int i10 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(tVar.e));
        if (tVar.a.y && tVar.e == 2) {
            if (tVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                q5.h a2 = tVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    o5.r rVar = tVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
                        q5.h.k.b("resume SessionState", new Object[0]);
                        z5.l.e("Must be called from the main thread.");
                        if (a2.w()) {
                            q5.h.x(new q5.j(a2, kVar, i10));
                        } else {
                            q5.h.t();
                        }
                    }
                }
            }
        }
        tVar.c();
    }

    @Override // p5.h
    public void g(p5.f fVar, int i10) {
        s5.b bVar = t.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i10));
        t tVar = this.a;
        int i11 = tVar.e;
        if (i11 != 0) {
            if (tVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i11), tVar.h);
                Iterator it = new HashSet(tVar.b).iterator();
                while (it.hasNext()) {
                    z0 z0Var = (z0) it.next();
                    int i12 = tVar.e;
                    switch (z0Var.a) {
                        case 0:
                            b1.j.b("onTransferred with type = %d", Integer.valueOf(i12));
                            b1 b1Var = (b1) z0Var.b;
                            b1Var.c();
                            s1 b10 = b1Var.c.b(b1Var.g);
                            n1 m10 = o1.m(b10.d());
                            m10.c();
                            o1.v((o1) m10.b, i12);
                            b10.e((o1) m10.a());
                            b1Var.a.a((t1) b10.a(), 231);
                            b1Var.i = false;
                            b1Var.g = null;
                            break;
                    }
                }
            } else {
                bVar.b("No need to notify with null sessionState", new Object[0]);
            }
        } else {
            bVar.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        }
        if (tVar.e == 2) {
            return;
        }
        tVar.c();
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void h(p5.f fVar, boolean z10) {
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void j(p5.f fVar, int i10) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        t tVar = this.a;
        tVar.getClass();
        s5.b bVar = t.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        tVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        t tVar = this.a;
        tVar.h = (o5.r) obj;
        c0.i iVar = tVar.g;
        if (iVar != null) {
            iVar.a();
        }
    }
}
