// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a92 implements fd, ef7, qc6, bf7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g92 b;

    public /* synthetic */ a92(g92 g92Var, byte b) {
        this.a = b;
        this.b = g92Var;
    }

    @Override // bf7
    public final void A(boolean z) {
        boolean O1 = hl.O1();
        int i = jn7.s;
        g92 g92Var = this.b;
        if (O1) {
            g92Var.getNotificationCenter().k(i, Long.valueOf(-g92Var.w0));
        } else {
            g92Var.getNotificationCenter().k(i, new Object[0]);
        }
        g92Var.finishFragment();
        g92Var.getNotificationCenter().k(jn7.K2, Long.valueOf(-g92Var.x0.id), null, g92Var.x0, Boolean.valueOf(z));
    }

    @Override // qc6
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        g92 g92Var = this.b;
        TLRPC.ChatFull chatFull = g92Var.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        g92Var.t0(false, true);
        g92Var.getMessagesController().e3(0, g92Var.w0, true);
    }

    @Override // ef7
    public final void run(long j) {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 4:
                g92Var.y0(Long.valueOf(j));
                break;
            default:
                if (j != 0) {
                    g92Var.w0 = j;
                    g92Var.x0 = g92Var.getMessagesController().M0(Long.valueOf(j));
                    g92Var.O0 = false;
                    TLRPC.ChatFull chatFull = g92Var.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    g92Var.n0();
                    break;
                } else {
                    g92Var.O0 = false;
                    break;
                }
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 0:
                g92Var.n0();
                break;
            case 1:
                g92Var.finishFragment();
                break;
            case 2:
                g92Var.n0();
                break;
            default:
                g92Var.finishFragment();
                break;
        }
    }
}
