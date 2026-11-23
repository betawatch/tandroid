package di;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u0 extends org.telegram.ui.ActionBar.w2 {
    public int A1;
    public final yb0 m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final org.telegram.ui.Components.o6 p1;
    public final hi.e q1;
    public final org.telegram.ui.Components.o6 r1;
    public final org.telegram.ui.Cells.t8 s1;
    public final ImageView t1;
    public final ImageView u1;
    public final cg.a v1;
    public final cg.a w1;
    public final cg.a x1;
    public final cg.a y1;
    public cg.a z1;

    public u0(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, cg.a aVar, ai.y1 y1Var) {
        super(1, context, h6Var, true);
        this.a = i7;
        this.Q0 = true;
        this.E = true;
        org.telegram.messenger.p0 p0Var = np.u1(i7).A7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.r.b).c, 10000000L);
        cg.b bVar = cg.b.b;
        this.x1 = cg.a.j(max, bVar);
        this.y1 = cg.a.j(((org.telegram.messenger.l0) p0Var.s.b).c, bVar);
        long j3 = ((org.telegram.messenger.j0) p0Var.p.b).c;
        cg.b bVar2 = cg.b.a;
        this.v1 = cg.a.h(j3, bVar2);
        this.w1 = cg.a.h(((org.telegram.messenger.j0) p0Var.q.b).c, bVar2);
        Q(org.telegram.ui.ActionBar.m6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        linearLayout.addView(g10, c8.ma.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.p1 = o6Var;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i10, null);
        o6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        o6Var.setGravity(8388627);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(o6Var, c8.ma.q(-1, -1, 1.0f, ls.E1, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ma.l(1.0f, -1, -2));
        yb0 yb0Var = new yb0(context, null);
        this.m1 = yb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i10, null);
        editTextBoldCursor.requestFocus();
        yb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        yb0Var.e(editTextBoldCursor);
        yb0Var.b(1.0f, aVar != null && !aVar.l() ? 1.0f : 0.0f, false);
        yb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 3));
        yb0Var.addView(editTextBoldCursor, c8.ma.e(-1, -2, 48));
        linearLayout2.addView(yb0Var, c8.ma.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.t1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        yb0Var.addView(imageView, c8.ma.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.u1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        yb0Var.addView(imageView2, c8.ma.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.r1 = o6Var2;
        int i11 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i11, null);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i12 = 5;
        o6Var2.setGravity(5);
        yb0Var.addView(o6Var2, c8.ma.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.o1 = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, c8.ma.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.s1 = t8Var;
        t8Var.c.setLayoutParams(c8.ma.d(20, 20.0f, (hd.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        t8Var.b(hd.N0(2131745932, null), hd.N0(2131745933, null), true, false);
        t8Var.setOnClickListener(new ah.d(this, 13));
        linearLayout2.addView(t8Var, c8.ma.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, c8.ma.r(-1, -2, 80));
        hi.e g11 = o10.g(24, context, h6Var, true);
        this.q1 = g11;
        g11.setOnClickListener(new ai.y2(10, this, y1Var));
        g11.i(hd.N0(2131745955, null), false, true);
        linearLayout3.addView(g11, c8.ma.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            K0(cg.a.j(aVar.b, aVar.a), !aVar.l(), true, false);
        } else {
            K0(cg.a.j(0L, bVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, i12));
    }

    public final cg.a J0() {
        return this.z1.a == cg.b.b ? this.y1 : this.w1;
    }

    public final void K0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        long j3;
        cg.a aVar2;
        int i7;
        cg.a aVar3 = this.z1;
        int i10 = this.A1;
        this.A1 = 0;
        if (aVar != null) {
            this.z1 = aVar;
        } else {
            this.z1 = cg.a.j(0L, aVar3.a);
            this.A1 |= 1;
        }
        long j10 = J0().b;
        cg.a aVar4 = this.z1;
        if (j10 < aVar4.b) {
            this.A1 |= 4;
        }
        boolean l10 = aVar4.l();
        cg.a aVar5 = this.v1;
        cg.a aVar6 = this.x1;
        cg.b bVar = cg.b.b;
        if (l10) {
            j3 = 0;
        } else {
            cg.a aVar7 = this.z1;
            j3 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.A1 |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.z1.a;
        boolean z14 = z11 || aVar3.b != this.z1.b;
        boolean z15 = z11 || i10 != this.A1;
        yb0 yb0Var = this.m1;
        if (z15) {
            yb0Var.a((this.A1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        cg.b bVar2 = cg.b.a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.n1;
        if (z13) {
            cg.b bVar3 = this.z1.a;
            org.telegram.ui.Components.o6 o6Var = this.p1;
            if (bVar3 == bVar2) {
                o6Var.c(hd.N0(2131745927, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(J0().a()).length())});
            } else if (bVar3 == bVar) {
                o6Var.c(hd.N0(2131745926, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(J0().a()).length() + 3)});
            }
            this.s1.c.a(this.z1.a == bVar, z12);
            ImageView imageView = this.u1;
            ImageView imageView2 = this.t1;
            if (z12) {
                i7 = 2;
                aVar2 = aVar5;
                imageView2.animate().alpha(this.z1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.z1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.z1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.z1.a == bVar ? 1.0f : 0.0f).scaleX(this.z1.a == bVar ? 1.0f : 0.0f).scaleY(this.z1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                i7 = 2;
                imageView2.setAlpha(this.z1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.z1.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
            i7 = 2;
        }
        if (z13 || z15) {
            int i11 = this.A1;
            if ((i11 & 4) != 0) {
                yb0Var.setText(hd.a0(null, null, 2131745929, J0().g()));
            } else if ((i11 & 2) != 0) {
                yb0Var.setText(hd.a0(null, null, 2131745928, (this.z1.a == bVar ? aVar6 : aVar2).g()));
            } else {
                yb0Var.setText(hd.N0(this.z1.a == bVar2 ? 2131745931 : 2131745930, null));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.A1 == 0 && this.z1.b > j11;
            hi.e eVar = this.q1;
            if (eVar.e0 != z16) {
                eVar.setEnabled(z16);
                eVar.setClickable(z16);
                if (z12) {
                    o10.n(eVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    eVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            org.telegram.messenger.p0 p0Var = np.u1(this.a).A7;
            cg.a aVar8 = this.z1;
            cg.b bVar4 = aVar8.a;
            long j12 = aVar8.b;
            TextView textView = this.o1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.W2(hd.G((int) cg.a.j((j12 * ((org.telegram.messenger.j0) p0Var.n.b).c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.f3.q(null, null, 2131745936, new Object[]{cg.a.j((j12 * ((org.telegram.messenger.j0) p0Var.o.b).c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.z1.a == bVar ? ((org.telegram.messenger.i0) np.u1(this.a).A7.l.b).a : np.u1(this.a).f6 * 1.0E-5d;
            org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.z1.c() * d * 100.0d);
            i12.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, false));
            this.r1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.z1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new ca.r(this, 14), 50L);
    }
}
