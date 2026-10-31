package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cn0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final ph.z0 e;
    public final org.telegram.ui.Components.g9 f;
    public final ph.d1 h;
    public TLRPC.Document n;

    public cn0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ph.z0 z0Var = new ph.z0(frameLayout, p6Var, false);
        this.e = z0Var;
        frameLayout.setBackground(z0Var);
        addView(frameLayout, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        w7.e6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f = g9Var;
        frameLayout.addView(g9Var, w7.b6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        ph.d1 d1Var = new ph.d1(context);
        this.h = d1Var;
        addView(d1Var, w7.b6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i10 % 3 == 1;
        setPadding(z10 ? org.telegram.messenger.i0.L(4.0f) : 0, 0, z10 ? org.telegram.messenger.i0.L(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        ph.z0 z0Var = this.e;
        z0Var.d(stargiftattributebackdrop);
        z0Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f7 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.g9 g9Var = this.f;
        if (z11) {
            g9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        g9Var.animate().cancel();
        g9Var.setScaleX(f7);
        g9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.g9 g9Var = this.f;
        if (document == null) {
            g9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(100.0f), false, null, false);
            g9Var.m(org.telegram.messenger.ic.b(document), "100_100", org.telegram.messenger.ic.c(w9, document), "100_100", org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
