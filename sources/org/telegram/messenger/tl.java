package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class tl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tl(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.a = i10;
        this.b = serializable;
        this.c = serializable2;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.lambda$raceCallbacks$1((int[]) this.b, (Utilities.Callback[]) this.c, (Runnable) this.d);
                break;
            default:
                WearAuthListenerService.lambda$onMessageReceived$0((String) this.b, (String) this.c, (byte[]) this.d);
                break;
        }
    }
}
