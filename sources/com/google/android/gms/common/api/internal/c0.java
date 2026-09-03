package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends l0 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, k0 k0Var, y5.a aVar) {
        super(k0Var);
        this.d = d0Var;
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void a() {
        b6.i m0Var;
        int i10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((d0) obj).c.g((y5.a) obj2);
                break;
            default:
                g0 g0Var = (g0) obj2;
                c8.h hVar = (c8.h) obj;
                if (g0Var.j(0)) {
                    y5.a aVar = hVar.b;
                    if (!aVar.f()) {
                        if (g0Var.w && !aVar.e()) {
                            g0Var.a();
                            g0Var.i();
                            break;
                        } else {
                            g0Var.g(aVar);
                            break;
                        }
                    } else {
                        b6.w wVar = hVar.c;
                        b6.m.h(wVar);
                        y5.a aVar2 = wVar.c;
                        if (!aVar2.f()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                            g0Var.g(aVar2);
                            break;
                        } else {
                            g0Var.y = true;
                            IBinder iBinder = wVar.b;
                            if (iBinder == null) {
                                m0Var = null;
                            } else {
                                int i11 = b6.a.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                m0Var = queryLocalInterface instanceof b6.i ? (b6.i) queryLocalInterface : new b6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                            }
                            b6.m.h(m0Var);
                            g0Var.B = m0Var;
                            g0Var.C = wVar.d;
                            g0Var.D = wVar.e;
                            g0Var.i();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, g0 g0Var2, c8.h hVar) {
        super(g0Var);
        this.c = g0Var2;
        this.d = hVar;
    }
}
