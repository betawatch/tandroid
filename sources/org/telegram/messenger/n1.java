package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.py;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n1(ContactsController contactsController, HashMap hashMap, boolean z4, boolean z10, boolean z11) {
        this.e = contactsController;
        this.f = hashMap;
        this.b = z4;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f, this.b, this.c, this.d);
                break;
            default:
                py.h0((py) this.e, this.b, this.c, this.d, (Activity) this.f);
                break;
        }
    }

    public /* synthetic */ n1(py pyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        this.e = pyVar;
        this.b = z4;
        this.c = z10;
        this.d = z11;
        this.f = activity;
    }
}
