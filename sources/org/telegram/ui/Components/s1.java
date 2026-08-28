package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.BooleanCallback b;

    public /* synthetic */ s1(MessagesStorage.BooleanCallback booleanCallback, int i9) {
        this.a = i9;
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
