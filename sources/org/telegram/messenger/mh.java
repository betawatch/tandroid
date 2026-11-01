package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b90;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class mh implements si, ds {
    public final /* synthetic */ f1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mh(f1 f1Var, Object obj, Object obj2, Object obj3) {
        this.a = f1Var;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.si
    public void c(String str, ArrayList arrayList) {
        vi viVar = (vi) this.a;
        ti tiVar = (ti) this.b;
        ui uiVar = (ui) this.c;
        r20 r20Var = (r20) this.d;
        HashMap hashMap = viVar.P1;
        if (hashMap.containsKey(tiVar)) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ri riVar = (ri) obj;
                if (!TextUtils.isEmpty(riVar.a) && !riVar.a.startsWith("animated_")) {
                    sb2.append(riVar.a);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            boolean z10 = tiVar.a;
            String str2 = tiVar.b;
            tL_messages_searchStickers.emojis = z10;
            if (!TextUtils.isEmpty(str2)) {
                tL_messages_searchStickers.lang_code.add(str2);
            }
            tL_messages_searchStickers.emoticon = sb2.toString();
            tL_messages_searchStickers.q = tiVar.c;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = uiVar != null ? uiVar.b.intValue() : 0;
            hashMap.put(tiVar, Integer.valueOf(viVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new a3.b(1), new o9(viVar, tiVar, uiVar, r20Var, 1))));
        }
    }

    @Override // org.telegram.messenger.ds
    public void run(long j10) {
        rz rzVar = (rz) this.a;
        Uri uri = (Uri) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        b90 b90Var = (b90) this.d;
        if (j10 != 0) {
            rzVar.Q(-j10, uri, arrayList, b90Var);
        } else {
            b90Var.run(0L);
        }
    }
}
