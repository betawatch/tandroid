// default package

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ed4 extends ld5 {
    public final /* synthetic */ pd4 E;
    public final TextView r;
    public final dd4 s;
    public int w;
    public final kl x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ed4(pd4 pd4Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        wjb wjbVar;
        this.E = pd4Var;
        int i = bkb.K6;
        wjbVar = ((d) pd4Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, bkb.y6, pd4Var.getResourceProvider());
        textView.setText(k96.M0(pd4Var.getUserConfig().p() ? 2131750603 : 2131750602, null));
        textView.setGravity(5);
        int i2 = (k96.a0 ? 3 : 5) | 48;
        float f = this.b;
        addView(textView, nme.d(-1, -1.0f, i2, f, 16.66f, f, this.c));
        textView.setAlpha(0.0f);
        dd4 dd4Var = new dd4(this, getContext());
        this.s = dd4Var;
        this.x = new kl(dd4Var, 320L, s33.h, 0);
        dd4Var.setTextSize(gl.L(10.0f));
        dd4Var.setTypeface(gl.o());
        dd4Var.setGravity(5);
        dd4Var.setPadding(gl.L(4.66f), 0, gl.L(4.66f), 0);
        int i3 = k96.a0 ? 3 : 5;
        float f2 = this.b;
        addView(dd4Var, nme.d(-1, -1.0f, i3 | 48, f2, 16.66f, f2, this.c));
    }

    public final void d(int i, boolean z) {
        pd4 pd4Var = this.E;
        String M0 = k96.M0(pd4Var.getUserConfig().p() ? 2131750603 : 2131750602, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i2 = 0;
        boolean z2 = i < 0;
        if (!z2) {
            int[] iArr = bkb.q8;
            i2 = pd4Var.getThemedColor(iArr[i % iArr.length]);
        }
        this.w = i2;
        dd4 dd4Var = this.s;
        if (!z2) {
            dd4Var.setEmojiColor(i2);
        }
        if (!z) {
            this.x.a(this.w, true);
        }
        if (z2 != this.y) {
            this.y = z2;
            ViewPropertyAnimator duration = textView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(320L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            dd4Var.animate().alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(s33Var).start();
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
        dd4 dd4Var = this.s;
        CharSequence m = vu3.m(charSequence, dd4Var.getPaint().getFontMetricsInt(), false, null, 0);
        if (z && !k96.a0) {
            z2 = true;
        }
        dd4Var.c(m, z2, true);
    }
}
