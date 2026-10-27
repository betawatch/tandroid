package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.ck0;
import org.telegram.ui.ey;
import org.telegram.ui.mv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ey eyVar = (ey) this.e;
                Activity activity = (Activity) this.f;
                if (eyVar.getParentActivity() != null) {
                    eyVar.t2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        eyVar.A0 = true;
                        if (!z10 || !ck0.n(activity)) {
                            if (!z11 || !eyVar.U1 || !eyVar.getUserConfig().syncContacts || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    eyVar.r3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.k5) {
                                    org.telegram.ui.ActionBar.e2 w10 = ((org.telegram.ui.k5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                    eyVar.T1 = w10;
                                    eyVar.showDialog(w10);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(activity, new mv(eyVar, 0)).a;
                                eyVar.T1 = e2Var;
                                eyVar.showDialog(e2Var);
                                break;
                            }
                        } else {
                            ye0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new on(1, new oy(10, eyVar, activity)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ s1(ey eyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = eyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
