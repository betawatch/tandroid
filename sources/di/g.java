package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.a) {
            case 0:
                q qVar = (q) ((View) obj);
                qVar.invalidate();
                qVar.y.setTextColor(this.b);
                break;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Components.t5.h(this.b).b(emojiGroup.icon_emoji_id, null);
                    }
                    break;
                }
                break;
        }
    }
}
