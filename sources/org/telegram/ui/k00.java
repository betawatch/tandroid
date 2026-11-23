package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.n5 a;
    public ImageView b;
    public org.telegram.ui.Components.lq c;
    public int d;
    public int e;

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.k7));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        ImageView imageView = this.b;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        int textHeight = ((i12 - i10) - n5Var.getTextHeight()) / 2;
        if (org.telegram.messenger.gd.a0) {
            L = (getMeasuredWidth() - n5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            L = org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        n5Var.layout(L, textHeight, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight);
        int L2 = !org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(20.0f) : (i13 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(20.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.g0.L(48.0f);
        this.a.measure(org.telegram.messenger.m10.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.lq) {
                    org.telegram.ui.Components.lq lqVar = (org.telegram.ui.Components.lq) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.k7, false);
                    if (lqVar == this.c && x02 == this.d && x03 == this.e) {
                        return;
                    }
                    this.c = lqVar;
                    this.d = x02;
                    this.e = x03;
                    Drawable drawable = lqVar.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = lqVar.b;
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
