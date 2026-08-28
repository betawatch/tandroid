package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ e80(int i9, HashMap hashMap, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10 = this.a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.c;
        int i11 = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                ContactsController.getInstance(i11).syncPhoneBookByAlert(hashMap, z11, z10, true);
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.x1;
                ContactsController.getInstance(i11).syncPhoneBookByAlert(hashMap, z11, z10, false);
                break;
            default:
                Pattern pattern3 = LaunchActivity.x1;
                ContactsController.getInstance(i11).syncPhoneBookByAlert(hashMap, z11, z10, true);
                break;
        }
    }
}
