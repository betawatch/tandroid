package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.ft;
import org.telegram.ui.gk0;
import org.telegram.ui.ty;
import org.telegram.ui.yv;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
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
                ty tyVar = (ty) this.e;
                Activity activity = (Activity) this.f;
                if (tyVar.getParentActivity() != null) {
                    tyVar.t2 = false;
                    boolean z10 = this.b;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        tyVar.A0 = true;
                        if (!z10 || !gk0.p(activity)) {
                            if (!z11 || !tyVar.U1 || !tyVar.getUserConfig().syncContacts || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    tyVar.h3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.h5) {
                                    org.telegram.ui.ActionBar.b2 v = ((org.telegram.ui.h5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                    tyVar.T1 = v;
                                    tyVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.v(activity, new yv(tyVar, 0)).a;
                                tyVar.T1 = b2Var;
                                tyVar.showDialog(b2Var);
                                break;
                            }
                        } else {
                            ef0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new tn(1, new ft(2, tyVar, activity)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ o1(ty tyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = tyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
