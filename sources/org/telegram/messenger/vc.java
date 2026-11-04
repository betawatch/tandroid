package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vc(bd bdVar, boolean z10, int i3) {
        this.a = 0;
        this.d = bdVar;
        this.c = z10;
        this.b = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                bd bdVar = (bd) this.d;
                if (tLObject instanceof Vector) {
                    int i3 = this.b;
                    g0.h3(new gb(i3, 1, bdVar, (Vector) tLObject, this.c));
                    break;
                }
                break;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.b, this.c, tLObject, tL_error);
                break;
            default:
                x30 x30Var = (x30) this.d;
                g0.h3(new org.telegram.messenger.voip.j0(this.b, 6, x30Var, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ vc(cs csVar, int i3, boolean z10, int i10) {
        this.a = i10;
        this.d = csVar;
        this.b = i3;
        this.c = z10;
    }
}
