package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ me(int i10, int i11, Utilities.Callback2 callback2) {
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
