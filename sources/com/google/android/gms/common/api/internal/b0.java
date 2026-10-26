package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b0 extends k0 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, j0 j0Var, l6.a aVar) {
        super(j0Var);
        this.d = c0Var;
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void a() {
        o6.h l0Var;
        int i10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((c0) obj).c.f((l6.a) obj2);
                break;
            default:
                f0 f0Var = (f0) obj2;
                p8.h hVar = (p8.h) obj;
                if (f0Var.i(0)) {
                    l6.a aVar = hVar.b;
                    if (!aVar.c()) {
                        if (f0Var.w && !aVar.b()) {
                            f0Var.a();
                            f0Var.h();
                            break;
                        } else {
                            f0Var.f(aVar);
                            break;
                        }
                    } else {
                        o6.v vVar = hVar.c;
                        o6.l.h(vVar);
                        l6.a aVar2 = vVar.c;
                        if (!aVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                            f0Var.f(aVar2);
                            break;
                        } else {
                            f0Var.y = true;
                            IBinder iBinder = vVar.b;
                            if (iBinder == null) {
                                l0Var = null;
                            } else {
                                int i11 = o6.a.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                l0Var = queryLocalInterface instanceof o6.h ? (o6.h) queryLocalInterface : new o6.l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                            }
                            o6.l.h(l0Var);
                            f0Var.E = l0Var;
                            f0Var.F = vVar.d;
                            f0Var.G = vVar.e;
                            f0Var.h();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, f0 f0Var2, p8.h hVar) {
        super(f0Var);
        this.c = f0Var2;
        this.d = hVar;
    }
}
