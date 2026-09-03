package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ y0(ChatObject.Call call, TLObject tLObject, int i10) {
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
