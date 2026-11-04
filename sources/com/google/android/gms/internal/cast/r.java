package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnSuccessListener, OnFailureListener, f6.h {
    public final /* synthetic */ t a;

    public /* synthetic */ r(t tVar) {
        this.a = tVar;
    }

    @Override // f6.h
    public void a(f6.f fVar, int i3) {
        i6.b bVar = t.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i3));
        t tVar = this.a;
        int i10 = tVar.e;
        if (i10 != 0) {
            if (tVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i10), tVar.h);
                Iterator it = new HashSet(tVar.b).iterator();
                while (it.hasNext()) {
                    w0 w0Var = (w0) it.next();
                    int i11 = tVar.e;
                    switch (w0Var.a) {
                        case 0:
                            y0.j.b("onTransferred with type = %d", Integer.valueOf(i11));
                            y0 y0Var = (y0) w0Var.b;
                            y0Var.c();
                            p1 b10 = y0Var.c.b(y0Var.g);
                            k1 m10 = l1.m(b10.d());
                            m10.c();
                            l1.v((l1) m10.b, i11);
                            b10.e((l1) m10.a());
                            y0Var.a.a((q1) b10.a(), hs.H3);
                            y0Var.i = false;
                            y0Var.g = null;
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

    @Override // f6.h
    public /* bridge */ /* synthetic */ void d(f6.f fVar, int i3) {
    }

    @Override // f6.h
    public void f(f6.f fVar, String str) {
        e6.k kVar;
        i6.b bVar = t.i;
        t tVar = this.a;
        int i3 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(tVar.e));
        if (tVar.a.E && tVar.e == 2) {
            if (tVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                g6.h a10 = tVar.a();
                if (a10 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    e6.r rVar = tVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
                        g6.h.k.b("resume SessionState", new Object[0]);
                        p6.m.d("Must be called from the main thread.");
                        if (a10.w()) {
                            g6.h.x(new g6.j(a10, kVar, i3));
                        } else {
                            g6.h.t();
                        }
                    }
                }
            }
        }
        tVar.c();
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void g(f6.f fVar) {
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void h(f6.f fVar) {
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void j(f6.f fVar, String str) {
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void l(f6.f fVar, boolean z10) {
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void m(f6.f fVar, int i3) {
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void n(f6.f fVar, int i3) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        t tVar = this.a;
        tVar.getClass();
        i6.b bVar = t.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        tVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        t tVar = this.a;
        tVar.h = (e6.r) obj;
        c0.i iVar = tVar.g;
        if (iVar != null) {
            iVar.a(null);
        }
    }
}
