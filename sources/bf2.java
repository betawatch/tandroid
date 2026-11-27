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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bf2 extends FrameLayout implements snb {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final vnb d;
    public int e;

    public bf2(Context context, vnb vnbVar) {
        super(context);
        this.d = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i = aob.xf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(frameLayout, background, i, vnbVar, mode);
        addView(frameLayout, tre.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(aob.vf), mode));
        imageView.setPadding(0, hl.L(2.0f), 0, 0);
        frameLayout.addView(imageView, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, hl.L(1.0f));
        textView.setTextSize(1, 14.0f);
        yob.X(textView, aob.g1(vnbVar) ? aob.Fa : aob.wf, vnbVar);
        textView.setTypeface(hl.o());
        addView(textView, tre.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (aob.g1(vnbVar)) {
            int i2 = aob.Ea;
            yob.B(frameLayout, aob.b0(0, a(i2)), yob.M(i2), vnbVar);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i) {
        vnb vnbVar = this.d;
        Integer valueOf = vnbVar != null ? Integer.valueOf(vnbVar.h(i)) : null;
        return valueOf != null ? valueOf.intValue() : aob.w0(null, i, false);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), TLObject.FLAG_30));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override // snb
    public final void updateColors() {
        try {
            int a = a(aob.vf);
            ImageView imageView = this.b;
            if (imageView != null && a != this.e) {
                this.e = a;
                imageView.setColorFilter(new PorterDuffColorFilter(a, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
