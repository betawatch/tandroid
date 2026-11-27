// default package

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm implements ToIntFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ nm(byte b) {
        this.a = b;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((om) obj).d;
            case 1:
                return ((om) obj).e;
            case 2:
                return ((dk0) obj).a;
            case 3:
                return ((r47) obj).e1();
            case 4:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 5:
                return ((kv4) obj).e.bid_date;
            case 6:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            case 7:
                ji5 ji5Var = (ji5) obj;
                return ji5Var.d - ji5Var.b;
            case 8:
                return Integer.parseInt((String) obj);
            case 9:
                return ((TLRPC.Message) obj).id;
            case 10:
                return ((TLRPC.Message) obj).id;
            case 11:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i = messagePeerReaction.date;
                return (i <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i;
            case 12:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i2 = messagePeerReaction2.date;
                return (i2 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i2;
            case 13:
                return -((TL_stories.StoryView) obj).date;
            case 14:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 15:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 16:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 17:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 18:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 19:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 20:
                return ((TL_stories.StoryItem) obj).date;
            case 21:
                return -((TL_stories.StoryItem) c00.g(1, ((TL_stories.PeerStories) obj).stories)).date;
            default:
                return ((Integer) ((Object[]) obj)[1]).intValue();
        }
    }
}
