package di;

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
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p0 extends org.telegram.ui.Components.ja {
    public static final int[] t2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int T1;
    public final b U1;
    public final TL_stars.TL_starGiftUnique V1;
    public final String W1;
    public final long X1;
    public final e30 Y1;
    public final mb0 Z1;
    public final EditTextBoldCursor a2;
    public final TextView b2;
    public final n0 c2;
    public final TextView d2;
    public final hi.d e2;
    public final org.telegram.ui.Components.h6 f2;
    public final ImageView g2;
    public final ImageView h2;
    public final ob.c i2;
    public cg.a j2;
    public int k2;
    public int l2;
    public boolean m2;
    public final l1 n2;
    public final eq[] o2;
    public final eq[] p2;
    public boolean q2;
    public p41 r2;
    public final b41 s2;

    public p0(final Context context, final int i7, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.e6 e6Var, l1 l1Var) {
        super(context, null, true, false, 2, e6Var);
        float f10;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        ob.c cVar = new ob.c(9);
        q4.q[] qVarArr = (q4.q[]) cVar.b;
        this.i2 = cVar;
        this.o2 = new eq[1];
        this.p2 = new eq[1];
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.v1 = 0.2f;
        this.X1 = j3;
        this.V1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.W1 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
        this.n2 = l1Var;
        this.E = true;
        this.Q0 = true;
        boolean j10 = u8.y(i7, true).j();
        if (j3 <= 0 || np.s1(i7).b2(j3) != null) {
            f10 = 12.0f;
        } else {
            f10 = 12.0f;
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            if (a22 != null) {
                np.s1(i7).W2(a22, 0, false, null);
            }
        }
        org.telegram.messenger.p0 p0Var = np.s1(i7).y7;
        long j11 = tL_starGiftUnique.offer_min_stars;
        cg.b bVar = cg.b.a;
        cg.a g10 = cg.a.g(j11, bVar);
        cg.a g11 = cg.a.g(Math.max(g10.a() * 2, ((org.telegram.messenger.j0) p0Var.q.b).c), bVar);
        cg.b bVar2 = cg.b.b;
        cg.a i10 = cg.a.i(Math.max(g10.e(bVar2).n(2).b, ((org.telegram.messenger.l0) p0Var.r.b).c), bVar2);
        cg.a i11 = cg.a.i(Math.max(i10.b * 2, ((org.telegram.messenger.l0) p0Var.s.b).c), bVar2);
        cg.b bVar3 = g10.a;
        if (bVar3 != g11.a) {
            z10 = false;
        } else {
            z10 = false;
            qVarArr[bVar3.ordinal()] = new q4.q(g10, g11, false, 12);
        }
        cg.b bVar4 = i10.a;
        if (bVar4 == i11.a) {
            qVarArr[bVar4.ordinal()] = new q4.q(i10, i11, z10, 12);
        }
        b bVar5 = new b(i7, context, e6Var);
        this.U1 = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(z10);
        bVar5.setClickable(z10);
        this.c.addView(bVar5, c8.ja.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.na.a(bVar5);
        bVar5.setOnClickListener(new ah.g(this, context, e6Var, 6));
        Q(org.telegram.ui.ActionBar.j6.h5);
        this.T1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.a2 = editTextBoldCursor;
        if (j10) {
            e30 e30Var = new e30(context, e6Var);
            this.Y1 = e30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(hd.M0(2131744377, null));
            arrayList.add(hd.M0(2131744376, null));
            e30Var.b(arrayList, new l0(this, 0));
            linearLayout.addView(e30Var, c8.ja.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            e6Var2 = null;
        } else {
            e6Var2 = null;
            this.Y1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, c8.ja.l(1.0f, -1, -2));
        mb0 mb0Var = new mb0(context, e6Var2);
        this.Z1 = mb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        mb0Var.e(editTextBoldCursor);
        mb0Var.b(1.0f, 0.0f, false);
        mb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 2));
        mb0Var.addView(editTextBoldCursor, c8.ja.e(-1, -2, 48));
        f11.addView(mb0Var, c8.ja.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.g2 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        mb0Var.addView(imageView, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.h2 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        mb0Var.addView(imageView2, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f2 = h6Var;
        int i13 = org.telegram.ui.ActionBar.j6.y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i13, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(5);
        mb0Var.addView(h6Var, c8.ja.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b2 = textView;
        textView.setTextSize(1, 13.0f);
        f11.addView(textView, c8.ja.t(-1, -2, 55, 33, 4, 33, 0));
        n0 n0Var = new n0(context);
        this.c2 = n0Var;
        n0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        n0Var.setCursorWidth(1.5f);
        n0Var.setTextSize(1, 17.0f);
        n0Var.setMaxLines(1);
        n0Var.setBackground(null);
        n0Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6.U(n0Var, i12, null);
        n0Var.setFocusable(false);
        n0Var.setClickable(false);
        n0Var.setEnabled(false);
        mb0 mb0Var2 = new mb0(context, null);
        mb0Var2.setText(hd.M0(2131749730, null));
        mb0Var2.e(n0Var);
        mb0Var2.addView(n0Var, c8.ja.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.na.b(mb0Var2, 0.02f, 1.2f);
        mb0Var2.setOnClickListener(new ai.v2(8, this, context));
        f11.addView(mb0Var2, c8.ja.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.W5, e6Var, PorterDuff.Mode.SRC_IN);
        mb0Var2.addView(imageView3, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d2 = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i13, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, c8.ja.t(-1, -2, 55, 33, 4, 33, 0));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.e2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: di.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                boolean z11;
                int i14;
                boolean z12;
                long j12;
                int i15;
                final p0 p0Var2 = p0.this;
                if (p0Var2.e2.d0) {
                    int i16 = i7;
                    if (np.s1(i16).v2()) {
                        org.telegram.ui.b.b(i16);
                        return;
                    }
                    u8 x10 = u8.x(i16, p0Var2.j2.a);
                    cg.a l10 = x10.e ? cg.a.l(x10.p()) : null;
                    cg.b bVar6 = cg.b.a;
                    cg.b bVar7 = cg.b.b;
                    if (l10 != null) {
                        long j13 = l10.b;
                        cg.a aVar = p0Var2.j2;
                        if (j13 >= aVar.b) {
                            String str2 = p0Var2.W1;
                            long j14 = p0Var2.X1;
                            String d = aVar.d();
                            if (p0Var2.j2.a == bVar7) {
                                str = str2;
                                z11 = true;
                            } else {
                                str = str2;
                                z11 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(p0Var2.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(p0Var2.getContext());
                            textView3.setText(hd.M0(2131749732, null));
                            int i17 = org.telegram.ui.ActionBar.j6.j5;
                            org.telegram.messenger.k5.m(textView3, i17, p0Var2.J0, 1, 20.0f);
                            linearLayout2.addView(textView3, c8.ja.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(p0Var2.getContext());
                            org.telegram.ui.ActionBar.q6.U(textView4, i17, p0Var2.J0);
                            textView4.setTextSize(1, 16.0f);
                            textView4.setText(org.telegram.messenger.g0.X2(p0Var2.j2.a == bVar6 ? hd.a0(null, null, 2131749683, d, org.telegram.messenger.m5.t(j14), str) : hd.a0(null, null, 2131749682, d, org.telegram.messenger.m5.t(j14), str)));
                            linearLayout2.addView(textView4, c8.ja.t(-1, -2, 48, 24, 4, 24, 4));
                            vx0 vx0Var = new vx0(p0Var2.getContext(), p0Var2.J0);
                            final long N1 = np.s1(p0Var2.a).N1(j14);
                            final cg.a g12 = cg.a.g(N1, bVar6);
                            vx0Var.c(hd.M0(2131749704, null), lb.a1(z11, hd.a0(null, null, 2131749740, d), 0.8f, null), null, null);
                            if (N1 > 0) {
                                i14 = 0;
                                vx0Var.c(hd.M0(2131749705, null), lb.a1(false, hd.a0(null, null, 2131749740, g12.d()), 0.8f, null), null, null);
                            } else {
                                i14 = 0;
                            }
                            vx0Var.c(hd.M0(2131749706, null), hd.G(p0Var2.k2 / 3600, "GiftOfferHours", new Object[i14]), null, null);
                            linearLayout2.addView(vx0Var, c8.ja.t(-1, -2, 48, 23, 16, 23, 4));
                            ez.C(p0Var2.a);
                            long E = ez.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (N1 == 0) {
                                spannableStringBuilder.append((CharSequence) lb.V0(hd.a0(null, null, 2131749712, d), z11));
                                z12 = z11;
                                j12 = E;
                                i15 = 0;
                            } else if (z11) {
                                spannableStringBuilder.append(hd.V(null, null, 2131749711, lb.V0(hd.a0(null, null, 2131749710, d), true), lb.T0(hd.a0(null, null, 2131749710, g12.d()))));
                                z12 = z11;
                                j12 = E;
                                i15 = 0;
                            } else {
                                z12 = z11;
                                j12 = E;
                                i15 = 0;
                                spannableStringBuilder.append((CharSequence) lb.T0(hd.a0(null, null, 2131749712, cg.a.i(p0Var2.j2.b + g12.b, bVar6).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, p0Var2.getContext(), p0Var2.J0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z13 = z12;
                            final long j15 = j12;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.q1() { // from class: di.j0
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i18) {
                                    long j16 = N1;
                                    p0 p0Var3 = p0.this;
                                    if (j16 > 0) {
                                        int i19 = p0Var3.a;
                                        cg.b bVar8 = cg.b.a;
                                        u8 x11 = u8.x(i19, bVar8);
                                        cg.a l11 = x11.e ? cg.a.l(x11.p()) : null;
                                        cg.a g13 = z13 ? cg.a.g(j16, bVar8) : cg.a.i(p0Var3.j2.b + g12.b, bVar8);
                                        if (l11 == null || l11.b < g13.b) {
                                            new bb(p0Var3.getContext(), p0Var3.J0, g13.a(), 14, null, null, p0Var3.X1).show();
                                            return;
                                        }
                                    }
                                    vf.b h = t1Var.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = p0Var3.j2.o();
                                    tL_sendStarGiftOffer.peer = np.s1(p0Var3.a).j1(p0Var3.X1);
                                    tL_sendStarGiftOffer.duration = p0Var3.k2;
                                    tL_sendStarGiftOffer.slug = p0Var3.V1.slug;
                                    tL_sendStarGiftOffer.random_id = j15;
                                    if (j16 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j16;
                                    }
                                    ConnectionsManager.getInstance(p0Var3.a).sendRequestTyped(tL_sendStarGiftOffer, new bi.h0(p0Var3, h, t1Var, 2));
                                }
                            });
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.Y0 = true;
                            t1Var.show();
                            return;
                        }
                    }
                    cg.a aVar2 = p0Var2.j2;
                    cg.b bVar8 = aVar2.a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.e6 e6Var3 = e6Var;
                    if (bVar8 == bVar6) {
                        new bb(context2, e6Var3, aVar2.a(), 14, null, null, j3).show();
                    } else if (bVar8 == bVar7) {
                        new ii.e(context2, e6Var3, aVar2, true, null).show();
                    }
                }
            }
        });
        f1(cg.a.i(0L, bVar), false, true, false);
        if (this.k2 != 86400) {
            this.k2 = 86400;
            n0Var.setText(hd.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new o0(this));
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.b.addView(dVar, d);
        uj0 uj0Var = this.o1;
        int i16 = this.u0;
        uj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(64.0f));
        this.o1.setOverScrollMode(2);
        this.s2 = b41.k(linearLayout);
        this.r2.O(false);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, true, new bi.b(this, 15), this.J0);
        this.r2 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131749686, null);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean Y(float f10, float f11) {
        b bVar;
        if (!this.m2 || (bVar = this.U1) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.Y(f10, f11);
        }
        return false;
    }

    public final void d1() {
        boolean z10 = this.q2;
        b bVar = this.U1;
        boolean z11 = (z10 && !this.J && bVar != null && this.b.getY() > ((float) org.telegram.messenger.g0.L(32.0f))) || this.Y1 == null;
        if (this.m2 != z11) {
            this.m2 = z11;
            if (bVar != null) {
                bVar.setEnabled(z11);
                bVar.setClickable(z11);
                i20.m(bVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void e1(boolean z10) {
        boolean z11 = this.l2 == 0 && this.j2.b > 0;
        hi.d dVar = this.e2;
        if (dVar.d0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                i20.m(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v7 */
    public final void f1(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i7;
        boolean z14;
        boolean z15;
        cg.a aVar2 = this.j2;
        int i10 = this.l2;
        this.l2 = 0;
        if (aVar != null) {
            this.j2 = aVar;
        } else {
            this.j2 = cg.a.i(0L, aVar2.a);
            this.l2 |= 1;
        }
        cg.b bVar = this.j2.a;
        ob.c cVar = this.i2;
        q4.q[] qVarArr = (q4.q[]) cVar.b;
        q4.q[] qVarArr2 = (q4.q[]) cVar.b;
        long j3 = ((cg.a) qVarArr[bVar.ordinal()].c).b;
        cg.a aVar3 = this.j2;
        if (j3 < aVar3.b) {
            this.l2 |= 4;
        }
        if (!aVar3.k() && ((cg.a) qVarArr2[this.j2.a.ordinal()].b).b > this.j2.b) {
            this.l2 |= 2;
        }
        boolean z16 = z11 || aVar2.a != this.j2.a;
        boolean z17 = z11 || aVar2.b != this.j2.b;
        boolean z18 = z11 || i10 != this.l2;
        cg.b bVar2 = cg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.a2;
        cg.b bVar3 = cg.b.b;
        if (z16) {
            e30 e30Var = this.Y1;
            if (e30Var != null) {
                e30Var.a(this.j2.a == bVar2 ? 0 : 1, z12);
            }
            String t6 = org.telegram.messenger.m5.t(this.X1);
            cg.b bVar4 = this.j2.a;
            TextView textView = this.d2;
            if (bVar4 == bVar2) {
                org.telegram.messenger.k5.q(null, null, 2131749729, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr2[this.j2.a.ordinal()].c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.k5.q(null, null, 2131749728, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr2[this.j2.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.h2;
            ImageView imageView2 = this.g2;
            if (z12) {
                z15 = false;
                i7 = 1;
                imageView2.animate().alpha(this.j2.a == bVar2 ? 1.0f : 0.0f).scaleX(this.j2.a == bVar2 ? 1.0f : 0.0f).scaleY(this.j2.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.j2.a == bVar3 ? 1.0f : 0.0f).scaleX(this.j2.a == bVar3 ? 1.0f : 0.0f).scaleY(this.j2.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z15 = false;
                i7 = 1;
                imageView2.setAlpha(this.j2.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.j2.a == bVar3 ? 1.0f : 0.0f);
            }
            b bVar5 = this.U1;
            z13 = z15;
            if (bVar5 != null) {
                cg.b bVar6 = this.j2.a;
                z13 = z15;
                if (bVar5.e != bVar6) {
                    bVar5.e = bVar6;
                    bVar5.a();
                    z13 = z15;
                }
            }
        } else {
            z13 = false;
            i7 = 1;
        }
        if (z16 || z18) {
            this.Z1.setText(hd.M0(this.j2.a == bVar2 ? 2131749699 : 2131749691, null));
            cg.b bVar7 = this.j2.a;
            int i11 = this.l2;
            int i12 = i11 & 4;
            String str = this.W1;
            boolean z19 = z13;
            TextView textView2 = this.b2;
            if (i12 != 0) {
                int i13 = bVar7 == bVar2 ? 2131749697 : 2131749689;
                String d = ((cg.a) qVarArr2[bVar7.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[z19 ? 1 : 0] = d;
                objArr[i7] = str;
                org.telegram.messenger.k5.q(null, null, i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar7 == bVar2 ? 2131749696 : 2131749688;
                String d2 = ((cg.a) qVarArr2[bVar7.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[z19 ? 1 : 0] = d2;
                objArr2[i7] = str;
                org.telegram.messenger.k5.q(null, null, i14, objArr2, textView2);
            } else {
                int i15 = bVar7 == bVar2 ? 2131749698 : 2131749690;
                Object[] objArr3 = new Object[i7];
                objArr3[z19 ? 1 : 0] = str;
                org.telegram.messenger.k5.q(null, null, i15, objArr3, textView2);
            }
            org.telegram.ui.ActionBar.q6.U(textView2, (this.l2 & (-9)) == 0 ? org.telegram.ui.ActionBar.j6.y6 : org.telegram.ui.ActionBar.j6.q7, this.J0);
            z14 = z19;
        } else {
            z14 = z13;
        }
        if (z16 || z17 || z18) {
            cg.a aVar4 = this.j2;
            boolean z20 = aVar4.a == bVar3 ? true : z14;
            Object[] objArr4 = new Object[1];
            objArr4[z14] = z20 ? aVar4.b() : hd.E(aVar4.a(), ',');
            this.e2.i(lb.s1(lb.Y0(z20, hd.a0(null, null, 2131749733, objArr4), z20 ? this.p2 : this.o2), z20), z12, true);
            e1(z12);
        }
        if (z16 || z17) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d10 = this.j2.a == bVar3 ? ((org.telegram.messenger.i0) np.s1(this.a).y7.l.b).a : np.s1(this.a).d6 * 1.0E-5d;
            org.telegram.messenger.r1 i16 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.j2.c() * d10 * 100.0d);
            i16.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, c10, z14));
            this.f2.c(sb2, z12, true);
        }
        if (z10 && z17) {
            String b10 = this.j2.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 != this.T1 || (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0)) == this.H0) {
                return;
            }
            P(w02);
            this.T1 = this.H0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ch.w(this, 8), 50L);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void v() {
        this.q2 = true;
        d1();
    }
}
