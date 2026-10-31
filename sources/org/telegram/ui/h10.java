package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h10 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.u5 a;
    public ImageView b;
    public org.telegram.ui.Components.eq c;
    public int d;
    public int e;

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k7));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        ImageView imageView = this.b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        int textHeight = ((i13 - i11) - u5Var.getTextHeight()) / 2;
        if (org.telegram.messenger.cd.X) {
            L = (getMeasuredWidth() - u5Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            L = org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        u5Var.layout(L, textHeight, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight);
        int L2 = !org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(20.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        org.telegram.messenger.i0.L(48.0f);
        this.a.measure(org.telegram.messenger.z20.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, org.telegram.messenger.i0.L(50.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.eq) {
                    org.telegram.ui.Components.eq eqVar = (org.telegram.ui.Components.eq) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k7, false);
                    if (eqVar == this.c && x02 == this.d && x03 == this.e) {
                        return;
                    }
                    this.c = eqVar;
                    this.d = x02;
                    this.e = x03;
                    Drawable drawable = eqVar.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = eqVar.b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
