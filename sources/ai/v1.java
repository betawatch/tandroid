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
import bi.k6;
import bi.t6;
import bi.u6;
import c8.ja;
import di.a3;
import di.c5;
import di.c6;
import di.e5;
import di.j8;
import di.l8;
import di.ub;
import di.w4;
import di.w5;
import di.y4;
import di.z2;
import fi.b4;
import hi.a5;
import hi.b6;
import hi.cb;
import hi.d7;
import hi.i5;
import hi.m5;
import hi.n9;
import hi.p9;
import hi.pb;
import hi.q8;
import hi.qb;
import hi.r8;
import hi.ra;
import hi.sa;
import hi.u9;
import hi.wa;
import hi.xa;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e3;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
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
                    int[] iArr = c2.l0;
                    final boolean z11 = i16 >= 0 && i16 < 4 && num.intValue() >= iArr[c2Var.I];
                    final boolean z12 = num.intValue() >= iArr[0] && num.intValue() - c2Var.P < 100 && num.intValue() - c2Var.Q >= 100;
                    c2Var.P = num.intValue();
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
                                c2Var2.Q = i17;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 4) {
                                        i18 = 4;
                                        break;
                                    } else if (c2.l0[i18] > i17) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                c2Var2.I = i18;
                                r.b.t(new StringBuilder("tinyasr: tinylid "), (!z12 || z11) ? "at a step" : "after a pause", "Dictation");
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
                bi.s2 s2Var = (bi.s2) obj3;
                z10 z10Var = (z10) obj2;
                Boolean bool = (Boolean) obj;
                s2Var.getClass();
                if (z10Var != null) {
                    z10Var.a(bool);
                }
                if (bool.booleanValue()) {
                    s2Var.O0 = true;
                }
                s2Var.dismiss();
                break;
            case 2:
                bi.r1 r1Var = (bi.r1) obj2;
                if (((Object[]) obj)[1] == ((l8) obj3)) {
                    r1Var.run();
                    break;
                }
                break;
            case 3:
                wp0 wp0Var = (wp0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str = (String) obj;
                j8 j8Var = wp0Var.e;
                int i17 = tL_starGiftCollection.collection_id;
                j8Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i18 = j8Var.a;
                updatestargiftcollection.peer = np.s1(i18).j1(j8Var.b);
                updatestargiftcollection.collection_id = i17;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str;
                ConnectionsManager.getInstance(i18).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str;
                wp0Var.f(true);
                break;
            case 4:
                u6 u6Var = (u6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j3 = u6Var.V1;
                Runnable runnable = u6Var.c2;
                if (runnable != null) {
                    runnable.run();
                }
                u6Var.dismiss();
                ns.f(m10.t0).k(ns.S2, new Object[0]);
                org.telegram.messenger.g0.i3(new k6(0, user), 250L);
                np.s1(u6Var.U1).f7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                break;
            case 5:
                ci.z0 z0Var = (ci.z0) obj3;
                ci.w0 w0Var = (ci.w0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!w0Var.G && w0Var.e == null) {
                    z0Var.E0(w0Var, bitmap);
                    break;
                }
                break;
            case 6:
                c6 c6Var = (c6) obj3;
                wg.c1[] c1VarArr = (wg.c1[]) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() == -97) {
                    wg.c1 c1Var = c1VarArr[0];
                    TL_stars.TL_starGiftUnique H1 = c6Var.H1();
                    if (c6Var.b3 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
                        long e10 = m10.i(c6Var.a).e();
                        TextView textView = new TextView(c6Var.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i19 = j6.r5;
                        q6.U(textView, i19, c6Var.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        Runnable[] runnableArr = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = np.s1(c6Var.a).j1(e10);
                        depositstargift.slug = H1.slug;
                        ConnectionsManager.getInstance(c6Var.a).sendRequestTyped(depositstargift, new d3.b(i14), new z2(c6Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                        String M0 = hd.M0(2131750107, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = hd.M0(2131750105, null);
                        TLRPC.User f10 = m10.i(c6Var.a).f();
                        LinearLayout linearLayout = new LinearLayout(c6Var.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(c6Var.getContext());
                        int L = org.telegram.messenger.g0.L(20.0f);
                        int i20 = j6.j5;
                        ShapeDrawable d02 = j6.d0(L, j6.r1(0.045f, j6.w0(i20, c6Var.J0)));
                        m6 K = q6.K(0.045f, i20);
                        e6 e6Var = c6Var.J0;
                        frameLayout.setBackground(d02);
                        q6.j(frameLayout, d02, K, null, e6Var);
                        i9 i9Var = new i9(c6Var.getContext());
                        i9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                        t8 t8Var = new t8((e6) null);
                        t8Var.r(f10);
                        i9Var.f(f10, t8Var);
                        frameLayout.addView(i9Var, ja.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(c6Var.getContext());
                        i5.c.v(textView2, 1, 16.0f);
                        q6.U(textView2, i20, c6Var.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(org.telegram.messenger.j6.m(q10.p(f10), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, ja.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(c6Var.getContext());
                        textView3.setTextSize(1, 14.0f);
                        q6.U(textView3, i19, c6Var.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f10 != null && !TextUtils.isEmpty(f10.phone)) {
                            textView3.setText(pf.b.c().b("+" + f10.phone));
                        } else if (f10 != null && q10.n(f10) != null) {
                            textView3.setText("@" + q10.n(f10));
                        }
                        frameLayout.addView(textView3, ja.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, ja.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(c6Var.getContext());
                        textView4.setTextSize(1, 15.0f);
                        q6.U(textView4, i20, c6Var.J0);
                        k5.l(textView4, 17, null, 2131750108);
                        linearLayout.addView(textView4, ja.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(c6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        c6Var.l1(linearLayout2, R.drawable.msg_openprofile, 14, i19, hd.M0(2131748302, null), true);
                        c6Var.l1(linearLayout2, R.drawable.menu_gift, 14, i19, hd.M0(2131746676, null), false);
                        linearLayout.addView(linearLayout2, ja.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, ja.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.o(linearLayout);
                        t1Var.H = 20;
                        alertDialog$Builder.k(hd.M0(2131750109, null), new bg.e0(c6Var, e10, stargiftdepositpayloadArr, c1Var, 1));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        t1Var.setOnDismissListener(new a3(0, zArr, runnableArr));
                        t1Var.show();
                        break;
                    }
                } else if (l10.longValue() != -99 && l10.longValue() != -98) {
                    c6Var.Y1(l10.longValue(), 0L, false, new di.j2(c6Var, l10, c1VarArr, 1));
                    break;
                }
                break;
            case 7:
                c6.f1((c6) obj3, (org.telegram.ui.ActionBar.t1) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 8:
                c6 c6Var2 = (c6) obj3;
                String str2 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                w5 w5Var = c6Var2.b2;
                ki.j[] jVarArr = c6Var2.p2;
                hi.d dVar = c6Var2.g2;
                if (stargiftupgradepreview != null) {
                    w5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    c6Var2.t2(1, false, null);
                    w5Var.i(1, hd.M0(2131750136, null), hd.a0(null, null, 2131750137, str2), null);
                    jVarArr[0].setText(hd.M0(2131749866, null));
                    jVarArr[1].setText(hd.M0(2131749863, null));
                    jVarArr[2].setText(hd.M0(2131749860, null));
                    c6Var2.r2.setVisibility(8);
                    c6Var2.q2.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.i(hd.M0(2131747831, null), false, true);
                    dVar.g(null, false);
                    dVar.setOnClickListener(new di.k1(c6Var2, 8));
                    c6Var2.show();
                    break;
                }
                break;
            case 9:
                y4 y4Var = (y4) obj3;
                y4Var.getClass();
                ((w4) obj2).a((TL_stars.StarGift) obj, true);
                y4Var.d(true);
                break;
            case 10:
                e5 e5Var = (e5) obj3;
                cg.b bVar = (cg.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                vf.b bVar2 = e5Var.n;
                if (bVar2 != null && bVar == e5Var.q) {
                    bVar2.c(false);
                }
                e5Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    e5Var.o.put(bVar, new c5(bVar, tL_payments_paymentFormStarGift));
                    e5Var.a(true);
                    break;
                }
                break;
            case 11:
                ((s10) obj3).a((cg.a) obj, new ch.w((di.v0[]) obj2, 23));
                break;
            case 12:
                b4 b4Var = (b4) obj3;
                e3 e3Var = (e3) obj;
                b4Var.u3 = e3Var;
                ug.j0.w1(new t6(b4Var, i13), (TL_stories.TL_premium_boostsStatus) obj2, e3Var, b4Var.l1, true);
                fi.i9 i9Var2 = b4Var.t0;
                if (i9Var2 != null) {
                    i9Var2.k1 = false;
                    i9Var2.V();
                    break;
                }
                break;
            case 13:
                ub ubVar = (ub) obj3;
                pb pbVar = (pb) obj;
                ubVar.getClass();
                hi.f2 f2Var = ((hi.f2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pbVar == null ? "🌤" : pbVar.c);
                sb2.append(" ");
                sb2.append(pbVar == null ? qb.a() ? "24°C" : "72°F" : pbVar.a());
                CharSequence m10 = org.telegram.messenger.j6.m(sb2.toString(), ((TextPaint) ubVar.c).getFontMetricsInt(), false, null, 0);
                ub ubVar2 = f2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m10, (TextPaint) ubVar2.c, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), (TextPaint) ubVar2.c, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                f2Var.k = staticLayout;
                f2Var.l = staticLayout.getLineCount() > 0 ? f2Var.k.getLineWidth(0) : 0.0f;
                f2Var.m = f2Var.k.getLineCount() > 0 ? f2Var.k.getLineLeft(0) : 0.0f;
                f2Var.b = org.telegram.messenger.g0.N(17.6f) + f2Var.l;
                f2Var.c = org.telegram.messenger.g0.N(36.0f);
                ubVar.invalidate();
                ubVar.requestLayout();
                break;
            case 14:
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
                        tg.m1 m1Var = u9Var.N0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(m1Var, (Property<tg.m1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u9Var.D0, (Property<i5, Float>) property, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                        hi.y4 y4Var2 = u9Var.G0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(y4Var2, (Property<hi.y4, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u9Var.l0, (Property<tg.z0, Float>) property2, (z10 || u9Var.l1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u9Var.k0, (Property<tg.v0, Float>) property2, (z10 || u9Var.l1) ? 1.0f : 0.0f));
                        u9Var.Q0();
                        u9Var.x1.playTogether(arrayList);
                        if (z10) {
                            u9Var.x1.setDuration(350L);
                            u9Var.x1.setInterpolator(er.h);
                        } else {
                            u9Var.x1.setDuration(250L);
                            u9Var.x1.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        }
                        u9Var.x1.start();
                        for (i7 = 0; i7 < arrayList.size(); i7++) {
                            ((Animator) arrayList.get(i7)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i7)).setInterpolator(z10 ? er.h : org.telegram.ui.ActionBar.i1.w);
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
                tg.m1 m1Var2 = u9Var.N0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(m1Var2, (Property<tg.m1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u9Var.D0, (Property<i5, Float>) property3, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                hi.y4 y4Var22 = u9Var.G0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(y4Var22, (Property<hi.y4, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u9Var.l0, (Property<tg.z0, Float>) property22, (z10 || u9Var.l1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u9Var.k0, (Property<tg.v0, Float>) property22, (z10 || u9Var.l1) ? 1.0f : 0.0f));
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
            case 15:
                m5 m5Var = (m5) obj3;
                a5 a5Var = (a5) obj2;
                pb pbVar2 = (pb) obj;
                if (pbVar2 != null) {
                    a5Var.dismiss();
                    m5Var.w0(false);
                    m5Var.b0(m5Var.m0(pbVar2));
                    break;
                }
                break;
            case 16:
                m5 m5Var2 = (m5) obj3;
                tg.k0 k0Var = (tg.k0) obj2;
                tg.h0 h0Var = (tg.h0) obj;
                if (k0Var != null) {
                    int i21 = m5Var2.p1;
                    k0Var.v0 = h0Var;
                    k0Var.r0.b(i21, h0Var, false);
                    k0Var.m();
                    m5Var2.b0(k0Var);
                    break;
                } else {
                    m5Var2.b0(m5Var2.f0(h0Var));
                    break;
                }
            case 17:
                hi.l8 l8Var = (hi.l8) obj3;
                ((m60) obj2).u();
                l8Var.h(true);
                q8 q8Var = l8Var.a0;
                hi.t8 t8Var2 = q8Var.S1;
                if (t8Var2 != null) {
                    t8Var2.a(new HashSet(q8Var.v1));
                    break;
                }
                break;
            case 18:
                hi.l8 l8Var2 = (hi.l8) obj3;
                l8Var2.a0.B1 = true;
                ((ar[]) obj2)[0].dismiss();
                l8Var2.h(true);
                break;
            case 19:
                p9 p9Var = (p9) obj3;
                z10 z10Var2 = (z10) obj2;
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
                b6 b6Var = saVar.D0;
                if (b6Var != null) {
                    b6Var.c(false);
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
                            d7 m11 = d7.m(saVar.H1, r13);
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
                            i23 = ns.t4;
                        }
                    } else if (i11 > i10 && i23 != 0) {
                        i23 = 0;
                    }
                    d7 m112 = d7.m(saVar.H1, i23);
                    m112.J0 = saVar.w0;
                    m112.K0 = saVar.x0;
                    if (saVar.B0.j()) {
                        saVar.L1 = m112;
                        r8.a(i22, m112);
                        saVar.M1 = false;
                        if (z10Var2 != null) {
                            z10Var2.a(new n9(p9Var, i13));
                            break;
                        } else {
                            saVar.J(1, true);
                            break;
                        }
                    } else {
                        saVar.H1 = null;
                        if (saVar.B0.l(m112)) {
                            d7 a10 = d7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                            saVar.L1 = a10;
                            r8.a(i22, a10);
                            saVar.M1 = false;
                            if (z10Var2 != null) {
                                z10Var2.a(null);
                            }
                        } else if (z10Var2 != null) {
                            z10Var2.a(null);
                        }
                        saVar.l0(true);
                        break;
                    }
                }
                break;
            case 20:
                xa xaVar = (xa) obj2;
                Float f11 = (Float) obj;
                xaVar.i = f11.floatValue();
                wa waVar = ((cb) obj3).a;
                if (waVar != null) {
                    waVar.D(f11.floatValue(), xaVar.a);
                    break;
                }
                break;
            case 21:
                View view = (View) obj3;
                kg.s sVar = (kg.s) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                org.telegram.messenger.g0.v1(sVar);
                org.telegram.messenger.g0.i3(runnable2, 80L);
                break;
            case 22:
                kg.u1 u1Var = (kg.u1) obj2;
                kg.v1 f12 = kg.v1.f(m10.t0);
                ki kiVar = ((kg.g0) obj3).b;
                long b12 = kiVar.b1();
                int i24 = f12.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = np.s1(i24).j1(b12);
                tL_messages_sendQuickReplyMessages.shortcut_id = u1Var.a;
                vr a02 = vr.a0(i24);
                a02.a.c(new r(f12, a02, u1Var, tL_messages_sendQuickReplyMessages, 20));
                kiVar.dismiss();
                break;
            case 23:
                kg.c1.b0((kg.c1) obj3, (View) obj2, (String) obj);
                break;
            case 24:
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
            case 25:
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
            case 26:
                ((File[]) obj3)[0] = (File) obj;
                ((ki.b1) obj2).run();
                break;
            case 27:
                ((ki.s2) obj3).d.E.G((String) obj2, (String) obj, false);
                break;
            case 28:
                li.e eVar = (li.e) obj3;
                eVar.getClass();
                eVar.b0(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            default:
                li.e eVar2 = (li.e) obj3;
                eVar2.getClass();
                eVar2.a0((String) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
