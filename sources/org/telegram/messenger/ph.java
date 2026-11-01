package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ int c;

    public /* synthetic */ ph(vi viVar, int i10, int i11) {
        this.a = i11;
        this.b = viVar;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        switch (this.a) {
            case 0:
                vi viVar = this.b;
                Long[] lArr = viVar.F0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i10 = this.c;
                lArr[i10] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        viVar.D0[i10] = tL_emojiStatuses.hash;
                        viVar.E0[i10] = tL_emojiStatuses.statuses;
                        viVar.getMessagesStorage().a.c(new o7(viVar, i10, tL_emojiStatuses, 8));
                        i0.g3(new fg(viVar, 1));
                        break;
                    }
                } else {
                    viVar.H0[i10] = false;
                    break;
                }
                break;
            case 1:
                i0.g3(new dg(this.b, tL_error, tLObject, this.c, 0));
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
