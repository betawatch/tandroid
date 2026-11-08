package bg;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.ij;
import org.telegram.messenger.s9;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.x5;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((h) obj).a;
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
                return -((TL_stories.StoryItem) jg.g.i(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 11:
                return ((s9) obj).e.bid_date;
            case 12:
                return Integer.parseInt((String) obj);
            case 13:
                return ((ij) obj).f1();
            case 14:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 15:
                return ((TLRPC.Message) obj).id;
            case 16:
                return ((TLRPC.Message) obj).id;
            case 17:
                return ((x5) obj).d;
            case 18:
                return ((x5) obj).e;
            case 19:
                ad.c cVar = (ad.c) obj;
                return cVar.d - cVar.b;
            case 20:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i7 = messagePeerReaction.date;
                return (i7 <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i7;
            case 21:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction2.date;
                return (i10 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i10;
            default:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
        }
    }
}
