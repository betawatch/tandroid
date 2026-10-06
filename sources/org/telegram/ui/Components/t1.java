package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.BooleanCallback b;

    public /* synthetic */ t1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
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
