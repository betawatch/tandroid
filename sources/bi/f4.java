package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.kp;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f4(int i10, long j10, TLRPC.Document document) {
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
                    ca.y(i11, false).Q(j10);
                    AndroidUtilities.runOnUIThread(new a3.l0(new j4(j10, i12), document, LocaleController.getString(R.string.Gift2MovedToProfile), 12));
                    break;
                }
                break;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                AndroidUtilities.runOnUIThread(new kp(7, (org.telegram.ui.Components.qc) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? LocaleController.getString(R.string.AddEmojiNotFound) : i11 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i11 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                break;
            default:
                ((bw0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ f4(int i10, org.telegram.ui.Components.qc qcVar, long j10) {
        this.b = i10;
        this.d = qcVar;
        this.c = j10;
    }

    public /* synthetic */ f4(bw0 bw0Var, long j10, int i10) {
        this.d = bw0Var;
        this.c = j10;
        this.b = i10;
    }
}
