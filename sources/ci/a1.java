package ci;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a1 extends org.telegram.ui.ActionBar.t2 {
    public final gb0 j1;
    public final EditTextBoldCursor k1;
    public final TextView l1;
    public final org.telegram.ui.Components.h6 m1;
    public final gi.d n1;
    public final org.telegram.ui.Components.h6 o1;
    public final org.telegram.ui.Cells.r8 p1;
    public final ImageView q1;
    public final ImageView r1;
    public final dg.a s1;
    public final dg.a t1;
    public final dg.a u1;
    public final dg.a v1;
    public dg.a w1;
    public int x1;

    public a1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, dg.a aVar, ai.o1 o1Var) {
        super(1, context, e6Var, true);
        this.a = i3;
        this.Q0 = true;
        this.E = true;
        org.telegram.messenger.p0 p0Var = hp.s1(i3).x7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.r.b).c, 10000000L);
        dg.b bVar = dg.b.b;
        this.u1 = dg.a.i(max, bVar);
        this.v1 = dg.a.i(((org.telegram.messenger.l0) p0Var.s.b).c, bVar);
        long j10 = ((org.telegram.messenger.j0) p0Var.p.b).c;
        dg.b bVar2 = dg.b.a;
        this.s1 = dg.a.g(j10, bVar2);
        this.t1 = dg.a.g(((org.telegram.messenger.j0) p0Var.q.b).c, bVar2);
        P(org.telegram.ui.ActionBar.k6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f10, mf.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.m1 = h6Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        h6Var.setGravity(8388627);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(h6Var, mf.q(-1, -1, 1.0f, hs.E1, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, mf.l(1.0f, -1, -2));
        gb0 gb0Var = new gb0(context, null);
        this.j1 = gb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.k1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i10, null);
        editTextBoldCursor.requestFocus();
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        gb0Var.e(editTextBoldCursor);
        gb0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        gb0Var.setForceUseCenter2(true);
        int i11 = 3;
        editTextBoldCursor.setOnFocusChangeListener(new m(this, 3));
        gb0Var.addView(editTextBoldCursor, mf.e(-1, -2, 48));
        linearLayout2.addView(gb0Var, mf.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.q1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        gb0Var.addView(imageView, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.r1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        gb0Var.addView(imageView2, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.o1 = h6Var2;
        int i12 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i12, null);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setGravity(5);
        gb0Var.addView(h6Var2, mf.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.l1 = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, mf.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.p1 = r8Var;
        r8Var.c.setLayoutParams(mf.d(20, 20.0f, (bd.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        r8Var.b(bd.M0(2131746138, null), bd.M0(2131746139, null), true, false);
        r8Var.setOnClickListener(new ai.b(this, 8));
        linearLayout2.addView(r8Var, mf.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, mf.r(-1, -2, 80));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.n1 = h;
        h.setOnClickListener(new ai.d(7, this, o1Var));
        h.i(bd.M0(2131746161, null), false, true);
        linearLayout3.addView(h, mf.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            J0(dg.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            J0(dg.a.i(0L, bVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new bh.h(this, i11));
    }

    public final dg.a I0() {
        return this.w1.a == dg.b.b ? this.v1 : this.t1;
    }

    public final void J0(dg.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        dg.a aVar2;
        int i3;
        dg.a aVar3 = this.w1;
        int i10 = this.x1;
        this.x1 = 0;
        if (aVar != null) {
            this.w1 = aVar;
        } else {
            this.w1 = dg.a.i(0L, aVar3.a);
            this.x1 |= 1;
        }
        long j11 = I0().b;
        dg.a aVar4 = this.w1;
        if (j11 < aVar4.b) {
            this.x1 |= 4;
        }
        boolean k10 = aVar4.k();
        dg.a aVar5 = this.s1;
        dg.a aVar6 = this.u1;
        dg.b bVar = dg.b.b;
        if (k10) {
            j10 = 0;
        } else {
            dg.a aVar7 = this.w1;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.x1 |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.w1.a;
        boolean z14 = z11 || aVar3.b != this.w1.b;
        boolean z15 = z11 || i10 != this.x1;
        gb0 gb0Var = this.j1;
        if (z15) {
            gb0Var.a((this.x1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        dg.b bVar2 = dg.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.k1;
        if (z13) {
            dg.b bVar3 = this.w1.a;
            org.telegram.ui.Components.h6 h6Var = this.m1;
            if (bVar3 == bVar2) {
                h6Var.c(bd.M0(2131746133, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                h6Var.c(bd.M0(2131746132, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
            }
            this.p1.c.a(this.w1.a == bVar, z12);
            ImageView imageView = this.r1;
            ImageView imageView2 = this.q1;
            if (z12) {
                i3 = 2;
                aVar2 = aVar5;
                imageView2.animate().alpha(this.w1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.w1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.w1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.w1.a == bVar ? 1.0f : 0.0f).scaleX(this.w1.a == bVar ? 1.0f : 0.0f).scaleY(this.w1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                i3 = 2;
                imageView2.setAlpha(this.w1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.w1.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
            i3 = 2;
        }
        if (z13 || z15) {
            int i11 = this.x1;
            if ((i11 & 4) != 0) {
                gb0Var.setText(bd.a0(null, null, 2131746135, I0().f()));
            } else if ((i11 & 2) != 0) {
                gb0Var.setText(bd.a0(null, null, 2131746134, (this.w1.a == bVar ? aVar6 : aVar2).f()));
            } else {
                gb0Var.setText(bd.M0(this.w1.a == bVar2 ? 2131746137 : 2131746136, null));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.x1 == 0 && this.w1.b > j12;
            gi.d dVar = this.n1;
            if (dVar.d0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    org.telegram.messenger.camera.q.k(dVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            org.telegram.messenger.p0 p0Var = hp.s1(this.a).x7;
            dg.a aVar8 = this.w1;
            dg.b bVar4 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.l1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.X2(bd.G((int) dg.a.i((j13 * ((org.telegram.messenger.j0) p0Var.n.b).c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.k5.r(null, null, 2131746142, new Object[]{dg.a.i((j13 * ((org.telegram.messenger.j0) p0Var.o.b).c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.w1.a == bVar ? ((org.telegram.messenger.i0) hp.s1(this.a).x7.l.b).a : hp.s1(this.a).c6 * 1.0E-5d;
            org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
            long c2 = (long) (this.w1.c() * d * 100.0d);
            i12.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i3, c2, false));
            this.o1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.w1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ai.s(this, 29), 50L);
    }
}
