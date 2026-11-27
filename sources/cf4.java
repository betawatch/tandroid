// default package

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cf4 extends mf5 {
    public final /* synthetic */ nf4 E;
    public final TextView r;
    public final bf4 s;
    public int w;
    public final ll x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cf4(nf4 nf4Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        vnb vnbVar;
        this.E = nf4Var;
        int i = aob.L6;
        vnbVar = ((e) nf4Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        yob.X(textView, aob.z6, nf4Var.getResourceProvider());
        textView.setText(ob6.M0(nf4Var.getUserConfig().p() ? 2131750580 : 2131750579, null));
        textView.setGravity(5);
        int i2 = (ob6.a0 ? 3 : 5) | 48;
        float f = this.b;
        addView(textView, tre.d(-1, -1.0f, i2, f, 16.66f, f, this.c));
        textView.setAlpha(0.0f);
        bf4 bf4Var = new bf4(this, getContext());
        this.s = bf4Var;
        this.x = new ll(bf4Var, 320L, k43.h, 0);
        bf4Var.setTextSize(hl.L(10.0f));
        bf4Var.setTypeface(hl.o());
        bf4Var.setGravity(5);
        bf4Var.setPadding(hl.L(4.66f), 0, hl.L(4.66f), 0);
        int i3 = ob6.a0 ? 3 : 5;
        float f2 = this.b;
        addView(bf4Var, tre.d(-1, -1.0f, i3 | 48, f2, 16.66f, f2, this.c));
    }

    public final void d(int i, boolean z) {
        nf4 nf4Var = this.E;
        String M0 = ob6.M0(nf4Var.getUserConfig().p() ? 2131750580 : 2131750579, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i2 = 0;
        boolean z2 = i < 0;
        if (!z2) {
            int[] iArr = aob.r8;
            i2 = nf4Var.getThemedColor(iArr[i % iArr.length]);
        }
        this.w = i2;
        bf4 bf4Var = this.s;
        if (!z2) {
            bf4Var.setEmojiColor(i2);
        }
        if (!z) {
            this.x.a(this.w, true);
        }
        if (z2 != this.y) {
            this.y = z2;
            ViewPropertyAnimator duration = textView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(320L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            bf4Var.animate().alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(k43Var).start();
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
        bf4 bf4Var = this.s;
        CharSequence m = pv3.m(charSequence, bf4Var.getPaint().getFontMetricsInt(), false, null, 0);
        if (z && !ob6.a0) {
            z2 = true;
        }
        bf4Var.c(m, z2, true);
    }
}
