package ai;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ h7(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return -((TL_stories.StoryView) obj).date;
            case 1:
                return ((TL_stories.StoryItem) obj).date;
            case 2:
                return -((TL_stories.StoryItem) hg.c.g(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 3:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 4:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            case 5:
                return ((MessageObject) obj).getId();
            case 6:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 7:
                return ((TLRPC.Message) obj).id;
            case 8:
                return ((TLRPC.Message) obj).id;
            case 9:
                return ((org.telegram.ui.Components.h6) obj).d;
            case 10:
                return ((org.telegram.ui.Components.h6) obj).e;
            case 11:
                bd.c cVar = (bd.c) obj;
                return cVar.d - cVar.b;
            case 12:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                return (i10 <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i10;
            case 13:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                return (i11 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i11;
            case 14:
                return ((yf.d) obj).a;
            case 15:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 16:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 17:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 18:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 19:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            default:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
        }
    }
}
