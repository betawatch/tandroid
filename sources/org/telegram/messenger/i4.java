package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.gh0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i4(g5 g5Var, HashMap hashMap, boolean z9, boolean z10, boolean z11) {
        this.e = g5Var;
        this.f = hashMap;
        this.b = z9;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                g5 g5Var = (g5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (r2.a) {
                    a8.b("sync contacts by alert");
                }
                g5Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                break;
            default:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) obj2;
                Activity activity = (Activity) obj;
                if (zwVar.getParentActivity() != null) {
                    int i10 = 0;
                    zwVar.u2 = false;
                    boolean z9 = this.b;
                    boolean z10 = this.c;
                    boolean z11 = this.d;
                    if (z9 || z10 || z11) {
                        zwVar.A0 = true;
                        if (!z9 || !gh0.J0(activity)) {
                            if (!z10 || !zwVar.V1 || !zwVar.getUserConfig().U || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z11 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    zwVar.u3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.g5) {
                                    org.telegram.ui.ActionBar.u1 v = ((org.telegram.ui.g5) activity).v(R.raw.permission_request_folder, id.M0(2131747299, null));
                                    zwVar.U1 = v;
                                    zwVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.v(activity, new org.telegram.ui.lu(zwVar, i10)).a;
                                zwVar.U1 = u1Var;
                                zwVar.showDialog(u1Var);
                                break;
                            }
                        } else {
                            c8.ia.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.lm(new org.telegram.ui.Components.ex(10, zwVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ i4(org.telegram.ui.zw zwVar, boolean z9, boolean z10, boolean z11, Activity activity) {
        this.e = zwVar;
        this.b = z9;
        this.c = z10;
        this.d = z11;
        this.f = activity;
    }
}
