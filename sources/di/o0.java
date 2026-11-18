package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m30;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o0 extends org.telegram.ui.ActionBar.x2 {
    public static final int[] H1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final cb.c A1;
    public cg.a B1;
    public int C1;
    public int D1;
    public final k1 E1;
    public final lq[] F1;
    public final lq[] G1;
    public final b m1;
    public final TL_stars.TL_starGiftUnique n1;
    public final String o1;
    public final long p1;
    public final m30 q1;
    public final TextView r1;
    public final EditTextBoldCursor s1;
    public final TextView t1;
    public final TextView u1;
    public final TextView v1;
    public final hi.d w1;
    public final org.telegram.ui.Components.n6 x1;
    public final ImageView y1;
    public final ImageView z1;

    public o0(final int i7, final long j3, final Context context, k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        boolean z10;
        TLRPC.User c22;
        cb.c cVar = new cb.c(10);
        q4.q[] qVarArr = (q4.q[]) cVar.b;
        this.A1 = cVar;
        this.F1 = new lq[1];
        this.G1 = new lq[1];
        this.a = i7;
        this.p1 = j3;
        this.n1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.o1 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
        this.E1 = k1Var;
        this.E = true;
        this.Q0 = true;
        int i10 = org.telegram.ui.ActionBar.n6.a7;
        w0(i10);
        Q(i10);
        this.b0 = i10;
        boolean j10 = x8.y(i7, true).j();
        if (j3 > 0 && mp.u1(i7).d2(j3) == null && (c22 = mp.u1(i7).c2(Long.valueOf(j3))) != null) {
            mp.u1(i7).c3(c22, 0, false, null);
        }
        org.telegram.messenger.p0 p0Var = mp.u1(i7).A7;
        long j11 = tL_starGiftUnique.offer_min_stars;
        cg.b bVar = cg.b.a;
        cg.a h = cg.a.h(j11, bVar);
        cg.a h7 = cg.a.h(Math.max(h.a() * 2, ((org.telegram.messenger.j0) p0Var.q.b).c), bVar);
        cg.b bVar2 = cg.b.b;
        cg.a j12 = cg.a.j(Math.max(h.e(bVar2).o(2).b, ((org.telegram.messenger.l0) p0Var.r.b).c), bVar2);
        cg.a j13 = cg.a.j(Math.max(j12.b * 2, ((org.telegram.messenger.l0) p0Var.s.b).c), bVar2);
        cg.b bVar3 = h.a;
        int i11 = 12;
        if (bVar3 != h7.a) {
            z10 = false;
        } else {
            z10 = false;
            qVarArr[bVar3.ordinal()] = new q4.q(h, h7, z10, i11);
        }
        cg.b bVar4 = j12.a;
        if (bVar4 == j13.a) {
            qVarArr[bVar4.ordinal()] = new q4.q(j12, j13, z10, i11);
        }
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131749669, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(8388627);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i12, i6Var);
        g10.addView(textView, c8.ma.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.s1 = editTextBoldCursor;
        if (j10) {
            m30 m30Var = new m30(context, i6Var);
            this.q1 = m30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(gd.M0(2131744142, null));
            arrayList.add(gd.M0(2131744141, null));
            m30Var.b(arrayList, new k0(this, 0));
            g10.addView(m30Var, c8.ma.k(16.0f, 0.0f, 16.0f, 14.0f, -1, -2));
        } else {
            this.q1 = null;
        }
        LinearLayout J0 = bi.a5.J0(context, i6Var);
        g10.addView(J0, c8.ma.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r1 = textView2;
        i5.c.x(textView2, 1, 15.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.L6, i6Var);
        J0.addView(textView2, c8.ma.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        J0.addView(frameLayout, c8.ma.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        this.y1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        frameLayout.addView(imageView, c8.ma.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.z1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        frameLayout.addView(imageView2, c8.ma.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        int i13 = org.telegram.ui.ActionBar.n6.o6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, i6Var));
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i12, i6Var);
        frameLayout.addView(editTextBoldCursor, c8.ma.d(-1, -1.0f, ks.E1, 50.0f, 0.0f, 120.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.x1 = n6Var;
        int i14 = org.telegram.ui.ActionBar.n6.y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i14, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        n6Var.setGravity(5);
        frameLayout.addView(n6Var, c8.ma.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.t1 = textView3;
        textView3.setTextSize(1, 14.0f);
        g10.addView(textView3, c8.ma.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout J02 = bi.a5.J0(context, i6Var);
        J02.setOrientation(0);
        J02.setGravity(16);
        g10.addView(J02, c8.ma.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        n10.l(16.0f, 2131749713, 1, textView4, null);
        org.telegram.ui.ActionBar.u6.U(textView4, i12, i6Var);
        TextView f10 = n10.f(J02, textView4, c8.ma.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.u1 = f10;
        f10.setTextSize(1, 16.0f);
        f10.setGravity(16);
        f10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.U(f10, i13, i6Var);
        J02.addView(f10, c8.ma.t(-2, -1, 16, 0, 0, 14, 0));
        J02.setOnClickListener(new ah.d(this, 12));
        TextView textView5 = new TextView(context);
        this.v1 = textView5;
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView5, i14, i6Var);
        g10.addView(textView5, c8.ma.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        hi.d g11 = n10.g(24, context, i6Var, true);
        this.w1 = g11;
        g11.setOnClickListener(new View.OnClickListener() { // from class: di.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                boolean z11;
                int i15;
                boolean z12;
                long j14;
                int i16;
                final o0 o0Var = o0.this;
                if (o0Var.w1.e0) {
                    int i17 = i7;
                    if (mp.u1(i17).A2()) {
                        org.telegram.ui.b.b(i17);
                        return;
                    }
                    x8 x10 = x8.x(i17, o0Var.B1.a);
                    cg.a m10 = x10.e ? cg.a.m(x10.p()) : null;
                    cg.b bVar5 = cg.b.a;
                    cg.b bVar6 = cg.b.b;
                    if (m10 != null) {
                        long j15 = m10.b;
                        cg.a aVar = o0Var.B1;
                        if (j15 >= aVar.b) {
                            String str2 = o0Var.o1;
                            long j16 = o0Var.p1;
                            String d = aVar.d();
                            if (o0Var.B1.a == bVar6) {
                                str = str2;
                                z11 = true;
                            } else {
                                str = str2;
                                z11 = false;
                            }
                            LinearLayout linearLayout = new LinearLayout(o0Var.getContext());
                            linearLayout.setOrientation(1);
                            TextView textView6 = new TextView(o0Var.getContext());
                            textView6.setText(gd.M0(2131749715, null));
                            int i18 = org.telegram.ui.ActionBar.n6.j5;
                            org.telegram.messenger.f3.l(textView6, i18, o0Var.J0, 1, 20.0f);
                            linearLayout.addView(textView6, c8.ma.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView7 = new TextView(o0Var.getContext());
                            org.telegram.ui.ActionBar.u6.U(textView7, i18, o0Var.J0);
                            textView7.setTextSize(1, 16.0f);
                            textView7.setText(org.telegram.messenger.g0.W2(o0Var.B1.a == bVar5 ? gd.a0(null, null, 2131749666, d, org.telegram.messenger.n5.t(j16), str) : gd.a0(null, null, 2131749665, d, org.telegram.messenger.n5.t(j16), str)));
                            linearLayout.addView(textView7, c8.ma.t(-1, -2, 48, 24, 4, 24, 4));
                            cy0 cy0Var = new cy0(o0Var.getContext(), o0Var.J0);
                            final long P1 = mp.u1(o0Var.a).P1(j16);
                            final cg.a h10 = cg.a.h(P1, bVar5);
                            cy0Var.e(gd.M0(2131749687, null), pb.b1(z11, gd.a0(null, null, 2131749723, d), 0.8f, null), null, null);
                            if (P1 > 0) {
                                i15 = 0;
                                cy0Var.e(gd.M0(2131749688, null), pb.b1(false, gd.a0(null, null, 2131749723, h10.d()), 0.8f, null), null, null);
                            } else {
                                i15 = 0;
                            }
                            cy0Var.e(gd.M0(2131749689, null), gd.G(o0Var.C1 / 3600, "GiftOfferHours", new Object[i15]), null, null);
                            linearLayout.addView(cy0Var, c8.ma.t(-1, -2, 48, 23, 16, 23, 4));
                            zy.C(o0Var.a);
                            long E = zy.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (P1 == 0) {
                                spannableStringBuilder.append((CharSequence) pb.V0(gd.a0(null, null, 2131749695, d), z11));
                                z12 = z11;
                                j14 = E;
                                i16 = 0;
                            } else if (z11) {
                                spannableStringBuilder.append(gd.V(null, null, 2131749694, pb.V0(gd.a0(null, null, 2131749693, d), true), pb.T0(gd.a0(null, null, 2131749693, h10.d()))));
                                z12 = z11;
                                j14 = E;
                                i16 = 0;
                            } else {
                                z12 = z11;
                                j14 = E;
                                i16 = 0;
                                spannableStringBuilder.append((CharSequence) pb.T0(gd.a0(null, null, 2131749695, cg.a.j(o0Var.B1.b + h10.b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i16, o0Var.getContext(), o0Var.J0);
                            alertDialog$Builder.o(linearLayout);
                            final boolean z13 = z12;
                            final long j17 = j14;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.r1() { // from class: di.m0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i19) {
                                    long j18 = P1;
                                    o0 o0Var2 = o0.this;
                                    if (j18 > 0) {
                                        int i20 = o0Var2.a;
                                        cg.b bVar7 = cg.b.a;
                                        x8 x11 = x8.x(i20, bVar7);
                                        cg.a m11 = x11.e ? cg.a.m(x11.p()) : null;
                                        cg.a h11 = z13 ? cg.a.h(j18, bVar7) : cg.a.j(o0Var2.B1.b + h10.b, bVar7);
                                        if (m11 == null || m11.b < h11.b) {
                                            new fb(o0Var2.getContext(), o0Var2.J0, h11.a(), 14, null, null, o0Var2.p1).show();
                                            return;
                                        }
                                    }
                                    vf.b h12 = u1Var.h(-1, true, true);
                                    h12.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = o0Var2.B1.q();
                                    tL_sendStarGiftOffer.peer = mp.u1(o0Var2.a).l1(o0Var2.p1);
                                    tL_sendStarGiftOffer.duration = o0Var2.C1;
                                    tL_sendStarGiftOffer.slug = o0Var2.n1.slug;
                                    tL_sendStarGiftOffer.random_id = j17;
                                    if (j18 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j18;
                                    }
                                    ConnectionsManager.getInstance(o0Var2.a).sendRequestTyped(tL_sendStarGiftOffer, new bi.h0(o0Var2, h12, u1Var, 3));
                                }
                            });
                            alertDialog$Builder.h(gd.M0(2131752578, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.Y0 = true;
                            u1Var.show();
                            return;
                        }
                    }
                    cg.a aVar2 = o0Var.B1;
                    cg.b bVar7 = aVar2.a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    if (bVar7 == bVar5) {
                        new fb(context2, i6Var2, aVar2.a(), 14, null, null, j3).show();
                    } else if (bVar7 == bVar6) {
                        new ii.s(context2, i6Var2, aVar2, true, null).show();
                    }
                }
            }
        });
        g10.addView(g11, c8.ma.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = g10;
        b bVar5 = new b(i7, context, i6Var);
        this.m1 = bVar5;
        c8.ra.a(bVar5);
        bVar5.setOnClickListener(new ah.h(this, context, i6Var, 6));
        this.c.addView(bVar5, c8.ma.d(-2, -2.0f, 49, 0.0f, (org.telegram.messenger.g0.m / org.telegram.messenger.g0.p) + 8.0f, 0.0f, 0.0f));
        K0(cg.a.j(0L, bVar), false, true, false);
        L0(86400, false);
        editTextBoldCursor.addTextChangedListener(new n0(this));
    }

    public final void J0(boolean z10) {
        boolean z11 = this.D1 == 0 && this.B1.b > 0;
        hi.d dVar = this.w1;
        if (dVar.e0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                n10.n(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v8 */
    public final void K0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i7;
        boolean z14;
        boolean z15;
        cg.a aVar2 = this.B1;
        int i10 = this.D1;
        this.D1 = 0;
        if (aVar != null) {
            this.B1 = aVar;
        } else {
            this.B1 = cg.a.j(0L, aVar2.a);
            this.D1 |= 1;
        }
        cg.b bVar = this.B1.a;
        cb.c cVar = this.A1;
        q4.q[] qVarArr = (q4.q[]) cVar.b;
        q4.q[] qVarArr2 = (q4.q[]) cVar.b;
        long j3 = ((cg.a) qVarArr[bVar.ordinal()].c).b;
        cg.a aVar3 = this.B1;
        if (j3 < aVar3.b) {
            this.D1 |= 4;
        }
        if (!aVar3.l() && ((cg.a) qVarArr2[this.B1.a.ordinal()].b).b > this.B1.b) {
            this.D1 |= 2;
        }
        boolean z16 = z11 || aVar2.a != this.B1.a;
        boolean z17 = z11 || aVar2.b != this.B1.b;
        boolean z18 = z11 || i10 != this.D1;
        cg.b bVar2 = cg.b.a;
        cg.b bVar3 = cg.b.b;
        EditTextBoldCursor editTextBoldCursor = this.s1;
        if (z16) {
            m30 m30Var = this.q1;
            if (m30Var != null) {
                m30Var.a(this.B1.a == bVar2 ? 0 : 1, z12);
            }
            String t6 = org.telegram.messenger.n5.t(this.p1);
            cg.b bVar4 = this.B1.a;
            TextView textView = this.v1;
            if (bVar4 == bVar2) {
                org.telegram.messenger.f3.q(null, null, 2131749712, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr2[this.B1.a.ordinal()].c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.f3.q(null, null, 2131749711, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr2[this.B1.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.z1;
            ImageView imageView2 = this.y1;
            if (z12) {
                z15 = false;
                i7 = 1;
                imageView2.animate().alpha(this.B1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.B1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.B1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.B1.a == bVar3 ? 1.0f : 0.0f).scaleX(this.B1.a == bVar3 ? 1.0f : 0.0f).scaleY(this.B1.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z15 = false;
                i7 = 1;
                imageView2.setAlpha(this.B1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.B1.a == bVar3 ? 1.0f : 0.0f);
            }
            b bVar5 = this.m1;
            z13 = z15;
            if (bVar5 != null) {
                cg.b bVar6 = this.B1.a;
                z13 = z15;
                if (bVar5.e != bVar6) {
                    bVar5.e = bVar6;
                    bVar5.b();
                    z13 = z15;
                }
            }
        } else {
            z13 = false;
            i7 = 1;
        }
        if (z16 || z18) {
            this.r1.setText(gd.M0(this.B1.a == bVar2 ? 2131749682 : 2131749674, null));
            cg.b bVar7 = this.B1.a;
            int i11 = this.D1;
            int i12 = i11 & 4;
            String str = this.o1;
            boolean z19 = z13;
            TextView textView2 = this.t1;
            if (i12 != 0) {
                int i13 = bVar7 == bVar2 ? 2131749680 : 2131749672;
                String d = ((cg.a) qVarArr2[bVar7.ordinal()].c).o(2).d();
                Object[] objArr = new Object[2];
                objArr[z19 ? 1 : 0] = d;
                objArr[i7] = str;
                org.telegram.messenger.f3.q(null, null, i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar7 == bVar2 ? 2131749679 : 2131749671;
                String d2 = ((cg.a) qVarArr2[bVar7.ordinal()].b).p().d();
                Object[] objArr2 = new Object[2];
                objArr2[z19 ? 1 : 0] = d2;
                objArr2[i7] = str;
                org.telegram.messenger.f3.q(null, null, i14, objArr2, textView2);
            } else {
                int i15 = bVar7 == bVar2 ? 2131749681 : 2131749673;
                Object[] objArr3 = new Object[i7];
                objArr3[z19 ? 1 : 0] = str;
                org.telegram.messenger.f3.q(null, null, i15, objArr3, textView2);
            }
            boolean z20 = (this.D1 & (-9)) != 0 ? true : z19 ? 1 : 0;
            org.telegram.ui.ActionBar.u6.U(textView2, z20 ? org.telegram.ui.ActionBar.n6.q7 : org.telegram.ui.ActionBar.n6.y6, this.J0);
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, z20 ? org.telegram.ui.ActionBar.n6.q7 : org.telegram.ui.ActionBar.n6.G6, this.J0);
            z14 = z19;
        } else {
            z14 = z13;
        }
        if (z16 || z17 || z18) {
            cg.a aVar4 = this.B1;
            boolean z21 = aVar4.a == bVar3 ? true : z14;
            Object[] objArr4 = new Object[1];
            objArr4[z14] = z21 ? aVar4.b() : gd.E(aVar4.a(), ',');
            this.w1.i(pb.t1(pb.Z0(z21, gd.a0(null, null, 2131749716, objArr4), z21 ? this.G1 : this.F1), z21), z12, true);
            J0(z12);
        }
        if (z16 || z17) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d10 = this.B1.a == bVar3 ? ((org.telegram.messenger.i0) mp.u1(this.a).A7.l.b).a : mp.u1(this.a).f6 * 1.0E-5d;
            org.telegram.messenger.r1 i16 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.B1.c() * d10 * 100.0d);
            i16.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, c10, z14));
            this.x1.c(sb2, z12, true);
        }
        if (z10 && z17) {
            String b10 = this.B1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    public final void L0(int i7, boolean z10) {
        if (this.C1 != i7) {
            this.C1 = i7;
            String G = gd.G(i7 / 3600, "GiftOfferHours", new Object[0]);
            TextView textView = this.u1;
            textView.setText(G);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrows_select).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.o6, this.J0), PorterDuff.Mode.SRC_IN));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        J0(z10);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new ca.r(this, 12), 50L);
    }
}
