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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nh4 extends FrameLayout implements vlb {
    public lka a;
    public ImageView b;
    public sn2 c;
    public int d;
    public int e;

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.M6));
        hashSet.add(Integer.valueOf(cmb.j7));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        ImageView imageView = this.b;
        int i5 = i3 - i;
        lka lkaVar = this.a;
        int textHeight = ((i4 - i2) - lkaVar.getTextHeight()) / 2;
        if (jb6.a0) {
            L = (getMeasuredWidth() - lkaVar.getMeasuredWidth()) - gm.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            L = gm.L(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        lkaVar.layout(L, textHeight, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight);
        int L2 = !jb6.a0 ? gm.L(20.0f) : (i5 - imageView.getMeasuredWidth()) - gm.L(20.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = gm.a;
        this.a.measure(wi8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, gm.L(50.0f));
    }

    @Override // vlb
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof sn2) {
                    sn2 sn2Var = (sn2) imageView.getDrawable();
                    int w0 = cmb.w0(null, cmb.M6, false);
                    int w02 = cmb.w0(null, cmb.j7, false);
                    if (sn2Var == this.c && w0 == this.d && w02 == this.e) {
                        return;
                    }
                    this.c = sn2Var;
                    this.d = w0;
                    this.e = w02;
                    Drawable drawable = sn2Var.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = sn2Var.b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
