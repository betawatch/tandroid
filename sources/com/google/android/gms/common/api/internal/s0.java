package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(p pVar, o oVar) {
        this.a = 1;
        this.b = pVar;
        this.c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n6.h hVar;
        n6.h hVar2 = null;
        switch (this.a) {
            case 0:
                k6.a aVar = (k6.a) this.b;
                t0 t0Var = (t0) this.c;
                com.google.android.gms.common.api.c cVar = t0Var.a;
                q0 q0Var = (q0) t0Var.f.s.get(t0Var.b);
                if (q0Var != null) {
                    if (!aVar.c()) {
                        q0Var.m(aVar, null);
                        break;
                    } else {
                        t0Var.e = true;
                        if (!cVar.q()) {
                            try {
                                cVar.c(null, cVar.d());
                                break;
                            } catch (SecurityException e) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                                cVar.e("Failed to get service from broker.");
                                q0Var.m(new k6.a(10), null);
                                return;
                            }
                        } else if (t0Var.e && (hVar = t0Var.c) != null) {
                            cVar.c(hVar, t0Var.d);
                            break;
                        }
                    }
                }
                break;
            case 1:
                p pVar = (p) this.b;
                o oVar = (o) this.c;
                Object obj = pVar.b;
                if (obj != null) {
                    oVar.i(obj);
                    break;
                }
                break;
            default:
                e1 e1Var = (e1) this.c;
                o8.h hVar3 = (o8.h) this.b;
                k6.a aVar2 = hVar3.b;
                if (aVar2.c()) {
                    n6.v vVar = hVar3.c;
                    n6.l.g(vVar);
                    k6.a aVar3 = vVar.c;
                    if (!aVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        e1Var.j.b(aVar3);
                        e1Var.i.j();
                        break;
                    } else {
                        t0 t0Var2 = e1Var.j;
                        IBinder iBinder = vVar.b;
                        if (iBinder != null) {
                            int i10 = n6.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            hVar2 = queryLocalInterface instanceof n6.h ? (n6.h) queryLocalInterface : new n6.l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                        }
                        Set set = e1Var.e;
                        t0Var2.getClass();
                        if (hVar2 == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            t0Var2.b(new k6.a(4));
                        } else {
                            t0Var2.c = hVar2;
                            t0Var2.d = set;
                            if (t0Var2.e) {
                                t0Var2.a.c(hVar2, set);
                            }
                        }
                    }
                } else {
                    e1Var.j.b(aVar2);
                }
                e1Var.i.j();
                break;
        }
    }

    public /* synthetic */ s0(Object obj, o6.a aVar, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = aVar;
    }
}
