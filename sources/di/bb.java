package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bb extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new bb());
    }

    public static l41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        l41 K = l41.K(bb.class);
        K.d = i7;
        K.A = i10;
        long j3 = tL_starsTopupOption.stars;
        K.C = j3;
        K.m = gd.H(' ', "StarsCount", (int) j3);
        K.n = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        cb cbVar = (cb) view;
        int i7 = l41Var.A;
        CharSequence charSequence = l41Var.m;
        CharSequence charSequence2 = l41Var.n;
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
                spannableString.setSpan(new p80(org.telegram.messenger.g0.L(55.0f), n6Var), 0, cbVar.f.length(), 33);
            }
            charSequence2 = cbVar.f;
        }
        n6Var.setText(charSequence2);
        float f10 = gd.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(lr.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        cbVar.h = z10;
        cbVar.invalidate();
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return l41Var.A == l41Var2.A && l41Var.d == l41Var2.d && TextUtils.equals(l41Var.n, l41Var2.n);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new cb(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }
}
