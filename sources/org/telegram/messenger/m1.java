package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                uy.i0((uy) this.e, this.b, this.c, this.d, (Activity) this.f);
                break;
        }
    }

    public /* synthetic */ m1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = uyVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
