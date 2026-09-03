package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ax0 extends p9 implements NotificationCenter.NotificationCenterDelegate {
    public final int D;
    public int E;
    public String F;

    public ax0(Context context, int i10) {
        super(context);
        this.F = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME;
        this.D = i10;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if (this.F.equals((String) objArr[0])) {
                t();
            }
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void setStickerNum(int i10) {
        if (this.E != i10) {
            this.E = i10;
            t();
        }
    }

    public void setStickerPackName(String str) {
        this.F = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        TLRPC.Document document;
        SvgHelper.SvgDrawable svgThumb;
        int i10 = this.D;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName(this.F);
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(this.F);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i11 = this.E;
            if (size > i11) {
                document = tL_messages_stickerSet.documents.get(i11);
                svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.c7, 0.2f) : null;
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                if (document == null) {
                    i(ImageLocation.getForDocument(document), "130_130", "tgs", svgThumb, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.clearImage();
                    MediaDataController.getInstance(i10).loadStickersByEmojiOrName(this.F, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.c7, 0.2f) : null;
        if (svgThumb != null) {
        }
        if (document == null) {
        }
    }
}
