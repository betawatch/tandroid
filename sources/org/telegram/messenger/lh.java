package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lh implements ri, cs {
    public final /* synthetic */ f1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lh(f1 f1Var, Object obj, Object obj2, Object obj3) {
        this.a = f1Var;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        ui uiVar = (ui) this.a;
        si siVar = (si) this.b;
        ti tiVar = (ti) this.c;
        q20 q20Var = (q20) this.d;
        HashMap hashMap = uiVar.P1;
        if (hashMap.containsKey(siVar)) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                qi qiVar = (qi) obj;
                if (!TextUtils.isEmpty(qiVar.a) && !qiVar.a.startsWith("animated_")) {
                    sb2.append(qiVar.a);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            boolean z10 = siVar.a;
            String str2 = siVar.b;
            tL_messages_searchStickers.emojis = z10;
            if (!TextUtils.isEmpty(str2)) {
                tL_messages_searchStickers.lang_code.add(str2);
            }
            tL_messages_searchStickers.emoticon = sb2.toString();
            tL_messages_searchStickers.q = siVar.c;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = tiVar != null ? tiVar.b.intValue() : 0;
            hashMap.put(siVar, Integer.valueOf(uiVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new a3.b(1), new n9(uiVar, siVar, tiVar, q20Var, 1))));
        }
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        qz qzVar = (qz) this.a;
        Uri uri = (Uri) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        c90 c90Var = (c90) this.d;
        if (j10 != 0) {
            qzVar.Q(-j10, uri, arrayList, c90Var);
        } else {
            c90Var.run(0L);
        }
    }
}
