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
import bi.c9;
import bi.n3;
import bi.s8;
import bi.x4;
import c8.ma;
import di.b5;
import di.f5;
import di.f6;
import di.h5;
import di.n8;
import di.p8;
import di.yb;
import di.z4;
import di.z5;
import fi.f9;
import fi.z3;
import hi.c7;
import hi.cb;
import hi.g5;
import hi.k5;
import hi.k8;
import hi.n9;
import hi.p9;
import hi.pb;
import hi.q8;
import hi.qb;
import hi.ra;
import hi.sa;
import hi.u9;
import hi.wa;
import hi.xa;
import hi.y4;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g3;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(int i7, Object obj, Object obj2) {
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
    @Override // org.telegram.messenger.y10
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
                final a2 a2Var = (a2) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                f2 f2Var = a2Var.b;
                if (!f2Var.j && !f2Var.i) {
                    int i16 = f2Var.I;
                    int[] iArr = f2.j0;
                    final boolean z11 = i16 >= 0 && i16 < 4 && num.intValue() >= iArr[f2Var.I];
                    final boolean z12 = num.intValue() >= iArr[0] && num.intValue() - f2Var.N < 100 && num.intValue() - f2Var.O >= 100;
                    f2Var.N = num.intValue();
                    if (!z11 && !z12) {
                        f2Var.E = false;
                        break;
                    } else {
                        DictationLid.j(0, new e1() { // from class: ai.z1
                            @Override // ai.e1
                            public final void a(float[] fArr, long j3, int i17) {
                                f2 f2Var2 = a2.this.b;
                                f2Var2.E = false;
                                if (fArr == null) {
                                    return;
                                }
                                f2Var2.O = i17;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 4) {
                                        i18 = 4;
                                        break;
                                    } else if (f2.j0[i18] > i17) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                f2Var2.I = i18;
                                p5.c.t(new StringBuilder("tinyasr: tinylid "), (!z12 || z11) ? "at a step" : "after a pause", "Dictation");
                                if (f2Var2.j || f2Var2.i) {
                                    return;
                                }
                                f1 n10 = DictationLid.n(DictationLid.i(i17), fArr);
                                Log.d("Dictation", "tinyasr: tinylid " + i17 + " ms speech in " + j3 + " ms: " + n10 + " (route " + f2Var2.y + ")");
                                if (n10 != null) {
                                    String str = n10.a;
                                    if (!n10.c && "other".equals(str) && n10.b >= DictationLid.i(i17)) {
                                        f2Var2.i(str);
                                        return;
                                    }
                                }
                                if (n10 != null) {
                                    String str2 = n10.a;
                                    if (n10.c) {
                                        android.support.v4.media.session.a0 V = DictationAsr.V(str2, f2Var2.y, false);
                                        if (V == null) {
                                            f2Var2.i(str2);
                                            return;
                                        }
                                        t tVar = (t) V.b;
                                        android.support.v4.media.session.a0 a0Var = f2Var2.y;
                                        if (tVar == ((t) a0Var.b) && ((String) V.c).equals((String) a0Var.c)) {
                                            f2Var2.F = true;
                                            DictationLid.l(str2);
                                            f2Var2.s(str2);
                                        } else if (!f2Var2.F || n10.b >= 0.8f) {
                                            f2Var2.F = true;
                                            DictationLid.l(str2);
                                            f2Var2.s(str2);
                                            Log.d("Dictation", "tinyasr: switching to " + V);
                                            f2Var2.p(V);
                                        }
                                    }
                                }
                            }
                        }, f2Var.b(), bArr);
                        break;
                    }
                } else {
                    f2Var.E = false;
                    break;
                }
                break;
            case 1:
                n3 n3Var = (n3) obj3;
                y10 y10Var = (y10) obj2;
                Boolean bool = (Boolean) obj;
                n3Var.getClass();
                if (y10Var != null) {
                    y10Var.a(bool);
                }
                if (bool.booleanValue()) {
                    n3Var.O0 = true;
                }
                n3Var.dismiss();
                break;
            case 2:
                bi.o2 o2Var = (bi.o2) obj2;
                if (((Object[]) obj)[1] == ((p8) obj3)) {
                    o2Var.run();
                    break;
                }
                break;
            case 3:
                x4.s((TL_stars.TL_starGiftUnique) obj3, hd.a0(null, null, ((Boolean) obj).booleanValue() ? 2131749509 : 2131749619, (String) obj2));
                break;
            case 4:
                gq0 gq0Var = (gq0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str = (String) obj;
                n8 n8Var = gq0Var.e;
                int i17 = tL_starGiftCollection.collection_id;
                n8Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i18 = n8Var.a;
                updatestargiftcollection.peer = np.u1(i18).l1(n8Var.b);
                updatestargiftcollection.collection_id = i17;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str;
                ConnectionsManager.getInstance(i18).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str;
                gq0Var.f(true);
                break;
            case 5:
                c9 c9Var = (c9) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j3 = c9Var.V1;
                Runnable runnable = c9Var.c2;
                if (runnable != null) {
                    runnable.run();
                }
                c9Var.dismiss();
                ls.f(k10.t0).k(ls.U2, new Object[0]);
                org.telegram.messenger.g0.h3(new s8(0, user), 250L);
                np.u1(c9Var.U1).h7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
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
                f6.i1((f6) obj3, (org.telegram.ui.ActionBar.t1) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 8:
                bi.k1 k1Var = (bi.k1) obj2;
                Boolean bool2 = (Boolean) obj;
                ((f6) obj3).g2.setLoading(bool2.booleanValue());
                if (k1Var != null && k1Var.G1 != (booleanValue = bool2.booleanValue())) {
                    k1Var.G1 = booleanValue;
                    k1Var.C1.g(booleanValue);
                    break;
                }
                break;
            case 9:
                f6 f6Var = (f6) obj3;
                String str2 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                z5 z5Var = f6Var.b2;
                ki.i[] iVarArr = f6Var.p2;
                hi.e eVar = f6Var.g2;
                if (stargiftupgradepreview != null) {
                    z5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    f6Var.H2(1, false, null);
                    z5Var.i(1, hd.N0(2131750119, null), hd.a0(null, null, 2131750120, str2), null);
                    iVarArr[0].setText(hd.N0(2131749849, null));
                    iVarArr[1].setText(hd.N0(2131749846, null));
                    iVarArr[2].setText(hd.N0(2131749843, null));
                    f6Var.r2.setVisibility(8);
                    f6Var.q2.setVisibility(8);
                    eVar.setFilled(true);
                    eVar.i(hd.N0(2131747637, null), false, true);
                    eVar.g(null, false);
                    eVar.setOnClickListener(new di.i1(f6Var, 17));
                    f6Var.show();
                    break;
                }
                break;
            case 10:
                f6 f6Var2 = (f6) obj3;
                bi.e2[] e2VarArr = (bi.e2[]) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() == -97) {
                    bi.e2 e2Var = e2VarArr[0];
                    TL_stars.TL_starGiftUnique M1 = f6Var2.M1();
                    if (f6Var2.M2() != null && M1 != null && !TextUtils.isEmpty(M1.slug)) {
                        long e10 = k10.i(f6Var2.a).e();
                        TextView textView = new TextView(f6Var2.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i19 = m6.r5;
                        t6.U(textView, i19, f6Var2.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new r80(org.telegram.messenger.g0.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        long[] jArr = new long[1];
                        ?? r82 = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = np.u1(f6Var2.a).l1(e10);
                        depositstargift.slug = M1.slug;
                        ConnectionsManager.getInstance(f6Var2.a).sendRequestTyped(depositstargift, new d3.b(i14), new di.s1(f6Var2, zArr, textView, stargiftdepositpayloadArr, r82, jArr, 0));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var2.getContext(), f6Var2.J0);
                        String N0 = hd.N0(2131750090, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = hd.N0(2131750088, null);
                        TLRPC.User f10 = k10.i(f6Var2.a).f();
                        LinearLayout linearLayout = new LinearLayout(f6Var2.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(f6Var2.getContext());
                        int L = org.telegram.messenger.g0.L(20.0f);
                        int i20 = m6.j5;
                        ShapeDrawable d02 = m6.d0(L, m6.r1(0.045f, m6.w0(i20, f6Var2.J0)));
                        p6 K = t6.K(0.045f, i20);
                        h6 h6Var = f6Var2.J0;
                        frameLayout.setBackground(d02);
                        t6.j(frameLayout, d02, K, null, h6Var);
                        q9 q9Var = new q9(f6Var2.getContext());
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                        b9 b9Var = new b9((h6) null);
                        b9Var.r(f10);
                        q9Var.f(f10, b9Var);
                        frameLayout.addView(q9Var, ma.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(f6Var2.getContext());
                        i5.c.x(textView2, 1, 16.0f);
                        t6.U(textView2, i20, f6Var2.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(j6.m(p10.q(f10), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, ma.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(f6Var2.getContext());
                        textView3.setTextSize(1, 14.0f);
                        t6.U(textView3, i19, f6Var2.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f10 != null && !TextUtils.isEmpty(f10.phone)) {
                            textView3.setText(pf.b.c().b("+" + f10.phone));
                        } else if (f10 != null && p10.o(f10) != null) {
                            textView3.setText("@" + p10.o(f10));
                        }
                        frameLayout.addView(textView3, ma.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, ma.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(f6Var2.getContext());
                        textView4.setTextSize(1, 15.0f);
                        t6.U(textView4, i20, f6Var2.J0);
                        f3.k(textView4, 17, null, 2131750091);
                        linearLayout.addView(textView4, ma.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(f6Var2.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        f6Var2.n1(linearLayout2, R.drawable.msg_openprofile, 14, i19, hd.N0(2131748109, null), true);
                        f6Var2.n1(linearLayout2, R.drawable.menu_gift, 14, i19, hd.N0(2131746480, null), false);
                        linearLayout.addView(linearLayout2, ma.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, ma.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.o(linearLayout);
                        t1Var.H = 20;
                        alertDialog$Builder.k(hd.N0(2131750092, null), new di.t1(f6Var2, e10, stargiftdepositpayloadArr, jArr, e2Var));
                        alertDialog$Builder.h(hd.N0(2131752577, null), null);
                        t1Var.setOnDismissListener(new di.u1(0, zArr, (Object) r82));
                        t1Var.show();
                        break;
                    }
                } else if (l10.longValue() != -99 && l10.longValue() != -98) {
                    long longValue = l10.longValue();
                    bi.e2 e2Var2 = e2VarArr[0];
                    TL_stars.TL_starGiftUnique M12 = f6Var2.M1();
                    if (f6Var2.M2() != null && M12 != null && !TextUtils.isEmpty(M12.slug)) {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, f6Var2.getContext(), f6Var2.J0);
                        t1Var2.r(300L);
                        TL_stars.depositStarGift depositstargift2 = new TL_stars.depositStarGift();
                        depositstargift2.peer = np.u1(f6Var2.a).l1(longValue);
                        depositstargift2.slug = M12.slug;
                        ConnectionsManager.getInstance(f6Var2.a).sendRequestTyped(depositstargift2, new d3.b(1), new e(f6Var2, t1Var2, e2Var2, longValue));
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
                ((r10) obj3).a((cg.a) obj, new ca.r((di.u0[]) obj2, 27));
                break;
            case 14:
                z3 z3Var = (z3) obj3;
                g3 g3Var = (g3) obj;
                z3Var.u3 = g3Var;
                ug.k0.x1(new bi.b9(z3Var, i13), (TL_stories.TL_premium_boostsStatus) obj2, g3Var, z3Var.l1, true);
                f9 f9Var = z3Var.t0;
                if (f9Var != null) {
                    f9Var.k1 = false;
                    f9Var.V();
                    break;
                }
                break;
            case 15:
                yb ybVar = (yb) obj3;
                pb pbVar = (pb) obj;
                ybVar.getClass();
                hi.f2 f2Var2 = ((hi.f2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pbVar == null ? "🌤" : pbVar.c);
                sb2.append(" ");
                sb2.append(pbVar == null ? qb.a() ? "24°C" : "72°F" : pbVar.a());
                CharSequence m10 = j6.m(sb2.toString(), ((TextPaint) ybVar.c).getFontMetricsInt(), false, null, 0);
                yb ybVar2 = f2Var2.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m10, (TextPaint) ybVar2.c, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), (TextPaint) ybVar2.c, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                f2Var2.k = staticLayout;
                f2Var2.l = staticLayout.getLineCount() > 0 ? f2Var2.k.getLineWidth(0) : 0.0f;
                f2Var2.m = f2Var2.k.getLineCount() > 0 ? f2Var2.k.getLineLeft(0) : 0.0f;
                f2Var2.b = org.telegram.messenger.g0.N(17.6f) + f2Var2.l;
                f2Var2.c = org.telegram.messenger.g0.N(36.0f);
                ybVar.invalidate();
                ybVar.requestLayout();
                break;
            case 16:
                u9 u9Var = (u9) obj3;
                ra raVar = (ra) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - raVar.getBottomPadding2(), u9Var.d2 - raVar.getPaddingUnderContainer()));
                u9Var.R();
                if (max > 0) {
                    tg.j jVar = u9Var.t0;
                    if ((jVar instanceof tg.n2) && ((tg.n2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = u9Var.x1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        u9Var.x1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        tg.n1 n1Var = u9Var.N0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(n1Var, (Property<tg.n1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u9Var.D0, (Property<g5, Float>) property, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                        hi.x4 x4Var = u9Var.G0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(x4Var, (Property<hi.x4, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u9Var.l0, (Property<tg.a1, Float>) property2, (z10 || u9Var.l1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u9Var.k0, (Property<tg.w0, Float>) property2, (z10 || u9Var.l1) ? 1.0f : 0.0f));
                        u9Var.Q0();
                        u9Var.x1.playTogether(arrayList);
                        if (z10) {
                            u9Var.x1.setDuration(350L);
                            u9Var.x1.setInterpolator(nr.h);
                        } else {
                            u9Var.x1.setDuration(250L);
                            u9Var.x1.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        }
                        u9Var.x1.start();
                        for (i7 = 0; i7 < arrayList.size(); i7++) {
                            ((Animator) arrayList.get(i7)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i7)).setInterpolator(z10 ? nr.h : org.telegram.ui.ActionBar.i1.w);
                            ((Animator) arrayList.get(i7)).start();
                        }
                        if (!z10) {
                            u9Var.M0(false);
                        }
                        if (u9Var.R1 != z10) {
                            u9Var.d0();
                        }
                        u9Var.R1 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = u9Var.x1;
                if (animatorSet != null) {
                }
                u9Var.x1 = new AnimatorSet();
                arrayList = new ArrayList();
                tg.n1 n1Var2 = u9Var.N0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(n1Var2, (Property<tg.n1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u9Var.D0, (Property<g5, Float>) property3, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                hi.x4 x4Var2 = u9Var.G0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(x4Var2, (Property<hi.x4, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u9Var.l0, (Property<tg.a1, Float>) property22, (z10 || u9Var.l1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u9Var.k0, (Property<tg.w0, Float>) property22, (z10 || u9Var.l1) ? 1.0f : 0.0f));
                u9Var.Q0();
                u9Var.x1.playTogether(arrayList);
                if (z10) {
                }
                u9Var.x1.start();
                while (i7 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (u9Var.R1 != z10) {
                }
                u9Var.R1 = z10;
                break;
            case 17:
                k5 k5Var = (k5) obj3;
                y4 y4Var = (y4) obj2;
                pb pbVar2 = (pb) obj;
                if (pbVar2 != null) {
                    y4Var.dismiss();
                    k5Var.w0(false);
                    k5Var.b0(k5Var.m0(pbVar2));
                    break;
                }
                break;
            case 18:
                k5 k5Var2 = (k5) obj3;
                tg.l0 l0Var = (tg.l0) obj2;
                tg.i0 i0Var = (tg.i0) obj;
                if (l0Var != null) {
                    int i21 = k5Var2.p1;
                    l0Var.v0 = i0Var;
                    l0Var.r0.b(i21, i0Var, false);
                    l0Var.m();
                    k5Var2.b0(l0Var);
                    break;
                } else {
                    k5Var2.b0(k5Var2.f0(i0Var));
                    break;
                }
            case 19:
                k8 k8Var = (k8) obj3;
                ((a70) obj2).v();
                k8Var.h(true);
                hi.p8 p8Var = k8Var.a0;
                hi.s8 s8Var = p8Var.S1;
                if (s8Var != null) {
                    s8Var.a(new HashSet(p8Var.v1));
                    break;
                }
                break;
            case 20:
                k8 k8Var2 = (k8) obj3;
                k8Var2.a0.B1 = true;
                ((jr[]) obj2)[0].dismiss();
                k8Var2.h(true);
                break;
            case 21:
                p9 p9Var = (p9) obj3;
                y10 y10Var2 = (y10) obj2;
                Integer num2 = (Integer) obj;
                sa saVar = p9Var.a;
                boolean p02 = saVar.p0();
                int i22 = saVar.c;
                if (p02) {
                    try {
                        saVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                saVar.Q1 = false;
                hi.z5 z5Var2 = saVar.D0;
                if (z5Var2 != null) {
                    z5Var2.c(false);
                }
                if (saVar.H1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(saVar.H1.getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused2) {
                            i11 = -1;
                            if (num2.intValue() != -1) {
                            }
                            if (num2.intValue() != -1) {
                            }
                            c7 m11 = c7.m(saVar.H1, r7);
                            m11.J0 = saVar.w0;
                            m11.K0 = saVar.x0;
                            if (saVar.B0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i10 = -1;
                    }
                    int i23 = num2.intValue() != -1 ? 0 : 90;
                    if (num2.intValue() != -1) {
                        if (i10 > i11) {
                            i23 = ls.t4;
                        }
                    } else if (i11 > i10 && i23 != 0) {
                        i23 = 0;
                    }
                    c7 m112 = c7.m(saVar.H1, i23);
                    m112.J0 = saVar.w0;
                    m112.K0 = saVar.x0;
                    if (saVar.B0.j()) {
                        saVar.L1 = m112;
                        q8.a(i22, m112);
                        saVar.M1 = false;
                        if (y10Var2 != null) {
                            y10Var2.a(new n9(p9Var, i13));
                            break;
                        } else {
                            saVar.J(1, true);
                            break;
                        }
                    } else {
                        saVar.H1 = null;
                        if (saVar.B0.l(m112)) {
                            c7 a10 = c7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                            saVar.L1 = a10;
                            q8.a(i22, a10);
                            saVar.M1 = false;
                            if (y10Var2 != null) {
                                y10Var2.a(null);
                            }
                        } else if (y10Var2 != null) {
                            y10Var2.a(null);
                        }
                        saVar.l0(true);
                        break;
                    }
                }
                break;
            case 22:
                xa xaVar = (xa) obj2;
                Float f11 = (Float) obj;
                xaVar.i = f11.floatValue();
                wa waVar = ((cb) obj3).a;
                if (waVar != null) {
                    waVar.J0(f11.floatValue(), xaVar.a);
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
                kg.u1 u1Var = (kg.u1) obj2;
                kg.v1 f12 = kg.v1.f(k10.t0);
                ui uiVar = ((kg.h0) obj3).b;
                long c12 = uiVar.c1();
                int i24 = f12.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = np.u1(i24).l1(c12);
                tL_messages_sendQuickReplyMessages.shortcut_id = u1Var.a;
                ur a02 = ur.a0(i24);
                a02.a.c(new r(f12, a02, u1Var, tL_messages_sendQuickReplyMessages, 22));
                uiVar.dismiss();
                break;
            case 25:
                kg.e1.b0((kg.e1) obj3, (View) obj2, (String) obj);
                break;
            case 26:
                ki.r0 r0Var = (ki.r0) obj3;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) obj2;
                int[] iArr2 = (int[]) obj;
                r0Var.getClass();
                boolean z13 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z13 = true;
                    }
                    i15++;
                }
                r0Var.d = true;
                r0Var.e = true;
                r0Var.k();
                Iterator it = r0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                oVar.a(Boolean.TRUE, Boolean.valueOf(z13));
                break;
            case 27:
                ki.r0 r0Var2 = (ki.r0) obj3;
                Runnable runnable3 = (Runnable) obj2;
                int[] iArr3 = (int[]) obj;
                r0Var2.getClass();
                boolean z14 = false;
                while (i15 < iArr3.length) {
                    if (iArr3[i15] == 0) {
                        z14 = true;
                    }
                    i15++;
                }
                r0Var2.d = z14;
                r0Var2.e = z14;
                r0Var2.k();
                Iterator it2 = r0Var2.f.iterator();
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
                ((ki.y0) obj2).run();
                break;
            default:
                ((ki.n2) obj3).d.E.G((String) obj2, (String) obj, false);
                break;
        }
    }
}
