package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.cy;
import org.telegram.ui.kv;
import org.telegram.ui.pj0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                cy cyVar = (cy) this.e;
                Activity activity = (Activity) this.f;
                if (cyVar.getParentActivity() != null) {
                    cyVar.t2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        cyVar.A0 = true;
                        if (!z10 || !pj0.o(activity)) {
                            if (!z11 || !cyVar.U1 || !cyVar.getUserConfig().syncContacts || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    cyVar.h3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.m5) {
                                    org.telegram.ui.ActionBar.b2 v = ((org.telegram.ui.m5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                    cyVar.T1 = v;
                                    cyVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.v(activity, new kv(cyVar, 0)).a;
                                cyVar.T1 = b2Var;
                                cyVar.showDialog(b2Var);
                                break;
                            }
                        } else {
                            xe0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new nn(1, new qy(8, cyVar, activity)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ r1(cy cyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = cyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
