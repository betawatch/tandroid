// default package

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dw9 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ dw9(LinkedHashSet linkedHashSet, Runnable runnable, byte b) {
        this.a = b;
        this.b = linkedHashSet;
        this.c = runnable;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        Runnable runnable = this.c;
        LinkedHashSet linkedHashSet = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    linkedHashSet.addAll(arrayList);
                }
                runnable.run();
                break;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                runnable.run();
                break;
        }
    }
}
