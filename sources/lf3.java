// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lf3 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ lf3(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // p8c
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                uf3 uf3Var = (uf3) ((View) obj);
                uf3Var.invalidate();
                uf3Var.E.setTextColor(i);
                break;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i2);
                        i2++;
                        vl.g(i).b(emojiGroup.icon_emoji_id, null);
                    }
                    break;
                }
                break;
        }
    }
}
