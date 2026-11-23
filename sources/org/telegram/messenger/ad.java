package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ad implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ad(hd hdVar, boolean z10, int i7) {
        this.a = 0;
        this.d = hdVar;
        this.c = z10;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hd hdVar = (hd) this.d;
                if (tLObject instanceof Vector) {
                    int i7 = this.b;
                    g0.g3(new mb(i7, 1, hdVar, (Vector) tLObject, this.c));
                    break;
                }
                break;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.b, this.c, tLObject, tL_error);
                break;
            default:
                f40 f40Var = (f40) this.d;
                g0.g3(new org.telegram.messenger.voip.l0(this.b, 6, f40Var, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ ad(gs gsVar, int i7, boolean z10, int i10) {
        this.a = i10;
        this.d = gsVar;
        this.b = i7;
        this.c = z10;
    }
}
