package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.qc {
    public org.telegram.ui.Cells.y e;
    public int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ un n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(un unVar, Context context, boolean z10) {
        super(context);
        this.n = unVar;
        this.h = z10;
    }

    @Override // org.telegram.ui.Components.qc
    public final void d() {
        try {
            int themedColor = this.n.getThemedColor(org.telegram.ui.ActionBar.t6.kf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        org.telegram.ui.ActionBar.t6.H1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f = themedColor;
                    if (getTextView() != null || getTextView().getCurrentTextColor() == themedColor) {
                    }
                    getTextView().setTextColor(themedColor);
                    return;
                }
            }
            org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.t6.Y(org.telegram.messenger.i0.L(19.0f), themedColor & 436207615, this.h ? org.telegram.messenger.i0.L(4.0f) : 0, org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f));
            this.e = Y;
            setBackground(Y);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() != null) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.qc
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.h) {
            getTextView().setMaxWidth(z10 ? org.telegram.messenger.i0.L(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
