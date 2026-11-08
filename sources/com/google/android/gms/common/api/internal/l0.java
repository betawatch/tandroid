package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        q6.i iVar;
        q6.i m0Var;
        switch (this.a) {
            case 0:
                n6.a aVar = (n6.a) this.b;
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
                                q6.h hVar = (q6.h) cVar;
                                cVar.g(null, hVar.f() ? hVar.E : Collections.EMPTY_SET);
                                break;
                            } catch (SecurityException e10) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                                ((q6.d) cVar).j("Failed to get service from broker.");
                                j0Var.l(new n6.a(10, null, null), null);
                                return;
                            }
                        } else if (m0Var2.e && (iVar = m0Var2.c) != null) {
                            cVar.g(iVar, m0Var2.d);
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
                    nVar.f(mVar.a);
                    break;
                }
                break;
            default:
                v0 v0Var = (v0) this.c;
                r8.h hVar2 = (r8.h) this.b;
                v0Var.getClass();
                n6.a aVar2 = hVar2.b;
                if (aVar2.c()) {
                    q6.x xVar = hVar2.c;
                    q6.m.g(xVar);
                    n6.a aVar3 = xVar.c;
                    if (!aVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        v0Var.j.b(aVar3);
                        v0Var.i.a();
                        break;
                    } else {
                        m0 m0Var3 = v0Var.j;
                        IBinder iBinder = xVar.b;
                        if (iBinder == null) {
                            m0Var = null;
                        } else {
                            int i7 = q6.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            m0Var = queryLocalInterface instanceof q6.i ? (q6.i) queryLocalInterface : new q6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                        }
                        Set set = v0Var.e;
                        m0Var3.getClass();
                        if (m0Var == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            m0Var3.b(new n6.a(4, null, null));
                        } else {
                            m0Var3.c = m0Var;
                            m0Var3.d = set;
                            if (m0Var3.e) {
                                m0Var3.a.g(m0Var, set);
                            }
                        }
                    }
                } else {
                    v0Var.j.b(aVar2);
                }
                v0Var.i.a();
                break;
        }
    }

    public /* synthetic */ l0(Object obj, r6.a aVar, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = obj;
    }
}
