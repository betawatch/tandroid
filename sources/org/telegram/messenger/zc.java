package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.a50;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zc(dd ddVar, boolean z10, int i10) {
        this.a = 0;
        this.d = ddVar;
        this.c = z10;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                dd ddVar = (dd) this.d;
                if (tLObject instanceof Vector) {
                    int i10 = this.b;
                    i0.g3(new ob(i10, 1, ddVar, (Vector) tLObject, this.c));
                    break;
                }
                break;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.b, this.c, tLObject, tL_error);
                break;
            default:
                a50 a50Var = (a50) this.d;
                i0.g3(new org.telegram.messenger.voip.p0(this.b, 6, a50Var, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ zc(vs vsVar, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = vsVar;
        this.b = i10;
        this.c = z10;
    }
}
