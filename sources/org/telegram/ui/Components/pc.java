package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pc(int i10, mc mcVar, long j10) {
        this.c = i10;
        this.d = mcVar;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.StickerSet stickerSet;
        int i10 = this.a;
        int i11 = this.c;
        long j10 = this.b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                AndroidUtilities.runOnUIThread(new z2(2, (mc) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? LocaleController.getString(R.string.AddEmojiNotFound) : i11 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i11 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                break;
            default:
                ((qu0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ pc(qu0 qu0Var, long j10, int i10) {
        this.d = qu0Var;
        this.b = j10;
        this.c = i10;
    }
}
