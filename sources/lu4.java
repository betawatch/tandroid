// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lu4 extends fx0 {
    public static final int[] G1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public nj A1;
    public int B1;
    public int C1;
    public final nna D1;
    public final cm2[] E1;
    public final cm2[] F1;
    public final ge0 l1;
    public final TL_stars.TL_starGiftUnique m1;
    public final String n1;
    public final long o1;
    public final xf5 p1;
    public final TextView q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final TextView t1;
    public final TextView u1;
    public final u41 v1;
    public final hn w1;
    public final ImageView x1;
    public final ImageView y1;
    public final lj9 z1;

    public lu4(final int i, final long j, nna nnaVar, final wjb wjbVar, final Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(1, wjbVar, context, true);
        long j2;
        boolean z;
        byte b;
        TLRPC.User V1;
        lj9 lj9Var = new lj9((byte) 4);
        tg2[] tg2VarArr = (tg2[]) lj9Var.b;
        this.z1 = lj9Var;
        this.E1 = new cm2[1];
        this.F1 = new cm2[1];
        this.a = i;
        this.o1 = j;
        this.m1 = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.n1 = ls6.m(tL_starGiftUnique.num, ',', sb);
        this.D1 = nnaVar;
        this.E = true;
        this.Q0 = true;
        int i2 = bkb.Z6;
        t0(i2);
        M(i2);
        this.b0 = i2;
        gta v = gta.v(i, true);
        if (v.b) {
            a.t();
            if (w01.a()) {
                j2 = 0;
            } else {
                a.q();
                TL_stars.StarsAmount m = v.m();
                j2 = 0;
                if (m.nanos == 0 && m.amount == 0) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
            j2 = 0;
        }
        if (j > j2 && na7.q1(i).W1(j) == null && (V1 = na7.q1(i).V1(Long.valueOf(j))) != null) {
            na7.q1(i).Z2(V1, 0, false, null);
        }
        gr grVar = na7.q1(i).k4;
        long j3 = tL_starGiftUnique.offer_min_stars;
        oj ojVar = oj.a;
        nj h = nj.h(j3, ojVar);
        boolean z2 = z;
        nj h2 = nj.h(Math.max(h.a() << 1, grVar.p.f()), ojVar);
        oj ojVar2 = oj.b;
        nj j4 = nj.j(Math.max(h.e(ojVar2).o(2).b, grVar.q.f()), ojVar2);
        nj j5 = nj.j(Math.max(j4.b << 1, grVar.r.f()), ojVar2);
        oj ojVar3 = h.a;
        if (ojVar3 != h2.a) {
            b = 4;
        } else {
            b = 4;
            tg2VarArr[ojVar3.ordinal()] = new tg2(h, h2, b);
        }
        oj ojVar4 = j4.a;
        if (ojVar4 == j5.a) {
            tg2VarArr[ojVar4.ordinal()] = new tg2(j4, j5, b);
        }
        LinearLayout j6 = de9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131749669, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(8388627);
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar);
        j6.addView(textView, nme.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.r1 = editTextBoldCursor;
        if (z2) {
            xf5 xf5Var = new xf5(context, wjbVar);
            this.p1 = xf5Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(k96.M0(2131744136, null));
            arrayList.add(k96.M0(2131744135, null));
            xf5Var.b(arrayList, new re1(this, (byte) 2));
            j6.addView(xf5Var, nme.k(16.0f, 0.0f, 16.0f, 14.0f, -1, -2));
        } else {
            this.p1 = null;
        }
        LinearLayout D0 = iq7.D0(context, wjbVar);
        j6.addView(D0, nme.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        this.q1 = textView2;
        ir2.t(textView2, 1, 15.0f);
        zkb.X(textView2, bkb.K6, wjbVar);
        D0.addView(textView2, nme.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        D0.addView(frameLayout, nme.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        this.x1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        frameLayout.addView(imageView, nme.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.y1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        frameLayout.addView(imageView2, nme.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        editTextBoldCursor.setCursorSize(gl.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        int i4 = bkb.n6;
        editTextBoldCursor.setCursorColor(bkb.v0(i4, wjbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(bkb.v0(bkb.G6, wjbVar));
        zkb.X(editTextBoldCursor, i3, wjbVar);
        frameLayout.addView(editTextBoldCursor, nme.d(-1, -1.0f, kk7.D1, 50.0f, 0.0f, 120.0f, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.w1 = hnVar;
        int i5 = bkb.x6;
        zkb.U(hnVar, i5, wjbVar);
        hnVar.setTextSize(gl.L(17.0f));
        hnVar.setGravity(5);
        frameLayout.addView(hnVar, nme.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.s1 = textView3;
        textView3.setTextSize(1, 14.0f);
        j6.addView(textView3, nme.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout D02 = iq7.D0(context, wjbVar);
        D02.setOrientation(0);
        D02.setGravity(16);
        j6.addView(D02, nme.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        tb4.u(16.0f, 2131749713, 1, textView4, null);
        zkb.X(textView4, i3, wjbVar);
        TextView m2 = ug8.m(D02, textView4, nme.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.t1 = m2;
        m2.setTextSize(1, 16.0f);
        m2.setGravity(16);
        m2.setCompoundDrawablePadding(gl.L(4.0f));
        zkb.X(m2, i4, wjbVar);
        D02.addView(m2, nme.t(-2, -1, 16, 0, 0, 14, 0));
        D02.setOnClickListener(new yj3(this, (byte) 22));
        TextView textView5 = new TextView(context);
        this.u1 = textView5;
        textView5.setTextSize(1, 14.0f);
        zkb.X(textView5, i5, wjbVar);
        j6.addView(textView5, nme.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        u41 i6 = yjb.i(24, wjbVar, context, true);
        this.v1 = i6;
        i6.setOnClickListener(new View.OnClickListener() { // from class: gu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7;
                lu4 lu4Var;
                int i8;
                lu4 lu4Var2 = lu4.this;
                if (lu4Var2.v1.e0) {
                    int i9 = i;
                    if (na7.q1(i9).t2()) {
                        h5.b(i9);
                        return;
                    }
                    gta u = gta.u(i9, lu4Var2.A1.a);
                    nj m3 = u.e ? nj.m(u.m()) : null;
                    oj ojVar5 = oj.a;
                    oj ojVar6 = oj.b;
                    if (m3 != null) {
                        long j7 = m3.b;
                        nj njVar = lu4Var2.A1;
                        if (j7 >= njVar.b) {
                            String str = lu4Var2.n1;
                            long j8 = lu4Var2.o1;
                            String d = njVar.d();
                            final boolean z3 = lu4Var2.A1.a == ojVar6;
                            LinearLayout linearLayout = new LinearLayout(lu4Var2.getContext());
                            linearLayout.setOrientation(1);
                            TextView textView6 = new TextView(lu4Var2.getContext());
                            textView6.setText(k96.M0(2131749715, null));
                            int i10 = bkb.i5;
                            tb4.w(textView6, i10, lu4Var2.J0, 1, 20.0f);
                            linearLayout.addView(textView6, nme.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView7 = new TextView(lu4Var2.getContext());
                            zkb.X(textView7, i10, lu4Var2.J0);
                            textView7.setTextSize(1, 16.0f);
                            textView7.setText(gl.S2(lu4Var2.A1.a == ojVar5 ? k96.a0(null, null, 2131749666, d, cf3.s(j8), str) : k96.a0(null, null, 2131749665, d, cf3.s(j8), str)));
                            linearLayout.addView(textView7, nme.t(-1, -2, 48, 24, 4, 24, 4));
                            mfb mfbVar = new mfb(lu4Var2.getContext(), lu4Var2.J0);
                            final long K1 = na7.q1(lu4Var2.a).K1(j8);
                            final nj h3 = nj.h(K1, ojVar5);
                            mfbVar.f(k96.M0(2131749687, null), jva.a1(z3, k96.a0(null, null, 2131749723, d), 0.8f, null), null, null);
                            if (K1 > 0) {
                                i7 = 0;
                                mfbVar.f(k96.M0(2131749688, null), jva.a1(false, k96.a0(null, null, 2131749723, h3.d()), 0.8f, null), null, null);
                            } else {
                                i7 = 0;
                            }
                            mfbVar.f(k96.M0(2131749689, null), k96.G(lu4Var2.B1 / 3600, "GiftOfferHours", new Object[i7]), null, null);
                            linearLayout.addView(mfbVar, nme.t(-1, -2, 48, 23, 16, 23, 4));
                            z3a.B(lu4Var2.a);
                            final long D = z3a.D();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (K1 == 0) {
                                spannableStringBuilder.append((CharSequence) jva.U0(k96.a0(null, null, 2131749695, d), z3));
                                lu4Var = lu4Var2;
                                i8 = 0;
                            } else if (z3) {
                                spannableStringBuilder.append(k96.V(null, null, 2131749694, jva.U0(k96.a0(null, null, 2131749693, d), true), jva.S0(k96.a0(null, null, 2131749693, h3.d()))));
                                lu4Var = lu4Var2;
                                i8 = 0;
                            } else {
                                lu4Var = lu4Var2;
                                String d2 = nj.j(lu4Var2.A1.b + h3.b, ojVar5).d();
                                i8 = 0;
                                spannableStringBuilder.append((CharSequence) jva.S0(k96.a0(null, null, 2131749695, d2)));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i8, lu4Var.J0, lu4Var.getContext());
                            alertDialog$Builder.n(linearLayout);
                            final lu4 lu4Var3 = lu4Var;
                            alertDialog$Builder.j(spannableStringBuilder, new ed() { // from class: ju4
                                @Override // ed
                                public final void u(hd hdVar, int i11) {
                                    long j9 = K1;
                                    lu4 lu4Var4 = lu4.this;
                                    if (j9 > 0) {
                                        int i12 = lu4Var4.a;
                                        oj ojVar7 = oj.a;
                                        gta u2 = gta.u(i12, ojVar7);
                                        nj m4 = u2.e ? nj.m(u2.m()) : null;
                                        nj h4 = z3 ? nj.h(j9, ojVar7) : nj.j(lu4Var4.A1.b + h3.b, ojVar7);
                                        if (m4 == null || m4.b < h4.b) {
                                            new zua(lu4Var4.getContext(), lu4Var4.J0, h4.a(), 14, null, null, lu4Var4.o1).show();
                                            return;
                                        }
                                    }
                                    c01 g = hdVar.g(-1, true, true);
                                    g.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = lu4Var4.A1.q();
                                    tL_sendStarGiftOffer.peer = na7.q1(lu4Var4.a).h1(lu4Var4.o1);
                                    tL_sendStarGiftOffer.duration = lu4Var4.B1;
                                    tL_sendStarGiftOffer.slug = lu4Var4.m1.slug;
                                    tL_sendStarGiftOffer.random_id = D;
                                    if (j9 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j9;
                                    }
                                    ConnectionsManager.getInstance(lu4Var4.a).sendRequestTyped(tL_sendStarGiftOffer, new p((Object) lu4Var4, (Object) g, (Object) hdVar, (byte) 11));
                                }
                            });
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.Y0 = true;
                            hdVar.show();
                            return;
                        }
                    }
                    nj njVar2 = lu4Var2.A1;
                    oj ojVar7 = njVar2.a;
                    Context context2 = context;
                    wjb wjbVar2 = wjbVar;
                    if (ojVar7 == ojVar5) {
                        new zua(context2, wjbVar2, njVar2.a(), 14, null, null, j).show();
                    } else if (ojVar7 == ojVar6) {
                        new xdb(context2, wjbVar2, njVar2, null).show();
                    }
                }
            }
        });
        j6.addView(i6, nme.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = j6;
        ge0 ge0Var = new ge0(i, wjbVar, context);
        this.l1 = ge0Var;
        ote.a(ge0Var);
        ge0Var.setOnClickListener(new hu4(this, context, wjbVar, (byte) 0));
        this.c.addView(ge0Var, nme.d(-2, -2.0f, 49, 0.0f, (gl.m / gl.p) + 8.0f, 0.0f, 0.0f));
        E0(nj.j(0L, ojVar), false, true, false);
        F0(86400, false);
        editTextBoldCursor.addTextChangedListener(new ku4(this));
    }

    public final void D0(boolean z) {
        boolean z2 = this.C1 == 0 && this.A1.b > 0;
        u41 u41Var = this.v1;
        if (u41Var.e0 != z2) {
            u41Var.setEnabled(z2);
            u41Var.setClickable(z2);
            if (z) {
                ug8.s(u41Var.animate(), z2 ? 1.0f : 0.6f, 180L);
            } else {
                u41Var.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void E0(nj njVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        nj njVar2 = njVar;
        oj ojVar = oj.a;
        oj ojVar2 = oj.b;
        nj njVar3 = this.A1;
        int i = this.C1;
        this.C1 = 0;
        if (njVar2 != null) {
            this.A1 = njVar2;
        } else {
            njVar2 = nj.j(0L, njVar3.a);
            this.A1 = njVar2;
            this.C1 |= 1;
        }
        long j = ((nj) ((tg2[]) this.z1.b)[njVar2.a.ordinal()].c).b;
        nj njVar4 = this.A1;
        if (j < njVar4.b) {
            this.C1 |= 4;
        }
        if (!njVar4.l() && ((nj) ((tg2[]) this.z1.b)[this.A1.a.ordinal()].b).b > this.A1.b) {
            this.C1 |= 2;
        }
        boolean z5 = z2 || njVar3.a != this.A1.a;
        boolean z6 = z2 || njVar3.b != this.A1.b;
        boolean z7 = z2 || i != this.C1;
        if (z5) {
            ImageView imageView = this.y1;
            lj9 lj9Var = this.z1;
            TextView textView = this.u1;
            EditTextBoldCursor editTextBoldCursor = this.r1;
            xf5 xf5Var = this.p1;
            boolean z8 = false;
            if (xf5Var != null) {
                xf5Var.a(this.A1.a == ojVar ? 0 : 1, z3);
            }
            String s = cf3.s(this.o1);
            oj ojVar3 = this.A1.a;
            if (ojVar3 == ojVar) {
                de9.r(null, null, 2131749712, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nj) ((tg2[]) lj9Var.b)[this.A1.a.ordinal()].c).a()).length())});
            } else if (ojVar3 == ojVar2) {
                de9.r(null, null, 2131749711, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nj) ((tg2[]) lj9Var.b)[this.A1.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView2 = this.x1;
            if (z3) {
                imageView2.animate().alpha(this.A1.a == ojVar ? 1.0f : 0.0f).scaleX(this.A1.a == ojVar ? 1.0f : 0.0f).scaleY(this.A1.a == ojVar ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.A1.a == ojVar2 ? 1.0f : 0.0f).scaleX(this.A1.a == ojVar2 ? 1.0f : 0.0f).scaleY(this.A1.a == ojVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.A1.a == ojVar ? 1.0f : 0.0f);
                imageView.setAlpha(this.A1.a == ojVar2 ? 1.0f : 0.0f);
            }
            ge0 ge0Var = this.l1;
            z4 = z8;
            if (ge0Var != null) {
                oj ojVar4 = this.A1.a;
                z4 = z8;
                if (ge0Var.e != ojVar4) {
                    ge0Var.e = ojVar4;
                    ge0Var.b();
                    z4 = z8;
                }
            }
        } else {
            z4 = 0;
        }
        if (z5 || z7) {
            this.q1.setText(k96.M0(this.A1.a == ojVar ? 2131749682 : 2131749674, null));
            lj9 lj9Var2 = this.z1;
            String str = this.n1;
            TextView textView2 = this.s1;
            oj ojVar5 = this.A1.a;
            int i2 = this.C1;
            if ((i2 & 4) != 0) {
                int i3 = ojVar5 == ojVar ? 2131749680 : 2131749672;
                String d = ((nj) ((tg2[]) lj9Var2.b)[ojVar5.ordinal()].c).o(2).d();
                Object[] objArr = new Object[2];
                objArr[z4] = d;
                objArr[1] = str;
                de9.r(null, null, i3, objArr, textView2);
            } else if ((i2 & 2) != 0) {
                int i4 = ojVar5 == ojVar ? 2131749679 : 2131749671;
                String d2 = ((nj) ((tg2[]) lj9Var2.b)[ojVar5.ordinal()].b).p().d();
                Object[] objArr2 = new Object[2];
                objArr2[z4] = d2;
                objArr2[1] = str;
                de9.r(null, null, i4, objArr2, textView2);
            } else {
                int i5 = ojVar5 == ojVar ? 2131749681 : 2131749673;
                Object[] objArr3 = new Object[1];
                objArr3[z4] = str;
                de9.r(null, null, i5, objArr3, textView2);
            }
            boolean z9 = (this.C1 & (-9)) != 0 ? true : z4;
            zkb.X(textView2, z9 ? bkb.p7 : bkb.x6, this.J0);
            zkb.X(this.r1, z9 ? bkb.p7 : bkb.F6, this.J0);
        }
        if (z5 || z6 || z7) {
            nj njVar5 = this.A1;
            boolean z10 = njVar5.a == ojVar2 ? true : z4;
            u41 u41Var = this.v1;
            Object[] objArr4 = new Object[1];
            objArr4[z4] = z10 ? njVar5.b() : k96.E(njVar5.a(), ',');
            u41Var.i(jva.s1(jva.Y0(z10, k96.a0(null, null, 2131749716, objArr4), z10 ? this.F1 : this.E1), z10), z3, true);
            D0(z3);
        }
        if (z5 || z6) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            oj ojVar6 = this.A1.a;
            int i6 = this.a;
            double d3 = ojVar6 == ojVar2 ? na7.q1(i6).k4.k.i : na7.q1(i6).k4.s3.i * 1.0E-5d;
            ci0.h();
            sb.append(ci0.f("USD", 2, (long) (this.A1.c() * d3 * 100.0d), z4));
            this.w1.c(sb, z3, true);
        }
        if (z && z6) {
            String b = this.A1.b();
            this.r1.setText(b);
            this.r1.setSelection(b.length());
        }
    }

    public final void F0(int i, boolean z) {
        if (this.B1 != i) {
            this.B1 = i;
            String G = k96.G(i / 3600, "GiftOfferHours", new Object[0]);
            TextView textView = this.t1;
            textView.setText(G);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrows_select).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.n6, this.J0), PorterDuff.Mode.SRC_IN));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        D0(z);
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        gl.d3(new iu4(this, (byte) 0), 50L);
    }
}
