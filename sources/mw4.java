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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mw4 extends my0 {
    public static final int[] G1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public nk A1;
    public int B1;
    public int C1;
    public final npa D1;
    public final pn2[] E1;
    public final pn2[] F1;
    public final gf0 l1;
    public final TL_stars.TL_starGiftUnique m1;
    public final String n1;
    public final long o1;
    public final wh5 p1;
    public final TextView q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final TextView t1;
    public final TextView u1;
    public final b61 v1;
    public final io w1;
    public final ImageView x1;
    public final ImageView y1;
    public final nl9 z1;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0079, code lost:
    
        if (r8.amount == 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mw4(final int i, final long j, npa npaVar, final ylb ylbVar, final Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(1, ylbVar, context, true);
        boolean z;
        boolean z2;
        nk h;
        nk j2;
        ok okVar;
        ok okVar2;
        TLRPC.User W1;
        nl9 nl9Var = new nl9((byte) 4);
        lx6[] lx6VarArr = (lx6[]) nl9Var.b;
        this.z1 = nl9Var;
        this.E1 = new pn2[1];
        this.F1 = new pn2[1];
        this.a = i;
        this.o1 = j;
        this.m1 = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.n1 = kt6.m(tL_starGiftUnique.num, ',', sb);
        this.D1 = npaVar;
        this.E = true;
        this.Q0 = true;
        int i2 = cmb.Z6;
        t0(i2);
        L(i2);
        this.b0 = i2;
        jva v = jva.v(i, true);
        if (v.b) {
            a.t();
            if (!e21.a()) {
                a.q();
                TL_stars.StarsAmount m = v.m();
                if (m.nanos == 0) {
                }
            }
            z = true;
            if (j > 0 && oc7.r1(i).X1(j) == null && (W1 = oc7.r1(i).W1(Long.valueOf(j))) != null) {
                oc7.r1(i).b3(W1, 0, false, null);
            }
            gs gsVar = oc7.r1(i).l4;
            long j3 = tL_starGiftUnique.offer_min_stars;
            ok okVar3 = ok.a;
            nk h2 = nk.h(j3, okVar3);
            z2 = z;
            h = nk.h(Math.max(h2.a() << 1, gsVar.p.f()), okVar3);
            ok okVar4 = ok.b;
            nk j4 = nk.j(Math.max(h2.e(okVar4).o(2).b, gsVar.q.f()), okVar4);
            j2 = nk.j(Math.max(j4.b << 1, gsVar.r.f()), okVar4);
            okVar = h2.a;
            byte b = 3;
            if (okVar == h.a) {
                lx6VarArr[okVar.ordinal()] = new lx6(h2, h, b);
            }
            okVar2 = j4.a;
            if (okVar2 == j2.a) {
                lx6VarArr[okVar2.ordinal()] = new lx6(j4, j2, b);
            }
            LinearLayout i3 = hg9.i(context, 1);
            TextView textView = new TextView(context);
            textView.setText(jb6.M0(2131749618, null));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(gm.o());
            textView.setGravity(8388627);
            int i4 = cmb.F6;
            anb.X(textView, i4, ylbVar);
            i3.addView(textView, qoe.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.r1 = editTextBoldCursor;
            if (z2) {
                this.p1 = null;
            } else {
                wh5 wh5Var = new wh5(context, ylbVar);
                this.p1 = wh5Var;
                ArrayList arrayList = new ArrayList();
                arrayList.add(jb6.M0(2131744062, null));
                arrayList.add(jb6.M0(2131744061, null));
                wh5Var.b(arrayList, new zf1(this, (byte) 2));
                i3.addView(wh5Var, qoe.k(16.0f, 0.0f, 16.0f, 14.0f, -1, -2));
            }
            LinearLayout D0 = ls7.D0(context, ylbVar);
            i3.addView(D0, qoe.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(context);
            this.q1 = textView2;
            ts2.s(textView2, 1, 15.0f);
            anb.X(textView2, cmb.K6, ylbVar);
            D0.addView(textView2, qoe.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            D0.addView(frameLayout, qoe.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
            ImageView imageView = new ImageView(context);
            this.x1 = imageView;
            imageView.setImageResource(R.drawable.star_small_inner);
            frameLayout.addView(imageView, qoe.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.y1 = imageView2;
            imageView2.setImageResource(R.drawable.mini_gram_72);
            frameLayout.addView(imageView2, qoe.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
            editTextBoldCursor.setCursorSize(gm.L(22.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setImeOptions(268435462);
            editTextBoldCursor.setTextSize(1, 20.0f);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setPadding(0, 0, 0, 0);
            int i5 = cmb.n6;
            editTextBoldCursor.setCursorColor(cmb.v0(i5, ylbVar));
            editTextBoldCursor.setHintText("0");
            editTextBoldCursor.setHintColor(cmb.v0(cmb.G6, ylbVar));
            anb.X(editTextBoldCursor, i4, ylbVar);
            frameLayout.addView(editTextBoldCursor, qoe.d(-1, -1.0f, nm7.D1, 50.0f, 0.0f, 120.0f, 0.0f));
            io ioVar = new io(context, false, false, false);
            this.w1 = ioVar;
            int i6 = cmb.x6;
            anb.U(ioVar, i6, ylbVar);
            ioVar.setTextSize(gm.L(17.0f));
            ioVar.setGravity(5);
            frameLayout.addView(ioVar, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.s1 = textView3;
            textView3.setTextSize(1, 14.0f);
            i3.addView(textView3, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
            LinearLayout D02 = ls7.D0(context, ylbVar);
            D02.setOrientation(0);
            D02.setGravity(16);
            i3.addView(D02, qoe.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
            TextView textView4 = new TextView(context);
            td4.v(16.0f, 2131749662, 1, textView4, null);
            anb.X(textView4, i4, ylbVar);
            TextView m2 = wi8.m(D02, textView4, qoe.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
            this.t1 = m2;
            m2.setTextSize(1, 16.0f);
            m2.setGravity(16);
            m2.setCompoundDrawablePadding(gm.L(4.0f));
            anb.X(m2, i5, ylbVar);
            D02.addView(m2, qoe.t(-2, -1, 16, 0, 0, 14, 0));
            D02.setOnClickListener(new sf3(this, (byte) 25));
            TextView textView5 = new TextView(context);
            this.u1 = textView5;
            textView5.setTextSize(1, 14.0f);
            anb.X(textView5, i6, ylbVar);
            i3.addView(textView5, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
            b61 i7 = mlb.i(24, ylbVar, context, true);
            this.v1 = i7;
            i7.setOnClickListener(new View.OnClickListener() { // from class: iw4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i8;
                    mw4 mw4Var;
                    int i9;
                    mw4 mw4Var2 = mw4.this;
                    if (mw4Var2.v1.e0) {
                        int i10 = i;
                        if (oc7.r1(i10).u2()) {
                            h5.b(i10);
                            return;
                        }
                        jva u = jva.u(i10, mw4Var2.A1.a);
                        nk m3 = u.e ? nk.m(u.m()) : null;
                        ok okVar5 = ok.a;
                        ok okVar6 = ok.b;
                        if (m3 != null) {
                            long j5 = m3.b;
                            nk nkVar = mw4Var2.A1;
                            if (j5 >= nkVar.b) {
                                String str = mw4Var2.n1;
                                long j6 = mw4Var2.o1;
                                String d = nkVar.d();
                                final boolean z3 = mw4Var2.A1.a == okVar6;
                                LinearLayout linearLayout = new LinearLayout(mw4Var2.getContext());
                                linearLayout.setOrientation(1);
                                TextView textView6 = new TextView(mw4Var2.getContext());
                                textView6.setText(jb6.M0(2131749664, null));
                                int i11 = cmb.i5;
                                td4.x(textView6, i11, mw4Var2.J0, 1, 20.0f);
                                linearLayout.addView(textView6, qoe.t(-1, -2, 48, 24, 4, 24, 14));
                                TextView textView7 = new TextView(mw4Var2.getContext());
                                anb.X(textView7, i11, mw4Var2.J0);
                                textView7.setTextSize(1, 16.0f);
                                textView7.setText(gm.S2(mw4Var2.A1.a == okVar5 ? jb6.a0(null, null, 2131749615, d, pg3.s(j6), str) : jb6.a0(null, null, 2131749614, d, pg3.s(j6), str)));
                                linearLayout.addView(textView7, qoe.t(-1, -2, 48, 24, 4, 24, 4));
                                mhb mhbVar = new mhb(mw4Var2.getContext(), mw4Var2.J0);
                                final long L1 = oc7.r1(mw4Var2.a).L1(j6);
                                final nk h3 = nk.h(L1, okVar5);
                                mhbVar.f(jb6.M0(2131749636, null), nxa.b1(z3, jb6.a0(null, null, 2131749672, d), 0.8f, null), null, null);
                                if (L1 > 0) {
                                    i8 = 0;
                                    mhbVar.f(jb6.M0(2131749637, null), nxa.b1(false, jb6.a0(null, null, 2131749672, h3.d()), 0.8f, null), null, null);
                                } else {
                                    i8 = 0;
                                }
                                mhbVar.f(jb6.M0(2131749638, null), jb6.G(mw4Var2.B1 / 3600, "GiftOfferHours", new Object[i8]), null, null);
                                linearLayout.addView(mhbVar, qoe.t(-1, -2, 48, 23, 16, 23, 4));
                                a6a.B(mw4Var2.a);
                                final long D = a6a.D();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                if (L1 == 0) {
                                    spannableStringBuilder.append((CharSequence) nxa.V0(jb6.a0(null, null, 2131749644, d), z3));
                                    mw4Var = mw4Var2;
                                    i9 = 0;
                                } else if (z3) {
                                    spannableStringBuilder.append(jb6.V(null, null, 2131749643, nxa.V0(jb6.a0(null, null, 2131749642, d), true), nxa.T0(jb6.a0(null, null, 2131749642, h3.d()))));
                                    mw4Var = mw4Var2;
                                    i9 = 0;
                                } else {
                                    mw4Var = mw4Var2;
                                    String d2 = nk.j(mw4Var2.A1.b + h3.b, okVar5).d();
                                    i9 = 0;
                                    spannableStringBuilder.append((CharSequence) nxa.T0(jb6.a0(null, null, 2131749644, d2)));
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9, mw4Var.J0, mw4Var.getContext());
                                alertDialog$Builder.n(linearLayout);
                                final mw4 mw4Var3 = mw4Var;
                                alertDialog$Builder.j(spannableStringBuilder, new ee() { // from class: kw4
                                    @Override // ee
                                    public final void r(he heVar, int i12) {
                                        long j7 = L1;
                                        mw4 mw4Var4 = mw4.this;
                                        if (j7 > 0) {
                                            int i13 = mw4Var4.a;
                                            ok okVar7 = ok.a;
                                            jva u2 = jva.u(i13, okVar7);
                                            nk m4 = u2.e ? nk.m(u2.m()) : null;
                                            nk h4 = z3 ? nk.h(j7, okVar7) : nk.j(mw4Var4.A1.b + h3.b, okVar7);
                                            if (m4 == null || m4.b < h4.b) {
                                                new dxa(mw4Var4.getContext(), mw4Var4.J0, h4.a(), 14, null, null, mw4Var4.o1).show();
                                                return;
                                            }
                                        }
                                        k11 g = heVar.g(-1, true, true);
                                        g.d();
                                        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                        tL_sendStarGiftOffer.price = mw4Var4.A1.q();
                                        tL_sendStarGiftOffer.peer = oc7.r1(mw4Var4.a).i1(mw4Var4.o1);
                                        tL_sendStarGiftOffer.duration = mw4Var4.B1;
                                        tL_sendStarGiftOffer.slug = mw4Var4.m1.slug;
                                        tL_sendStarGiftOffer.random_id = D;
                                        if (j7 > 0) {
                                            tL_sendStarGiftOffer.flags |= 1;
                                            tL_sendStarGiftOffer.allow_paid_stars = j7;
                                        }
                                        ConnectionsManager.getInstance(mw4Var4.a).sendRequestTyped(tL_sendStarGiftOffer, new p((Object) mw4Var4, (Object) g, (Object) heVar, (byte) 11));
                                    }
                                });
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                he heVar = alertDialog$Builder.a;
                                heVar.Y0 = true;
                                heVar.show();
                                return;
                            }
                        }
                        nk nkVar2 = mw4Var2.A1;
                        ok okVar7 = nkVar2.a;
                        Context context2 = context;
                        ylb ylbVar2 = ylbVar;
                        if (okVar7 == okVar5) {
                            new dxa(context2, ylbVar2, nkVar2.a(), 14, null, null, j).show();
                        } else if (okVar7 == okVar6) {
                            new xfb(context2, ylbVar2, nkVar2, null).show();
                        }
                    }
                }
            });
            i3.addView(i7, qoe.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
            this.O = i3;
            gf0 gf0Var = new gf0(i, ylbVar, context);
            this.l1 = gf0Var;
            rve.a(gf0Var);
            gf0Var.setOnClickListener(new jw4(this, context, ylbVar, (byte) 0));
            this.c.addView(gf0Var, qoe.d(-2, -2.0f, 49, 0.0f, (gm.m / gm.p) + 8.0f, 0.0f, 0.0f));
            E0(nk.j(0L, okVar3), false, true, false);
            F0(86400, false);
            editTextBoldCursor.addTextChangedListener(new lw4(this));
        }
        z = false;
        if (j > 0) {
            oc7.r1(i).b3(W1, 0, false, null);
        }
        gs gsVar2 = oc7.r1(i).l4;
        long j32 = tL_starGiftUnique.offer_min_stars;
        ok okVar32 = ok.a;
        nk h22 = nk.h(j32, okVar32);
        z2 = z;
        h = nk.h(Math.max(h22.a() << 1, gsVar2.p.f()), okVar32);
        ok okVar42 = ok.b;
        nk j42 = nk.j(Math.max(h22.e(okVar42).o(2).b, gsVar2.q.f()), okVar42);
        j2 = nk.j(Math.max(j42.b << 1, gsVar2.r.f()), okVar42);
        okVar = h22.a;
        byte b2 = 3;
        if (okVar == h.a) {
        }
        okVar2 = j42.a;
        if (okVar2 == j2.a) {
        }
        LinearLayout i32 = hg9.i(context, 1);
        TextView textView6 = new TextView(context);
        textView6.setText(jb6.M0(2131749618, null));
        textView6.setTextSize(1, 20.0f);
        textView6.setTypeface(gm.o());
        textView6.setGravity(8388627);
        int i42 = cmb.F6;
        anb.X(textView6, i42, ylbVar);
        i32.addView(textView6, qoe.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.r1 = editTextBoldCursor2;
        if (z2) {
        }
        LinearLayout D03 = ls7.D0(context, ylbVar);
        i32.addView(D03, qoe.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView22 = new TextView(context);
        this.q1 = textView22;
        ts2.s(textView22, 1, 15.0f);
        anb.X(textView22, cmb.K6, ylbVar);
        D03.addView(textView22, qoe.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        D03.addView(frameLayout2, qoe.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView3 = new ImageView(context);
        this.x1 = imageView3;
        imageView3.setImageResource(R.drawable.star_small_inner);
        frameLayout2.addView(imageView3, qoe.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView22 = new ImageView(context);
        this.y1 = imageView22;
        imageView22.setImageResource(R.drawable.mini_gram_72);
        frameLayout2.addView(imageView22, qoe.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        editTextBoldCursor2.setCursorSize(gm.L(22.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 20.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setSingleLine(true);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(0, 0, 0, 0);
        int i52 = cmb.n6;
        editTextBoldCursor2.setCursorColor(cmb.v0(i52, ylbVar));
        editTextBoldCursor2.setHintText("0");
        editTextBoldCursor2.setHintColor(cmb.v0(cmb.G6, ylbVar));
        anb.X(editTextBoldCursor2, i42, ylbVar);
        frameLayout2.addView(editTextBoldCursor2, qoe.d(-1, -1.0f, nm7.D1, 50.0f, 0.0f, 120.0f, 0.0f));
        io ioVar2 = new io(context, false, false, false);
        this.w1 = ioVar2;
        int i62 = cmb.x6;
        anb.U(ioVar2, i62, ylbVar);
        ioVar2.setTextSize(gm.L(17.0f));
        ioVar2.setGravity(5);
        frameLayout2.addView(ioVar2, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        TextView textView32 = new TextView(context);
        this.s1 = textView32;
        textView32.setTextSize(1, 14.0f);
        i32.addView(textView32, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout D022 = ls7.D0(context, ylbVar);
        D022.setOrientation(0);
        D022.setGravity(16);
        i32.addView(D022, qoe.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView42 = new TextView(context);
        td4.v(16.0f, 2131749662, 1, textView42, null);
        anb.X(textView42, i42, ylbVar);
        TextView m22 = wi8.m(D022, textView42, qoe.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.t1 = m22;
        m22.setTextSize(1, 16.0f);
        m22.setGravity(16);
        m22.setCompoundDrawablePadding(gm.L(4.0f));
        anb.X(m22, i52, ylbVar);
        D022.addView(m22, qoe.t(-2, -1, 16, 0, 0, 14, 0));
        D022.setOnClickListener(new sf3(this, (byte) 25));
        TextView textView52 = new TextView(context);
        this.u1 = textView52;
        textView52.setTextSize(1, 14.0f);
        anb.X(textView52, i62, ylbVar);
        i32.addView(textView52, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        b61 i72 = mlb.i(24, ylbVar, context, true);
        this.v1 = i72;
        i72.setOnClickListener(new View.OnClickListener() { // from class: iw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8;
                mw4 mw4Var;
                int i9;
                mw4 mw4Var2 = mw4.this;
                if (mw4Var2.v1.e0) {
                    int i10 = i;
                    if (oc7.r1(i10).u2()) {
                        h5.b(i10);
                        return;
                    }
                    jva u = jva.u(i10, mw4Var2.A1.a);
                    nk m3 = u.e ? nk.m(u.m()) : null;
                    ok okVar5 = ok.a;
                    ok okVar6 = ok.b;
                    if (m3 != null) {
                        long j5 = m3.b;
                        nk nkVar = mw4Var2.A1;
                        if (j5 >= nkVar.b) {
                            String str = mw4Var2.n1;
                            long j6 = mw4Var2.o1;
                            String d = nkVar.d();
                            final boolean z3 = mw4Var2.A1.a == okVar6;
                            LinearLayout linearLayout = new LinearLayout(mw4Var2.getContext());
                            linearLayout.setOrientation(1);
                            TextView textView62 = new TextView(mw4Var2.getContext());
                            textView62.setText(jb6.M0(2131749664, null));
                            int i11 = cmb.i5;
                            td4.x(textView62, i11, mw4Var2.J0, 1, 20.0f);
                            linearLayout.addView(textView62, qoe.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView7 = new TextView(mw4Var2.getContext());
                            anb.X(textView7, i11, mw4Var2.J0);
                            textView7.setTextSize(1, 16.0f);
                            textView7.setText(gm.S2(mw4Var2.A1.a == okVar5 ? jb6.a0(null, null, 2131749615, d, pg3.s(j6), str) : jb6.a0(null, null, 2131749614, d, pg3.s(j6), str)));
                            linearLayout.addView(textView7, qoe.t(-1, -2, 48, 24, 4, 24, 4));
                            mhb mhbVar = new mhb(mw4Var2.getContext(), mw4Var2.J0);
                            final long L1 = oc7.r1(mw4Var2.a).L1(j6);
                            final nk h3 = nk.h(L1, okVar5);
                            mhbVar.f(jb6.M0(2131749636, null), nxa.b1(z3, jb6.a0(null, null, 2131749672, d), 0.8f, null), null, null);
                            if (L1 > 0) {
                                i8 = 0;
                                mhbVar.f(jb6.M0(2131749637, null), nxa.b1(false, jb6.a0(null, null, 2131749672, h3.d()), 0.8f, null), null, null);
                            } else {
                                i8 = 0;
                            }
                            mhbVar.f(jb6.M0(2131749638, null), jb6.G(mw4Var2.B1 / 3600, "GiftOfferHours", new Object[i8]), null, null);
                            linearLayout.addView(mhbVar, qoe.t(-1, -2, 48, 23, 16, 23, 4));
                            a6a.B(mw4Var2.a);
                            final long D = a6a.D();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (L1 == 0) {
                                spannableStringBuilder.append((CharSequence) nxa.V0(jb6.a0(null, null, 2131749644, d), z3));
                                mw4Var = mw4Var2;
                                i9 = 0;
                            } else if (z3) {
                                spannableStringBuilder.append(jb6.V(null, null, 2131749643, nxa.V0(jb6.a0(null, null, 2131749642, d), true), nxa.T0(jb6.a0(null, null, 2131749642, h3.d()))));
                                mw4Var = mw4Var2;
                                i9 = 0;
                            } else {
                                mw4Var = mw4Var2;
                                String d2 = nk.j(mw4Var2.A1.b + h3.b, okVar5).d();
                                i9 = 0;
                                spannableStringBuilder.append((CharSequence) nxa.T0(jb6.a0(null, null, 2131749644, d2)));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9, mw4Var.J0, mw4Var.getContext());
                            alertDialog$Builder.n(linearLayout);
                            final mw4 mw4Var3 = mw4Var;
                            alertDialog$Builder.j(spannableStringBuilder, new ee() { // from class: kw4
                                @Override // ee
                                public final void r(he heVar, int i12) {
                                    long j7 = L1;
                                    mw4 mw4Var4 = mw4.this;
                                    if (j7 > 0) {
                                        int i13 = mw4Var4.a;
                                        ok okVar7 = ok.a;
                                        jva u2 = jva.u(i13, okVar7);
                                        nk m4 = u2.e ? nk.m(u2.m()) : null;
                                        nk h4 = z3 ? nk.h(j7, okVar7) : nk.j(mw4Var4.A1.b + h3.b, okVar7);
                                        if (m4 == null || m4.b < h4.b) {
                                            new dxa(mw4Var4.getContext(), mw4Var4.J0, h4.a(), 14, null, null, mw4Var4.o1).show();
                                            return;
                                        }
                                    }
                                    k11 g = heVar.g(-1, true, true);
                                    g.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = mw4Var4.A1.q();
                                    tL_sendStarGiftOffer.peer = oc7.r1(mw4Var4.a).i1(mw4Var4.o1);
                                    tL_sendStarGiftOffer.duration = mw4Var4.B1;
                                    tL_sendStarGiftOffer.slug = mw4Var4.m1.slug;
                                    tL_sendStarGiftOffer.random_id = D;
                                    if (j7 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j7;
                                    }
                                    ConnectionsManager.getInstance(mw4Var4.a).sendRequestTyped(tL_sendStarGiftOffer, new p((Object) mw4Var4, (Object) g, (Object) heVar, (byte) 11));
                                }
                            });
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            he heVar = alertDialog$Builder.a;
                            heVar.Y0 = true;
                            heVar.show();
                            return;
                        }
                    }
                    nk nkVar2 = mw4Var2.A1;
                    ok okVar7 = nkVar2.a;
                    Context context2 = context;
                    ylb ylbVar2 = ylbVar;
                    if (okVar7 == okVar5) {
                        new dxa(context2, ylbVar2, nkVar2.a(), 14, null, null, j).show();
                    } else if (okVar7 == okVar6) {
                        new xfb(context2, ylbVar2, nkVar2, null).show();
                    }
                }
            }
        });
        i32.addView(i72, qoe.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = i32;
        gf0 gf0Var2 = new gf0(i, ylbVar, context);
        this.l1 = gf0Var2;
        rve.a(gf0Var2);
        gf0Var2.setOnClickListener(new jw4(this, context, ylbVar, (byte) 0));
        this.c.addView(gf0Var2, qoe.d(-2, -2.0f, 49, 0.0f, (gm.m / gm.p) + 8.0f, 0.0f, 0.0f));
        E0(nk.j(0L, okVar32), false, true, false);
        F0(86400, false);
        editTextBoldCursor2.addTextChangedListener(new lw4(this));
    }

    public final void D0(boolean z) {
        boolean z2 = this.C1 == 0 && this.A1.b > 0;
        b61 b61Var = this.v1;
        if (b61Var.e0 != z2) {
            b61Var.setEnabled(z2);
            b61Var.setClickable(z2);
            if (z) {
                wi8.s(b61Var.animate(), z2 ? 1.0f : 0.6f, 180L);
            } else {
                b61Var.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void E0(nk nkVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        nk nkVar2 = nkVar;
        ok okVar = ok.a;
        ok okVar2 = ok.b;
        nk nkVar3 = this.A1;
        int i = this.C1;
        this.C1 = 0;
        if (nkVar2 != null) {
            this.A1 = nkVar2;
        } else {
            nkVar2 = nk.j(0L, nkVar3.a);
            this.A1 = nkVar2;
            this.C1 |= 1;
        }
        long j = ((nk) ((lx6[]) this.z1.b)[nkVar2.a.ordinal()].c).b;
        nk nkVar4 = this.A1;
        if (j < nkVar4.b) {
            this.C1 |= 4;
        }
        if (!nkVar4.l() && ((nk) ((lx6[]) this.z1.b)[this.A1.a.ordinal()].b).b > this.A1.b) {
            this.C1 |= 2;
        }
        boolean z5 = z2 || nkVar3.a != this.A1.a;
        boolean z6 = z2 || nkVar3.b != this.A1.b;
        boolean z7 = z2 || i != this.C1;
        if (z5) {
            ImageView imageView = this.y1;
            nl9 nl9Var = this.z1;
            TextView textView = this.u1;
            EditTextBoldCursor editTextBoldCursor = this.r1;
            wh5 wh5Var = this.p1;
            boolean z8 = false;
            if (wh5Var != null) {
                wh5Var.a(this.A1.a == okVar ? 0 : 1, z3);
            }
            String s = pg3.s(this.o1);
            ok okVar3 = this.A1.a;
            if (okVar3 == okVar) {
                hg9.q(null, null, 2131749661, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nk) ((lx6[]) nl9Var.b)[this.A1.a.ordinal()].c).a()).length())});
            } else if (okVar3 == okVar2) {
                hg9.q(null, null, 2131749660, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nk) ((lx6[]) nl9Var.b)[this.A1.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView2 = this.x1;
            if (z3) {
                imageView2.animate().alpha(this.A1.a == okVar ? 1.0f : 0.0f).scaleX(this.A1.a == okVar ? 1.0f : 0.0f).scaleY(this.A1.a == okVar ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.A1.a == okVar2 ? 1.0f : 0.0f).scaleX(this.A1.a == okVar2 ? 1.0f : 0.0f).scaleY(this.A1.a == okVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.A1.a == okVar ? 1.0f : 0.0f);
                imageView.setAlpha(this.A1.a == okVar2 ? 1.0f : 0.0f);
            }
            gf0 gf0Var = this.l1;
            z4 = z8;
            if (gf0Var != null) {
                ok okVar4 = this.A1.a;
                z4 = z8;
                if (gf0Var.e != okVar4) {
                    gf0Var.e = okVar4;
                    gf0Var.b();
                    z4 = z8;
                }
            }
        } else {
            z4 = 0;
        }
        if (z5 || z7) {
            this.q1.setText(jb6.M0(this.A1.a == okVar ? 2131749631 : 2131749623, null));
            nl9 nl9Var2 = this.z1;
            String str = this.n1;
            TextView textView2 = this.s1;
            ok okVar5 = this.A1.a;
            int i2 = this.C1;
            if ((i2 & 4) != 0) {
                int i3 = okVar5 == okVar ? 2131749629 : 2131749621;
                String d = ((nk) ((lx6[]) nl9Var2.b)[okVar5.ordinal()].c).o(2).d();
                Object[] objArr = new Object[2];
                objArr[z4] = d;
                objArr[1] = str;
                hg9.q(null, null, i3, objArr, textView2);
            } else if ((i2 & 2) != 0) {
                int i4 = okVar5 == okVar ? 2131749628 : 2131749620;
                String d2 = ((nk) ((lx6[]) nl9Var2.b)[okVar5.ordinal()].b).p().d();
                Object[] objArr2 = new Object[2];
                objArr2[z4] = d2;
                objArr2[1] = str;
                hg9.q(null, null, i4, objArr2, textView2);
            } else {
                int i5 = okVar5 == okVar ? 2131749630 : 2131749622;
                Object[] objArr3 = new Object[1];
                objArr3[z4] = str;
                hg9.q(null, null, i5, objArr3, textView2);
            }
            boolean z9 = (this.C1 & (-9)) != 0 ? true : z4;
            anb.X(textView2, z9 ? cmb.p7 : cmb.x6, this.J0);
            anb.X(this.r1, z9 ? cmb.p7 : cmb.F6, this.J0);
        }
        if (z5 || z6 || z7) {
            nk nkVar5 = this.A1;
            boolean z10 = nkVar5.a == okVar2 ? true : z4;
            b61 b61Var = this.v1;
            Object[] objArr4 = new Object[1];
            objArr4[z4] = z10 ? nkVar5.b() : jb6.E(nkVar5.a(), ',');
            b61Var.i(nxa.t1(nxa.Z0(z10, jb6.a0(null, null, 2131749665, objArr4), z10 ? this.F1 : this.E1), z10), z3, true);
            D0(z3);
        }
        if (z5 || z6) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            ok okVar6 = this.A1.a;
            int i6 = this.a;
            double d3 = okVar6 == okVar2 ? oc7.r1(i6).l4.k.i : oc7.r1(i6).l4.s3.i * 1.0E-5d;
            cj0.h();
            sb.append(cj0.f("USD", 2, (long) (this.A1.c() * d3 * 100.0d), z4));
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
            String G = jb6.G(i / 3600, "GiftOfferHours", new Object[0]);
            TextView textView = this.t1;
            textView.setText(G);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrows_select).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.n6, this.J0), PorterDuff.Mode.SRC_IN));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        D0(z);
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        gm.d3(new qn4(this, (byte) 7), 50L);
    }
}
