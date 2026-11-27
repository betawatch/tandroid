// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class no1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ no1(int i, int i2, String str, boolean z) {
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
                zu1 zu1Var = (zu1) obj;
                zu1Var.getMessagesController().b0(zu1Var.l6, xc2.T(zu1Var.e) ? zu1Var.l6 : 0L, this.b, this.d, this.c, new gn1(zu1Var, (byte) 22));
                break;
            default:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i = this.b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                final int i2 = this.d;
                final boolean z = this.c;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() { // from class: ys7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        hl.c3(new e21(tLObject, i, z, i2, str));
                    }
                });
                break;
        }
    }

    public /* synthetic */ no1(zu1 zu1Var, int i, int i2, boolean z) {
        this.e = zu1Var;
        this.b = i;
        this.d = i2;
        this.c = z;
    }
}
