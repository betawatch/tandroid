// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ftc extends LinearLayout implements snb {
    public final vnb a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public ftc(Context context, vnb vnbVar) {
        super(context);
        setOrientation(0);
        this.a = vnbVar;
        setPadding(hl.L(20.0f), 0, hl.L(13.0f), 0);
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(0, hl.L(10.0f), 0, hl.L(10.0f));
        addView(j, tre.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.n1("fonts/rmono.ttf"));
        TextView m = ik8.m(j, textView, tre.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.c = m;
        m.setTextSize(1, 14.0f);
        j.addView(m, tre.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, tre.t(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.b.setTextColor(aob.v0(i, vnbVar));
        int i2 = aob.z6;
        this.c.setTextColor(aob.v0(i2, vnbVar));
        this.d.setColorFilter(new PorterDuffColorFilter(aob.v0(i2, vnbVar), PorterDuff.Mode.SRC_IN));
    }
}
