package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e00 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.k5 a;
    public ImageView b;
    public org.telegram.ui.Components.xp c;
    public int d;
    public int e;

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L;
        ImageView imageView = this.b;
        int i13 = i11 - i3;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        int textHeight = ((i12 - i10) - k5Var.getTextHeight()) / 2;
        if (org.telegram.messenger.bd.a0) {
            L = (getMeasuredWidth() - k5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            L = org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        k5Var.layout(L, textHeight, k5Var.getMeasuredWidth() + L, k5Var.getMeasuredHeight() + textHeight);
        int L2 = !org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(20.0f) : (i13 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(20.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        org.telegram.messenger.g0.L(48.0f);
        this.a.measure(org.telegram.messenger.camera.q.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.xp) {
                    org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k7, false);
                    if (xpVar == this.c && x02 == this.d && x03 == this.e) {
                        return;
                    }
                    this.c = xpVar;
                    this.d = x02;
                    this.e = x03;
                    Drawable drawable = xpVar.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = xpVar.b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
