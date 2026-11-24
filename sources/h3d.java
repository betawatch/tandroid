// default package

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h3d extends s3d {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3d(i3d i3dVar, r3d r3dVar, ot2 ot2Var) {
        super(r3dVar);
        this.c = ot2Var;
        this.d = i3dVar;
    }

    @Override // s3d
    public final void a() {
        ti5 lgfVar;
        byte b = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((i3d) obj).c.g((ot2) obj2);
                break;
            default:
                l3d l3dVar = (l3d) obj2;
                e5d e5dVar = (e5d) obj;
                if (l3dVar.i(0)) {
                    ot2 ot2Var = e5dVar.b;
                    if (!ot2Var.c()) {
                        if (l3dVar.x && !ot2Var.b()) {
                            l3dVar.f();
                            l3dVar.b();
                            break;
                        } else {
                            l3dVar.g(ot2Var);
                            break;
                        }
                    } else {
                        n5d n5dVar = e5dVar.c;
                        ite.h(n5dVar);
                        ot2 ot2Var2 = n5dVar.c;
                        if (!ot2Var2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ot2Var2)), new Exception());
                            l3dVar.g(ot2Var2);
                            break;
                        } else {
                            l3dVar.E = true;
                            IBinder iBinder = n5dVar.b;
                            if (iBinder == null) {
                                lgfVar = null;
                            } else {
                                int i = e5.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                lgfVar = queryLocalInterface instanceof ti5 ? (ti5) queryLocalInterface : new lgf(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                            ite.h(lgfVar);
                            l3dVar.F = lgfVar;
                            l3dVar.G = n5dVar.d;
                            l3dVar.H = n5dVar.e;
                            l3dVar.b();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3d(j3d j3dVar, l3d l3dVar, l3d l3dVar2, e5d e5dVar) {
        super(l3dVar);
        this.c = l3dVar2;
        this.d = e5dVar;
    }
}
