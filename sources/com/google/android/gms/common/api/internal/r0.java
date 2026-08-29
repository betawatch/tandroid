package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(p pVar, o oVar) {
        this.a = 1;
        this.b = pVar;
        this.c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z5.h hVar;
        z5.h hVar2 = null;
        switch (this.a) {
            case 0:
                w5.a aVar = (w5.a) this.b;
                s0 s0Var = (s0) this.c;
                com.google.android.gms.common.api.c cVar = s0Var.a;
                p0 p0Var = (p0) s0Var.f.s.get(s0Var.b);
                if (p0Var != null) {
                    if (!aVar.c()) {
                        p0Var.m(aVar, null);
                        break;
                    } else {
                        s0Var.e = true;
                        if (!cVar.p()) {
                            try {
                                cVar.m(null, cVar.b());
                                break;
                            } catch (SecurityException e10) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                                cVar.c("Failed to get service from broker.");
                                p0Var.m(new w5.a(10), null);
                                return;
                            }
                        } else if (s0Var.e && (hVar = s0Var.c) != null) {
                            cVar.m(hVar, s0Var.d);
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
                    oVar.k(obj);
                    break;
                }
                break;
            default:
                d1 d1Var = (d1) this.c;
                a8.h hVar3 = (a8.h) this.b;
                w5.a aVar2 = hVar3.b;
                if (aVar2.c()) {
                    z5.v vVar = hVar3.c;
                    z5.l.h(vVar);
                    w5.a aVar3 = vVar.c;
                    if (!aVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        d1Var.j.b(aVar3);
                        d1Var.i.disconnect();
                        break;
                    } else {
                        s0 s0Var2 = d1Var.j;
                        IBinder iBinder = vVar.b;
                        if (iBinder != null) {
                            int i10 = z5.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            hVar2 = queryLocalInterface instanceof z5.h ? (z5.h) queryLocalInterface : new z5.l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                        }
                        Set set = d1Var.e;
                        s0Var2.getClass();
                        if (hVar2 == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            s0Var2.b(new w5.a(4));
                        } else {
                            s0Var2.c = hVar2;
                            s0Var2.d = set;
                            if (s0Var2.e) {
                                s0Var2.a.m(hVar2, set);
                            }
                        }
                    }
                } else {
                    d1Var.j.b(aVar2);
                }
                d1Var.i.disconnect();
                break;
        }
    }

    public /* synthetic */ r0(Object obj, a6.a aVar, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = aVar;
    }
}
