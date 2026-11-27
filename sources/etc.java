// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class etc extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new etc());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ftc ftcVar = (ftc) view;
        String charSequence = b8cVar.m.toString();
        long j = b8cVar.C;
        int i = b8cVar.A;
        boolean z2 = b8cVar.r;
        TextView textView = ftcVar.c;
        TextView textView2 = ftcVar.b;
        textView2.setText(atc.Z(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j < 0) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131748533, null));
            spannableStringBuilder.setSpan(new ya6(hl.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) c.w(j, false));
        }
        if (i > 0) {
            spannableStringBuilder = new SpannableStringBuilder(ob6.V(null, null, 2131742681, spannableStringBuilder, ob6.Q(i)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z2 ? 0.5f : 1.0f);
        textView.setAlpha(z2 ? 0.5f : 1.0f);
        ftcVar.d.setAlpha(z2 ? 0.5f : 1.0f);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ftc(context, vnbVar);
    }
}
