package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d80;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nh implements pi, pr {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.a = c1Var;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.pi
    public void e(String str, ArrayList arrayList) {
        si siVar = (si) this.a;
        qi qiVar = (qi) this.b;
        ri riVar = (ri) this.c;
        y10 y10Var = (y10) this.d;
        HashMap hashMap = siVar.S1;
        if (hashMap.containsKey(qiVar)) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                oi oiVar = (oi) obj;
                if (!TextUtils.isEmpty(oiVar.a) && !oiVar.a.startsWith("animated_")) {
                    sb2.append(oiVar.a);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            boolean z10 = qiVar.a;
            String str2 = qiVar.b;
            tL_messages_searchStickers.emojis = z10;
            if (!TextUtils.isEmpty(str2)) {
                tL_messages_searchStickers.lang_code.add(str2);
            }
            tL_messages_searchStickers.emoticon = sb2.toString();
            tL_messages_searchStickers.q = qiVar.c;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = riVar != null ? riVar.b.intValue() : 0;
            hashMap.put(qiVar, Integer.valueOf(siVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new l9(siVar, qiVar, riVar, y10Var, 1))));
        }
    }

    @Override // org.telegram.messenger.pr
    public void run(long j3) {
        az azVar = (az) this.a;
        Uri uri = (Uri) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        d80 d80Var = (d80) this.d;
        if (j3 != 0) {
            azVar.Q(-j3, uri, arrayList, d80Var);
        } else {
            d80Var.run(0L);
        }
    }
}
