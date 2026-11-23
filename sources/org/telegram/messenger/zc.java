package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class zc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zc(gd gdVar, boolean z10, int i7) {
        this.a = 0;
        this.d = gdVar;
        this.c = z10;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gd gdVar = (gd) this.d;
                if (tLObject instanceof Vector) {
                    int i7 = this.b;
                    g0.g3(new lb(i7, 1, gdVar, (Vector) tLObject, this.c));
                    break;
                }
                break;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.b, this.c, tLObject, tL_error);
                break;
            default:
                e40 e40Var = (e40) this.d;
                g0.g3(new org.telegram.messenger.voip.l0(this.b, 6, e40Var, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ zc(fs fsVar, int i7, boolean z10, int i10) {
        this.a = i10;
        this.d = fsVar;
        this.b = i7;
        this.c = z10;
    }
}
