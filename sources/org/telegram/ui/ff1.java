package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ff1 extends r71 {
    public boolean d2;
    public final /* synthetic */ gf1 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff1(gf1 gf1Var, gf1 gf1Var2, Activity activity) {
        super(gf1Var2, activity, false, null, 3, null);
        this.e2 = gf1Var;
        this.d2 = true;
    }

    @Override // org.telegram.ui.r71, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.f.s(null);
        }
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        gf1 gf1Var = this.e2;
        i10 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = gf1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        gf1Var.b0(l4, z10);
    }
}
