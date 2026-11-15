package di;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v0 extends org.telegram.ui.ActionBar.u2 {
    public int A1;
    public final mb0 m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final org.telegram.ui.Components.h6 p1;
    public final hi.d q1;
    public final org.telegram.ui.Components.h6 r1;
    public final org.telegram.ui.Cells.r8 s1;
    public final ImageView t1;
    public final ImageView u1;
    public final cg.a v1;
    public final cg.a w1;
    public final cg.a x1;
    public final cg.a y1;
    public cg.a z1;

    public v0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, cg.a aVar, ai.v1 v1Var) {
        super(1, context, e6Var, true);
        this.a = i7;
        this.Q0 = true;
        this.E = true;
        org.telegram.messenger.p0 p0Var = np.s1(i7).y7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.r.b).c, 10000000L);
        cg.b bVar = cg.b.b;
        this.x1 = cg.a.i(max, bVar);
        this.y1 = cg.a.i(((org.telegram.messenger.l0) p0Var.s.b).c, bVar);
        long j3 = ((org.telegram.messenger.j0) p0Var.p.b).c;
        cg.b bVar2 = cg.b.a;
        this.v1 = cg.a.g(j3, bVar2);
        this.w1 = cg.a.g(((org.telegram.messenger.j0) p0Var.q.b).c, bVar2);
        Q(org.telegram.ui.ActionBar.j6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f10, c8.ja.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.p1 = h6Var;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i10, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        h6Var.setGravity(8388627);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(h6Var, c8.ja.q(-1, -1, 1.0f, ns.E1, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ja.l(1.0f, -1, -2));
        mb0 mb0Var = new mb0(context, null);
        this.m1 = mb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i10, null);
        editTextBoldCursor.requestFocus();
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        mb0Var.e(editTextBoldCursor);
        mb0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        mb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 4));
        mb0Var.addView(editTextBoldCursor, c8.ja.e(-1, -2, 48));
        linearLayout2.addView(mb0Var, c8.ja.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.t1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        mb0Var.addView(imageView, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.u1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        mb0Var.addView(imageView2, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.r1 = h6Var2;
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i11, null);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setGravity(5);
        mb0Var.addView(h6Var2, c8.ja.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.o1 = textView;
        org.telegram.ui.ActionBar.q6.U(textView, i11, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, c8.ja.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.s1 = r8Var;
        r8Var.c.setLayoutParams(c8.ja.d(20, 20.0f, (hd.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        r8Var.b(hd.M0(2131746128, null), hd.M0(2131746129, null), true, false);
        r8Var.setOnClickListener(new ah.d(this, 12));
        linearLayout2.addView(r8Var, c8.ja.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, c8.ja.r(-1, -2, 80));
        hi.d g10 = i20.g(24, context, e6Var, true);
        this.q1 = g10;
        g10.setOnClickListener(new ai.v2(9, this, v1Var));
        g10.i(hd.M0(2131746151, null), false, true);
        linearLayout3.addView(g10, c8.ja.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            J0(cg.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            J0(cg.a.i(0L, bVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 4));
    }

    public final cg.a I0() {
        return this.z1.a == cg.b.b ? this.y1 : this.w1;
    }

    public final void J0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        long j3;
        cg.a aVar2;
        int i7;
        cg.a aVar3 = this.z1;
        int i10 = this.A1;
        this.A1 = 0;
        if (aVar != null) {
            this.z1 = aVar;
        } else {
            this.z1 = cg.a.i(0L, aVar3.a);
            this.A1 |= 1;
        }
        long j10 = I0().b;
        cg.a aVar4 = this.z1;
        if (j10 < aVar4.b) {
            this.A1 |= 4;
        }
        boolean k10 = aVar4.k();
        cg.a aVar5 = this.v1;
        cg.a aVar6 = this.x1;
        cg.b bVar = cg.b.b;
        if (k10) {
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
        mb0 mb0Var = this.m1;
        if (z15) {
            mb0Var.a((this.A1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        cg.b bVar2 = cg.b.a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.n1;
        if (z13) {
            cg.b bVar3 = this.z1.a;
            org.telegram.ui.Components.h6 h6Var = this.p1;
            if (bVar3 == bVar2) {
                h6Var.c(hd.M0(2131746123, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                h6Var.c(hd.M0(2131746122, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
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
                mb0Var.setText(hd.a0(null, null, 2131746125, I0().f()));
            } else if ((i11 & 2) != 0) {
                mb0Var.setText(hd.a0(null, null, 2131746124, (this.z1.a == bVar ? aVar6 : aVar2).f()));
            } else {
                mb0Var.setText(hd.M0(this.z1.a == bVar2 ? 2131746127 : 2131746126, null));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.A1 == 0 && this.z1.b > j11;
            hi.d dVar = this.q1;
            if (dVar.d0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    i20.m(dVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            org.telegram.messenger.p0 p0Var = np.s1(this.a).y7;
            cg.a aVar8 = this.z1;
            cg.b bVar4 = aVar8.a;
            long j12 = aVar8.b;
            TextView textView = this.o1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.X2(hd.G((int) cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.n.b).c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.k5.q(null, null, 2131746132, new Object[]{cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.o.b).c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.z1.a == bVar ? ((org.telegram.messenger.i0) np.s1(this.a).y7.l.b).a : np.s1(this.a).d6 * 1.0E-5d;
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

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ch.w(this, 10), 50L);
    }
}
