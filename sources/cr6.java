// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class cr6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cr6(hs6 hs6Var, int i, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 3;
        switch (this.a) {
            case 0:
                hs6 hs6Var = this.b;
                Long[] lArr = hs6Var.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                byte b2 = this.c;
                lArr[b2] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        hs6Var.E0[b2] = tL_emojiStatuses.hash;
                        hs6Var.F0[b2] = tL_emojiStatuses.statuses;
                        hs6Var.getMessagesStorage().a.c(new ob4((Object) hs6Var, (int) b2, (Object) tL_emojiStatuses, (byte) 6));
                        gm.c3(new vp6(hs6Var, b));
                        break;
                    }
                } else {
                    hs6Var.I0[b2] = false;
                    break;
                }
                break;
            case 1:
                this.b.z1(this.c, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
                break;
            default:
                byte b3 = this.c;
                if (b3 == 3 || b3 == 7) {
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        r1 = ((TLRPC.TL_messages_stickers) tLObject).stickers;
                    }
                } else if (b3 == 2) {
                    if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                        r1 = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
                    }
                } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                    r1 = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
                }
                this.b.z1(b3, r1, false, 0, true);
                break;
        }
    }
}
