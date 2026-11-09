package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnSuccessListener, OnFailureListener, g6.h {
    public final /* synthetic */ s a;

    public /* synthetic */ q(s sVar) {
        this.a = sVar;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void b(g6.f fVar, boolean z9) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void c(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void e(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void f(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public void i(g6.f fVar, String str) {
        f6.k kVar;
        j6.b bVar = s.i;
        s sVar = this.a;
        int i7 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(sVar.e));
        if (sVar.a.D && sVar.e == 2) {
            if (sVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                h6.h a10 = sVar.a();
                if (a10 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    f6.r rVar = sVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
                        h6.h.k.b("resume SessionState", new Object[0]);
                        q6.m.d("Must be called from the main thread.");
                        if (a10.w()) {
                            h6.h.x(new h6.j(a10, kVar, i7));
                        } else {
                            h6.h.t();
                        }
                    }
                }
            }
        }
        sVar.c();
    }

    @Override // g6.h
    public void j(g6.f fVar, int i7) {
        j6.b bVar = s.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i7));
        s sVar = this.a;
        int i10 = sVar.e;
        if (i10 != 0) {
            if (sVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i10), sVar.h);
                Iterator it = new HashSet(sVar.b).iterator();
                while (it.hasNext()) {
                    v0 v0Var = (v0) it.next();
                    int i11 = sVar.e;
                    switch (v0Var.a) {
                        case 0:
                            x0.j.b("onTransferred with type = %d", Integer.valueOf(i11));
                            x0 x0Var = (x0) v0Var.b;
                            x0Var.c();
                            o1 b10 = x0Var.c.b(x0Var.g);
                            j1 m10 = k1.m(b10.d());
                            m10.c();
                            k1.v((k1) m10.b, i11);
                            b10.e((k1) m10.a());
                            x0Var.a.a((p1) b10.a(), qs.H3);
                            x0Var.i = false;
                            x0Var.g = null;
                            break;
                    }
                }
            } else {
                bVar.b("No need to notify with null sessionState", new Object[0]);
            }
        } else {
            bVar.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        }
        if (sVar.e == 2) {
            return;
        }
        sVar.c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        s sVar = this.a;
        sVar.getClass();
        j6.b bVar = s.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        sVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        s sVar = this.a;
        sVar.h = (f6.r) obj;
        c0.i iVar = sVar.g;
        if (iVar != null) {
            iVar.a(null);
        }
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void p(g6.f fVar, String str) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void s(g6.f fVar) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void t(g6.f fVar) {
    }
}
