package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.s41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class y6 extends LinearLayout {
    public TextView a;
    public m80 b;
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
        m80 m80Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i7;
        if (i7 != 0) {
            if (i7 == 1) {
                textView2.setText(gd.N0(2131742539, null));
                m80Var.setText(gd.N0(2131742538, null));
                textView.setText(gd.N0(2131742536, null));
                textView3.setVisibility(0);
                textView3.setText(gd.N0(2131742537, null));
                return;
            }
            if (i7 == 2) {
                textView2.setText(gd.N0(2131749350, null));
                m80Var.setText(gd.N0(2131749351, null));
                textView.setText(gd.N0(2131749352, null));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(gd.a0(null, null, 2131752144, n10.h(new StringBuilder("+"), mp.u1(i10).c2(Long.valueOf(j10.i(i10).n)).phone, pf.b.c())));
        String N0 = gd.N0(2131752143, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        int indexOf = N0.indexOf("**");
        int lastIndexOf = N0.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new s41(gd.N0(2131752142, null), (fz0) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        m80Var.setText(spannableStringBuilder);
        textView.setText(gd.N0(2131752140, null));
        textView3.setVisibility(0);
        textView3.setText(gd.N0(2131752141, null));
    }
}
