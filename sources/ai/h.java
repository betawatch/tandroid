package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h {
    public static final g c = new g(null, 0, null, true);
    public final int a;
    public int b = -1;

    public h(int i7) {
        this.a = i7;
        try {
            mp.u1(i7).T1().b();
        } catch (Exception unused) {
        }
    }

    public final void a(g gVar, String str, f fVar) {
        b();
        boolean z10 = gVar.d;
        TL_aicompose.AiComposeTone aiComposeTone = gVar.c;
        if (!z10 && aiComposeTone == null) {
            org.telegram.messenger.g0.g3(new a3.f(fVar, 4));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (gVar.d) {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
        } else {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        }
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.g0.h3(new aa.r(this, zArr, fVar, 2), 25000L);
        this.b = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new e(this, zArr, currentTimeMillis, fVar));
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
                    arrayList.add(new g(aiComposeTone.title, aiComposeTone.emoji_id, aiComposeTone, false));
                }
            }
        }
        return arrayList;
    }
}
