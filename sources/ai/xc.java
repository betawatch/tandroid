package ai;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class xc extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new xc());
    }

    public static f61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        f61 J = f61.J(xc.class);
        J.d = i10;
        J.z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        yc ycVar = (yc) view;
        int i10 = f61Var.z;
        CharSequence charSequence = f61Var.l;
        CharSequence charSequence2 = f61Var.m;
        org.telegram.ui.Components.q6 q6Var = ycVar.e;
        TextView textView = ycVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        ycVar.n = i10;
        if (!equals) {
            ycVar.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (ycVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                ycVar.f = spannableString;
                spannableString.setSpan(new ca0(AndroidUtilities.dp(55.0f), q6Var), 0, ycVar.f.length(), 33);
            }
            charSequence2 = ycVar.f;
        }
        q6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(bs.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        ycVar.h = z10;
        ycVar.invalidate();
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        return f61Var.z == f61Var2.z && f61Var.d == f61Var2.d && TextUtils.equals(f61Var.m, f61Var2.m);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new yc(context, d6Var);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        return f61Var.d == f61Var2.d;
    }
}
