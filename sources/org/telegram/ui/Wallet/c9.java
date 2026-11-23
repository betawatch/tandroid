package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class c9 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new c9());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        d9 d9Var = (d9) view;
        String charSequence = n41Var.m.toString();
        long j3 = n41Var.C;
        int i7 = n41Var.A;
        boolean z11 = n41Var.r;
        TextView textView = d9Var.c;
        TextView textView2 = d9Var.b;
        textView2.setText(v8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) gd.N0(2131748586, null));
            spannableStringBuilder.setSpan(new o80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) v0.x(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(gd.V(null, null, 2131742779, spannableStringBuilder, gd.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z11 ? 0.5f : 1.0f);
        textView.setAlpha(z11 ? 0.5f : 1.0f);
        d9Var.d.setAlpha(z11 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new d9(context, i6Var);
    }
}
