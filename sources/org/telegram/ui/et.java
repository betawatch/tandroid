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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class et extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ht d;

    public et(ht htVar, ArrayList arrayList) {
        this.d = htVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        gt gtVar = (gt) b1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i10);
        org.telegram.ui.ActionBar.n5 n5Var = gtVar.b;
        org.telegram.ui.Components.w9 w9Var = gtVar.a;
        gtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            n5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            w9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        n5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            w9Var.l(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.k6.a7, 1.0f, 1.0f, gtVar.c);
        if (svgThumb == null) {
            w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (closestPhotoSizeWithSize != null) {
            w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        } else {
            w9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        gt gtVar = new gt(viewGroup.getContext(), this.d.c0);
        gtVar.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(48.0f)));
        return new org.telegram.ui.Components.wl0(gtVar);
    }
}
