package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class il implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;

    public /* synthetic */ il(vp vpVar, int i10) {
        this.a = i10;
        this.b = vpVar;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                i0.g3(new pl(this.b, (TL_account.TL_webBrowserSettings) obj2, 1));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                vp vpVar = this.b;
                if (!z10) {
                    vpVar.getClass();
                    break;
                } else {
                    vpVar.N4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                vp vpVar2 = this.b;
                if (updates == null) {
                    vpVar2.getClass();
                    break;
                } else {
                    vpVar2.L3(updates, false);
                    break;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                vp vpVar3 = this.b;
                if (updates2 != null) {
                    vpVar3.L3(updates2, false);
                }
                i0.g3(new zj(vpVar3, 22));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                vp vpVar4 = this.b;
                if (updates3 != null) {
                    vpVar4.L3(updates3, false);
                }
                i0.g3(new zj(vpVar4, 20));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                vp vpVar5 = this.b;
                if (emojiGameInfo != null) {
                    vpVar5.x8 = emojiGameInfo;
                }
                ArrayList arrayList = vpVar5.w8;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((q20) obj3).a(Boolean.valueOf(vpVar5.x8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                vpVar5.w8 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                vp vpVar6 = this.b;
                if (!z11) {
                    vpVar6.getClass();
                    break;
                } else {
                    vpVar6.N4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
        }
    }
}
