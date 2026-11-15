package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.qr, ma0, org.telegram.messenger.nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ kn(qn qnVar, int i7) {
        this.a = i7;
        this.b = qnVar;
    }

    @Override // org.telegram.ui.ma0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        qn qnVar = this.b;
        TLRPC.ChatFull chatFull = qnVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        qnVar.u0(false, true);
        qnVar.getMessagesController().V2(0, qnVar.w0, true);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.ns.t;
        qn qnVar = this.b;
        if (Q1) {
            qnVar.getNotificationCenter().k(i7, Long.valueOf(-qnVar.w0));
        } else {
            qnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        qnVar.finishFragment();
        qnVar.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(-qnVar.x0.id), null, qnVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.qr
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.y0(Long.valueOf(j3));
                break;
            default:
                qn qnVar = this.b;
                if (j3 != 0) {
                    qnVar.w0 = j3;
                    qnVar.x0 = qnVar.getMessagesController().M0(Long.valueOf(j3));
                    qnVar.O0 = false;
                    TLRPC.ChatFull chatFull = qnVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    qnVar.o0();
                    break;
                } else {
                    qnVar.O0 = false;
                    break;
                }
        }
    }
}
