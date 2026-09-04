package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jp0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final yh.e1 e;
    public final org.telegram.ui.Components.x9 f;
    public final yh.i1 h;
    public TLRPC.Document n;

    public jp0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        yh.e1 e1Var = new yh.e1(frameLayout, f6Var, false);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        w7.z5.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f = x9Var;
        frameLayout.addView(x9Var, w7.x5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        yh.i1 i1Var = new yh.i1(context);
        this.h = i1Var;
        addView(i1Var, w7.x5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i10 % 3 == 1;
        setPadding(z10 ? AndroidUtilities.dp(4.0f) : 0, 0, z10 ? AndroidUtilities.dp(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) zh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) zh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        yh.e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f7 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.x9 x9Var = this.f;
        if (z11) {
            x9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        x9Var.animate().cancel();
        x9Var.setScaleX(f7);
        x9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.x9 x9Var = this.f;
        if (document == null) {
            x9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            x9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
