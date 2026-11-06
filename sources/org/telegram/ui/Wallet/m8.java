package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class m8 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new m8());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        n8 n8Var = (n8) view;
        String charSequence = x31Var.l.toString();
        long j3 = x31Var.B;
        int i7 = x31Var.z;
        boolean z10 = x31Var.q;
        TextView textView = n8Var.c;
        TextView textView2 = n8Var.b;
        textView2.setText(f8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) hd.M0(2131748778, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) n0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(hd.V(null, null, 2131743051, spannableStringBuilder, hd.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z10 ? 0.5f : 1.0f);
        textView.setAlpha(z10 ? 0.5f : 1.0f);
        n8Var.d.setAlpha(z10 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new n8(context, f6Var);
    }
}
