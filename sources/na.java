// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class na extends FrameLayout {
    public final jia a;
    public final ImageView b;

    public na(Context context, wjb wjbVar) {
        super(context);
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        int i = bkb.K6;
        zkb.W(jiaVar, i, wjbVar);
        jiaVar.setTag(Integer.valueOf(i));
        addView(jiaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        jiaVar.l(k96.M0(2131753600, null), false);
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i2 = bkb.M6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(this, drawable, i2, wjbVar, mode);
        zkb.x(this, drawable2, bkb.j7, wjbVar, mode);
        imageView.setImageDrawable(new fm2(drawable, drawable2));
        zkb.h(bkb.g5, wjbVar, this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5 = i3 - i;
        jia jiaVar = this.a;
        int textHeight = ((i4 - i2) - jiaVar.getTextHeight()) / 2;
        boolean z2 = k96.a0;
        ImageView imageView = this.b;
        if (z2) {
            L = (getMeasuredWidth() - jiaVar.getMeasuredWidth()) - gl.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = gl.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        jiaVar.layout(L, textHeight, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight);
        int L2 = !k96.a0 ? gl.L(24.0f) : (i5 - imageView.getMeasuredWidth()) - gl.L(24.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a.measure(ug8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, gl.L(50.0f));
    }
}
