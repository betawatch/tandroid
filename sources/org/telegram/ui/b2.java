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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b2 extends HorizontalScrollView implements org.telegram.ui.ActionBar.a6, g3 {
    public final n70 a;
    public final FrameLayout b;
    public final ImageView c;
    public int d;

    public b2(Context context, n70 n70Var) {
        super(context);
        this.a = n70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        addView(frameLayout, k7.b6.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, k7.b6.c(-2.0f, -2));
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        this.c.setColorFilter(new PorterDuffColorFilter(this.a.b(), PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.g3
    public int getBoundLeft() {
        if (this.d > getMeasuredWidth()) {
            return 0;
        }
        return (getMeasuredWidth() - this.d) / 2;
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        return this.d > getMeasuredWidth() ? getMeasuredWidth() : (getMeasuredWidth() + this.d) / 2;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        return getBoundRight();
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = this.d;
        if (i15 > i14) {
            super.onLayout(z4, i10, i11, i12, i13);
        } else {
            FrameLayout frameLayout = this.b;
            frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        vh.q a2;
        ImageView imageView = this.c;
        imageView.setImageBitmap(null);
        n70 n70Var = this.a;
        n70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        n70Var.getClass();
        imageView.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        n70Var.getClass();
        float f11 = 36;
        this.d = AndroidUtilities.dp(f11);
        if (pageblockmath == null || (a2 = vh.q.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) == null) {
            return;
        }
        imageView.setImageBitmap(a2.a);
        int i10 = a2.b;
        n70Var.getClass();
        int dp2 = AndroidUtilities.dp(f11) + i10;
        this.d = dp2;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dp2, a2.c));
    }
}
