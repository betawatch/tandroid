package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ gl(qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g0.h3(new ll(this.b, (TL_account.TL_webBrowserSettings) obj2, 1));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                boolean z9 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                qp qpVar = this.b;
                if (!z9) {
                    qpVar.getClass();
                    break;
                } else {
                    qpVar.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                qp qpVar2 = this.b;
                if (updates == null) {
                    qpVar2.getClass();
                    break;
                } else {
                    qpVar2.O3(updates, false);
                    break;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                qp qpVar3 = this.b;
                if (updates2 != null) {
                    qpVar3.O3(updates2, false);
                }
                g0.h3(new wj(qpVar3, 22));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                qp qpVar4 = this.b;
                if (updates3 != null) {
                    qpVar4.O3(updates3, false);
                }
                g0.h3(new wj(qpVar4, 21));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                qp qpVar5 = this.b;
                if (emojiGameInfo != null) {
                    qpVar5.w8 = emojiGameInfo;
                }
                ArrayList arrayList = qpVar5.v8;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    ((c20) obj3).a(Boolean.valueOf(qpVar5.w8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                qpVar5.v8 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                boolean z10 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                qp qpVar6 = this.b;
                if (!z10) {
                    qpVar6.getClass();
                    break;
                } else {
                    qpVar6.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
        }
    }
}
