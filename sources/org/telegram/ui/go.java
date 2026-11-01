package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.ds, sb0, org.telegram.messenger.as {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ go(oo ooVar, int i10) {
        this.a = i10;
        this.b = ooVar;
    }

    @Override // org.telegram.ui.sb0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        oo ooVar = this.b;
        TLRPC.ChatFull chatFull = ooVar.x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ooVar.u0(false, true);
        ooVar.getMessagesController().T2(0, ooVar.v0, true);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
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

    @Override // org.telegram.messenger.as
    public void i(boolean z10) {
        boolean Q1 = org.telegram.messenger.i0.Q1();
        int i10 = org.telegram.messenger.at.t;
        oo ooVar = this.b;
        if (Q1) {
            ooVar.getNotificationCenter().k(i10, Long.valueOf(-ooVar.v0));
        } else {
            ooVar.getNotificationCenter().k(i10, new Object[0]);
        }
        ooVar.finishFragment();
        ooVar.getNotificationCenter().k(org.telegram.messenger.at.K2, Long.valueOf(-ooVar.w0.id), null, ooVar.w0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.ds
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.y0(Long.valueOf(j10));
                break;
            default:
                oo ooVar = this.b;
                if (j10 != 0) {
                    ooVar.v0 = j10;
                    ooVar.w0 = ooVar.getMessagesController().L0(Long.valueOf(j10));
                    ooVar.N0 = false;
                    TLRPC.ChatFull chatFull = ooVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    ooVar.o0();
                    break;
                } else {
                    ooVar.N0 = false;
                    break;
                }
        }
    }
}
