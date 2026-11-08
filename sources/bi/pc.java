package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class pc extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new pc());
    }

    public static x31 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        x31 K = x31.K(pc.class);
        K.d = i7;
        K.z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.l = org.telegram.messenger.id.H(' ', "StarsCount", (int) j3);
        K.m = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        qc qcVar = (qc) view;
        int i7 = x31Var.z;
        CharSequence charSequence = x31Var.l;
        CharSequence charSequence2 = x31Var.m;
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
        float f10 = org.telegram.messenger.id.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(xq.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        qcVar.h = z9;
        qcVar.invalidate();
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.z == x31Var2.z && x31Var.d == x31Var2.d && TextUtils.equals(x31Var.m, x31Var2.m);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new qc(context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }
}
