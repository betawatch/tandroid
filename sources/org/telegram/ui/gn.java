package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.lr, ia0, org.telegram.messenger.ir {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln b;

    public /* synthetic */ gn(ln lnVar, int i3) {
        this.a = i3;
        this.b = lnVar;
    }

    @Override // org.telegram.ui.ia0
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ln lnVar = this.b;
        TLRPC.ChatFull chatFull = lnVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        lnVar.u0(false, true);
        lnVar.getMessagesController().V2(0, lnVar.w0, true);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
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

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i3 = org.telegram.messenger.hs.t;
        ln lnVar = this.b;
        if (Q1) {
            lnVar.getNotificationCenter().k(i3, Long.valueOf(-lnVar.w0));
        } else {
            lnVar.getNotificationCenter().k(i3, new Object[0]);
        }
        lnVar.finishFragment();
        lnVar.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(-lnVar.x0.id), null, lnVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.y0(Long.valueOf(j10));
                break;
            default:
                ln lnVar = this.b;
                if (j10 != 0) {
                    lnVar.w0 = j10;
                    lnVar.x0 = lnVar.getMessagesController().M0(Long.valueOf(j10));
                    lnVar.O0 = false;
                    TLRPC.ChatFull chatFull = lnVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    lnVar.o0();
                    break;
                } else {
                    lnVar.O0 = false;
                    break;
                }
        }
    }
}
