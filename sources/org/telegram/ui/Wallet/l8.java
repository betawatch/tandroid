package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class l8 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new l8());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        m8 m8Var = (m8) view;
        String charSequence = x31Var.l.toString();
        long j3 = x31Var.B;
        int i7 = x31Var.z;
        boolean z10 = x31Var.q;
        TextView textView = m8Var.c;
        TextView textView2 = m8Var.b;
        textView2.setText(e8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131748780, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) m0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(id.V(null, null, 2131743053, spannableStringBuilder, id.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z10 ? 0.5f : 1.0f);
        textView.setAlpha(z10 ? 0.5f : 1.0f);
        m8Var.d.setAlpha(z10 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new m8(context, f6Var);
    }
}
