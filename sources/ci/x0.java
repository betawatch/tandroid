package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ej;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x20;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x0 extends org.telegram.ui.ActionBar.t2 {
    public long A1;
    public int B1;
    public boolean C1;
    public final wp[] D1;
    public final wp[] E1;
    public boolean F1;
    public final c j1;
    public final boolean k1;
    public final int l1;
    public final x20 m1;
    public final gb0 n1;
    public final EditTextBoldCursor o1;
    public final TextView p1;
    public final s q1;
    public final gi.d r1;
    public final org.telegram.ui.Components.h6 s1;
    public final ImageView t1;
    public final ImageView u1;
    public final dg.a v1;
    public final dg.a w1;
    public final dg.a x1;
    public final dg.a y1;
    public dg.a z1;

    public x0(final Context context, int i3, long j10, ej ejVar, wm wmVar, final org.telegram.ui.ActionBar.e6 e6Var, int i10, u10 u10Var) {
        super(1, context, e6Var, true);
        boolean z10;
        this.A1 = -1L;
        this.D1 = new wp[1];
        this.E1 = new wp[1];
        this.l1 = i10;
        this.E = true;
        this.Q0 = true;
        boolean z11 = org.telegram.messenger.t3.z(i3, 24, j10);
        this.k1 = z11;
        final int i11 = 0;
        boolean z12 = z11 || e9.y(i3, true).j();
        org.telegram.messenger.p0 p0Var = hp.s1(i3).x7;
        long j11 = ((org.telegram.messenger.l0) p0Var.g.b).c;
        dg.b bVar = dg.b.b;
        this.x1 = dg.a.i(j11, bVar);
        this.y1 = dg.a.i(((org.telegram.messenger.l0) p0Var.h.b).c, bVar);
        long j12 = ((org.telegram.messenger.j0) p0Var.d.b).c;
        dg.b bVar2 = dg.b.a;
        this.v1 = dg.a.g(j12, bVar2);
        this.w1 = dg.a.g(((org.telegram.messenger.j0) p0Var.e.b).c, bVar2);
        if (z11) {
            this.j1 = null;
        } else {
            c cVar = new c(i3, context, e6Var);
            this.j1 = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.c.addView(cVar, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            pf.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) { // from class: ci.v0
                public final /* synthetic */ x0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            if (this.b.z1.a == dg.b.a) {
                                new nb(context, e6Var).show();
                                break;
                            }
                            break;
                        default:
                            x0 x0Var = this.b;
                            ((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.S(context, x0Var.A1, new a1.c(x0Var, 12), e6Var, 0).b).show();
                            break;
                    }
                }
            });
        }
        P(org.telegram.ui.ActionBar.k6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f10, mf.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(bd.M0(i10 == 0 ? 2131747085 : 2131747092, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, mf.q(-1, -1, 1.0f, hs.E1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.k6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, e6Var, mode);
        pf.a(imageView);
        boolean z13 = z12;
        imageView.setOnClickListener(new ai.b(this, 7));
        f10.addView(imageView, mf.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.o1 = editTextBoldCursor;
        if (z13) {
            x20 x20Var = new x20(context, e6Var);
            this.m1 = x20Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bd.M0(2131744387, null));
            arrayList.add(bd.M0(2131744386, null));
            x20Var.b(arrayList, new p0(this, 1));
            linearLayout.addView(x20Var, mf.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.m1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, mf.l(1.0f, -1, -2));
        gb0 gb0Var = new gb0(context, null);
        this.n1 = gb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        gb0Var.e(editTextBoldCursor);
        dg.a aVar = ejVar.a;
        gb0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        gb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new m(this, 2));
        gb0Var.addView(editTextBoldCursor, mf.e(-1, -2, 48));
        f11.addView(gb0Var, mf.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.t1 = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        gb0Var.addView(imageView2, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.u1 = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        gb0Var.addView(imageView3, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.s1 = h6Var;
        int i14 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i14, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(5);
        gb0Var.addView(h6Var, mf.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.p1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, mf.t(-1, -2, 55, 33, 4, 33, 0));
        s sVar = new s(context, 1);
        this.q1 = sVar;
        sVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        sVar.setCursorWidth(1.5f);
        sVar.setTextSize(1, 17.0f);
        sVar.setMaxLines(1);
        sVar.setBackground(null);
        sVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(sVar, i12, null);
        sVar.setFocusable(false);
        sVar.setClickable(false);
        sVar.setEnabled(false);
        gb0 gb0Var2 = new gb0(context, null);
        gb0Var2.setText(bd.M0(2131747082, null));
        gb0Var2.e(sVar);
        gb0Var2.addView(sVar, mf.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        pf.b(gb0Var2, 0.02f, 1.2f);
        final int i15 = 1;
        gb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ci.v0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        if (this.b.z1.a == dg.b.a) {
                            new nb(context, e6Var).show();
                            break;
                        }
                        break;
                    default:
                        x0 x0Var = this.b;
                        ((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.S(context, x0Var.A1, new a1.c(x0Var, 12), e6Var, 0).b).show();
                        break;
                }
            }
        });
        f11.addView(gb0Var2, mf.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView4, i13, e6Var, mode);
        gb0Var2.addView(imageView4, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.M0(2131747102, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.k5.q(null, null, 2131747101, new Object[]{Long.valueOf(hp.s1(i3).x7.i.g2(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, mf.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, mf.r(-1, -2, 80));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.r1 = dVar;
        dVar.setOnClickListener(new w0(this, wmVar, i3, context, e6Var, j10, u10Var));
        if (i10 == 1) {
            dVar.i(bd.M0(2131747091, null), false, true);
        }
        linearLayout2.addView(dVar, mf.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            z10 = false;
            M0(dg.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            z10 = false;
            M0(dg.a.i(0L, bVar2), false, true, false);
        }
        long j13 = ejVar.b;
        if (this.A1 != j13) {
            this.A1 = j13;
            sVar.setText(K0(j13));
        }
        J0(z10);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new bh.h(this, 2));
    }

    public static String K0(long j10) {
        if (j10 <= 0) {
            return bd.M0(2131747100, null);
        }
        String x10 = bd.x(j10, true);
        if (x10.isEmpty()) {
            return x10;
        }
        return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
    }

    public final void I0() {
        boolean z10 = this.F1;
        c cVar = this.j1;
        boolean z11 = (z10 && !this.J && cVar != null && this.b.getY() > ((float) org.telegram.messenger.g0.L(32.0f))) || this.m1 == null;
        if (this.C1 != z11) {
            this.C1 = z11;
            if (cVar != null) {
                cVar.setEnabled(z11);
                cVar.setClickable(z11);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void J0(boolean z10) {
        boolean z11 = this.B1 == 0 && (this.z1.b >= 0 || this.A1 > 0);
        gi.d dVar = this.r1;
        if (dVar.d0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                org.telegram.messenger.camera.q.k(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    public final dg.a L0() {
        return this.z1.a == dg.b.b ? this.y1 : this.w1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void M0(dg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i3;
        dg.a aVar2 = this.z1;
        int i10 = this.B1;
        this.B1 = 0;
        if (aVar != null) {
            this.z1 = aVar;
        } else {
            this.z1 = dg.a.i(0L, aVar2.a);
            this.B1 |= 1;
        }
        long j10 = L0().b;
        dg.a aVar3 = this.z1;
        if (j10 < aVar3.b) {
            this.B1 |= 4;
        }
        boolean k10 = aVar3.k();
        dg.a aVar4 = this.v1;
        dg.a aVar5 = this.x1;
        dg.b bVar = dg.b.b;
        if (!k10) {
            dg.a aVar6 = this.z1;
            if ((aVar6.a == bVar ? aVar5 : aVar4).b > aVar6.b) {
                this.B1 |= 2;
            }
        }
        boolean z14 = z11 || aVar2.a != this.z1.a;
        boolean z15 = z11 || aVar2.b != this.z1.b;
        boolean z16 = z11 || i10 != this.B1;
        gb0 gb0Var = this.n1;
        if (z16) {
            gb0Var.a((this.B1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        dg.b bVar2 = dg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.o1;
        if (z14) {
            x20 x20Var = this.m1;
            boolean z17 = false;
            if (x20Var != null) {
                x20Var.a(this.z1.a == bVar2 ? 0 : 1, z12);
            }
            dg.b bVar3 = this.z1.a;
            TextView textView = this.p1;
            if (bVar3 == bVar2) {
                textView.setText(bd.M0(2131747088, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(bd.M0(2131747087, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.u1;
            ImageView imageView2 = this.t1;
            if (z12) {
                i3 = 2;
                imageView2.animate().alpha(this.z1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.z1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.z1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.z1.a == bVar ? 1.0f : 0.0f).scaleX(this.z1.a == bVar ? 1.0f : 0.0f).scaleY(this.z1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                i3 = 2;
                imageView2.setAlpha(this.z1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.z1.a == bVar ? 1.0f : 0.0f);
            }
            c cVar = this.j1;
            z13 = z17;
            if (cVar != null) {
                dg.b bVar4 = this.z1.a;
                z13 = z17;
                if (cVar.e != bVar4) {
                    cVar.e = bVar4;
                    cVar.a();
                    z13 = z17;
                }
            }
        } else {
            z13 = 0;
            i3 = 2;
        }
        if (z14 || z16) {
            int i11 = this.B1;
            if ((i11 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[z13] = L0().f();
                gb0Var.setText(bd.a0(null, null, 2131744428, objArr));
            } else if ((i11 & 2) != 0) {
                if (this.z1.a == bVar) {
                    aVar4 = aVar5;
                }
                String f10 = aVar4.f();
                Object[] objArr2 = new Object[1];
                objArr2[z13] = f10;
                gb0Var.setText(bd.a0(null, null, 2131744427, objArr2));
            } else {
                gb0Var.setText(bd.M0(this.z1.a == bVar2 ? 2131747084 : 2131747083, null));
            }
        }
        if (z14 || z15 || z16) {
            int i12 = this.l1;
            gi.d dVar = this.r1;
            if (i12 != 0) {
                dVar.i(bd.M0(2131747091, null), z12, true);
            } else if (this.z1.k()) {
                dVar.i(bd.M0(2131747090, null), z12, true);
            } else {
                dg.a aVar7 = this.z1;
                boolean z18 = aVar7.a == bVar ? true : z13;
                Object[] objArr3 = new Object[1];
                objArr3[z13] = z18 ? aVar7.b() : bd.E(aVar7.a(), ',');
                dVar.i(wb.s1(wb.Y0(z18, bd.a0(null, null, 2131747089, objArr3), z18 ? this.E1 : this.D1), z18), z12, true);
            }
            J0(z12);
        }
        if (z14 || z15) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.z1.a == bVar ? ((org.telegram.messenger.i0) hp.s1(this.a).x7.l.b).a : hp.s1(this.a).c6 * 1.0E-5d;
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c2 = (long) (this.z1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i3, c2, z13));
            this.s1.c(sb2, z12, true);
        }
        if (z10 && z15) {
            String b10 = this.z1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean X(float f10, float f11) {
        c cVar;
        if (!this.C1 || (cVar = this.j1) == null || f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void g0(float f10) {
        super.g0(f10);
        I0();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ai.s(this, 28), 50L);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        this.F1 = true;
        I0();
    }
}
