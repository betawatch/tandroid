// default package

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ms7 extends my0 {
    public final long l1;
    public final long m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final TextView p1;
    public final b61 q1;
    public final TextView r1;
    public long s1;
    public int t1;
    public boolean u1;
    public long v1;
    public boolean w1;
    public boolean x1;

    public ms7(int i, ylb ylbVar, qac qacVar, Context context) {
        super(1, ylbVar, context, true);
        this.a = i;
        gs gsVar = oc7.r1(i).l4;
        this.l1 = Math.max(gsVar.q.f(), 10000000L);
        long f = gsVar.r.f();
        this.m1 = f;
        this.Q0 = true;
        this.E = true;
        int i2 = cmb.Z6;
        t0(i2);
        L(i2);
        this.b0 = i2;
        LinearLayout i3 = hg9.i(context, 1);
        TextView textView = new TextView(context);
        this.r1 = textView;
        textView.setText(jb6.M0(2131749465, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(8388627);
        anb.X(textView, cmb.F6, ylbVar);
        i3.addView(textView, qoe.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout D0 = ls7.D0(context, ylbVar);
        i3.addView(D0, qoe.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(jb6.M0(2131749471, null));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gm.o());
        anb.X(textView2, cmb.K6, ylbVar);
        D0.addView(textView2, qoe.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        D0.addView(frameLayout, qoe.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.mini_gram_72);
        frameLayout.addView(imageView, qoe.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gm.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(f / 1000000000).length() + 3)});
        editTextBoldCursor.setCursorColor(cmb.v0(cmb.n6, ylbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(cmb.v0(cmb.G6, ylbVar));
        frameLayout.addView(editTextBoldCursor, qoe.d(-1, -1.0f, nm7.D1, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.o1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        anb.X(textView3, cmb.x6, ylbVar);
        TextView l = wi8.l(frameLayout, textView3, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f), context);
        this.p1 = l;
        l.setTextSize(1, 14.0f);
        i3.addView(l, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        b61 i4 = mlb.i(24, ylbVar, context, true);
        this.q1 = i4;
        byte b = 11;
        i4.setOnClickListener(new n06(this, qacVar, b));
        i3.addView(i4, qoe.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = i3;
        gf0 gf0Var = new gf0(context, i, ok.b, ylbVar);
        gf0Var.a();
        rve.a(gf0Var);
        gf0Var.setOnClickListener(new x10(b));
        this.c.addView(gf0Var, qoe.d(-2, -2.0f, 49, 0.0f, (gm.m / gm.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new og6(this, (byte) 4));
        D0(0L);
    }

    public final void D0(long j) {
        int i;
        ok okVar = ok.b;
        this.s1 = j;
        boolean z = false;
        this.t1 = 0;
        if (j > this.m1) {
            this.t1 = 2;
            i = 2;
        } else {
            i = 0;
        }
        if (j > 0 && j < this.l1) {
            i |= 1;
            this.t1 = i;
        }
        anb.X(this.n1, i == 0 ? cmb.F6 : cmb.p7, this.J0);
        double d = (j / 1.0E9d) * oc7.r1(this.a).l4.k.i;
        TextView textView = this.o1;
        cj0.h();
        textView.setText(cj0.f("USD", 2, (long) (d * 100.0d), false));
        int i2 = this.t1;
        int i3 = i2 & 2;
        TextView textView2 = this.p1;
        if (i3 != 0) {
            hg9.q(null, null, 2131749470, new Object[]{nk.j(this.m1, okVar).d()}, textView2);
        } else if ((i2 & 1) != 0) {
            hg9.q(null, null, 2131749469, new Object[]{nk.j(this.l1, okVar).d()}, textView2);
        } else {
            textView2.setText(jb6.M0((this.u1 || this.x1) ? 2131749475 : 2131749476, null));
        }
        anb.X(this.p1, this.t1 == 0 ? cmb.x6 : cmb.p7, this.J0);
        this.q1.i(jb6.a0(null, null, this.u1 ? 2131749602 : 2131749472, nk.j(j, okVar).b()), true, true);
        if (j > 0 && this.t1 == 0 && (!this.u1 || j != this.v1)) {
            z = true;
        }
        this.q1.setEnabled(z);
        this.q1.setClickable(z);
        wi8.s(this.q1.animate(), z ? 1.0f : 0.6f, 180L);
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        gm.d3(new kl7(this, (byte) 6), 50L);
    }
}
