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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class iz extends ql0 {
    public final boolean c;
    public final /* synthetic */ kz d;

    public iz(kz kzVar, boolean z4) {
        this.d = kzVar;
        this.c = z4;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        boolean z4 = this.c;
        kz kzVar = this.d;
        return (z4 ? kzVar.k1 : kzVar.j1).size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ArrayList<TLRPC.Document> arrayList;
        ImageLocation forSticker;
        p9 p9Var = (p9) l1Var.a;
        kz kzVar = this.d;
        boolean z4 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z4 ? kzVar.k1 : kzVar.j1).get(i10);
        p9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(kzVar.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
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
        if (z4) {
            p9Var.setColorFilter(MessageObject.isTextColorEmoji(document) ? org.telegram.ui.ActionBar.j6.n0(kzVar.W1) : null);
        }
        TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.j6.c7, 0.2f);
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(document)) {
            closestPhotoSizeWithSize = document;
        }
        boolean z10 = closestPhotoSizeWithSize instanceof TLRPC.Document;
        if (z10) {
            forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
        } else if (!(closestPhotoSizeWithSize instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
        }
        if (forSticker == null) {
            return;
        }
        String str = !LiteMode.isEnabled(z4 ? LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD : 1) ? "30_30_firstframe" : "30_30";
        if (z10 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
            if (svgThumb != null) {
                p9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                return;
            } else {
                p9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                return;
            }
        }
        String str2 = str;
        ImageLocation imageLocation = forSticker;
        if (imageLocation.imageType == 1) {
            p9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
        } else {
            p9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        hz hzVar = new hz(this, this.d.getContext());
        hzVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        hzVar.setLayerNum(1);
        hzVar.setAspectFit(true);
        hzVar.setLayoutParams(new f2.w0(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new dl0(hzVar);
    }
}
