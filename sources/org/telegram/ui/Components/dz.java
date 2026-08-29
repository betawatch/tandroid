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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dz extends il0 {
    public final boolean c;
    public final /* synthetic */ fz d;

    public dz(fz fzVar, boolean z10) {
        this.d = fzVar;
        this.c = z10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        boolean z10 = this.c;
        fz fzVar = this.d;
        return (z10 ? fzVar.j1 : fzVar.i1).size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ArrayList<TLRPC.Document> arrayList;
        ImageLocation forSticker;
        t9 t9Var = (t9) n1Var.a;
        fz fzVar = this.d;
        boolean z10 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? fzVar.j1 : fzVar.i1).get(i10);
        t9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(fzVar.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
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
            t9Var.setColorFilter(MessageObject.isTextColorEmoji(document) ? org.telegram.ui.ActionBar.g6.n0(fzVar.V1) : null);
        }
        TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.g6.c7, 0.2f);
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
                t9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                return;
            } else {
                t9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                return;
            }
        }
        String str2 = str;
        ImageLocation imageLocation = forSticker;
        if (imageLocation.imageType == 1) {
            t9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
        } else {
            t9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        cz czVar = new cz(this, this.d.getContext());
        czVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        czVar.setLayerNum(1);
        czVar.setAspectFit(true);
        czVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new vk0(czVar);
    }
}
