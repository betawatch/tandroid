package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class k8 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new k8());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        l8 l8Var = (l8) view;
        String charSequence = y31Var.l.toString();
        long j3 = y31Var.B;
        int i7 = y31Var.z;
        boolean z10 = y31Var.q;
        TextView textView = l8Var.c;
        TextView textView2 = l8Var.b;
        textView2.setText(d8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131748779, null));
            spannableStringBuilder.setSpan(new c80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) l0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(id.V(null, null, 2131743050, spannableStringBuilder, id.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z10 ? 0.5f : 1.0f);
        textView.setAlpha(z10 ? 0.5f : 1.0f);
        l8Var.d.setAlpha(z10 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new l8(context, g6Var);
    }
}
