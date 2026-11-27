// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class oa extends FrameLayout {
    public final ema a;
    public final ImageView b;

    public oa(Context context, vnb vnbVar) {
        super(context);
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setTextSize(16);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        int i = aob.L6;
        yob.W(emaVar, i, vnbVar);
        emaVar.setTag(Integer.valueOf(i));
        addView(emaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        emaVar.l(ob6.M0(2131753596, null), false);
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i2 = aob.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(this, drawable, i2, vnbVar, mode);
        yob.x(this, drawable2, aob.k7, vnbVar, mode);
        imageView.setImageDrawable(new zm2(drawable, drawable2));
        yob.h(aob.h5, vnbVar, this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5 = i3 - i;
        ema emaVar = this.a;
        int textHeight = ((i4 - i2) - emaVar.getTextHeight()) / 2;
        boolean z2 = ob6.a0;
        ImageView imageView = this.b;
        if (z2) {
            L = (getMeasuredWidth() - emaVar.getMeasuredWidth()) - hl.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = hl.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        emaVar.layout(L, textHeight, emaVar.getMeasuredWidth() + L, emaVar.getMeasuredHeight() + textHeight);
        int L2 = !ob6.a0 ? hl.L(24.0f) : (i5 - imageView.getMeasuredWidth()) - hl.L(24.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a.measure(ik8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, hl.L(50.0f));
    }
}
