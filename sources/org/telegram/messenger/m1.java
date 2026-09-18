package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
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
                wy.i0((wy) this.e, this.b, this.c, this.d, (Activity) this.f);
                break;
        }
    }

    public /* synthetic */ m1(wy wyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = wyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
