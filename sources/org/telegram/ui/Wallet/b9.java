package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class b9 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new b9());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        c9 c9Var = (c9) view;
        String charSequence = l41Var.m.toString();
        long j3 = l41Var.C;
        int i7 = l41Var.A;
        boolean z11 = l41Var.r;
        TextView textView = c9Var.c;
        TextView textView2 = c9Var.b;
        textView2.setText(u8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) gd.M0(2131748587, null));
            spannableStringBuilder.setSpan(new p80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) u0.x(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(gd.V(null, null, 2131742792, spannableStringBuilder, gd.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z11 ? 0.5f : 1.0f);
        textView.setAlpha(z11 ? 0.5f : 1.0f);
        c9Var.d.setAlpha(z11 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new c9(context, i6Var);
    }
}
