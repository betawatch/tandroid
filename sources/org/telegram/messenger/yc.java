package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.b50;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class yc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yc(cd cdVar, boolean z10, int i10) {
        this.a = 0;
        this.d = cdVar;
        this.c = z10;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                cd cdVar = (cd) this.d;
                if (tLObject instanceof Vector) {
                    int i10 = this.b;
                    i0.g3(new nb(i10, 1, cdVar, (Vector) tLObject, this.c));
                    break;
                }
                break;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.b, this.c, tLObject, tL_error);
                break;
            default:
                b50 b50Var = (b50) this.d;
                i0.g3(new org.telegram.messenger.voip.p0(this.b, 6, b50Var, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ yc(us usVar, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = usVar;
        this.b = i10;
        this.c = z10;
    }
}
