package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d {
    public static final c c = new c(null, 0, null, true);
    public final int a;
    public int b = -1;

    public d(int i7) {
        this.a = i7;
        try {
            mp.u1(i7).T1().b();
        } catch (Exception unused) {
        }
    }

    public final void a(c cVar, String str, b bVar) {
        b();
        boolean z10 = cVar.d;
        TL_aicompose.AiComposeTone aiComposeTone = cVar.c;
        if (!z10 && aiComposeTone == null) {
            org.telegram.messenger.g0.g3(new a3.f(bVar, 4));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (cVar.d) {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
        } else {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        }
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.g0.h3(new aa.r(this, zArr, bVar, 2), 25000L);
        this.b = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new a(this, zArr, currentTimeMillis, bVar));
    }

    public final void b() {
        if (this.b >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.b, true);
            this.b = -1;
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.e T1 = mp.u1(this.a).T1();
        if (T1 != null) {
            ArrayList arrayList2 = T1.b;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
                    arrayList.add(new c(aiComposeTone.title, aiComposeTone.emoji_id, aiComposeTone, false));
                }
            }
        }
        return arrayList;
    }
}
