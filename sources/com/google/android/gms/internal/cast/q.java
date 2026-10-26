package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnSuccessListener, OnFailureListener, e6.h {
    public final /* synthetic */ s a;

    public /* synthetic */ q(s sVar) {
        this.a = sVar;
    }

    @Override // e6.h
    public void a(e6.f fVar, String str) {
        d6.k kVar;
        h6.b bVar = s.i;
        s sVar = this.a;
        int i10 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(sVar.e));
        if (sVar.a.y && sVar.e == 2) {
            if (sVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                f6.h a2 = sVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    d6.r rVar = sVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
                        f6.h.k.b("resume SessionState", new Object[0]);
                        o6.l.e("Must be called from the main thread.");
                        if (a2.w()) {
                            f6.h.x(new f6.k(a2, kVar, i10));
                        } else {
                            f6.h.t();
                        }
                    }
                }
            }
        }
        sVar.c();
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void b(e6.f fVar, int i10) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void d(e6.f fVar, int i10) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void e(e6.f fVar, int i10) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void g(e6.f fVar, String str) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void l(e6.f fVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        s sVar = this.a;
        sVar.getClass();
        h6.b bVar = s.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        sVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        s sVar = this.a;
        sVar.h = (d6.r) obj;
        c0.i iVar = sVar.g;
        if (iVar != null) {
            iVar.a(null);
        }
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void r(e6.f fVar) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void v(e6.f fVar, boolean z10) {
    }

    @Override // e6.h
    public void x(e6.f fVar, int i10) {
        h6.b bVar = s.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i10));
        s sVar = this.a;
        int i11 = sVar.e;
        if (i11 != 0) {
            if (sVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i11), sVar.h);
                Iterator it = new HashSet(sVar.b).iterator();
                while (it.hasNext()) {
                    v0 v0Var = (v0) it.next();
                    int i12 = sVar.e;
                    switch (v0Var.a) {
                        case 0:
                            x0.j.b("onTransferred with type = %d", Integer.valueOf(i12));
                            x0 x0Var = (x0) v0Var.b;
                            x0Var.c();
                            o1 b10 = x0Var.c.b(x0Var.g);
                            j1 m10 = k1.m(b10.d());
                            m10.c();
                            k1.v((k1) m10.b, i12);
                            b10.e((k1) m10.a());
                            x0Var.a.a((p1) b10.a(), 231);
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
}
