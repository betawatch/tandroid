package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ y0(ChatObject.Call call, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = call;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$reloadGroupCall$8(this.c);
                break;
            default:
                this.b.lambda$loadGroupCall$10(this.c);
                break;
        }
    }
}
