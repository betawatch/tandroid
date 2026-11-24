// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ke2 extends FrameLayout implements tjb {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final wjb d;
    public int e;

    public ke2(Context context, wjb wjbVar) {
        super(context);
        this.d = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i = bkb.wf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(frameLayout, background, i, wjbVar, mode);
        addView(frameLayout, nme.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(bkb.uf), mode));
        imageView.setPadding(0, gl.L(2.0f), 0, 0);
        frameLayout.addView(imageView, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, gl.L(1.0f));
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, bkb.g1(wjbVar) ? bkb.Ea : bkb.vf, wjbVar);
        textView.setTypeface(gl.o());
        addView(textView, nme.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (bkb.g1(wjbVar)) {
            int i2 = bkb.Da;
            zkb.B(frameLayout, bkb.b0(0, a(i2)), zkb.M(i2), wjbVar);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i) {
        wjb wjbVar = this.d;
        Integer valueOf = wjbVar != null ? Integer.valueOf(wjbVar.h(i)) : null;
        return valueOf != null ? valueOf.intValue() : bkb.w0(null, i, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.c;
    }

    public ImageView getImageView() {
        return this.b;
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), TLObject.FLAG_30));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int a = a(bkb.uf);
            ImageView imageView = this.b;
            if (imageView != null && a != this.e) {
                this.e = a;
                imageView.setColorFilter(new PorterDuffColorFilter(a, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
