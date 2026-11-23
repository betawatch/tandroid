package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.pr, na0, org.telegram.messenger.mr {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ ln(rn rnVar, int i7) {
        this.a = i7;
        this.b = rnVar;
    }

    @Override // org.telegram.ui.na0
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        rn rnVar = this.b;
        TLRPC.ChatFull chatFull = rnVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        rnVar.u0(false, true);
        rnVar.getMessagesController().b3(0, rnVar.w0, true);
    }

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        boolean Q1 = org.telegram.messenger.g0.Q1();
        int i7 = org.telegram.messenger.ls.t;
        rn rnVar = this.b;
        if (Q1) {
            rnVar.getNotificationCenter().k(i7, Long.valueOf(-rnVar.w0));
        } else {
            rnVar.getNotificationCenter().k(i7, new Object[0]);
        }
        rnVar.finishFragment();
        rnVar.getNotificationCenter().k(org.telegram.messenger.ls.K2, Long.valueOf(-rnVar.x0.id), null, rnVar.x0, Boolean.valueOf(z10));
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

    @Override // org.telegram.messenger.pr
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.y0(Long.valueOf(j3));
                break;
            default:
                rn rnVar = this.b;
                if (j3 != 0) {
                    rnVar.w0 = j3;
                    rnVar.x0 = rnVar.getMessagesController().O0(Long.valueOf(j3));
                    rnVar.O0 = false;
                    TLRPC.ChatFull chatFull = rnVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    rnVar.o0();
                    break;
                } else {
                    rnVar.O0 = false;
                    break;
                }
        }
    }
}
