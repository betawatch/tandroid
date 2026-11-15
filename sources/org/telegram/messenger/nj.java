package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class nj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;

    public /* synthetic */ nj(np npVar, long j3, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                np npVar = this.b;
                if (j3 == 0) {
                    npVar.getClass();
                    break;
                } else {
                    npVar.getMessagesStorage().q1(j3);
                    break;
                }
            case 1:
                g0.h3(new yl(this.b, this.c, tLObject));
                break;
            case 2:
                boolean z10 = tLObject instanceof TLRPC.TL_channels_channelParticipants;
                np npVar2 = this.b;
                if (!z10) {
                    npVar2.getClass();
                    break;
                } else {
                    npVar2.I3(this.c, (TLRPC.TL_channels_channelParticipants) tLObject);
                    break;
                }
            case 3:
                np npVar3 = this.b;
                npVar3.getClass();
                if (tL_error == null) {
                    npVar3.O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.c;
                if (j10 != 0) {
                    npVar3.getMessagesStorage().q1(j10);
                    break;
                }
                break;
            case 4:
                np npVar4 = this.b;
                npVar4.getClass();
                if (tL_error == null) {
                    npVar4.O3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.c;
                if (j11 != 0) {
                    npVar4.getMessagesStorage().q1(j11);
                    break;
                }
                break;
            case 5:
                np npVar5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar5.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                long j12 = this.c;
                if (j12 != 0) {
                    npVar5.getMessagesStorage().q1(j12);
                    break;
                }
                break;
            case 6:
                long j13 = this.c;
                np npVar6 = this.b;
                if (j13 == 0) {
                    npVar6.getClass();
                    break;
                } else {
                    npVar6.getMessagesStorage().q1(j13);
                    break;
                }
            case 7:
                np npVar7 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar7.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                long j14 = this.c;
                if (j14 != 0) {
                    npVar7.getMessagesStorage().q1(j14);
                    break;
                }
                break;
            case 8:
                this.b.getMessagesStorage().q1(this.c);
                break;
            case 9:
                if (tL_error == null) {
                    g0.h3(new yl(this.b, tLObject, this.c));
                    break;
                }
                break;
            case 10:
                long j15 = this.c;
                np npVar8 = this.b;
                if (j15 == 0) {
                    npVar8.getClass();
                    break;
                } else {
                    npVar8.getMessagesStorage().q1(j15);
                    break;
                }
            case 11:
                long j16 = this.c;
                np npVar9 = this.b;
                if (j16 == 0) {
                    npVar9.getClass();
                    break;
                } else {
                    npVar9.getMessagesStorage().q1(j16);
                    break;
                }
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    np npVar10 = this.b;
                    vr messagesStorage = npVar10.getMessagesStorage();
                    int i7 = tL_chatOnlines.onlines;
                    p5 p5Var = messagesStorage.a;
                    long j17 = this.c;
                    p5Var.c(new wp(messagesStorage, i7, j17, 7));
                    g0.h3(new a4(npVar10, j17, tL_chatOnlines, 16));
                    break;
                }
                break;
            case 13:
                np npVar11 = this.b;
                npVar11.getClass();
                if (tL_error == null) {
                    npVar11.O3((TLRPC.Updates) tLObject, false);
                }
                long j18 = this.c;
                if (j18 != 0) {
                    npVar11.getMessagesStorage().q1(j18);
                    break;
                }
                break;
            case 14:
                if (tL_error == null) {
                    np npVar12 = this.b;
                    npVar12.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new kk(npVar12, this.c, 18), 1000L);
                    break;
                }
                break;
            case 15:
                np npVar13 = this.b;
                if (tL_error != null) {
                    npVar13.getClass();
                    break;
                } else {
                    npVar13.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.i3(new kk(npVar13, this.c, 20), 1000L);
                    break;
                }
            case 16:
                long j19 = this.c;
                np npVar14 = this.b;
                if (j19 != 0) {
                    npVar14.getMessagesStorage().q1(j19);
                } else {
                    npVar14.getClass();
                }
                if (tLObject != null) {
                    npVar14.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                np npVar15 = this.b;
                long j20 = this.c;
                if (!z11) {
                    npVar15.getClass();
                    if (tL_error != null && tL_error.code == 400) {
                        npVar15.V2(0, -j20, true);
                        break;
                    }
                } else {
                    long j21 = -j20;
                    if (npVar15.N0(j21) == null) {
                        npVar15.V2(0, j21, true);
                        break;
                    }
                }
                break;
        }
    }
}
