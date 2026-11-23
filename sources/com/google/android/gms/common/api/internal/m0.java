package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(o oVar, n nVar) {
        this.a = 1;
        this.b = oVar;
        this.c = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        q6.i iVar;
        q6.i m0Var;
        switch (this.a) {
            case 0:
                n6.a aVar = (n6.a) this.b;
                n0 n0Var = (n0) this.c;
                g gVar = n0Var.f;
                com.google.android.gms.common.api.c cVar = n0Var.a;
                k0 k0Var = (k0) gVar.s.get(n0Var.b);
                if (k0Var != null) {
                    if (!aVar.c()) {
                        k0Var.l(aVar, null);
                        break;
                    } else {
                        n0Var.e = true;
                        if (!cVar.f()) {
                            try {
                                q6.h hVar = (q6.h) cVar;
                                cVar.g(null, hVar.f() ? hVar.E : Collections.EMPTY_SET);
                                break;
                            } catch (SecurityException e10) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                                ((q6.d) cVar).j("Failed to get service from broker.");
                                k0Var.l(new n6.a(10, null, null), null);
                                return;
                            }
                        } else if (n0Var.e && (iVar = n0Var.c) != null) {
                            cVar.g(iVar, n0Var.d);
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
                    nVar.g0(mVar.a);
                    break;
                }
                break;
            default:
                w0 w0Var = (w0) this.c;
                r8.h hVar2 = (r8.h) this.b;
                w0Var.getClass();
                n6.a aVar2 = hVar2.b;
                if (aVar2.c()) {
                    q6.x xVar = hVar2.c;
                    q6.m.h(xVar);
                    n6.a aVar3 = xVar.c;
                    if (!aVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        w0Var.j.b(aVar3);
                        w0Var.i.a();
                        break;
                    } else {
                        n0 n0Var2 = w0Var.j;
                        IBinder iBinder = xVar.b;
                        if (iBinder == null) {
                            m0Var = null;
                        } else {
                            int i7 = q6.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            m0Var = queryLocalInterface instanceof q6.i ? (q6.i) queryLocalInterface : new q6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                        }
                        Set set = w0Var.e;
                        n0Var2.getClass();
                        if (m0Var == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            n0Var2.b(new n6.a(4, null, null));
                        } else {
                            n0Var2.c = m0Var;
                            n0Var2.d = set;
                            if (n0Var2.e) {
                                n0Var2.a.g(m0Var, set);
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

    public /* synthetic */ m0(Object obj, r6.a aVar, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = obj;
    }
}
