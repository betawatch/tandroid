package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pc extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new pc());
    }

    public static r31 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        r31 K = r31.K(pc.class);
        K.d = i7;
        K.z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.l = org.telegram.messenger.hd.H(' ', "StarsCount", (int) j3);
        K.m = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        qc qcVar = (qc) view;
        int i7 = r31Var.z;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        org.telegram.ui.Components.j6 j6Var = qcVar.e;
        TextView textView = qcVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        qcVar.n = i7;
        if (!equals) {
            qcVar.r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (qcVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                qcVar.f = spannableString;
                spannableString.setSpan(new b80(org.telegram.messenger.g0.L(55.0f), j6Var), 0, qcVar.f.length(), 33);
            }
            charSequence2 = qcVar.f;
        }
        j6Var.setText(charSequence2);
        float f10 = org.telegram.messenger.hd.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(xq.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        qcVar.h = z9;
        qcVar.invalidate();
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.z == r31Var2.z && r31Var.d == r31Var2.d && TextUtils.equals(r31Var.m, r31Var2.m);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new qc(context, f6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }
}
