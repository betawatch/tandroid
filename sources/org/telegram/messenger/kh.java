package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ kh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.a = i10;
        this.b = callback2;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$3(this.b, this.c);
                break;
            default:
                PasskeysController.lambda$create$8(this.b, this.c);
                break;
        }
    }
}
