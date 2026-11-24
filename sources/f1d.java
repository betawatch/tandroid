// default package

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f1d extends q1d {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1d(g1d g1dVar, p1d p1dVar, ds2 ds2Var) {
        super(p1dVar);
        this.c = ds2Var;
        this.d = g1dVar;
    }

    @Override // q1d
    public final void a() {
        ug5 kefVar;
        byte b = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((g1d) obj).c.g((ds2) obj2);
                break;
            default:
                j1d j1dVar = (j1d) obj2;
                c3d c3dVar = (c3d) obj;
                if (j1dVar.j(0)) {
                    ds2 ds2Var = c3dVar.b;
                    if (!ds2Var.c()) {
                        if (j1dVar.x && !ds2Var.b()) {
                            j1dVar.f();
                            j1dVar.b();
                            break;
                        } else {
                            j1dVar.g(ds2Var);
                            break;
                        }
                    } else {
                        l3d l3dVar = c3dVar.c;
                        fre.h(l3dVar);
                        ds2 ds2Var2 = l3dVar.c;
                        if (!ds2Var2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ds2Var2)), new Exception());
                            j1dVar.g(ds2Var2);
                            break;
                        } else {
                            j1dVar.E = true;
                            IBinder iBinder = l3dVar.b;
                            if (iBinder == null) {
                                kefVar = null;
                            } else {
                                int i = e5.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                kefVar = queryLocalInterface instanceof ug5 ? (ug5) queryLocalInterface : new kef(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                            fre.h(kefVar);
                            j1dVar.F = kefVar;
                            j1dVar.G = l3dVar.d;
                            j1dVar.H = l3dVar.e;
                            j1dVar.b();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1d(h1d h1dVar, j1d j1dVar, j1d j1dVar2, c3d c3dVar) {
        super(j1dVar);
        this.c = j1dVar2;
        this.d = c3dVar;
    }
}
