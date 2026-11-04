package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l8 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new l8());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        m8 m8Var = (m8) view;
        String charSequence = r31Var.l.toString();
        long j10 = r31Var.B;
        int i3 = r31Var.z;
        boolean z11 = r31Var.q;
        TextView textView = m8Var.c;
        TextView textView2 = m8Var.b;
        textView2.setText(e8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131748787, null));
            spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.s(j10, false));
        }
        if (i3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(bd.V(null, null, 2131743060, spannableStringBuilder, bd.Q(i3)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z11 ? 0.5f : 1.0f);
        textView.setAlpha(z11 ? 0.5f : 1.0f);
        m8Var.d.setAlpha(z11 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new m8(context, e6Var);
    }
}
