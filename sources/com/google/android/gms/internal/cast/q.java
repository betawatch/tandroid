package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnSuccessListener, OnFailureListener, r5.h {
    public final /* synthetic */ s a;

    public /* synthetic */ q(s sVar) {
        this.a = sVar;
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void e(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        q5.k kVar;
        u5.b bVar = s.i;
        s sVar = this.a;
        int i10 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(sVar.e));
        if (sVar.a.y && sVar.e == 2) {
            if (sVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                s5.h a2 = sVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    q5.r rVar = sVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
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
        sVar.c();
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void h(r5.f fVar, boolean z4) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void i(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void j(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void k(r5.f fVar) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void l(r5.f fVar, String str) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void n(r5.f fVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        s sVar = this.a;
        sVar.getClass();
        u5.b bVar = s.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        sVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        s sVar = this.a;
        sVar.h = (q5.r) obj;
        c0.i iVar = sVar.g;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // r5.h
    public void q(r5.f fVar, int i10) {
        u5.b bVar = s.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i10));
        s sVar = this.a;
        int i11 = sVar.e;
        if (i11 != 0) {
            if (sVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i11), sVar.h);
                Iterator it = new HashSet(sVar.b).iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    int i12 = sVar.e;
                    switch (y0Var.a) {
                        case 0:
                            a1.j.b("onTransferred with type = %d", Integer.valueOf(i12));
                            a1 a1Var = (a1) y0Var.b;
                            a1Var.c();
                            r1 b10 = a1Var.c.b(a1Var.g);
                            m1 m9 = n1.m(b10.d());
                            m9.c();
                            n1.v((n1) m9.b, i12);
                            b10.e((n1) m9.a());
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
        if (sVar.e == 2) {
            return;
        }
        sVar.c();
    }
}
