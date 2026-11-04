package ei;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i3, int i10) {
        this.a = i10;
        this.b = i3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.a) {
            case 0:
                q qVar = (q) ((View) obj);
                qVar.invalidate();
                qVar.E.setTextColor(this.b);
                break;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i3);
                        i3++;
                        org.telegram.ui.Components.g5.g(this.b).b(emojiGroup.icon_emoji_id, null);
                    }
                    break;
                }
                break;
        }
    }
}
