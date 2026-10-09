package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements OnSuccessListener, OnFailureListener, d6.h {
    public final /* synthetic */ u a;

    public /* synthetic */ s(u uVar) {
        this.a = uVar;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void d(d6.f fVar, String str) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void g(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void h(d6.f fVar, boolean z10) {
    }

    @Override // d6.h
    public void j(d6.f fVar, int i10) {
        g6.b bVar = u.i;
        bVar.b("onSessionEnded with error = %d", Integer.valueOf(i10));
        u uVar = this.a;
        int i11 = uVar.e;
        if (i11 != 0) {
            if (uVar.h != null) {
                bVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i11), uVar.h);
                Iterator it = new HashSet(uVar.b).iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    int i12 = uVar.e;
                    switch (y0Var.a) {
                        case 0:
                            a1.j.b("onTransferred with type = %d", Integer.valueOf(i12));
                            a1 a1Var = (a1) y0Var.b;
                            a1Var.c();
                            r1 b10 = a1Var.c.b(a1Var.g);
                            m1 m10 = n1.m(b10.d());
                            m10.c();
                            n1.v((n1) m10.b, i12);
                            b10.e((n1) m10.a());
                            a1Var.a.a((s1) b10.a(), TLRPC.LAYER);
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
        if (uVar.e == 2) {
            return;
        }
        uVar.c();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void o(d6.f fVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        u uVar = this.a;
        uVar.getClass();
        g6.b bVar = u.i;
        Log.w(bVar.a, bVar.d("Fail to store SessionState", new Object[0]), exc);
        uVar.b(100);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        u uVar = this.a;
        uVar.h = (c6.r) obj;
        c0.i iVar = uVar.g;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void u(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void v(d6.f fVar) {
    }

    @Override // d6.h
    public void x(d6.f fVar, String str) {
        c6.k kVar;
        g6.b bVar = u.i;
        u uVar = this.a;
        int i10 = 1;
        bVar.b("onSessionStarted with transferType = %d", Integer.valueOf(uVar.e));
        if (uVar.a.y && uVar.e == 2) {
            if (uVar.h == null) {
                bVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                e6.h a2 = uVar.a();
                if (a2 == null) {
                    bVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    bVar.b("resume SessionState to current session", new Object[0]);
                    c6.r rVar = uVar.h;
                    if (rVar != null && (kVar = rVar.a) != null) {
                        e6.h.k.b("resume SessionState", new Object[0]);
                        n6.l.e("Must be called from the main thread.");
                        if (a2.w()) {
                            e6.h.x(new e6.k(a2, kVar, i10));
                        } else {
                            e6.h.t();
                        }
                    }
                }
            }
        }
        uVar.c();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void y(d6.f fVar, int i10) {
    }
}
