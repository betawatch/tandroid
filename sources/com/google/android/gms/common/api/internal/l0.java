package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(o oVar, n nVar) {
        this.a = 1;
        this.b = oVar;
        this.c = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p6.i iVar;
        p6.i m0Var;
        switch (this.a) {
            case 0:
                m6.a aVar = (m6.a) this.b;
                m0 m0Var2 = (m0) this.c;
                g gVar = m0Var2.f;
                com.google.android.gms.common.api.c cVar = m0Var2.a;
                j0 j0Var = (j0) gVar.s.get(m0Var2.b);
                if (j0Var != null) {
                    if (!aVar.c()) {
                        j0Var.l(aVar, null);
                        break;
                    } else {
                        m0Var2.e = true;
                        if (!cVar.f()) {
                            try {
                                p6.h hVar = (p6.h) cVar;
                                ((p6.d) cVar).l(null, hVar.f() ? hVar.E : Collections.EMPTY_SET);
                                break;
                            } catch (SecurityException e10) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                                ((p6.d) cVar).h("Failed to get service from broker.");
                                j0Var.l(new m6.a(10, null, null), null);
                                return;
                            }
                        } else if (m0Var2.e && (iVar = m0Var2.c) != null) {
                            ((p6.d) cVar).l(iVar, m0Var2.d);
                            break;
                        }
                    }
                }
                break;
            case 1:
                o oVar = (o) this.b;
                n nVar = (n) this.c;
                m mVar = oVar.b;
                if (mVar != null) {
                    nVar.c(mVar.a);
                    break;
                }
                break;
            default:
                w0 w0Var = (w0) this.c;
                q8.h hVar2 = (q8.h) this.b;
                w0Var.getClass();
                m6.a aVar2 = hVar2.b;
                if (aVar2.c()) {
                    p6.x xVar = hVar2.c;
                    p6.m.g(xVar);
                    m6.a aVar3 = xVar.c;
                    if (!aVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        w0Var.j.b(aVar3);
                        w0Var.i.a();
                        break;
                    } else {
                        m0 m0Var3 = w0Var.j;
                        IBinder iBinder = xVar.b;
                        if (iBinder == null) {
                            m0Var = null;
                        } else {
                            int i3 = p6.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            m0Var = queryLocalInterface instanceof p6.i ? (p6.i) queryLocalInterface : new p6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                        }
                        Set set = w0Var.e;
                        m0Var3.getClass();
                        if (m0Var == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            m0Var3.b(new m6.a(4, null, null));
                        } else {
                            m0Var3.c = m0Var;
                            m0Var3.d = set;
                            if (m0Var3.e) {
                                ((p6.d) m0Var3.a).l(m0Var, set);
                            }
                        }
                    }
                } else {
                    w0Var.j.b(aVar2);
                }
                w0Var.i.a();
                break;
        }
    }

    public /* synthetic */ l0(Object obj, q6.a aVar, int i3) {
        this.a = i3;
        this.b = aVar;
        this.c = obj;
    }
}
