package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ap extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.o9 a;
    public org.telegram.ui.Components.r80 b;
    public int c;

    public final void a() {
        org.telegram.ui.Components.o9 o9Var = this.a;
        int i9 = this.c;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i9).getStickerSetByName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i9).getStickerSetByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            o9Var.i(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
        } else {
            MediaDataController.getInstance(i9).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, tL_messages_stickerSet == null);
            o9Var.setImageDrawable(this.b);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.diceStickersDidLoad && AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME.equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }
}
