package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class x extends f0 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, e0 e0Var, n6.a aVar) {
        super(e0Var);
        this.c = aVar;
        this.d = yVar;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void a() {
        q6.i m0Var;
        int i7 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                ((y) obj).c.h((n6.a) obj2);
                break;
            default:
                b0 b0Var = (b0) obj2;
                r8.h hVar = (r8.h) obj;
                if (b0Var.j(0)) {
                    n6.a aVar = hVar.b;
                    if (!aVar.c()) {
                        if (b0Var.x && !aVar.b()) {
                            b0Var.g();
                            b0Var.d();
                            break;
                        } else {
                            b0Var.h(aVar);
                            break;
                        }
                    } else {
                        q6.x xVar = hVar.c;
                        q6.m.g(xVar);
                        n6.a aVar2 = xVar.c;
                        if (!aVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                            b0Var.h(aVar2);
                            break;
                        } else {
                            b0Var.D = true;
                            IBinder iBinder = xVar.b;
                            if (iBinder == null) {
                                m0Var = null;
                            } else {
                                int i10 = q6.a.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                m0Var = queryLocalInterface instanceof q6.i ? (q6.i) queryLocalInterface : new q6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                            }
                            q6.m.g(m0Var);
                            b0Var.E = m0Var;
                            b0Var.F = xVar.d;
                            b0Var.G = xVar.e;
                            b0Var.d();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, b0 b0Var, b0 b0Var2, r8.h hVar) {
        super(b0Var);
        this.c = b0Var2;
        this.d = hVar;
    }
}
