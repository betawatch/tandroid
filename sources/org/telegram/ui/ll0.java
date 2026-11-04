package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ll0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final ai.m2 e;
    public final org.telegram.ui.Components.k9 f;
    public final ai.r2 h;
    public TLRPC.Document n;

    public ll0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ai.m2 m2Var = new ai.m2(frameLayout, e6Var, false);
        this.e = m2Var;
        frameLayout.setBackground(m2Var);
        addView(frameLayout, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        b8.pf.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f = k9Var;
        frameLayout.addView(k9Var, b8.mf.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        ai.r2 r2Var = new ai.r2(context);
        this.h = r2Var;
        addView(r2Var, b8.mf.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i3 % 3 == 1;
        setPadding(z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0, z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        ai.m2 m2Var = this.e;
        m2Var.d(stargiftattributebackdrop);
        m2Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f10 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.k9 k9Var = this.f;
        if (z11) {
            k9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        k9Var.animate().cancel();
        k9Var.setScaleX(f10);
        k9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.k9 k9Var = this.f;
        if (document == null) {
            k9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            k9Var.m(org.telegram.messenger.ac.b(document), "100_100", org.telegram.messenger.ac.c(w10, document), "100_100", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
