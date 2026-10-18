package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.we0;
import org.telegram.ui.ey;
import org.telegram.ui.mv;
import org.telegram.ui.rj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
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
                        if (!z10 || !rj0.o(activity)) {
                            if (!z11 || !eyVar.U1 || !eyVar.getUserConfig().syncContacts || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    eyVar.h3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.m5) {
                                    org.telegram.ui.ActionBar.b2 v = ((org.telegram.ui.m5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                    eyVar.T1 = v;
                                    eyVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.v(activity, new mv(eyVar, 0)).a;
                                eyVar.T1 = b2Var;
                                eyVar.showDialog(b2Var);
                                break;
                            }
                        } else {
                            we0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new nn(1, new qy(8, eyVar, activity)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ q1(ey eyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = eyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
