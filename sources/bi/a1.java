package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a1 extends org.telegram.ui.Components.na {
    public static final int[] p2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int P1;
    public final c Q1;
    public final TL_stars.TL_starGiftUnique R1;
    public final String S1;
    public final long T1;
    public final b30 U1;
    public final lb0 V1;
    public final EditTextBoldCursor W1;
    public final TextView X1;
    public final y0 Y1;
    public final TextView Z1;
    public final fi.d a2;
    public final org.telegram.ui.Components.j6 b2;
    public final ImageView c2;
    public final ImageView d2;
    public final aa.n e2;
    public cg.a f2;
    public int g2;
    public int h2;
    public boolean i2;
    public final z1 j2;
    public final wp[] k2;
    public final wp[] l2;
    public boolean m2;
    public l41 n2;
    public final x31 o2;

    public a1(final Context context, final int i7, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.f6 f6Var, z1 z1Var) {
        super(context, null, true, false, 2, f6Var);
        float f10;
        boolean z9;
        org.telegram.ui.ActionBar.f6 f6Var2;
        aa.n nVar = new aa.n(8);
        q4.q[] qVarArr = (q4.q[]) nVar.b;
        this.e2 = nVar;
        this.k2 = new wp[1];
        this.l2 = new wp[1];
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.r1 = 0.2f;
        this.T1 = j3;
        this.R1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.S1 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
        this.j2 = z1Var;
        this.D = true;
        this.P0 = true;
        boolean j10 = ea.y(i7, true).j();
        if (j3 <= 0 || qp.s1(i7).b2(j3) != null) {
            f10 = 12.0f;
        } else {
            f10 = 12.0f;
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            if (a22 != null) {
                qp.s1(i7).W2(a22, 0, false, null);
            }
        }
        org.telegram.messenger.p0 p0Var = qp.s1(i7).x7;
        long j11 = tL_starGiftUnique.offer_min_stars;
        cg.b bVar = cg.b.a;
        cg.a g10 = cg.a.g(j11, bVar);
        cg.a g11 = cg.a.g(Math.max(g10.a() * 2, ((org.telegram.messenger.j0) p0Var.q.b).c), bVar);
        cg.b bVar2 = cg.b.b;
        cg.a i10 = cg.a.i(Math.max(g10.e(bVar2).n(2).b, ((org.telegram.messenger.l0) p0Var.r.b).c), bVar2);
        cg.a i11 = cg.a.i(Math.max(i10.b * 2, ((org.telegram.messenger.l0) p0Var.s.b).c), bVar2);
        cg.b bVar3 = g10.a;
        int i12 = 13;
        if (bVar3 != g11.a) {
            z9 = false;
        } else {
            z9 = false;
            qVarArr[bVar3.ordinal()] = new q4.q(g10, g11, z9, i12);
        }
        cg.b bVar4 = i10.a;
        if (bVar4 == i11.a) {
            qVarArr[bVar4.ordinal()] = new q4.q(i10, i11, z9, i12);
        }
        c cVar = new c(i7, context, f6Var);
        this.Q1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(z9);
        cVar.setClickable(z9);
        this.c.addView(cVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.ka.a(cVar);
        cVar.setOnClickListener(new ah.g(this, context, f6Var, 1));
        P(org.telegram.ui.ActionBar.k6.h5);
        this.P1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.W1 = editTextBoldCursor;
        if (j10) {
            b30 b30Var = new b30(context, f6Var);
            this.U1 = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.id.M0(2131744380, null));
            arrayList.add(org.telegram.messenger.id.M0(2131744379, null));
            b30Var.b(arrayList, new w0(this, 0));
            linearLayout.addView(b30Var, c8.ha.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            f6Var2 = null;
        } else {
            f6Var2 = null;
            this.U1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, c8.ha.l(1.0f, -1, -2));
        lb0 lb0Var = new lb0(context, f6Var2);
        this.V1 = lb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        lb0Var.e(editTextBoldCursor);
        lb0Var.b(1.0f, 0.0f, false);
        lb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new n(this, 1));
        lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
        f11.addView(lb0Var, c8.ha.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.c2 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        lb0Var.addView(imageView, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d2 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        lb0Var.addView(imageView2, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.b2 = j6Var;
        int i14 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i14, null);
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var.setGravity(5);
        lb0Var.addView(j6Var, c8.ha.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.X1 = textView;
        textView.setTextSize(1, 13.0f);
        f11.addView(textView, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        y0 y0Var = new y0(context);
        this.Y1 = y0Var;
        y0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        y0Var.setCursorWidth(1.5f);
        y0Var.setTextSize(1, 17.0f);
        y0Var.setMaxLines(1);
        y0Var.setBackground(null);
        y0Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(y0Var, i13, null);
        y0Var.setFocusable(false);
        y0Var.setClickable(false);
        y0Var.setEnabled(false);
        lb0 lb0Var2 = new lb0(context, null);
        lb0Var2.setText(org.telegram.messenger.id.M0(2131749731, null));
        lb0Var2.e(y0Var);
        lb0Var2.addView(y0Var, c8.ha.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.ka.b(lb0Var2, 0.02f, 1.2f);
        lb0Var2.setOnClickListener(new r(1, this, context));
        f11.addView(lb0Var2, c8.ha.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.W5, f6Var, PorterDuff.Mode.SRC_IN);
        lb0Var2.addView(imageView3, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.Z1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        fi.d dVar = new fi.d(context, f6Var, true);
        this.a2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: bi.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                boolean z10;
                int i15;
                boolean z11;
                long j12;
                int i16;
                final a1 a1Var = a1.this;
                if (a1Var.a2.c0) {
                    int i17 = i7;
                    if (qp.s1(i17).v2()) {
                        org.telegram.ui.b.b(i17);
                        return;
                    }
                    ea x10 = ea.x(i17, a1Var.f2.a);
                    cg.a l10 = x10.e ? cg.a.l(x10.p()) : null;
                    cg.b bVar5 = cg.b.a;
                    cg.b bVar6 = cg.b.b;
                    if (l10 != null) {
                        long j13 = l10.b;
                        cg.a aVar = a1Var.f2;
                        if (j13 >= aVar.b) {
                            String str2 = a1Var.S1;
                            long j14 = a1Var.T1;
                            String d = aVar.d();
                            if (a1Var.f2.a == bVar6) {
                                str = str2;
                                z10 = true;
                            } else {
                                str = str2;
                                z10 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(a1Var.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(a1Var.getContext());
                            textView3.setText(org.telegram.messenger.id.M0(2131749733, null));
                            int i18 = org.telegram.ui.ActionBar.k6.j5;
                            org.telegram.messenger.k5.n(textView3, i18, a1Var.I0, 1, 20.0f);
                            linearLayout2.addView(textView3, c8.ha.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(a1Var.getContext());
                            org.telegram.ui.ActionBar.r6.V(textView4, i18, a1Var.I0);
                            textView4.setTextSize(1, 16.0f);
                            textView4.setText(org.telegram.messenger.g0.X2(a1Var.f2.a == bVar5 ? org.telegram.messenger.id.a0(null, null, 2131749684, d, org.telegram.messenger.m5.t(j14), str) : org.telegram.messenger.id.a0(null, null, 2131749683, d, org.telegram.messenger.m5.t(j14), str)));
                            linearLayout2.addView(textView4, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
                            tx0 tx0Var = new tx0(a1Var.getContext(), a1Var.I0);
                            final long N1 = qp.s1(a1Var.a).N1(j14);
                            final cg.a g12 = cg.a.g(N1, bVar5);
                            tx0Var.c(org.telegram.messenger.id.M0(2131749705, null), dd.a1(z10, org.telegram.messenger.id.a0(null, null, 2131749741, d), 0.8f, null), null, null);
                            if (N1 > 0) {
                                i15 = 0;
                                tx0Var.c(org.telegram.messenger.id.M0(2131749706, null), dd.a1(false, org.telegram.messenger.id.a0(null, null, 2131749741, g12.d()), 0.8f, null), null, null);
                            } else {
                                i15 = 0;
                            }
                            tx0Var.c(org.telegram.messenger.id.M0(2131749707, null), org.telegram.messenger.id.G(a1Var.g2 / 3600, "GiftOfferHours", new Object[i15]), null, null);
                            linearLayout2.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
                            gz.C(a1Var.a);
                            long E = gz.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (N1 == 0) {
                                spannableStringBuilder.append((CharSequence) dd.V0(org.telegram.messenger.id.a0(null, null, 2131749713, d), z10));
                                z11 = z10;
                                j12 = E;
                                i16 = 0;
                            } else if (z10) {
                                spannableStringBuilder.append(org.telegram.messenger.id.V(null, null, 2131749712, dd.V0(org.telegram.messenger.id.a0(null, null, 2131749711, d), true), dd.T0(org.telegram.messenger.id.a0(null, null, 2131749711, g12.d()))));
                                z11 = z10;
                                j12 = E;
                                i16 = 0;
                            } else {
                                z11 = z10;
                                j12 = E;
                                i16 = 0;
                                spannableStringBuilder.append((CharSequence) dd.T0(org.telegram.messenger.id.a0(null, null, 2131749713, cg.a.i(a1Var.f2.b + g12.b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i16, a1Var.getContext(), a1Var.I0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z12 = z11;
                            final long j15 = j12;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.r1() { // from class: bi.s0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i19) {
                                    long j16 = N1;
                                    a1 a1Var2 = a1.this;
                                    if (j16 > 0) {
                                        int i20 = a1Var2.a;
                                        cg.b bVar7 = cg.b.a;
                                        ea x11 = ea.x(i20, bVar7);
                                        cg.a l11 = x11.e ? cg.a.l(x11.p()) : null;
                                        cg.a g13 = z12 ? cg.a.g(j16, bVar7) : cg.a.i(a1Var2.f2.b + g12.b, bVar7);
                                        if (l11 == null || l11.b < g13.b) {
                                            new tc(a1Var2.getContext(), a1Var2.I0, g13.a(), 14, null, null, a1Var2.T1).show();
                                            return;
                                        }
                                    }
                                    vf.b h = u1Var.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = a1Var2.f2.o();
                                    tL_sendStarGiftOffer.peer = qp.s1(a1Var2.a).j1(a1Var2.T1);
                                    tL_sendStarGiftOffer.duration = a1Var2.g2;
                                    tL_sendStarGiftOffer.slug = a1Var2.R1.slug;
                                    tL_sendStarGiftOffer.random_id = j15;
                                    if (j16 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j16;
                                    }
                                    ConnectionsManager.getInstance(a1Var2.a).sendRequestTyped(tL_sendStarGiftOffer, new t0(a1Var2, h, u1Var, 0));
                                }
                            });
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.X0 = true;
                            u1Var.show();
                            return;
                        }
                    }
                    cg.a aVar2 = a1Var.f2;
                    cg.b bVar7 = aVar2.a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.f6 f6Var3 = f6Var;
                    if (bVar7 == bVar5) {
                        new tc(context2, f6Var3, aVar2.a(), 14, null, null, j3).show();
                    } else if (bVar7 == bVar6) {
                        new gi.e(context2, f6Var3, aVar2, true, null).show();
                    }
                }
            }
        });
        f1(cg.a.i(0L, bVar), false, true, false);
        if (this.g2 != 86400) {
            this.g2 = 86400;
            y0Var.setText(org.telegram.messenger.id.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new z0(this));
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.t0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.b.addView(dVar, d);
        pj0 pj0Var = this.k1;
        int i17 = this.t0;
        pj0Var.setPadding(i17, 0, i17, org.telegram.messenger.g0.L(64.0f));
        this.k1.setOverScrollMode(2);
        this.o2 = x31.k(linearLayout);
        this.n2.O(false);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.k1, getContext(), this.a, 0, true, new ai.e(this, 4), this.I0);
        this.n2 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131749687, null);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean X(float f10, float f11) {
        c cVar;
        if (!this.i2 || (cVar = this.Q1) == null || f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    public final void d1() {
        boolean z9 = this.m2;
        c cVar = this.Q1;
        boolean z10 = (z9 && !this.I && cVar != null && this.b.getY() > ((float) org.telegram.messenger.g0.L(32.0f))) || this.U1 == null;
        if (this.i2 != z10) {
            this.i2 = z10;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void e1(boolean z9) {
        boolean z10 = this.h2 == 0 && this.f2.b > 0;
        fi.d dVar = this.a2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v7 */
    public final void f1(cg.a aVar, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        boolean z13;
        boolean z14;
        cg.a aVar2 = this.f2;
        int i10 = this.h2;
        this.h2 = 0;
        if (aVar != null) {
            this.f2 = aVar;
        } else {
            this.f2 = cg.a.i(0L, aVar2.a);
            this.h2 |= 1;
        }
        cg.b bVar = this.f2.a;
        aa.n nVar = this.e2;
        q4.q[] qVarArr = (q4.q[]) nVar.b;
        q4.q[] qVarArr2 = (q4.q[]) nVar.b;
        long j3 = ((cg.a) qVarArr[bVar.ordinal()].c).b;
        cg.a aVar3 = this.f2;
        if (j3 < aVar3.b) {
            this.h2 |= 4;
        }
        if (!aVar3.k() && ((cg.a) qVarArr2[this.f2.a.ordinal()].b).b > this.f2.b) {
            this.h2 |= 2;
        }
        boolean z15 = z10 || aVar2.a != this.f2.a;
        boolean z16 = z10 || aVar2.b != this.f2.b;
        boolean z17 = z10 || i10 != this.h2;
        cg.b bVar2 = cg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.W1;
        cg.b bVar3 = cg.b.b;
        if (z15) {
            b30 b30Var = this.U1;
            if (b30Var != null) {
                b30Var.a(this.f2.a == bVar2 ? 0 : 1, z11);
            }
            String t6 = org.telegram.messenger.m5.t(this.T1);
            cg.b bVar4 = this.f2.a;
            TextView textView = this.Z1;
            if (bVar4 == bVar2) {
                org.telegram.messenger.k5.r(null, null, 2131749730, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr2[this.f2.a.ordinal()].c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.k5.r(null, null, 2131749729, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr2[this.f2.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.d2;
            ImageView imageView2 = this.c2;
            if (z11) {
                z14 = false;
                i7 = 1;
                imageView2.animate().alpha(this.f2.a == bVar2 ? 1.0f : 0.0f).scaleX(this.f2.a == bVar2 ? 1.0f : 0.0f).scaleY(this.f2.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.f2.a == bVar3 ? 1.0f : 0.0f).scaleX(this.f2.a == bVar3 ? 1.0f : 0.0f).scaleY(this.f2.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z14 = false;
                i7 = 1;
                imageView2.setAlpha(this.f2.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.f2.a == bVar3 ? 1.0f : 0.0f);
            }
            c cVar = this.Q1;
            z12 = z14;
            if (cVar != null) {
                cg.b bVar5 = this.f2.a;
                z12 = z14;
                if (cVar.e != bVar5) {
                    cVar.e = bVar5;
                    cVar.a();
                    z12 = z14;
                }
            }
        } else {
            z12 = false;
            i7 = 1;
        }
        if (z15 || z17) {
            this.V1.setText(org.telegram.messenger.id.M0(this.f2.a == bVar2 ? 2131749700 : 2131749692, null));
            cg.b bVar6 = this.f2.a;
            int i11 = this.h2;
            int i12 = i11 & 4;
            String str = this.S1;
            boolean z18 = z12;
            TextView textView2 = this.X1;
            if (i12 != 0) {
                int i13 = bVar6 == bVar2 ? 2131749698 : 2131749690;
                String d = ((cg.a) qVarArr2[bVar6.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[z18 ? 1 : 0] = d;
                objArr[i7] = str;
                org.telegram.messenger.k5.r(null, null, i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar2 ? 2131749697 : 2131749689;
                String d2 = ((cg.a) qVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[z18 ? 1 : 0] = d2;
                objArr2[i7] = str;
                org.telegram.messenger.k5.r(null, null, i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar2 ? 2131749699 : 2131749691;
                Object[] objArr3 = new Object[i7];
                objArr3[z18 ? 1 : 0] = str;
                org.telegram.messenger.k5.r(null, null, i15, objArr3, textView2);
            }
            org.telegram.ui.ActionBar.r6.V(textView2, (this.h2 & (-9)) == 0 ? org.telegram.ui.ActionBar.k6.y6 : org.telegram.ui.ActionBar.k6.q7, this.I0);
            z13 = z18;
        } else {
            z13 = z12;
        }
        if (z15 || z16 || z17) {
            cg.a aVar4 = this.f2;
            boolean z19 = aVar4.a == bVar3 ? true : z13;
            Object[] objArr4 = new Object[1];
            objArr4[z13] = z19 ? aVar4.b() : org.telegram.messenger.id.E(aVar4.a(), ',');
            this.a2.i(dd.s1(dd.Y0(z19, org.telegram.messenger.id.a0(null, null, 2131749734, objArr4), z19 ? this.l2 : this.k2), z19), z11, true);
            e1(z11);
        }
        if (z15 || z16) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d10 = this.f2.a == bVar3 ? ((org.telegram.messenger.i0) qp.s1(this.a).x7.l.b).a : qp.s1(this.a).c6 * 1.0E-5d;
            org.telegram.messenger.r1 i16 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.f2.c() * d10 * 100.0d);
            i16.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, c10, z13));
            this.b2.c(sb2, z11, true);
        }
        if (z9 && z16) {
            String b10 = this.f2.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 != this.P1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0)) == this.G0) {
                return;
            }
            O(w02);
            this.P1 = this.G0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new a3.f(this, 17), 50L);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        this.m2 = true;
        d1();
    }
}
