package cg;

import java.util.Map;
import java.util.function.ToIntFunction;
import k2.p1;
import org.telegram.messenger.m9;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.v5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i3) {
        this.a = i3;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((g) obj).a;
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
                return -((TL_stories.StoryItem) p1.h(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 11:
                return ((m9) obj).e.bid_date;
            case 12:
                return Integer.parseInt((String) obj);
            case 13:
                return ((zi) obj).f1();
            case 14:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 15:
                return ((TLRPC.Message) obj).id;
            case 16:
                return ((TLRPC.Message) obj).id;
            case 17:
                return ((v5) obj).d;
            case 18:
                return ((v5) obj).e;
            case 19:
                xc.c cVar = (xc.c) obj;
                return cVar.d - cVar.b;
            case 20:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i3 = messagePeerReaction.date;
                return (i3 <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i3;
            case 21:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction2.date;
                return (i10 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i10;
            default:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
        }
    }
}
