package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public void c(String str, ArrayList arrayList) {
        ri riVar = (ri) this.a;
        pi piVar = (pi) this.b;
        qi qiVar = (qi) this.c;
        w10 w10Var = (w10) this.d;
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
            hashMap.put(piVar, Integer.valueOf(riVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new k9(riVar, piVar, qiVar, w10Var, 1))));
        }
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        zy zyVar = (zy) this.a;
        Uri uri = (Uri) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        c80 c80Var = (c80) this.d;
        if (j3 != 0) {
            zyVar.Q(-j3, uri, arrayList, c80Var);
        } else {
            c80Var.run(0L);
        }
    }
}
