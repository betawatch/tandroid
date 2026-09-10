package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ip0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final wh.e1 e;
    public final org.telegram.ui.Components.w9 f;
    public final wh.i1 h;
    public TLRPC.Document n;

    public ip0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        wh.e1 e1Var = new wh.e1(frameLayout, f6Var, false);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        w7.c6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f = w9Var;
        frameLayout.addView(w9Var, w7.a6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        wh.i1 i1Var = new wh.i1(context);
        this.h = i1Var;
        addView(i1Var, w7.a6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i10 % 3 == 1;
        setPadding(z10 ? AndroidUtilities.dp(4.0f) : 0, 0, z10 ? AndroidUtilities.dp(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) xh.v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) xh.v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        wh.e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f7 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.w9 w9Var = this.f;
        if (z11) {
            w9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        w9Var.animate().cancel();
        w9Var.setScaleX(f7);
        w9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.w9 w9Var = this.f;
        if (document == null) {
            w9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            w9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
