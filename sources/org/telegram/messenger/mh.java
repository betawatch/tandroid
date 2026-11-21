package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class mh implements oi, or {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.a = c1Var;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.oi
    public void e(String str, ArrayList arrayList) {
        ri riVar = (ri) this.a;
        pi piVar = (pi) this.b;
        qi qiVar = (qi) this.c;
        x10 x10Var = (x10) this.d;
        HashMap hashMap = riVar.S1;
        if (hashMap.containsKey(piVar)) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ni niVar = (ni) obj;
                if (!TextUtils.isEmpty(niVar.a) && !niVar.a.startsWith("animated_")) {
                    sb2.append(niVar.a);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            boolean z10 = piVar.a;
            String str2 = piVar.b;
            tL_messages_searchStickers.emojis = z10;
            if (!TextUtils.isEmpty(str2)) {
                tL_messages_searchStickers.lang_code.add(str2);
            }
            tL_messages_searchStickers.emoticon = sb2.toString();
            tL_messages_searchStickers.q = piVar.c;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = qiVar != null ? qiVar.b.intValue() : 0;
            hashMap.put(piVar, Integer.valueOf(riVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new k9(riVar, piVar, qiVar, x10Var, 1))));
        }
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        zy zyVar = (zy) this.a;
        Uri uri = (Uri) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        d80 d80Var = (d80) this.d;
        if (j3 != 0) {
            zyVar.Q(-j3, uri, arrayList, d80Var);
        } else {
            d80Var.run(0L);
        }
    }
}
