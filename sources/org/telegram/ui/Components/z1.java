package org.telegram.ui.Components;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r4 r4Var = (r4) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                Activity activity = (Activity) this.d;
                org.telegram.messenger.i0.v1(r4Var);
                if (k2Var != null) {
                    org.telegram.messenger.i0.Z2(activity, k2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.b;
                m3 m3Var = (m3) this.c;
                o3 o3Var = (o3) this.d;
                q20Var.a(Integer.valueOf(o3Var.getValue() + (m3Var.getValue() * 60)));
                break;
            case 2:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                z0Var.getClass();
                if (!atomicBoolean.get()) {
                    z0Var.y(x0Var, "popup_closed", new JSONObject());
                }
                z0Var.c0 = null;
                z0Var.e0 = System.currentTimeMillis();
                break;
            case 3:
                ih.b bVar = (ih.b) this.b;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.c;
                Activity activity2 = (Activity) this.d;
                org.telegram.messenger.i0.v1(bVar);
                if (k2Var2 != null) {
                    org.telegram.messenger.i0.Z2(activity2, k2Var2.getClassGuid());
                    break;
                }
                break;
            case 4:
                ph.j2 j2Var = (ph.j2) this.b;
                ph.t1 t1Var = (ph.t1) this.c;
                Activity activity3 = (Activity) this.d;
                org.telegram.messenger.i0.v1(t1Var);
                org.telegram.messenger.i0.Z2(activity3, j2Var.a.getClassGuid());
                break;
            case 5:
                xh.o0 o0Var = (xh.o0) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
                o0Var.getClass();
                if (!zArr[0]) {
                    o0Var.d = true;
                    o0Var.e = false;
                    o0Var.k();
                    Iterator it = o0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    oVar.a(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) this.d;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    q20Var2.a("USER_DECLINED");
                    break;
                }
                break;
        }
    }
}
