package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jo0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final ih.v1 e;
    public final org.telegram.ui.Components.t9 f;
    public final ih.z1 h;
    public TLRPC.Document n;

    public jo0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ih.v1 v1Var = new ih.v1(frameLayout, c6Var, false);
        this.e = v1Var;
        frameLayout.setBackground(v1Var);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        i7.h6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f = t9Var;
        frameLayout.addView(t9Var, i7.f6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        ih.z1 z1Var = new ih.z1(context);
        this.h = z1Var;
        addView(z1Var, i7.f6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i10 % 3 == 1;
        setPadding(z10 ? AndroidUtilities.dp(4.0f) : 0, 0, z10 ? AndroidUtilities.dp(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) jh.s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) jh.s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        ih.v1 v1Var = this.e;
        v1Var.d(stargiftattributebackdrop);
        v1Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f9 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.t9 t9Var = this.f;
        if (z11) {
            t9Var.animate().scaleX(f9).scaleY(f9).start();
            return;
        }
        t9Var.animate().cancel();
        t9Var.setScaleX(f9);
        t9Var.setScaleY(f9);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.t9 t9Var = this.f;
        if (document == null) {
            t9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            t9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
