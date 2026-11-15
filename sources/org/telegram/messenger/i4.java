package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.fh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i4(g5 g5Var, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = g5Var;
        this.f = hashMap;
        this.b = z10;
        this.c = z11;
        this.d = z12;
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
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj2;
                Activity activity = (Activity) obj;
                if (ywVar.getParentActivity() != null) {
                    int i10 = 0;
                    ywVar.v2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        ywVar.B0 = true;
                        if (!z10 || !fh0.J0(activity)) {
                            if (!z11 || !ywVar.W1 || !ywVar.getUserConfig().V || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    ywVar.u3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.g5) {
                                    org.telegram.ui.ActionBar.t1 v = ((org.telegram.ui.g5) activity).v(R.raw.permission_request_folder, hd.M0(2131747299, null));
                                    ywVar.V1 = v;
                                    ywVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.v(activity, new org.telegram.ui.ku(ywVar, i10)).a;
                                ywVar.V1 = t1Var;
                                ywVar.showDialog(t1Var);
                                break;
                            }
                        } else {
                            c8.ka.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.um(new org.telegram.ui.Components.gh(15, ywVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ i4(org.telegram.ui.yw ywVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = ywVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
