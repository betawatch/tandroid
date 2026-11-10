package bi;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h1 extends org.telegram.ui.ActionBar.w2 {
    public final lb0 l1;
    public final EditTextBoldCursor m1;
    public final TextView n1;
    public final org.telegram.ui.Components.i6 o1;
    public final fi.d p1;
    public final org.telegram.ui.Components.i6 q1;
    public final org.telegram.ui.Cells.s8 r1;
    public final ImageView s1;
    public final ImageView t1;
    public final cg.a u1;
    public final cg.a v1;
    public final cg.a w1;
    public final cg.a x1;
    public cg.a y1;
    public int z1;

    public h1(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, cg.a aVar, ai.f1 f1Var) {
        super(1, context, h6Var, true);
        this.a = i7;
        this.P0 = true;
        this.D = true;
        org.telegram.messenger.p0 p0Var = qp.s1(i7).x7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.r.b).c, 10000000L);
        cg.b bVar = cg.b.b;
        this.w1 = cg.a.i(max, bVar);
        this.x1 = cg.a.i(((org.telegram.messenger.l0) p0Var.s.b).c, bVar);
        long j3 = ((org.telegram.messenger.j0) p0Var.p.b).c;
        cg.b bVar2 = cg.b.a;
        this.u1 = cg.a.g(j3, bVar2);
        this.v1 = cg.a.g(((org.telegram.messenger.j0) p0Var.q.b).c, bVar2);
        P(org.telegram.ui.ActionBar.m6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f10, c8.ha.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, false, false);
        this.o1 = i6Var;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i10, null);
        i6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        i6Var.setGravity(8388627);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(i6Var, c8.ha.q(-1, -1, 1.0f, qs.E1, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ha.l(1.0f, -1, -2));
        lb0 lb0Var = new lb0(context, null);
        this.l1 = lb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i10, null);
        editTextBoldCursor.requestFocus();
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        lb0Var.e(editTextBoldCursor);
        lb0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        lb0Var.setForceUseCenter2(true);
        int i11 = 3;
        editTextBoldCursor.setOnFocusChangeListener(new n(this, 3));
        lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
        linearLayout2.addView(lb0Var, c8.ha.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        lb0Var.addView(imageView, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.t1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        lb0Var.addView(imageView2, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(context, false, false, false);
        this.q1 = i6Var2;
        int i12 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i12, null);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i13 = 5;
        i6Var2.setGravity(5);
        lb0Var.addView(i6Var2, c8.ha.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i12, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.r1 = s8Var;
        s8Var.c.setLayoutParams(c8.ha.d(20, 20.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        s8Var.b(org.telegram.messenger.id.M0(2131746128, null), org.telegram.messenger.id.M0(2131746129, null), true, false);
        s8Var.setOnClickListener(new ah.d(this, i13));
        linearLayout2.addView(s8Var, c8.ha.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, c8.ha.r(-1, -2, 80));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.p1 = h;
        h.setOnClickListener(new r(2, this, f1Var));
        h.i(org.telegram.messenger.id.M0(2131746151, null), false, true);
        linearLayout3.addView(h, c8.ha.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            J0(cg.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            J0(cg.a.i(0L, bVar2), false, true, false);
        }
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, i11));
    }

    public final cg.a I0() {
        return this.y1.a == cg.b.b ? this.x1 : this.v1;
    }

    public final void J0(cg.a aVar, boolean z9, boolean z10, boolean z11) {
        long j3;
        cg.a aVar2;
        int i7;
        cg.a aVar3 = this.y1;
        int i10 = this.z1;
        this.z1 = 0;
        if (aVar != null) {
            this.y1 = aVar;
        } else {
            this.y1 = cg.a.i(0L, aVar3.a);
            this.z1 |= 1;
        }
        long j10 = I0().b;
        cg.a aVar4 = this.y1;
        if (j10 < aVar4.b) {
            this.z1 |= 4;
        }
        boolean k10 = aVar4.k();
        cg.a aVar5 = this.u1;
        cg.a aVar6 = this.w1;
        cg.b bVar = cg.b.b;
        if (k10) {
            j3 = 0;
        } else {
            cg.a aVar7 = this.y1;
            j3 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.z1 |= 2;
            }
        }
        boolean z12 = z10 || aVar3.a != this.y1.a;
        boolean z13 = z10 || aVar3.b != this.y1.b;
        boolean z14 = z10 || i10 != this.z1;
        lb0 lb0Var = this.l1;
        if (z14) {
            lb0Var.a((this.z1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        cg.b bVar2 = cg.b.a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.m1;
        if (z12) {
            cg.b bVar3 = this.y1.a;
            org.telegram.ui.Components.i6 i6Var = this.o1;
            if (bVar3 == bVar2) {
                i6Var.c(org.telegram.messenger.id.M0(2131746123, null), z11, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                i6Var.c(org.telegram.messenger.id.M0(2131746122, null), z11, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
            }
            this.r1.c.a(this.y1.a == bVar, z11);
            ImageView imageView = this.t1;
            ImageView imageView2 = this.s1;
            if (z11) {
                i7 = 2;
                aVar2 = aVar5;
                imageView2.animate().alpha(this.y1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.y1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.y1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.y1.a == bVar ? 1.0f : 0.0f).scaleX(this.y1.a == bVar ? 1.0f : 0.0f).scaleY(this.y1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                i7 = 2;
                imageView2.setAlpha(this.y1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.y1.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
            i7 = 2;
        }
        if (z12 || z14) {
            int i11 = this.z1;
            if ((i11 & 4) != 0) {
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131746125, I0().f()));
            } else if ((i11 & 2) != 0) {
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131746124, (this.y1.a == bVar ? aVar6 : aVar2).f()));
            } else {
                lb0Var.setText(org.telegram.messenger.id.M0(this.y1.a == bVar2 ? 2131746127 : 2131746126, null));
            }
        }
        if (z12 || z13 || z14) {
            boolean z15 = this.z1 == 0 && this.y1.b > j11;
            fi.d dVar = this.p1;
            if (dVar.c0 != z15) {
                dVar.setEnabled(z15);
                dVar.setClickable(z15);
                if (z11) {
                    org.telegram.messenger.camera.q.k(dVar.animate(), z15 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z15 ? 1.0f : 0.6f);
                }
            }
        }
        if (z12 || z13) {
            org.telegram.messenger.p0 p0Var = qp.s1(this.a).x7;
            cg.a aVar8 = this.y1;
            cg.b bVar4 = aVar8.a;
            long j12 = aVar8.b;
            TextView textView = this.n1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.n.b).c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.k5.r(null, null, 2131746132, new Object[]{cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.o.b).c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.y1.a == bVar ? ((org.telegram.messenger.i0) qp.s1(this.a).x7.l.b).a : qp.s1(this.a).c6 * 1.0E-5d;
            org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.y1.c() * d * 100.0d);
            i12.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, false));
            this.q1.c(sb2, z11, true);
        }
        if (z9 && z13) {
            String b10 = this.y1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new a3.f(this, 19), 50L);
    }
}
