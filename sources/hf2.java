// default package

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hf2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hf2(Object obj, int i, byte b) {
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
                bg2 bg2Var = (bg2) obj3;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long B1 = r47.B1(channelParticipant.peer);
                long B12 = r47.B1(channelParticipant2.peer);
                int i3 = -100;
                if (B1 > 0) {
                    TLRPC.User X1 = bg2Var.getMessagesController().X1(Long.valueOf(r47.B1(channelParticipant.peer)));
                    i = (X1 == null || (userStatus2 = X1.status) == null) ? 0 : X1.self ? i2 + 50000 : userStatus2.expires;
                } else {
                    i = -100;
                }
                if (B12 > 0) {
                    TLRPC.User X12 = bg2Var.getMessagesController().X1(Long.valueOf(r47.B1(channelParticipant2.peer)));
                    i3 = (X12 == null || (userStatus = X12.status) == null) ? 0 : X12.self ? i2 + 50000 : userStatus.expires;
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
                sd5 sd5Var = (sd5) obj3;
                TLRPC.User X13 = uc7.s1(sd5Var.a).X1(Long.valueOf(r47.B1(((TLRPC.ChannelParticipant) ((TLObject) obj)).peer)));
                TLRPC.User X14 = uc7.s1(sd5Var.a).X1(Long.valueOf(r47.B1(((TLRPC.ChannelParticipant) ((TLObject) obj2)).peer)));
                int i4 = (X13 == null || (userStatus4 = X13.status) == null) ? 0 : X13.self ? i2 + 50000 : userStatus4.expires;
                int i5 = (X14 == null || (userStatus3 = X14.status) == null) ? 0 : X14.self ? i2 + 50000 : userStatus3.expires;
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
