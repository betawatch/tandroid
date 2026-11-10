package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class n8 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new n8());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        o8 o8Var = (o8) view;
        String charSequence = x31Var.l.toString();
        long j3 = x31Var.B;
        int i7 = x31Var.z;
        boolean z10 = x31Var.q;
        TextView textView = o8Var.c;
        TextView textView2 = o8Var.b;
        textView2.setText(g8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131748779, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) l0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(id.V(null, null, 2131743050, spannableStringBuilder, id.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z10 ? 0.5f : 1.0f);
        textView.setAlpha(z10 ? 0.5f : 1.0f);
        o8Var.d.setAlpha(z10 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new o8(context, h6Var);
    }
}
