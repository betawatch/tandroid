package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class n8 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new n8());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        o8 o8Var = (o8) view;
        String charSequence = b41Var.l.toString();
        long j3 = b41Var.B;
        int i7 = b41Var.z;
        boolean z11 = b41Var.q;
        TextView textView = o8Var.c;
        TextView textView2 = o8Var.b;
        textView2.setText(f8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) hd.M0(2131748779, null));
            spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) l0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(hd.V(null, null, 2131743050, spannableStringBuilder, hd.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z11 ? 0.5f : 1.0f);
        textView.setAlpha(z11 ? 0.5f : 1.0f);
        o8Var.d.setAlpha(z11 ? 0.5f : 1.0f);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new o8(context, e6Var);
    }
}
