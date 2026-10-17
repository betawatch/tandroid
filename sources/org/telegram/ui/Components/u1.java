package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.BooleanCallback b;

    public /* synthetic */ u1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
        this.a = i10;
        this.b = booleanCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.b;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                    break;
                }
                break;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.b;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                    break;
                }
                break;
        }
    }
}
