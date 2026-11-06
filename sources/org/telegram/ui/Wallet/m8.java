package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class m8 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new m8());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        n8 n8Var = (n8) view;
        String charSequence = r31Var.l.toString();
        long j3 = r31Var.B;
        int i7 = r31Var.z;
        boolean z10 = r31Var.q;
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

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new n8(context, f6Var);
    }
}
