package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        TLRPC.Document document;
        int i10;
        switch (this.a) {
            case 0:
                h3 h3Var = (h3) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                q20 q20Var = (q20) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                h3Var.m = tL_premium_boostsStatus.next_level_boosts <= 0;
                h3Var.a(tL_premium_myBoosts);
                q20Var.a(h3Var);
                break;
            case 1:
                a7 a7Var = (a7) this.b;
                z6 z6Var = (z6) this.c;
                jj jjVar = (jj) this.d;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                a7Var.b.put(z6Var.b, tL_factCheck);
                jjVar.k.factcheck = tL_factCheck;
                break;
            case 2:
                Utilities.d.c(new ul((w8) this.b, (String) this.c, (String) this.d, (th.p4) obj, 8));
                break;
            case 3:
                String str = (String) this.b;
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j10 = k6.j(str, null);
                    for (int i11 = 0; i11 < j10.size(); i11++) {
                        ((i6) j10.get(i11)).c = k6.c(((i6) j10.get(i11)).c.toString());
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i12);
                            int size = j10.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj2 = j10.get(i13);
                                i13++;
                                i6 i6Var = (i6) obj2;
                                for (0; i10 < tL_messages_stickerSet.packs.size(); i10 + 1) {
                                    i10 = (tL_messages_stickerSet.packs.get(i10).documents.contains(Long.valueOf(document.id)) && TextUtils.equals(k6.c(tL_messages_stickerSet.packs.get(i10).emoticon), i6Var.c)) ? 0 : i10 + 1;
                                }
                            }
                        } else {
                            document = null;
                        }
                        i12++;
                    }
                    if (document != null) {
                        g9Var.p(ic.b(document), str2, v5.f(document, org.telegram.ui.ActionBar.t6.m6, 0.2f, null), document);
                        g9Var.invalidate();
                        break;
                    }
                }
                break;
            case 4:
                boolean[] zArr = (boolean[]) this.b;
                ArrayList[] arrayListArr = (ArrayList[]) this.c;
                kh khVar = (kh) this.d;
                ArrayList arrayList = (ArrayList) obj;
                if (!zArr[0]) {
                    arrayListArr[0] = arrayList;
                    khVar.run();
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) this.b;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.c;
                am amVar = (am) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!zArr2[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    i0.g3(amVar);
                    break;
                }
                break;
        }
    }
}
