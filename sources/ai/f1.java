package ai;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ab;
import bi.b3;
import bi.b6;
import bi.d6;
import bi.e7;
import bi.h6;
import bi.k7;
import bi.nd;
import bi.t3;
import bi.u3;
import bi.w4;
import bi.y1;
import c8.ha;
import di.i4;
import di.p9;
import fi.a5;
import fi.c5;
import fi.c6;
import fi.fb;
import fi.g2;
import fi.n8;
import fi.o5;
import fi.q9;
import fi.s8;
import fi.s9;
import fi.sb;
import fi.t8;
import fi.tb;
import fi.ua;
import fi.v8;
import fi.va;
import fi.x9;
import fi.za;
import hi.v2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kg.s1;
import kg.t1;
import li.b2;
import li.f2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.e3;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import tg.k2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d0  */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z9;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        li.r a10;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                l1 l1Var = (l1) obj3;
                i1 i1Var = (i1) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!i1Var.G && i1Var.e == null) {
                    l1Var.E0(i1Var, bitmap);
                    break;
                }
                break;
            case 1:
                k7 k7Var = (k7) obj3;
                wg.f1[] f1VarArr = (wg.f1[]) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() == -97) {
                    wg.f1 f1Var = f1VarArr[0];
                    TL_stars.TL_starGiftUnique H1 = k7Var.H1();
                    if (k7Var.X2 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
                        long e10 = p10.i(k7Var.a).e();
                        TextView textView = new TextView(k7Var.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i16 = k6.r5;
                        r6.V(textView, i16, k7Var.I0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        Runnable[] runnableArr = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = qp.s1(k7Var.a).j1(e10);
                        depositstargift.slug = H1.slug;
                        ConnectionsManager.getInstance(k7Var.a).sendRequestTyped(depositstargift, new d3.b(i14), new t3(k7Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                        String M0 = hd.M0(2131750106, null);
                        u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = hd.M0(2131750104, null);
                        TLRPC.User f10 = p10.i(k7Var.a).f();
                        LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(k7Var.getContext());
                        int L = org.telegram.messenger.g0.L(20.0f);
                        int i17 = k6.j5;
                        ShapeDrawable d02 = k6.d0(L, k6.r1(0.045f, k6.w0(i17, k7Var.I0)));
                        n6 L2 = r6.L(0.045f, i17);
                        f6 f6Var = k7Var.I0;
                        frameLayout.setBackground(d02);
                        r6.k(frameLayout, d02, L2, null, f6Var);
                        l9 l9Var = new l9(k7Var.getContext());
                        l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                        w8 w8Var = new w8((f6) null);
                        w8Var.r(f10);
                        l9Var.e(f10, w8Var);
                        frameLayout.addView(l9Var, ha.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(k7Var.getContext());
                        com.google.android.recaptcha.internal.a.q(textView2, 1, 16.0f);
                        r6.V(textView2, i17, k7Var.I0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(i6.m(t10.p(f10), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, ha.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(k7Var.getContext());
                        textView3.setTextSize(1, 14.0f);
                        r6.V(textView3, i16, k7Var.I0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f10 != null && !TextUtils.isEmpty(f10.phone)) {
                            textView3.setText(pf.b.c().b("+" + f10.phone));
                        } else if (f10 != null && t10.n(f10) != null) {
                            textView3.setText("@" + t10.n(f10));
                        }
                        frameLayout.addView(textView3, ha.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, ha.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(k7Var.getContext());
                        textView4.setTextSize(1, 15.0f);
                        r6.V(textView4, i17, k7Var.I0);
                        k5.m(textView4, 17, null, 2131750107);
                        linearLayout.addView(textView4, ha.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        k7Var.l1(linearLayout2, R.drawable.msg_openprofile, 14, i16, hd.M0(2131748301, null), true);
                        k7Var.l1(linearLayout2, R.drawable.menu_gift, 14, i16, hd.M0(2131746675, null), false);
                        linearLayout.addView(linearLayout2, ha.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, ha.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.o(linearLayout);
                        u1Var.G = 20;
                        alertDialog$Builder.k(hd.M0(2131750108, null), new bg.e0(k7Var, e10, stargiftdepositpayloadArr, f1Var, 1));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        u1Var.setOnDismissListener(new u3(0, zArr, runnableArr));
                        u1Var.show();
                        break;
                    }
                } else if (l10.longValue() != -99 && l10.longValue() != -98) {
                    k7Var.X1(l10.longValue(), 0L, false, new b3(k7Var, l10, f1VarArr, 1));
                    break;
                }
                break;
            case 2:
                k7.f1((k7) obj3, (u1) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 3:
                k7 k7Var2 = (k7) obj3;
                String str = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                e7 e7Var = k7Var2.X1;
                hi.i[] iVarArr = k7Var2.l2;
                fi.d dVar = k7Var2.c2;
                if (stargiftupgradepreview != null) {
                    e7Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    k7Var2.s2(1, false, null);
                    e7Var.i(1, hd.M0(2131750135, null), hd.a0(null, null, 2131750136, str), null);
                    iVarArr[0].setText(hd.M0(2131749865, null));
                    iVarArr[1].setText(hd.M0(2131749862, null));
                    iVarArr[2].setText(hd.M0(2131749859, null));
                    k7Var2.n2.setVisibility(8);
                    k7Var2.m2.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.i(hd.M0(2131747830, null), false, true);
                    dVar.g(null, false);
                    dVar.setOnClickListener(new y1(k7Var2, 9));
                    k7Var2.show();
                    break;
                }
                break;
            case 4:
                d6 d6Var = (d6) obj3;
                d6Var.getClass();
                ((b6) obj2).a((TL_stars.StarGift) obj, true);
                d6Var.d(true);
                break;
            case 5:
                bi.k6 k6Var = (bi.k6) obj3;
                cg.b bVar = (cg.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                vf.b bVar2 = k6Var.n;
                if (bVar2 != null && bVar == k6Var.q) {
                    bVar2.c(false);
                }
                k6Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    k6Var.o.put(bVar, new h6(bVar, tL_payments_paymentFormStarGift));
                    k6Var.a(true);
                    break;
                }
                break;
            case 6:
                ((v10) obj3).a((cg.a) obj, new ab((bi.h1[]) obj2, i13));
                break;
            case 7:
                i4 i4Var = (i4) obj3;
                e3 e3Var = (e3) obj;
                i4Var.t3 = e3Var;
                ug.i0.w1(new w4(i4Var, i14), (TL_stories.TL_premium_boostsStatus) obj2, e3Var, i4Var.k1, true);
                p9 p9Var = i4Var.s0;
                if (p9Var != null) {
                    p9Var.j1 = false;
                    p9Var.V();
                    break;
                }
                break;
            case 8:
                nd ndVar = (nd) obj3;
                sb sbVar = (sb) obj;
                ndVar.getClass();
                g2 g2Var = ((g2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sbVar == null ? "🌤" : sbVar.c);
                sb2.append(" ");
                sb2.append(sbVar == null ? tb.a() ? "24°C" : "72°F" : sbVar.a());
                CharSequence m10 = i6.m(sb2.toString(), ((TextPaint) ndVar.c).getFontMetricsInt(), false, null, 0);
                nd ndVar2 = g2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m10, (TextPaint) ndVar2.c, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), (TextPaint) ndVar2.c, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                g2Var.k = staticLayout;
                g2Var.l = staticLayout.getLineCount() > 0 ? g2Var.k.getLineWidth(0) : 0.0f;
                g2Var.m = g2Var.k.getLineCount() > 0 ? g2Var.k.getLineLeft(0) : 0.0f;
                g2Var.b = org.telegram.messenger.g0.N(17.6f) + g2Var.l;
                g2Var.c = org.telegram.messenger.g0.N(36.0f);
                ndVar.invalidate();
                ndVar.requestLayout();
                break;
            case 9:
                x9 x9Var = (x9) obj3;
                ua uaVar = (ua) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - uaVar.getBottomPadding2(), x9Var.c2 - uaVar.getPaddingUnderContainer()));
                x9Var.R();
                if (max > 0) {
                    tg.j jVar = x9Var.s0;
                    if ((jVar instanceof k2) && ((k2) jVar).getEditText().isFocused()) {
                        z9 = true;
                        animatorSet = x9Var.w1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        x9Var.w1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        tg.m1 m1Var = x9Var.M0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(m1Var, (Property<tg.m1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x9Var.C0, (Property<fi.k5, Float>) property, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                        a5 a5Var = x9Var.F0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(a5Var, (Property<a5, Float>) property2, !z9 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x9Var.k0, (Property<tg.z0, Float>) property2, (z9 || x9Var.k1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x9Var.j0, (Property<tg.v0, Float>) property2, (z9 || x9Var.k1) ? 1.0f : 0.0f));
                        x9Var.Q0();
                        x9Var.w1.playTogether(arrayList);
                        if (z9) {
                            x9Var.w1.setDuration(350L);
                            x9Var.w1.setInterpolator(xq.h);
                        } else {
                            x9Var.w1.setDuration(250L);
                            x9Var.w1.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        }
                        x9Var.w1.start();
                        for (i7 = 0; i7 < arrayList.size(); i7++) {
                            ((Animator) arrayList.get(i7)).setDuration(z9 ? 350L : 250L);
                            ((Animator) arrayList.get(i7)).setInterpolator(z9 ? xq.h : org.telegram.ui.ActionBar.i1.w);
                            ((Animator) arrayList.get(i7)).start();
                        }
                        if (!z9) {
                            x9Var.M0(false);
                        }
                        if (x9Var.Q1 != z9) {
                            x9Var.d0();
                        }
                        x9Var.Q1 = z9;
                        break;
                    }
                }
                z9 = false;
                animatorSet = x9Var.w1;
                if (animatorSet != null) {
                }
                x9Var.w1 = new AnimatorSet();
                arrayList = new ArrayList();
                tg.m1 m1Var2 = x9Var.M0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(m1Var2, (Property<tg.m1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(x9Var.C0, (Property<fi.k5, Float>) property3, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                a5 a5Var2 = x9Var.F0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(a5Var2, (Property<a5, Float>) property22, !z9 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(x9Var.k0, (Property<tg.z0, Float>) property22, (z9 || x9Var.k1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(x9Var.j0, (Property<tg.v0, Float>) property22, (z9 || x9Var.k1) ? 1.0f : 0.0f));
                x9Var.Q0();
                x9Var.w1.playTogether(arrayList);
                if (z9) {
                }
                x9Var.w1.start();
                while (i7 < arrayList.size()) {
                }
                if (!z9) {
                }
                if (x9Var.Q1 != z9) {
                }
                x9Var.Q1 = z9;
                break;
            case 10:
                o5 o5Var = (o5) obj3;
                c5 c5Var = (c5) obj2;
                sb sbVar2 = (sb) obj;
                if (sbVar2 != null) {
                    c5Var.dismiss();
                    o5Var.w0(false);
                    o5Var.b0(o5Var.m0(sbVar2));
                    break;
                }
                break;
            case 11:
                o5 o5Var2 = (o5) obj3;
                tg.k0 k0Var = (tg.k0) obj2;
                tg.h0 h0Var = (tg.h0) obj;
                if (k0Var != null) {
                    int i18 = o5Var2.o1;
                    k0Var.u0 = h0Var;
                    k0Var.q0.b(i18, h0Var, false);
                    k0Var.m();
                    o5Var2.b0(k0Var);
                    break;
                } else {
                    o5Var2.b0(o5Var2.f0(h0Var));
                    break;
                }
            case 12:
                n8 n8Var = (n8) obj3;
                ((k60) obj2).u();
                n8Var.h(true);
                s8 s8Var = n8Var.W;
                v8 v8Var = s8Var.O1;
                if (v8Var != null) {
                    v8Var.a(new HashSet(s8Var.r1));
                    break;
                }
                break;
            case 13:
                n8 n8Var2 = (n8) obj3;
                n8Var2.W.x1 = true;
                ((tq[]) obj2)[0].dismiss();
                n8Var2.h(true);
                break;
            case 14:
                s9 s9Var = (s9) obj3;
                c20 c20Var = (c20) obj2;
                Integer num = (Integer) obj;
                va vaVar = s9Var.a;
                boolean p02 = vaVar.p0();
                int i19 = vaVar.c;
                if (p02) {
                    try {
                        vaVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                vaVar.P1 = false;
                c6 c6Var = vaVar.C0;
                if (c6Var != null) {
                    c6Var.c(false);
                }
                if (vaVar.G1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(vaVar.G1.getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused2) {
                            i11 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            fi.e7 m11 = fi.e7.m(vaVar.G1, r13);
                            m11.J0 = vaVar.v0;
                            m11.K0 = vaVar.w0;
                            if (vaVar.A0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i10 = -1;
                    }
                    int i20 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i10 > i11) {
                            i20 = qs.t4;
                        }
                    } else if (i11 > i10 && i20 != 0) {
                        i20 = 0;
                    }
                    fi.e7 m112 = fi.e7.m(vaVar.G1, i20);
                    m112.J0 = vaVar.v0;
                    m112.K0 = vaVar.w0;
                    if (vaVar.A0.j()) {
                        vaVar.K1 = m112;
                        t8.a(i19, m112);
                        vaVar.L1 = false;
                        if (c20Var != null) {
                            c20Var.a(new q9(s9Var, i13));
                            break;
                        } else {
                            vaVar.J(1, true);
                            break;
                        }
                    } else {
                        vaVar.G1 = null;
                        if (vaVar.A0.l(m112)) {
                            fi.e7 a11 = fi.e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
                            vaVar.K1 = a11;
                            t8.a(i19, a11);
                            vaVar.L1 = false;
                            if (c20Var != null) {
                                c20Var.a(null);
                            }
                        } else if (c20Var != null) {
                            c20Var.a(null);
                        }
                        vaVar.l0(true);
                        break;
                    }
                }
                break;
            case 15:
                fi.ab abVar = (fi.ab) obj2;
                Float f11 = (Float) obj;
                abVar.i = f11.floatValue();
                za zaVar = ((fb) obj3).a;
                if (zaVar != null) {
                    zaVar.C(f11.floatValue(), abVar.a);
                    break;
                }
                break;
            case 16:
                hi.r0 r0Var = (hi.r0) obj3;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj2;
                int[] iArr = (int[]) obj;
                r0Var.getClass();
                boolean z10 = false;
                while (i15 < iArr.length) {
                    if (iArr[i15] == 0) {
                        z10 = true;
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
                nVar.a(Boolean.TRUE, Boolean.valueOf(z10));
                break;
            case 17:
                hi.r0 r0Var2 = (hi.r0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                r0Var2.getClass();
                boolean z11 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z11 = true;
                    }
                    i15++;
                }
                r0Var2.d = z11;
                r0Var2.e = z11;
                r0Var2.k();
                Iterator it2 = r0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 18:
                ((File[]) obj3)[0] = (File) obj;
                ((hi.a1) obj2).run();
                break;
            case 19:
                ((v2) obj3).d.D.G((String) obj2, (String) obj, false);
                break;
            case 20:
                ii.f fVar = (ii.f) obj3;
                fVar.getClass();
                fVar.b0(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 21:
                ii.f fVar2 = (ii.f) obj3;
                fVar2.getClass();
                fVar2.a0((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 22:
                ii.d0 d0Var = (ii.d0) obj3;
                d0Var.K0((TLRPC.Chat) obj2, d0Var.l1, ((Boolean) obj).booleanValue());
                break;
            case 23:
                View view = (View) obj3;
                kg.s sVar = (kg.s) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                org.telegram.messenger.g0.v1(sVar);
                org.telegram.messenger.g0.i3(runnable2, 80L);
                break;
            case 24:
                s1 s1Var = (s1) obj2;
                t1 f12 = t1.f(p10.s0);
                di diVar = ((kg.g0) obj3).b;
                long b12 = diVar.b1();
                int i21 = f12.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = qp.s1(i21).j1(b12);
                tL_messages_sendQuickReplyMessages.shortcut_id = s1Var.a;
                yr a02 = yr.a0(i21);
                a02.a.c(new d0(f12, a02, s1Var, tL_messages_sendQuickReplyMessages, 22));
                diVar.dismiss();
                break;
            case 25:
                kg.c1.b0((kg.c1) obj3, (View) obj2, (String) obj);
                break;
            case 26:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                li.t3 t3Var = ((li.p) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    t3Var.f3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    t3Var.V1(pageblockmath2);
                    break;
                }
            case 27:
                li.g1 g1Var = (li.g1) obj3;
                li.r rVar = (li.r) obj2;
                String str3 = (String) obj;
                g1Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    Editable text = g1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a10 = li.r.a(str3, g1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(iz.W0 + 4))) != null) {
                        boolean z12 = g1Var.g2;
                        if (z12) {
                            g1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, g1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, g1Var.length())), spannableString);
                        g1Var.setSelection(Math.min(max2 + 1, g1Var.length()));
                        if (z12) {
                            g1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 28:
                b2 b2Var = (b2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                b2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    b2Var.P.f3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    b2Var.P.V1(pageblockmath4);
                    break;
                }
            default:
                li.t3 t3Var2 = (li.t3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.equals(str5, pageblockmath5.source)) {
                    f2 f2Var = t3Var2.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    pageblockmath5.source = str5;
                    t3Var2.f3.O(false);
                    f2 f2Var2 = t3Var2.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    t3Var2.o3.onContentChanged();
                    break;
                }
                break;
        }
    }
}
