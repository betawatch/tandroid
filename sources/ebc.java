// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ebc extends LinearLayout implements snb {
    public final vnb a;
    public final ImageView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public int r;

    public ebc(Context context, vnb vnbVar) {
        super(context);
        setOrientation(0);
        this.a = vnbVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, tre.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, hl.L(10.0f), 0, hl.L(10.0f));
        addView(linearLayout, tre.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = m;
        m.setTextSize(1, 13.0f);
        linearLayout.addView(m, tre.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, tre.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // snb
    public final void updateColors() {
        int i = this.n ? aob.q7 : this.h ? aob.n6 : aob.G6;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i, vnbVar);
        int i2 = this.r;
        ImageView imageView = this.f;
        ImageView imageView2 = this.b;
        if (v0 != i2 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.r = v0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(v0, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(v0, mode));
        }
        this.d.setTextColor(aob.v0(this.n ? aob.p7 : this.h ? aob.n6 : aob.G6, vnbVar));
        this.e.setTextColor(aob.v0(this.n ? aob.p7 : this.h ? aob.n6 : aob.y6, vnbVar));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
