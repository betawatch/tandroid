package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ f(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.a) {
            case 0:
                p pVar = (p) ((View) obj);
                pVar.invalidate();
                pVar.D.setTextColor(this.b);
                break;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Components.h5.g(this.b).b(emojiGroup.icon_emoji_id, null);
                    }
                    break;
                }
                break;
        }
    }
}
