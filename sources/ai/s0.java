package ai;

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
import b8.mf;
import b8.pf;
import ci.wb;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.k9;
import org.telegram.messenger.m9;
import org.telegram.messenger.p9;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 extends ma implements p9 {
    public static final hc[] i2 = new hc[1];
    public static final qx0[] j2 = new qx0[1];
    public final TL_stars.StarGift Q1;
    public final long R1;
    public final LinearLayout S1;
    public final FrameLayout T1;
    public final TextView U1;
    public final hc V1;
    public final hc W1;
    public final hc X1;
    public final hc Y1;
    public final qx0 Z1;
    public final n0 a2;
    public final TableRow b2;
    public final gi.d c2;
    public final s70 d2;
    public final s70 e2;
    public m9 f2;
    public final CharSequence g2;
    public f41 h2;

    public s0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, e6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i3;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.Q1 = starGift;
        long j11 = starGift.id;
        this.R1 = j11;
        this.C1 = org.telegram.messenger.g0.L(6.0f);
        this.s1 = 0.2f;
        N();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.D(-1, false);
        kVar.setOccupyStatusBar(false);
        d1(kVar, context, e6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        frameLayout.addView(kVar, mf.o(-1, -2));
        linearLayout.addView(frameLayout);
        o0 o0Var = new o0(this.a, context, e6Var);
        o0Var.d0 = true;
        o0Var.h(starGift, false, false, false, false, false);
        o0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        o0Var.setImageLayer(7);
        o0Var.K.setVisibility(8);
        frameLayout.addView(o0Var, mf.d(hs.O1, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        linearLayout.addView(textView, mf.t(-1, -2, 17, 20, 0, 20, 6));
        s70 s70Var = new s70(context, null);
        this.d2 = s70Var;
        s70Var.setGravity(17);
        s70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(bd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750365, null), new l0(context, e6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.k6.J6;
        org.telegram.ui.ActionBar.r6.H(s70Var, i12, e6Var);
        linearLayout.addView(s70Var, mf.t(-1, -2, 17, 20, 0, 20, 4));
        rx0 rx0Var = new rx0(context, e6Var);
        String M0 = bd.M0(2131750331, null);
        hc[] hcVarArr = i2;
        rx0Var.c(M0, "", null, hcVarArr);
        this.V1 = hcVarArr[0];
        rx0Var.c(bd.M0(2131750332, null), "", null, hcVarArr);
        this.W1 = hcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(rx0Var, mf.e(-1, -2, hs.E1));
        this.a2 = new n0(this, new gi.l3[1], frameLayout2, 0);
        TableRow c2 = rx0Var.c(bd.M0(2131749596, null), "", null, hcVarArr);
        this.b2 = c2;
        final int i13 = 1;
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.m0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        new vg.v0(40, this.b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                        break;
                    default:
                        this.b.f1();
                        break;
                }
            }
        });
        this.X1 = hcVarArr[0];
        qx0[] qx0VarArr = j2;
        rx0Var.c("", "", qx0VarArr, hcVarArr);
        this.Y1 = hcVarArr[0];
        this.Z1 = qx0VarArr[0];
        linearLayout.addView(frameLayout2, mf.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        s70 s70Var2 = new s70(context, e6Var);
        this.e2 = s70Var2;
        s70Var2.setGravity(17);
        s70Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var2, i12, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i12, e6Var);
        s70Var2.setOnClickListener(new h(this, new boolean[1], e6Var, 3));
        pf.b(s70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(starGift.sticker, s70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.g2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.g2 = "";
        }
        gi.d dVar = new gi.d(context, e6Var, true);
        this.c2 = dVar;
        dVar.f();
        final int i14 = z10;
        dVar.setOnClickListener(new g0(this, j10, context, e6Var, runnable, 0));
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.u0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.b.addView(dVar, d);
        tj0 tj0Var = this.l1;
        int i17 = this.u0;
        tj0Var.setPadding(i17, i14, i17, org.telegram.messenger.g0.L(64.0f));
        this.h2.O(i14);
        m9 l10 = q9.c(this.a).l(j11, this);
        this.f2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                rx0Var.c(bd.M0(2131750339, null), bd.E(this.f2.f.total_rounds, ','), null, null);
            } else {
                String M02 = bd.M0(2131750340, null);
                String E = bd.E(this.f2.f.current_round, ',');
                String E2 = bd.E(this.f2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = E;
                objArr[1] = E2;
                rx0Var.c(M02, bd.a0(null, null, 2131747836, objArr), null, null);
            }
        }
        m9 m9Var = this.f2;
        if (m9Var != null && (tL_starGiftAuctionState = m9Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i18 = i14; i18 < size; i18++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f2.f.rounds.get(i18);
                if (i18 < size - 1) {
                    i3 = 1;
                    i10 = this.f2.f.rounds.get(i18 + 1).num - 1;
                } else {
                    i3 = 1;
                    i10 = this.f2.f.total_rounds;
                }
                int i19 = starGiftAuctionRound.num;
                if (i19 == i10) {
                    Object[] objArr2 = new Object[i3];
                    objArr2[i14] = Integer.valueOf(i19);
                    a02 = bd.a0(null, null, 2131750338, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i19);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i14] = valueOf;
                    objArr3[i3] = valueOf2;
                    a02 = bd.a0(null, null, 2131750336, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = bd.c0(starGiftAuctionRound.duration);
                    String c03 = bd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i14] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = bd.a0(null, null, 2131750337, objArr4);
                } else {
                    G = bd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i14]);
                }
                rx0Var.c(a02, G, null, null);
            }
        }
        m9 m9Var2 = this.f2;
        if (m9Var2 != null && m9Var2.h != null) {
            int i20 = 1;
            q0 q0Var = new q0(this, context, e6Var, new h0(this, i14), new t(i20), new t(i20), new t(i20), new t(i20), new t(i20), new t(i20));
            q0Var.d(new ci.k5(1, 1));
            q0Var.setPreviewingAttributes(this.f2.h);
            q0Var.removeView(q0Var.Q);
            this.T1.addView(q0Var, i14, mf.e(-1, hs.L4, 48));
            TextView textView2 = new TextView(context);
            this.U1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            m9 m9Var3 = this.f2;
            if (m9Var3.g != null) {
                textView2.setText(bd.M0(2131750371, null));
            } else if (m9Var3.g(ConnectionsManager.getInstance(h10.t0).getCurrentTime())) {
                textView2.setText(bd.M0(2131750136, null));
            } else {
                textView2.setText(bd.M0(2131750137, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.k6.b0(i14, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i14, org.telegram.messenger.g0.L(12.0f), i14);
            TextView m10 = org.telegram.ui.Cells.f1.m(this.T1, textView2, mf.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            m10.setTypeface(org.telegram.messenger.g0.o());
            m10.setTextSize(1, 21.0f);
            m10.setText(str2);
            m10.setGravity(17);
            m10.setTextColor(-1);
            TextView m11 = org.telegram.ui.Cells.f1.m(this.T1, m10, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            m11.setTextSize(1, 13.0f);
            m11.setText(org.telegram.messenger.g0.I2(bd.M0(2131750358, null), i14, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            m11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            m11.setGravity(17);
            m11.setTextColor(-1342177281);
            m11.setOnClickListener(new View.OnClickListener(this) { // from class: ai.m0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new vg.v0(40, this.b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                            break;
                        default:
                            this.b.f1();
                            break;
                    }
                }
            });
            pf.b(m11, 0.02f, 1.5f);
            this.T1.addView(m11, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            o0Var.setVisibility(8);
            textView.setVisibility(8);
            this.d2.setVisibility(8);
            s70 s70Var3 = new s70(context, e6Var);
            s70Var3.setGravity(17);
            s70Var3.setTextSize(1, 16.0f);
            int i21 = org.telegram.ui.ActionBar.k6.J6;
            org.telegram.ui.ActionBar.r6.V(s70Var3, i21, e6Var);
            org.telegram.ui.ActionBar.r6.H(s70Var3, i21, e6Var);
            s70Var3.setOnClickListener(new h(this, context, e6Var, 2));
            pf.b(s70Var3, 0.02f, 1.5f);
            this.S1.addView(s70Var3, mf.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            ci.a aVar = new ci.a(dg.d.c(TL_stars.starGiftAttributeModel.class, this.f2.h));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = i14; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(stargiftattributemodel.document, s70Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            String E3 = bd.E(j12, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = E3;
            s70Var3.setText(org.telegram.messenger.g0.I2(bd.V(null, null, 2131750326, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.S1.addView(this.e2, mf.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i14);
    }

    public static void d1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new r0(context, starGift, e6Var));
        org.telegram.ui.ActionBar.q0 a10 = kVar.q().a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(bd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, R.drawable.msg_info, bd.M0(2131748339, null));
        a10.e(3, R.drawable.menu_feature_links, bd.M0(2131751762, null));
        a10.e(2, R.drawable.msg_share, bd.M0(2131745468, null));
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, long j10, long j11, l1 l1Var) {
        q9 c2 = q9.c(i3);
        f0 f0Var = new f0(context, e6Var, i3, j10, l1Var);
        m9 b10 = c2.b(j11);
        if (b10 != null) {
            f0Var.a(b10, null);
            return;
        }
        k9 k9Var = new k9(c2, f0Var, j11, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j11;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c2.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new c3.b(1), new org.telegram.messenger.x3(1, c2, k9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
        org.telegram.ui.ActionBar.e2 e2Var = l10.y0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        imageView.setBackground(shapeDrawable);
        org.telegram.ui.ActionBar.r6.k(imageView, shapeDrawable, N, null, e6Var);
        linearLayout.addView(imageView, mf.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(bd.M0(2131749826, null));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        linearLayout.addView(textView, mf.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(bd.M0(2131749825, null));
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        linearLayout.addView(textView2, mf.t(-1, -2, 17, 20, 0, 20, 16));
        yr0 yr0Var = new yr0(context, e6Var);
        int i11 = starGift.gifts_per_round;
        yr0Var.a.l(bd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        yr0Var.b.setText(bd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
        yr0Var.d.setVisibility(8);
        ImageView imageView2 = yr0Var.c;
        imageView2.setImageResource(R.drawable.menu_top_bidders_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, e6Var, mode);
        linearLayout.addView(yr0Var, mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        yr0 yr0Var2 = new yr0(context, e6Var);
        yr0Var2.a.l(bd.M0(2131749832, null), false);
        yr0Var2.b.setText(bd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
        yr0Var2.d.setVisibility(8);
        ImageView imageView3 = yr0Var2.c;
        imageView3.setImageResource(R.drawable.menu_carryover_24);
        org.telegram.ui.ActionBar.r6.t(imageView3, i10, e6Var, mode);
        linearLayout.addView(yr0Var2, mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        yr0 yr0Var3 = new yr0(context, e6Var);
        yr0Var3.a.l(bd.M0(2131749828, null), false);
        yr0Var3.b.setText(bd.M0(2131749827, null));
        yr0Var3.d.setVisibility(8);
        ImageView imageView4 = yr0Var3.c;
        imageView4.setImageResource(R.drawable.menu_bid_refund_24);
        org.telegram.ui.ActionBar.r6.t(imageView4, i10, e6Var, mode);
        linearLayout.addView(yr0Var3, mf.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.setOnClickListener(new j0(0, e2Var));
        dVar.i(ci.l6.g2(bd.M0(2131743898, null)), false, true);
        linearLayout.addView(dVar, mf.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        l10.O = linearLayout;
        l10.show();
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new c(this, 3), this.J0);
        this.h2 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return "";
    }

    @Override // org.telegram.messenger.p9
    public final void c(m9 m9Var) {
        this.f2 = m9Var;
        h1(true);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        q9.c(this.a).n(this.R1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        m9 m9Var = this.f2;
        if (m9Var == null || (tL_starGiftAuctionStateFinished = m9Var.g) == null || m9Var.d.title == null) {
            return;
        }
        this.a2.a(this.X1, bd.a0(null, null, 2131750297, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f2.d.title));
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
        int i3;
        int i10;
        int i11;
        m9 m9Var;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        m9 m9Var2 = this.f2;
        hc hcVar = this.W1;
        hc hcVar2 = this.V1;
        gi.d dVar = this.c2;
        if (m9Var2 != null && (tL_starGiftAuctionStateFinished = m9Var2.g) != null) {
            hcVar2.setText(bd.x(tL_starGiftAuctionStateFinished.start_date, true));
            hcVar.setText(bd.x(this.f2.g.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wb.a1(false, k2.p1.l(this.f2.g.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ic.b("?", new h0(this, 1), this.J0, null));
            this.X1.setText(spannableStringBuilder);
        } else if (m9Var2 != null && (tL_starGiftAuctionState = m9Var2.f) != null) {
            hcVar2.setText(bd.x(tL_starGiftAuctionState.start_date, true));
            hcVar.setText(bd.x(this.f2.f.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            if (this.f2.g(currentTime)) {
                dVar.g(bd.a0(null, null, 2131750343, bd.c0(this.f2.f.start_date - currentTime)), z10);
            } else {
                dVar.g(bd.a0(null, null, 2131750329, bd.c0(this.f2.f.end_date - currentTime)), z10);
            }
        }
        m9 m9Var3 = this.f2;
        TL_stars.StarGift starGift = this.Q1;
        if (m9Var3 != null) {
            if (m9Var3.f()) {
                i3 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.f2.f;
                if (tL_starGiftAuctionState2 != null) {
                    i3 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i10 = starGift.availability_total;
            hc hcVar3 = this.Y1;
            qx0 qx0Var = this.Z1;
            if (i3 != i10) {
                qx0Var.setText(bd.M0(2131750341, null));
                hcVar3.setText(bd.E(i10, ','));
            } else {
                qx0Var.setText(bd.M0(2131750342, null));
                hcVar3.setText(bd.G(i3, "Gift2Availability4Value", bd.E(i10, ',')));
            }
            i11 = this.f2.e.acquired_count;
            s70 s70Var = this.e2;
            if (i11 <= 0) {
                s70Var.setVisibility(0);
                s70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(bd.F("Gift2AuctionsItemsBought2", i11, this.g2), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            } else {
                s70Var.setVisibility(8);
            }
            m9Var = this.f2;
            tableRow = this.b2;
            if ((m9Var != null || m9Var.g == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.i(bd.M0(2131750359, null), z10, true);
            }
            String M0 = bd.M0(2131750372, null);
            s70 s70Var2 = this.d2;
            s70Var2.setText(M0);
            org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.q7, this.J0);
            tableRow.setVisibility(0);
            dVar.i(bd.M0(2131747839, null), z10, true);
            dVar.g(null, z10);
            return;
        }
        i3 = starGift.availability_remains;
        i10 = starGift.availability_total;
        hc hcVar32 = this.Y1;
        qx0 qx0Var2 = this.Z1;
        if (i3 != i10) {
        }
        i11 = this.f2.e.acquired_count;
        s70 s70Var3 = this.e2;
        if (i11 <= 0) {
        }
        m9Var = this.f2;
        tableRow = this.b2;
        if (m9Var != null) {
        }
        tableRow.setVisibility(8);
        dVar.i(bd.M0(2131750359, null), z10, true);
    }
}
