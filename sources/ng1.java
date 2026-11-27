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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ng1 extends m15 implements fn7 {
    public final long S;
    public FrameLayout T;
    public it4 U;
    public t62 V;
    public wb W;

    public ng1(long j) {
        this.S = j;
        this.N = true;
        this.M = hl.L(60.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0569  */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J0(Context context, int i, final TL_payments.starRefProgram starrefprogram, long j, vnb vnbVar, boolean z) {
        long[] jArr;
        String str;
        ?? r15;
        String G;
        de0 de0Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final nx0 h = uh9.h(1, vnbVar, context, false);
        long[] jArr2 = {j};
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(starrefprogram.bot_id));
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, tre.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        de0 de0Var2 = new de0(context);
        de0Var2.setRoundRadius(hl.L(30.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(X1);
        de0Var2.f(X1, rb0Var);
        iye.a(de0Var2);
        frameLayout2.addView(de0Var2, tre.e(60, 60, jn7.D1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = hl.L(10.0f);
            int i2 = aob.h5;
            ShapeDrawable b0 = aob.b0(L, aob.v0(i2, vnbVar));
            uob M = yob.M(i2);
            frameLayout3.setBackground(b0);
            yob.j(frameLayout3, b0, M, null, vnbVar);
            frameLayout3.setPadding(hl.L(1.33f), hl.L(1.33f), hl.L(1.33f), hl.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = hl.L(10.0f);
            int i3 = aob.lk;
            ShapeDrawable b02 = aob.b0(L2, aob.v0(i3, vnbVar));
            uob M2 = yob.M(i3);
            textView2.setBackground(b02);
            yob.j(textView2, b02, M2, null, vnbVar);
            textView2.setTypeface(hl.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(hl.L(5.33f), 0, hl.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb.append((Object) nza.I0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(nza.U0(sb.toString(), 0.75f, new wm2[1]));
            frameLayout3.addView(textView2, tre.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView k = qd4.k(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k.setScaleType(scaleType);
        k.setTranslationX(-hl.L(2.0825f));
        int i4 = aob.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(k, i4, vnbVar, mode);
        frameLayout.addView(k, tre.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, tre.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        de0 de0Var3 = new de0(context);
        de0Var3.setRoundRadius(hl.L(30.0f));
        frameLayout4.addView(de0Var3, tre.e(60, 60, jn7.D1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = hl.L(10.0f);
        int i5 = aob.h5;
        Drawable b03 = aob.b0(L3, aob.v0(i5, vnbVar));
        uob M3 = yob.M(i5);
        frameLayout5.setBackground(b03);
        yob.j(frameLayout5, b03, M3, null, vnbVar);
        frameLayout5.setPadding(hl.L(1.33f), hl.L(1.33f), hl.L(1.33f), hl.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = hl.L(10.0f);
        int i6 = aob.Fi;
        Drawable b04 = aob.b0(L4, aob.v0(i6, vnbVar));
        uob M4 = yob.M(i6);
        textView3.setBackground(b04);
        yob.j(textView3, b04, M4, null, vnbVar);
        textView3.setTypeface(hl.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(hl.L(5.33f), 0, hl.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) cc.J0(starrefprogram.commission_permille)));
        wm2 wm2Var = new wm2(R.drawable.msg_link_1, 0);
        wm2Var.I = 0.65f;
        wm2Var.J = 0.65f;
        wm2Var.H = 0.7f;
        float L5 = hl.L(-2.0f);
        float L6 = hl.L(0.0f);
        wm2Var.r = L5;
        wm2Var.s = L6;
        spannableString.setSpan(wm2Var, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, tre.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        j2.addView(frameLayout, tre.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i7 = aob.G6;
        yob.X(textView4, i7, vnbVar);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(ob6.M0(2131752469, null));
        textView4.setTypeface(hl.o());
        j2.addView(textView4, tre.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = hl.L(28.0f);
        int i8 = aob.a7;
        ShapeDrawable b05 = aob.b0(L7, aob.v0(i8, vnbVar));
        uob M5 = yob.M(i8);
        linearLayout2.setBackground(b05);
        yob.j(linearLayout2, b05, M5, null, vnbVar);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        yob.X(textView5, i7, vnbVar);
        textView5.setText(ob6.a0(null, null, 2131752468, wf3.k(i, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, tre.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i9 = aob.r5;
        yob.s(imageView, i9, vnbVar, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, tre.t(-2, -2, 16, 5, 0, 8, 0));
        j2.addView(linearLayout2, tre.t(-2, 28, 1, 4, 0, 4, 0));
        iye.a(linearLayout2);
        TextView textView6 = new TextView(context);
        yob.X(textView6, i7, vnbVar);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        jn7.i(textView6);
        SpannableString spannableString2 = new SpannableString(nza.I0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new y7c(hl.o()), 0, spannableString2.length(), 33);
        textView6.setText(nza.b1(false, ob6.V(null, null, 2131752478, spannableString2), 0.725f, null));
        TextView m = ik8.m(j2, textView6, tre.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        yob.X(m, i7, vnbVar);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        jn7.i(m);
        String r = lbc.r(X1);
        String J0 = cc.J0(starrefprogram.commission_permille);
        int i10 = starrefprogram.duration_months;
        if (i10 <= 0) {
            G = ob6.M0(2131752476, null);
        } else {
            if (i10 < 12 || i10 % 12 != 0) {
                str = r;
                r15 = 0;
                G = ob6.G(i10, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = J0;
                objArr[2] = G;
                m.setText(pv3.m(hl.S2(ob6.a0(null, null, 2131752477, objArr)), m.getPaint().getFontMetricsInt(), r15, null, r15));
                j2.addView(m, tre.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j < 0) {
                    TextView textView7 = new TextView(context);
                    yob.X(textView7, i7, vnbVar);
                    textView7.setTextSize(1, 14.0f);
                    uh9.q(textView7, 17, null, 2131752461);
                    j2.addView(textView7, tre.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable b06 = aob.b0(hl.L(28.0f), aob.v0(i8, vnbVar));
                    uob M6 = yob.M(i8);
                    linearLayout3.setBackground(b06);
                    yob.j(linearLayout3, b06, M6, null, vnbVar);
                    int L8 = hl.L(28.0f);
                    int v0 = aob.v0(i8, vnbVar);
                    int v02 = aob.v0(i8, vnbVar);
                    int i11 = aob.i6;
                    int v = aob.v(v02, aob.v0(i11, vnbVar));
                    hf0 i0 = aob.i0(L8, L8, L8, L8, v0, v, v);
                    uob M7 = yob.M(i8);
                    uob p = yob.p(i8, i11);
                    linearLayout3.setBackground(i0);
                    yob.j(linearLayout3, i0, M7, p, vnbVar);
                    de0 de0Var4 = new de0(context);
                    de0Var4.setRoundRadius(hl.L(14.0f));
                    linearLayout3.addView(de0Var4, tre.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    yob.X(textView8, i7, vnbVar);
                    linearLayout3.addView(textView8, tre.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    yob.s(imageView2, i9, vnbVar, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, tre.t(-2, -2, 16, 2, 0, 5, 0));
                    j2.addView(linearLayout3, tre.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    de0Var = de0Var4;
                    textView = textView8;
                } else {
                    de0Var = null;
                    textView = null;
                    linearLayout = null;
                }
                c51 c51Var = new c51(vnbVar, context, true);
                c51Var.i(ob6.M0(2131752483, null), false, true);
                j2.addView(c51Var, tre.o(-1, 48));
                p66 p66Var = new p66(context, vnbVar);
                p66Var.setText(hl.N2(ob6.M0(2131752482, null), -1, 0, new xf1(context, (byte) 0), null));
                p66Var.setGravity(17);
                p66Var.setTextSize(1, 12.0f);
                yob.X(p66Var, aob.B6, vnbVar);
                yob.G(p66Var, aob.Xc, vnbVar);
                j2.addView(p66Var, tre.t(-1, -2, 49, 14, 14, 14, 6));
                h.O = j2;
                final byte b = 0;
                de0Var2.setOnClickListener(new View.OnClickListener() { // from class: yf1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = b;
                        TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                        nx0 nx0Var = h;
                        switch (b2) {
                            case 0:
                                e S = LaunchActivity.S();
                                if (S != null) {
                                    nx0Var.dismiss();
                                    S.presentFragment(ProfileActivity.Q2(starrefprogram2.bot_id));
                                    break;
                                }
                                break;
                            default:
                                e S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    nx0Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram2.bot_id);
                                    S2.presentFragment(new ig1(bundle, nx0Var));
                                    break;
                                }
                                break;
                        }
                    }
                });
                c51Var.setOnClickListener(new zf1(c51Var, jArr, i, starrefprogram, h, j, z, context, vnbVar, X1));
                h.setOnDismissListener(new h5((byte) 6));
                l77 l77Var = new l77((Object) jArr, i, (Object) de0Var3, (Object) de0Var, (Object) textView, (byte) 7);
                l77Var.run();
                if (linearLayout != null) {
                    kt0.g(i).n();
                    kt0.g(i).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new be(i, h, vnbVar, linearLayout4, jArr, l77Var));
                }
                final byte b2 = 1;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: yf1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b22 = b2;
                        TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                        nx0 nx0Var = h;
                        switch (b22) {
                            case 0:
                                e S = LaunchActivity.S();
                                if (S != null) {
                                    nx0Var.dismiss();
                                    S.presentFragment(ProfileActivity.Q2(starrefprogram2.bot_id));
                                    break;
                                }
                                break;
                            default:
                                e S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    nx0Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram2.bot_id);
                                    S2.presentFragment(new ig1(bundle, nx0Var));
                                    break;
                                }
                                break;
                        }
                    }
                });
                h.L(i5);
                h.show();
            }
            G = ob6.G(i10 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = r;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = J0;
        objArr2[2] = G;
        m.setText(pv3.m(hl.S2(ob6.a0(null, null, 2131752477, objArr2)), m.getPaint().getFontMetricsInt(), r15, null, r15));
        j2.addView(m, tre.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j < 0) {
        }
        c51 c51Var2 = new c51(vnbVar, context, true);
        c51Var2.i(ob6.M0(2131752483, null), false, true);
        j2.addView(c51Var2, tre.o(-1, 48));
        p66 p66Var2 = new p66(context, vnbVar);
        p66Var2.setText(hl.N2(ob6.M0(2131752482, null), -1, 0, new xf1(context, (byte) 0), null));
        p66Var2.setGravity(17);
        p66Var2.setTextSize(1, 12.0f);
        yob.X(p66Var2, aob.B6, vnbVar);
        yob.G(p66Var2, aob.Xc, vnbVar);
        j2.addView(p66Var2, tre.t(-1, -2, 49, 14, 14, 14, 6));
        h.O = j2;
        final byte b3 = 0;
        de0Var2.setOnClickListener(new View.OnClickListener() { // from class: yf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b3;
                TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                nx0 nx0Var = h;
                switch (b22) {
                    case 0:
                        e S = LaunchActivity.S();
                        if (S != null) {
                            nx0Var.dismiss();
                            S.presentFragment(ProfileActivity.Q2(starrefprogram2.bot_id));
                            break;
                        }
                        break;
                    default:
                        e S2 = LaunchActivity.S();
                        if (S2 != null) {
                            nx0Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram2.bot_id);
                            S2.presentFragment(new ig1(bundle, nx0Var));
                            break;
                        }
                        break;
                }
            }
        });
        c51Var2.setOnClickListener(new zf1(c51Var2, jArr, i, starrefprogram, h, j, z, context, vnbVar, X1));
        h.setOnDismissListener(new h5((byte) 6));
        l77 l77Var2 = new l77((Object) jArr, i, (Object) de0Var3, (Object) de0Var, (Object) textView, (byte) 7);
        l77Var2.run();
        if (linearLayout != null) {
        }
        final byte b22 = 1;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: yf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b222 = b22;
                TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                nx0 nx0Var = h;
                switch (b222) {
                    case 0:
                        e S = LaunchActivity.S();
                        if (S != null) {
                            nx0Var.dismiss();
                            S.presentFragment(ProfileActivity.Q2(starrefprogram2.bot_id));
                            break;
                        }
                        break;
                    default:
                        e S2 = LaunchActivity.S();
                        if (S2 != null) {
                            nx0Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram2.bot_id);
                            S2.presentFragment(new ig1(bundle, nx0Var));
                            break;
                        }
                        break;
                }
            }
        });
        h.L(i5);
        h.show();
    }

    public static nx0 K0(Context context, int i, TL_payments.connectedBotStarRef connectedbotstarref, long j, vnb vnbVar) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        nx0 nx0Var;
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
        nx0 h = uh9.h(1, vnbVar, context, false);
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable K = aob.K(hl.L(40.0f), aob.v0(connectedbotstarref.revoked ? aob.nk : aob.Fi, vnbVar));
        uob M = yob.M(connectedbotstarref.revoked ? aob.nk : aob.Fi);
        view.setBackground(K);
        yob.j(view, K, M, null, vnbVar);
        frameLayout.addView(view, tre.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, tre.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L = hl.L(50.0f);
            int i5 = aob.h5;
            Drawable b0 = aob.b0(L, aob.v0(i5, vnbVar));
            uob M2 = yob.M(i5);
            frameLayout2.setBackground(b0);
            yob.j(frameLayout2, b0, M2, null, vnbVar);
            frameLayout.addView(frameLayout2, tre.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(hl.o());
            textView.setTextSize(1, 12.0f);
            Drawable b02 = aob.b0(hl.L(9.5f), aob.v0(connectedbotstarref.revoked ? aob.nk : aob.lk, vnbVar));
            uob M3 = yob.M(connectedbotstarref.revoked ? aob.nk : aob.lk);
            textView.setBackground(b02);
            yob.j(textView, b02, M3, null, vnbVar);
            textView.setTextColor(-1);
            textView.setPadding(hl.L(6.66f), 0, hl.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            wm2 wm2Var = new wm2(R.drawable.mini_reply_user, 0);
            wm2Var.I = 0.937f;
            wm2Var.J = 0.937f;
            float f = -hl.L(1.33f);
            float L2 = hl.L(1.0f);
            wm2Var.r = f;
            wm2Var.s = L2;
            wm2Var.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, tre.d(-1, 19.0f, jn7.D1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        j2.addView(frameLayout, tre.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i6 = aob.G6;
        yob.X(textView2, i6, vnbVar);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131752457, null));
        textView2.setTypeface(hl.o());
        j2.addView(textView2, tre.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L3 = hl.L(28.0f);
        int i7 = aob.a7;
        ShapeDrawable b03 = aob.b0(L3, aob.v0(i7, vnbVar));
        uob M4 = yob.M(i7);
        linearLayout3.setBackground(b03);
        yob.j(linearLayout3, b03, M4, null, vnbVar);
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(14.0f));
        rb0 rb0Var = new rb0((vnb) null);
        linearLayout3.addView(de0Var, tre.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        yob.X(textView3, i6, vnbVar);
        textView3.setText(wf3.k(i, connectedbotstarref.bot_id));
        rb0Var.q(X1);
        de0Var.f(X1, rb0Var);
        linearLayout3.addView(textView3, tre.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i8 = aob.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView2, i8, vnbVar, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, tre.t(-2, -2, 16, 5, 0, 8, 0));
        j2.addView(linearLayout3, tre.t(-2, 28, 1, 4, 0, 4, 0));
        iye.a(linearLayout3);
        TextView textView4 = new TextView(context);
        yob.X(textView4, i6, vnbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(hl.S2(ob6.M0(2131752459, null)));
            nx0Var = h;
            i2 = i8;
            linearLayout = linearLayout3;
        } else {
            int i9 = connectedbotstarref.commission_permille;
            linearLayout = linearLayout3;
            if (j < 0) {
                String J0 = cc.J0(i9);
                String r = lbc.r(X1);
                int i10 = connectedbotstarref.duration_months;
                nx0Var = h;
                i2 = i8;
                if (i10 <= 0) {
                    G2 = ob6.M0(2131752476, null);
                    c2 = 0;
                } else if (i10 < 12 || i10 % 12 != 0) {
                    c2 = 0;
                    G2 = ob6.G(i10, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c2 = 0;
                    G2 = ob6.G(i10 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c2] = J0;
                objArr[1] = r;
                objArr[2] = G2;
                uh9.r(null, null, 2131752460, objArr, textView4);
            } else {
                nx0Var = h;
                i2 = i8;
                String J02 = cc.J0(i9);
                String r2 = lbc.r(X1);
                int i11 = connectedbotstarref.duration_months;
                if (i11 <= 0) {
                    G = ob6.M0(2131752476, null);
                    i3 = 3;
                    c = 0;
                } else {
                    if (i11 < 12 || i11 % 12 != 0) {
                        c = 0;
                        G = ob6.G(i11, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                    } else {
                        c = 0;
                        G = ob6.G(i11 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                    }
                    i3 = 3;
                }
                Object[] objArr2 = new Object[i3];
                objArr2[c] = J02;
                objArr2[1] = r2;
                objArr2[2] = G;
                uh9.r(null, null, 2131752458, objArr2, textView4);
            }
        }
        j2.addView(textView4, tre.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i4 = i7;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            yob.X(textView5, i6, vnbVar);
            textView5.setTextSize(1, 14.0f);
            uh9.q(textView5, 17, null, 2131752461);
            j2.addView(textView5, tre.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable b04 = aob.b0(hl.L(28.0f), aob.v0(i7, vnbVar));
            uob M5 = yob.M(i7);
            linearLayout4.setBackground(b04);
            yob.j(linearLayout4, b04, M5, null, vnbVar);
            de0 de0Var2 = new de0(context);
            de0Var2.setRoundRadius(hl.L(14.0f));
            rb0 rb0Var2 = new rb0((vnb) null);
            linearLayout4.addView(de0Var2, tre.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            yob.X(textView6, i6, vnbVar);
            if (j >= 0) {
                TLRPC.User X12 = uc7.s1(i).X1(Long.valueOf(j));
                rb0Var2.q(X12);
                de0Var2.f(X12, rb0Var2);
                textView6.setText(lbc.r(X12));
                i4 = i7;
            } else {
                i4 = i7;
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
                rb0Var2.p(M0);
                de0Var2.f(M0, rb0Var2);
                textView6.setText(M0 == null ? "" : M0.title);
            }
            linearLayout4.addView(textView6, tre.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            yob.s(imageView3, i2, vnbVar, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, tre.t(-2, -2, 16, 2, 0, 5, 0));
            j2.addView(linearLayout4, tre.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        yob.X(textView7, i6, vnbVar);
        int L4 = hl.L(8.0f);
        int i12 = i4;
        int v0 = aob.v0(i12, vnbVar);
        int v02 = aob.v0(i12, vnbVar);
        int i13 = aob.i6;
        int v = aob.v(v02, aob.v0(i13, vnbVar));
        hf0 i0 = aob.i0(L4, L4, L4, L4, v0, v, v);
        uob M6 = yob.M(i12);
        uob p = yob.p(i12, i13);
        textView7.setBackground(i0);
        yob.j(textView7, i0, M6, p, vnbVar);
        textView7.setPadding(hl.L(16.0f), hl.L(14.66f), hl.L(16.0f), hl.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        j2.addView(textView7, tre.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        c51 c51Var = new c51(vnbVar, context, true);
        if (connectedbotstarref.revoked) {
            c51Var.i(ob6.M0(2131752462, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new wm2(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131752467, null));
            c51Var.i(spannableStringBuilder2, false, true);
        }
        j2.addView(c51Var, tre.o(-1, 48));
        p66 p66Var = new p66(context, vnbVar);
        long j3 = connectedbotstarref.participants;
        p66Var.setText(j3 <= 0 ? ob6.a0(null, null, 2131752465, lbc.r(X1)) : ob6.G((int) j3, "ChannelAffiliateProgramLinkOpened", lbc.r(X1)));
        p66Var.setGravity(17);
        p66Var.setTextSize(1, 12.0f);
        yob.X(p66Var, aob.B6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        j2.addView(p66Var, tre.t(-1, -2, 49, 14, 12, 14, 2));
        nx0 nx0Var2 = nx0Var;
        nx0Var2.O = j2;
        o97 o97Var = new o97(connectedbotstarref, nx0Var2, vnbVar, X1, (byte) 24);
        byte b = 6;
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new r81(o97Var, b));
        }
        fg1 fg1Var = new fg1(connectedbotstarref, i, nx0Var2, context, j, vnbVar, o97Var);
        nx0 nx0Var3 = nx0Var2;
        c51Var.setOnClickListener(fg1Var);
        nx0Var3.setOnDismissListener(new h5(b));
        if (linearLayout2 != null) {
            kt0.g(i).n();
            kt0.g(i).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener fg1Var2 = new fg1(i, nx0Var3, vnbVar, linearLayout5, j, context, connectedbotstarref);
            nx0Var3 = nx0Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(fg1Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new sb1((Object) nx0Var3, (Object) connectedbotstarref2, (byte) 1));
        nx0Var3.L(aob.h5);
        e S = LaunchActivity.S();
        if (!hl.O1() && S != null && !hl.s1(S)) {
            nx0Var3.X(S);
        }
        nx0Var3.show();
        return nx0Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0198 A[LOOP:0: B:20:0x0192->B:22:0x0198, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0(ArrayList arrayList, l9c l9cVar) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        tb tbVar = (tb) n0(getParentActivity());
        b8c b8cVar = new b8c(-2);
        b8cVar.c = tbVar;
        arrayList.add(b8cVar);
        arrayList.add(ac.i(R.drawable.menu_feature_reliable, ob6.M0(2131752488, null), ob6.M0(2131752489, null)));
        arrayList.add(ac.i(R.drawable.menu_feature_transparent, ob6.M0(2131752486, null), ob6.M0(2131752487, null)));
        arrayList.add(ac.i(R.drawable.menu_feature_simple, ob6.M0(2131752484, null), ob6.M0(2131752485, null)));
        arrayList.add(b8c.B(1, null));
        kt0 g = kt0.g(this.currentAccount);
        long j = this.S;
        ht0 d = g.d(j);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            bp1.o(2131752456, null, arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i);
                int i2 = jg1.b;
                b8c K = b8c.K(jg1.class);
                K.H = connectedbotstarref;
                K.s = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(b8c.p(29));
                arrayList.add(b8c.p(29));
                arrayList.add(b8c.p(29));
            }
            arrayList.add(b8c.B(2, null));
        }
        it0 e = kt0.g(this.currentAccount).e(j);
        ArrayList arrayList3 = e.e;
        if (!arrayList3.isEmpty() || e.c > 0) {
            String M0 = ob6.M0(2131752455, null);
            int i3 = e.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131752454, null)).append((CharSequence) " ");
            if (i3 == 1) {
                spannableString = new SpannableString(ob6.M0(2131752452, null).concat("v"));
            } else if (i3 == 2) {
                spannableString = new SpannableString(ob6.M0(2131752451, null).concat("v"));
            } else {
                if (i3 == 3) {
                    spannableString = new SpannableString(ob6.M0(2131752453, null).concat("v"));
                }
                int i4 = lg1.b;
                b8c K2 = b8c.K(lg1.class);
                K2.m = M0;
                K2.n = spannableStringBuilder;
                arrayList.add(K2);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    Object obj = arrayList3.get(i5);
                    int i6 = jg1.b;
                    b8c K3 = b8c.K(jg1.class);
                    K3.H = obj;
                    K3.s = true;
                    arrayList.add(K3);
                }
                if (e.d || e.h) {
                    arrayList.add(b8c.p(29));
                    arrayList.add(b8c.p(29));
                    arrayList.add(b8c.p(29));
                }
                arrayList.add(b8c.B(3, null));
            }
            wm2 wm2Var = new wm2(R.drawable.arrow_more, 0);
            wm2Var.f = true;
            wm2Var.I = 0.6f;
            wm2Var.J = 0.6f;
            spannableString.setSpan(wm2Var, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new hg1(this, i3, kt0.g(this.currentAccount).e(j)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i42 = lg1.b;
            b8c K22 = b8c.K(lg1.class);
            K22.m = M0;
            K22.n = spannableStringBuilder;
            arrayList.add(K22);
            while (i5 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.B(3, null));
        }
        arrayList.add(b8c.k(this.V));
    }

    public final /* synthetic */ void E0(Context context, int i) {
        wb wbVar = this.W;
        if (wbVar != null) {
            Object obj = wbVar.G(i).H;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.S, this.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.S, this.resourceProvider);
            }
        }
    }

    public final void F0(TLObject tLObject, id idVar) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            kt0 g = kt0.g(this.currentAccount);
            long j = this.S;
            ht0 d = g.d(j);
            ArrayList arrayList = d.e;
            int i = d.a;
            uc7.s1(i).j4(connectedstarrefbots.users, false);
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
            jn7.f(i).k(jn7.O3, Long.valueOf(d.b));
            d.a();
            it0 e = kt0.g(this.currentAccount).e(j);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            this.W.O(true);
        }
        idVar.dismiss();
    }

    public final void G0(TL_payments.connectedBotStarRef connectedbotstarref) {
        id idVar = new id(3, null, getParentActivity());
        idVar.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = uc7.s1(this.currentAccount).j1(this.S);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new ql(this, idVar, (byte) 10));
    }

    public final void H0(Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M0 = ob6.M0(2131748761, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0(null, null, 2131748760, lbc.r(user)));
        alertDialog$Builder.j(ob6.M0(2131748759, null), new h01((Object) this, (Object) connectedbotstarref, (byte) 9));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final boolean I0(Context context, View view, int i) {
        wb wbVar = this.W;
        if (wbVar != null) {
            Object obj = wbVar.G(i).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(connectedbotstarref.bot_id));
                fu5 I = fu5.I(this, view);
                I.k(R.drawable.msg_bot, ob6.M0(2131746435, null), new z21(this, X1, (byte) 20), X1.bot_has_main_app);
                I.k(R.drawable.msg_bot, ob6.M0(2131752893, null), new z21(this, connectedbotstarref, (byte) 21), !X1.bot_has_main_app);
                I.b(R.drawable.msg_link2, ob6.M0(2131751727, null), new tu0(this, connectedbotstarref, X1, (byte) 17), false);
                I.l(R.drawable.msg_leave, new o97(this, context, X1, connectedbotstarref, (byte) 23), ob6.M0(2131748759, null), !connectedbotstarref.revoked, true);
                I.W(5);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.H = false;
        this.F = hl.L(238.0f);
        byte b = 4;
        t62 t62Var = new t62(context, b);
        this.V = t62Var;
        yob.h(aob.i5, null, t62Var);
        super.createView(context);
        this.T = new FrameLayout(context);
        it4 it4Var = new it4(context, 1, 3);
        this.U = it4Var;
        it4Var.setImportantForAccessibility(4);
        ys4 ys4Var = this.U.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, tre.d(jn7.T2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        i0(ob6.M0(2131752447, null), hl.S2(ob6.M0(2131752448, null)), this.T, null);
        this.c.setOnItemClickListener(new l0(this, context, b));
        this.c.setOnItemLongClickListener(new h01((Object) this, (Object) context, (byte) 8));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.c.setItemAnimator(zb3Var);
        this.c.setOnScrollListener(new y(this, (byte) 14));
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wb wbVar;
        int i3 = jn7.O3;
        long j = this.S;
        if (i != i3) {
            if (i == jn7.N3 && ((Long) objArr[0]).longValue() == j && (wbVar = this.W) != null) {
                wbVar.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j) {
            wb wbVar2 = this.W;
            if (wbVar2 != null) {
                wbVar2.O(true);
            }
            kt0.g(this.currentAccount).d(j).a();
        }
    }

    @Override // m15
    public final j79 j0() {
        wb wbVar = new wb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new c(this, (byte) 23), getResourceProvider(), (byte) 1);
        this.W = wbVar;
        return wbVar;
    }

    @Override // m15
    public final eva l0() {
        vb vbVar = new vb(getParentActivity(), (byte) 1);
        vbVar.c();
        return vbVar;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.O3);
        jn7.f(this.currentAccount).b(this, jn7.N3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.O3);
        jn7.f(this.currentAccount).n(this, jn7.N3);
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        it4 it4Var = this.U;
        if (it4Var != null) {
            it4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        it4 it4Var = this.U;
        if (it4Var != null) {
            it4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
