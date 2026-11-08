package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.tr, ma0, org.telegram.messenger.qr {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public /* synthetic */ kn(pn pnVar, int i7) {
        this.a = i7;
        this.b = pnVar;
    }

    @Override // org.telegram.ui.ma0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        pn pnVar = this.b;
        TLRPC.ChatFull chatFull = pnVar.x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        pnVar.u0(false, true);
        pnVar.getMessagesController().V2(0, pnVar.v0, true);
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
        pn pnVar = this.b;
        if (Q1) {
            pnVar.getNotificationCenter().k(i7, Long.valueOf(-pnVar.v0));
        } else {
            pnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        pnVar.finishFragment();
        pnVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-pnVar.w0.id), null, pnVar.w0, Boolean.valueOf(z9));
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.y0(Long.valueOf(j3));
                break;
            default:
                pn pnVar = this.b;
                if (j3 != 0) {
                    pnVar.v0 = j3;
                    pnVar.w0 = pnVar.getMessagesController().M0(Long.valueOf(j3));
                    pnVar.N0 = false;
                    TLRPC.ChatFull chatFull = pnVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    pnVar.o0();
                    break;
                } else {
                    pnVar.N0 = false;
                    break;
                }
        }
    }
}
