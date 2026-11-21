package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class lj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;

    public /* synthetic */ lj(mp mpVar, long j3, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                mp mpVar = this.b;
                if (j3 == 0) {
                    mpVar.getClass();
                    break;
                } else {
                    mpVar.getMessagesStorage().q1(j3);
                    break;
                }
            case 1:
                g0.g3(new gl(this.b, this.c, tLObject));
                break;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                mp mpVar2 = this.b;
                if (!z10) {
                    mpVar2.getClass();
                    break;
                } else {
                    mpVar2.P3(this.c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    break;
                }
            case 3:
                mp mpVar3 = this.b;
                mpVar3.getClass();
                if (tL_error == null) {
                    mpVar3.V3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.c;
                if (j10 != 0) {
                    mpVar3.getMessagesStorage().q1(j10);
                    break;
                }
                break;
            case 4:
                mp mpVar4 = this.b;
                mpVar4.getClass();
                if (tL_error == null) {
                    mpVar4.V3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.c;
                if (j11 != 0) {
                    mpVar4.getMessagesStorage().q1(j11);
                    break;
                }
                break;
            case 5:
                mp mpVar5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    mpVar5.T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j12 = this.c;
                if (j12 != 0) {
                    mpVar5.getMessagesStorage().q1(j12);
                    break;
                }
                break;
            case 6:
                long j13 = this.c;
                mp mpVar6 = this.b;
                if (j13 == 0) {
                    mpVar6.getClass();
                    break;
                } else {
                    mpVar6.getMessagesStorage().q1(j13);
                    break;
                }
            case 7:
                mp mpVar7 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    mpVar7.T3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j14 = this.c;
                if (j14 != 0) {
                    mpVar7.getMessagesStorage().q1(j14);
                    break;
                }
                break;
            case 8:
                this.b.getMessagesStorage().q1(this.c);
                break;
            case 9:
                if (tL_error == null) {
                    g0.g3(new gl(this.b, tLObject, this.c));
                    break;
                }
                break;
            case 10:
                long j15 = this.c;
                mp mpVar8 = this.b;
                if (j15 == 0) {
                    mpVar8.getClass();
                    break;
                } else {
                    mpVar8.getMessagesStorage().q1(j15);
                    break;
                }
            case 11:
                long j16 = this.c;
                mp mpVar9 = this.b;
                if (j16 == 0) {
                    mpVar9.getClass();
                    break;
                } else {
                    mpVar9.getMessagesStorage().q1(j16);
                    break;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    mp mpVar10 = this.b;
                    tr messagesStorage = mpVar10.getMessagesStorage();
                    int i7 = tL_chatOnlines.onlines;
                    q5 q5Var = messagesStorage.a;
                    long j17 = this.c;
                    q5Var.c(new vp(messagesStorage, i7, j17, 7));
                    g0.g3(new d4(mpVar10, j17, tL_chatOnlines, 19));
                    break;
                }
                break;
            case 13:
                mp mpVar11 = this.b;
                mpVar11.getClass();
                if (tL_error == null) {
                    mpVar11.V3((TLRPC.Updates) tLObject, false);
                }
                long j18 = this.c;
                if (j18 != 0) {
                    mpVar11.getMessagesStorage().q1(j18);
                    break;
                }
                break;
            case 14:
                if (tL_error == null) {
                    mp mpVar12 = this.b;
                    mpVar12.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.h3(new ik(mpVar12, this.c, 21), 1000L);
                    break;
                }
                break;
            case 15:
                mp mpVar13 = this.b;
                if (tL_error != null) {
                    mpVar13.getClass();
                    break;
                } else {
                    mpVar13.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.h3(new ik(mpVar13, this.c, 19), 1000L);
                    break;
                }
            case 16:
                long j19 = this.c;
                mp mpVar14 = this.b;
                if (j19 != 0) {
                    mpVar14.getMessagesStorage().q1(j19);
                } else {
                    mpVar14.getClass();
                }
                if (tLObject != null) {
                    mpVar14.V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                mp mpVar15 = this.b;
                long j20 = this.c;
                if (!z11) {
                    mpVar15.getClass();
                    if (tL_error != null && tL_error.code == 400) {
                        mpVar15.b3(0, -j20, true);
                        break;
                    }
                } else {
                    long j21 = -j20;
                    if (mpVar15.P0(j21) == null) {
                        mpVar15.b3(0, j21, true);
                        break;
                    }
                }
                break;
        }
    }
}
