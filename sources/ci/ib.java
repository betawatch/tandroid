package ci;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ib extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new ib());
    }

    public static r31 i(int i3, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        r31 K = r31.K(ib.class);
        K.d = i3;
        K.z = i10;
        long j10 = tL_starsTopupOption.stars;
        K.B = j10;
        K.l = bd.H(' ', "StarsCount", (int) j10);
        K.m = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        jb jbVar = (jb) view;
        int i3 = r31Var.z;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        org.telegram.ui.Components.h6 h6Var = jbVar.e;
        TextView textView = jbVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        jbVar.n = i3;
        if (!equals) {
            jbVar.r.e(true, i3);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (jbVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                jbVar.f = spannableString;
                spannableString.setSpan(new x70(org.telegram.messenger.g0.L(55.0f), h6Var), 0, jbVar.f.length(), 33);
            }
            charSequence2 = jbVar.f;
        }
        h6Var.setText(charSequence2);
        float f10 = bd.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i3 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(xq.h).start();
        } else {
            textView.setTranslationX(f10 * (i3 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        jbVar.h = z10;
        jbVar.invalidate();
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.z == r31Var2.z && r31Var.d == r31Var2.d && TextUtils.equals(r31Var.m, r31Var2.m);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new jb(context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }
}
