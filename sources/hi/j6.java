package hi;

import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ j6(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 1:
                return ((MessageObject) obj).getId();
            case 2:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 3:
                return ((TLRPC.Message) obj).id;
            case 4:
                return ((TLRPC.Message) obj).id;
            case 5:
                return ((org.telegram.ui.Components.e6) obj).d;
            case 6:
                return ((org.telegram.ui.Components.e6) obj).e;
            case 7:
                ad.c cVar = (ad.c) obj;
                return cVar.d - cVar.b;
            case 8:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                return (i10 <= 0 || messagePeerReaction.reaction != null) ? TLObject.FLAG_31 : -i10;
            case 9:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                return (i11 <= 0 || messagePeerReaction2.reaction != null) ? TLObject.FLAG_31 : -i11;
            case 10:
                return ((xf.d) obj).a;
            case 11:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 12:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 13:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 14:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 15:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 16:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 17:
                return -((TL_stories.StoryView) obj).date;
            case 18:
                return ((TL_stories.StoryItem) obj).date;
            default:
                return -((TL_stories.StoryItem) hc.b.i(1, ((TL_stories.PeerStories) obj).stories)).date;
        }
    }
}
