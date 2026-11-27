// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fg3 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ fg3(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // pcc
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                og3 og3Var = (og3) ((View) obj);
                og3Var.invalidate();
                og3Var.E.setTextColor(i);
                break;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i2);
                        i2++;
                        wl.g(i).b(emojiGroup.icon_emoji_id, null);
                    }
                    break;
                }
                break;
        }
    }
}
