package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n0(o oVar, n nVar) {
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
                o0 o0Var = (o0) this.c;
                g gVar = o0Var.f;
                com.google.android.gms.common.api.c cVar = o0Var.a;
                l0 l0Var = (l0) gVar.s.get(o0Var.b);
                if (l0Var != null) {
                    if (!aVar.c()) {
                        l0Var.l(aVar, null);
                        break;
                    } else {
                        o0Var.e = true;
                        if (!cVar.f()) {
                            try {
                                q6.h hVar = (q6.h) cVar;
                                cVar.g(null, hVar.f() ? hVar.E : Collections.EMPTY_SET);
                                break;
                            } catch (SecurityException e10) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                                ((q6.d) cVar).j("Failed to get service from broker.");
                                l0Var.l(new n6.a(10, null, null), null);
                                return;
                            }
                        } else if (o0Var.e && (iVar = o0Var.c) != null) {
                            cVar.g(iVar, o0Var.d);
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
                    nVar.g(mVar.a);
                    break;
                }
                break;
            default:
                x0 x0Var = (x0) this.c;
                r8.h hVar2 = (r8.h) this.b;
                x0Var.getClass();
                n6.a aVar2 = hVar2.b;
                if (aVar2.c()) {
                    q6.x xVar = hVar2.c;
                    q6.m.g(xVar);
                    n6.a aVar3 = xVar.c;
                    if (!aVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        x0Var.j.b(aVar3);
                        x0Var.i.a();
                        break;
                    } else {
                        o0 o0Var2 = x0Var.j;
                        IBinder iBinder = xVar.b;
                        if (iBinder == null) {
                            m0Var = null;
                        } else {
                            int i7 = q6.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            m0Var = queryLocalInterface instanceof q6.i ? (q6.i) queryLocalInterface : new q6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                        }
                        Set set = x0Var.e;
                        o0Var2.getClass();
                        if (m0Var == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            o0Var2.b(new n6.a(4, null, null));
                        } else {
                            o0Var2.c = m0Var;
                            o0Var2.d = set;
                            if (o0Var2.e) {
                                o0Var2.a.g(m0Var, set);
                            }
                        }
                    }
                } else {
                    x0Var.j.b(aVar2);
                }
                x0Var.i.a();
                break;
        }
    }

    public /* synthetic */ n0(Object obj, r6.a aVar, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = obj;
    }
}
