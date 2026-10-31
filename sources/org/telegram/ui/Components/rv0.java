package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ rv0(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                        i10++;
                        f5.g(this.b).b(emojiGroup.icon_emoji_id, null);
                    }
                    break;
                }
                break;
            default:
                th.l lVar = (th.l) ((View) obj);
                lVar.invalidate();
                lVar.D.setTextColor(this.b);
                break;
        }
    }
}
