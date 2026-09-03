package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class me1 extends x61 {
    public boolean a2;
    public final /* synthetic */ ne1 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(ne1 ne1Var, ne1 ne1Var2, Activity activity) {
        super(ne1Var2, activity, false, null, 3, null);
        this.b2 = ne1Var;
        this.a2 = true;
    }

    @Override // org.telegram.ui.x61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.b2.f.s(null);
        }
    }

    @Override // org.telegram.ui.x61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        ne1 ne1Var = this.b2;
        i10 = ((org.telegram.ui.ActionBar.p2) ne1Var).currentAccount;
        boolean z4 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = ne1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.p2) ne1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                z4 = true;
            }
        }
        ne1Var.b0(l10, z4);
    }
}
