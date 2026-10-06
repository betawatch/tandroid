package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class t8 extends TL_stories.StoryItem {
    public final u8 a;

    public t8(u8 u8Var, long j3, TL_bots.botPreviewMedia botpreviewmedia) {
        this.a = u8Var;
        this.dialogId = j3;
        TLRPC.MessageMedia messageMedia = botpreviewmedia.media;
        this.media = messageMedia;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            document.date = botpreviewmedia.date;
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null) {
            photo.date = botpreviewmedia.date;
        }
    }
}
