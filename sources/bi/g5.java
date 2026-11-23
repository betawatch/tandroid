package bi;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.sa;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g5 extends org.telegram.ui.ActionBar.w2 {
    public final long m1;
    public final long n1;
    public final EditTextBoldCursor o1;
    public final TextView p1;
    public final TextView q1;
    public final hi.e r1;
    public final TextView s1;
    public long t1;
    public int u1;
    public boolean v1;
    public long w1;
    public boolean x1;
    public boolean y1;

    public g5(int i7, Context context, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        this.a = i7;
        org.telegram.messenger.p0 p0Var = mp.u1(i7).A7;
        this.m1 = Math.max(((org.telegram.messenger.l0) p0Var.r.b).c, 10000000L);
        long j3 = ((org.telegram.messenger.l0) p0Var.s.b).c;
        this.n1 = j3;
        this.Q0 = true;
        this.E = true;
        int i10 = org.telegram.ui.ActionBar.n6.a7;
        w0(i10);
        Q(i10);
        this.b0 = i10;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        this.s1 = textView;
        textView.setText(gd.N0(2131749515, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(8388627);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        g10.addView(textView, na.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout J0 = f5.J0(context, i6Var);
        g10.addView(J0, na.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(gd.N0(2131749521, null));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.L6, i6Var);
        J0.addView(textView2, na.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        J0.addView(frameLayout, na.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.mini_gram_72);
        frameLayout.addView(imageView, na.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.o1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(j3 / 1000000000).length() + 3)});
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.o6, i6Var));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, i6Var));
        frameLayout.addView(editTextBoldCursor, na.d(-1, -1.0f, ks.E1, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.p1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.y6, i6Var);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView3, na.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f), context);
        this.q1 = m10;
        m10.setTextSize(1, 14.0f);
        g10.addView(m10, na.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        hi.e g11 = m10.g(24, context, i6Var, true);
        this.r1 = g11;
        int i11 = 4;
        g11.setOnClickListener(new ai.p2(i11, this, w10Var));
        g10.addView(g11, na.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = g10;
        di.b bVar = new di.b(context, i7, cg.b.b, i6Var);
        bVar.a();
        sa.a(bVar);
        bVar.setOnClickListener(new o(i11));
        this.c.addView(bVar, na.d(-2, -2.0f, 49, 0.0f, (org.telegram.messenger.g0.m / org.telegram.messenger.g0.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 2));
        J0(0L);
    }

    public final void J0(long j3) {
        this.t1 = j3;
        boolean z10 = false;
        this.u1 = 0;
        long j10 = this.n1;
        if (j3 > j10) {
            this.u1 = 2;
        }
        long j11 = this.m1;
        if (j3 > 0 && j3 < j11) {
            this.u1 |= 1;
        }
        org.telegram.ui.ActionBar.u6.U(this.o1, this.u1 == 0 ? org.telegram.ui.ActionBar.n6.G6 : org.telegram.ui.ActionBar.n6.q7, this.J0);
        double d = (j3 / 1.0E9d) * ((org.telegram.messenger.i0) mp.u1(this.a).A7.l.b).a;
        org.telegram.messenger.r1.i().getClass();
        this.p1.setText(org.telegram.messenger.r1.g("USD", 2, (long) (d * 100.0d), false));
        int i7 = this.u1;
        int i10 = i7 & 2;
        cg.b bVar = cg.b.b;
        TextView textView = this.q1;
        if (i10 != 0) {
            org.telegram.messenger.f3.q(null, null, 2131749520, new Object[]{cg.a.j(j10, bVar).d()}, textView);
        } else if ((i7 & 1) != 0) {
            org.telegram.messenger.f3.q(null, null, 2131749519, new Object[]{cg.a.j(j11, bVar).d()}, textView);
        } else {
            textView.setText(gd.N0((this.v1 || this.y1) ? 2131749525 : 2131749526, null));
        }
        org.telegram.ui.ActionBar.u6.U(textView, this.u1 == 0 ? org.telegram.ui.ActionBar.n6.y6 : org.telegram.ui.ActionBar.n6.q7, this.J0);
        String a02 = gd.a0(null, null, this.v1 ? 2131749652 : 2131749522, cg.a.j(j3, bVar).b());
        hi.e eVar = this.r1;
        eVar.i(a02, true, true);
        if (j3 > 0 && this.u1 == 0 && (!this.v1 || j3 != this.w1)) {
            z10 = true;
        }
        eVar.setEnabled(z10);
        eVar.setClickable(z10);
        m10.n(eVar.animate(), z10 ? 1.0f : 0.6f, 180L);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new a3.f(this, 25), 50L);
    }
}
