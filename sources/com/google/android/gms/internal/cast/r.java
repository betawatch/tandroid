package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnSuccessListener, OnFailureListener, n5.h {
    public final /* synthetic */ t a;

    public /* synthetic */ r(t tVar) {
        this.a = tVar;
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void a(n5.f fVar) {
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void b(n5.f fVar, int i9) {
    }

    @Override // n5.h
    public void c(n5.f fVar, int i9) {
        q5.b bVar = t.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i9));
        t tVar = this.a;
        int i10 = tVar.e;
        if (i10 != 0) {
            if (tVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i10), tVar.h);
                Iterator it = new HashSet(tVar.b).iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    int i11 = tVar.e;
                    switch (y0Var.a) {
                        case 0:
                            a1.j.b("onTransferred with type = %d", Integer.valueOf(i11));
                            a1 a1Var = (a1) y0Var.b;
                            a1Var.c();
                            r1 b10 = a1Var.c.b(a1Var.g);
                            m1 m10 = n1.m(b10.d());
                            m10.c();
                            n1.v((n1) m10.b, i11);
                            b10.e((n1) m10.a());
                            a1Var.a.a((s1) b10.a(), 231);
                            a1Var.i = false;
                            a1Var.g = null;
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

    @Override // n5.h
    public /* bridge */ /* synthetic */ void d(n5.f fVar) {
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void e(n5.f fVar, boolean z10) {
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void f(n5.f fVar, int i9) {
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void g(n5.f fVar, int i9) {
    }

    @Override // n5.h
    public void h(n5.f fVar, String str) {
        m5.k kVar;
        q5.b bVar = t.i;
        t tVar = this.a;
        int i9 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(tVar.e));
        if (tVar.a.y && tVar.e == 2) {
            if (tVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                o5.h a2 = tVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    m5.r rVar = tVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
                        o5.h.k.b("resume SessionState", new Object[0]);
                        x5.l.e("Must be called from the main thread.");
                        if (a2.w()) {
                            o5.h.x(new o5.j(a2, kVar, i9));
                        } else {
                            o5.h.t();
                        }
                    }
                }
            }
        }
        tVar.c();
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void i(n5.f fVar, String str) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        t tVar = this.a;
        tVar.getClass();
        q5.b bVar = t.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        tVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        t tVar = this.a;
        tVar.h = (m5.r) obj;
        c0.i iVar = tVar.g;
        if (iVar != null) {
            iVar.a();
        }
    }
}
