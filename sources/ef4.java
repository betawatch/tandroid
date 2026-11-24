// default package

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ef4 extends jf5 {
    public final /* synthetic */ qf4 E;
    public final TextView r;
    public final df4 s;
    public int w;
    public final km x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ef4(qf4 qf4Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        ylb ylbVar;
        this.E = qf4Var;
        int i = cmb.K6;
        ylbVar = ((d) qf4Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, cmb.y6, qf4Var.getResourceProvider());
        textView.setText(jb6.M0(qf4Var.getUserConfig().p() ? 2131750552 : 2131750551, null));
        textView.setGravity(5);
        int i2 = (jb6.a0 ? 3 : 5) | 48;
        float f = this.b;
        addView(textView, qoe.d(-1, -1.0f, i2, f, 16.66f, f, this.c));
        textView.setAlpha(0.0f);
        df4 df4Var = new df4(this, getContext());
        this.s = df4Var;
        this.x = new km(df4Var, 320L, d53.h, 0);
        df4Var.setTextSize(gm.L(10.0f));
        df4Var.setTypeface(gm.o());
        df4Var.setGravity(5);
        df4Var.setPadding(gm.L(4.66f), 0, gm.L(4.66f), 0);
        int i3 = jb6.a0 ? 3 : 5;
        float f2 = this.b;
        addView(df4Var, qoe.d(-1, -1.0f, i3 | 48, f2, 16.66f, f2, this.c));
    }

    public final void d(int i, boolean z) {
        qf4 qf4Var = this.E;
        String M0 = jb6.M0(qf4Var.getUserConfig().p() ? 2131750552 : 2131750551, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i2 = 0;
        boolean z2 = i < 0;
        if (!z2) {
            int[] iArr = cmb.q8;
            i2 = qf4Var.getThemedColor(iArr[i % iArr.length]);
        }
        this.w = i2;
        df4 df4Var = this.s;
        if (!z2) {
            df4Var.setEmojiColor(i2);
        }
        if (!z) {
            this.x.a(this.w, true);
        }
        if (z2 != this.y) {
            this.y = z2;
            ViewPropertyAnimator duration = textView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(320L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            df4Var.animate().alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(d53Var).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z2 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        df4 df4Var = this.s;
        CharSequence m = gw3.m(charSequence, df4Var.getPaint().getFontMetricsInt(), false, null, 0);
        if (z && !jb6.a0) {
            z2 = true;
        }
        df4Var.c(m, z2, true);
    }
}
