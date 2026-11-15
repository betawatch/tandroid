package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class nh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ int c;

    public /* synthetic */ nh(si siVar, int i7, int i10) {
        this.a = i10;
        this.b = siVar;
        this.c = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        switch (this.a) {
            case 0:
                si siVar = this.b;
                Long[] lArr = siVar.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i7 = this.c;
                lArr[i7] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        siVar.E0[i7] = tL_emojiStatuses.hash;
                        siVar.F0[i7] = tL_emojiStatuses.statuses;
                        siVar.getMessagesStorage().a.c(new l7(siVar, i7, tL_emojiStatuses, 8));
                        g0.h3(new eg(siVar, 1));
                        break;
                    }
                } else {
                    siVar.I0[i7] = false;
                    break;
                }
                break;
            case 1:
                g0.h3(new cg(this.b, tL_error, tLObject, this.c, 0));
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
