package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ji0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m4(i5 i5Var, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = i5Var;
        this.f = hashMap;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                i5 i5Var = (i5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (v2.a) {
                    f8.b("sync contacts by alert");
                }
                i5Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                break;
            default:
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) obj2;
                Activity activity = (Activity) obj;
                if (ayVar.getParentActivity() != null) {
                    int i11 = 0;
                    ayVar.t2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        ayVar.A0 = true;
                        if (!z10 || !ji0.J0(activity)) {
                            if (!z11 || !ayVar.U1 || !ayVar.getUserConfig().U || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    ayVar.t3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.f5) {
                                    org.telegram.ui.ActionBar.x1 v = ((org.telegram.ui.f5) activity).v(R.raw.permission_request_folder, cd.L0(2131747315, null));
                                    ayVar.T1 = v;
                                    ayVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(activity, new org.telegram.ui.lv(ayVar, i11)).a;
                                ayVar.T1 = x1Var;
                                ayVar.showDialog(x1Var);
                                break;
                            }
                        } else {
                            w7.c6.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.um(new org.telegram.ui.Components.vg(16, ayVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ m4(org.telegram.ui.ay ayVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = ayVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
