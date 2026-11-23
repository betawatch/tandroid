package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bl implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ bl(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g0.g3(new kl(this.b, (TL_account.TL_webBrowserSettings) obj2, 0));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                np npVar = this.b;
                if (!z10) {
                    npVar.getClass();
                    break;
                } else {
                    npVar.c5((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                np npVar2 = this.b;
                if (updates == null) {
                    npVar2.getClass();
                    break;
                } else {
                    npVar2.V3(updates, false);
                    break;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                np npVar3 = this.b;
                if (updates2 != null) {
                    npVar3.V3(updates2, false);
                }
                g0.g3(new sj(npVar3, 23));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                np npVar4 = this.b;
                if (updates3 != null) {
                    npVar4.V3(updates3, false);
                }
                g0.g3(new sj(npVar4, 21));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                np npVar5 = this.b;
                if (emojiGameInfo != null) {
                    npVar5.C8 = emojiGameInfo;
                }
                ArrayList arrayList = npVar5.B8;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    ((y10) obj3).a(Boolean.valueOf(npVar5.C8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                npVar5.B8 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                np npVar6 = this.b;
                if (!z11) {
                    npVar6.getClass();
                    break;
                } else {
                    npVar6.c5((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
        }
    }
}
