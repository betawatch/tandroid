package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ ie(int i10, int i11, Utilities.Callback2 callback2) {
        this.a = i11;
        this.b = i10;
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
