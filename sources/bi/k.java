package bi;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                Activity activity = (Activity) this.b;
                org.telegram.messenger.g0.v1(uVar);
                if (h2Var != null) {
                    org.telegram.messenger.g0.Z2(activity, h2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                p6 p6Var = (p6) this.c;
                q5 q5Var = (q5) this.d;
                Activity activity2 = (Activity) this.b;
                org.telegram.messenger.g0.v1(q5Var);
                org.telegram.messenger.g0.Z2(activity2, p6Var.a.getClassGuid());
                break;
            case 2:
                ki.s0 s0Var = (ki.s0) this.c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.b;
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
                    oVar.a(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                x10 x10Var = (x10) this.b;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    x10Var.a("USER_DECLINED");
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.c;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.d;
                Activity activity3 = (Activity) this.b;
                org.telegram.messenger.g0.v1(a5Var);
                if (h2Var2 != null) {
                    org.telegram.messenger.g0.Z2(activity3, h2Var2.getClassGuid());
                    break;
                }
                break;
            case 5:
                x10 x10Var2 = (x10) this.c;
                org.telegram.ui.Components.u3 u3Var = (org.telegram.ui.Components.u3) this.d;
                org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) this.b;
                x10Var2.a(Integer.valueOf(w3Var.getValue() + (u3Var.getValue() * 60)));
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
