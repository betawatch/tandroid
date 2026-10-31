package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class oh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ int c;

    public /* synthetic */ oh(ui uiVar, int i10, int i11) {
        this.a = i11;
        this.b = uiVar;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                Long[] lArr = uiVar.F0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i10 = this.c;
                lArr[i10] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        uiVar.D0[i10] = tL_emojiStatuses.hash;
                        uiVar.E0[i10] = tL_emojiStatuses.statuses;
                        uiVar.getMessagesStorage().a.c(new o7(uiVar, i10, tL_emojiStatuses, 8));
                        i0.g3(new eg(uiVar, 1));
                        break;
                    }
                } else {
                    uiVar.H0[i10] = false;
                    break;
                }
                break;
            case 1:
                i0.g3(new cg(this.b, tL_error, tLObject, this.c, 0));
                break;
            case 2:
                this.b.y1(this.c, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
                break;
            default:
                int i11 = this.c;
                if (i11 == 3 || i11 == 7) {
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
                    }
                    arrayList = null;
                } else if (i11 == 2) {
                    if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                        arrayList = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
                    }
                    arrayList = null;
                } else {
                    if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                        arrayList = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
                    }
                    arrayList = null;
                }
                this.b.y1(i11, arrayList, false, 0, true);
                break;
        }
    }
}
