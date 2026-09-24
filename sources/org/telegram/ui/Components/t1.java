package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
