package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class bd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bd(hd hdVar, boolean z9, int i7) {
        this.a = 0;
        this.d = hdVar;
        this.c = z9;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hd hdVar = (hd) this.d;
                if (tLObject instanceof Vector) {
                    int i7 = this.b;
                    g0.h3(new nb(i7, 1, hdVar, (Vector) tLObject, this.c));
                    break;
                }
                break;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.b, this.c, tLObject, tL_error);
                break;
            default:
                c40 c40Var = (c40) this.d;
                g0.h3(new org.telegram.messenger.voip.k0(this.b, 6, c40Var, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ bd(ls lsVar, int i7, boolean z9, int i10) {
        this.a = i10;
        this.d = lsVar;
        this.b = i7;
        this.c = z9;
    }
}
