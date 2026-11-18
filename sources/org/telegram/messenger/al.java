package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class al implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ al(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g0.g3(new jl(this.b, (TL_account.TL_webBrowserSettings) obj2, 0));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                mp mpVar = this.b;
                if (!z10) {
                    mpVar.getClass();
                    break;
                } else {
                    mpVar.c5((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                mp mpVar2 = this.b;
                if (updates == null) {
                    mpVar2.getClass();
                    break;
                } else {
                    mpVar2.V3(updates, false);
                    break;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                mp mpVar3 = this.b;
                if (updates2 != null) {
                    mpVar3.V3(updates2, false);
                }
                g0.g3(new rj(mpVar3, 23));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                mp mpVar4 = this.b;
                if (updates3 != null) {
                    mpVar4.V3(updates3, false);
                }
                g0.g3(new rj(mpVar4, 21));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                mp mpVar5 = this.b;
                if (emojiGameInfo != null) {
                    mpVar5.C8 = emojiGameInfo;
                }
                ArrayList arrayList = mpVar5.B8;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    ((x10) obj3).a(Boolean.valueOf(mpVar5.C8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                mpVar5.B8 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                mp mpVar6 = this.b;
                if (!z11) {
                    mpVar6.getClass();
                    break;
                } else {
                    mpVar6.c5((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
        }
    }
}
