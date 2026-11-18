package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.bn;
import org.telegram.ui.vf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n4(int i7, int i10, String str, boolean z10) {
        this.e = str;
        this.b = i7;
        this.d = z10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final String str = (String) this.e;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i7 = this.b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                final int i10 = this.c;
                final boolean z10 = this.d;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() { // from class: bi.g4
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new p4(tLObject, i7, z10, i10, str));
                    }
                });
                break;
            default:
                bn bnVar = (bn) this.e;
                bnVar.getMessagesController().d0(bnVar.l6, org.telegram.messenger.v3.T(bnVar.e) ? bnVar.l6 : 0L, this.b, this.c, this.d, new vf(bnVar, 21));
                break;
        }
    }

    public /* synthetic */ n4(bn bnVar, int i7, int i10, boolean z10) {
        this.e = bnVar;
        this.b = i7;
        this.c = i10;
        this.d = z10;
    }
}
