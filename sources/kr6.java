// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class kr6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kr6(ls6 ls6Var, int i, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 2;
        byte b2 = 7;
        switch (this.a) {
            case 0:
                ls6 ls6Var = this.b;
                Long[] lArr = ls6Var.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                byte b3 = this.c;
                lArr[b3] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        ls6Var.E0[b3] = tL_emojiStatuses.hash;
                        ls6Var.F0[b3] = tL_emojiStatuses.statuses;
                        ls6Var.getMessagesStorage().a.c(new sb4(ls6Var, b3, tL_emojiStatuses, b2));
                        hl.c3(new ip6(ls6Var, b));
                        break;
                    }
                } else {
                    ls6Var.I0[b3] = false;
                    break;
                }
                break;
            case 1:
                this.b.z1(this.c, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
                break;
            default:
                byte b4 = this.c;
                if (b4 == 3 || b4 == 7) {
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        r2 = ((TLRPC.TL_messages_stickers) tLObject).stickers;
                    }
                } else if (b4 == 2) {
                    if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                        r2 = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
                    }
                } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                    r2 = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
                }
                this.b.z1(b4, r2, false, 0, true);
                break;
        }
    }
}
