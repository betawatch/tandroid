// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l24 extends FrameLayout implements vlb {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ e34 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l24(e34 e34Var, Context context) {
        super(context);
        this.e = e34Var;
        zmb zmbVar = anb.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i = cmb.Cf;
        ylb ylbVar = e34Var.a2;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        td4.v(16.0f, 2131747941, 1, textView, null);
        anb.X(textView, i, ylbVar);
        addView(textView, qoe.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, ylbVar);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(e34Var.x(cmb.g6));
        addView(radialProgressView, qoe.e(-2, -2, 17));
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.a.setVisibility(z ? 8 : 0);
            this.b.setVisibility(z ? 8 : 0);
            this.c.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (wi8.D(8.0f, r0 - r4.c1, 3) * 1.7f) : this.e.i0.getMeasuredHeight() - gm.L(80.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.x(cmb.g6));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
