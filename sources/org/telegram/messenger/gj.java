package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;

    public /* synthetic */ gj(hp hpVar, long j10, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                hp hpVar = this.b;
                if (j10 == 0) {
                    hpVar.getClass();
                    break;
                } else {
                    hpVar.getMessagesStorage().q1(j10);
                    break;
                }
            case 1:
                g0.h3(new rl(this.b, this.c, tLObject));
                break;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                hp hpVar2 = this.b;
                if (!z10) {
                    hpVar2.getClass();
                    break;
                } else {
                    hpVar2.I3(this.c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    break;
                }
            case 3:
                hp hpVar3 = this.b;
                hpVar3.getClass();
                if (tL_error == null) {
                    hpVar3.O3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.c;
                if (j11 != 0) {
                    hpVar3.getMessagesStorage().q1(j11);
                    break;
                }
                break;
            case 4:
                hp hpVar4 = this.b;
                hpVar4.getClass();
                if (tL_error == null) {
                    hpVar4.O3((TLRPC.Updates) tLObject, false);
                }
                long j12 = this.c;
                if (j12 != 0) {
                    hpVar4.getMessagesStorage().q1(j12);
                    break;
                }
                break;
            case 5:
                hp hpVar5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    hpVar5.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j13 = this.c;
                if (j13 != 0) {
                    hpVar5.getMessagesStorage().q1(j13);
                    break;
                }
                break;
            case 6:
                long j14 = this.c;
                hp hpVar6 = this.b;
                if (j14 == 0) {
                    hpVar6.getClass();
                    break;
                } else {
                    hpVar6.getMessagesStorage().q1(j14);
                    break;
                }
            case 7:
                hp hpVar7 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    hpVar7.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j15 = this.c;
                if (j15 != 0) {
                    hpVar7.getMessagesStorage().q1(j15);
                    break;
                }
                break;
            case 8:
                this.b.getMessagesStorage().q1(this.c);
                break;
            case 9:
                if (tL_error == null) {
                    g0.h3(new rl(this.b, tLObject, this.c));
                    break;
                }
                break;
            case 10:
                long j16 = this.c;
                hp hpVar8 = this.b;
                if (j16 == 0) {
                    hpVar8.getClass();
                    break;
                } else {
                    hpVar8.getMessagesStorage().q1(j16);
                    break;
                }
            case 11:
                long j17 = this.c;
                hp hpVar9 = this.b;
                if (j17 == 0) {
                    hpVar9.getClass();
                    break;
                } else {
                    hpVar9.getMessagesStorage().q1(j17);
                    break;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    hp hpVar10 = this.b;
                    qr messagesStorage = hpVar10.getMessagesStorage();
                    int i3 = tL_chatOnlines.onlines;
                    p5 p5Var = messagesStorage.a;
                    long j18 = this.c;
                    p5Var.c(new rp(messagesStorage, i3, j18, 7));
                    g0.h3(new a4(hpVar10, j18, tL_chatOnlines, 16));
                    break;
                }
                break;
            case 13:
                hp hpVar11 = this.b;
                hpVar11.getClass();
                if (tL_error == null) {
                    hpVar11.O3((TLRPC.Updates) tLObject, false);
                }
                long j19 = this.c;
                if (j19 != 0) {
                    hpVar11.getMessagesStorage().q1(j19);
                    break;
                }
                break;
            case 14:
                if (tL_error == null) {
                    hp hpVar12 = this.b;
                    hpVar12.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new dk(hpVar12, this.c, 18), 1000L);
                    break;
                }
                break;
            case 15:
                hp hpVar13 = this.b;
                if (tL_error != null) {
                    hpVar13.getClass();
                    break;
                } else {
                    hpVar13.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new dk(hpVar13, this.c, 20), 1000L);
                    break;
                }
            case 16:
                long j20 = this.c;
                hp hpVar14 = this.b;
                if (j20 != 0) {
                    hpVar14.getMessagesStorage().q1(j20);
                } else {
                    hpVar14.getClass();
                }
                if (tLObject != null) {
                    hpVar14.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                hp hpVar15 = this.b;
                long j21 = this.c;
                if (!z11) {
                    hpVar15.getClass();
                    if (tL_error != null && tL_error.code == 400) {
                        hpVar15.V2(0, -j21, true);
                        break;
                    }
                } else {
                    long j22 = -j21;
                    if (hpVar15.N0(j22) == null) {
                        hpVar15.V2(0, j22, true);
                        break;
                    }
                }
                break;
        }
    }
}
