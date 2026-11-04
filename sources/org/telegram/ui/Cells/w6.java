package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.v31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class w6 extends LinearLayout {
    public TextView a;
    public s70 b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    public void setType(int i3) {
        int i10 = this.f;
        TextView textView = this.c;
        s70 s70Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i3;
        if (i3 != 0) {
            if (i3 == 1) {
                textView2.setText(bd.M0(2131742813, null));
                s70Var.setText(bd.M0(2131742812, null));
                textView.setText(bd.M0(2131742810, null));
                textView3.setVisibility(0);
                textView3.setText(bd.M0(2131742811, null));
                return;
            }
            if (i3 == 2) {
                textView2.setText(bd.M0(2131749534, null));
                s70Var.setText(bd.M0(2131749535, null));
                textView.setText(bd.M0(2131749536, null));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(bd.a0(null, null, 2131752156, org.telegram.messenger.k5.i(new StringBuilder("+"), hp.s1(i10).a2(Long.valueOf(h10.i(i10).n)).phone, mf.b.c())));
        String M0 = bd.M0(2131752155, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf("**");
        int lastIndexOf = M0.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new v31(bd.M0(2131752154, null), (ty0) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        s70Var.setText(spannableStringBuilder);
        textView.setText(bd.M0(2131752152, null));
        textView3.setVisibility(0);
        textView3.setText(bd.M0(2131752153, null));
    }
}
