package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class eh implements ii, lr {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.a = c1Var;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        li liVar = (li) this.a;
        ji jiVar = (ji) this.b;
        ki kiVar = (ki) this.c;
        u10 u10Var = (u10) this.d;
        HashMap hashMap = liVar.Q1;
        if (hashMap.containsKey(jiVar)) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hi hiVar = (hi) obj;
                if (!TextUtils.isEmpty(hiVar.a) && !hiVar.a.startsWith("animated_")) {
                    sb2.append(hiVar.a);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            boolean z10 = jiVar.a;
            String str2 = jiVar.b;
            tL_messages_searchStickers.emojis = z10;
            if (!TextUtils.isEmpty(str2)) {
                tL_messages_searchStickers.lang_code.add(str2);
            }
            tL_messages_searchStickers.emoticon = sb2.toString();
            tL_messages_searchStickers.q = jiVar.c;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = kiVar != null ? kiVar.b.intValue() : 0;
            hashMap.put(jiVar, Integer.valueOf(liVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new c3.b(1), new g9(liVar, jiVar, kiVar, u10Var, 1))));
        }
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        yy yyVar = (yy) this.a;
        Uri uri = (Uri) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        w70 w70Var = (w70) this.d;
        if (j10 != 0) {
            yyVar.Q(-j10, uri, arrayList, w70Var);
        } else {
            w70Var.run(0L);
        }
    }
}
