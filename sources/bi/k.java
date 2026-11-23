package bi;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                Activity activity = (Activity) this.b;
                org.telegram.messenger.g0.v1(uVar);
                if (g2Var != null) {
                    org.telegram.messenger.g0.Z2(activity, g2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                v6 v6Var = (v6) this.c;
                w5 w5Var = (w5) this.d;
                Activity activity2 = (Activity) this.b;
                org.telegram.messenger.g0.v1(w5Var);
                org.telegram.messenger.g0.Z2(activity2, v6Var.a.getClassGuid());
                break;
            case 2:
                ki.r0 r0Var = (ki.r0) this.c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.b;
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
                    oVar.a(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                w10 w10Var = (w10) this.b;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    w10Var.a("USER_DECLINED");
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.c;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.d;
                Activity activity3 = (Activity) this.b;
                org.telegram.messenger.g0.v1(a5Var);
                if (g2Var2 != null) {
                    org.telegram.messenger.g0.Z2(activity3, g2Var2.getClassGuid());
                    break;
                }
                break;
            case 5:
                w10 w10Var2 = (w10) this.c;
                org.telegram.ui.Components.u3 u3Var = (org.telegram.ui.Components.u3) this.d;
                org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) this.b;
                w10Var2.a(Integer.valueOf(w3Var.getValue() + (u3Var.getValue() * 60)));
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                fi.f7 f7Var = (fi.f7) this.b;
                v0Var.getClass();
                if (!atomicBoolean.get()) {
                    v0Var.x(f7Var, "popup_closed", new JSONObject());
                }
                v0Var.d0 = null;
                v0Var.f0 = System.currentTimeMillis();
                break;
        }
    }
}
