package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class cl implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ cl(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g0.h3(new il(this.b, (TL_account.TL_webBrowserSettings) obj2, 1));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                np npVar = this.b;
                if (!z10) {
                    npVar.getClass();
                    break;
                } else {
                    npVar.R4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                np npVar2 = this.b;
                if (updates == null) {
                    npVar2.getClass();
                    break;
                } else {
                    npVar2.O3(updates, false);
                    break;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                np npVar3 = this.b;
                if (updates2 != null) {
                    npVar3.O3(updates2, false);
                }
                g0.h3(new tj(npVar3, 23));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                np npVar4 = this.b;
                if (updates3 != null) {
                    npVar4.O3(updates3, false);
                }
                g0.h3(new tj(npVar4, 22));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                np npVar5 = this.b;
                if (emojiGameInfo != null) {
                    npVar5.x8 = emojiGameInfo;
                }
                ArrayList arrayList = npVar5.w8;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    ((z10) obj3).a(Boolean.valueOf(npVar5.x8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                npVar5.w8 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                np npVar6 = this.b;
                if (!z11) {
                    npVar6.getClass();
                    break;
                } else {
                    npVar6.R4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
        }
    }
}
