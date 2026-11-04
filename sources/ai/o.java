package ai;

import android.app.Activity;
import android.content.DialogInterface;
import ei.p7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                z zVar = (z) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                Activity activity = (Activity) this.b;
                org.telegram.messenger.g0.v1(zVar);
                if (d2Var != null) {
                    org.telegram.messenger.g0.a3(activity, d2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                u4 u4Var = (u4) this.c;
                u3 u3Var = (u3) this.d;
                Activity activity2 = (Activity) this.b;
                org.telegram.messenger.g0.v1(u3Var);
                org.telegram.messenger.g0.a3(activity2, u4Var.a.getClassGuid());
                break;
            case 2:
                ii.s0 s0Var = (ii.s0) this.c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.b;
                s0Var.getClass();
                if (!zArr[0]) {
                    s0Var.d = true;
                    s0Var.e = false;
                    s0Var.k();
                    Iterator it = s0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    pVar.a(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                u10 u10Var = (u10) this.b;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    u10Var.a("USER_DECLINED");
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.d;
                Activity activity3 = (Activity) this.b;
                org.telegram.messenger.g0.v1(s4Var);
                if (d2Var2 != null) {
                    org.telegram.messenger.g0.a3(activity3, d2Var2.getClassGuid());
                    break;
                }
                break;
            case 5:
                u10 u10Var2 = (u10) this.c;
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.d;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) this.b;
                u10Var2.a(Integer.valueOf(o3Var.getValue() + (m3Var.getValue() * 60)));
                break;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                p7 p7Var = (p7) this.b;
                w0Var.getClass();
                if (!atomicBoolean.get()) {
                    w0Var.x(p7Var, "popup_closed", new JSONObject());
                }
                w0Var.d0 = null;
                w0Var.f0 = System.currentTimeMillis();
                break;
        }
    }
}
