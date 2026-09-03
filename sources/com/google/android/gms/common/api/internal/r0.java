package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        b6.i iVar;
        b6.i iVar2 = null;
        switch (this.a) {
            case 0:
                y5.a aVar = (y5.a) this.b;
                s0 s0Var = (s0) this.c;
                com.google.android.gms.common.api.c cVar = s0Var.a;
                p0 p0Var = (p0) s0Var.f.s.get(s0Var.b);
                if (p0Var != null) {
                    if (!aVar.f()) {
                        p0Var.m(aVar, null);
                        break;
                    } else {
                        s0Var.e = true;
                        if (!cVar.p()) {
                            try {
                                cVar.i(null, cVar.b());
                                break;
                            } catch (SecurityException e) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                                cVar.c("Failed to get service from broker.");
                                p0Var.m(new y5.a(10), null);
                                return;
                            }
                        } else if (s0Var.e && (iVar = s0Var.c) != null) {
                            cVar.i(iVar, s0Var.d);
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
                    oVar.g(obj);
                    break;
                }
                break;
            default:
                e1 e1Var = (e1) this.c;
                c8.h hVar = (c8.h) this.b;
                y5.a aVar2 = hVar.b;
                if (aVar2.f()) {
                    b6.w wVar = hVar.c;
                    b6.m.h(wVar);
                    y5.a aVar3 = wVar.c;
                    if (!aVar3.f()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        e1Var.j.b(aVar3);
                        e1Var.i.disconnect();
                        break;
                    } else {
                        s0 s0Var2 = e1Var.j;
                        IBinder iBinder = wVar.b;
                        if (iBinder != null) {
                            int i10 = b6.a.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            iVar2 = queryLocalInterface instanceof b6.i ? (b6.i) queryLocalInterface : new b6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                        }
                        Set set = e1Var.e;
                        s0Var2.getClass();
                        if (iVar2 == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            s0Var2.b(new y5.a(4));
                        } else {
                            s0Var2.c = iVar2;
                            s0Var2.d = set;
                            if (s0Var2.e) {
                                s0Var2.a.i(iVar2, set);
                            }
                        }
                    }
                } else {
                    e1Var.j.b(aVar2);
                }
                e1Var.i.disconnect();
                break;
        }
    }

    public /* synthetic */ r0(Object obj, c6.a aVar, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = aVar;
    }
}
