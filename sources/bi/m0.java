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
import c8.na;
import di.mb;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.p9;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.fs0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m0 extends ja implements u9 {
    public static final ec[] l2 = new ec[1];
    public static final ux0[] m2 = new ux0[1];
    public final TL_stars.StarGift T1;
    public final long U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final ec Y1;
    public final ec Z1;
    public final ec a2;
    public final ec b2;
    public final ux0 c2;
    public final h0 d2;
    public final TableRow e2;
    public final hi.d f2;
    public final z70 g2;
    public final z70 h2;
    public r9 i2;
    public final CharSequence j2;
    public p41 k2;

    public m0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, e6Var);
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.H(-1, false);
        kVar.setOccupyStatusBar(false);
        d1(kVar, context, e6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.addView(kVar, c8.ja.o(-1, -2));
        linearLayout.addView(frameLayout);
        i0 i0Var = new i0(this.a, context, e6Var);
        i0Var.d0 = true;
        i0Var.h(starGift, false, false, false, false, false);
        i0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        i0Var.setImageLayer(7);
        i0Var.K.setVisibility(8);
        frameLayout.addView(i0Var, c8.ja.d(ns.O1, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 6));
        z70 z70Var = new z70(context, null);
        this.g2 = z70Var;
        z70Var.setGravity(17);
        z70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750357, null), new f0(context, e6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.j6.J6;
        org.telegram.ui.ActionBar.q6.G(z70Var, i12, e6Var);
        linearLayout.addView(z70Var, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
        vx0 vx0Var = new vx0(context, e6Var);
        String M0 = hd.M0(2131750323, null);
        ec[] ecVarArr = l2;
        vx0Var.c(M0, "", null, ecVarArr);
        this.Y1 = ecVarArr[0];
        vx0Var.c(hd.M0(2131750324, null), "", null, ecVarArr);
        this.Z1 = ecVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(vx0Var, c8.ja.e(-1, -2, ns.E1));
        this.d2 = new h0(this, new hi.l3[1], frameLayout2, 0);
        TableRow c10 = vx0Var.c(hd.M0(2131749588, null), "", null, ecVarArr);
        this.e2 = c10;
        final int i13 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: bi.g0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        new ug.x0(40, this.b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                        break;
                    default:
                        this.b.f1();
                        break;
                }
            }
        });
        this.a2 = ecVarArr[0];
        ux0[] ux0VarArr = m2;
        vx0Var.c("", "", ux0VarArr, ecVarArr);
        this.b2 = ecVarArr[0];
        this.c2 = ux0VarArr[0];
        linearLayout.addView(frameLayout2, c8.ja.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        z70 z70Var2 = new z70(context, e6Var);
        this.h2 = z70Var2;
        z70Var2.setGravity(17);
        z70Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var2, i12, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i12, e6Var);
        z70Var2.setOnClickListener(new ah.g(this, new boolean[1], e6Var, 4));
        na.b(z70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(starGift.sticker, z70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.j2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.j2 = "";
        }
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f2 = dVar;
        dVar.f();
        final int i14 = z10;
        dVar.setOnClickListener(new a0(this, j3, context, e6Var, runnable, 0));
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.u0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.b.addView(dVar, d);
        uj0 uj0Var = this.o1;
        int i17 = this.u0;
        uj0Var.setPadding(i17, i14, i17, org.telegram.messenger.g0.L(64.0f));
        this.k2.O(i14);
        r9 l10 = v9.c(this.a).l(j10, this);
        this.i2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                vx0Var.c(hd.M0(2131750331, null), hd.E(this.i2.f.total_rounds, ','), null, null);
            } else {
                String M02 = hd.M0(2131750332, null);
                String E = hd.E(this.i2.f.current_round, ',');
                String E2 = hd.E(this.i2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = E;
                objArr[1] = E2;
                vx0Var.c(M02, hd.a0(null, null, 2131747828, objArr), null, null);
            }
        }
        r9 r9Var = this.i2;
        if (r9Var != null && (tL_starGiftAuctionState = r9Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
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
                    a02 = hd.a0(null, null, 2131750330, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i19);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i14] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = hd.a0(null, null, 2131750328, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = hd.c0(starGiftAuctionRound.duration);
                    String c03 = hd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i14] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = hd.a0(null, null, 2131750329, objArr4);
                } else {
                    G = hd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i14]);
                }
                vx0Var.c(a02, G, null, null);
            }
        }
        r9 r9Var2 = this.i2;
        if (r9Var2 != null && r9Var2.h != null) {
            int i20 = 1;
            k0 k0Var = new k0(this, context, e6Var, new b0(this, i14), new o(i20), new o(i20), new o(i20), new o(i20), new o(i20), new o(i20));
            k0Var.d(new di.b5(1, 1));
            k0Var.setPreviewingAttributes(this.i2.h);
            k0Var.removeView(k0Var.Q);
            this.W1.addView(k0Var, i14, c8.ja.e(-1, ns.L4, 48));
            TextView textView2 = new TextView(context);
            this.X1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            r9 r9Var3 = this.i2;
            if (r9Var3.g != null) {
                textView2.setText(hd.M0(2131750363, null));
            } else if (r9Var3.g(ConnectionsManager.getInstance(m10.t0).getCurrentTime())) {
                textView2.setText(hd.M0(2131750128, null));
            } else {
                textView2.setText(hd.M0(2131750129, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(i14, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i14, org.telegram.messenger.g0.L(12.0f), i14);
            TextView k10 = org.telegram.ui.Cells.y0.k(this.W1, textView2, c8.ja.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            k10.setTypeface(org.telegram.messenger.g0.o());
            k10.setTextSize(1, 21.0f);
            k10.setText(str2);
            k10.setGravity(17);
            k10.setTextColor(-1);
            TextView k11 = org.telegram.ui.Cells.y0.k(this.W1, k10, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            k11.setTextSize(1, 13.0f);
            k11.setText(org.telegram.messenger.g0.I2(hd.M0(2131750350, null), i14, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            k11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            k11.setGravity(17);
            k11.setTextColor(-1342177281);
            k11.setOnClickListener(new View.OnClickListener(this) { // from class: bi.g0
                public final /* synthetic */ m0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new ug.x0(40, this.b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                            break;
                        default:
                            this.b.f1();
                            break;
                    }
                }
            });
            na.b(k11, 0.02f, 1.5f);
            this.W1.addView(k11, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            i0Var.setVisibility(8);
            textView.setVisibility(8);
            this.g2.setVisibility(8);
            z70 z70Var3 = new z70(context, e6Var);
            z70Var3.setGravity(17);
            z70Var3.setTextSize(1, 16.0f);
            int i21 = org.telegram.ui.ActionBar.j6.J6;
            org.telegram.ui.ActionBar.q6.U(z70Var3, i21, e6Var);
            org.telegram.ui.ActionBar.q6.G(z70Var3, i21, e6Var);
            z70Var3.setOnClickListener(new ah.g(this, context, e6Var, 3));
            na.b(z70Var3, 0.02f, 1.5f);
            this.V1.addView(z70Var3, c8.ja.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(cg.d.c(TL_stars.starGiftAttributeModel.class, this.i2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = i14; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) pVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(stargiftattributemodel.document, z70Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            String E3 = hd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = E3;
            z70Var3.setText(org.telegram.messenger.g0.I2(hd.V(null, null, 2131750318, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.V1.addView(this.h2, c8.ja.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i14);
    }

    public static void d1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new l0(context, starGift, e6Var));
        org.telegram.ui.ActionBar.q0 a10 = kVar.s().a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(hd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, R.drawable.msg_info, hd.M0(2131748331, null));
        a10.e(3, R.drawable.menu_feature_links, hd.M0(2131751762, null));
        a10.e(2, R.drawable.msg_share, hd.M0(2131745458, null));
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, long j3, long j10, k1 k1Var) {
        v9 c10 = v9.c(i7);
        z zVar = new z(context, e6Var, i7, j3, k1Var);
        r9 b10 = c10.b(j10);
        if (b10 != null) {
            zVar.a(b10, null);
            return;
        }
        p9 p9Var = new p9(c10, zVar, j10, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j10;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new org.telegram.messenger.x3(2, c10, p9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, null, false);
        org.telegram.ui.ActionBar.f2 f2Var = k10.y0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        imageView.setBackground(shapeDrawable);
        org.telegram.ui.ActionBar.q6.j(imageView, shapeDrawable, M, null, e6Var);
        linearLayout.addView(imageView, c8.ja.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(hd.M0(2131749818, null));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(hd.M0(2131749817, null));
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
        linearLayout.addView(textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 16));
        fs0 fs0Var = new fs0(context, e6Var);
        int i11 = starGift.gifts_per_round;
        fs0Var.a.l(hd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        fs0Var.b.setText(hd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
        fs0Var.d.setVisibility(8);
        ImageView imageView2 = fs0Var.c;
        imageView2.setImageResource(R.drawable.menu_top_bidders_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.q6.s(imageView2, i10, e6Var, mode);
        linearLayout.addView(fs0Var, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        fs0 fs0Var2 = new fs0(context, e6Var);
        fs0Var2.a.l(hd.M0(2131749824, null), false);
        fs0Var2.b.setText(hd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
        fs0Var2.d.setVisibility(8);
        ImageView imageView3 = fs0Var2.c;
        imageView3.setImageResource(R.drawable.menu_carryover_24);
        org.telegram.ui.ActionBar.q6.s(imageView3, i10, e6Var, mode);
        linearLayout.addView(fs0Var2, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        fs0 fs0Var3 = new fs0(context, e6Var);
        fs0Var3.a.l(hd.M0(2131749820, null), false);
        fs0Var3.b.setText(hd.M0(2131749819, null));
        fs0Var3.d.setVisibility(8);
        ImageView imageView4 = fs0Var3.c;
        imageView4.setImageResource(R.drawable.menu_bid_refund_24);
        org.telegram.ui.ActionBar.q6.s(imageView4, i10, e6Var, mode);
        linearLayout.addView(fs0Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.setOnClickListener(new d0(0, f2Var));
        dVar.i(di.c6.h2(hd.M0(2131743888, null)), false, true);
        linearLayout.addView(dVar, c8.ja.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        k10.O = linearLayout;
        k10.show();
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, true, new b(this, 3), this.J0);
        this.k2 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return "";
    }

    @Override // org.telegram.messenger.u9
    public final void c(r9 r9Var) {
        this.i2 = r9Var;
        h1(true);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        v9.c(this.a).n(this.U1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        r9 r9Var = this.i2;
        if (r9Var == null || (tL_starGiftAuctionStateFinished = r9Var.g) == null || r9Var.d.title == null) {
            return;
        }
        this.d2.a(this.a2, hd.a0(null, null, 2131750289, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.i2.d.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i7;
        int i10;
        int i11;
        r9 r9Var;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        r9 r9Var2 = this.i2;
        ec ecVar = this.Z1;
        ec ecVar2 = this.Y1;
        hi.d dVar = this.f2;
        if (r9Var2 != null && (tL_starGiftAuctionStateFinished = r9Var2.g) != null) {
            ecVar2.setText(hd.x(tL_starGiftAuctionStateFinished.start_date, true));
            ecVar.setText(hd.x(this.i2.g.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mb.a1(false, i5.c.l(this.i2.g.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) fc.b("?", new b0(this, 1), this.J0, null));
            this.a2.setText(spannableStringBuilder);
        } else if (r9Var2 != null && (tL_starGiftAuctionState = r9Var2.f) != null) {
            ecVar2.setText(hd.x(tL_starGiftAuctionState.start_date, true));
            ecVar.setText(hd.x(this.i2.f.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            if (this.i2.g(currentTime)) {
                dVar.g(hd.a0(null, null, 2131750335, hd.c0(this.i2.f.start_date - currentTime)), z10);
            } else {
                dVar.g(hd.a0(null, null, 2131750321, hd.c0(this.i2.f.end_date - currentTime)), z10);
            }
        }
        r9 r9Var3 = this.i2;
        TL_stars.StarGift starGift = this.T1;
        if (r9Var3 != null) {
            if (r9Var3.f()) {
                i7 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.i2.f;
                if (tL_starGiftAuctionState2 != null) {
                    i7 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i10 = starGift.availability_total;
            ec ecVar3 = this.b2;
            ux0 ux0Var = this.c2;
            if (i7 != i10) {
                ux0Var.setText(hd.M0(2131750333, null));
                ecVar3.setText(hd.E(i10, ','));
            } else {
                ux0Var.setText(hd.M0(2131750334, null));
                ecVar3.setText(hd.G(i7, "Gift2Availability4Value", hd.E(i10, ',')));
            }
            i11 = this.i2.e.acquired_count;
            z70 z70Var = this.h2;
            if (i11 <= 0) {
                z70Var.setVisibility(0);
                z70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(hd.F("Gift2AuctionsItemsBought2", i11, this.j2), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            } else {
                z70Var.setVisibility(8);
            }
            r9Var = this.i2;
            tableRow = this.e2;
            if ((r9Var != null || r9Var.g == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.i(hd.M0(2131750351, null), z10, true);
            }
            String M0 = hd.M0(2131750364, null);
            z70 z70Var2 = this.g2;
            z70Var2.setText(M0);
            org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.q7, this.J0);
            tableRow.setVisibility(0);
            dVar.i(hd.M0(2131747831, null), z10, true);
            dVar.g(null, z10);
            return;
        }
        i7 = starGift.availability_remains;
        i10 = starGift.availability_total;
        ec ecVar32 = this.b2;
        ux0 ux0Var2 = this.c2;
        if (i7 != i10) {
        }
        i11 = this.i2.e.acquired_count;
        z70 z70Var3 = this.h2;
        if (i11 <= 0) {
        }
        r9Var = this.i2;
        tableRow = this.e2;
        if (r9Var != null) {
        }
        tableRow.setVisibility(8);
        dVar.i(hd.M0(2131750351, null), z10, true);
    }
}
