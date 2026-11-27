// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class aza extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new aza());
    }

    public static b8c i(int i, int i2, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        b8c K = b8c.K(aza.class);
        K.d = i;
        K.A = i2;
        long j = tL_starsTopupOption.stars;
        K.C = j;
        K.m = ob6.H(' ', "StarsCount", (int) j);
        K.n = tL_starsTopupOption.loadingStorePrice ? null : di0.h().e(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        bza bzaVar = (bza) view;
        int i = b8cVar.A;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        in inVar = bzaVar.e;
        TextView textView = bzaVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        bzaVar.n = i;
        if (!equals) {
            bzaVar.r.e(true, i);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (bzaVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                bzaVar.f = spannableString;
                spannableString.setSpan(new ya6(hl.L(55.0f), inVar), 0, bzaVar.f.length(), 33);
            }
            charSequence2 = bzaVar.f;
        }
        inVar.setText(charSequence2);
        float f = ob6.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f * (i - 1) * hl.L(2.66f)).setDuration(320L).setInterpolator(k43.h).start();
        } else {
            textView.setTranslationX(f * (i - 1) * hl.L(2.66f));
        }
        bzaVar.h = z;
        bzaVar.invalidate();
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.A == b8cVar2.A && b8cVar.d == b8cVar2.d && TextUtils.equals(b8cVar.n, b8cVar2.n);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new bza(context, vnbVar);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }
}
