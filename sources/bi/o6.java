package bi;

import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ o6(int i10) {
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
                return -((TL_stories.StoryItem) i2.g.h(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 3:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 4:
                return ((MessageObject) obj).getId();
            case 5:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 6:
                return ((TLRPC.Message) obj).id;
            case 7:
                return ((TLRPC.Message) obj).id;
            case 8:
                return ((org.telegram.ui.Components.f6) obj).d;
            case 9:
                return ((org.telegram.ui.Components.f6) obj).e;
            case 10:
                ad.c cVar = (ad.c) obj;
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
                return ((yf.d) obj).a;
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
            default:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
        }
    }
}
