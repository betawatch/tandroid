package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.qy;
import org.telegram.ui.ey;
import org.telegram.ui.mv;
import org.telegram.ui.uj0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f = hashMap;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f, this.b, this.c, this.d);
                break;
            default:
                ey eyVar = (ey) this.e;
                Activity activity = (Activity) this.f;
                if (eyVar.getParentActivity() != null) {
                    eyVar.t2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        eyVar.A0 = true;
                        if (!z10 || !uj0.n(activity)) {
                            if (!z11 || !eyVar.U1 || !eyVar.getUserConfig().syncContacts || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    eyVar.g3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.l5) {
                                    org.telegram.ui.ActionBar.c2 v = ((org.telegram.ui.l5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                    eyVar.T1 = v;
                                    eyVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.f5.w(activity, new mv(eyVar, 0)).a;
                                eyVar.T1 = c2Var;
                                eyVar.showDialog(c2Var);
                                break;
                            }
                        } else {
                            af0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new nn(1, new qy(8, eyVar, activity)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ r1(ey eyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = eyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
