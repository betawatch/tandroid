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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.p41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class y6 extends LinearLayout {
    public TextView a;
    public k80 b;
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
        k80 k80Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i7;
        if (i7 != 0) {
            if (i7 == 1) {
                textView2.setText(gd.M0(2131742545, null));
                k80Var.setText(gd.M0(2131742544, null));
                textView.setText(gd.M0(2131742542, null));
                textView3.setVisibility(0);
                textView3.setText(gd.M0(2131742543, null));
                return;
            }
            if (i7 == 2) {
                textView2.setText(gd.M0(2131749351, null));
                k80Var.setText(gd.M0(2131749352, null));
                textView.setText(gd.M0(2131749353, null));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(gd.a0(null, null, 2131752145, n10.h(new StringBuilder("+"), mp.u1(i10).c2(Long.valueOf(j10.i(i10).n)).phone, pf.b.c())));
        String M0 = gd.M0(2131752144, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf("**");
        int lastIndexOf = M0.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new p41(gd.M0(2131752143, null), (dz0) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        k80Var.setText(spannableStringBuilder);
        textView.setText(gd.M0(2131752141, null));
        textView3.setVisibility(0);
        textView3.setText(gd.M0(2131752142, null));
    }
}
