// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cw extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final be0 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final u41 h;
    public ValueAnimator n;
    public boolean r;

    public cw(Context context) {
        super(context);
        this.r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setPadding(gl.L(32.0f), gl.L(24.0f), gl.L(32.0f), gl.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, nme.e(-2, -2, 17));
        be0 be0Var = new be0(context);
        this.c = be0Var;
        linearLayout.addView(be0Var, nme.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(gl.o());
        textView.setTextColor(-1);
        TextView m = ug8.m(linearLayout, textView, nme.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = m;
        m.setTextSize(1, 15.0f);
        m.setTextColor(-1);
        m.setSingleLine(false);
        m.setMaxLines(3);
        TextView m2 = ug8.m(linearLayout, m, nme.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = m2;
        m2.setTextSize(1, 12.0f);
        m2.setTextColor(-1);
        m2.setAlpha(0.4f);
        linearLayout.addView(m2, nme.r(-2, -2, 3));
        u41 u41Var = new u41(null, context, true);
        this.h = u41Var;
        u41Var.setMinWidth(gl.L(140.0f));
        u41Var.i(k96.M0(2131746147, null), false, true);
        linearLayout.addView(u41Var, nme.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(k96.M0(2131742659, null));
        de9.r(null, null, 2131742661, new Object[]{str}, this.e);
        this.f.setText(str2);
    }

    public final void b(boolean z, boolean z2) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            this.d.setTextColor(!z ? -16777216 : -1);
            this.e.setTextColor(!z ? -16777216 : -1);
            this.f.setTextColor(z ? -1 : -16777216);
            return;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.n = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 7));
        this.n.start();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.b) {
            return;
        }
        this.b = true;
        hq6.d0(y6c.t0).e2(this.c, "tg_placeholders_android", "🧐", "100_100");
    }
}
