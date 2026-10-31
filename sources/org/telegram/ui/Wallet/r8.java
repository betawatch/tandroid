package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r8 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new r8());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        s8 s8Var = (s8) view;
        String charSequence = a51Var.l.toString();
        long j10 = a51Var.B;
        int i10 = a51Var.z;
        boolean z11 = a51Var.q;
        TextView textView = s8Var.c;
        TextView textView2 = s8Var.b;
        textView2.setText(k8.b0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) cd.L0(2131748789, null));
            spannableStringBuilder.setSpan(new u80(org.telegram.messenger.i0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.s(j10, false));
        }
        if (i10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(cd.V(null, null, 2131743076, spannableStringBuilder, cd.Q(i10)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z11 ? 0.5f : 1.0f);
        textView.setAlpha(z11 ? 0.5f : 1.0f);
        s8Var.d.setAlpha(z11 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s8(context, p6Var);
    }
}
