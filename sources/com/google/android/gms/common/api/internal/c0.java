package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c0 extends l0 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, k0 k0Var, k6.a aVar) {
        super(k0Var);
        this.d = d0Var;
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void a() {
        n6.h l0Var;
        int i10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((d0) obj).c.e((k6.a) obj2);
                break;
            default:
                g0 g0Var = (g0) obj2;
                o8.h hVar = (o8.h) obj;
                if (g0Var.i(0)) {
                    k6.a aVar = hVar.b;
                    if (!aVar.c()) {
                        if (g0Var.w && !aVar.b()) {
                            g0Var.a();
                            g0Var.h();
                            break;
                        } else {
                            g0Var.e(aVar);
                            break;
                        }
                    } else {
                        n6.v vVar = hVar.c;
                        n6.l.h(vVar);
                        k6.a aVar2 = vVar.c;
                        if (!aVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                            g0Var.e(aVar2);
                            break;
                        } else {
                            g0Var.y = true;
                            IBinder iBinder = vVar.b;
                            if (iBinder == null) {
                                l0Var = null;
                            } else {
                                int i11 = n6.a.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                l0Var = queryLocalInterface instanceof n6.h ? (n6.h) queryLocalInterface : new n6.l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                            }
                            n6.l.h(l0Var);
                            g0Var.E = l0Var;
                            g0Var.F = vVar.d;
                            g0Var.G = vVar.e;
                            g0Var.h();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, g0 g0Var2, o8.h hVar) {
        super(g0Var);
        this.c = g0Var2;
        this.d = hVar;
    }
}
