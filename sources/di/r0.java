package di;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.kj;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r0 extends org.telegram.ui.ActionBar.w2 {
    public final cg.a A1;
    public final cg.a B1;
    public cg.a C1;
    public long D1;
    public int E1;
    public boolean F1;
    public final kq[] G1;
    public final kq[] H1;
    public boolean I1;
    public final b m1;
    public final boolean n1;
    public final int o1;
    public final m30 p1;
    public final vb0 q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final q t1;
    public final hi.e u1;
    public final org.telegram.ui.Components.n6 v1;
    public final ImageView w1;
    public final ImageView x1;
    public final cg.a y1;
    public final cg.a z1;

    public r0(final Context context, int i7, long j3, kj kjVar, bn bnVar, final org.telegram.ui.ActionBar.i6 i6Var, int i10, w10 w10Var) {
        super(1, context, i6Var, true);
        boolean z10;
        this.D1 = -1L;
        this.G1 = new kq[1];
        this.H1 = new kq[1];
        this.o1 = i10;
        this.E = true;
        this.Q0 = true;
        boolean z11 = org.telegram.messenger.v3.z(i7, 24, j3);
        this.n1 = z11;
        final int i11 = 0;
        boolean z12 = z11 || y8.y(i7, true).j();
        org.telegram.messenger.p0 p0Var = mp.u1(i7).A7;
        long j10 = ((org.telegram.messenger.l0) p0Var.g.b).c;
        cg.b bVar = cg.b.b;
        this.A1 = cg.a.j(j10, bVar);
        this.B1 = cg.a.j(((org.telegram.messenger.l0) p0Var.h.b).c, bVar);
        long j11 = ((org.telegram.messenger.j0) p0Var.d.b).c;
        cg.b bVar2 = cg.b.a;
        this.y1 = cg.a.h(j11, bVar2);
        this.z1 = cg.a.h(((org.telegram.messenger.j0) p0Var.e.b).c, bVar2);
        if (z11) {
            this.m1 = null;
        } else {
            b bVar3 = new b(i7, context, i6Var);
            this.m1 = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.c.addView(bVar3, c8.na.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            c8.sa.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) { // from class: di.p0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            if (this.b.C1.a == cg.b.a) {
                                new gb(context, i6Var).show();
                                break;
                            }
                            break;
                        default:
                            r0 r0Var = this.b;
                            org.telegram.ui.Components.b5.Q(context, r0Var.D1, new a1.c(r0Var, 24), i6Var, 0).D0();
                            break;
                    }
                }
            });
        }
        Q(org.telegram.ui.ActionBar.n6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        linearLayout.addView(g10, c8.na.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(gd.N0(i10 == 0 ? 2131746883 : 2131746890, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g10.addView(textView, c8.na.q(-1, -1, 1.0f, ks.E1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.n6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView, i13, i6Var, mode);
        c8.sa.a(imageView);
        boolean z13 = z12;
        imageView.setOnClickListener(new ah.d(this, 12));
        g10.addView(imageView, c8.na.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.r1 = editTextBoldCursor;
        if (z13) {
            m30 m30Var = new m30(context, i6Var);
            this.p1 = m30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(gd.N0(2131744132, null));
            arrayList.add(gd.N0(2131744131, null));
            m30Var.b(arrayList, new k0(this, 1));
            linearLayout.addView(m30Var, c8.na.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.p1 = null;
        }
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
        linearLayout.addView(g11, c8.na.l(1.0f, -1, -2));
        vb0 vb0Var = new vb0(context, null);
        this.q1 = vb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        vb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        vb0Var.e(editTextBoldCursor);
        cg.a aVar = kjVar.a;
        vb0Var.b(1.0f, aVar != null && !aVar.l() ? 1.0f : 0.0f, false);
        vb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 2));
        vb0Var.addView(editTextBoldCursor, c8.na.e(-1, -2, 48));
        g11.addView(vb0Var, c8.na.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w1 = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        vb0Var.addView(imageView2, c8.na.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x1 = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        vb0Var.addView(imageView3, c8.na.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.v1 = n6Var;
        int i14 = org.telegram.ui.ActionBar.n6.y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i14, null);
        n6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var.setGravity(5);
        vb0Var.addView(n6Var, c8.na.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.s1 = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        g11.addView(textView2, c8.na.t(-1, -2, 55, 33, 4, 33, 0));
        q qVar = new q(context, 1);
        this.t1 = qVar;
        qVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        qVar.setCursorWidth(1.5f);
        qVar.setTextSize(1, 17.0f);
        qVar.setMaxLines(1);
        qVar.setBackground(null);
        qVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.u6.U(qVar, i12, null);
        qVar.setFocusable(false);
        qVar.setClickable(false);
        qVar.setEnabled(false);
        vb0 vb0Var2 = new vb0(context, null);
        vb0Var2.setText(gd.N0(2131746880, null));
        vb0Var2.e(qVar);
        vb0Var2.addView(qVar, c8.na.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.sa.b(vb0Var2, 0.02f, 1.2f);
        final int i15 = 1;
        vb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: di.p0
            public final /* synthetic */ r0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        if (this.b.C1.a == cg.b.a) {
                            new gb(context, i6Var).show();
                            break;
                        }
                        break;
                    default:
                        r0 r0Var = this.b;
                        org.telegram.ui.Components.b5.Q(context, r0Var.D1, new a1.c(r0Var, 24), i6Var, 0).D0();
                        break;
                }
            }
        });
        g11.addView(vb0Var2, c8.na.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.u6.s(imageView4, i13, i6Var, mode);
        vb0Var2.addView(imageView4, c8.na.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.N0(2131746900, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.f3.p(null, null, 2131746899, new Object[]{Long.valueOf(mp.u1(i7).A7.i.l0(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        g11.addView(textView3, c8.na.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.na.r(-1, -2, 80));
        hi.e eVar = new hi.e(context, i6Var, true);
        this.u1 = eVar;
        eVar.setOnClickListener(new q0(this, bnVar, i7, context, i6Var, j3, w10Var));
        if (i10 == 1) {
            eVar.i(gd.N0(2131746889, null), false, true);
        }
        linearLayout2.addView(eVar, c8.na.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            z10 = false;
            N0(cg.a.j(aVar.b, aVar.a), !aVar.l(), true, false);
        } else {
            z10 = false;
            N0(cg.a.j(0L, bVar2), false, true, false);
        }
        long j12 = kjVar.b;
        if (this.D1 != j12) {
            this.D1 = j12;
            qVar.setText(L0(j12));
        }
        K0(z10);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 4));
    }

    public static String L0(long j3) {
        if (j3 <= 0) {
            return gd.N0(2131746898, null);
        }
        String x10 = gd.x(j3, true);
        if (x10.isEmpty()) {
            return x10;
        }
        return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
    }

    public final void J0() {
        boolean z10 = this.I1;
        b bVar = this.m1;
        boolean z11 = (z10 && !this.J && bVar != null && this.b.getY() > ((float) org.telegram.messenger.g0.L(32.0f))) || this.p1 == null;
        if (this.F1 != z11) {
            this.F1 = z11;
            if (bVar != null) {
                bVar.setEnabled(z11);
                bVar.setClickable(z11);
                m10.n(bVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void K0(boolean z10) {
        boolean z11 = this.E1 == 0 && (this.C1.b >= 0 || this.D1 > 0);
        hi.e eVar = this.u1;
        if (eVar.e0 != z11) {
            eVar.setEnabled(z11);
            eVar.setClickable(z11);
            if (z10) {
                m10.n(eVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                eVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    public final cg.a M0() {
        return this.C1.a == cg.b.b ? this.B1 : this.z1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void N0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i7;
        cg.a aVar2 = this.C1;
        int i10 = this.E1;
        this.E1 = 0;
        if (aVar != null) {
            this.C1 = aVar;
        } else {
            this.C1 = cg.a.j(0L, aVar2.a);
            this.E1 |= 1;
        }
        long j3 = M0().b;
        cg.a aVar3 = this.C1;
        if (j3 < aVar3.b) {
            this.E1 |= 4;
        }
        boolean l10 = aVar3.l();
        cg.a aVar4 = this.y1;
        cg.a aVar5 = this.A1;
        cg.b bVar = cg.b.b;
        if (!l10) {
            cg.a aVar6 = this.C1;
            if ((aVar6.a == bVar ? aVar5 : aVar4).b > aVar6.b) {
                this.E1 |= 2;
            }
        }
        boolean z14 = z11 || aVar2.a != this.C1.a;
        boolean z15 = z11 || aVar2.b != this.C1.b;
        boolean z16 = z11 || i10 != this.E1;
        vb0 vb0Var = this.q1;
        if (z16) {
            vb0Var.a((this.E1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        cg.b bVar2 = cg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.r1;
        if (z14) {
            m30 m30Var = this.p1;
            boolean z17 = false;
            if (m30Var != null) {
                m30Var.a(this.C1.a == bVar2 ? 0 : 1, z12);
            }
            cg.b bVar3 = this.C1.a;
            TextView textView = this.s1;
            if (bVar3 == bVar2) {
                textView.setText(gd.N0(2131746886, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(M0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(gd.N0(2131746885, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(M0().a()).length() + 3)});
            }
            ImageView imageView = this.x1;
            ImageView imageView2 = this.w1;
            if (z12) {
                i7 = 2;
                imageView2.animate().alpha(this.C1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.C1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.C1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.C1.a == bVar ? 1.0f : 0.0f).scaleX(this.C1.a == bVar ? 1.0f : 0.0f).scaleY(this.C1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                i7 = 2;
                imageView2.setAlpha(this.C1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.C1.a == bVar ? 1.0f : 0.0f);
            }
            b bVar4 = this.m1;
            z13 = z17;
            if (bVar4 != null) {
                cg.b bVar5 = this.C1.a;
                z13 = z17;
                if (bVar4.e != bVar5) {
                    bVar4.e = bVar5;
                    bVar4.b();
                    z13 = z17;
                }
            }
        } else {
            z13 = 0;
            i7 = 2;
        }
        if (z14 || z16) {
            int i11 = this.E1;
            if ((i11 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[z13] = M0().g();
                vb0Var.setText(gd.a0(null, null, 2131744173, objArr));
            } else if ((i11 & 2) != 0) {
                if (this.C1.a == bVar) {
                    aVar4 = aVar5;
                }
                String g10 = aVar4.g();
                Object[] objArr2 = new Object[1];
                objArr2[z13] = g10;
                vb0Var.setText(gd.a0(null, null, 2131744172, objArr2));
            } else {
                vb0Var.setText(gd.N0(this.C1.a == bVar2 ? 2131746882 : 2131746881, null));
            }
        }
        if (z14 || z15 || z16) {
            int i12 = this.o1;
            hi.e eVar = this.u1;
            if (i12 != 0) {
                eVar.i(gd.N0(2131746889, null), z12, true);
            } else if (this.C1.l()) {
                eVar.i(gd.N0(2131746888, null), z12, true);
            } else {
                cg.a aVar7 = this.C1;
                boolean z18 = aVar7.a == bVar ? true : z13;
                Object[] objArr3 = new Object[1];
                objArr3[z13] = z18 ? aVar7.b() : gd.E(aVar7.a(), ',');
                eVar.i(pb.t1(pb.Z0(z18, gd.a0(null, null, 2131746887, objArr3), z18 ? this.H1 : this.G1), z18), z12, true);
            }
            K0(z12);
        }
        if (z14 || z15) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.C1.a == bVar ? ((org.telegram.messenger.i0) mp.u1(this.a).A7.l.b).a : mp.u1(this.a).f6 * 1.0E-5d;
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.C1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, z13));
            this.v1.c(sb2, z12, true);
        }
        if (z10 && z15) {
            String b10 = this.C1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean Y(float f10, float f11) {
        b bVar;
        if (!this.F1 || (bVar = this.m1) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.Y(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void g0(float f10) {
        super.g0(f10);
        J0();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new ca.r(this, 12), 50L);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.I1 = true;
        J0();
    }
}
