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
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class e1 extends org.telegram.ui.ActionBar.v2 {
    public int A1;
    public boolean B1;
    public final wp[] C1;
    public final wp[] D1;
    public boolean E1;
    public final c i1;
    public final boolean j1;
    public final int k1;
    public final b30 l1;
    public final lb0 m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final v p1;
    public final fi.d q1;
    public final org.telegram.ui.Components.j6 r1;
    public final ImageView s1;
    public final ImageView t1;
    public final cg.a u1;
    public final cg.a v1;
    public final cg.a w1;
    public final cg.a x1;
    public cg.a y1;
    public long z1;

    public e1(final Context context, int i7, long j3, nj njVar, an anVar, final org.telegram.ui.ActionBar.f6 f6Var, int i10, c20 c20Var) {
        super(1, context, f6Var, true);
        boolean z9;
        this.z1 = -1L;
        this.C1 = new wp[1];
        this.D1 = new wp[1];
        this.k1 = i10;
        this.D = true;
        this.P0 = true;
        boolean z10 = org.telegram.messenger.t3.z(i7, 24, j3);
        this.j1 = z10;
        final int i11 = 0;
        boolean z11 = z10 || ea.y(i7, true).j();
        org.telegram.messenger.p0 p0Var = qp.s1(i7).x7;
        long j10 = ((org.telegram.messenger.l0) p0Var.g.b).c;
        cg.b bVar = cg.b.b;
        this.w1 = cg.a.i(j10, bVar);
        this.x1 = cg.a.i(((org.telegram.messenger.l0) p0Var.h.b).c, bVar);
        long j11 = ((org.telegram.messenger.j0) p0Var.d.b).c;
        cg.b bVar2 = cg.b.a;
        this.u1 = cg.a.g(j11, bVar2);
        this.v1 = cg.a.g(((org.telegram.messenger.j0) p0Var.e.b).c, bVar2);
        if (z10) {
            this.i1 = null;
        } else {
            c cVar = new c(i7, context, f6Var);
            this.i1 = cVar;
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
                            if (this.b.y1.a == cg.b.a) {
                                new uc(context, f6Var).show();
                                break;
                            }
                            break;
                        default:
                            e1 e1Var = this.b;
                            ((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(context, e1Var.z1, new a1.c(e1Var, 11), f6Var, 0).b).show();
                            break;
                    }
                }
            });
        }
        P(org.telegram.ui.ActionBar.k6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f10, c8.ha.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(org.telegram.messenger.id.M0(i10 == 0 ? 2131747078 : 2131747085, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, c8.ha.q(-1, -1, 1.0f, qs.E1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.k6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, f6Var, mode);
        c8.ka.a(imageView);
        boolean z12 = z11;
        imageView.setOnClickListener(new ah.d(this, 4));
        f10.addView(imageView, c8.ha.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        if (z12) {
            b30 b30Var = new b30(context, f6Var);
            this.l1 = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.id.M0(2131744380, null));
            arrayList.add(org.telegram.messenger.id.M0(2131744379, null));
            b30Var.b(arrayList, new w0(this, 1));
            linearLayout.addView(b30Var, c8.ha.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.l1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, c8.ha.l(1.0f, -1, -2));
        lb0 lb0Var = new lb0(context, null);
        this.m1 = lb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, null);
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
        this.s1 = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        lb0Var.addView(imageView2, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.t1 = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        lb0Var.addView(imageView3, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.r1 = j6Var;
        int i14 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i14, null);
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var.setGravity(5);
        lb0Var.addView(j6Var, c8.ha.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.o1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        v vVar = new v(context, 1);
        this.p1 = vVar;
        vVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        vVar.setCursorWidth(1.5f);
        vVar.setTextSize(1, 17.0f);
        vVar.setMaxLines(1);
        vVar.setBackground(null);
        vVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(vVar, i12, null);
        vVar.setFocusable(false);
        vVar.setClickable(false);
        vVar.setEnabled(false);
        lb0 lb0Var2 = new lb0(context, null);
        lb0Var2.setText(org.telegram.messenger.id.M0(2131747075, null));
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
                        if (this.b.y1.a == cg.b.a) {
                            new uc(context, f6Var).show();
                            break;
                        }
                        break;
                    default:
                        e1 e1Var = this.b;
                        ((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(context, e1Var.z1, new a1.c(e1Var, 11), f6Var, 0).b).show();
                        break;
                }
            }
        });
        f11.addView(lb0Var2, c8.ha.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView4, i13, f6Var, mode);
        lb0Var2.addView(imageView4, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747095, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.k5.q(null, null, 2131747094, new Object[]{Long.valueOf(qp.s1(i7).x7.i.M1(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, c8.ha.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ha.r(-1, -2, 80));
        fi.d dVar = new fi.d(context, f6Var, true);
        this.q1 = dVar;
        dVar.setOnClickListener(new d1(this, anVar, i7, context, f6Var, j3, c20Var));
        if (i10 == 1) {
            dVar.i(org.telegram.messenger.id.M0(2131747084, null), false, true);
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
        if (this.z1 != j12) {
            this.z1 = j12;
            vVar.setText(K0(j12));
        }
        J0(z9);
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 2));
    }

    public static String K0(long j3) {
        if (j3 <= 0) {
            return org.telegram.messenger.id.M0(2131747093, null);
        }
        String x10 = org.telegram.messenger.id.x(j3, true);
        if (x10.isEmpty()) {
            return x10;
        }
        return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
    }

    public final void I0() {
        boolean z9 = this.E1;
        c cVar = this.i1;
        boolean z10 = (z9 && !this.I && cVar != null && this.b.getY() > ((float) org.telegram.messenger.g0.L(32.0f))) || this.l1 == null;
        if (this.B1 != z10) {
            this.B1 = z10;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void J0(boolean z9) {
        boolean z10 = this.A1 == 0 && (this.y1.b >= 0 || this.z1 > 0);
        fi.d dVar = this.q1;
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
        return this.y1.a == cg.b.b ? this.x1 : this.v1;
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
        cg.a aVar2 = this.y1;
        int i10 = this.A1;
        this.A1 = 0;
        if (aVar != null) {
            this.y1 = aVar;
        } else {
            this.y1 = cg.a.i(0L, aVar2.a);
            this.A1 |= 1;
        }
        long j3 = L0().b;
        cg.a aVar3 = this.y1;
        if (j3 < aVar3.b) {
            this.A1 |= 4;
        }
        boolean k10 = aVar3.k();
        cg.a aVar4 = this.u1;
        cg.a aVar5 = this.w1;
        cg.b bVar = cg.b.b;
        if (!k10) {
            cg.a aVar6 = this.y1;
            if ((aVar6.a == bVar ? aVar5 : aVar4).b > aVar6.b) {
                this.A1 |= 2;
            }
        }
        boolean z13 = z10 || aVar2.a != this.y1.a;
        boolean z14 = z10 || aVar2.b != this.y1.b;
        boolean z15 = z10 || i10 != this.A1;
        lb0 lb0Var = this.m1;
        if (z15) {
            lb0Var.a((this.A1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        cg.b bVar2 = cg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.n1;
        if (z13) {
            b30 b30Var = this.l1;
            boolean z16 = false;
            if (b30Var != null) {
                b30Var.a(this.y1.a == bVar2 ? 0 : 1, z11);
            }
            cg.b bVar3 = this.y1.a;
            TextView textView = this.o1;
            if (bVar3 == bVar2) {
                textView.setText(org.telegram.messenger.id.M0(2131747081, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(org.telegram.messenger.id.M0(2131747080, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.t1;
            ImageView imageView2 = this.s1;
            if (z11) {
                i7 = 2;
                imageView2.animate().alpha(this.y1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.y1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.y1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.y1.a == bVar ? 1.0f : 0.0f).scaleX(this.y1.a == bVar ? 1.0f : 0.0f).scaleY(this.y1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                i7 = 2;
                imageView2.setAlpha(this.y1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.y1.a == bVar ? 1.0f : 0.0f);
            }
            c cVar = this.i1;
            z12 = z16;
            if (cVar != null) {
                cg.b bVar4 = this.y1.a;
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
            int i11 = this.A1;
            if ((i11 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[z12] = L0().f();
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131744421, objArr));
            } else if ((i11 & 2) != 0) {
                if (this.y1.a == bVar) {
                    aVar4 = aVar5;
                }
                String f10 = aVar4.f();
                Object[] objArr2 = new Object[1];
                objArr2[z12] = f10;
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131744420, objArr2));
            } else {
                lb0Var.setText(org.telegram.messenger.id.M0(this.y1.a == bVar2 ? 2131747077 : 2131747076, null));
            }
        }
        if (z13 || z14 || z15) {
            int i12 = this.k1;
            fi.d dVar = this.q1;
            if (i12 != 0) {
                dVar.i(org.telegram.messenger.id.M0(2131747084, null), z11, true);
            } else if (this.y1.k()) {
                dVar.i(org.telegram.messenger.id.M0(2131747083, null), z11, true);
            } else {
                cg.a aVar7 = this.y1;
                boolean z17 = aVar7.a == bVar ? true : z12;
                Object[] objArr3 = new Object[1];
                objArr3[z12] = z17 ? aVar7.b() : org.telegram.messenger.id.E(aVar7.a(), ',');
                dVar.i(dd.s1(dd.Y0(z17, org.telegram.messenger.id.a0(null, null, 2131747082, objArr3), z17 ? this.D1 : this.C1), z17), z11, true);
            }
            J0(z11);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.y1.a == bVar ? ((org.telegram.messenger.i0) qp.s1(this.a).x7.l.b).a : qp.s1(this.a).c6 * 1.0E-5d;
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.y1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, z12));
            this.r1.c(sb2, z11, true);
        }
        if (z9 && z14) {
            String b10 = this.y1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean X(float f10, float f11) {
        c cVar;
        if (!this.B1 || (cVar = this.i1) == null || f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void g0(float f10) {
        super.g0(f10);
        I0();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new a3.f(this, 18), 50L);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        this.E1 = true;
        I0();
    }
}
