package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.nj;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e1 extends org.telegram.ui.ActionBar.w2 {
    public final cg.a A1;
    public cg.a B1;
    public long C1;
    public int D1;
    public boolean E1;
    public final wp[] F1;
    public final wp[] G1;
    public boolean H1;
    public final c l1;
    public final boolean m1;
    public final int n1;
    public final b30 o1;
    public final lb0 p1;
    public final EditTextBoldCursor q1;
    public final TextView r1;
    public final v s1;
    public final fi.d t1;
    public final org.telegram.ui.Components.i6 u1;
    public final ImageView v1;
    public final ImageView w1;
    public final cg.a x1;
    public final cg.a y1;
    public final cg.a z1;

    public e1(final Context context, int i7, long j3, nj njVar, cn cnVar, final org.telegram.ui.ActionBar.h6 h6Var, int i10, c20 c20Var) {
        super(1, context, h6Var, true);
        boolean z9;
        this.C1 = -1L;
        this.F1 = new wp[1];
        this.G1 = new wp[1];
        this.n1 = i10;
        this.D = true;
        this.P0 = true;
        boolean z10 = org.telegram.messenger.t3.z(i7, 24, j3);
        this.m1 = z10;
        final int i11 = 0;
        boolean z11 = z10 || ea.y(i7, true).j();
        org.telegram.messenger.p0 p0Var = qp.s1(i7).x7;
        long j10 = ((org.telegram.messenger.l0) p0Var.g.b).c;
        cg.b bVar = cg.b.b;
        this.z1 = cg.a.i(j10, bVar);
        this.A1 = cg.a.i(((org.telegram.messenger.l0) p0Var.h.b).c, bVar);
        long j11 = ((org.telegram.messenger.j0) p0Var.d.b).c;
        cg.b bVar2 = cg.b.a;
        this.x1 = cg.a.g(j11, bVar2);
        this.y1 = cg.a.g(((org.telegram.messenger.j0) p0Var.e.b).c, bVar2);
        if (z10) {
            this.l1 = null;
        } else {
            c cVar = new c(i7, context, h6Var);
            this.l1 = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.c.addView(cVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            c8.ka.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.c1
                public final /* synthetic */ e1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            if (this.b.B1.a == cg.b.a) {
                                new uc(context, h6Var).show();
                                break;
                            }
                            break;
                        default:
                            e1 e1Var = this.b;
                            ((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.u4.Q(context, e1Var.C1, new a1.c(e1Var, 11), h6Var, 0).b).show();
                            break;
                    }
                }
            });
        }
        P(org.telegram.ui.ActionBar.m6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f10, c8.ha.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(org.telegram.messenger.id.M0(i10 == 0 ? 2131747077 : 2131747084, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, c8.ha.q(-1, -1, 1.0f, qs.E1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.m6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i13, h6Var, mode);
        c8.ka.a(imageView);
        boolean z12 = z11;
        imageView.setOnClickListener(new ah.d(this, 4));
        f10.addView(imageView, c8.ha.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.q1 = editTextBoldCursor;
        if (z12) {
            b30 b30Var = new b30(context, h6Var);
            this.o1 = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.id.M0(2131744377, null));
            arrayList.add(org.telegram.messenger.id.M0(2131744376, null));
            b30Var.b(arrayList, new w0(this, 1));
            linearLayout.addView(b30Var, c8.ha.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.o1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, c8.ha.l(1.0f, -1, -2));
        lb0 lb0Var = new lb0(context, null);
        this.p1 = lb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        lb0Var.e(editTextBoldCursor);
        cg.a aVar = njVar.a;
        lb0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        lb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new n(this, 2));
        lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
        f11.addView(lb0Var, c8.ha.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.v1 = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        lb0Var.addView(imageView2, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.w1 = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        lb0Var.addView(imageView3, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, false, false);
        this.u1 = i6Var;
        int i14 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i14, null);
        i6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        i6Var.setGravity(5);
        lb0Var.addView(i6Var, c8.ha.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r1 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        v vVar = new v(context, 1);
        this.s1 = vVar;
        vVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        vVar.setCursorWidth(1.5f);
        vVar.setTextSize(1, 17.0f);
        vVar.setMaxLines(1);
        vVar.setBackground(null);
        vVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(vVar, i12, null);
        vVar.setFocusable(false);
        vVar.setClickable(false);
        vVar.setEnabled(false);
        lb0 lb0Var2 = new lb0(context, null);
        lb0Var2.setText(org.telegram.messenger.id.M0(2131747074, null));
        lb0Var2.e(vVar);
        lb0Var2.addView(vVar, c8.ha.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.ka.b(lb0Var2, 0.02f, 1.2f);
        final int i15 = 1;
        lb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.c1
            public final /* synthetic */ e1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        if (this.b.B1.a == cg.b.a) {
                            new uc(context, h6Var).show();
                            break;
                        }
                        break;
                    default:
                        e1 e1Var = this.b;
                        ((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.u4.Q(context, e1Var.C1, new a1.c(e1Var, 11), h6Var, 0).b).show();
                        break;
                }
            }
        });
        f11.addView(lb0Var2, c8.ha.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.t6.s(imageView4, i13, h6Var, mode);
        lb0Var2.addView(imageView4, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747094, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.k5.q(null, null, 2131747093, new Object[]{Long.valueOf(qp.s1(i7).x7.i.M1(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, c8.ha.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ha.r(-1, -2, 80));
        fi.d dVar = new fi.d(context, h6Var, true);
        this.t1 = dVar;
        dVar.setOnClickListener(new d1(this, cnVar, i7, context, h6Var, j3, c20Var));
        if (i10 == 1) {
            dVar.i(org.telegram.messenger.id.M0(2131747083, null), false, true);
        }
        linearLayout2.addView(dVar, c8.ha.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            z9 = false;
            M0(cg.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            z9 = false;
            M0(cg.a.i(0L, bVar2), false, true, false);
        }
        long j12 = njVar.b;
        if (this.C1 != j12) {
            this.C1 = j12;
            vVar.setText(K0(j12));
        }
        J0(z9);
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 2));
    }

    public static String K0(long j3) {
        if (j3 <= 0) {
            return org.telegram.messenger.id.M0(2131747092, null);
        }
        String x10 = org.telegram.messenger.id.x(j3, true);
        if (x10.isEmpty()) {
            return x10;
        }
        return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
    }

    public final void I0() {
        boolean z9 = this.H1;
        c cVar = this.l1;
        boolean z10 = (z9 && !this.I && cVar != null && this.b.getY() > ((float) org.telegram.messenger.g0.L(32.0f))) || this.o1 == null;
        if (this.E1 != z10) {
            this.E1 = z10;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void J0(boolean z9) {
        boolean z10 = this.D1 == 0 && (this.B1.b >= 0 || this.C1 > 0);
        fi.d dVar = this.t1;
        if (dVar.c0 != z10) {
            dVar.setEnabled(z10);
            dVar.setClickable(z10);
            if (z9) {
                org.telegram.messenger.camera.q.k(dVar.animate(), z10 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z10 ? 1.0f : 0.6f);
            }
        }
    }

    public final cg.a L0() {
        return this.B1.a == cg.b.b ? this.A1 : this.y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void M0(cg.a aVar, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        cg.a aVar2 = this.B1;
        int i10 = this.D1;
        this.D1 = 0;
        if (aVar != null) {
            this.B1 = aVar;
        } else {
            this.B1 = cg.a.i(0L, aVar2.a);
            this.D1 |= 1;
        }
        long j3 = L0().b;
        cg.a aVar3 = this.B1;
        if (j3 < aVar3.b) {
            this.D1 |= 4;
        }
        boolean k10 = aVar3.k();
        cg.a aVar4 = this.x1;
        cg.a aVar5 = this.z1;
        cg.b bVar = cg.b.b;
        if (!k10) {
            cg.a aVar6 = this.B1;
            if ((aVar6.a == bVar ? aVar5 : aVar4).b > aVar6.b) {
                this.D1 |= 2;
            }
        }
        boolean z13 = z10 || aVar2.a != this.B1.a;
        boolean z14 = z10 || aVar2.b != this.B1.b;
        boolean z15 = z10 || i10 != this.D1;
        lb0 lb0Var = this.p1;
        if (z15) {
            lb0Var.a((this.D1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        cg.b bVar2 = cg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.q1;
        if (z13) {
            b30 b30Var = this.o1;
            boolean z16 = false;
            if (b30Var != null) {
                b30Var.a(this.B1.a == bVar2 ? 0 : 1, z11);
            }
            cg.b bVar3 = this.B1.a;
            TextView textView = this.r1;
            if (bVar3 == bVar2) {
                textView.setText(org.telegram.messenger.id.M0(2131747080, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(org.telegram.messenger.id.M0(2131747079, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.w1;
            ImageView imageView2 = this.v1;
            if (z11) {
                i7 = 2;
                imageView2.animate().alpha(this.B1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.B1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.B1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.B1.a == bVar ? 1.0f : 0.0f).scaleX(this.B1.a == bVar ? 1.0f : 0.0f).scaleY(this.B1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                i7 = 2;
                imageView2.setAlpha(this.B1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.B1.a == bVar ? 1.0f : 0.0f);
            }
            c cVar = this.l1;
            z12 = z16;
            if (cVar != null) {
                cg.b bVar4 = this.B1.a;
                z12 = z16;
                if (cVar.e != bVar4) {
                    cVar.e = bVar4;
                    cVar.a();
                    z12 = z16;
                }
            }
        } else {
            z12 = 0;
            i7 = 2;
        }
        if (z13 || z15) {
            int i11 = this.D1;
            if ((i11 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[z12] = L0().f();
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131744418, objArr));
            } else if ((i11 & 2) != 0) {
                if (this.B1.a == bVar) {
                    aVar4 = aVar5;
                }
                String f10 = aVar4.f();
                Object[] objArr2 = new Object[1];
                objArr2[z12] = f10;
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131744417, objArr2));
            } else {
                lb0Var.setText(org.telegram.messenger.id.M0(this.B1.a == bVar2 ? 2131747076 : 2131747075, null));
            }
        }
        if (z13 || z14 || z15) {
            int i12 = this.n1;
            fi.d dVar = this.t1;
            if (i12 != 0) {
                dVar.i(org.telegram.messenger.id.M0(2131747083, null), z11, true);
            } else if (this.B1.k()) {
                dVar.i(org.telegram.messenger.id.M0(2131747082, null), z11, true);
            } else {
                cg.a aVar7 = this.B1;
                boolean z17 = aVar7.a == bVar ? true : z12;
                Object[] objArr3 = new Object[1];
                objArr3[z12] = z17 ? aVar7.b() : org.telegram.messenger.id.E(aVar7.a(), ',');
                dVar.i(dd.s1(dd.Y0(z17, org.telegram.messenger.id.a0(null, null, 2131747081, objArr3), z17 ? this.G1 : this.F1), z17), z11, true);
            }
            J0(z11);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.B1.a == bVar ? ((org.telegram.messenger.i0) qp.s1(this.a).x7.l.b).a : qp.s1(this.a).c6 * 1.0E-5d;
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.B1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, z12));
            this.u1.c(sb2, z11, true);
        }
        if (z9 && z14) {
            String b10 = this.B1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean X(float f10, float f11) {
        c cVar;
        if (!this.E1 || (cVar = this.l1) == null || f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void g0(float f10) {
        super.g0(f10);
        I0();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new a3.f(this, 18), 50L);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.H1 = true;
        I0();
    }
}
