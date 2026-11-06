package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class x6 extends LinearLayout {
    public TextView a;
    public w70 b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setType(int i7) {
        int i10 = this.f;
        TextView textView = this.c;
        w70 w70Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i7;
        if (i7 != 0) {
            if (i7 == 1) {
                textView2.setText(hd.M0(2131742804, null));
                w70Var.setText(hd.M0(2131742803, null));
                textView.setText(hd.M0(2131742801, null));
                textView3.setVisibility(0);
                textView3.setText(hd.M0(2131742802, null));
                return;
            }
            if (i7 == 2) {
                textView2.setText(hd.M0(2131749525, null));
                w70Var.setText(hd.M0(2131749526, null));
                textView.setText(hd.M0(2131749527, null));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(hd.a0(null, null, 2131752156, org.telegram.messenger.k5.i(new StringBuilder("+"), qp.s1(i10).a2(Long.valueOf(p10.i(i10).n)).phone, pf.b.c())));
        String M0 = hd.M0(2131752155, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf("**");
        int lastIndexOf = M0.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new b41(hd.M0(2131752154, null), (uy0) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        w70Var.setText(spannableStringBuilder);
        textView.setText(hd.M0(2131752152, null));
        textView3.setVisibility(0);
        textView3.setText(hd.M0(2131752153, null));
    }
}
