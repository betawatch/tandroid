package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.a = i10;
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
