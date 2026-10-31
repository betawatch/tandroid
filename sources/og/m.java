package og;

import ag.a1;
import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.mt;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends LinearLayout {
    public final mt a;
    public final TextView b;
    public l c;

    public m(Context context, p6 p6Var) {
        super(context);
        setOrientation(0);
        mt mtVar = new mt(context, p6Var);
        this.a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        mtVar.setInputType(TLObject.FLAG_14);
        mtVar.setFilters(inputFilterArr);
        mtVar.setTextSize(1, 16.0f);
        a7.V(mtVar, t6.Ie, p6Var);
        a7.H(mtVar, t6.Vc, p6Var);
        a7.D(mtVar, t6.ig, p6Var);
        int i10 = t6.Je;
        a7.m(mtVar, 34, i10, p6Var);
        a7.E(mtVar, i10, p6Var);
        a7.m(mtVar, 30, t6.Ke, p6Var);
        a7.m(mtVar, 36, t6.jg, p6Var);
        mtVar.setBackground(null);
        mtVar.setHint(cd.L0(2131753477, null));
        mtVar.addTextChangedListener(new a1(this, 6));
        mtVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        a7.V(textView, t6.j5, p6Var);
        if (!cd.X) {
            addView(textView, b6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(mtVar, b6.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = b6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(mtVar, t10);
            addView(textView, b6.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.c = lVar;
    }

    public void setCount(int i10) {
        this.b.setText(String.valueOf(i10));
    }
}
