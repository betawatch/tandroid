// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dw extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final de0 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final c51 h;
    public ValueAnimator n;
    public boolean r;

    public dw(Context context) {
        super(context);
        this.r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setPadding(hl.L(32.0f), hl.L(24.0f), hl.L(32.0f), hl.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, tre.e(-2, -2, 17));
        de0 de0Var = new de0(context);
        this.c = de0Var;
        linearLayout.addView(de0Var, tre.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(hl.o());
        textView.setTextColor(-1);
        TextView m = ik8.m(linearLayout, textView, tre.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = m;
        m.setTextSize(1, 15.0f);
        m.setTextColor(-1);
        m.setSingleLine(false);
        m.setMaxLines(3);
        TextView m2 = ik8.m(linearLayout, m, tre.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = m2;
        m2.setTextSize(1, 12.0f);
        m2.setTextColor(-1);
        m2.setAlpha(0.4f);
        linearLayout.addView(m2, tre.r(-2, -2, 3));
        c51 c51Var = new c51(null, context, true);
        this.h = c51Var;
        c51Var.setMinWidth(hl.L(140.0f));
        c51Var.i(ob6.M0(2131746067, null), false, true);
        linearLayout.addView(c51Var, tre.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(ob6.M0(2131742553, null));
        uh9.r(null, null, 2131742555, new Object[]{str}, this.e);
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
        ofFloat.addUpdateListener(new g0(this, (byte) 7));
        this.n.start();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.b) {
            return;
        }
        this.b = true;
        ls6.d0(yac.t0).e2(this.c, "tg_placeholders_android", "🧐", "100_100");
    }
}
