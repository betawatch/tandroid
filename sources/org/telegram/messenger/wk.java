package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wk implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ wk(hp hpVar, int i3) {
        this.a = i3;
        this.b = hpVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g0.h3(new bl(this.b, (TL_account.TL_webBrowserSettings) obj2, 1));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                hp hpVar = this.b;
                if (!z10) {
                    hpVar.getClass();
                    break;
                } else {
                    hpVar.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                hp hpVar2 = this.b;
                if (updates == null) {
                    hpVar2.getClass();
                    break;
                } else {
                    hpVar2.O3(updates, false);
                    break;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                hp hpVar3 = this.b;
                if (updates2 != null) {
                    hpVar3.O3(updates2, false);
                }
                g0.h3(new mj(hpVar3, 22));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                hp hpVar4 = this.b;
                if (updates3 != null) {
                    hpVar4.O3(updates3, false);
                }
                g0.h3(new mj(hpVar4, 21));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                hp hpVar5 = this.b;
                if (emojiGameInfo != null) {
                    hpVar5.w8 = emojiGameInfo;
                }
                ArrayList arrayList = hpVar5.v8;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    ((u10) obj3).a(Boolean.valueOf(hpVar5.w8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                hpVar5.v8 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                hp hpVar6 = this.b;
                if (!z11) {
                    hpVar6.getClass();
                    break;
                } else {
                    hpVar6.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
        }
    }
}
