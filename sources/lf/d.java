package lf;

import java.util.function.ToIntFunction;
import kh.a2;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((f) obj).a;
            case 1:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 2:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 3:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 4:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 5:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 6:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 7:
                return -((TL_stories.StoryView) obj).date;
            case 8:
                return ((TL_stories.StoryItem) obj).date;
            case 9:
                return -((TL_stories.StoryItem) a2.i(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((MessageObject) obj).getId();
            case 11:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 12:
                return ((TLRPC.Message) obj).id;
            case 13:
                return ((TLRPC.Message) obj).id;
            case 14:
                return ((a6) obj).d;
            case 15:
                return ((a6) obj).e;
            case 16:
                mc.c cVar = (mc.c) obj;
                return cVar.d - cVar.b;
            case 17:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                return (i10 <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i10;
            case 18:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                return (i11 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i11;
            default:
                return ((Integer) ((Object[]) obj)[1]).intValue();
        }
    }
}
