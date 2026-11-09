package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.fh0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj2;
                Activity activity = (Activity) obj;
                if (ywVar.getParentActivity() != null) {
                    int i10 = 0;
                    ywVar.u2 = false;
                    boolean z9 = this.b;
                    boolean z10 = this.c;
                    boolean z11 = this.d;
                    if (z9 || z10 || z11) {
                        ywVar.A0 = true;
                        if (!z9 || !fh0.J0(activity)) {
                            if (!z10 || !ywVar.V1 || !ywVar.getUserConfig().U || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z11 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    ywVar.u3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.g5) {
                                    org.telegram.ui.ActionBar.u1 v = ((org.telegram.ui.g5) activity).v(R.raw.permission_request_folder, id.M0(2131747299, null));
                                    ywVar.U1 = v;
                                    ywVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.v(activity, new org.telegram.ui.ku(ywVar, i10)).a;
                                ywVar.U1 = u1Var;
                                ywVar.showDialog(u1Var);
                                break;
                            }
                        } else {
                            c8.ia.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.mm(new org.telegram.ui.Components.fx(10, ywVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ i4(org.telegram.ui.yw ywVar, boolean z9, boolean z10, boolean z11, Activity activity) {
        this.e = ywVar;
        this.b = z9;
        this.c = z10;
        this.d = z11;
        this.f = activity;
    }
}
