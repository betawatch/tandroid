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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ot extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ rt d;

    public ot(rt rtVar, ArrayList arrayList) {
        this.d = rtVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        qt qtVar = (qt) l1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i10);
        org.telegram.ui.ActionBar.k5 k5Var = qtVar.b;
        org.telegram.ui.Components.p9 p9Var = qtVar.a;
        qtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            k5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            p9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        k5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            p9Var.l(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.j6.a7, 1.0f, 1.0f, qtVar.c);
        if (svgThumb == null) {
            p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (closestPhotoSizeWithSize != null) {
            p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        } else {
            p9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        qt qtVar = new qt(viewGroup.getContext(), this.d.c0);
        qtVar.setLayoutParams(new f2.w0(-2, AndroidUtilities.dp(48.0f)));
        return new org.telegram.ui.Components.dl0(qtVar);
    }
}
