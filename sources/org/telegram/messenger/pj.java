package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class pj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ long c;

    public /* synthetic */ pj(qp qpVar, long j3, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                qp qpVar = this.b;
                if (j3 == 0) {
                    qpVar.getClass();
                    break;
                } else {
                    qpVar.getMessagesStorage().q1(j3);
                    break;
                }
            case 1:
                g0.h3(new bm(this.b, this.c, tLObject));
                break;
            case 2:
                boolean z9 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                qp qpVar2 = this.b;
                if (!z9) {
                    qpVar2.getClass();
                    break;
                } else {
                    qpVar2.I3(this.c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    break;
                }
            case 3:
                qp qpVar3 = this.b;
                qpVar3.getClass();
                if (tL_error == null) {
                    qpVar3.O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.c;
                if (j10 != 0) {
                    qpVar3.getMessagesStorage().q1(j10);
                    break;
                }
                break;
            case 4:
                qp qpVar4 = this.b;
                qpVar4.getClass();
                if (tL_error == null) {
                    qpVar4.O3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.c;
                if (j11 != 0) {
                    qpVar4.getMessagesStorage().q1(j11);
                    break;
                }
                break;
            case 5:
                qp qpVar5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar5.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j12 = this.c;
                if (j12 != 0) {
                    qpVar5.getMessagesStorage().q1(j12);
                    break;
                }
                break;
            case 6:
                long j13 = this.c;
                qp qpVar6 = this.b;
                if (j13 == 0) {
                    qpVar6.getClass();
                    break;
                } else {
                    qpVar6.getMessagesStorage().q1(j13);
                    break;
                }
            case 7:
                qp qpVar7 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar7.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j14 = this.c;
                if (j14 != 0) {
                    qpVar7.getMessagesStorage().q1(j14);
                    break;
                }
                break;
            case 8:
                this.b.getMessagesStorage().q1(this.c);
                break;
            case 9:
                if (tL_error == null) {
                    g0.h3(new bm(this.b, tLObject, this.c));
                    break;
                }
                break;
            case 10:
                long j15 = this.c;
                qp qpVar8 = this.b;
                if (j15 == 0) {
                    qpVar8.getClass();
                    break;
                } else {
                    qpVar8.getMessagesStorage().q1(j15);
                    break;
                }
            case 11:
                long j16 = this.c;
                qp qpVar9 = this.b;
                if (j16 == 0) {
                    qpVar9.getClass();
                    break;
                } else {
                    qpVar9.getMessagesStorage().q1(j16);
                    break;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    qp qpVar10 = this.b;
                    yr messagesStorage = qpVar10.getMessagesStorage();
                    int i7 = tL_chatOnlines.onlines;
                    p5 p5Var = messagesStorage.a;
                    long j17 = this.c;
                    p5Var.c(new aq(messagesStorage, i7, j17, 7));
                    g0.h3(new a4(qpVar10, j17, tL_chatOnlines, 16));
                    break;
                }
                break;
            case 13:
                qp qpVar11 = this.b;
                qpVar11.getClass();
                if (tL_error == null) {
                    qpVar11.O3((TLRPC.Updates) tLObject, false);
                }
                long j18 = this.c;
                if (j18 != 0) {
                    qpVar11.getMessagesStorage().q1(j18);
                    break;
                }
                break;
            case 14:
                if (tL_error == null) {
                    qp qpVar12 = this.b;
                    qpVar12.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new nk(qpVar12, this.c, 18), 1000L);
                    break;
                }
                break;
            case 15:
                qp qpVar13 = this.b;
                if (tL_error != null) {
                    qpVar13.getClass();
                    break;
                } else {
                    qpVar13.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new nk(qpVar13, this.c, 20), 1000L);
                    break;
                }
            case 16:
                long j19 = this.c;
                qp qpVar14 = this.b;
                if (j19 != 0) {
                    qpVar14.getMessagesStorage().q1(j19);
                } else {
                    qpVar14.getClass();
                }
                if (tLObject != null) {
                    qpVar14.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                qp qpVar15 = this.b;
                long j20 = this.c;
                if (!z10) {
                    qpVar15.getClass();
                    if (tL_error != null && tL_error.code == 400) {
                        qpVar15.V2(0, -j20, true);
                        break;
                    }
                } else {
                    long j21 = -j20;
                    if (qpVar15.N0(j21) == null) {
                        qpVar15.V2(0, j21, true);
                        break;
                    }
                }
                break;
        }
    }
}
