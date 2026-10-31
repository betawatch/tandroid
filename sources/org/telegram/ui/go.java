package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.cs, tb0, org.telegram.messenger.zr {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ go(oo ooVar, int i10) {
        this.a = i10;
        this.b = ooVar;
    }

    @Override // org.telegram.ui.tb0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        oo ooVar = this.b;
        TLRPC.ChatFull chatFull = ooVar.x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ooVar.t0(false, true);
        ooVar.getMessagesController().T2(0, ooVar.v0, true);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.n0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
                this.b.n0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        boolean Q1 = org.telegram.messenger.i0.Q1();
        int i10 = org.telegram.messenger.zs.t;
        oo ooVar = this.b;
        if (Q1) {
            ooVar.getNotificationCenter().k(i10, Long.valueOf(-ooVar.v0));
        } else {
            ooVar.getNotificationCenter().k(i10, new Object[0]);
        }
        ooVar.finishFragment();
        ooVar.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(-ooVar.w0.id), null, ooVar.w0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.x0(Long.valueOf(j10));
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
                    ooVar.n0();
                    break;
                } else {
                    ooVar.N0 = false;
                    break;
                }
        }
    }
}
