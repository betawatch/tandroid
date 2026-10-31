package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ long c;

    public /* synthetic */ sj(vp vpVar, long j10, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                vp vpVar = this.b;
                if (j10 == 0) {
                    vpVar.getClass();
                    break;
                } else {
                    vpVar.getMessagesStorage().q1(j10);
                    break;
                }
            case 1:
                i0.g3(new zl(this.b, this.c, tLObject));
                break;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                vp vpVar2 = this.b;
                if (!z10) {
                    vpVar2.getClass();
                    break;
                } else {
                    vpVar2.F3(this.c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    break;
                }
            case 3:
                vp vpVar3 = this.b;
                vpVar3.getClass();
                if (tL_error == null) {
                    vpVar3.L3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.c;
                if (j11 != 0) {
                    vpVar3.getMessagesStorage().q1(j11);
                    break;
                }
                break;
            case 4:
                vp vpVar4 = this.b;
                vpVar4.getClass();
                if (tL_error == null) {
                    vpVar4.L3((TLRPC.Updates) tLObject, false);
                }
                long j12 = this.c;
                if (j12 != 0) {
                    vpVar4.getMessagesStorage().q1(j12);
                    break;
                }
                break;
            case 5:
                vp vpVar5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar5.J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j13 = this.c;
                if (j13 != 0) {
                    vpVar5.getMessagesStorage().q1(j13);
                    break;
                }
                break;
            case 6:
                long j14 = this.c;
                vp vpVar6 = this.b;
                if (j14 == 0) {
                    vpVar6.getClass();
                    break;
                } else {
                    vpVar6.getMessagesStorage().q1(j14);
                    break;
                }
            case 7:
                vp vpVar7 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar7.J3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j15 = this.c;
                if (j15 != 0) {
                    vpVar7.getMessagesStorage().q1(j15);
                    break;
                }
                break;
            case 8:
                this.b.getMessagesStorage().q1(this.c);
                break;
            case 9:
                if (tL_error == null) {
                    i0.g3(new zl(this.b, tLObject, this.c));
                    break;
                }
                break;
            case 10:
                long j16 = this.c;
                vp vpVar8 = this.b;
                if (j16 == 0) {
                    vpVar8.getClass();
                    break;
                } else {
                    vpVar8.getMessagesStorage().q1(j16);
                    break;
                }
            case 11:
                long j17 = this.c;
                vp vpVar9 = this.b;
                if (j17 == 0) {
                    vpVar9.getClass();
                    break;
                } else {
                    vpVar9.getMessagesStorage().q1(j17);
                    break;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    vp vpVar10 = this.b;
                    hs messagesStorage = vpVar10.getMessagesStorage();
                    int i10 = tL_chatOnlines.onlines;
                    r5 r5Var = messagesStorage.a;
                    long j18 = this.c;
                    r5Var.c(new gq(messagesStorage, i10, j18, 7));
                    i0.g3(new d4(vpVar10, j18, tL_chatOnlines, 19));
                    break;
                }
                break;
            case 13:
                vp vpVar11 = this.b;
                vpVar11.getClass();
                if (tL_error == null) {
                    vpVar11.L3((TLRPC.Updates) tLObject, false);
                }
                long j19 = this.c;
                if (j19 != 0) {
                    vpVar11.getMessagesStorage().q1(j19);
                    break;
                }
                break;
            case 14:
                if (tL_error == null) {
                    vp vpVar12 = this.b;
                    vpVar12.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new wk(vpVar12, this.c, 20), 1000L);
                    break;
                }
                break;
            case 15:
                vp vpVar13 = this.b;
                if (tL_error != null) {
                    vpVar13.getClass();
                    break;
                } else {
                    vpVar13.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.h3(new wk(vpVar13, this.c, 19), 1000L);
                    break;
                }
            case 16:
                long j20 = this.c;
                vp vpVar14 = this.b;
                if (j20 != 0) {
                    vpVar14.getMessagesStorage().q1(j20);
                } else {
                    vpVar14.getClass();
                }
                if (tLObject != null) {
                    vpVar14.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                vp vpVar15 = this.b;
                long j21 = this.c;
                if (!z11) {
                    vpVar15.getClass();
                    if (tL_error != null && tL_error.code == 400) {
                        vpVar15.T2(0, -j21, true);
                        break;
                    }
                } else {
                    long j22 = -j21;
                    if (vpVar15.M0(j22) == null) {
                        vpVar15.T2(0, j22, true);
                        break;
                    }
                }
                break;
        }
    }
}
