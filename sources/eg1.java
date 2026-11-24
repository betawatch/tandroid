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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class eg1 extends iz4 implements gk7 {
    public final long S;
    public FrameLayout T;
    public er4 U;
    public d62 V;
    public vb W;

    public eg1(long j) {
        this.S = j;
        this.N = true;
        this.M = gl.L(60.0f);
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
    public static void I0(Context context, int i, final TL_payments.starRefProgram starrefprogram, long j, wjb wjbVar, boolean z) {
        long[] jArr;
        String str;
        ?? r15;
        String G;
        be0 be0Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final fx0 h = de9.h(1, wjbVar, context, false);
        long[] jArr2 = {j};
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(starrefprogram.bot_id));
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, nme.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        be0 be0Var2 = new be0(context);
        be0Var2.setRoundRadius(gl.L(30.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(V1);
        be0Var2.f(V1, pb0Var);
        ote.a(be0Var2);
        frameLayout2.addView(be0Var2, nme.e(60, 60, kk7.D1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = gl.L(10.0f);
            int i2 = bkb.g5;
            ShapeDrawable b0 = bkb.b0(L, bkb.v0(i2, wjbVar));
            vkb M = zkb.M(i2);
            frameLayout3.setBackground(b0);
            zkb.j(frameLayout3, b0, M, null, wjbVar);
            frameLayout3.setPadding(gl.L(1.33f), gl.L(1.33f), gl.L(1.33f), gl.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = gl.L(10.0f);
            int i3 = bkb.kk;
            ShapeDrawable b02 = bkb.b0(L2, bkb.v0(i3, wjbVar));
            vkb M2 = zkb.M(i3);
            textView2.setBackground(b02);
            zkb.j(textView2, b02, M2, null, wjbVar);
            textView2.setTypeface(gl.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(gl.L(5.33f), 0, gl.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb.append((Object) jva.H0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(jva.T0(sb.toString(), 0.75f, new cm2[1]));
            frameLayout3.addView(textView2, nme.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView k = tb4.k(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k.setScaleType(scaleType);
        k.setTranslationX(-gl.L(2.0825f));
        int i4 = bkb.D6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(k, i4, wjbVar, mode);
        frameLayout.addView(k, nme.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, nme.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        be0 be0Var3 = new be0(context);
        be0Var3.setRoundRadius(gl.L(30.0f));
        frameLayout4.addView(be0Var3, nme.e(60, 60, kk7.D1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = gl.L(10.0f);
        int i5 = bkb.g5;
        Drawable b03 = bkb.b0(L3, bkb.v0(i5, wjbVar));
        vkb M3 = zkb.M(i5);
        frameLayout5.setBackground(b03);
        zkb.j(frameLayout5, b03, M3, null, wjbVar);
        frameLayout5.setPadding(gl.L(1.33f), gl.L(1.33f), gl.L(1.33f), gl.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = gl.L(10.0f);
        int i6 = bkb.Ei;
        Drawable b04 = bkb.b0(L4, bkb.v0(i6, wjbVar));
        vkb M4 = zkb.M(i6);
        textView3.setBackground(b04);
        zkb.j(textView3, b04, M4, null, wjbVar);
        textView3.setTypeface(gl.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(gl.L(5.33f), 0, gl.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) bc.I0(starrefprogram.commission_permille)));
        cm2 cm2Var = new cm2(R.drawable.msg_link_1, 0);
        cm2Var.I = 0.65f;
        cm2Var.J = 0.65f;
        cm2Var.H = 0.7f;
        float L5 = gl.L(-2.0f);
        float L6 = gl.L(0.0f);
        cm2Var.r = L5;
        cm2Var.s = L6;
        spannableString.setSpan(cm2Var, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, nme.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        j2.addView(frameLayout, nme.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i7 = bkb.F6;
        zkb.X(textView4, i7, wjbVar);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(k96.M0(2131752482, null));
        textView4.setTypeface(gl.o());
        j2.addView(textView4, nme.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = gl.L(28.0f);
        int i8 = bkb.Z6;
        ShapeDrawable b05 = bkb.b0(L7, bkb.v0(i8, wjbVar));
        vkb M5 = zkb.M(i8);
        linearLayout2.setBackground(b05);
        zkb.j(linearLayout2, b05, M5, null, wjbVar);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        zkb.X(textView5, i7, wjbVar);
        textView5.setText(k96.a0(null, null, 2131752481, cf3.k(i, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, nme.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i9 = bkb.q5;
        zkb.s(imageView, i9, wjbVar, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, nme.t(-2, -2, 16, 5, 0, 8, 0));
        j2.addView(linearLayout2, nme.t(-2, 28, 1, 4, 0, 4, 0));
        ote.a(linearLayout2);
        TextView textView6 = new TextView(context);
        zkb.X(textView6, i7, wjbVar);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        kk7.i(textView6);
        SpannableString spannableString2 = new SpannableString(jva.H0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new z3c(gl.o()), 0, spannableString2.length(), 33);
        textView6.setText(jva.a1(false, k96.V(null, null, 2131752491, spannableString2), 0.725f, null));
        TextView m = ug8.m(j2, textView6, nme.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        zkb.X(m, i7, wjbVar);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        kk7.i(m);
        String q = l7c.q(V1);
        String I0 = bc.I0(starrefprogram.commission_permille);
        int i10 = starrefprogram.duration_months;
        if (i10 <= 0) {
            G = k96.M0(2131752489, null);
        } else {
            if (i10 < 12 || i10 % 12 != 0) {
                str = q;
                r15 = 0;
                G = k96.G(i10, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = I0;
                objArr[2] = G;
                m.setText(vu3.m(gl.T2(k96.a0(null, null, 2131752490, objArr)), m.getPaint().getFontMetricsInt(), r15, null, r15));
                j2.addView(m, nme.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j < 0) {
                    TextView textView7 = new TextView(context);
                    zkb.X(textView7, i7, wjbVar);
                    textView7.setTextSize(1, 14.0f);
                    de9.q(textView7, 17, null, 2131752474);
                    j2.addView(textView7, nme.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable b06 = bkb.b0(gl.L(28.0f), bkb.v0(i8, wjbVar));
                    vkb M6 = zkb.M(i8);
                    linearLayout3.setBackground(b06);
                    zkb.j(linearLayout3, b06, M6, null, wjbVar);
                    int L8 = gl.L(28.0f);
                    int v0 = bkb.v0(i8, wjbVar);
                    int v02 = bkb.v0(i8, wjbVar);
                    int i11 = bkb.h6;
                    int v = bkb.v(v02, bkb.v0(i11, wjbVar));
                    ff0 i0 = bkb.i0(L8, L8, L8, L8, v0, v, v);
                    vkb M7 = zkb.M(i8);
                    vkb p = zkb.p(i8, i11);
                    linearLayout3.setBackground(i0);
                    zkb.j(linearLayout3, i0, M7, p, wjbVar);
                    be0 be0Var4 = new be0(context);
                    be0Var4.setRoundRadius(gl.L(14.0f));
                    linearLayout3.addView(be0Var4, nme.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    zkb.X(textView8, i7, wjbVar);
                    linearLayout3.addView(textView8, nme.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    zkb.s(imageView2, i9, wjbVar, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, nme.t(-2, -2, 16, 2, 0, 5, 0));
                    j2.addView(linearLayout3, nme.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    be0Var = be0Var4;
                    textView = textView8;
                } else {
                    be0Var = null;
                    textView = null;
                    linearLayout = null;
                }
                u41 u41Var = new u41(wjbVar, context, true);
                u41Var.i(k96.M0(2131752496, null), false, true);
                j2.addView(u41Var, nme.o(-1, 48));
                l46 l46Var = new l46(context, wjbVar);
                l46Var.setText(gl.O2(k96.M0(2131752495, null), -1, 0, new vf1(context, (byte) 0), null));
                l46Var.setGravity(17);
                l46Var.setTextSize(1, 12.0f);
                zkb.X(l46Var, bkb.A6, wjbVar);
                zkb.G(l46Var, bkb.Wc, wjbVar);
                j2.addView(l46Var, nme.t(-1, -2, 49, 14, 14, 14, 6));
                h.O = j2;
                final byte b = 1;
                be0Var2.setOnClickListener(new View.OnClickListener() { // from class: of1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = b;
                        TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                        fx0 fx0Var = h;
                        switch (b2) {
                            case 0:
                                d S = LaunchActivity.S();
                                if (S != null) {
                                    fx0Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram2.bot_id);
                                    S.presentFragment(new zf1(bundle, fx0Var));
                                    break;
                                }
                                break;
                            default:
                                d S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    fx0Var.dismiss();
                                    S2.presentFragment(ProfileActivity.P2(starrefprogram2.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                u41Var.setOnClickListener(new wf1(u41Var, jArr, i, starrefprogram, h, j, z, context, wjbVar, V1));
                h.setOnDismissListener(new g5((byte) 6));
                i57 i57Var = new i57((Object) jArr, i, (Object) be0Var3, (Object) be0Var, (Object) textView, (byte) 7);
                i57Var.run();
                if (linearLayout != null) {
                    ct0.g(i).n();
                    ct0.g(i).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new xg(i, h, wjbVar, linearLayout4, jArr, i57Var));
                }
                final byte b2 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: of1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b22 = b2;
                        TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                        fx0 fx0Var = h;
                        switch (b22) {
                            case 0:
                                d S = LaunchActivity.S();
                                if (S != null) {
                                    fx0Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram2.bot_id);
                                    S.presentFragment(new zf1(bundle, fx0Var));
                                    break;
                                }
                                break;
                            default:
                                d S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    fx0Var.dismiss();
                                    S2.presentFragment(ProfileActivity.P2(starrefprogram2.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                h.M(i5);
                h.show();
            }
            G = k96.G(i10 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = q;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = I0;
        objArr2[2] = G;
        m.setText(vu3.m(gl.T2(k96.a0(null, null, 2131752490, objArr2)), m.getPaint().getFontMetricsInt(), r15, null, r15));
        j2.addView(m, nme.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j < 0) {
        }
        u41 u41Var2 = new u41(wjbVar, context, true);
        u41Var2.i(k96.M0(2131752496, null), false, true);
        j2.addView(u41Var2, nme.o(-1, 48));
        l46 l46Var2 = new l46(context, wjbVar);
        l46Var2.setText(gl.O2(k96.M0(2131752495, null), -1, 0, new vf1(context, (byte) 0), null));
        l46Var2.setGravity(17);
        l46Var2.setTextSize(1, 12.0f);
        zkb.X(l46Var2, bkb.A6, wjbVar);
        zkb.G(l46Var2, bkb.Wc, wjbVar);
        j2.addView(l46Var2, nme.t(-1, -2, 49, 14, 14, 14, 6));
        h.O = j2;
        final byte b3 = 1;
        be0Var2.setOnClickListener(new View.OnClickListener() { // from class: of1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b3;
                TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                fx0 fx0Var = h;
                switch (b22) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            fx0Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram2.bot_id);
                            S.presentFragment(new zf1(bundle, fx0Var));
                            break;
                        }
                        break;
                    default:
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            fx0Var.dismiss();
                            S2.presentFragment(ProfileActivity.P2(starrefprogram2.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        u41Var2.setOnClickListener(new wf1(u41Var2, jArr, i, starrefprogram, h, j, z, context, wjbVar, V1));
        h.setOnDismissListener(new g5((byte) 6));
        i57 i57Var2 = new i57((Object) jArr, i, (Object) be0Var3, (Object) be0Var, (Object) textView, (byte) 7);
        i57Var2.run();
        if (linearLayout != null) {
        }
        final byte b22 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: of1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b222 = b22;
                TL_payments.starRefProgram starrefprogram2 = starrefprogram;
                fx0 fx0Var = h;
                switch (b222) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            fx0Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram2.bot_id);
                            S.presentFragment(new zf1(bundle, fx0Var));
                            break;
                        }
                        break;
                    default:
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            fx0Var.dismiss();
                            S2.presentFragment(ProfileActivity.P2(starrefprogram2.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        h.M(i5);
        h.show();
    }

    public static fx0 J0(Context context, int i, TL_payments.connectedBotStarRef connectedbotstarref, long j, wjb wjbVar) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        fx0 fx0Var;
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
        fx0 h = de9.h(1, wjbVar, context, false);
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable K = bkb.K(gl.L(40.0f), bkb.v0(connectedbotstarref.revoked ? bkb.mk : bkb.Ei, wjbVar));
        vkb M = zkb.M(connectedbotstarref.revoked ? bkb.mk : bkb.Ei);
        view.setBackground(K);
        zkb.j(view, K, M, null, wjbVar);
        frameLayout.addView(view, nme.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, nme.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L = gl.L(50.0f);
            int i5 = bkb.g5;
            Drawable b0 = bkb.b0(L, bkb.v0(i5, wjbVar));
            vkb M2 = zkb.M(i5);
            frameLayout2.setBackground(b0);
            zkb.j(frameLayout2, b0, M2, null, wjbVar);
            frameLayout.addView(frameLayout2, nme.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(gl.o());
            textView.setTextSize(1, 12.0f);
            Drawable b02 = bkb.b0(gl.L(9.5f), bkb.v0(connectedbotstarref.revoked ? bkb.mk : bkb.kk, wjbVar));
            vkb M3 = zkb.M(connectedbotstarref.revoked ? bkb.mk : bkb.kk);
            textView.setBackground(b02);
            zkb.j(textView, b02, M3, null, wjbVar);
            textView.setTextColor(-1);
            textView.setPadding(gl.L(6.66f), 0, gl.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            cm2 cm2Var = new cm2(R.drawable.mini_reply_user, 0);
            cm2Var.I = 0.937f;
            cm2Var.J = 0.937f;
            float f = -gl.L(1.33f);
            float L2 = gl.L(1.0f);
            cm2Var.r = f;
            cm2Var.s = L2;
            cm2Var.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, nme.d(-1, 19.0f, kk7.D1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        j2.addView(frameLayout, nme.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i6 = bkb.F6;
        zkb.X(textView2, i6, wjbVar);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(k96.M0(2131752470, null));
        textView2.setTypeface(gl.o());
        j2.addView(textView2, nme.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L3 = gl.L(28.0f);
        int i7 = bkb.Z6;
        ShapeDrawable b03 = bkb.b0(L3, bkb.v0(i7, wjbVar));
        vkb M4 = zkb.M(i7);
        linearLayout3.setBackground(b03);
        zkb.j(linearLayout3, b03, M4, null, wjbVar);
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(14.0f));
        pb0 pb0Var = new pb0((wjb) null);
        linearLayout3.addView(be0Var, nme.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        zkb.X(textView3, i6, wjbVar);
        textView3.setText(cf3.k(i, connectedbotstarref.bot_id));
        pb0Var.q(V1);
        be0Var.f(V1, pb0Var);
        linearLayout3.addView(textView3, nme.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i8 = bkb.q5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView2, i8, wjbVar, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, nme.t(-2, -2, 16, 5, 0, 8, 0));
        j2.addView(linearLayout3, nme.t(-2, 28, 1, 4, 0, 4, 0));
        ote.a(linearLayout3);
        TextView textView4 = new TextView(context);
        zkb.X(textView4, i6, wjbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(gl.T2(k96.M0(2131752472, null)));
            fx0Var = h;
            i2 = i8;
            linearLayout = linearLayout3;
        } else {
            int i9 = connectedbotstarref.commission_permille;
            linearLayout = linearLayout3;
            if (j < 0) {
                String I0 = bc.I0(i9);
                String q = l7c.q(V1);
                int i10 = connectedbotstarref.duration_months;
                fx0Var = h;
                i2 = i8;
                if (i10 <= 0) {
                    G2 = k96.M0(2131752489, null);
                    c2 = 0;
                } else if (i10 < 12 || i10 % 12 != 0) {
                    c2 = 0;
                    G2 = k96.G(i10, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c2 = 0;
                    G2 = k96.G(i10 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c2] = I0;
                objArr[1] = q;
                objArr[2] = G2;
                de9.r(null, null, 2131752473, objArr, textView4);
            } else {
                fx0Var = h;
                i2 = i8;
                String I02 = bc.I0(i9);
                String q2 = l7c.q(V1);
                int i11 = connectedbotstarref.duration_months;
                if (i11 <= 0) {
                    G = k96.M0(2131752489, null);
                    i3 = 3;
                    c = 0;
                } else {
                    if (i11 < 12 || i11 % 12 != 0) {
                        c = 0;
                        G = k96.G(i11, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                    } else {
                        c = 0;
                        G = k96.G(i11 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                    }
                    i3 = 3;
                }
                Object[] objArr2 = new Object[i3];
                objArr2[c] = I02;
                objArr2[1] = q2;
                objArr2[2] = G;
                de9.r(null, null, 2131752471, objArr2, textView4);
            }
        }
        j2.addView(textView4, nme.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i4 = i7;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            zkb.X(textView5, i6, wjbVar);
            textView5.setTextSize(1, 14.0f);
            de9.q(textView5, 17, null, 2131752474);
            j2.addView(textView5, nme.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable b04 = bkb.b0(gl.L(28.0f), bkb.v0(i7, wjbVar));
            vkb M5 = zkb.M(i7);
            linearLayout4.setBackground(b04);
            zkb.j(linearLayout4, b04, M5, null, wjbVar);
            be0 be0Var2 = new be0(context);
            be0Var2.setRoundRadius(gl.L(14.0f));
            pb0 pb0Var2 = new pb0((wjb) null);
            linearLayout4.addView(be0Var2, nme.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            zkb.X(textView6, i6, wjbVar);
            if (j >= 0) {
                TLRPC.User V12 = na7.q1(i).V1(Long.valueOf(j));
                pb0Var2.q(V12);
                be0Var2.f(V12, pb0Var2);
                textView6.setText(l7c.q(V12));
                i4 = i7;
            } else {
                i4 = i7;
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                pb0Var2.p(K0);
                be0Var2.f(K0, pb0Var2);
                textView6.setText(K0 == null ? "" : K0.title);
            }
            linearLayout4.addView(textView6, nme.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            zkb.s(imageView3, i2, wjbVar, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, nme.t(-2, -2, 16, 2, 0, 5, 0));
            j2.addView(linearLayout4, nme.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        zkb.X(textView7, i6, wjbVar);
        int L4 = gl.L(8.0f);
        int i12 = i4;
        int v0 = bkb.v0(i12, wjbVar);
        int v02 = bkb.v0(i12, wjbVar);
        int i13 = bkb.h6;
        int v = bkb.v(v02, bkb.v0(i13, wjbVar));
        ff0 i0 = bkb.i0(L4, L4, L4, L4, v0, v, v);
        vkb M6 = zkb.M(i12);
        vkb p = zkb.p(i12, i13);
        textView7.setBackground(i0);
        zkb.j(textView7, i0, M6, p, wjbVar);
        textView7.setPadding(gl.L(16.0f), gl.L(14.66f), gl.L(16.0f), gl.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        j2.addView(textView7, nme.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        u41 u41Var = new u41(wjbVar, context, true);
        if (connectedbotstarref.revoked) {
            u41Var.i(k96.M0(2131752475, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new cm2(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) k96.M0(2131752480, null));
            u41Var.i(spannableStringBuilder2, false, true);
        }
        j2.addView(u41Var, nme.o(-1, 48));
        l46 l46Var = new l46(context, wjbVar);
        long j3 = connectedbotstarref.participants;
        l46Var.setText(j3 <= 0 ? k96.a0(null, null, 2131752478, l7c.q(V1)) : k96.G((int) j3, "ChannelAffiliateProgramLinkOpened", l7c.q(V1)));
        l46Var.setGravity(17);
        l46Var.setTextSize(1, 12.0f);
        zkb.X(l46Var, bkb.A6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        j2.addView(l46Var, nme.t(-1, -2, 49, 14, 12, 14, 2));
        fx0 fx0Var2 = fx0Var;
        fx0Var2.O = j2;
        s67 s67Var = new s67(connectedbotstarref, fx0Var2, wjbVar, V1, (byte) 23);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new x91(s67Var, (byte) 4));
        }
        uf1 uf1Var = new uf1(connectedbotstarref, i, fx0Var2, context, j, wjbVar, s67Var);
        fx0 fx0Var3 = fx0Var2;
        u41Var.setOnClickListener(uf1Var);
        fx0Var3.setOnDismissListener(new g5((byte) 6));
        if (linearLayout2 != null) {
            ct0.g(i).n();
            ct0.g(i).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener uf1Var2 = new uf1(i, fx0Var3, wjbVar, linearLayout5, j, context, connectedbotstarref);
            fx0Var3 = fx0Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(uf1Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new kb1((Object) fx0Var3, (Object) connectedbotstarref2, (byte) 1));
        fx0Var3.M(bkb.g5);
        d S = LaunchActivity.S();
        if (!gl.O1() && S != null && !gl.s1(S)) {
            fx0Var3.X(S);
        }
        fx0Var3.show();
        return fx0Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0198 A[LOOP:0: B:20:0x0192->B:22:0x0198, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(ArrayList arrayList, l5c l5cVar) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        sb sbVar = (sb) n0(getParentActivity());
        c4c c4cVar = new c4c(-2);
        c4cVar.c = sbVar;
        arrayList.add(c4cVar);
        arrayList.add(zb.i(R.drawable.menu_feature_reliable, k96.M0(2131752501, null), k96.M0(2131752502, null)));
        arrayList.add(zb.i(R.drawable.menu_feature_transparent, k96.M0(2131752499, null), k96.M0(2131752500, null)));
        arrayList.add(zb.i(R.drawable.menu_feature_simple, k96.M0(2131752497, null), k96.M0(2131752498, null)));
        arrayList.add(c4c.B(1, null));
        ct0 g = ct0.g(this.currentAccount);
        long j = this.S;
        zs0 d = g.d(j);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            oo1.o(2131752469, null, arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i);
                int i2 = ag1.b;
                c4c K = c4c.K(ag1.class);
                K.H = connectedbotstarref;
                K.s = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(c4c.p(29));
                arrayList.add(c4c.p(29));
                arrayList.add(c4c.p(29));
            }
            arrayList.add(c4c.B(2, null));
        }
        at0 e = ct0.g(this.currentAccount).e(j);
        ArrayList arrayList3 = e.e;
        if (!arrayList3.isEmpty() || e.c > 0) {
            String M0 = k96.M0(2131752468, null);
            int i3 = e.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) k96.M0(2131752467, null)).append((CharSequence) " ");
            if (i3 == 1) {
                spannableString = new SpannableString(k96.M0(2131752465, null).concat("v"));
            } else if (i3 == 2) {
                spannableString = new SpannableString(k96.M0(2131752464, null).concat("v"));
            } else {
                if (i3 == 3) {
                    spannableString = new SpannableString(k96.M0(2131752466, null).concat("v"));
                }
                int i4 = cg1.b;
                c4c K2 = c4c.K(cg1.class);
                K2.m = M0;
                K2.n = spannableStringBuilder;
                arrayList.add(K2);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    Object obj = arrayList3.get(i5);
                    int i6 = ag1.b;
                    c4c K3 = c4c.K(ag1.class);
                    K3.H = obj;
                    K3.s = true;
                    arrayList.add(K3);
                }
                if (e.d || e.h) {
                    arrayList.add(c4c.p(29));
                    arrayList.add(c4c.p(29));
                    arrayList.add(c4c.p(29));
                }
                arrayList.add(c4c.B(3, null));
            }
            cm2 cm2Var = new cm2(R.drawable.arrow_more, 0);
            cm2Var.f = true;
            cm2Var.I = 0.6f;
            cm2Var.J = 0.6f;
            spannableString.setSpan(cm2Var, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new yf1(this, i3, ct0.g(this.currentAccount).e(j)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i42 = cg1.b;
            c4c K22 = c4c.K(cg1.class);
            K22.m = M0;
            K22.n = spannableStringBuilder;
            arrayList.add(K22);
            while (i5 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(c4c.p(29));
            arrayList.add(c4c.p(29));
            arrayList.add(c4c.p(29));
            arrayList.add(c4c.B(3, null));
        }
        arrayList.add(c4c.k(this.V));
    }

    public final /* synthetic */ void D0(Context context, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.starRefProgram) {
                I0(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.S, this.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                J0(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.S, this.resourceProvider);
            }
        }
    }

    public final void E0(TLObject tLObject, hd hdVar) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ct0 g = ct0.g(this.currentAccount);
            long j = this.S;
            zs0 d = g.d(j);
            ArrayList arrayList = d.e;
            int i = d.a;
            na7.q1(i).a4(connectedstarrefbots.users, false);
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
            kk7.f(i).k(kk7.N3, Long.valueOf(d.b));
            d.a();
            at0 e = ct0.g(this.currentAccount).e(j);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            this.W.O(true);
        }
        hdVar.dismiss();
    }

    public final void F0(TL_payments.connectedBotStarRef connectedbotstarref) {
        hd hdVar = new hd(3, null, getParentActivity());
        hdVar.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = na7.q1(this.currentAccount).h1(this.S);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new pl(this, hdVar, (byte) 10));
    }

    public final void G0(Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M0 = k96.M0(2131748815, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.T2(k96.a0(null, null, 2131748814, l7c.q(user)));
        alertDialog$Builder.j(k96.M0(2131748813, null), new q31((Object) this, (Object) connectedbotstarref, (byte) 7));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final boolean H0(Context context, View view, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(connectedbotstarref.bot_id));
                cs5 I = cs5.I(this, view);
                I.k(R.drawable.msg_bot, k96.M0(2131746515, null), new q21(this, V1, (byte) 20), V1.bot_has_main_app);
                I.k(R.drawable.msg_bot, k96.M0(2131752900, null), new q21(this, connectedbotstarref, (byte) 21), !V1.bot_has_main_app);
                I.b(R.drawable.msg_link2, k96.M0(2131751750, null), new fv0((Object) this, (Object) connectedbotstarref, (Object) V1, (byte) 16), false);
                I.l(R.drawable.msg_leave, new s67(this, context, V1, connectedbotstarref, (byte) 24), k96.M0(2131748813, null), !connectedbotstarref.revoked, true);
                I.W(5);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.H = false;
        this.F = gl.L(238.0f);
        byte b = 4;
        d62 d62Var = new d62(context, b);
        this.V = d62Var;
        zkb.h(bkb.h5, null, d62Var);
        super.createView(context);
        this.T = new FrameLayout(context);
        er4 er4Var = new er4(context, 1, 3);
        this.U = er4Var;
        er4Var.setImportantForAccessibility(4);
        uq4 uq4Var = this.U.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, nme.d(kk7.T2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        i0(k96.M0(2131752460, null), gl.T2(k96.M0(2131752461, null)), this.T, null);
        this.c.setOnItemClickListener(new k0(this, context, b));
        this.c.setOnItemLongClickListener(new q31((Object) this, (Object) context, (byte) 8));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.c.setItemAnimator(gb3Var);
        this.c.setOnScrollListener(new y(this, (byte) 14));
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vb vbVar;
        int i3 = kk7.N3;
        long j = this.S;
        if (i != i3) {
            if (i == kk7.M3 && ((Long) objArr[0]).longValue() == j && (vbVar = this.W) != null) {
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
            ct0.g(this.currentAccount).d(j).a();
        }
    }

    @Override // iz4
    public final w39 j0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new f(this, (byte) 23), getResourceProvider(), (byte) 1);
        this.W = vbVar;
        return vbVar;
    }

    @Override // iz4
    public final cra l0() {
        ub ubVar = new ub(getParentActivity(), (byte) 1);
        ubVar.c();
        return ubVar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.N3);
        kk7.f(this.currentAccount).b(this, kk7.M3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.N3);
        kk7.f(this.currentAccount).n(this, kk7.M3);
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        er4 er4Var = this.U;
        if (er4Var != null) {
            er4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        er4 er4Var = this.U;
        if (er4Var != null) {
            er4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
