package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ q80(int i10, HashMap hashMap, boolean z4, boolean z10, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = hashMap;
        this.d = z4;
        this.e = z10;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.a;
        boolean z4 = this.e;
        boolean z10 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.c;
        int i12 = this.b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, false);
                break;
            default:
                Pattern pattern3 = LaunchActivity.y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                break;
        }
    }
}
