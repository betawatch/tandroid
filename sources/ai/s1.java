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
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.a5;
import bi.e9;
import bi.f9;
import bi.p3;
import bi.v8;
import c8.na;
import di.b5;
import di.f5;
import di.f6;
import di.h5;
import di.n8;
import di.p8;
import di.z4;
import di.z5;
import fi.z3;
import hi.i5;
import hi.ia;
import hi.j5;
import hi.k9;
import hi.ka;
import hi.kc;
import hi.l9;
import hi.lc;
import hi.mb;
import hi.n9;
import hi.nb;
import hi.pa;
import hi.r5;
import hi.rb;
import hi.sb;
import hi.v5;
import hi.x7;
import hi.xb;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Serializable, java.lang.Object, java.lang.Runnable[]] */
    @Override // org.telegram.messenger.w10
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
                final u1 u1Var = (u1) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                w1 w1Var = u1Var.b;
                if (!w1Var.h && !w1Var.g) {
                    int i16 = w1Var.v;
                    int[] iArr = w1.F;
                    final boolean z11 = i16 >= 0 && i16 < 4 && num.intValue() >= iArr[w1Var.v];
                    final boolean z12 = num.intValue() >= iArr[0] && num.intValue() - w1Var.y < 100 && num.intValue() - w1Var.z >= 100;
                    w1Var.y = num.intValue();
                    if (!z11 && !z12) {
                        w1Var.r = false;
                        break;
                    } else {
                        DictationLid.h(0, new z0() { // from class: ai.t1
                            @Override // ai.z0
                            public final void a(float[] fArr, long j3, int i17) {
                                android.support.v4.media.session.a0 Y;
                                w1 w1Var2 = u1.this.b;
                                w1Var2.r = false;
                                if (fArr == null) {
                                    return;
                                }
                                w1Var2.z = i17;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 4) {
                                        i18 = 4;
                                        break;
                                    } else if (w1.F[i18] > i17) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                w1Var2.v = i18;
                                p5.c.t(new StringBuilder("tinyasr: tinylid "), (!z12 || z11) ? "at a step" : "after a pause", "Dictation");
                                if (w1Var2.h || w1Var2.g) {
                                    return;
                                }
                                a1 k10 = DictationLid.k(DictationLid.g(i17), fArr);
                                Log.d("Dictation", "tinyasr: tinylid " + i17 + " ms speech in " + j3 + " ms: " + k10 + " (route " + w1Var2.l + ")");
                                if (k10 != null) {
                                    String str = k10.a;
                                    if (k10.c && (Y = DictationAsr.Y(str, w1Var2.l, false)) != null) {
                                        q qVar = (q) Y.b;
                                        android.support.v4.media.session.a0 a0Var = w1Var2.l;
                                        if (qVar == ((q) a0Var.b) && ((String) Y.c).equals((String) a0Var.c)) {
                                            w1Var2.s = true;
                                            DictationLid.i(str);
                                            w1Var2.k(str);
                                        } else if (!w1Var2.s || k10.b >= 0.8f) {
                                            w1Var2.s = true;
                                            DictationLid.i(str);
                                            w1Var2.k(str);
                                            Log.d("Dictation", "tinyasr: switching to " + Y);
                                            w1Var2.i(Y);
                                        }
                                    }
                                }
                            }
                        }, w1Var.a(), bArr);
                        break;
                    }
                } else {
                    w1Var.r = false;
                    break;
                }
                break;
            case 1:
                p3 p3Var = (p3) obj3;
                w10 w10Var = (w10) obj2;
                Boolean bool = (Boolean) obj;
                p3Var.getClass();
                if (w10Var != null) {
                    w10Var.a(bool);
                }
                if (bool.booleanValue()) {
                    p3Var.O0 = true;
                }
                p3Var.dismiss();
                break;
            case 2:
                bi.q2 q2Var = (bi.q2) obj2;
                if (((Object[]) obj)[1] == ((p8) obj3)) {
                    q2Var.run();
                    break;
                }
                break;
            case 3:
                a5.s((TL_stars.TL_starGiftUnique) obj3, gd.a0(null, null, ((Boolean) obj).booleanValue() ? 2131749509 : 2131749619, (String) obj2));
                break;
            case 4:
                fq0 fq0Var = (fq0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str = (String) obj;
                n8 n8Var = fq0Var.e;
                int i17 = tL_starGiftCollection.collection_id;
                n8Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i18 = n8Var.a;
                updatestargiftcollection.peer = mp.u1(i18).l1(n8Var.b);
                updatestargiftcollection.collection_id = i17;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str;
                ConnectionsManager.getInstance(i18).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str;
                fq0Var.f(true);
                break;
            case 5:
                f9 f9Var = (f9) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j3 = f9Var.V1;
                Runnable runnable = f9Var.c2;
                if (runnable != null) {
                    runnable.run();
                }
                f9Var.dismiss();
                ks.f(i10.t0).k(ks.U2, new Object[0]);
                org.telegram.messenger.g0.h3(new v8(0, user), 250L);
                mp.u1(f9Var.U1).h7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
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
                    k1Var.C1.h(booleanValue);
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
                    z5Var.i(1, gd.N0(2131750119, null), gd.a0(null, null, 2131750120, str2), null);
                    iVarArr[0].setText(gd.N0(2131749849, null));
                    iVarArr[1].setText(gd.N0(2131749846, null));
                    iVarArr[2].setText(gd.N0(2131749843, null));
                    f6Var.r2.setVisibility(8);
                    f6Var.q2.setVisibility(8);
                    eVar.setFilled(true);
                    eVar.i(gd.N0(2131747637, null), false, true);
                    eVar.g(null, false);
                    eVar.setOnClickListener(new di.i1(f6Var, 17));
                    f6Var.show();
                    break;
                }
                break;
            case 10:
                f6 f6Var2 = (f6) obj3;
                bi.f2[] f2VarArr = (bi.f2[]) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() == -97) {
                    bi.f2 f2Var = f2VarArr[0];
                    TL_stars.TL_starGiftUnique M1 = f6Var2.M1();
                    if (f6Var2.M2() != null && M1 != null && !TextUtils.isEmpty(M1.slug)) {
                        long e10 = i10.i(f6Var2.a).e();
                        TextView textView = new TextView(f6Var2.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i19 = n6.r5;
                        u6.U(textView, i19, f6Var2.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new o80(org.telegram.messenger.g0.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
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
                        String N0 = gd.N0(2131750090, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = gd.N0(2131750088, null);
                        TLRPC.User f10 = i10.i(f6Var2.a).f();
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
                        p9 p9Var = new p9(f6Var2.getContext());
                        p9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                        a9 a9Var = new a9((i6) null);
                        a9Var.r(f10);
                        p9Var.f(f10, a9Var);
                        frameLayout.addView(p9Var, na.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(f6Var2.getContext());
                        i5.c.x(textView2, 1, 16.0f);
                        u6.U(textView2, i20, f6Var2.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(j6.m(n10.q(f10), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, na.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(f6Var2.getContext());
                        textView3.setTextSize(1, 14.0f);
                        u6.U(textView3, i19, f6Var2.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f10 != null && !TextUtils.isEmpty(f10.phone)) {
                            textView3.setText(pf.b.c().b("+" + f10.phone));
                        } else if (f10 != null && n10.o(f10) != null) {
                            textView3.setText("@" + n10.o(f10));
                        }
                        frameLayout.addView(textView3, na.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, na.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(f6Var2.getContext());
                        textView4.setTextSize(1, 15.0f);
                        u6.U(textView4, i20, f6Var2.J0);
                        f3.k(textView4, 17, null, 2131750091);
                        linearLayout.addView(textView4, na.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(f6Var2.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        f6Var2.n1(linearLayout2, R.drawable.msg_openprofile, 14, i19, gd.N0(2131748109, null), true);
                        f6Var2.n1(linearLayout2, R.drawable.menu_gift, 14, i19, gd.N0(2131746480, null), false);
                        linearLayout.addView(linearLayout2, na.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, na.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.o(linearLayout);
                        t1Var.H = 20;
                        alertDialog$Builder.k(gd.N0(2131750092, null), new di.t1(f6Var2, e10, stargiftdepositpayloadArr, jArr, f2Var));
                        alertDialog$Builder.h(gd.N0(2131752577, null), null);
                        t1Var.setOnDismissListener(new di.u1(0, zArr, (Object) r82));
                        t1Var.show();
                        break;
                    }
                } else if (l10.longValue() != -99 && l10.longValue() != -98) {
                    long longValue = l10.longValue();
                    bi.f2 f2Var2 = f2VarArr[0];
                    TL_stars.TL_starGiftUnique M12 = f6Var2.M1();
                    if (f6Var2.M2() != null && M12 != null && !TextUtils.isEmpty(M12.slug)) {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, f6Var2.getContext(), f6Var2.J0);
                        t1Var2.r(300L);
                        TL_stars.depositStarGift depositstargift2 = new TL_stars.depositStarGift();
                        depositstargift2.peer = mp.u1(f6Var2.a).l1(longValue);
                        depositstargift2.slug = M12.slug;
                        ConnectionsManager.getInstance(f6Var2.a).sendRequestTyped(depositstargift2, new d3.b(1), new a(f6Var2, t1Var2, f2Var2, longValue));
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
                ((p10) obj3).a((cg.a) obj, new ca.r((di.u0[]) obj2, 26));
                break;
            case 14:
                z3 z3Var = (z3) obj3;
                g3 g3Var = (g3) obj;
                z3Var.u3 = g3Var;
                ug.k0.x1(new e9(z3Var, i13), (TL_stories.TL_premium_boostsStatus) obj2, g3Var, z3Var.l1, true);
                fi.f9 f9Var2 = z3Var.t0;
                if (f9Var2 != null) {
                    f9Var2.k1 = false;
                    f9Var2.V();
                    break;
                }
                break;
            case 15:
                hi.a0 a0Var = (hi.a0) obj3;
                tg.d dVar = (tg.d) obj2;
                Boolean bool3 = (Boolean) obj;
                a0Var.a.w(bool3.booleanValue());
                a0Var.f(bool3.booleanValue() ? dVar : null);
                break;
            case 16:
                hi.p2 p2Var = (hi.p2) obj3;
                kc kcVar = (kc) obj;
                p2Var.getClass();
                hi.n2 n2Var = ((hi.n2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(kcVar == null ? "🌤" : kcVar.c);
                sb2.append(" ");
                sb2.append(kcVar == null ? lc.a() ? "24°C" : "72°F" : kcVar.a());
                CharSequence m10 = j6.m(sb2.toString(), p2Var.b.getFontMetricsInt(), false, null, 0);
                hi.p2 p2Var2 = n2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m10, p2Var2.b, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), p2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                n2Var.k = staticLayout;
                n2Var.l = staticLayout.getLineCount() > 0 ? n2Var.k.getLineWidth(0) : 0.0f;
                n2Var.m = n2Var.k.getLineCount() > 0 ? n2Var.k.getLineLeft(0) : 0.0f;
                n2Var.b = org.telegram.messenger.g0.N(17.6f) + n2Var.l;
                n2Var.c = org.telegram.messenger.g0.N(36.0f);
                p2Var.invalidate();
                p2Var.requestLayout();
                break;
            case 17:
                pa paVar = (pa) obj3;
                mb mbVar = (mb) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - mbVar.getBottomPadding2(), paVar.h2 - mbVar.getPaddingUnderContainer()));
                paVar.R();
                if (max > 0) {
                    tg.n nVar = paVar.t0;
                    if ((nVar instanceof tg.q2) && ((tg.q2) nVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = paVar.x1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        paVar.x1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        tg.r1 r1Var = paVar.N0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(r1Var, (Property<tg.r1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(paVar.D0, (Property<r5, Float>) property, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                        i5 i5Var = paVar.G0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<i5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(paVar.l0, (Property<tg.e1, Float>) property2, (z10 || paVar.l1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(paVar.k0, (Property<tg.a1, Float>) property2, (z10 || paVar.l1) ? 1.0f : 0.0f));
                        paVar.T0();
                        paVar.x1.playTogether(arrayList);
                        if (z10) {
                            paVar.x1.setDuration(350L);
                            paVar.x1.setInterpolator(kr.h);
                        } else {
                            paVar.x1.setDuration(250L);
                            paVar.x1.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        }
                        paVar.x1.start();
                        for (i7 = 0; i7 < arrayList.size(); i7++) {
                            ((Animator) arrayList.get(i7)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i7)).setInterpolator(z10 ? kr.h : org.telegram.ui.ActionBar.i1.w);
                            ((Animator) arrayList.get(i7)).start();
                        }
                        if (!z10) {
                            paVar.P0(false);
                        }
                        if (paVar.R1 != z10) {
                            paVar.e0();
                        }
                        paVar.R1 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = paVar.x1;
                if (animatorSet != null) {
                }
                paVar.x1 = new AnimatorSet();
                arrayList = new ArrayList();
                tg.r1 r1Var2 = paVar.N0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(r1Var2, (Property<tg.r1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(paVar.D0, (Property<r5, Float>) property3, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                i5 i5Var2 = paVar.G0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(i5Var2, (Property<i5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(paVar.l0, (Property<tg.e1, Float>) property22, (z10 || paVar.l1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(paVar.k0, (Property<tg.a1, Float>) property22, (z10 || paVar.l1) ? 1.0f : 0.0f));
                paVar.T0();
                paVar.x1.playTogether(arrayList);
                if (z10) {
                }
                paVar.x1.start();
                while (i7 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (paVar.R1 != z10) {
                }
                paVar.R1 = z10;
                break;
            case 18:
                v5 v5Var = (v5) obj3;
                j5 j5Var = (j5) obj2;
                kc kcVar2 = (kc) obj;
                if (kcVar2 != null) {
                    j5Var.dismiss();
                    v5Var.y0(false);
                    v5Var.c0(v5Var.o0(kcVar2));
                    break;
                }
                break;
            case 19:
                v5 v5Var2 = (v5) obj3;
                tg.p0 p0Var = (tg.p0) obj2;
                tg.m0 m0Var = (tg.m0) obj;
                if (p0Var != null) {
                    int i21 = v5Var2.p1;
                    p0Var.w0 = m0Var;
                    p0Var.s0.b(i21, m0Var, false);
                    p0Var.m();
                    v5Var2.c0(p0Var);
                    break;
                } else {
                    v5Var2.c0(v5Var2.h0(m0Var));
                    break;
                }
            case 20:
                hi.f9 f9Var3 = (hi.f9) obj3;
                ((x60) obj2).v();
                f9Var3.h(true);
                k9 k9Var = f9Var3.a0;
                n9 n9Var = k9Var.S1;
                if (n9Var != null) {
                    n9Var.a(new HashSet(k9Var.v1));
                    break;
                }
                break;
            case 21:
                hi.f9 f9Var4 = (hi.f9) obj3;
                f9Var4.a0.B1 = true;
                ((gr[]) obj2)[0].dismiss();
                f9Var4.h(true);
                break;
            case 22:
                ka kaVar = (ka) obj3;
                w10 w10Var2 = (w10) obj2;
                Integer num2 = (Integer) obj;
                nb nbVar = kaVar.a;
                boolean p02 = nbVar.p0();
                int i22 = nbVar.c;
                if (p02) {
                    try {
                        nbVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                nbVar.Q1 = false;
                hi.j6 j6Var = nbVar.D0;
                if (j6Var != null) {
                    j6Var.c(false);
                }
                if (nbVar.H1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(nbVar.H1.getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused2) {
                            i11 = -1;
                            if (num2.intValue() != -1) {
                            }
                            if (num2.intValue() != -1) {
                            }
                            x7 m11 = x7.m(nbVar.H1, r7);
                            m11.J0 = nbVar.w0;
                            m11.K0 = nbVar.x0;
                            if (nbVar.B0.j()) {
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
                    x7 m112 = x7.m(nbVar.H1, i23);
                    m112.J0 = nbVar.w0;
                    m112.K0 = nbVar.x0;
                    if (nbVar.B0.j()) {
                        nbVar.L1 = m112;
                        l9.a(i22, m112);
                        nbVar.M1 = false;
                        if (w10Var2 != null) {
                            w10Var2.a(new ia(kaVar, i13));
                            break;
                        } else {
                            nbVar.J(1, true);
                            break;
                        }
                    } else {
                        nbVar.H1 = null;
                        if (nbVar.B0.l(m112)) {
                            x7 a10 = x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
                            nbVar.L1 = a10;
                            l9.a(i22, a10);
                            nbVar.M1 = false;
                            if (w10Var2 != null) {
                                w10Var2.a(null);
                            }
                        } else if (w10Var2 != null) {
                            w10Var2.a(null);
                        }
                        nbVar.l0(true);
                        break;
                    }
                }
                break;
            case 23:
                sb sbVar = (sb) obj2;
                Float f11 = (Float) obj;
                sbVar.i = f11.floatValue();
                rb rbVar = ((xb) obj3).a;
                if (rbVar != null) {
                    rbVar.H(f11.floatValue(), sbVar.a);
                    break;
                }
                break;
            case 24:
                View view = (View) obj3;
                kg.s sVar = (kg.s) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                org.telegram.messenger.g0.v1(sVar);
                org.telegram.messenger.g0.h3(runnable2, 80L);
                break;
            case 25:
                kg.v1 v1Var = (kg.v1) obj2;
                kg.w1 f12 = kg.w1.f(i10.t0);
                ti tiVar = ((kg.h0) obj3).b;
                long c12 = tiVar.c1();
                int i24 = f12.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = mp.u1(i24).l1(c12);
                tL_messages_sendQuickReplyMessages.shortcut_id = v1Var.a;
                tr a02 = tr.a0(i24);
                a02.a.c(new j(f12, a02, v1Var, tL_messages_sendQuickReplyMessages, 23));
                tiVar.dismiss();
                break;
            case 26:
                kg.e1.b0((kg.e1) obj3, (View) obj2, (String) obj);
                break;
            case 27:
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
            case 28:
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
            default:
                ((File[]) obj3)[0] = (File) obj;
                ((ki.y0) obj2).run();
                break;
        }
    }
}
