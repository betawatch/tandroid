package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bb extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new bb());
    }

    public static o41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        o41 K = o41.K(bb.class);
        K.d = i7;
        K.A = i10;
        long j3 = tL_starsTopupOption.stars;
        K.C = j3;
        K.m = gd.H(' ', "StarsCount", (int) j3);
        K.n = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        cb cbVar = (cb) view;
        int i7 = o41Var.A;
        CharSequence charSequence = o41Var.m;
        CharSequence charSequence2 = o41Var.n;
        org.telegram.ui.Components.o6 o6Var = cbVar.e;
        TextView textView = cbVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        cbVar.n = i7;
        if (!equals) {
            cbVar.r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (cbVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                cbVar.f = spannableString;
                spannableString.setSpan(new r80(org.telegram.messenger.g0.L(55.0f), o6Var), 0, cbVar.f.length(), 33);
            }
            charSequence2 = cbVar.f;
        }
        o6Var.setText(charSequence2);
        float f10 = gd.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(nr.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        cbVar.h = z10;
        cbVar.invalidate();
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return o41Var.A == o41Var2.A && o41Var.d == o41Var2.d && TextUtils.equals(o41Var.n, o41Var2.n);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new cb(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }
}
