package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.e80;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class nh implements ri, tr {
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

    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        ui uiVar = (ui) this.a;
        si siVar = (si) this.b;
        ti tiVar = (ti) this.c;
        c20 c20Var = (c20) this.d;
        HashMap hashMap = uiVar.P1;
        if (hashMap.containsKey(siVar)) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                qi qiVar = (qi) obj;
                if (!TextUtils.isEmpty(qiVar.a) && !qiVar.a.startsWith("animated_")) {
                    sb2.append(qiVar.a);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            boolean z9 = siVar.a;
            String str2 = siVar.b;
            tL_messages_searchStickers.emojis = z9;
            if (!TextUtils.isEmpty(str2)) {
                tL_messages_searchStickers.lang_code.add(str2);
            }
            tL_messages_searchStickers.emoticon = sb2.toString();
            tL_messages_searchStickers.q = siVar.c;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = tiVar != null ? tiVar.b.intValue() : 0;
            hashMap.put(siVar, Integer.valueOf(uiVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new m9(uiVar, siVar, tiVar, c20Var, 1))));
        }
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        gz gzVar = (gz) this.a;
        Uri uri = (Uri) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        e80 e80Var = (e80) this.d;
        if (j3 != 0) {
            gzVar.Q(-j3, uri, arrayList, e80Var);
        } else {
            e80Var.run(0L);
        }
    }
}
