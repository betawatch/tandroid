package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                qy.h0((qy) this.e, this.b, this.c, this.d, (Activity) this.f);
                break;
        }
    }

    public /* synthetic */ o1(qy qyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = qyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
