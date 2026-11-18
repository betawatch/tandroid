package ai;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j3;
import bi.p8;
import bi.u4;
import bi.y8;
import bi.z8;
import c8.ma;
import di.b5;
import di.f5;
import di.f6;
import di.h5;
import di.m8;
import di.o8;
import di.yb;
import di.z4;
import di.z5;
import fi.f9;
import fi.z3;
import hi.a6;
import hi.d7;
import hi.db;
import hi.l5;
import hi.l8;
import hi.o9;
import hi.q8;
import hi.qb;
import hi.r8;
import hi.rb;
import hi.sa;
import hi.t8;
import hi.ta;
import hi.v9;
import hi.x4;
import hi.xa;
import hi.ya;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Serializable, java.lang.Object, java.lang.Runnable[]] */
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean booleanValue;
        boolean z10;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                final x1 x1Var = (x1) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                c2 c2Var = x1Var.b;
                if (!c2Var.j && !c2Var.i) {
                    int i16 = c2Var.I;
                    int[] iArr = c2.j0;
                    final boolean z11 = i16 >= 0 && i16 < 4 && num.intValue() >= iArr[c2Var.I];
                    final boolean z12 = num.intValue() >= iArr[0] && num.intValue() - c2Var.N < 100 && num.intValue() - c2Var.O >= 100;
                    c2Var.N = num.intValue();
                    if (!z11 && !z12) {
                        c2Var.E = false;
                        break;
                    } else {
                        DictationLid.j(bArr, 0, new c1() { // from class: ai.w1
                            @Override // ai.c1
                            public final void a(float[] fArr, long j3, int i17) {
                                c2 c2Var2 = x1.this.b;
                                c2Var2.E = false;
                                if (fArr == null) {
                                    return;
                                }
                                c2Var2.O = i17;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 4) {
                                        i18 = 4;
                                        break;
                                    } else if (c2.j0[i18] > i17) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                c2Var2.I = i18;
                                p5.c.t(new StringBuilder("tinyasr: tinylid "), (!z12 || z11) ? "at a step" : "after a pause", "Dictation");
                                if (c2Var2.j || c2Var2.i) {
                                    return;
                                }
                                d1 n10 = DictationLid.n(DictationLid.i(i17), fArr);
                                Log.d("Dictation", "tinyasr: tinylid " + i17 + " ms speech in " + j3 + " ms: " + n10 + " (route " + c2Var2.y + ")");
                                if (n10 != null) {
                                    String str = n10.a;
                                    if (!n10.c && "other".equals(str) && n10.b >= DictationLid.i(i17)) {
                                        c2Var2.h(str);
                                        return;
                                    }
                                }
                                if (n10 != null) {
                                    String str2 = n10.a;
                                    if (n10.c) {
                                        android.support.v4.media.session.a0 R = DictationAsr.R(str2, c2Var2.y, false);
                                        if (R == null) {
                                            c2Var2.h(str2);
                                            return;
                                        }
                                        t tVar = (t) R.b;
                                        android.support.v4.media.session.a0 a0Var = c2Var2.y;
                                        if (tVar == ((t) a0Var.b) && ((String) R.c).equals((String) a0Var.c)) {
                                            c2Var2.F = true;
                                            DictationLid.l(str2);
                                            c2Var2.r(str2);
                                        } else if (!c2Var2.F || n10.b >= 0.8f) {
                                            c2Var2.F = true;
                                            DictationLid.l(str2);
                                            c2Var2.r(str2);
                                            Log.d("Dictation", "tinyasr: switching to " + R);
                                            c2Var2.o(R);
                                        }
                                    }
                                }
                            }
                        });
                        break;
                    }
                } else {
                    c2Var.E = false;
                    break;
                }
                break;
            case 1:
                j3 j3Var = (j3) obj3;
                x10 x10Var = (x10) obj2;
                Boolean bool = (Boolean) obj;
                j3Var.getClass();
                if (x10Var != null) {
                    x10Var.a(bool);
                }
                if (bool.booleanValue()) {
                    j3Var.O0 = true;
                }
                j3Var.dismiss();
                break;
            case 2:
                bi.k2 k2Var = (bi.k2) obj2;
                if (((Object[]) obj)[1] == ((o8) obj3)) {
                    k2Var.run();
                    break;
                }
                break;
            case 3:
                u4.s((TL_stars.TL_starGiftUnique) obj3, gd.a0(null, null, ((Boolean) obj).booleanValue() ? 2131749510 : 2131749620, (String) obj2));
                break;
            case 4:
                eq0 eq0Var = (eq0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str = (String) obj;
                m8 m8Var = eq0Var.e;
                int i17 = tL_starGiftCollection.collection_id;
                m8Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i18 = m8Var.a;
                updatestargiftcollection.peer = mp.u1(i18).l1(m8Var.b);
                updatestargiftcollection.collection_id = i17;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str;
                ConnectionsManager.getInstance(i18).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str;
                eq0Var.f(true);
                break;
            case 5:
                z8 z8Var = (z8) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j3 = z8Var.V1;
                Runnable runnable = z8Var.c2;
                if (runnable != null) {
                    runnable.run();
                }
                z8Var.dismiss();
                ks.f(j10.t0).k(ks.U2, new Object[0]);
                org.telegram.messenger.g0.h3(new p8(0, user), 250L);
                mp.u1(z8Var.U1).h7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                break;
            case 6:
                ci.z0 z0Var = (ci.z0) obj3;
                ci.w0 w0Var = (ci.w0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!w0Var.G && w0Var.e == null) {
                    z0Var.E0(w0Var, bitmap);
                    break;
                }
                break;
            case 7:
                f6.i1((f6) obj3, (org.telegram.ui.ActionBar.u1) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 8:
                bi.g1 g1Var = (bi.g1) obj2;
                Boolean bool2 = (Boolean) obj;
                ((f6) obj3).g2.setLoading(bool2.booleanValue());
                if (g1Var != null && g1Var.G1 != (booleanValue = bool2.booleanValue())) {
                    g1Var.G1 = booleanValue;
                    g1Var.C1.g(booleanValue);
                    break;
                }
                break;
            case 9:
                f6 f6Var = (f6) obj3;
                String str2 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                z5 z5Var = f6Var.b2;
                ki.j[] jVarArr = f6Var.p2;
                hi.d dVar = f6Var.g2;
                if (stargiftupgradepreview != null) {
                    z5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    f6Var.H2(1, false, null);
                    z5Var.i(1, gd.M0(2131750120, null), gd.a0(null, null, 2131750121, str2), null);
                    jVarArr[0].setText(gd.M0(2131749850, null));
                    jVarArr[1].setText(gd.M0(2131749847, null));
                    jVarArr[2].setText(gd.M0(2131749844, null));
                    f6Var.r2.setVisibility(8);
                    f6Var.q2.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.i(gd.M0(2131747638, null), false, true);
                    dVar.g(null, false);
                    dVar.setOnClickListener(new di.i1(f6Var, 17));
                    f6Var.show();
                    break;
                }
                break;
            case 10:
                f6 f6Var2 = (f6) obj3;
                bi.a2[] a2VarArr = (bi.a2[]) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() == -97) {
                    bi.a2 a2Var = a2VarArr[0];
                    TL_stars.TL_starGiftUnique M1 = f6Var2.M1();
                    if (f6Var2.M2() != null && M1 != null && !TextUtils.isEmpty(M1.slug)) {
                        long e10 = j10.i(f6Var2.a).e();
                        TextView textView = new TextView(f6Var2.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i19 = n6.r5;
                        u6.U(textView, i19, f6Var2.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new p80(org.telegram.messenger.g0.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        long[] jArr = new long[1];
                        ?? r82 = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = mp.u1(f6Var2.a).l1(e10);
                        depositstargift.slug = M1.slug;
                        ConnectionsManager.getInstance(f6Var2.a).sendRequestTyped(depositstargift, new d3.b(i14), new di.s1(f6Var2, zArr, textView, stargiftdepositpayloadArr, r82, jArr, 0));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var2.getContext(), f6Var2.J0);
                        String M0 = gd.M0(2131750091, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = M0;
                        u1Var.U = gd.M0(2131750089, null);
                        TLRPC.User f10 = j10.i(f6Var2.a).f();
                        LinearLayout linearLayout = new LinearLayout(f6Var2.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(f6Var2.getContext());
                        int L = org.telegram.messenger.g0.L(20.0f);
                        int i20 = n6.j5;
                        ShapeDrawable d02 = n6.d0(L, n6.r1(0.045f, n6.w0(i20, f6Var2.J0)));
                        q6 K = u6.K(0.045f, i20);
                        i6 i6Var = f6Var2.J0;
                        frameLayout.setBackground(d02);
                        u6.j(frameLayout, d02, K, null, i6Var);
                        q9 q9Var = new q9(f6Var2.getContext());
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                        b9 b9Var = new b9((i6) null);
                        b9Var.r(f10);
                        q9Var.f(f10, b9Var);
                        frameLayout.addView(q9Var, ma.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(f6Var2.getContext());
                        i5.c.x(textView2, 1, 16.0f);
                        u6.U(textView2, i20, f6Var2.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(j6.m(o10.q(f10), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, ma.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(f6Var2.getContext());
                        textView3.setTextSize(1, 14.0f);
                        u6.U(textView3, i19, f6Var2.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f10 != null && !TextUtils.isEmpty(f10.phone)) {
                            textView3.setText(pf.b.c().b("+" + f10.phone));
                        } else if (f10 != null && o10.o(f10) != null) {
                            textView3.setText("@" + o10.o(f10));
                        }
                        frameLayout.addView(textView3, ma.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, ma.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(f6Var2.getContext());
                        textView4.setTextSize(1, 15.0f);
                        u6.U(textView4, i20, f6Var2.J0);
                        f3.k(textView4, 17, null, 2131750092);
                        linearLayout.addView(textView4, ma.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(f6Var2.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        f6Var2.n1(linearLayout2, R.drawable.msg_openprofile, 14, i19, gd.M0(2131748110, null), true);
                        f6Var2.n1(linearLayout2, R.drawable.menu_gift, 14, i19, gd.M0(2131746481, null), false);
                        linearLayout.addView(linearLayout2, ma.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, ma.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.o(linearLayout);
                        u1Var.H = 20;
                        alertDialog$Builder.k(gd.M0(2131750093, null), new di.t1(f6Var2, e10, stargiftdepositpayloadArr, jArr, a2Var));
                        alertDialog$Builder.h(gd.M0(2131752578, null), null);
                        u1Var.setOnDismissListener(new di.u1(0, zArr, (Object) r82));
                        u1Var.show();
                        break;
                    }
                } else if (l10.longValue() != -99 && l10.longValue() != -98) {
                    long longValue = l10.longValue();
                    bi.a2 a2Var2 = a2VarArr[0];
                    TL_stars.TL_starGiftUnique M12 = f6Var2.M1();
                    if (f6Var2.M2() != null && M12 != null && !TextUtils.isEmpty(M12.slug)) {
                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, f6Var2.getContext(), f6Var2.J0);
                        u1Var2.r(300L);
                        TL_stars.depositStarGift depositstargift2 = new TL_stars.depositStarGift();
                        depositstargift2.peer = mp.u1(f6Var2.a).l1(longValue);
                        depositstargift2.slug = M12.slug;
                        ConnectionsManager.getInstance(f6Var2.a).sendRequestTyped(depositstargift2, new d3.b(1), new e(f6Var2, u1Var2, a2Var2, longValue));
                        break;
                    }
                }
                break;
            case 11:
                b5 b5Var = (b5) obj3;
                b5Var.getClass();
                ((z4) obj2).a((TL_stars.StarGift) obj, true);
                b5Var.d(true);
                break;
            case 12:
                h5 h5Var = (h5) obj3;
                cg.b bVar = (cg.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                vf.b bVar2 = h5Var.n;
                if (bVar2 != null && bVar == h5Var.s) {
                    bVar2.c(false);
                }
                h5Var.r.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    h5Var.q.put(bVar, new f5(bVar, tL_payments_paymentFormStarGift));
                    h5Var.a(true);
                    break;
                }
                break;
            case 13:
                ((q10) obj3).a((cg.a) obj, new ca.r((di.u0[]) obj2, 27));
                break;
            case 14:
                z3 z3Var = (z3) obj3;
                g3 g3Var = (g3) obj;
                z3Var.u3 = g3Var;
                ug.l0.x1(new y8(z3Var, i13), (TL_stories.TL_premium_boostsStatus) obj2, g3Var, z3Var.l1, true);
                f9 f9Var = z3Var.t0;
                if (f9Var != null) {
                    f9Var.k1 = false;
                    f9Var.V();
                    break;
                }
                break;
            case 15:
                yb ybVar = (yb) obj3;
                qb qbVar = (qb) obj;
                ybVar.getClass();
                hi.g2 g2Var = ((hi.g2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(qbVar == null ? "🌤" : qbVar.c);
                sb2.append(" ");
                sb2.append(qbVar == null ? rb.a() ? "24°C" : "72°F" : qbVar.a());
                CharSequence m10 = j6.m(sb2.toString(), ((TextPaint) ybVar.c).getFontMetricsInt(), false, null, 0);
                yb ybVar2 = g2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m10, (TextPaint) ybVar2.c, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), (TextPaint) ybVar2.c, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                g2Var.k = staticLayout;
                g2Var.l = staticLayout.getLineCount() > 0 ? g2Var.k.getLineWidth(0) : 0.0f;
                g2Var.m = g2Var.k.getLineCount() > 0 ? g2Var.k.getLineLeft(0) : 0.0f;
                g2Var.b = org.telegram.messenger.g0.N(17.6f) + g2Var.l;
                g2Var.c = org.telegram.messenger.g0.N(36.0f);
                ybVar.invalidate();
                ybVar.requestLayout();
                break;
            case 16:
                v9 v9Var = (v9) obj3;
                sa saVar = (sa) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - saVar.getBottomPadding2(), v9Var.d2 - saVar.getPaddingUnderContainer()));
                v9Var.R();
                if (max > 0) {
                    tg.j jVar = v9Var.t0;
                    if ((jVar instanceof tg.m2) && ((tg.m2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = v9Var.x1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        v9Var.x1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        tg.m1 m1Var = v9Var.N0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(m1Var, (Property<tg.m1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(v9Var.D0, (Property<hi.h5, Float>) property, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                        x4 x4Var = v9Var.G0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(x4Var, (Property<x4, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(v9Var.l0, (Property<tg.z0, Float>) property2, (z10 || v9Var.l1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(v9Var.k0, (Property<tg.v0, Float>) property2, (z10 || v9Var.l1) ? 1.0f : 0.0f));
                        v9Var.Q0();
                        v9Var.x1.playTogether(arrayList);
                        if (z10) {
                            v9Var.x1.setDuration(350L);
                            v9Var.x1.setInterpolator(lr.h);
                        } else {
                            v9Var.x1.setDuration(250L);
                            v9Var.x1.setInterpolator(org.telegram.ui.ActionBar.j1.w);
                        }
                        v9Var.x1.start();
                        for (i7 = 0; i7 < arrayList.size(); i7++) {
                            ((Animator) arrayList.get(i7)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i7)).setInterpolator(z10 ? lr.h : org.telegram.ui.ActionBar.j1.w);
                            ((Animator) arrayList.get(i7)).start();
                        }
                        if (!z10) {
                            v9Var.M0(false);
                        }
                        if (v9Var.R1 != z10) {
                            v9Var.d0();
                        }
                        v9Var.R1 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = v9Var.x1;
                if (animatorSet != null) {
                }
                v9Var.x1 = new AnimatorSet();
                arrayList = new ArrayList();
                tg.m1 m1Var2 = v9Var.N0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(m1Var2, (Property<tg.m1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v9Var.D0, (Property<hi.h5, Float>) property3, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                x4 x4Var2 = v9Var.G0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(x4Var2, (Property<x4, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(v9Var.l0, (Property<tg.z0, Float>) property22, (z10 || v9Var.l1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v9Var.k0, (Property<tg.v0, Float>) property22, (z10 || v9Var.l1) ? 1.0f : 0.0f));
                v9Var.Q0();
                v9Var.x1.playTogether(arrayList);
                if (z10) {
                }
                v9Var.x1.start();
                while (i7 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (v9Var.R1 != z10) {
                }
                v9Var.R1 = z10;
                break;
            case 17:
                l5 l5Var = (l5) obj3;
                hi.z4 z4Var = (hi.z4) obj2;
                qb qbVar2 = (qb) obj;
                if (qbVar2 != null) {
                    z4Var.dismiss();
                    l5Var.w0(false);
                    l5Var.b0(l5Var.m0(qbVar2));
                    break;
                }
                break;
            case 18:
                l5 l5Var2 = (l5) obj3;
                tg.k0 k0Var = (tg.k0) obj2;
                tg.h0 h0Var = (tg.h0) obj;
                if (k0Var != null) {
                    int i21 = l5Var2.p1;
                    k0Var.v0 = h0Var;
                    k0Var.r0.b(i21, h0Var, false);
                    k0Var.m();
                    l5Var2.b0(k0Var);
                    break;
                } else {
                    l5Var2.b0(l5Var2.f0(h0Var));
                    break;
                }
            case 19:
                l8 l8Var = (l8) obj3;
                ((y60) obj2).v();
                l8Var.h(true);
                q8 q8Var = l8Var.a0;
                t8 t8Var = q8Var.S1;
                if (t8Var != null) {
                    t8Var.a(new HashSet(q8Var.v1));
                    break;
                }
                break;
            case 20:
                l8 l8Var2 = (l8) obj3;
                l8Var2.a0.B1 = true;
                ((hr[]) obj2)[0].dismiss();
                l8Var2.h(true);
                break;
            case 21:
                hi.q9 q9Var2 = (hi.q9) obj3;
                x10 x10Var2 = (x10) obj2;
                Integer num2 = (Integer) obj;
                ta taVar = q9Var2.a;
                boolean p02 = taVar.p0();
                int i22 = taVar.c;
                if (p02) {
                    try {
                        taVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                taVar.Q1 = false;
                a6 a6Var = taVar.D0;
                if (a6Var != null) {
                    a6Var.c(false);
                }
                if (taVar.H1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(taVar.H1.getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused2) {
                            i11 = -1;
                            if (num2.intValue() != -1) {
                            }
                            if (num2.intValue() != -1) {
                            }
                            d7 m11 = d7.m(taVar.H1, r7);
                            m11.J0 = taVar.w0;
                            m11.K0 = taVar.x0;
                            if (taVar.B0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i10 = -1;
                    }
                    int i23 = num2.intValue() != -1 ? 0 : 90;
                    if (num2.intValue() != -1) {
                        if (i10 > i11) {
                            i23 = ks.t4;
                        }
                    } else if (i11 > i10 && i23 != 0) {
                        i23 = 0;
                    }
                    d7 m112 = d7.m(taVar.H1, i23);
                    m112.J0 = taVar.w0;
                    m112.K0 = taVar.x0;
                    if (taVar.B0.j()) {
                        taVar.L1 = m112;
                        r8.a(i22, m112);
                        taVar.M1 = false;
                        if (x10Var2 != null) {
                            x10Var2.a(new o9(q9Var2, i13));
                            break;
                        } else {
                            taVar.J(1, true);
                            break;
                        }
                    } else {
                        taVar.H1 = null;
                        if (taVar.B0.l(m112)) {
                            d7 a10 = d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
                            taVar.L1 = a10;
                            r8.a(i22, a10);
                            taVar.M1 = false;
                            if (x10Var2 != null) {
                                x10Var2.a(null);
                            }
                        } else if (x10Var2 != null) {
                            x10Var2.a(null);
                        }
                        taVar.l0(true);
                        break;
                    }
                }
                break;
            case 22:
                ya yaVar = (ya) obj2;
                Float f11 = (Float) obj;
                yaVar.i = f11.floatValue();
                xa xaVar = ((db) obj3).a;
                if (xaVar != null) {
                    xaVar.J0(f11.floatValue(), yaVar.a);
                    break;
                }
                break;
            case 23:
                View view = (View) obj3;
                kg.s sVar = (kg.s) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                org.telegram.messenger.g0.v1(sVar);
                org.telegram.messenger.g0.h3(runnable2, 80L);
                break;
            case 24:
                kg.v1 v1Var = (kg.v1) obj2;
                kg.w1 f12 = kg.w1.f(j10.t0);
                si siVar = ((kg.g0) obj3).b;
                long c12 = siVar.c1();
                int i24 = f12.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = mp.u1(i24).l1(c12);
                tL_messages_sendQuickReplyMessages.shortcut_id = v1Var.a;
                tr a02 = tr.a0(i24);
                a02.a.c(new s(f12, a02, v1Var, tL_messages_sendQuickReplyMessages, 22));
                siVar.dismiss();
                break;
            case 25:
                kg.f1.b0((kg.f1) obj3, (View) obj2, (String) obj);
                break;
            case 26:
                ki.s0 s0Var = (ki.s0) obj3;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) obj2;
                int[] iArr2 = (int[]) obj;
                s0Var.getClass();
                boolean z13 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z13 = true;
                    }
                    i15++;
                }
                s0Var.d = true;
                s0Var.e = true;
                s0Var.k();
                Iterator it = s0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                oVar.a(Boolean.TRUE, Boolean.valueOf(z13));
                break;
            case 27:
                ki.s0 s0Var2 = (ki.s0) obj3;
                Runnable runnable3 = (Runnable) obj2;
                int[] iArr3 = (int[]) obj;
                s0Var2.getClass();
                boolean z14 = false;
                while (i15 < iArr3.length) {
                    if (iArr3[i15] == 0) {
                        z14 = true;
                    }
                    i15++;
                }
                s0Var2.d = z14;
                s0Var2.e = z14;
                s0Var2.k();
                Iterator it2 = s0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
                break;
            case 28:
                ((File[]) obj3)[0] = (File) obj;
                ((ki.z0) obj2).run();
                break;
            default:
                ((ki.o2) obj3).d.E.G((String) obj2, (String) obj, false);
                break;
        }
    }
}
