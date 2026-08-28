package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c2 extends HorizontalScrollView implements org.telegram.ui.ActionBar.w5, h3 {
    public final a70 a;
    public final FrameLayout b;
    public final ImageView c;
    public int d;

    public c2(Context context, a70 a70Var) {
        super(context);
        this.a = a70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        addView(frameLayout, g7.e6.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, g7.e6.c(-2.0f, -2));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        this.c.setColorFilter(new PorterDuffColorFilter(this.a.b(), PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        if (this.d > getMeasuredWidth()) {
            return 0;
        }
        return (getMeasuredWidth() - this.d) / 2;
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        return this.d > getMeasuredWidth() ? getMeasuredWidth() : (getMeasuredWidth() + this.d) / 2;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        return getBoundRight();
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        int i14 = this.d;
        if (i14 > i13) {
            super.onLayout(z10, i9, i10, i11, i12);
        } else {
            FrameLayout frameLayout = this.b;
            frameLayout.layout((i13 - i14) / 2, 0, (i13 + i14) / 2, frameLayout.getMeasuredHeight());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        qh.q a2;
        ImageView imageView = this.c;
        imageView.setImageBitmap(null);
        a70 a70Var = this.a;
        a70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        a70Var.getClass();
        imageView.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        a70Var.getClass();
        float f11 = 36;
        this.d = AndroidUtilities.dp(f11);
        if (pageblockmath == null || (a2 = qh.q.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) == null) {
            return;
        }
        imageView.setImageBitmap(a2.a);
        int i9 = a2.b;
        a70Var.getClass();
        int dp2 = AndroidUtilities.dp(f11) + i9;
        this.d = dp2;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dp2, a2.c));
    }
}
