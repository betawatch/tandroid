package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xa extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new xa());
    }

    public static b41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        b41 K = b41.K(xa.class);
        K.d = i7;
        K.z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.l = hd.H(' ', "StarsCount", (int) j3);
        K.m = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ya yaVar = (ya) view;
        int i7 = b41Var.z;
        CharSequence charSequence = b41Var.l;
        CharSequence charSequence2 = b41Var.m;
        org.telegram.ui.Components.h6 h6Var = yaVar.e;
        TextView textView = yaVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        yaVar.n = i7;
        if (!equals) {
            yaVar.r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (yaVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                yaVar.f = spannableString;
                spannableString.setSpan(new e80(org.telegram.messenger.g0.L(55.0f), h6Var), 0, yaVar.f.length(), 33);
            }
            charSequence2 = yaVar.f;
        }
        h6Var.setText(charSequence2);
        float f10 = hd.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(er.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        yaVar.h = z10;
        yaVar.invalidate();
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(b41 b41Var, b41 b41Var2) {
        return b41Var.z == b41Var2.z && b41Var.d == b41Var2.d && TextUtils.equals(b41Var.m, b41Var2.m);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ya(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }
}
