package og;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final u5 a;
    public final ImageView b;

    public b(Context context, p6 p6Var) {
        super(context);
        u5 u5Var = new u5(context);
        this.a = u5Var;
        u5Var.setTextSize(16);
        u5Var.setGravity(cd.X ? 5 : 3);
        int i10 = t6.L6;
        a7.Y(u5Var, i10, p6Var);
        u5Var.setTag(Integer.valueOf(i10));
        addView(u5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        u5Var.k(cd.L0(2131753603, null));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i11 = t6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        a7.y(this, drawable, i11, p6Var, mode);
        a7.y(this, drawable2, t6.k7, p6Var, mode);
        imageView.setImageDrawable(new eq(drawable, drawable2));
        a7.i(t6.h5, this, p6Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        int i14 = i12 - i10;
        u5 u5Var = this.a;
        int textHeight = ((i13 - i11) - u5Var.getTextHeight()) / 2;
        boolean z11 = cd.X;
        ImageView imageView = this.b;
        if (z11) {
            L = (getMeasuredWidth() - u5Var.getMeasuredWidth()) - i0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = i0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        u5Var.layout(L, textHeight, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight);
        int L2 = !cd.X ? i0.L(24.0f) : (i14 - imageView.getMeasuredWidth()) - i0.L(24.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.a.measure(z20.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(i0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(i0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, i0.L(50.0f));
    }
}
