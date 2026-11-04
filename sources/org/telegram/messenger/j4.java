package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.zg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j4(g5 g5Var, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = g5Var;
        this.f = hashMap;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i3) {
            case 0:
                g5 g5Var = (g5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (r2.a) {
                    a8.b("sync contacts by alert");
                }
                g5Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                break;
            default:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj2;
                Activity activity = (Activity) obj;
                if (uwVar.getParentActivity() != null) {
                    int i10 = 0;
                    uwVar.u2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        uwVar.B0 = true;
                        if (!z10 || !zg0.J0(activity)) {
                            if (!z11 || !uwVar.V1 || !uwVar.getUserConfig().V || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    uwVar.u3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.i5) {
                                    org.telegram.ui.ActionBar.s1 v = ((org.telegram.ui.i5) activity).v(R.raw.permission_request_folder, bd.M0(2131747307, null));
                                    uwVar.U1 = v;
                                    uwVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.v(activity, new org.telegram.ui.gu(uwVar, i10)).a;
                                uwVar.U1 = s1Var;
                                uwVar.showDialog(s1Var);
                                break;
                            }
                        } else {
                            b8.nf.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.lm(new org.telegram.ui.Components.ei(13, uwVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ j4(org.telegram.ui.uw uwVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = uwVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
