package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.dw;
import org.telegram.ui.lk0;
import org.telegram.ui.mt;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                yy yyVar = (yy) this.e;
                Activity activity = (Activity) this.f;
                if (yyVar.getParentActivity() != null) {
                    yyVar.t2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        yyVar.A0 = true;
                        if (!z10 || !lk0.o(activity)) {
                            if (!z11 || !yyVar.U1 || !yyVar.getUserConfig().syncContacts || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    yyVar.h3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.l5) {
                                    org.telegram.ui.ActionBar.a2 v = ((org.telegram.ui.l5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                    yyVar.T1 = v;
                                    yyVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(activity, new dw(yyVar, 0)).a;
                                yyVar.T1 = a2Var;
                                yyVar.showDialog(a2Var);
                                break;
                            }
                        } else {
                            cf0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new qn(1, new mt(2, yyVar, activity)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ q1(yy yyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = yyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
