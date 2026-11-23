package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ int c;

    public /* synthetic */ ph(si siVar, int i7, int i10) {
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
                        g0.g3(new fg(siVar, 3));
                        break;
                    }
                } else {
                    siVar.I0[i7] = false;
                    break;
                }
                break;
            case 1:
                g0.g3(new eg(this.b, tL_error, tLObject, this.c, 0));
                break;
            case 2:
                this.b.B1(this.c, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
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
                this.b.B1(i10, arrayList, false, 0, true);
                break;
        }
    }
}
