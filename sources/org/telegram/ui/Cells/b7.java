package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class b7 extends LinearLayout {
    public TextView a;
    public p80 b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setType(int i10) {
        int i11 = this.f;
        TextView textView = this.c;
        p80 p80Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i10;
        if (i10 != 0) {
            if (i10 == 1) {
                textView2.setText(dd.L0(2131742828, null));
                p80Var.setText(dd.L0(2131742827, null));
                textView.setText(dd.L0(2131742825, null));
                textView3.setVisibility(0);
                textView3.setText(dd.L0(2131742826, null));
                return;
            }
            if (i10 == 2) {
                textView2.setText(dd.L0(2131749535, null));
                p80Var.setText(dd.L0(2131749536, null));
                textView.setText(dd.L0(2131749537, null));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(dd.a0(null, null, 2131752156, org.telegram.messenger.m5.h(new StringBuilder("+"), wp.r1(i11).Z1(Long.valueOf(e20.i(i11).n)).phone, af.b.c())));
        String L0 = dd.L0(2131752155, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
        int indexOf = L0.indexOf("**");
        int lastIndexOf = L0.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new f51(dd.L0(2131752154, null), (zz0) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        p80Var.setText(spannableStringBuilder);
        textView.setText(dd.L0(2131752152, null));
        textView3.setVisibility(0);
        textView3.setText(dd.L0(2131752153, null));
    }
}
