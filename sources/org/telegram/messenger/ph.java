package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ int c;

    public /* synthetic */ ph(ui uiVar, int i7, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                Long[] lArr = uiVar.F0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i7 = this.c;
                lArr[i7] = valueOf;
                if (!(tLObject instanceof TL_account.TL_emojiStatusesNotModified)) {
                    if (tLObject instanceof TL_account.TL_emojiStatuses) {
                        TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                        uiVar.D0[i7] = tL_emojiStatuses.hash;
                        uiVar.E0[i7] = tL_emojiStatuses.statuses;
                        uiVar.getMessagesStorage().a.c(new l7(uiVar, i7, tL_emojiStatuses, 8));
                        g0.h3(new fg(uiVar, 1));
                        break;
                    }
                } else {
                    uiVar.H0[i7] = false;
                    break;
                }
                break;
            case 1:
                g0.h3(new dg(this.b, tL_error, tLObject, this.c, 0));
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
