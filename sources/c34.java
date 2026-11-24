// default package

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c34 extends LinearLayout {
    public final gt3 a;
    public final TextView b;
    public b34 c;

    public c34(Context context, wjb wjbVar) {
        super(context);
        setOrientation(0);
        gt3 gt3Var = new gt3(context, wjbVar);
        this.a = gt3Var;
        gt3Var.setLines(1);
        gt3Var.setSingleLine(true);
        InputFilter[] inputFilterArr = {new a34(this)};
        gt3Var.setInputType(TLObject.FLAG_14);
        gt3Var.setFilters(inputFilterArr);
        gt3Var.setTextSize(1, 16.0f);
        zkb.X(gt3Var, bkb.Ke, wjbVar);
        zkb.G(gt3Var, bkb.Xc, wjbVar);
        zkb.C(gt3Var, bkb.kg, wjbVar);
        int i = bkb.Le;
        zkb.l(gt3Var, 34, i, wjbVar);
        zkb.D(gt3Var, i, wjbVar);
        zkb.l(gt3Var, 30, bkb.Me, wjbVar);
        zkb.l(gt3Var, 36, bkb.lg, wjbVar);
        gt3Var.setBackground(null);
        gt3Var.setHint(k96.M0(2131753474, null));
        gt3Var.addTextChangedListener(new b7(this, (byte) 22));
        gt3Var.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.i5, wjbVar);
        if (!k96.a0) {
            addView(textView, nme.t(-2, -2, 16, 20, 0, 0, 0));
            addView(gt3Var, nme.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t = nme.t(-1, -2, 16, 20, 0, 36, 0);
            t.weight = 1.0f;
            addView(gt3Var, t);
            addView(textView, nme.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(b34 b34Var) {
        this.c = b34Var;
    }

    public void setCount(int i) {
        this.b.setText(String.valueOf(i));
    }
}
