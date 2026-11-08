package hi;

import android.app.Activity;
import android.content.DialogInterface;
import di.o7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.u4;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.c;
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.d;
                r0Var.getClass();
                if (!zArr[0]) {
                    r0Var.d = true;
                    r0Var.e = false;
                    r0Var.k();
                    Iterator it = r0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    nVar.a(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = (boolean[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                c20 c20Var = (c20) this.d;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    c20Var.a("USER_DECLINED");
                    break;
                }
                break;
            case 2:
                u4 u4Var = (u4) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.b;
                Activity activity = (Activity) this.d;
                org.telegram.messenger.g0.v1(u4Var);
                if (f2Var != null) {
                    org.telegram.messenger.g0.a3(activity, f2Var.getClassGuid());
                    break;
                }
                break;
            case 3:
                c20 c20Var2 = (c20) this.c;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) this.b;
                org.telegram.ui.Components.q3 q3Var = (org.telegram.ui.Components.q3) this.d;
                c20Var2.a(Integer.valueOf(q3Var.getValue() + (o3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                o7 o7Var = (o7) this.d;
                x0Var.getClass();
                if (!atomicBoolean.get()) {
                    x0Var.x(o7Var, "popup_closed", new JSONObject());
                }
                x0Var.c0 = null;
                x0Var.e0 = System.currentTimeMillis();
                break;
            case 5:
                z5 z5Var = (z5) this.c;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.b;
                Activity activity2 = (Activity) this.d;
                org.telegram.messenger.g0.v1(z5Var);
                if (f2Var2 != null) {
                    org.telegram.messenger.g0.a3(activity2, f2Var2.getClassGuid());
                    break;
                }
                break;
            default:
                zh.d2 d2Var = (zh.d2) this.c;
                zh.n1 n1Var = (zh.n1) this.b;
                Activity activity3 = (Activity) this.d;
                org.telegram.messenger.g0.v1(n1Var);
                org.telegram.messenger.g0.a3(activity3, d2Var.a.getClassGuid());
                break;
        }
    }

    public /* synthetic */ o0(boolean[] zArr, boolean[] zArr2, c20 c20Var) {
        this.a = 1;
        this.b = zArr;
        this.c = zArr2;
        this.d = c20Var;
    }
}
