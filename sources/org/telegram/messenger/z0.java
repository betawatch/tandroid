package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
