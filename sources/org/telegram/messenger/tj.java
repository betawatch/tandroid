package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class tj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ long c;

    public /* synthetic */ tj(wp wpVar, long j10, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                wp wpVar = this.b;
                if (j10 == 0) {
                    wpVar.getClass();
                    break;
                } else {
                    wpVar.getMessagesStorage().q1(j10);
                    break;
                }
            case 1:
                i0.g3(new am(this.b, this.c, tLObject));
                break;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                wp wpVar2 = this.b;
                if (!z10) {
                    wpVar2.getClass();
                    break;
                } else {
                    wpVar2.F3(this.c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    break;
                }
            case 3:
                wp wpVar3 = this.b;
                wpVar3.getClass();
                if (tL_error == null) {
                    wpVar3.L3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.c;
                if (j11 != 0) {
                    wpVar3.getMessagesStorage().q1(j11);
                    break;
                }
                break;
            case 4:
                wp wpVar4 = this.b;
                wpVar4.getClass();
                if (tL_error == null) {
                    wpVar4.L3((TLRPC.Updates) tLObject, false);
                }
                long j12 = this.c;
                if (j12 != 0) {
                    wpVar4.getMessagesStorage().q1(j12);
                    break;
                }
                break;
            case 5:
                wp wpVar5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar5.J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j13 = this.c;
                if (j13 != 0) {
                    wpVar5.getMessagesStorage().q1(j13);
                    break;
                }
                break;
            case 6:
                long j14 = this.c;
                wp wpVar6 = this.b;
                if (j14 == 0) {
                    wpVar6.getClass();
                    break;
                } else {
                    wpVar6.getMessagesStorage().q1(j14);
                    break;
                }
            case 7:
                wp wpVar7 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar7.J3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j15 = this.c;
                if (j15 != 0) {
                    wpVar7.getMessagesStorage().q1(j15);
                    break;
                }
                break;
            case 8:
                this.b.getMessagesStorage().q1(this.c);
                break;
            case 9:
                if (tL_error == null) {
                    i0.g3(new am(this.b, tLObject, this.c));
                    break;
                }
                break;
            case 10:
                long j16 = this.c;
                wp wpVar8 = this.b;
                if (j16 == 0) {
                    wpVar8.getClass();
                    break;
                } else {
                    wpVar8.getMessagesStorage().q1(j16);
                    break;
                }
            case 11:
                long j17 = this.c;
                wp wpVar9 = this.b;
                if (j17 == 0) {
                    wpVar9.getClass();
                    break;
                } else {
                    wpVar9.getMessagesStorage().q1(j17);
                    break;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    wp wpVar10 = this.b;
                    is messagesStorage = wpVar10.getMessagesStorage();
                    int i10 = tL_chatOnlines.onlines;
                    r5 r5Var = messagesStorage.a;
                    long j18 = this.c;
                    r5Var.c(new hq(messagesStorage, i10, j18, 7));
                    i0.g3(new d4(wpVar10, j18, tL_chatOnlines, 19));
                    break;
                }
                break;
            case 13:
                wp wpVar11 = this.b;
                wpVar11.getClass();
                if (tL_error == null) {
                    wpVar11.L3((TLRPC.Updates) tLObject, false);
                }
                long j19 = this.c;
                if (j19 != 0) {
                    wpVar11.getMessagesStorage().q1(j19);
                    break;
                }
                break;
            case 14:
                if (tL_error == null) {
                    wp wpVar12 = this.b;
                    wpVar12.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new xk(wpVar12, this.c, 20), 1000L);
                    break;
                }
                break;
            case 15:
                wp wpVar13 = this.b;
                if (tL_error != null) {
                    wpVar13.getClass();
                    break;
                } else {
                    wpVar13.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new xk(wpVar13, this.c, 19), 1000L);
                    break;
                }
            case 16:
                long j20 = this.c;
                wp wpVar14 = this.b;
                if (j20 != 0) {
                    wpVar14.getMessagesStorage().q1(j20);
                } else {
                    wpVar14.getClass();
                }
                if (tLObject != null) {
                    wpVar14.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                wp wpVar15 = this.b;
                long j21 = this.c;
                if (!z11) {
                    wpVar15.getClass();
                    if (tL_error != null && tL_error.code == 400) {
                        wpVar15.T2(0, -j21, true);
                        break;
                    }
                } else {
                    long j22 = -j21;
                    if (wpVar15.M0(j22) == null) {
                        wpVar15.T2(0, j22, true);
                        break;
                    }
                }
                break;
        }
    }
}
