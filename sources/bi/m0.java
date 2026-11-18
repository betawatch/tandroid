package bi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import di.pb;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.o9;
import org.telegram.messenger.q9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.js0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m0 extends sa implements t9 {
    public static final nc[] l2 = new nc[1];
    public static final by0[] m2 = new by0[1];
    public final TL_stars.StarGift T1;
    public final long U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final nc Y1;
    public final nc Z1;
    public final nc a2;
    public final nc b2;
    public final by0 c2;
    public final h0 d2;
    public final TableRow e2;
    public final hi.d f2;
    public final k80 g2;
    public final k80 h2;
    public q9 i2;
    public final CharSequence j2;
    public z41 k2;

    public m0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, i6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i7;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.T1 = starGift;
        long j10 = starGift.id;
        this.U1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.v1 = 0.2f;
        O();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        kVar.I(-1, false);
        kVar.setOccupyStatusBar(false);
        e1(kVar, context, i6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.addView(kVar, ma.o(-1, -2));
        linearLayout.addView(frameLayout);
        i0 i0Var = new i0(this.a, context, i6Var);
        i0Var.d0 = true;
        i0Var.h(starGift, false, false, false, false, false);
        i0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        i0Var.setImageLayer(7);
        i0Var.K.setVisibility(8);
        frameLayout.addView(i0Var, ma.d(ks.O1, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        linearLayout.addView(textView, ma.t(-1, -2, 17, 20, 0, 20, 6));
        k80 k80Var = new k80(context, null);
        this.g2 = k80Var;
        k80Var.setGravity(17);
        k80Var.setText(TextUtils.concat(org.telegram.messenger.g0.W2(gd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.M0(2131750341, null), new f0(0, context, starGift, i6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        k80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, i11, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.J6;
        org.telegram.ui.ActionBar.u6.G(k80Var, i12, i6Var);
        linearLayout.addView(k80Var, ma.t(-1, -2, 17, 20, 0, 20, 4));
        cy0 cy0Var = new cy0(context, i6Var);
        String M0 = gd.M0(2131750307, null);
        nc[] ncVarArr = l2;
        cy0Var.e(M0, "", null, ncVarArr);
        this.Y1 = ncVarArr[0];
        cy0Var.e(gd.M0(2131750308, null), "", null, ncVarArr);
        this.Z1 = ncVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(cy0Var, ma.e(-1, -2, ks.E1));
        this.d2 = new h0(this, new hi.m3[1], frameLayout2, 0);
        TableRow e10 = cy0Var.e(gd.M0(2131749413, null), "", null, ncVarArr);
        this.e2 = e10;
        final int i13 = 1;
        e10.setOnClickListener(new View.OnClickListener(this) { // from class: bi.g0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        new ug.z0(40, this.b.getContext(), (org.telegram.ui.ActionBar.i6) null).show();
                        break;
                    default:
                        this.b.g1();
                        break;
                }
            }
        });
        this.a2 = ncVarArr[0];
        by0[] by0VarArr = m2;
        cy0Var.e("", "", by0VarArr, ncVarArr);
        this.b2 = ncVarArr[0];
        this.c2 = by0VarArr[0];
        linearLayout.addView(frameLayout2, ma.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        k80 k80Var2 = new k80(context, i6Var);
        this.h2 = k80Var2;
        k80Var2.setGravity(17);
        k80Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var2, i12, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var2, i12, i6Var);
        k80Var2.setOnClickListener(new ah.h(this, new boolean[1], i6Var, 4));
        ra.b(k80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(starGift.sticker, k80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.j2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.j2 = "";
        }
        hi.d dVar = new hi.d(context, i6Var, true);
        this.f2 = dVar;
        dVar.f();
        final int i14 = z10;
        dVar.setOnClickListener(new a0(this, j3, context, i6Var, runnable, 0));
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.u0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.b.addView(dVar, d);
        ck0 ck0Var = this.o1;
        int i17 = this.u0;
        ck0Var.setPadding(i17, i14, i17, org.telegram.messenger.g0.L(64.0f));
        this.k2.O(i14);
        q9 l10 = u9.c(this.a).l(j10, this);
        this.i2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                cy0Var.e(gd.M0(2131750315, null), gd.E(this.i2.f.total_rounds, ','), null, null);
            } else {
                String M02 = gd.M0(2131750316, null);
                String E = gd.E(this.i2.f.current_round, ',');
                String E2 = gd.E(this.i2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = E;
                objArr[1] = E2;
                cy0Var.e(M02, gd.a0(null, null, 2131747635, objArr), null, null);
            }
        }
        q9 q9Var = this.i2;
        if (q9Var != null && (tL_starGiftAuctionState = q9Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i18 = i14; i18 < size; i18++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.i2.f.rounds.get(i18);
                if (i18 < size - 1) {
                    i7 = 1;
                    i10 = this.i2.f.rounds.get(i18 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.i2.f.total_rounds;
                }
                int i19 = starGiftAuctionRound.num;
                if (i19 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i14] = Integer.valueOf(i19);
                    a02 = gd.a0(null, null, 2131750314, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i19);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i14] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = gd.a0(null, null, 2131750312, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = gd.c0(starGiftAuctionRound.duration);
                    String c03 = gd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i14] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = gd.a0(null, null, 2131750313, objArr4);
                } else {
                    G = gd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i14]);
                }
                cy0Var.e(a02, G, null, null);
            }
        }
        q9 q9Var2 = this.i2;
        if (q9Var2 != null && q9Var2.h != null) {
            k0 k0Var = new k0(this, context, i6Var, new b0(this, i14), new o(1), new o(1), new o(1), new o(1), new o(1), new o(1));
            k0Var.d(new di.e5(1, 1));
            k0Var.setPreviewingAttributes(this.i2.h);
            k0Var.removeView(k0Var.Q);
            this.W1.addView(k0Var, i14, ma.e(-1, ks.L4, 48));
            TextView textView2 = new TextView(context);
            this.X1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            q9 q9Var3 = this.i2;
            if (q9Var3.g != null) {
                textView2.setText(gd.M0(2131750347, null));
            } else if (q9Var3.g(ConnectionsManager.getInstance(j10.t0).getCurrentTime())) {
                textView2.setText(gd.M0(2131750112, null));
            } else {
                textView2.setText(gd.M0(2131750113, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.n6.b0(i14, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i14, org.telegram.messenger.g0.L(12.0f), i14);
            TextView m10 = org.telegram.ui.Cells.c0.m(this.W1, textView2, ma.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            m10.setTypeface(org.telegram.messenger.g0.o());
            m10.setTextSize(1, 21.0f);
            m10.setText(str2);
            m10.setGravity(17);
            m10.setTextColor(-1);
            TextView m11 = org.telegram.ui.Cells.c0.m(this.W1, m10, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            m11.setTextSize(1, 13.0f);
            m11.setText(org.telegram.messenger.g0.I2(gd.M0(2131750334, null), i14, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            m11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            m11.setGravity(17);
            m11.setTextColor(-1342177281);
            m11.setOnClickListener(new View.OnClickListener(this) { // from class: bi.g0
                public final /* synthetic */ m0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new ug.z0(40, this.b.getContext(), (org.telegram.ui.ActionBar.i6) null).show();
                            break;
                        default:
                            this.b.g1();
                            break;
                    }
                }
            });
            ra.b(m11, 0.02f, 1.5f);
            this.W1.addView(m11, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            i0Var.setVisibility(8);
            textView.setVisibility(8);
            this.g2.setVisibility(8);
            k80 k80Var3 = new k80(context, i6Var);
            k80Var3.setGravity(17);
            k80Var3.setTextSize(1, 16.0f);
            int i20 = org.telegram.ui.ActionBar.n6.J6;
            org.telegram.ui.ActionBar.u6.U(k80Var3, i20, i6Var);
            org.telegram.ui.ActionBar.u6.G(k80Var3, i20, i6Var);
            k80Var3.setOnClickListener(new ah.h(this, context, i6Var, 3));
            ra.b(k80Var3, 0.02f, 1.5f);
            this.V1.addView(k80Var3, ma.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(cg.d.c(TL_stars.starGiftAttributeModel.class, this.i2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i21 = i14; i21 < 3; i21++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) pVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(stargiftattributemodel.document, k80Var3.getPaint().getFontMetricsInt()), i21, i21 + 1, 33);
                }
            }
            String E3 = gd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = E3;
            k80Var3.setText(org.telegram.messenger.g0.I2(gd.V(null, null, 2131750302, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.V1.addView(this.h2, ma.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        i1(i14);
    }

    public static void e1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new l0(context, starGift, i6Var));
        org.telegram.ui.ActionBar.r0 a10 = kVar.t().a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(gd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, R.drawable.msg_info, gd.M0(2131748139, null));
        a10.e(3, R.drawable.menu_feature_links, gd.M0(2131751751, null));
        a10.e(2, R.drawable.msg_share, gd.M0(2131745263, null));
    }

    public static void f1(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, long j3, long j10, d2 d2Var) {
        u9 c10 = u9.c(i7);
        z zVar = new z(context, i6Var, i7, j3, d2Var);
        q9 b10 = c10.b(j10);
        if (b10 != null) {
            zVar.a(b10, null);
            return;
        }
        o9 o9Var = new o9(c10, zVar, j10, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j10;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new org.telegram.messenger.z3(2, c10, o9Var));
    }

    public static void h1(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, null, false);
        org.telegram.ui.ActionBar.i2 i2Var = j3.y0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        imageView.setBackground(shapeDrawable);
        org.telegram.ui.ActionBar.u6.j(imageView, shapeDrawable, M, null, i6Var);
        linearLayout.addView(imageView, ma.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(gd.M0(2131749802, null));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        linearLayout.addView(textView, ma.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        n10.l(14.0f, 2131749801, 1, textView2, null);
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        linearLayout.addView(textView2, ma.t(-1, -2, 17, 20, 0, 20, 16));
        js0 js0Var = new js0(context, i6Var);
        int i11 = starGift.gifts_per_round;
        js0Var.a.l(gd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        js0Var.b.setText(gd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
        js0Var.d.setVisibility(8);
        ImageView imageView2 = js0Var.c;
        imageView2.setImageResource(R.drawable.menu_top_bidders_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, i6Var, mode);
        linearLayout.addView(js0Var, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        js0 js0Var2 = new js0(context, i6Var);
        js0Var2.a.l(gd.M0(2131749808, null), false);
        js0Var2.b.setText(gd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
        js0Var2.d.setVisibility(8);
        ImageView imageView3 = js0Var2.c;
        imageView3.setImageResource(R.drawable.menu_carryover_24);
        org.telegram.ui.ActionBar.u6.s(imageView3, i10, i6Var, mode);
        linearLayout.addView(js0Var2, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        js0 js0Var3 = new js0(context, i6Var);
        js0Var3.a.l(gd.M0(2131749804, null), false);
        js0Var3.b.setText(gd.M0(2131749803, null));
        js0Var3.d.setVisibility(8);
        ImageView imageView4 = js0Var3.c;
        imageView4.setImageResource(R.drawable.menu_bid_refund_24);
        org.telegram.ui.ActionBar.u6.s(imageView4, i10, i6Var, mode);
        linearLayout.addView(js0Var3, ma.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.setOnClickListener(new d0(0, i2Var));
        dVar.i(di.f6.t2(gd.M0(2131743651, null)), false, true);
        linearLayout.addView(dVar, ma.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        j3.O = linearLayout;
        j3.show();
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.a, 0, true, new b(this, 3), this.J0);
        this.k2 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return "";
    }

    @Override // org.telegram.messenger.t9
    public final void c(q9 q9Var) {
        this.i2 = q9Var;
        i1(true);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        u9.c(this.a).n(this.U1, this);
        super.dismiss();
    }

    public final void g1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        q9 q9Var = this.i2;
        if (q9Var == null || (tL_starGiftAuctionStateFinished = q9Var.g) == null || q9Var.d.title == null) {
            return;
        }
        this.d2.a(this.a2, gd.a0(null, null, 2131750273, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.i2.d.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i7;
        int i10;
        int i11;
        q9 q9Var;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        q9 q9Var2 = this.i2;
        nc ncVar = this.Z1;
        nc ncVar2 = this.Y1;
        hi.d dVar = this.f2;
        if (q9Var2 != null && (tL_starGiftAuctionStateFinished = q9Var2.g) != null) {
            ncVar2.setText(gd.x(tL_starGiftAuctionStateFinished.start_date, true));
            ncVar.setText(gd.x(this.i2.g.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pb.b1(false, i5.c.l(this.i2.g.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) oc.b("?", new b0(this, 1), this.J0, null));
            this.a2.setText(spannableStringBuilder);
        } else if (q9Var2 != null && (tL_starGiftAuctionState = q9Var2.f) != null) {
            ncVar2.setText(gd.x(tL_starGiftAuctionState.start_date, true));
            ncVar.setText(gd.x(this.i2.f.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            if (this.i2.g(currentTime)) {
                dVar.g(gd.a0(null, null, 2131750319, gd.c0(this.i2.f.start_date - currentTime)), z10);
            } else {
                dVar.g(gd.a0(null, null, 2131750305, gd.c0(this.i2.f.end_date - currentTime)), z10);
            }
        }
        q9 q9Var3 = this.i2;
        TL_stars.StarGift starGift = this.T1;
        if (q9Var3 != null) {
            if (q9Var3.f()) {
                i7 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.i2.f;
                if (tL_starGiftAuctionState2 != null) {
                    i7 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i10 = starGift.availability_total;
            nc ncVar3 = this.b2;
            by0 by0Var = this.c2;
            if (i7 != i10) {
                by0Var.setText(gd.M0(2131750317, null));
                ncVar3.setText(gd.E(i10, ','));
            } else {
                by0Var.setText(gd.M0(2131750318, null));
                ncVar3.setText(gd.G(i7, "Gift2Availability4Value", gd.E(i10, ',')));
            }
            i11 = this.i2.e.acquired_count;
            k80 k80Var = this.h2;
            if (i11 <= 0) {
                k80Var.setVisibility(0);
                k80Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(gd.F("Gift2AuctionsItemsBought2", i11, this.j2), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            } else {
                k80Var.setVisibility(8);
            }
            q9Var = this.i2;
            tableRow = this.e2;
            if ((q9Var != null || q9Var.g == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.i(gd.M0(2131750335, null), z10, true);
            }
            String M0 = gd.M0(2131750348, null);
            k80 k80Var2 = this.g2;
            k80Var2.setText(M0);
            org.telegram.ui.ActionBar.u6.U(k80Var2, org.telegram.ui.ActionBar.n6.q7, this.J0);
            tableRow.setVisibility(0);
            dVar.i(gd.M0(2131747638, null), z10, true);
            dVar.g(null, z10);
            return;
        }
        i7 = starGift.availability_remains;
        i10 = starGift.availability_total;
        nc ncVar32 = this.b2;
        by0 by0Var2 = this.c2;
        if (i7 != i10) {
        }
        i11 = this.i2.e.acquired_count;
        k80 k80Var3 = this.h2;
        if (i11 <= 0) {
        }
        q9Var = this.i2;
        tableRow = this.e2;
        if (q9Var != null) {
        }
        tableRow.setVisibility(8);
        dVar.i(gd.M0(2131750335, null), z10, true);
    }
}
