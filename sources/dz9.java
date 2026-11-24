// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dz9 extends FrameLayout {
    public final wjb a;
    public final TextView b;

    public dz9(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        zkb.h(bkb.d7, wjbVar, this);
        TextView textView = new TextView(getContext());
        this.b = textView;
        ir2.t(textView, 1, 14.0f);
        zkb.X(textView, bkb.e7, wjbVar);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        zkb.X(this.b, i, this.a);
    }
}
