// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h99 extends LinearLayout {
    public final TextView a;

    public h99(Context context, wjb wjbVar) {
        super(context);
        setOrientation(1);
        be0 be0Var = new be0(context);
        be0Var.setImageDrawable(new oy8(R.raw.utyan_empty, gl.L(130.0f), gl.L(130.0f)));
        addView(be0Var, nme.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.z6, wjbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, nme.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
