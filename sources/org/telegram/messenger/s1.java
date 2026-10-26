package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.ak0;
import org.telegram.ui.cy;
import org.telegram.ui.kv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
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
                cy cyVar = (cy) this.e;
                Activity activity = (Activity) this.f;
                if (cyVar.getParentActivity() != null) {
                    cyVar.t2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        cyVar.A0 = true;
                        if (!z10 || !ak0.n(activity)) {
                            if (!z11 || !cyVar.U1 || !cyVar.getUserConfig().syncContacts || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    cyVar.r3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.k5) {
                                    org.telegram.ui.ActionBar.e2 w10 = ((org.telegram.ui.k5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                    cyVar.T1 = w10;
                                    cyVar.showDialog(w10);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(activity, new kv(cyVar, 0)).a;
                                cyVar.T1 = e2Var;
                                cyVar.showDialog(e2Var);
                                break;
                            }
                        } else {
                            xe0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new on(1, new oy(10, cyVar, activity)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ s1(cy cyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = cyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
