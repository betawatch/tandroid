package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnSuccessListener, OnFailureListener, r5.h {
    public final /* synthetic */ r a;

    public /* synthetic */ p(r rVar) {
        this.a = rVar;
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void e(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        q5.k kVar;
        u5.b bVar = r.i;
        r rVar = this.a;
        int i10 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(rVar.e));
        if (rVar.a.y && rVar.e == 2) {
            if (rVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                s5.h a2 = rVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    q5.r rVar2 = rVar.h;
                    if (rVar2 != null && (kVar = rVar2.a) != null) {
                        s5.h.k.b("resume SessionState", new Object[0]);
                        b6.m.e("Must be called from the main thread.");
                        if (a2.w()) {
                            s5.h.x(new s5.j(a2, kVar, i10));
                        } else {
                            s5.h.t();
                        }
                    }
                }
            }
        }
        rVar.c();
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void g(r5.f fVar, boolean z4) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void h(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void i(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void j(r5.f fVar) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void k(r5.f fVar, String str) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void m(r5.f fVar) {
    }

    @Override // r5.h
    public void o(r5.f fVar, int i10) {
        u5.b bVar = r.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i10));
        r rVar = this.a;
        int i11 = rVar.e;
        if (i11 != 0) {
            if (rVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i11), rVar.h);
                Iterator it = new HashSet(rVar.b).iterator();
                while (it.hasNext()) {
                    x0 x0Var = (x0) it.next();
                    int i12 = rVar.e;
                    switch (x0Var.a) {
                        case 0:
                            z0.j.b("onTransferred with type = %d", Integer.valueOf(i12));
                            z0 z0Var = (z0) x0Var.b;
                            z0Var.c();
                            q1 b10 = z0Var.c.b(z0Var.g);
                            l1 m9 = m1.m(b10.d());
                            m9.c();
                            m1.v((m1) m9.b, i12);
                            b10.e((m1) m9.a());
                            z0Var.a.a((r1) b10.a(), 231);
                            z0Var.i = false;
                            z0Var.g = null;
                            break;
                    }
                }
            } else {
                bVar.b("No need to notify with null sessionState", new Object[0]);
            }
        } else {
            bVar.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        }
        if (rVar.e == 2) {
            return;
        }
        rVar.c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        r rVar = this.a;
        rVar.getClass();
        u5.b bVar = r.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        rVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        r rVar = this.a;
        rVar.h = (q5.r) obj;
        c0.i iVar = rVar.g;
        if (iVar != null) {
            iVar.a();
        }
    }
}
