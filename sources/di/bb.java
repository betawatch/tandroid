package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bb extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new bb());
    }

    public static n41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        n41 K = n41.K(bb.class);
        K.d = i7;
        K.A = i10;
        long j3 = tL_starsTopupOption.stars;
        K.C = j3;
        K.m = gd.H(' ', "StarsCount", (int) j3);
        K.n = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        cb cbVar = (cb) view;
        int i7 = n41Var.A;
        CharSequence charSequence = n41Var.m;
        CharSequence charSequence2 = n41Var.n;
        org.telegram.ui.Components.n6 n6Var = cbVar.e;
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
                spannableString.setSpan(new o80(org.telegram.messenger.g0.L(55.0f), n6Var), 0, cbVar.f.length(), 33);
            }
            charSequence2 = cbVar.f;
        }
        n6Var.setText(charSequence2);
        float f10 = gd.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(kr.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        cbVar.h = z10;
        cbVar.invalidate();
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.A == n41Var2.A && n41Var.d == n41Var2.d && TextUtils.equals(n41Var.n, n41Var2.n);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new cb(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }
}
