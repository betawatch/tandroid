package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends f0 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, e0 e0Var, m6.a aVar) {
        super(e0Var);
        this.c = aVar;
        this.d = yVar;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void a() {
        p6.i m0Var;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ((y) obj).c.g((m6.a) obj2);
                break;
            default:
                b0 b0Var = (b0) obj2;
                q8.h hVar = (q8.h) obj;
                if (b0Var.i(0)) {
                    m6.a aVar = hVar.b;
                    if (!aVar.c()) {
                        if (b0Var.x && !aVar.b()) {
                            b0Var.f();
                            b0Var.c();
                            break;
                        } else {
                            b0Var.g(aVar);
                            break;
                        }
                    } else {
                        p6.x xVar = hVar.c;
                        p6.m.g(xVar);
                        m6.a aVar2 = xVar.c;
                        if (!aVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                            b0Var.g(aVar2);
                            break;
                        } else {
                            b0Var.E = true;
                            IBinder iBinder = xVar.b;
                            if (iBinder == null) {
                                m0Var = null;
                            } else {
                                int i10 = p6.a.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                m0Var = queryLocalInterface instanceof p6.i ? (p6.i) queryLocalInterface : new p6.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                            }
                            p6.m.g(m0Var);
                            b0Var.F = m0Var;
                            b0Var.G = xVar.d;
                            b0Var.H = xVar.e;
                            b0Var.c();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, b0 b0Var, b0 b0Var2, q8.h hVar) {
        super(b0Var);
        this.c = b0Var2;
        this.d = hVar;
    }
}
