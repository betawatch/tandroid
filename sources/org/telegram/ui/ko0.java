package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ko0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final fh.b2 e;
    public final org.telegram.ui.Components.o9 f;
    public final fh.g2 h;
    public TLRPC.Document n;

    public ko0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        fh.b2 b2Var = new fh.b2(frameLayout, b6Var, false);
        this.e = b2Var;
        frameLayout.setBackground(b2Var);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        g7.g6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f = o9Var;
        frameLayout.addView(o9Var, g7.e6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        fh.g2 g2Var = new fh.g2(context);
        this.h = g2Var;
        addView(g2Var, g7.e6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i9, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i9 % 3 == 1;
        setPadding(z10 ? AndroidUtilities.dp(4.0f) : 0, 0, z10 ? AndroidUtilities.dp(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) gh.v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) gh.v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        fh.b2 b2Var = this.e;
        b2Var.d(stargiftattributebackdrop);
        b2Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f10 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.o9 o9Var = this.f;
        if (z11) {
            o9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        o9Var.animate().cancel();
        o9Var.setScaleX(f10);
        o9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.o9 o9Var = this.f;
        if (document == null) {
            o9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            o9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
