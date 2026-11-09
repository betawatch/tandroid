package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pc extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new pc());
    }

    public static y31 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        y31 K = y31.K(pc.class);
        K.d = i7;
        K.z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.l = org.telegram.messenger.id.H(' ', "StarsCount", (int) j3);
        K.m = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        qc qcVar = (qc) view;
        int i7 = y31Var.z;
        CharSequence charSequence = y31Var.l;
        CharSequence charSequence2 = y31Var.m;
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
                spannableString.setSpan(new c80(org.telegram.messenger.g0.L(55.0f), j6Var), 0, qcVar.f.length(), 33);
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

    @Override // org.telegram.ui.Components.x31
    public final boolean c(y31 y31Var, y31 y31Var2) {
        return y31Var.z == y31Var2.z && y31Var.d == y31Var2.d && TextUtils.equals(y31Var.m, y31Var2.m);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new qc(context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        return y31Var.d == y31Var2.d;
    }
}
