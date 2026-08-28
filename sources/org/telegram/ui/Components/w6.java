package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ w6(c8 c8Var, MessageObject messageObject, int i9) {
        this.a = i9;
        this.b = c8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8.m(this.b, this.c);
                break;
            default:
                c8.p(this.b, this.c);
                break;
        }
    }
}
