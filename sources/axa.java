// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class axa extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new axa());
    }

    public static c6c i(int i, int i2, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        c6c K = c6c.K(axa.class);
        K.d = i;
        K.A = i2;
        long j = tL_starsTopupOption.stars;
        K.C = j;
        K.m = jb6.H(' ', "StarsCount", (int) j);
        K.n = tL_starsTopupOption.loadingStorePrice ? null : cj0.h().e(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        bxa bxaVar = (bxa) view;
        int i = c6cVar.A;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        io ioVar = bxaVar.e;
        TextView textView = bxaVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        bxaVar.n = i;
        if (!equals) {
            bxaVar.r.e(true, i);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (bxaVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                bxaVar.f = spannableString;
                spannableString.setSpan(new ta6(gm.L(55.0f), ioVar), 0, bxaVar.f.length(), 33);
            }
            charSequence2 = bxaVar.f;
        }
        ioVar.setText(charSequence2);
        float f = jb6.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f * (i - 1) * gm.L(2.66f)).setDuration(320L).setInterpolator(d53.h).start();
        } else {
            textView.setTranslationX(f * (i - 1) * gm.L(2.66f));
        }
        bxaVar.h = z;
        bxaVar.invalidate();
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.A == c6cVar2.A && c6cVar.d == c6cVar2.d && TextUtils.equals(c6cVar.n, c6cVar2.n);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new bxa(context, ylbVar);
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }
}
