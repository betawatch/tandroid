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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uy extends vk0 {
    public final boolean c;
    public final /* synthetic */ wy d;

    public uy(wy wyVar, boolean z10) {
        this.d = wyVar;
        this.c = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        boolean z10 = this.c;
        wy wyVar = this.d;
        return (z10 ? wyVar.j1 : wyVar.i1).size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        ArrayList<TLRPC.Document> arrayList;
        ImageLocation forSticker;
        o9 o9Var = (o9) q1Var.a;
        wy wyVar = this.d;
        boolean z10 = this.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? wyVar.j1 : wyVar.i1).get(i9);
        o9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(wyVar.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
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
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10).id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList.get(i10);
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
            o9Var.setColorFilter(MessageObject.isTextColorEmoji(document) ? org.telegram.ui.ActionBar.f6.n0(wyVar.V1) : null);
        }
        TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.f6.c7, 0.2f);
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
                o9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                return;
            } else {
                o9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                return;
            }
        }
        String str2 = str;
        ImageLocation imageLocation = forSticker;
        if (imageLocation.imageType == 1) {
            o9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
        } else {
            o9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ty tyVar = new ty(this, this.d.getContext());
        tyVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        tyVar.setLayerNum(1);
        tyVar.setAspectFit(true);
        tyVar.setLayoutParams(new f2.a1(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new ik0(tyVar);
    }
}
