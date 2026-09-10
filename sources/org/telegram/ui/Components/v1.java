package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.BooleanCallback b;

    public /* synthetic */ v1(MessagesStorage.BooleanCallback booleanCallback, int i10) {
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
