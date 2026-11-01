package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r8 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new r8());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        s8 s8Var = (s8) view;
        String charSequence = b51Var.l.toString();
        long j10 = b51Var.B;
        int i10 = b51Var.z;
        boolean z11 = b51Var.q;
        TextView textView = s8Var.c;
        TextView textView2 = s8Var.b;
        textView2.setText(k8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) dd.L0(2131748789, null));
            spannableStringBuilder.setSpan(new u80(org.telegram.messenger.i0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.s(j10, false));
        }
        if (i10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(dd.V(null, null, 2131743076, spannableStringBuilder, dd.Q(i10)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z11 ? 0.5f : 1.0f);
        textView.setAlpha(z11 ? 0.5f : 1.0f);
        s8Var.d.setAlpha(z11 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s8(context, p6Var);
    }
}
