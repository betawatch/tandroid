package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ int c;

    public /* synthetic */ gh(li liVar, int i3, int i10) {
        this.a = i10;
        this.b = liVar;
        this.c = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        switch (this.a) {
            case 0:
                li liVar = this.b;
                Long[] lArr = liVar.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i3 = this.c;
                lArr[i3] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        liVar.E0[i3] = tL_emojiStatuses.hash;
                        liVar.F0[i3] = tL_emojiStatuses.statuses;
                        liVar.getMessagesStorage().a.c(new k7(liVar, i3, tL_emojiStatuses, 8));
                        g0.h3(new xf(liVar, 1));
                        break;
                    }
                } else {
                    liVar.I0[i3] = false;
                    break;
                }
                break;
            case 1:
                g0.h3(new vf(this.b, tL_error, tLObject, this.c, 0));
                break;
            case 2:
                this.b.y1(this.c, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
                break;
            default:
                int i10 = this.c;
                if (i10 == 3 || i10 == 7) {
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
                    }
                    arrayList = null;
                } else if (i10 == 2) {
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
                this.b.y1(i10, arrayList, false, 0, true);
                break;
        }
    }
}
