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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class a14 extends FrameLayout implements tjb {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ t14 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a14(t14 t14Var, Context context) {
        super(context);
        this.e = t14Var;
        ykb ykbVar = zkb.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i = bkb.Cf;
        wjb wjbVar = t14Var.a2;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        tb4.u(16.0f, 2131748015, 1, textView, null);
        zkb.X(textView, i, wjbVar);
        addView(textView, nme.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, wjbVar);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(t14Var.y(bkb.g6));
        addView(radialProgressView, nme.e(-2, -2, 17));
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (ug8.D(8.0f, r0 - r4.c1, 3) * 1.7f) : this.e.i0.getMeasuredHeight() - gl.L(80.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.y(bkb.g6));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
