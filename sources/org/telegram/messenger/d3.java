package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d3(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        TLRPC.Document document;
        int i3;
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                u10 u10Var = (u10) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                e3Var.m = tL_premium_boostsStatus.next_level_boosts <= 0;
                e3Var.a(tL_premium_myBoosts);
                u10Var.a(e3Var);
                break;
            case 1:
                x6 x6Var = (x6) this.b;
                w6 w6Var = (w6) this.c;
                zi ziVar = (zi) this.d;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                x6Var.b.put(w6Var.b, tL_factCheck);
                ziVar.k.factcheck = tL_factCheck;
                break;
            case 2:
                Utilities.d.c(new ul((r8) this.b, (String) this.c, (String) this.d, (ei.j6) obj, 8));
                break;
            case 3:
                String str = (String) this.b;
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j10 = i6.j(str, null);
                    for (int i10 = 0; i10 < j10.size(); i10++) {
                        ((g6) j10.get(i10)).c = i6.c(((g6) j10.get(i10)).c.toString());
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i11);
                            int size = j10.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj2 = j10.get(i12);
                                i12++;
                                g6 g6Var = (g6) obj2;
                                for (0; i3 < tL_messages_stickerSet.packs.size(); i3 + 1) {
                                    i3 = (tL_messages_stickerSet.packs.get(i3).documents.contains(Long.valueOf(document.id)) && TextUtils.equals(i6.c(tL_messages_stickerSet.packs.get(i3).emoticon), g6Var.c)) ? 0 : i3 + 1;
                                }
                            }
                        } else {
                            document = null;
                        }
                        i11++;
                    }
                    if (document != null) {
                        k9Var.p(ac.b(document), str2, t5.f(document, org.telegram.ui.ActionBar.k6.m6, 0.2f, null), document);
                        k9Var.invalidate();
                        break;
                    }
                }
                break;
            case 4:
                boolean[] zArr = (boolean[]) this.b;
                ArrayList[] arrayListArr = (ArrayList[]) this.c;
                dh dhVar = (dh) this.d;
                ArrayList arrayList = (ArrayList) obj;
                if (!zArr[0]) {
                    arrayListArr[0] = arrayList;
                    dhVar.run();
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) this.b;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.c;
                ml mlVar = (ml) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!zArr2[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    g0.h3(mlVar);
                    break;
                }
                break;
        }
    }
}
