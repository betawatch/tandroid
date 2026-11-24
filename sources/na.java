// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class na extends FrameLayout {
    public final lka a;
    public final ImageView b;

    public na(Context context, ylb ylbVar) {
        super(context);
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTextSize(16);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        int i = cmb.K6;
        anb.W(lkaVar, i, ylbVar);
        lkaVar.setTag(Integer.valueOf(i));
        addView(lkaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        lkaVar.l(jb6.M0(2131753568, null), false);
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i2 = cmb.M6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.x(this, drawable, i2, ylbVar, mode);
        anb.x(this, drawable2, cmb.j7, ylbVar, mode);
        imageView.setImageDrawable(new sn2(drawable, drawable2));
        anb.h(cmb.g5, ylbVar, this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5 = i3 - i;
        lka lkaVar = this.a;
        int textHeight = ((i4 - i2) - lkaVar.getTextHeight()) / 2;
        boolean z2 = jb6.a0;
        ImageView imageView = this.b;
        if (z2) {
            L = (getMeasuredWidth() - lkaVar.getMeasuredWidth()) - gm.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = gm.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        lkaVar.layout(L, textHeight, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight);
        int L2 = !jb6.a0 ? gm.L(24.0f) : (i5 - imageView.getMeasuredWidth()) - gm.L(24.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a.measure(wi8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, gm.L(50.0f));
    }
}
