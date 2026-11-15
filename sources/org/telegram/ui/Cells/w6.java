package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class w6 extends LinearLayout {
    public TextView a;
    public z70 b;
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
        z70 z70Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i7;
        if (i7 != 0) {
            if (i7 == 1) {
                textView2.setText(hd.M0(2131742803, null));
                z70Var.setText(hd.M0(2131742802, null));
                textView.setText(hd.M0(2131742800, null));
                textView3.setVisibility(0);
                textView3.setText(hd.M0(2131742801, null));
                return;
            }
            if (i7 == 2) {
                textView2.setText(hd.M0(2131749526, null));
                z70Var.setText(hd.M0(2131749527, null));
                textView.setText(hd.M0(2131749528, null));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(hd.a0(null, null, 2131752156, org.telegram.messenger.k5.h(new StringBuilder("+"), np.s1(i10).a2(Long.valueOf(m10.i(i10).n)).phone, pf.b.c())));
        String M0 = hd.M0(2131752155, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf("**");
        int lastIndexOf = M0.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new f41(hd.M0(2131752154, null), (wy0) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        z70Var.setText(spannableStringBuilder);
        textView.setText(hd.M0(2131752152, null));
        textView3.setVisibility(0);
        textView3.setText(hd.M0(2131752153, null));
    }
}
