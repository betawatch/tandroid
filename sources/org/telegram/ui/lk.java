package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.od {
    public org.telegram.ui.Cells.y e;
    public int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ wn n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(wn wnVar, Context context, boolean z10) {
        super(context);
        this.n = wnVar;
        this.h = z10;
    }

    @Override // org.telegram.ui.Components.od
    public final void d() {
        try {
            int themedColor = this.n.getThemedColor(org.telegram.ui.ActionBar.y6.ve);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        org.telegram.ui.ActionBar.y6.E1(drawable, themedColor & 436207615, true);
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
            org.telegram.ui.Cells.y X = org.telegram.ui.ActionBar.y6.X(AndroidUtilities.dp(19.0f), themedColor & 436207615, this.h ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
            this.e = X;
            setBackground(X);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() != null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.od
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.h) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
