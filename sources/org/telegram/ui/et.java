package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class et extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ht d;

    public et(ht htVar, ArrayList arrayList) {
        this.d = htVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        gt gtVar = (gt) e1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i10);
        org.telegram.ui.ActionBar.b6 b6Var = gtVar.b;
        org.telegram.ui.Components.y9 y9Var = gtVar.a;
        gtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            b6Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            y9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        b6Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            y9Var.l(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.y6.a7, 1.0f, 1.0f, gtVar.c);
        if (svgThumb == null) {
            y9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (closestPhotoSizeWithSize != null) {
            y9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        } else {
            y9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        gt gtVar = new gt(viewGroup.getContext(), this.d.c0);
        gtVar.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(48.0f)));
        return new org.telegram.ui.Components.wl0(gtVar);
    }
}
