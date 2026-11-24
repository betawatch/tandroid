// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mh1 extends h15 implements jm7 {
    public final long S;
    public FrameLayout T;
    public ft4 U;
    public o72 V;
    public vb W;

    public mh1(long j) {
        this.S = j;
        this.N = true;
        this.M = gm.L(60.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0569  */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J0(Context context, int i, final TL_payments.starRefProgram starrefprogram, long j, ylb ylbVar, boolean z) {
        long[] jArr;
        String str;
        ?? r15;
        String G;
        bf0 bf0Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final my0 h = hg9.h(1, ylbVar, context, false);
        long[] jArr2 = {j};
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(starrefprogram.bot_id));
        LinearLayout i2 = hg9.i(context, 1);
        i2.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
        i2.setClipChildren(false);
        i2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, qoe.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        bf0 bf0Var2 = new bf0(context);
        bf0Var2.setRoundRadius(gm.L(30.0f));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(W1);
        bf0Var2.f(W1, pc0Var);
        rve.a(bf0Var2);
        frameLayout2.addView(bf0Var2, qoe.e(60, 60, nm7.D1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = gm.L(10.0f);
            int i3 = cmb.g5;
            ShapeDrawable b0 = cmb.b0(L, cmb.v0(i3, ylbVar));
            wmb M = anb.M(i3);
            frameLayout3.setBackground(b0);
            anb.j(frameLayout3, b0, M, null, ylbVar);
            frameLayout3.setPadding(gm.L(1.33f), gm.L(1.33f), gm.L(1.33f), gm.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = gm.L(10.0f);
            int i4 = cmb.kk;
            ShapeDrawable b02 = cmb.b0(L2, cmb.v0(i4, ylbVar));
            wmb M2 = anb.M(i4);
            textView2.setBackground(b02);
            anb.j(textView2, b02, M2, null, ylbVar);
            textView2.setTypeface(gm.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(gm.L(5.33f), 0, gm.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb.append((Object) nxa.I0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(nxa.U0(sb.toString(), 0.75f, new pn2[1]));
            frameLayout3.addView(textView2, qoe.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView k = td4.k(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k.setScaleType(scaleType);
        k.setTranslationX(-gm.L(2.0825f));
        int i5 = cmb.D6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(k, i5, ylbVar, mode);
        frameLayout.addView(k, qoe.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, qoe.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        bf0 bf0Var3 = new bf0(context);
        bf0Var3.setRoundRadius(gm.L(30.0f));
        frameLayout4.addView(bf0Var3, qoe.e(60, 60, nm7.D1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = gm.L(10.0f);
        int i6 = cmb.g5;
        Drawable b03 = cmb.b0(L3, cmb.v0(i6, ylbVar));
        wmb M3 = anb.M(i6);
        frameLayout5.setBackground(b03);
        anb.j(frameLayout5, b03, M3, null, ylbVar);
        frameLayout5.setPadding(gm.L(1.33f), gm.L(1.33f), gm.L(1.33f), gm.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = gm.L(10.0f);
        int i7 = cmb.Ei;
        Drawable b04 = cmb.b0(L4, cmb.v0(i7, ylbVar));
        wmb M4 = anb.M(i7);
        textView3.setBackground(b04);
        anb.j(textView3, b04, M4, null, ylbVar);
        textView3.setTypeface(gm.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(gm.L(5.33f), 0, gm.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) bc.J0(starrefprogram.commission_permille)));
        pn2 pn2Var = new pn2(R.drawable.msg_link_1, 0);
        pn2Var.I = 0.65f;
        pn2Var.J = 0.65f;
        pn2Var.H = 0.7f;
        float L5 = gm.L(-2.0f);
        float L6 = gm.L(0.0f);
        pn2Var.r = L5;
        pn2Var.s = L6;
        spannableString.setSpan(pn2Var, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, qoe.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        i2.addView(frameLayout, qoe.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i8 = cmb.F6;
        anb.X(textView4, i8, ylbVar);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(jb6.M0(2131752441, null));
        textView4.setTypeface(gm.o());
        i2.addView(textView4, qoe.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = gm.L(28.0f);
        int i9 = cmb.Z6;
        ShapeDrawable b05 = cmb.b0(L7, cmb.v0(i9, ylbVar));
        wmb M5 = anb.M(i9);
        linearLayout2.setBackground(b05);
        anb.j(linearLayout2, b05, M5, null, ylbVar);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        anb.X(textView5, i8, ylbVar);
        textView5.setText(jb6.a0(null, null, 2131752440, pg3.k(i, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, qoe.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i10 = cmb.q5;
        anb.s(imageView, i10, ylbVar, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, qoe.t(-2, -2, 16, 5, 0, 8, 0));
        i2.addView(linearLayout2, qoe.t(-2, 28, 1, 4, 0, 4, 0));
        rve.a(linearLayout2);
        TextView textView6 = new TextView(context);
        anb.X(textView6, i8, ylbVar);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        nm7.i(textView6);
        SpannableString spannableString2 = new SpannableString(nxa.I0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new z5c(gm.o()), 0, spannableString2.length(), 33);
        textView6.setText(nxa.b1(false, jb6.V(null, null, 2131752450, spannableString2), 0.725f, null));
        TextView m = wi8.m(i2, textView6, qoe.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        anb.X(m, i8, ylbVar);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        nm7.i(m);
        String r = m9c.r(W1);
        String J0 = bc.J0(starrefprogram.commission_permille);
        int i11 = starrefprogram.duration_months;
        if (i11 <= 0) {
            G = jb6.M0(2131752448, null);
        } else {
            if (i11 < 12 || i11 % 12 != 0) {
                str = r;
                r15 = 0;
                G = jb6.G(i11, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = J0;
                objArr[2] = G;
                m.setText(gw3.m(gm.S2(jb6.a0(null, null, 2131752449, objArr)), m.getPaint().getFontMetricsInt(), r15, null, r15));
                i2.addView(m, qoe.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j < 0) {
                    TextView textView7 = new TextView(context);
                    anb.X(textView7, i8, ylbVar);
                    textView7.setTextSize(1, 14.0f);
                    hg9.p(textView7, 17, null, 2131752433);
                    i2.addView(textView7, qoe.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable b06 = cmb.b0(gm.L(28.0f), cmb.v0(i9, ylbVar));
                    wmb M6 = anb.M(i9);
                    linearLayout3.setBackground(b06);
                    anb.j(linearLayout3, b06, M6, null, ylbVar);
                    int L8 = gm.L(28.0f);
                    int v0 = cmb.v0(i9, ylbVar);
                    int v02 = cmb.v0(i9, ylbVar);
                    int i12 = cmb.h6;
                    int v = cmb.v(v02, cmb.v0(i12, ylbVar));
                    fg0 i0 = cmb.i0(L8, L8, L8, L8, v0, v, v);
                    wmb M7 = anb.M(i9);
                    wmb p = anb.p(i9, i12);
                    linearLayout3.setBackground(i0);
                    anb.j(linearLayout3, i0, M7, p, ylbVar);
                    bf0 bf0Var4 = new bf0(context);
                    bf0Var4.setRoundRadius(gm.L(14.0f));
                    linearLayout3.addView(bf0Var4, qoe.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    anb.X(textView8, i8, ylbVar);
                    linearLayout3.addView(textView8, qoe.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    anb.s(imageView2, i10, ylbVar, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, qoe.t(-2, -2, 16, 2, 0, 5, 0));
                    i2.addView(linearLayout3, qoe.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    bf0Var = bf0Var4;
                    textView = textView8;
                } else {
                    bf0Var = null;
                    textView = null;
                    linearLayout = null;
                }
                b61 b61Var = new b61(ylbVar, context, true);
                b61Var.i(jb6.M0(2131752455, null), false, true);
                i2.addView(b61Var, qoe.o(-1, 48));
                l66 l66Var = new l66(context, ylbVar);
                l66Var.setText(gm.N2(jb6.M0(2131752454, null), -1, 0, new dh1(context, (byte) 0), null));
                l66Var.setGravity(17);
                l66Var.setTextSize(1, 12.0f);
                anb.X(l66Var, cmb.A6, ylbVar);
                anb.G(l66Var, cmb.Wc, ylbVar);
                i2.addView(l66Var, qoe.t(-1, -2, 49, 14, 14, 14, 6));
                h.O = i2;
                final byte b = 1;
                bf0Var2.setOnClickListener(new View.OnClickListener() { // from class: wg1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = b;
                        TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                        my0 my0Var = h;
                        switch (b2) {
                            case 0:
                                d S = LaunchActivity.S();
                                if (S != null) {
                                    my0Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram2.bot_id);
                                    S.presentFragment(new hh1(bundle, my0Var));
                                    break;
                                }
                                break;
                            default:
                                d S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    my0Var.dismiss();
                                    S2.presentFragment(ProfileActivity.S2(starrefprogram2.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                b61Var.setOnClickListener(new eh1(b61Var, jArr, i, starrefprogram, h, j, z, context, ylbVar, W1));
                h.setOnDismissListener(new g5((byte) 6));
                i77 i77Var = new i77((Object) jArr, i, (Object) bf0Var3, (Object) bf0Var, (Object) textView, (byte) 7);
                i77Var.run();
                if (linearLayout != null) {
                    ku0.g(i).n();
                    ku0.g(i).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new xh(i, h, ylbVar, linearLayout4, jArr, i77Var));
                }
                final byte b2 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: wg1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b22 = b2;
                        TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                        my0 my0Var = h;
                        switch (b22) {
                            case 0:
                                d S = LaunchActivity.S();
                                if (S != null) {
                                    my0Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram2.bot_id);
                                    S.presentFragment(new hh1(bundle, my0Var));
                                    break;
                                }
                                break;
                            default:
                                d S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    my0Var.dismiss();
                                    S2.presentFragment(ProfileActivity.S2(starrefprogram2.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                h.L(i6);
                h.show();
            }
            G = jb6.G(i11 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = r;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = J0;
        objArr2[2] = G;
        m.setText(gw3.m(gm.S2(jb6.a0(null, null, 2131752449, objArr2)), m.getPaint().getFontMetricsInt(), r15, null, r15));
        i2.addView(m, qoe.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j < 0) {
        }
        b61 b61Var2 = new b61(ylbVar, context, true);
        b61Var2.i(jb6.M0(2131752455, null), false, true);
        i2.addView(b61Var2, qoe.o(-1, 48));
        l66 l66Var2 = new l66(context, ylbVar);
        l66Var2.setText(gm.N2(jb6.M0(2131752454, null), -1, 0, new dh1(context, (byte) 0), null));
        l66Var2.setGravity(17);
        l66Var2.setTextSize(1, 12.0f);
        anb.X(l66Var2, cmb.A6, ylbVar);
        anb.G(l66Var2, cmb.Wc, ylbVar);
        i2.addView(l66Var2, qoe.t(-1, -2, 49, 14, 14, 14, 6));
        h.O = i2;
        final byte b3 = 1;
        bf0Var2.setOnClickListener(new View.OnClickListener() { // from class: wg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b3;
                TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                my0 my0Var = h;
                switch (b22) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            my0Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram2.bot_id);
                            S.presentFragment(new hh1(bundle, my0Var));
                            break;
                        }
                        break;
                    default:
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            my0Var.dismiss();
                            S2.presentFragment(ProfileActivity.S2(starrefprogram2.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        b61Var2.setOnClickListener(new eh1(b61Var2, jArr, i, starrefprogram, h, j, z, context, ylbVar, W1));
        h.setOnDismissListener(new g5((byte) 6));
        i77 i77Var2 = new i77((Object) jArr, i, (Object) bf0Var3, (Object) bf0Var, (Object) textView, (byte) 7);
        i77Var2.run();
        if (linearLayout != null) {
        }
        final byte b22 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: wg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b222 = b22;
                TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                my0 my0Var = h;
                switch (b222) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            my0Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram2.bot_id);
                            S.presentFragment(new hh1(bundle, my0Var));
                            break;
                        }
                        break;
                    default:
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            my0Var.dismiss();
                            S2.presentFragment(ProfileActivity.S2(starrefprogram2.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        h.L(i6);
        h.show();
    }

    public static my0 K0(Context context, int i, TL_payments.connectedBotStarRef connectedbotstarref, long j, ylb ylbVar) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        my0 my0Var;
        int i2;
        char c;
        String G;
        int i3;
        char c2;
        String G2;
        int i4;
        LinearLayout linearLayout2;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        my0 h = hg9.h(1, ylbVar, context, false);
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout i5 = hg9.i(context, 1);
        i5.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
        i5.setClipChildren(false);
        i5.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable K = cmb.K(gm.L(40.0f), cmb.v0(connectedbotstarref.revoked ? cmb.mk : cmb.Ei, ylbVar));
        wmb M = anb.M(connectedbotstarref.revoked ? cmb.mk : cmb.Ei);
        view.setBackground(K);
        anb.j(view, K, M, null, ylbVar);
        frameLayout.addView(view, qoe.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, qoe.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L = gm.L(50.0f);
            int i6 = cmb.g5;
            Drawable b0 = cmb.b0(L, cmb.v0(i6, ylbVar));
            wmb M2 = anb.M(i6);
            frameLayout2.setBackground(b0);
            anb.j(frameLayout2, b0, M2, null, ylbVar);
            frameLayout.addView(frameLayout2, qoe.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(gm.o());
            textView.setTextSize(1, 12.0f);
            Drawable b02 = cmb.b0(gm.L(9.5f), cmb.v0(connectedbotstarref.revoked ? cmb.mk : cmb.kk, ylbVar));
            wmb M3 = anb.M(connectedbotstarref.revoked ? cmb.mk : cmb.kk);
            textView.setBackground(b02);
            anb.j(textView, b02, M3, null, ylbVar);
            textView.setTextColor(-1);
            textView.setPadding(gm.L(6.66f), 0, gm.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            pn2 pn2Var = new pn2(R.drawable.mini_reply_user, 0);
            pn2Var.I = 0.937f;
            pn2Var.J = 0.937f;
            float f = -gm.L(1.33f);
            float L2 = gm.L(1.0f);
            pn2Var.r = f;
            pn2Var.s = L2;
            pn2Var.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, qoe.d(-1, 19.0f, nm7.D1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        i5.addView(frameLayout, qoe.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i7 = cmb.F6;
        anb.X(textView2, i7, ylbVar);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131752429, null));
        textView2.setTypeface(gm.o());
        i5.addView(textView2, qoe.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L3 = gm.L(28.0f);
        int i8 = cmb.Z6;
        ShapeDrawable b03 = cmb.b0(L3, cmb.v0(i8, ylbVar));
        wmb M4 = anb.M(i8);
        linearLayout3.setBackground(b03);
        anb.j(linearLayout3, b03, M4, null, ylbVar);
        bf0 bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(14.0f));
        pc0 pc0Var = new pc0((ylb) null);
        linearLayout3.addView(bf0Var, qoe.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        anb.X(textView3, i7, ylbVar);
        textView3.setText(pg3.k(i, connectedbotstarref.bot_id));
        pc0Var.q(W1);
        bf0Var.f(W1, pc0Var);
        linearLayout3.addView(textView3, qoe.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i9 = cmb.q5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView2, i9, ylbVar, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, qoe.t(-2, -2, 16, 5, 0, 8, 0));
        i5.addView(linearLayout3, qoe.t(-2, 28, 1, 4, 0, 4, 0));
        rve.a(linearLayout3);
        TextView textView4 = new TextView(context);
        anb.X(textView4, i7, ylbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(gm.S2(jb6.M0(2131752431, null)));
            my0Var = h;
            i2 = i9;
            linearLayout = linearLayout3;
        } else {
            int i10 = connectedbotstarref.commission_permille;
            linearLayout = linearLayout3;
            if (j < 0) {
                String J0 = bc.J0(i10);
                String r = m9c.r(W1);
                int i11 = connectedbotstarref.duration_months;
                my0Var = h;
                i2 = i9;
                if (i11 <= 0) {
                    G2 = jb6.M0(2131752448, null);
                    c2 = 0;
                } else if (i11 < 12 || i11 % 12 != 0) {
                    c2 = 0;
                    G2 = jb6.G(i11, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c2 = 0;
                    G2 = jb6.G(i11 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c2] = J0;
                objArr[1] = r;
                objArr[2] = G2;
                hg9.q(null, null, 2131752432, objArr, textView4);
            } else {
                my0Var = h;
                i2 = i9;
                String J02 = bc.J0(i10);
                String r2 = m9c.r(W1);
                int i12 = connectedbotstarref.duration_months;
                if (i12 <= 0) {
                    G = jb6.M0(2131752448, null);
                    i3 = 3;
                    c = 0;
                } else {
                    if (i12 < 12 || i12 % 12 != 0) {
                        c = 0;
                        G = jb6.G(i12, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                    } else {
                        c = 0;
                        G = jb6.G(i12 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                    }
                    i3 = 3;
                }
                Object[] objArr2 = new Object[i3];
                objArr2[c] = J02;
                objArr2[1] = r2;
                objArr2[2] = G;
                hg9.q(null, null, 2131752430, objArr2, textView4);
            }
        }
        i5.addView(textView4, qoe.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i4 = i8;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            anb.X(textView5, i7, ylbVar);
            textView5.setTextSize(1, 14.0f);
            hg9.p(textView5, 17, null, 2131752433);
            i5.addView(textView5, qoe.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable b04 = cmb.b0(gm.L(28.0f), cmb.v0(i8, ylbVar));
            wmb M5 = anb.M(i8);
            linearLayout4.setBackground(b04);
            anb.j(linearLayout4, b04, M5, null, ylbVar);
            bf0 bf0Var2 = new bf0(context);
            bf0Var2.setRoundRadius(gm.L(14.0f));
            pc0 pc0Var2 = new pc0((ylb) null);
            linearLayout4.addView(bf0Var2, qoe.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            anb.X(textView6, i7, ylbVar);
            if (j >= 0) {
                TLRPC.User W12 = oc7.r1(i).W1(Long.valueOf(j));
                pc0Var2.q(W12);
                bf0Var2.f(W12, pc0Var2);
                textView6.setText(m9c.r(W12));
                i4 = i8;
            } else {
                i4 = i8;
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                pc0Var2.p(L0);
                bf0Var2.f(L0, pc0Var2);
                textView6.setText(L0 == null ? "" : L0.title);
            }
            linearLayout4.addView(textView6, qoe.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            anb.s(imageView3, i2, ylbVar, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, qoe.t(-2, -2, 16, 2, 0, 5, 0));
            i5.addView(linearLayout4, qoe.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        anb.X(textView7, i7, ylbVar);
        int L4 = gm.L(8.0f);
        int i13 = i4;
        int v0 = cmb.v0(i13, ylbVar);
        int v02 = cmb.v0(i13, ylbVar);
        int i14 = cmb.h6;
        int v = cmb.v(v02, cmb.v0(i14, ylbVar));
        fg0 i0 = cmb.i0(L4, L4, L4, L4, v0, v, v);
        wmb M6 = anb.M(i13);
        wmb p = anb.p(i13, i14);
        textView7.setBackground(i0);
        anb.j(textView7, i0, M6, p, ylbVar);
        textView7.setPadding(gm.L(16.0f), gm.L(14.66f), gm.L(16.0f), gm.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        i5.addView(textView7, qoe.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        b61 b61Var = new b61(ylbVar, context, true);
        if (connectedbotstarref.revoked) {
            b61Var.i(jb6.M0(2131752434, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new pn2(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) jb6.M0(2131752439, null));
            b61Var.i(spannableStringBuilder2, false, true);
        }
        i5.addView(b61Var, qoe.o(-1, 48));
        l66 l66Var = new l66(context, ylbVar);
        long j2 = connectedbotstarref.participants;
        l66Var.setText(j2 <= 0 ? jb6.a0(null, null, 2131752437, m9c.r(W1)) : jb6.G((int) j2, "ChannelAffiliateProgramLinkOpened", m9c.r(W1)));
        l66Var.setGravity(17);
        l66Var.setTextSize(1, 12.0f);
        anb.X(l66Var, cmb.A6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        i5.addView(l66Var, qoe.t(-1, -2, 49, 14, 12, 14, 2));
        my0 my0Var2 = my0Var;
        my0Var2.O = i5;
        l97 l97Var = new l97(connectedbotstarref, my0Var2, ylbVar, W1, (byte) 23);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new k81(l97Var, (byte) 7));
        }
        ch1 ch1Var = new ch1(connectedbotstarref, i, my0Var2, context, j, ylbVar, l97Var);
        my0 my0Var3 = my0Var2;
        b61Var.setOnClickListener(ch1Var);
        my0Var3.setOnDismissListener(new g5((byte) 6));
        if (linearLayout2 != null) {
            ku0.g(i).n();
            ku0.g(i).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener ch1Var2 = new ch1(i, my0Var3, ylbVar, linearLayout5, j, context, connectedbotstarref);
            my0Var3 = my0Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(ch1Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new rc1((Object) my0Var3, (Object) connectedbotstarref2, (byte) 1));
        my0Var3.L(cmb.g5);
        d S = LaunchActivity.S();
        if (!gm.O1() && S != null && !gm.s1(S)) {
            my0Var3.X(S);
        }
        my0Var3.show();
        return my0Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0198 A[LOOP:0: B:20:0x0192->B:22:0x0198, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0(ArrayList arrayList, l7c l7cVar) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        sb sbVar = (sb) o0(getParentActivity());
        c6c c6cVar = new c6c(-2);
        c6cVar.c = sbVar;
        arrayList.add(c6cVar);
        arrayList.add(zb.i(R.drawable.menu_feature_reliable, jb6.M0(2131752460, null), jb6.M0(2131752461, null)));
        arrayList.add(zb.i(R.drawable.menu_feature_transparent, jb6.M0(2131752458, null), jb6.M0(2131752459, null)));
        arrayList.add(zb.i(R.drawable.menu_feature_simple, jb6.M0(2131752456, null), jb6.M0(2131752457, null)));
        arrayList.add(c6c.B(1, null));
        ku0 g = ku0.g(this.currentAccount);
        long j = this.S;
        hu0 d = g.d(j);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            aq1.o(2131752428, null, arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i);
                int i2 = ih1.b;
                c6c K = c6c.K(ih1.class);
                K.H = connectedbotstarref;
                K.s = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(c6c.p(29));
                arrayList.add(c6c.p(29));
                arrayList.add(c6c.p(29));
            }
            arrayList.add(c6c.B(2, null));
        }
        iu0 e = ku0.g(this.currentAccount).e(j);
        ArrayList arrayList3 = e.e;
        if (!arrayList3.isEmpty() || e.c > 0) {
            String M0 = jb6.M0(2131752427, null);
            int i3 = e.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131752426, null)).append((CharSequence) " ");
            if (i3 == 1) {
                spannableString = new SpannableString(jb6.M0(2131752424, null).concat("v"));
            } else if (i3 == 2) {
                spannableString = new SpannableString(jb6.M0(2131752423, null).concat("v"));
            } else {
                if (i3 == 3) {
                    spannableString = new SpannableString(jb6.M0(2131752425, null).concat("v"));
                }
                int i4 = kh1.b;
                c6c K2 = c6c.K(kh1.class);
                K2.m = M0;
                K2.n = spannableStringBuilder;
                arrayList.add(K2);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    Object obj = arrayList3.get(i5);
                    int i6 = ih1.b;
                    c6c K3 = c6c.K(ih1.class);
                    K3.H = obj;
                    K3.s = true;
                    arrayList.add(K3);
                }
                if (e.d || e.h) {
                    arrayList.add(c6c.p(29));
                    arrayList.add(c6c.p(29));
                    arrayList.add(c6c.p(29));
                }
                arrayList.add(c6c.B(3, null));
            }
            pn2 pn2Var = new pn2(R.drawable.arrow_more, 0);
            pn2Var.f = true;
            pn2Var.I = 0.6f;
            pn2Var.J = 0.6f;
            spannableString.setSpan(pn2Var, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new gh1(this, i3, ku0.g(this.currentAccount).e(j)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i42 = kh1.b;
            c6c K22 = c6c.K(kh1.class);
            K22.m = M0;
            K22.n = spannableStringBuilder;
            arrayList.add(K22);
            while (i5 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.B(3, null));
        }
        arrayList.add(c6c.k(this.V));
    }

    public final /* synthetic */ void E0(Context context, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.S, this.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.S, this.resourceProvider);
            }
        }
    }

    public final void F0(TLObject tLObject, he heVar) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ku0 g = ku0.g(this.currentAccount);
            long j = this.S;
            hu0 d = g.d(j);
            ArrayList arrayList = d.e;
            int i = d.a;
            oc7.r1(i).d4(connectedstarrefbots.users, false);
            for (int i2 = 0; i2 < connectedstarrefbots.connected_bots.size(); i2++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i2);
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    if (((TL_payments.connectedBotStarRef) arrayList.get(i3)).bot_id != connectedbotstarref.bot_id) {
                        i3++;
                    } else if (connectedbotstarref.revoked) {
                        arrayList.remove(i3);
                        d.c = Math.max(d.c - 1, 0);
                    } else {
                        arrayList.set(i3, connectedbotstarref);
                    }
                }
            }
            nm7.f(i).k(nm7.O3, Long.valueOf(d.b));
            d.a();
            iu0 e = ku0.g(this.currentAccount).e(j);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            this.W.O(true);
        }
        heVar.dismiss();
    }

    public final void G0(TL_payments.connectedBotStarRef connectedbotstarref) {
        he heVar = new he(3, null, getParentActivity());
        heVar.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = oc7.r1(this.currentAccount).i1(this.S);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new pm(this, heVar, (byte) 10));
    }

    public final void H0(Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M0 = jb6.M0(2131748764, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0(null, null, 2131748763, m9c.r(user)));
        alertDialog$Builder.j(jb6.M0(2131748762, null), new g11((Object) this, (Object) connectedbotstarref, (byte) 8));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final boolean I0(Context context, View view, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(connectedbotstarref.bot_id));
                bu5 I = bu5.I(this, view);
                I.k(R.drawable.msg_bot, jb6.M0(2131746441, null), new y31(this, W1, (byte) 21), W1.bot_has_main_app);
                I.k(R.drawable.msg_bot, jb6.M0(2131752865, null), new y31(this, connectedbotstarref, (byte) 22), !W1.bot_has_main_app);
                I.b(R.drawable.msg_link2, jb6.M0(2131751699, null), new tv0(this, connectedbotstarref, W1, (byte) 17), false);
                I.l(R.drawable.msg_leave, new l97(this, context, W1, connectedbotstarref, (byte) 24), jb6.M0(2131748762, null), !connectedbotstarref.revoked, true);
                I.W(5);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.H = false;
        this.F = gm.L(238.0f);
        byte b = 4;
        o72 o72Var = new o72(context, b);
        this.V = o72Var;
        anb.h(cmb.h5, null, o72Var);
        super.createView(context);
        this.T = new FrameLayout(context);
        ft4 ft4Var = new ft4(context, 1, 3);
        this.U = ft4Var;
        ft4Var.setImportantForAccessibility(4);
        vs4 vs4Var = this.U.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, qoe.d(nm7.T2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(jb6.M0(2131752419, null), gm.S2(jb6.M0(2131752420, null)), this.T, null);
        this.c.setOnItemClickListener(new k0(this, context, b));
        this.c.setOnItemLongClickListener(new g11((Object) this, (Object) context, (byte) 9));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.c.setItemAnimator(sc3Var);
        this.c.setOnScrollListener(new y(this, (byte) 15));
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vb vbVar;
        int i3 = nm7.O3;
        long j = this.S;
        if (i != i3) {
            if (i == nm7.N3 && ((Long) objArr[0]).longValue() == j && (vbVar = this.W) != null) {
                vbVar.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j) {
            vb vbVar2 = this.W;
            if (vbVar2 != null) {
                vbVar2.O(true);
            }
            ku0.g(this.currentAccount).d(j).a();
        }
    }

    @Override // h15
    public final y59 k0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new f(this, (byte) 23), getResourceProvider(), (byte) 1);
        this.W = vbVar;
        return vbVar;
    }

    @Override // h15
    public final dta m0() {
        ub ubVar = new ub(getParentActivity(), (byte) 1);
        ubVar.c();
        return ubVar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.O3);
        nm7.f(this.currentAccount).b(this, nm7.N3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.O3);
        nm7.f(this.currentAccount).n(this, nm7.N3);
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        ft4 ft4Var = this.U;
        if (ft4Var != null) {
            ft4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        ft4 ft4Var = this.U;
        if (ft4Var != null) {
            ft4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
