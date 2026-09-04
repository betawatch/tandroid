package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class iz extends kl0 {
    public final boolean c;
    public final /* synthetic */ kz d;

    public iz(kz kzVar, boolean z10) {
        this.d = kzVar;
        this.c = z10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.c;
        kz kzVar = this.d;
        return (z10 ? kzVar.n1 : kzVar.m1).size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList<TLRPC.Document> arrayList;
        ImageLocation forSticker;
        x9 x9Var = (x9) c1Var.a;
        kz kzVar = this.d;
        boolean z10 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? kzVar.n1 : kzVar.m1).get(i10);
        x9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(kzVar.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
            arrayList = stickerSet == null ? null : stickerSet.documents;
        } else {
            arrayList = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList == null || arrayList.isEmpty()) {
                document = null;
            } else {
                if (stickerSetCovered.set != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11).id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                if (document == null) {
                    document = arrayList.get(0);
                }
            }
        }
        if (document == null) {
            return;
        }
        if (z10) {
            x9Var.setColorFilter(MessageObject.isTextColorEmoji(document) ? org.telegram.ui.ActionBar.j6.n0(kzVar.Z1) : null);
        }
        TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.j6.c7, 0.2f);
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(document)) {
            closestPhotoSizeWithSize = document;
        }
        boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.Document;
        if (z11) {
            forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
        } else if (!(closestPhotoSizeWithSize instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
        }
        if (forSticker == null) {
            return;
        }
        String str = !LiteMode.isEnabled(z10 ? LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD : 1) ? "30_30_firstframe" : "30_30";
        if (z11 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
            if (svgThumb != null) {
                x9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                return;
            } else {
                x9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                return;
            }
        }
        String str2 = str;
        ImageLocation imageLocation = forSticker;
        if (imageLocation.imageType == 1) {
            x9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
        } else {
            x9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hz hzVar = new hz(this, this.d.getContext());
        hzVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        hzVar.setLayerNum(1);
        hzVar.setAspectFit(true);
        hzVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new vk0(hzVar);
    }
}
