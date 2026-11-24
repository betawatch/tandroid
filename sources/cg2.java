// default package

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cg2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cg2(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r6 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010d, code lost:
    
        if (r9 <= 0) goto L75;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        TLRPC.UserStatus userStatus4;
        byte b = this.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                wg2 wg2Var = (wg2) obj3;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long B1 = k47.B1(channelParticipant.peer);
                long B12 = k47.B1(channelParticipant2.peer);
                int i3 = -100;
                if (B1 > 0) {
                    TLRPC.User W1 = wg2Var.getMessagesController().W1(Long.valueOf(k47.B1(channelParticipant.peer)));
                    i = (W1 == null || (userStatus2 = W1.status) == null) ? 0 : W1.self ? i2 + 50000 : userStatus2.expires;
                } else {
                    i = -100;
                }
                if (B12 > 0) {
                    TLRPC.User W12 = wg2Var.getMessagesController().W1(Long.valueOf(k47.B1(channelParticipant2.peer)));
                    i3 = (W12 == null || (userStatus = W12.status) == null) ? 0 : W12.self ? i2 + 50000 : userStatus.expires;
                }
                if (i <= 0 || i3 <= 0) {
                    if (i < 0) {
                        if (i3 < 0) {
                            if (i <= i3) {
                                if (i >= i3) {
                                }
                            }
                            break;
                        }
                        break;
                    }
                    if (i != 0 || i3 == 0) {
                        if ((i3 >= 0 || i <= 0) && (i3 != 0 || i == 0)) {
                        }
                    }
                } else if (i <= i3) {
                    if (i >= i3) {
                    }
                }
                break;
            default:
                pd5 pd5Var = (pd5) obj3;
                TLRPC.User W13 = oc7.r1(pd5Var.a).W1(Long.valueOf(k47.B1(((TLRPC.ChannelParticipant) ((TLObject) obj)).peer)));
                TLRPC.User W14 = oc7.r1(pd5Var.a).W1(Long.valueOf(k47.B1(((TLRPC.ChannelParticipant) ((TLObject) obj2)).peer)));
                int i4 = (W13 == null || (userStatus4 = W13.status) == null) ? 0 : W13.self ? i2 + 50000 : userStatus4.expires;
                int i5 = (W14 == null || (userStatus3 = W14.status) == null) ? 0 : W14.self ? i2 + 50000 : userStatus3.expires;
                if (i4 <= 0 || i5 <= 0) {
                    if (i4 < 0) {
                        if (i5 < 0) {
                            if (i4 <= i5) {
                                if (i4 >= i5) {
                                }
                            }
                            break;
                        }
                        break;
                    }
                    if (i4 != 0 || i5 == 0) {
                        if ((i5 >= 0 || i4 <= 0) && (i5 != 0 || i4 == 0)) {
                        }
                    }
                } else if (i4 <= i5) {
                    if (i4 >= i5) {
                    }
                }
                break;
        }
        return 1;
    }
}
