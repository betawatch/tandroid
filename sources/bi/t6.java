package bi;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.jj;
import org.telegram.messenger.t9;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ t6(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 1:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            case 2:
                return ((t9) obj).e.bid_date;
            case 3:
                return Integer.parseInt((String) obj);
            case 4:
                return ((jj) obj).f1();
            case 5:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 6:
                return ((TLRPC.Message) obj).id;
            case 7:
                return ((TLRPC.Message) obj).id;
            case 8:
                return ((org.telegram.ui.Components.u5) obj).d;
            case 9:
                return ((org.telegram.ui.Components.u5) obj).e;
            case 10:
                uc.c cVar = (uc.c) obj;
                return cVar.d - cVar.b;
            case 11:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                return (i10 <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i10;
            case 12:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                return (i11 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i11;
            case 13:
                return ((rf.d) obj).a;
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
                return -((TL_stories.StoryView) obj).date;
            case 21:
                return ((TL_stories.StoryItem) obj).date;
            default:
                return -((TL_stories.StoryItem) i0.a.g(1, ((TL_stories.PeerStories) obj).stories)).date;
        }
    }
}
