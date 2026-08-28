package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ ge(int i9, int i10, Utilities.Callback2 callback2) {
        this.a = i10;
        this.b = i9;
        this.c = callback2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.1.lambda$getLocal$1(this.b, this.c);
                break;
            case 1:
                MessagesController.4.lambda$getLocal$1(this.b, this.c);
                break;
            default:
                MessagesController.5.lambda$getLocal$2(this.b, this.c);
                break;
        }
    }
}
