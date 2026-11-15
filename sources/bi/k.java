package bi;

import android.app.Activity;
import android.content.DialogInterface;
import fi.i7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                Activity activity = (Activity) this.b;
                org.telegram.messenger.g0.v1(uVar);
                if (e2Var != null) {
                    org.telegram.messenger.g0.a3(activity, e2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                i4 i4Var = (i4) this.c;
                j3 j3Var = (j3) this.d;
                Activity activity2 = (Activity) this.b;
                org.telegram.messenger.g0.v1(j3Var);
                org.telegram.messenger.g0.a3(activity2, i4Var.a.getClassGuid());
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
                z10 z10Var = (z10) this.b;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    z10Var.a("USER_DECLINED");
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) this.c;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.d;
                Activity activity3 = (Activity) this.b;
                org.telegram.messenger.g0.v1(s4Var);
                if (e2Var2 != null) {
                    org.telegram.messenger.g0.a3(activity3, e2Var2.getClassGuid());
                    break;
                }
                break;
            case 5:
                z10 z10Var2 = (z10) this.c;
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.d;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) this.b;
                z10Var2.a(Integer.valueOf(o3Var.getValue() + (m3Var.getValue() * 60)));
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                i7 i7Var = (i7) this.b;
                v0Var.getClass();
                if (!atomicBoolean.get()) {
                    v0Var.x(i7Var, "popup_closed", new JSONObject());
                }
                v0Var.d0 = null;
                v0Var.f0 = System.currentTimeMillis();
                break;
        }
    }
}
