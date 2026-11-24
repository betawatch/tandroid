// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class cp6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cp6(hq6 hq6Var, int i, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 3;
        switch (this.a) {
            case 0:
                hq6 hq6Var = this.b;
                Long[] lArr = hq6Var.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                byte b2 = this.c;
                lArr[b2] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        hq6Var.E0[b2] = tL_emojiStatuses.hash;
                        hq6Var.F0[b2] = tL_emojiStatuses.statuses;
                        hq6Var.getMessagesStorage().a.c(new o94((Object) hq6Var, (int) b2, (Object) tL_emojiStatuses, (byte) 6));
                        gl.d3(new un6(hq6Var, b));
                        break;
                    }
                } else {
                    hq6Var.I0[b2] = false;
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
