// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kh4 extends FrameLayout implements snb {
    public ema a;
    public ImageView b;
    public zm2 c;
    public int d;
    public int e;

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.N6));
        hashSet.add(Integer.valueOf(aob.k7));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        ImageView imageView = this.b;
        int i5 = i3 - i;
        ema emaVar = this.a;
        int textHeight = ((i4 - i2) - emaVar.getTextHeight()) / 2;
        if (ob6.a0) {
            L = (getMeasuredWidth() - emaVar.getMeasuredWidth()) - hl.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            L = hl.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        emaVar.layout(L, textHeight, emaVar.getMeasuredWidth() + L, emaVar.getMeasuredHeight() + textHeight);
        int L2 = !ob6.a0 ? hl.L(20.0f) : (i5 - imageView.getMeasuredWidth()) - hl.L(20.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = hl.a;
        this.a.measure(ik8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, hl.L(50.0f));
    }

    @Override // snb
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof zm2) {
                    zm2 zm2Var = (zm2) imageView.getDrawable();
                    int w0 = aob.w0(null, aob.N6, false);
                    int w02 = aob.w0(null, aob.k7, false);
                    if (zm2Var == this.c && w0 == this.d && w02 == this.e) {
                        return;
                    }
                    this.c = zm2Var;
                    this.d = w0;
                    this.e = w02;
                    Drawable drawable = zm2Var.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = zm2Var.b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
