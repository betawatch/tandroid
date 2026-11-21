package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class y extends h0 {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, g0 g0Var, n6.a aVar) {
        super(g0Var);
        this.c = aVar;
        this.d = zVar;
    }

    @Override // com.google.android.gms.common.api.internal.h0
    public final void a() {
        q6.i m0Var;
        int i7 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                ((z) obj).c.h((n6.a) obj2);
                break;
            default:
                c0 c0Var = (c0) obj2;
                r8.h hVar = (r8.h) obj;
                if (c0Var.j(0)) {
                    n6.a aVar = hVar.b;
                    if (!aVar.c()) {
                        if (c0Var.x && !aVar.b()) {
                            c0Var.g();
                            c0Var.c();
                            break;
                        } else {
                            c0Var.h(aVar);
                            break;
                        }
                    } else {
                        q6.x xVar = hVar.c;
                        q6.m.h(xVar);
                        n6.a aVar2 = xVar.c;
                        if (!aVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                            c0Var.h(aVar2);
                            break;
                        } else {
                            c0Var.E = true;
                            IBinder iBinder = xVar.b;
                            if (iBinder == null) {
                                m0Var = null;
                            } else {
                                int i10 = q6.a.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                m0Var = queryLocalInterface instanceof q6.i ? (q6.i) queryLocalInterface : new q6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                            }
                            q6.m.h(m0Var);
                            c0Var.F = m0Var;
                            c0Var.G = xVar.d;
                            c0Var.H = xVar.e;
                            c0Var.c();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, c0 c0Var, c0 c0Var2, r8.h hVar) {
        super(c0Var);
        this.c = c0Var2;
        this.d = hVar;
    }
}
