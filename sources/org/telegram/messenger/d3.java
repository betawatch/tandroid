package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d3(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        TLRPC.Document document;
        int i7;
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                z10 z10Var = (z10) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                e3Var.m = tL_premium_boostsStatus.next_level_boosts <= 0;
                e3Var.a(tL_premium_myBoosts);
                z10Var.a(e3Var);
                break;
            case 1:
                x6 x6Var = (x6) this.b;
                w6 w6Var = (w6) this.c;
                gj gjVar = (gj) this.d;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                x6Var.b.put(w6Var.b, tL_factCheck);
                gjVar.k.factcheck = tL_factCheck;
                break;
            case 2:
                Utilities.d.c(new bm((r8) this.b, (String) this.c, (String) this.d, (fi.b6) obj, 8));
                break;
            case 3:
                String str = (String) this.b;
                org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) this.c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j3 = j6.j(str, null);
                    for (int i10 = 0; i10 < j3.size(); i10++) {
                        ((h6) j3.get(i10)).c = j6.c(((h6) j3.get(i10)).c.toString());
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i11);
                            int size = j3.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj2 = j3.get(i12);
                                i12++;
                                h6 h6Var = (h6) obj2;
                                for (0; i7 < tL_messages_stickerSet.packs.size(); i7 + 1) {
                                    i7 = (tL_messages_stickerSet.packs.get(i7).documents.contains(Long.valueOf(document.id)) && TextUtils.equals(j6.c(tL_messages_stickerSet.packs.get(i7).emoticon), h6Var.c)) ? 0 : i7 + 1;
                                }
                            }
                        } else {
                            document = null;
                        }
                        i11++;
                    }
                    if (document != null) {
                        i9Var.p(gc.b(document), str2, t5.f(document, org.telegram.ui.ActionBar.j6.m6, 0.2f, null), document);
                        i9Var.invalidate();
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
                tl tlVar = (tl) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!zArr2[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    g0.h3(tlVar);
                    break;
                }
                break;
        }
    }
}
