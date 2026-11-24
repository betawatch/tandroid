// default package

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
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ez extends fy0 implements jt4 {
    public static final q41[] k2 = new q41[1];
    public static final lfb[] l2 = new lfb[1];
    public final TL_stars.StarGift S1;
    public final long T1;
    public final LinearLayout U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final q41 X1;
    public final q41 Y1;
    public final q41 Z1;
    public final q41 a2;
    public final lfb b2;
    public final p c2;
    public final TableRow d2;
    public final u41 e2;
    public final l46 f2;
    public final l46 g2;
    public gt4 h2;
    public final CharSequence i2;
    public l5c j2;

    public ez(Context context, wjb wjbVar, long j, TL_stars.StarGift starGift, av4 av4Var) {
        super(context, null, false, false, 1, wjbVar);
        boolean z;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i;
        int i2;
        String a0;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.S1 = starGift;
        long j2 = starGift.id;
        this.T1 = j2;
        this.E1 = gl.L(6.0f);
        this.u1 = 0.2f;
        K();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        a aVar = new a(context, wjbVar);
        aVar.H(-1, false);
        aVar.setOccupyStatusBar(false);
        Y0(aVar, context, wjbVar, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.addView(aVar, nme.o(-1, -2));
        linearLayout.addView(frameLayout);
        az azVar = new az(this.a, wjbVar, context);
        azVar.d0 = true;
        azVar.h(starGift, false, false, false, false, false);
        azVar.setImageSize(gl.L(100.0f));
        azVar.setImageLayer(7);
        azVar.K.setVisibility(8);
        frameLayout.addView(azVar, nme.d(kk7.N1, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar);
        linearLayout.addView(textView, nme.t(-1, -2, 17, 20, 0, 20, 6));
        l46 l46Var = new l46(context, null);
        this.f2 = l46Var;
        l46Var.setGravity(17);
        l46Var.setText(TextUtils.concat(gl.T2(k96.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", gl.F2(gl.O2(k96.M0(2131750341, null), -1, 0, new xy(context, wjbVar, starGift, (byte) 0), null), true, gl.L(2.6666667f), gl.L(1.0f))));
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, i3, wjbVar);
        int i4 = bkb.I6;
        zkb.G(l46Var, i4, wjbVar);
        linearLayout.addView(l46Var, nme.t(-1, -2, 17, 20, 0, 20, 4));
        mfb mfbVar = new mfb(context, wjbVar);
        String M0 = k96.M0(2131750307, null);
        q41[] q41VarArr = k2;
        mfbVar.f(M0, "", null, q41VarArr);
        this.X1 = q41VarArr[0];
        mfbVar.f(k96.M0(2131750308, null), "", null, q41VarArr);
        this.Y1 = q41VarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(mfbVar, nme.e(-1, -2, kk7.D1));
        this.c2 = new p(this, new je5[1], frameLayout2, (byte) 3);
        TableRow f = mfbVar.f(k96.M0(2131749413, null), "", null, q41VarArr);
        this.d2 = f;
        final byte b = 1;
        f.setOnClickListener(new View.OnClickListener(this) { // from class: yy
            public final /* synthetic */ ez b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ez ezVar = this.b;
                switch (b2) {
                    case 0:
                        new jh8(40, (wjb) null, ezVar.getContext()).show();
                        break;
                    default:
                        ezVar.a1();
                        break;
                }
            }
        });
        this.Z1 = q41VarArr[0];
        lfb[] lfbVarArr = l2;
        mfbVar.f("", "", lfbVarArr, q41VarArr);
        this.a2 = q41VarArr[0];
        this.b2 = lfbVarArr[0];
        linearLayout.addView(frameLayout2, nme.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        l46 l46Var2 = new l46(context, wjbVar);
        this.g2 = l46Var2;
        l46Var2.setGravity(17);
        l46Var2.setTextSize(1, 16.0f);
        zkb.X(l46Var2, i4, wjbVar);
        zkb.G(l46Var2, i4, wjbVar);
        l46Var2.setOnClickListener(new b0(this, new boolean[1], wjbVar, (byte) 9));
        ote.b(l46Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z = false;
            spannableStringBuilder.setSpan(new gm(starGift.sticker, l46Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.i2 = spannableStringBuilder;
        } else {
            z = false;
            this.i2 = "";
        }
        u41 u41Var = new u41(wjbVar, context, true);
        this.e2 = u41Var;
        u41Var.f();
        final int i5 = z;
        u41Var.setOnClickListener(new zy(this, j, context, wjbVar, av4Var, (byte) 0));
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i6 = d.leftMargin;
        int i7 = this.u0;
        d.leftMargin = i6 + i7;
        d.rightMargin += i7;
        this.b.addView(u41Var, d);
        o39 o39Var = this.n1;
        int i8 = this.u0;
        o39Var.setPadding(i8, i5, i8, gl.L(64.0f));
        this.j2.O(i5);
        gt4 l = kt4.c(this.a).l(j2, this);
        this.h2 = l;
        if (l != null && (tL_starGiftAuctionState2 = l.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                mfbVar.f(k96.M0(2131750315, null), k96.E(this.h2.f.total_rounds, ','), null, null);
            } else {
                String M02 = k96.M0(2131750316, null);
                String E = k96.E(this.h2.f.current_round, ',');
                String E2 = k96.E(this.h2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i5] = E;
                objArr[1] = E2;
                mfbVar.f(M02, k96.a0(null, null, 2131747635, objArr), null, null);
            }
        }
        gt4 gt4Var = this.h2;
        if (gt4Var != null && (tL_starGiftAuctionState = gt4Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i9 = i5; i9 < size; i9++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.h2.f.rounds.get(i9);
                int i10 = size - 1;
                gt4 gt4Var2 = this.h2;
                if (i9 < i10) {
                    i = 1;
                    i2 = gt4Var2.f.rounds.get(i9 + 1).num - 1;
                } else {
                    i = 1;
                    i2 = gt4Var2.f.total_rounds;
                }
                int i11 = starGiftAuctionRound.num;
                if (i11 == i2) {
                    Object[] objArr2 = new Object[i];
                    objArr2[i5] = Integer.valueOf(i11);
                    a0 = k96.a0(null, null, 2131750314, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i11);
                    Integer valueOf2 = Integer.valueOf(i2);
                    Object[] objArr3 = new Object[2];
                    objArr3[i5] = valueOf;
                    objArr3[i] = valueOf2;
                    a0 = k96.a0(null, null, 2131750312, objArr3);
                }
                int i12 = starGiftAuctionRound.num;
                int i13 = starGiftAuctionRound.duration;
                if (i12 == i2) {
                    String c0 = k96.c0(i13);
                    String c02 = k96.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i5] = c0;
                    objArr4[1] = c02;
                    objArr4[2] = valueOf3;
                    G = k96.a0(null, null, 2131750313, objArr4);
                } else {
                    G = k96.G(i13 / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i5]);
                }
                mfbVar.f(a0, G, null, null);
            }
        }
        gt4 gt4Var3 = this.h2;
        if (gt4Var3 != null && gt4Var3.h != null) {
            cz czVar = new cz(this, context, wjbVar, new uy(this, i5), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1));
            czVar.d(new xpa(1, 1));
            czVar.setPreviewingAttributes(this.h2.h);
            czVar.removeView(czVar.Q);
            this.V1.addView(czVar, i5, nme.e(-1, kk7.K4, 48));
            TextView textView2 = new TextView(context);
            this.W1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(gl.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            gt4 gt4Var4 = this.h2;
            if (gt4Var4.g != null) {
                textView2.setText(k96.M0(2131750347, null));
            } else if (gt4Var4.g(ConnectionsManager.getInstance(y6c.t0).getCurrentTime())) {
                textView2.setText(k96.M0(2131750112, null));
            } else {
                textView2.setText(k96.M0(2131750113, null));
            }
            textView2.setBackground(bkb.Z(i5, 285212671, 13, 13));
            textView2.setPadding(gl.L(12.0f), i5, gl.L(12.0f), i5);
            TextView l3 = ug8.l(this.V1, textView2, nme.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            l3.setTypeface(gl.o());
            l3.setTextSize(1, 21.0f);
            l3.setText(str2);
            l3.setGravity(17);
            l3.setTextColor(-1);
            TextView l4 = ug8.l(this.V1, l3, nme.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            l4.setTextSize(1, 13.0f);
            l4.setText(gl.F2(k96.M0(2131750334, null), i5, gl.L(2.6666667f), gl.L(1.0f)));
            l4.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            l4.setGravity(17);
            l4.setTextColor(-1342177281);
            l4.setOnClickListener(new View.OnClickListener(this) { // from class: yy
                public final /* synthetic */ ez b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = i5;
                    ez ezVar = this.b;
                    switch (b2) {
                        case 0:
                            new jh8(40, (wjb) null, ezVar.getContext()).show();
                            break;
                        default:
                            ezVar.a1();
                            break;
                    }
                }
            });
            ote.b(l4, 0.02f, 1.5f);
            this.V1.addView(l4, nme.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            azVar.setVisibility(8);
            textView.setVisibility(8);
            this.f2.setVisibility(8);
            l46 l46Var3 = new l46(context, wjbVar);
            l46Var3.setGravity(17);
            l46Var3.setTextSize(1, 16.0f);
            int i14 = bkb.I6;
            zkb.X(l46Var3, i14, wjbVar);
            zkb.G(l46Var3, i14, wjbVar);
            l46Var3.setOnClickListener(new b0(this, context, wjbVar, (byte) 8));
            ote.b(l46Var3, 0.02f, 1.5f);
            this.U1.addView(l46Var3, nme.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            ee0 ee0Var = new ee0(apb.c(TL_stars.starGiftAttributeModel.class, this.h2.h));
            long j3 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i15 = i5; i15 < 3; i15++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ee0Var.b();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new gm(stargiftattributemodel.document, l46Var3.getPaint().getFontMetricsInt()), i15, i15 + 1, 33);
                }
            }
            String E3 = k96.E(j3, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i5] = spannableStringBuilder2;
            objArr5[1] = E3;
            l46Var3.setText(gl.F2(k96.V(null, null, 2131750302, objArr5), true, gl.L(2.6666667f), gl.L(1.0f)));
        }
        this.U1.addView(this.g2, nme.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        c1(i5);
    }

    public static void Y0(a aVar, Context context, wjb wjbVar, TL_stars.StarGift starGift) {
        aVar.setActionBarMenuOnItemClick(new dz(wjbVar, context, starGift));
        r7 a = aVar.t().a(0, R.drawable.ic_ab_other);
        a.setContentDescription(k96.M0(2131754838, "AccDescrMoreOptions"));
        a.e(4, R.drawable.msg_info, k96.M0(2131748139, null));
        a.e(3, R.drawable.menu_feature_links, k96.M0(2131751750, null));
        a.e(2, R.drawable.msg_share, k96.M0(2131745266, null));
    }

    public static void Z0(Context context, wjb wjbVar, int i, long j, long j2, av4 av4Var) {
        kt4 c = kt4.c(i);
        yg ygVar = new yg(context, wjbVar, i, j, av4Var);
        gt4 b = c.b(j2);
        if (b != null) {
            ygVar.a(b, null);
            return;
        }
        et4 et4Var = new et4(c, ygVar, j2, (byte) 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j2;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new hc((byte) 0), new ae2(c, et4Var, (byte) 14));
    }

    public static void b1(wjb wjbVar, Context context, TL_stars.StarGift starGift) {
        if (context == null || starGift == null) {
            return;
        }
        fx0 h = de9.h(1, null, context, false);
        rw0 rw0Var = h.y0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(gl.L(17.0f), gl.L(17.0f), gl.L(17.0f), gl.L(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        int i = bkb.Ei;
        paint.setColor(bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        imageView.setBackground(shapeDrawable);
        zkb.j(imageView, shapeDrawable, M, null, wjbVar);
        linearLayout.addView(imageView, nme.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setText(k96.M0(2131749802, null));
        textView.setTextSize(1, 20.0f);
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        linearLayout.addView(textView, nme.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        tb4.u(14.0f, 2131749801, 1, textView2, null);
        zkb.X(textView2, i2, wjbVar);
        linearLayout.addView(textView2, nme.t(-1, -2, 17, 20, 0, 20, 16));
        kh8 kh8Var = new kh8(context, wjbVar);
        int i3 = starGift.gifts_per_round;
        kh8Var.a.l(k96.G(i3, "GiftAuctionInfo1Header", Integer.valueOf(i3)), false);
        int i4 = starGift.gifts_per_round;
        kh8Var.b.setText(k96.G(i4, "GiftAuctionInfo1Text", Integer.valueOf(i4)));
        kh8Var.d.setVisibility(8);
        ImageView imageView2 = kh8Var.c;
        imageView2.setImageResource(R.drawable.menu_top_bidders_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        zkb.s(imageView2, i2, wjbVar, mode);
        linearLayout.addView(kh8Var, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        kh8 kh8Var2 = new kh8(context, wjbVar);
        kh8Var2.a.l(k96.M0(2131749808, null), false);
        kh8Var2.b.setText(k96.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
        kh8Var2.d.setVisibility(8);
        ImageView imageView3 = kh8Var2.c;
        imageView3.setImageResource(R.drawable.menu_carryover_24);
        zkb.s(imageView3, i2, wjbVar, mode);
        linearLayout.addView(kh8Var2, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        kh8 kh8Var3 = new kh8(context, wjbVar);
        kh8Var3.a.l(k96.M0(2131749804, null), false);
        kh8Var3.b.setText(k96.M0(2131749803, null));
        kh8Var3.d.setVisibility(8);
        ImageView imageView4 = kh8Var3.c;
        imageView4.setImageResource(R.drawable.menu_bid_refund_24);
        zkb.s(imageView4, i2, wjbVar, mode);
        linearLayout.addView(kh8Var3, nme.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.setOnClickListener(new vy(rw0Var, (byte) 0));
        u41Var.i(vqa.k2(k96.M0(2131743649, null)), false, true);
        linearLayout.addView(u41Var, nme.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        h.O = linearLayout;
        h.show();
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 11), this.J0);
        this.j2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return "";
    }

    public final void a1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        gt4 gt4Var = this.h2;
        if (gt4Var == null || (tL_starGiftAuctionStateFinished = gt4Var.g) == null || gt4Var.d.title == null) {
            return;
        }
        this.c2.a(this.Z1, k96.a0(null, null, 2131750273, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.h2.d.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(boolean z) {
        int i;
        int i2;
        int i3;
        gt4 gt4Var;
        TableRow tableRow;
        gt4 gt4Var2 = this.h2;
        u41 u41Var = this.e2;
        if (gt4Var2 != null) {
            TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished = gt4Var2.g;
            q41 q41Var = this.Y1;
            q41 q41Var2 = this.X1;
            if (tL_starGiftAuctionStateFinished != null) {
                q41Var2.setText(k96.x(tL_starGiftAuctionStateFinished.start_date, true));
                q41Var.setText(k96.x(this.h2.g.end_date, true));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jva.a1(false, "⭐️ ".concat(k96.E(this.h2.g.average_price, ',')), 0.8f, null));
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) r41.b("?", new uy(this, (byte) 1), this.J0, null));
                this.Z1.setText(spannableStringBuilder);
            } else {
                if (gt4Var2.f != null) {
                    q41Var2.setText(k96.x(r0.start_date, true));
                    q41Var.setText(k96.x(this.h2.f.end_date, true));
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    boolean g = this.h2.g(currentTime);
                    gt4 gt4Var3 = this.h2;
                    if (g) {
                        u41Var.g(k96.a0(null, null, 2131750319, k96.c0(gt4Var3.f.start_date - currentTime)), z);
                    } else {
                        u41Var.g(k96.a0(null, null, 2131750305, k96.c0(gt4Var3.f.end_date - currentTime)), z);
                    }
                }
            }
        }
        gt4 gt4Var4 = this.h2;
        TL_stars.StarGift starGift = this.S1;
        if (gt4Var4 != null) {
            if (gt4Var4.f()) {
                i = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.h2.f;
                if (tL_starGiftAuctionState != null) {
                    i = tL_starGiftAuctionState.gifts_left;
                }
            }
            i2 = starGift.availability_total;
            q41 q41Var3 = this.a2;
            lfb lfbVar = this.b2;
            if (i != i2) {
                lfbVar.setText(k96.M0(2131750317, null));
                q41Var3.setText(k96.E(i2, ','));
            } else {
                lfbVar.setText(k96.M0(2131750318, null));
                q41Var3.setText(k96.G(i, "Gift2Availability4Value", k96.E(i2, ',')));
            }
            i3 = this.h2.e.acquired_count;
            l46 l46Var = this.g2;
            if (i3 <= 0) {
                l46Var.setVisibility(0);
                l46Var.setText(TextUtils.concat(gl.F2(k96.F("Gift2AuctionsItemsBought2", i3, this.i2), true, gl.L(2.6666667f), gl.L(1.0f))));
            } else {
                l46Var.setVisibility(8);
            }
            gt4Var = this.h2;
            tableRow = this.d2;
            if ((gt4Var != null || gt4Var.g == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                u41Var.i(k96.M0(2131750335, null), z, true);
            }
            String M0 = k96.M0(2131750348, null);
            l46 l46Var2 = this.f2;
            l46Var2.setText(M0);
            zkb.X(l46Var2, bkb.p7, this.J0);
            tableRow.setVisibility(0);
            u41Var.i(k96.M0(2131747638, null), z, true);
            u41Var.g(null, z);
            return;
        }
        i = starGift.availability_remains;
        i2 = starGift.availability_total;
        q41 q41Var32 = this.a2;
        lfb lfbVar2 = this.b2;
        if (i != i2) {
        }
        i3 = this.h2.e.acquired_count;
        l46 l46Var3 = this.g2;
        if (i3 <= 0) {
        }
        gt4Var = this.h2;
        tableRow = this.d2;
        if (gt4Var != null) {
        }
        tableRow.setVisibility(8);
        u41Var.i(k96.M0(2131750335, null), z, true);
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        kt4.c(this.a).n(this.T1, this);
        super.dismiss();
    }

    @Override // jt4
    public final void r(gt4 gt4Var) {
        this.h2 = gt4Var;
        c1(true);
    }
}
