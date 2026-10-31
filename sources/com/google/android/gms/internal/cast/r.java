package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnSuccessListener, OnFailureListener, d6.h {
    public final /* synthetic */ t a;

    public /* synthetic */ r(t tVar) {
        this.a = tVar;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void A(d6.f fVar) {
    }

    @Override // d6.h
    public void F(d6.f fVar, String str) {
        c6.k kVar;
        g6.b bVar = t.i;
        t tVar = this.a;
        int i10 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(tVar.e));
        if (tVar.a.D && tVar.e == 2) {
            if (tVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                e6.h a2 = tVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    c6.r rVar = tVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
                        e6.h.k.b("resume SessionState", new Object[0]);
                        n6.l.d("Must be called from the main thread.");
                        if (a2.w()) {
                            e6.h.x(new e6.j(a2, kVar, i10));
                        } else {
                            e6.h.t();
                        }
                    }
                }
            }
        }
        tVar.c();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void G(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void j(d6.f fVar, String str) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void k(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void o(d6.f fVar, boolean z10) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        t tVar = this.a;
        tVar.getClass();
        g6.b bVar = t.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        tVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        t tVar = this.a;
        tVar.h = (c6.r) obj;
        c0.i iVar = tVar.g;
        if (iVar != null) {
            iVar.a(null);
        }
    }

    @Override // d6.h
    public void q(d6.f fVar, int i10) {
        g6.b bVar = t.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i10));
        t tVar = this.a;
        int i11 = tVar.e;
        if (i11 != 0) {
            if (tVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i11), tVar.h);
                Iterator it = new HashSet(tVar.b).iterator();
                while (it.hasNext()) {
                    x0 x0Var = (x0) it.next();
                    int i12 = tVar.e;
                    switch (x0Var.a) {
                        case 0:
                            z0.j.b("onTransferred with type = %d", Integer.valueOf(i12));
                            z0 z0Var = (z0) x0Var.b;
                            z0Var.c();
                            q1 b10 = z0Var.c.b(z0Var.g);
                            l1 m10 = m1.m(b10.d());
                            m10.c();
                            m1.v((m1) m10.b, i12);
                            b10.e((m1) m10.a());
                            z0Var.a.a((r1) b10.a(), zs.H3);
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
        if (tVar.e == 2) {
            return;
        }
        tVar.c();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void t(d6.f fVar) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void u(d6.f fVar, int i10) {
    }
}
