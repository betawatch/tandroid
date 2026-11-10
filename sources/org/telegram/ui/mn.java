package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.tr, pa0, org.telegram.messenger.qr {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ mn(rn rnVar, int i7) {
        this.a = i7;
        this.b = rnVar;
    }

    @Override // org.telegram.ui.pa0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        rn rnVar = this.b;
        TLRPC.ChatFull chatFull = rnVar.x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        rnVar.u0(false, true);
        rnVar.getMessagesController().V2(0, rnVar.v0, true);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.o0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
                this.b.o0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.qs.t;
        rn rnVar = this.b;
        if (Q1) {
            rnVar.getNotificationCenter().k(i7, Long.valueOf(-rnVar.v0));
        } else {
            rnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        rnVar.finishFragment();
        rnVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-rnVar.w0.id), null, rnVar.w0, Boolean.valueOf(z9));
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.y0(Long.valueOf(j3));
                break;
            default:
                rn rnVar = this.b;
                if (j3 != 0) {
                    rnVar.v0 = j3;
                    rnVar.w0 = rnVar.getMessagesController().M0(Long.valueOf(j3));
                    rnVar.N0 = false;
                    TLRPC.ChatFull chatFull = rnVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    rnVar.o0();
                    break;
                } else {
                    rnVar.N0 = false;
                    break;
                }
        }
    }
}
