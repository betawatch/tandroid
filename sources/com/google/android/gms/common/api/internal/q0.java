package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Set;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(p pVar, o oVar) {
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
                r0 r0Var = (r0) this.c;
                com.google.android.gms.common.api.c cVar = r0Var.a;
                o0 o0Var = (o0) r0Var.f.s.get(r0Var.b);
                if (o0Var != null) {
                    if (!aVar.c()) {
                        o0Var.m(aVar, null);
                        break;
                    } else {
                        r0Var.e = true;
                        if (!cVar.p()) {
                            try {
                                cVar.b(null, cVar.c());
                                break;
                            } catch (SecurityException e) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                                cVar.d("Failed to get service from broker.");
                                o0Var.m(new k6.a(10), null);
                                return;
                            }
                        } else if (r0Var.e && (hVar = r0Var.c) != null) {
                            cVar.b(hVar, r0Var.d);
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
                    oVar.o(obj);
                    break;
                }
                break;
            default:
                c1 c1Var = (c1) this.c;
                o8.h hVar3 = (o8.h) this.b;
                k6.a aVar2 = hVar3.b;
                if (aVar2.c()) {
                    n6.v vVar = hVar3.c;
                    n6.l.h(vVar);
                    k6.a aVar3 = vVar.c;
                    if (!aVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        c1Var.j.b(aVar3);
                        c1Var.i.disconnect();
                        break;
                    } else {
                        r0 r0Var2 = c1Var.j;
                        IBinder iBinder = vVar.b;
                        if (iBinder != null) {
                            int i10 = n6.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            hVar2 = queryLocalInterface instanceof n6.h ? (n6.h) queryLocalInterface : new n6.l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                        }
                        Set set = c1Var.e;
                        r0Var2.getClass();
                        if (hVar2 == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            r0Var2.b(new k6.a(4));
                        } else {
                            r0Var2.c = hVar2;
                            r0Var2.d = set;
                            if (r0Var2.e) {
                                r0Var2.a.b(hVar2, set);
                            }
                        }
                    }
                } else {
                    c1Var.j.b(aVar2);
                }
                c1Var.i.disconnect();
                break;
        }
    }

    public /* synthetic */ q0(Object obj, o6.a aVar, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = aVar;
    }
}
