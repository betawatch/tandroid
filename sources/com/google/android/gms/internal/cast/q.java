package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnSuccessListener, OnFailureListener, n5.i {
    public final /* synthetic */ s a;

    public /* synthetic */ q(s sVar) {
        this.a = sVar;
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void a(n5.g gVar) {
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void b(n5.g gVar, int i10) {
    }

    @Override // n5.i
    public void c(n5.g gVar, int i10) {
        r5.b bVar = s.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i10));
        s sVar = this.a;
        int i11 = sVar.e;
        if (i11 != 0) {
            if (sVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i11), sVar.h);
                Iterator it = new HashSet(sVar.b).iterator();
                while (it.hasNext()) {
                    x0 x0Var = (x0) it.next();
                    int i12 = sVar.e;
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
        if (sVar.e == 2) {
            return;
        }
        sVar.c();
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void d(n5.g gVar) {
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void e(n5.g gVar, boolean z10) {
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void f(n5.g gVar, int i10) {
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void h(n5.g gVar, int i10) {
    }

    @Override // n5.i
    public void i(n5.g gVar, String str) {
        m5.k kVar;
        r5.b bVar = s.i;
        s sVar = this.a;
        int i10 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(sVar.e));
        if (sVar.a.y && sVar.e == 2) {
            if (sVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                o5.h a2 = sVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    m5.s sVar2 = sVar.h;
                    if (sVar2 != null && (kVar = sVar2.a) != null) {
                        o5.h.k.b("resume SessionState", new Object[0]);
                        y5.l.e("Must be called from the main thread.");
                        if (a2.w()) {
                            o5.h.x(new o5.j(a2, kVar, i10));
                        } else {
                            o5.h.t();
                        }
                    }
                }
            }
        }
        sVar.c();
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void j(n5.g gVar, String str) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        s sVar = this.a;
        sVar.getClass();
        r5.b bVar = s.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        sVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        s sVar = this.a;
        sVar.h = (m5.s) obj;
        c0.i iVar = sVar.g;
        if (iVar != null) {
            iVar.a();
        }
    }
}
