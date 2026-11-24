// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hb9 extends LinearLayout {
    public final TextView a;

    public hb9(Context context, ylb ylbVar) {
        super(context);
        setOrientation(1);
        bf0 bf0Var = new bf0(context);
        bf0Var.setImageDrawable(new p09(R.raw.utyan_empty, gm.L(130.0f), gm.L(130.0f)));
        addView(bf0Var, qoe.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.z6, ylbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, qoe.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gm.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
