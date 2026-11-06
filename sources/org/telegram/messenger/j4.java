package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.dh0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j4(g5 g5Var, HashMap hashMap, boolean z9, boolean z10, boolean z11) {
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
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj2;
                Activity activity = (Activity) obj;
                if (wwVar.getParentActivity() != null) {
                    int i10 = 0;
                    wwVar.t2 = false;
                    boolean z9 = this.b;
                    boolean z10 = this.c;
                    boolean z11 = this.d;
                    if (z9 || z10 || z11) {
                        wwVar.A0 = true;
                        if (!z9 || !dh0.J0(activity)) {
                            if (!z10 || !wwVar.U1 || !wwVar.getUserConfig().U || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z11 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    wwVar.u3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.g5) {
                                    org.telegram.ui.ActionBar.u1 v = ((org.telegram.ui.g5) activity).v(R.raw.permission_request_folder, hd.M0(2131747298, null));
                                    wwVar.T1 = v;
                                    wwVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.v(activity, new org.telegram.ui.iu(wwVar, i10)).a;
                                wwVar.T1 = u1Var;
                                wwVar.showDialog(u1Var);
                                break;
                            }
                        } else {
                            c8.ia.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.mm(new org.telegram.ui.Components.ex(10, wwVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ j4(org.telegram.ui.ww wwVar, boolean z9, boolean z10, boolean z11, Activity activity) {
        this.e = wwVar;
        this.b = z9;
        this.c = z10;
        this.d = z11;
        this.f = activity;
    }
}
