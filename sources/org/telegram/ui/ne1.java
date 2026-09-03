package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ne1 extends w61 {
    public boolean a2;
    public final /* synthetic */ oe1 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(oe1 oe1Var, oe1 oe1Var2, Activity activity) {
        super(oe1Var2, activity, false, null, 3, null);
        this.b2 = oe1Var;
        this.a2 = true;
    }

    @Override // org.telegram.ui.w61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.b2.f.s(null);
        }
    }

    @Override // org.telegram.ui.w61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        oe1 oe1Var = this.b2;
        i10 = ((org.telegram.ui.ActionBar.p2) oe1Var).currentAccount;
        boolean z4 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = oe1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.p2) oe1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                z4 = true;
            }
        }
        oe1Var.b0(l10, z4);
    }
}
