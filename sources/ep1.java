// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ep1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ep1(int i, int i2, String str, boolean z) {
        this.e = str;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                yv1Var.getMessagesController().Z(yv1Var.l6, sd2.T(yv1Var.e) ? yv1Var.l6 : 0L, this.b, this.d, this.c, new ho1(yv1Var, (byte) 27));
                break;
            default:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i = this.b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                final int i2 = this.d;
                final boolean z = this.c;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() { // from class: zr7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        gm.c3(new d31(tLObject, i, z, i2, str));
                    }
                });
                break;
        }
    }

    public /* synthetic */ ep1(yv1 yv1Var, int i, int i2, boolean z) {
        this.e = yv1Var;
        this.b = i;
        this.d = i2;
        this.c = z;
    }
}
