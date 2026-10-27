package ag;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((i) obj).a;
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
                return -((TL_stories.StoryItem) ic.a.g(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 11:
                return ((MessageObject) obj).getId();
            case 12:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 13:
                return ((TLRPC.Message) obj).id;
            case 14:
                return ((TLRPC.Message) obj).id;
            case 15:
                return ((i6) obj).d;
            case 16:
                return ((i6) obj).e;
            case 17:
                dd.c cVar = (dd.c) obj;
                return cVar.d - cVar.b;
            case 18:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                return (i10 <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i10;
            case 19:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                return (i11 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i11;
            default:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
        }
    }
}
