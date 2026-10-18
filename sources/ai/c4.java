package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.gh;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c4(int i10, long j10, TLRPC.Document document) {
        this.b = i10;
        this.c = j10;
        this.d = document;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.StickerSet stickerSet;
        int i10 = this.a;
        int i11 = this.b;
        long j10 = this.c;
        Object obj2 = this.d;
        int i12 = 0;
        switch (i10) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ga.y(i11, false).Q(j10);
                    AndroidUtilities.runOnUIThread(new a3.l0(new l4(j10, i12), document, LocaleController.getString(R.string.Gift2MovedToProfile), 8));
                    break;
                }
                break;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                AndroidUtilities.runOnUIThread(new gh(26, (org.telegram.ui.Components.qc) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? LocaleController.getString(R.string.AddEmojiNotFound) : i11 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i11 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                break;
            default:
                ((sv0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ c4(int i10, org.telegram.ui.Components.qc qcVar, long j10) {
        this.b = i10;
        this.d = qcVar;
        this.c = j10;
    }

    public /* synthetic */ c4(sv0 sv0Var, long j10, int i10) {
        this.d = sv0Var;
        this.c = j10;
        this.b = i10;
    }
}
