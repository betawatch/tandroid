package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t0 extends org.telegram.ui.Components.ma {
    public static final int[] q2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int Q1;
    public final c R1;
    public final TL_stars.TL_starGiftUnique S1;
    public final String T1;
    public final long U1;
    public final x20 V1;
    public final gb0 W1;
    public final EditTextBoldCursor X1;
    public final TextView Y1;
    public final r0 Z1;
    public final TextView a2;
    public final gi.d b2;
    public final org.telegram.ui.Components.h6 c2;
    public final ImageView d2;
    public final ImageView e2;
    public final bb.c f2;
    public dg.a g2;
    public int h2;
    public int i2;
    public boolean j2;
    public final s1 k2;
    public final wp[] l2;
    public final wp[] m2;
    public boolean n2;
    public f41 o2;
    public final r31 p2;

    public t0(final Context context, final int i3, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.e6 e6Var, s1 s1Var) {
        super(context, null, true, false, 2, e6Var);
        float f10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        bb.c cVar = new bb.c(17);
        tf.b[] bVarArr = (tf.b[]) cVar.b;
        this.f2 = cVar;
        this.l2 = new wp[1];
        this.m2 = new wp[1];
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        this.s1 = 0.2f;
        this.U1 = j10;
        this.S1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.T1 = k2.p1.l(tL_starGiftUnique.num, ',', sb2);
        this.k2 = s1Var;
        this.E = true;
        this.Q0 = true;
        boolean j11 = e9.y(i3, true).j();
        if (j10 <= 0 || hp.s1(i3).b2(j10) != null) {
            f10 = 12.0f;
        } else {
            f10 = 12.0f;
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            if (a22 != null) {
                hp.s1(i3).W2(a22, 0, false, null);
            }
        }
        org.telegram.messenger.p0 p0Var = hp.s1(i3).x7;
        long j12 = tL_starGiftUnique.offer_min_stars;
        dg.b bVar = dg.b.a;
        dg.a g7 = dg.a.g(j12, bVar);
        dg.a g10 = dg.a.g(Math.max(g7.a() * 2, ((org.telegram.messenger.j0) p0Var.q.b).c), bVar);
        dg.b bVar2 = dg.b.b;
        dg.a i10 = dg.a.i(Math.max(g7.e(bVar2).n(2).b, ((org.telegram.messenger.l0) p0Var.r.b).c), bVar2);
        dg.a i11 = dg.a.i(Math.max(i10.b * 2, ((org.telegram.messenger.l0) p0Var.s.b).c), bVar2);
        dg.b bVar3 = g7.a;
        if (bVar3 == g10.a) {
            bVarArr[bVar3.ordinal()] = new tf.b(g7, g10);
        }
        dg.b bVar4 = i10.a;
        if (bVar4 == i11.a) {
            bVarArr[bVar4.ordinal()] = new tf.b(i10, i11);
        }
        c cVar2 = new c(i3, context, e6Var);
        this.R1 = cVar2;
        cVar2.setScaleX(0.6f);
        cVar2.setScaleY(0.6f);
        cVar2.setAlpha(0.0f);
        cVar2.setEnabled(false);
        cVar2.setClickable(false);
        this.c.addView(cVar2, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        pf.a(cVar2);
        cVar2.setOnClickListener(new ai.h(this, context, e6Var, 6));
        P(org.telegram.ui.ActionBar.k6.h5);
        this.Q1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.X1 = editTextBoldCursor;
        if (j11) {
            x20 x20Var = new x20(context, e6Var);
            this.V1 = x20Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bd.M0(2131744387, null));
            arrayList.add(bd.M0(2131744386, null));
            x20Var.b(arrayList, new p0(this, 0));
            linearLayout.addView(x20Var, mf.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            e6Var2 = null;
        } else {
            e6Var2 = null;
            this.V1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, mf.l(1.0f, -1, -2));
        gb0 gb0Var = new gb0(context, e6Var2);
        this.W1 = gb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        gb0Var.e(editTextBoldCursor);
        gb0Var.b(1.0f, 0.0f, false);
        gb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new m(this, 1));
        gb0Var.addView(editTextBoldCursor, mf.e(-1, -2, 48));
        f11.addView(gb0Var, mf.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.d2 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        gb0Var.addView(imageView, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.e2 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        gb0Var.addView(imageView2, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.c2 = h6Var;
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i13, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(5);
        gb0Var.addView(h6Var, mf.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Y1 = textView;
        textView.setTextSize(1, 13.0f);
        f11.addView(textView, mf.t(-1, -2, 55, 33, 4, 33, 0));
        r0 r0Var = new r0(context);
        this.Z1 = r0Var;
        r0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        r0Var.setCursorWidth(1.5f);
        r0Var.setTextSize(1, 17.0f);
        r0Var.setMaxLines(1);
        r0Var.setBackground(null);
        r0Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(r0Var, i12, null);
        r0Var.setFocusable(false);
        r0Var.setClickable(false);
        r0Var.setEnabled(false);
        gb0 gb0Var2 = new gb0(context, null);
        gb0Var2.setText(bd.M0(2131749738, null));
        gb0Var2.e(r0Var);
        gb0Var2.addView(r0Var, mf.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        pf.b(gb0Var2, 0.02f, 1.2f);
        gb0Var2.setOnClickListener(new ai.d(6, this, context));
        f11.addView(gb0Var2, mf.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.W5, e6Var, PorterDuff.Mode.SRC_IN);
        gb0Var2.addView(imageView3, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.a2 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, mf.t(-1, -2, 55, 33, 4, 33, 0));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.b2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: ci.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                boolean z10;
                int i14;
                boolean z11;
                long j13;
                int i15;
                final t0 t0Var = t0.this;
                if (t0Var.b2.d0) {
                    int i16 = i3;
                    if (hp.s1(i16).v2()) {
                        org.telegram.ui.b.b(i16);
                        return;
                    }
                    e9 x10 = e9.x(i16, t0Var.g2.a);
                    dg.a l10 = x10.e ? dg.a.l(x10.p()) : null;
                    dg.b bVar5 = dg.b.a;
                    dg.b bVar6 = dg.b.b;
                    if (l10 != null) {
                        long j14 = l10.b;
                        dg.a aVar = t0Var.g2;
                        if (j14 >= aVar.b) {
                            String str2 = t0Var.T1;
                            long j15 = t0Var.U1;
                            String d = aVar.d();
                            if (t0Var.g2.a == bVar6) {
                                str = str2;
                                z10 = true;
                            } else {
                                str = str2;
                                z10 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(t0Var.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(t0Var.getContext());
                            textView3.setText(bd.M0(2131749740, null));
                            int i17 = org.telegram.ui.ActionBar.k6.j5;
                            org.telegram.messenger.k5.n(textView3, i17, t0Var.J0, 1, 20.0f);
                            linearLayout2.addView(textView3, mf.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(t0Var.getContext());
                            org.telegram.ui.ActionBar.r6.V(textView4, i17, t0Var.J0);
                            textView4.setTextSize(1, 16.0f);
                            textView4.setText(org.telegram.messenger.g0.X2(t0Var.g2.a == bVar5 ? bd.a0(null, null, 2131749691, d, org.telegram.messenger.m5.t(j15), str) : bd.a0(null, null, 2131749690, d, org.telegram.messenger.m5.t(j15), str)));
                            linearLayout2.addView(textView4, mf.t(-1, -2, 48, 24, 4, 24, 4));
                            rx0 rx0Var = new rx0(t0Var.getContext(), t0Var.J0);
                            final long N1 = hp.s1(t0Var.a).N1(j15);
                            final dg.a g11 = dg.a.g(N1, bVar5);
                            rx0Var.c(bd.M0(2131749712, null), wb.a1(z10, bd.a0(null, null, 2131749748, d), 0.8f, null), null, null);
                            if (N1 > 0) {
                                i14 = 0;
                                rx0Var.c(bd.M0(2131749713, null), wb.a1(false, bd.a0(null, null, 2131749748, g11.d()), 0.8f, null), null, null);
                            } else {
                                i14 = 0;
                            }
                            rx0Var.c(bd.M0(2131749714, null), bd.G(t0Var.h2 / 3600, "GiftOfferHours", new Object[i14]), null, null);
                            linearLayout2.addView(rx0Var, mf.t(-1, -2, 48, 23, 16, 23, 4));
                            yy.C(t0Var.a);
                            long E = yy.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (N1 == 0) {
                                spannableStringBuilder.append((CharSequence) wb.V0(bd.a0(null, null, 2131749720, d), z10));
                                z11 = z10;
                                j13 = E;
                                i15 = 0;
                            } else if (z10) {
                                spannableStringBuilder.append(bd.V(null, null, 2131749719, wb.V0(bd.a0(null, null, 2131749718, d), true), wb.T0(bd.a0(null, null, 2131749718, g11.d()))));
                                z11 = z10;
                                j13 = E;
                                i15 = 0;
                            } else {
                                z11 = z10;
                                j13 = E;
                                i15 = 0;
                                spannableStringBuilder.append((CharSequence) wb.T0(bd.a0(null, null, 2131749720, dg.a.i(t0Var.g2.b + g11.b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, t0Var.getContext(), t0Var.J0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z12 = z11;
                            final long j16 = j13;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.p1() { // from class: ci.n0
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i18) {
                                    long j17 = N1;
                                    t0 t0Var2 = t0.this;
                                    if (j17 > 0) {
                                        int i19 = t0Var2.a;
                                        dg.b bVar7 = dg.b.a;
                                        e9 x11 = e9.x(i19, bVar7);
                                        dg.a l11 = x11.e ? dg.a.l(x11.p()) : null;
                                        dg.a g12 = z12 ? dg.a.g(j17, bVar7) : dg.a.i(t0Var2.g2.b + g11.b, bVar7);
                                        if (l11 == null || l11.b < g12.b) {
                                            new mb(t0Var2.getContext(), t0Var2.J0, g12.a(), 14, null, null, t0Var2.U1).show();
                                            return;
                                        }
                                    }
                                    sf.b h = s1Var2.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = t0Var2.g2.o();
                                    tL_sendStarGiftOffer.peer = hp.s1(t0Var2.a).j1(t0Var2.U1);
                                    tL_sendStarGiftOffer.duration = t0Var2.h2;
                                    tL_sendStarGiftOffer.slug = t0Var2.S1.slug;
                                    tL_sendStarGiftOffer.random_id = j16;
                                    if (j17 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j17;
                                    }
                                    ConnectionsManager.getInstance(t0Var2.a).sendRequestTyped(tL_sendStarGiftOffer, new ai.n0(t0Var2, h, s1Var2, 2));
                                }
                            });
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                            s1Var2.a1 = true;
                            s1Var2.show();
                            return;
                        }
                    }
                    dg.a aVar2 = t0Var.g2;
                    dg.b bVar7 = aVar2.a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.e6 e6Var3 = e6Var;
                    if (bVar7 == bVar5) {
                        new mb(context2, e6Var3, aVar2.a(), 14, null, null, j10).show();
                    } else if (bVar7 == bVar6) {
                        new hi.f(context2, e6Var3, aVar2, true, null).show();
                    }
                }
            }
        });
        f1(dg.a.i(0L, bVar), false, true, false);
        if (this.h2 != 86400) {
            this.h2 = 86400;
            r0Var.setText(bd.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new s0(this));
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.b.addView(dVar, d);
        tj0 tj0Var = this.l1;
        int i16 = this.u0;
        tj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(64.0f));
        this.l1.setOverScrollMode(2);
        this.p2 = r31.k(linearLayout);
        this.o2.O(false);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new ai.c(this, 14), this.J0);
        this.o2 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131749694, null);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean X(float f10, float f11) {
        c cVar;
        if (!this.j2 || (cVar = this.R1) == null || f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    public final void d1() {
        boolean z10 = this.n2;
        c cVar = this.R1;
        boolean z11 = (z10 && !this.J && cVar != null && this.b.getY() > ((float) org.telegram.messenger.g0.L(32.0f))) || this.V1 == null;
        if (this.j2 != z11) {
            this.j2 = z11;
            if (cVar != null) {
                cVar.setEnabled(z11);
                cVar.setClickable(z11);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void e1(boolean z10) {
        boolean z11 = this.i2 == 0 && this.g2.b > 0;
        gi.d dVar = this.b2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v7 */
    public final void f1(dg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i3;
        boolean z14;
        boolean z15;
        dg.a aVar2 = this.g2;
        int i10 = this.i2;
        this.i2 = 0;
        if (aVar != null) {
            this.g2 = aVar;
        } else {
            this.g2 = dg.a.i(0L, aVar2.a);
            this.i2 |= 1;
        }
        dg.b bVar = this.g2.a;
        bb.c cVar = this.f2;
        tf.b[] bVarArr = (tf.b[]) cVar.b;
        tf.b[] bVarArr2 = (tf.b[]) cVar.b;
        long j10 = ((dg.a) bVarArr[bVar.ordinal()].b).b;
        dg.a aVar3 = this.g2;
        if (j10 < aVar3.b) {
            this.i2 |= 4;
        }
        if (!aVar3.k() && ((dg.a) bVarArr2[this.g2.a.ordinal()].a).b > this.g2.b) {
            this.i2 |= 2;
        }
        boolean z16 = z11 || aVar2.a != this.g2.a;
        boolean z17 = z11 || aVar2.b != this.g2.b;
        boolean z18 = z11 || i10 != this.i2;
        dg.b bVar2 = dg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.X1;
        dg.b bVar3 = dg.b.b;
        if (z16) {
            x20 x20Var = this.V1;
            if (x20Var != null) {
                x20Var.a(this.g2.a == bVar2 ? 0 : 1, z12);
            }
            String t10 = org.telegram.messenger.m5.t(this.U1);
            dg.b bVar4 = this.g2.a;
            TextView textView = this.a2;
            if (bVar4 == bVar2) {
                org.telegram.messenger.k5.r(null, null, 2131749737, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((dg.a) bVarArr2[this.g2.a.ordinal()].b).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.k5.r(null, null, 2131749736, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((dg.a) bVarArr2[this.g2.a.ordinal()].b).a()).length() + 3)});
            }
            ImageView imageView = this.e2;
            ImageView imageView2 = this.d2;
            if (z12) {
                z15 = false;
                i3 = 1;
                imageView2.animate().alpha(this.g2.a == bVar2 ? 1.0f : 0.0f).scaleX(this.g2.a == bVar2 ? 1.0f : 0.0f).scaleY(this.g2.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.g2.a == bVar3 ? 1.0f : 0.0f).scaleX(this.g2.a == bVar3 ? 1.0f : 0.0f).scaleY(this.g2.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z15 = false;
                i3 = 1;
                imageView2.setAlpha(this.g2.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.g2.a == bVar3 ? 1.0f : 0.0f);
            }
            c cVar2 = this.R1;
            z13 = z15;
            if (cVar2 != null) {
                dg.b bVar5 = this.g2.a;
                z13 = z15;
                if (cVar2.e != bVar5) {
                    cVar2.e = bVar5;
                    cVar2.a();
                    z13 = z15;
                }
            }
        } else {
            z13 = false;
            i3 = 1;
        }
        if (z16 || z18) {
            this.W1.setText(bd.M0(this.g2.a == bVar2 ? 2131749707 : 2131749699, null));
            dg.b bVar6 = this.g2.a;
            int i11 = this.i2;
            int i12 = i11 & 4;
            String str = this.T1;
            boolean z19 = z13;
            TextView textView2 = this.Y1;
            if (i12 != 0) {
                int i13 = bVar6 == bVar2 ? 2131749705 : 2131749697;
                String d = ((dg.a) bVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr = new Object[2];
                objArr[z19 ? 1 : 0] = d;
                objArr[i3] = str;
                org.telegram.messenger.k5.r(null, null, i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar2 ? 2131749704 : 2131749696;
                String d10 = ((dg.a) bVarArr2[bVar6.ordinal()].a).d();
                Object[] objArr2 = new Object[2];
                objArr2[z19 ? 1 : 0] = d10;
                objArr2[i3] = str;
                org.telegram.messenger.k5.r(null, null, i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar2 ? 2131749706 : 2131749698;
                Object[] objArr3 = new Object[i3];
                objArr3[z19 ? 1 : 0] = str;
                org.telegram.messenger.k5.r(null, null, i15, objArr3, textView2);
            }
            org.telegram.ui.ActionBar.r6.V(textView2, (this.i2 & (-9)) == 0 ? org.telegram.ui.ActionBar.k6.y6 : org.telegram.ui.ActionBar.k6.q7, this.J0);
            z14 = z19;
        } else {
            z14 = z13;
        }
        if (z16 || z17 || z18) {
            dg.a aVar4 = this.g2;
            boolean z20 = aVar4.a == bVar3 ? true : z14;
            Object[] objArr4 = new Object[1];
            objArr4[z14] = z20 ? aVar4.b() : bd.E(aVar4.a(), ',');
            this.b2.i(wb.s1(wb.Y0(z20, bd.a0(null, null, 2131749741, objArr4), z20 ? this.m2 : this.l2), z20), z12, true);
            e1(z12);
        }
        if (z16 || z17) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d11 = this.g2.a == bVar3 ? ((org.telegram.messenger.i0) hp.s1(this.a).x7.l.b).a : hp.s1(this.a).c6 * 1.0E-5d;
            org.telegram.messenger.r1 i16 = org.telegram.messenger.r1.i();
            long c2 = (long) (this.g2.c() * d11 * 100.0d);
            i16.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, c2, z14));
            this.c2.c(sb2, z12, true);
        }
        if (z10 && z17) {
            String b10 = this.g2.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 != this.Q1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0)) == this.H0) {
                return;
            }
            O(w02);
            this.Q1 = this.H0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ai.s(this, 27), 50L);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        this.n2 = true;
        d1();
    }
}
