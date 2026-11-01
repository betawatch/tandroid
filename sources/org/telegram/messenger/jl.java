package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jl implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ jl(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                i0.g3(new ql(this.b, (TL_account.TL_webBrowserSettings) obj2, 1));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                wp wpVar = this.b;
                if (!z10) {
                    wpVar.getClass();
                    break;
                } else {
                    wpVar.N4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                wp wpVar2 = this.b;
                if (updates == null) {
                    wpVar2.getClass();
                    break;
                } else {
                    wpVar2.L3(updates, false);
                    break;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                wp wpVar3 = this.b;
                if (updates2 != null) {
                    wpVar3.L3(updates2, false);
                }
                i0.g3(new ak(wpVar3, 22));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                wp wpVar4 = this.b;
                if (updates3 != null) {
                    wpVar4.L3(updates3, false);
                }
                i0.g3(new ak(wpVar4, 20));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                wp wpVar5 = this.b;
                if (emojiGameInfo != null) {
                    wpVar5.x8 = emojiGameInfo;
                }
                ArrayList arrayList = wpVar5.w8;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((r20) obj3).a(Boolean.valueOf(wpVar5.x8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                wpVar5.w8 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                wp wpVar6 = this.b;
                if (!z11) {
                    wpVar6.getClass();
                    break;
                } else {
                    wpVar6.N4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
        }
    }
}
