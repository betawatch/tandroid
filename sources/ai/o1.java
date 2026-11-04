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
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.fc;
import ci.s8;
import ci.v8;
import ei.r9;
import gi.ab;
import gi.f7;
import gi.fb;
import gi.o8;
import gi.q9;
import gi.s9;
import gi.sb;
import gi.t8;
import gi.tb;
import gi.ua;
import gi.va;
import gi.w8;
import gi.x9;
import gi.za;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i3;
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
                b3 b3Var = (b3) obj3;
                u10 u10Var = (u10) obj2;
                Boolean bool = (Boolean) obj;
                b3Var.getClass();
                if (u10Var != null) {
                    u10Var.a(bool);
                }
                if (bool.booleanValue()) {
                    b3Var.O0 = true;
                }
                b3Var.dismiss();
                break;
            case 1:
                z1 z1Var = (z1) obj2;
                if (((Object[]) obj)[1] == ((v8) obj3)) {
                    z1Var.run();
                    break;
                }
                break;
            case 2:
                vp0 vp0Var = (vp0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str = (String) obj;
                s8 s8Var = vp0Var.e;
                int i16 = tL_starGiftCollection.collection_id;
                s8Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i17 = s8Var.a;
                updatestargiftcollection.peer = hp.s1(i17).j1(s8Var.b);
                updatestargiftcollection.collection_id = i16;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str;
                ConnectionsManager.getInstance(i17).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str;
                vp0Var.f(true);
                break;
            case 3:
                d7 d7Var = (d7) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j10 = d7Var.S1;
                Runnable runnable = d7Var.Z1;
                if (runnable != null) {
                    runnable.run();
                }
                d7Var.dismiss();
                hs.f(h10.t0).k(hs.S2, new Object[0]);
                org.telegram.messenger.g0.i3(new s6(0, user), 250L);
                hp.s1(d7Var.R1).e7.edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 4:
                bi.a1 a1Var = (bi.a1) obj3;
                bi.x0 x0Var = (bi.x0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!x0Var.G && x0Var.e == null) {
                    a1Var.E0(x0Var, bitmap);
                    break;
                }
                break;
            case 5:
                ci.l6 l6Var = (ci.l6) obj3;
                xg.e1[] e1VarArr = (xg.e1[]) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() == -97) {
                    xg.e1 e1Var = e1VarArr[0];
                    TL_stars.TL_starGiftUnique H1 = l6Var.H1();
                    if (l6Var.Y2 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
                        long e10 = h10.i(l6Var.a).e();
                        TextView textView = new TextView(l6Var.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i18 = org.telegram.ui.ActionBar.k6.r5;
                        org.telegram.ui.ActionBar.r6.V(textView, i18, l6Var.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        Runnable[] runnableArr = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = hp.s1(l6Var.a).j1(e10);
                        depositstargift.slug = H1.slug;
                        ConnectionsManager.getInstance(l6Var.a).sendRequestTyped(depositstargift, new c3.b(i14), new ci.g3(l6Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                        String M0 = bd.M0(2131750115, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = bd.M0(2131750113, null);
                        TLRPC.User f10 = h10.i(l6Var.a).f();
                        LinearLayout linearLayout = new LinearLayout(l6Var.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(l6Var.getContext());
                        int L = org.telegram.messenger.g0.L(20.0f);
                        int i19 = org.telegram.ui.ActionBar.k6.j5;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.045f, org.telegram.ui.ActionBar.k6.w0(i19, l6Var.J0)));
                        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.045f, i19);
                        org.telegram.ui.ActionBar.e6 e6Var = l6Var.J0;
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, L2, null, e6Var);
                        k9 k9Var = new k9(l6Var.getContext());
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
                        u8Var.r(f10);
                        k9Var.e(f10, u8Var);
                        frameLayout.addView(k9Var, mf.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(l6Var.getContext());
                        k2.p1.t(textView2, 1, 16.0f);
                        org.telegram.ui.ActionBar.r6.V(textView2, i19, l6Var.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(org.telegram.messenger.i6.m(l10.p(f10), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, mf.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(l6Var.getContext());
                        textView3.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.r6.V(textView3, i18, l6Var.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f10 != null && !TextUtils.isEmpty(f10.phone)) {
                            textView3.setText(mf.b.c().b("+" + f10.phone));
                        } else if (f10 != null && l10.n(f10) != null) {
                            textView3.setText("@" + l10.n(f10));
                        }
                        frameLayout.addView(textView3, mf.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, mf.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(l6Var.getContext());
                        textView4.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.r6.V(textView4, i19, l6Var.J0);
                        org.telegram.messenger.k5.m(textView4, 17, null, 2131750116);
                        linearLayout.addView(textView4, mf.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(l6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        l6Var.l1(linearLayout2, R.drawable.msg_openprofile, 14, i18, bd.M0(2131748310, null), true);
                        l6Var.l1(linearLayout2, R.drawable.menu_gift, 14, i18, bd.M0(2131746684, null), false);
                        linearLayout.addView(linearLayout2, mf.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, mf.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.o(linearLayout);
                        s1Var.H = 20;
                        alertDialog$Builder.k(bd.M0(2131750117, null), new cg.d0(l6Var, e10, stargiftdepositpayloadArr, e1Var, 1));
                        alertDialog$Builder.h(bd.M0(2131752589, null), null);
                        s1Var.setOnDismissListener(new ci.h3(0, zArr, runnableArr));
                        s1Var.show();
                        break;
                    }
                } else if (l10.longValue() != -99 && l10.longValue() != -98) {
                    l6Var.X1(l10.longValue(), 0L, false, new ci.p2(l6Var, l10, e1VarArr, 1));
                    break;
                }
                break;
            case 6:
                ci.l6.f1((ci.l6) obj3, (org.telegram.ui.ActionBar.s1) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 7:
                ci.l6 l6Var2 = (ci.l6) obj3;
                String str2 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                ci.f6 f6Var = l6Var2.Y1;
                ii.j[] jVarArr = l6Var2.m2;
                gi.d dVar = l6Var2.d2;
                if (stargiftupgradepreview != null) {
                    f6Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    l6Var2.s2(1, false, null);
                    f6Var.i(1, bd.M0(2131750144, null), bd.a0(null, null, 2131750145, str2), null);
                    jVarArr[0].setText(bd.M0(2131749874, null));
                    jVarArr[1].setText(bd.M0(2131749871, null));
                    jVarArr[2].setText(bd.M0(2131749868, null));
                    l6Var2.o2.setVisibility(8);
                    l6Var2.n2.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.i(bd.M0(2131747839, null), false, true);
                    dVar.g(null, false);
                    dVar.setOnClickListener(new ci.r1(l6Var2, 9));
                    l6Var2.show();
                    break;
                }
                break;
            case 8:
                ci.h5 h5Var = (ci.h5) obj3;
                h5Var.getClass();
                ((ci.f5) obj2).a((TL_stars.StarGift) obj, true);
                h5Var.d(true);
                break;
            case 9:
                ci.n5 n5Var = (ci.n5) obj3;
                dg.b bVar = (dg.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                sf.b bVar2 = n5Var.n;
                if (bVar2 != null && bVar == n5Var.q) {
                    bVar2.c(false);
                }
                n5Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    n5Var.o.put(bVar, new ci.l5(bVar, tL_payments_paymentFormStarGift));
                    n5Var.a(true);
                    break;
                }
                break;
            case 10:
                ((n10) obj3).a((dg.a) obj, new ci.d1((ci.a1[]) obj2, 12));
                break;
            case 11:
                ei.j4 j4Var = (ei.j4) obj3;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                j4Var.u3 = e3Var;
                vg.i0.w1(new c7(j4Var, i13), (TL_stories.TL_premium_boostsStatus) obj2, e3Var, j4Var.l1, true);
                r9 r9Var = j4Var.t0;
                if (r9Var != null) {
                    r9Var.l1 = false;
                    r9Var.d0();
                    break;
                }
                break;
            case 12:
                fc fcVar = (fc) obj3;
                sb sbVar = (sb) obj;
                fcVar.getClass();
                gi.f2 f2Var = ((gi.f2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sbVar == null ? "🌤" : sbVar.c);
                sb2.append(" ");
                sb2.append(sbVar == null ? tb.a() ? "24°C" : "72°F" : sbVar.a());
                CharSequence m10 = org.telegram.messenger.i6.m(sb2.toString(), ((TextPaint) fcVar.c).getFontMetricsInt(), false, null, 0);
                fc fcVar2 = f2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m10, (TextPaint) fcVar2.c, org.telegram.messenger.g0.q.x * 0.8f, TextUtils.TruncateAt.END), (TextPaint) fcVar2.c, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                f2Var.k = staticLayout;
                f2Var.l = staticLayout.getLineCount() > 0 ? f2Var.k.getLineWidth(0) : 0.0f;
                f2Var.m = f2Var.k.getLineCount() > 0 ? f2Var.k.getLineLeft(0) : 0.0f;
                f2Var.b = org.telegram.messenger.g0.N(17.6f) + f2Var.l;
                f2Var.c = org.telegram.messenger.g0.N(36.0f);
                fcVar.invalidate();
                fcVar.requestLayout();
                break;
            case 13:
                x9 x9Var = (x9) obj3;
                ua uaVar = (ua) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - uaVar.getBottomPadding2(), x9Var.d2 - uaVar.getPaddingUnderContainer()));
                x9Var.R();
                if (max > 0) {
                    ug.j jVar = x9Var.t0;
                    if ((jVar instanceof ug.l2) && ((ug.l2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = x9Var.x1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        x9Var.x1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        ug.l1 l1Var = x9Var.N0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(l1Var, (Property<ug.l1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x9Var.D0, (Property<gi.i5, Float>) property, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                        gi.y4 y4Var = x9Var.G0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(y4Var, (Property<gi.y4, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x9Var.l0, (Property<ug.y0, Float>) property2, (z10 || x9Var.l1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x9Var.k0, (Property<ug.u0, Float>) property2, (z10 || x9Var.l1) ? 1.0f : 0.0f));
                        x9Var.Q0();
                        x9Var.x1.playTogether(arrayList);
                        if (z10) {
                            x9Var.x1.setDuration(350L);
                            x9Var.x1.setInterpolator(xq.h);
                        } else {
                            x9Var.x1.setDuration(250L);
                            x9Var.x1.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                        }
                        x9Var.x1.start();
                        for (i3 = 0; i3 < arrayList.size(); i3++) {
                            ((Animator) arrayList.get(i3)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i3)).setInterpolator(z10 ? xq.h : org.telegram.ui.ActionBar.h1.w);
                            ((Animator) arrayList.get(i3)).start();
                        }
                        if (!z10) {
                            x9Var.M0(false);
                        }
                        if (x9Var.R1 != z10) {
                            x9Var.d0();
                        }
                        x9Var.R1 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = x9Var.x1;
                if (animatorSet != null) {
                }
                x9Var.x1 = new AnimatorSet();
                arrayList = new ArrayList();
                ug.l1 l1Var2 = x9Var.N0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(l1Var2, (Property<ug.l1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(x9Var.D0, (Property<gi.i5, Float>) property3, max <= 0 ? Math.min(0, org.telegram.messenger.g0.L(40.0f) + (-max)) : 0));
                gi.y4 y4Var2 = x9Var.G0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(y4Var2, (Property<gi.y4, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(x9Var.l0, (Property<ug.y0, Float>) property22, (z10 || x9Var.l1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(x9Var.k0, (Property<ug.u0, Float>) property22, (z10 || x9Var.l1) ? 1.0f : 0.0f));
                x9Var.Q0();
                x9Var.x1.playTogether(arrayList);
                if (z10) {
                }
                x9Var.x1.start();
                while (i3 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (x9Var.R1 != z10) {
                }
                x9Var.R1 = z10;
                break;
            case 14:
                gi.m5 m5Var = (gi.m5) obj3;
                gi.a5 a5Var = (gi.a5) obj2;
                sb sbVar2 = (sb) obj;
                if (sbVar2 != null) {
                    a5Var.dismiss();
                    m5Var.w0(false);
                    m5Var.b0(m5Var.m0(sbVar2));
                    break;
                }
                break;
            case 15:
                gi.m5 m5Var2 = (gi.m5) obj3;
                ug.j0 j0Var = (ug.j0) obj2;
                ug.g0 g0Var = (ug.g0) obj;
                if (j0Var != null) {
                    int i20 = m5Var2.p1;
                    j0Var.v0 = g0Var;
                    j0Var.r0.b(i20, g0Var, false);
                    j0Var.m();
                    m5Var2.b0(j0Var);
                    break;
                } else {
                    m5Var2.b0(m5Var2.f0(g0Var));
                    break;
                }
            case 16:
                o8 o8Var = (o8) obj3;
                ((f60) obj2).u();
                o8Var.h(true);
                t8 t8Var = o8Var.a0;
                w8 w8Var = t8Var.P1;
                if (w8Var != null) {
                    w8Var.a(new HashSet(t8Var.s1));
                    break;
                }
                break;
            case 17:
                o8 o8Var2 = (o8) obj3;
                o8Var2.a0.y1 = true;
                ((tq[]) obj2)[0].dismiss();
                o8Var2.h(true);
                break;
            case 18:
                s9 s9Var = (s9) obj3;
                u10 u10Var2 = (u10) obj2;
                Integer num = (Integer) obj;
                va vaVar = s9Var.a;
                boolean p02 = vaVar.p0();
                int i21 = vaVar.c;
                if (p02) {
                    try {
                        vaVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                vaVar.Q1 = false;
                gi.c6 c6Var = vaVar.D0;
                if (c6Var != null) {
                    c6Var.c(false);
                }
                if (vaVar.H1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(vaVar.H1.getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused2) {
                            i11 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            f7 m11 = f7.m(vaVar.H1, r13);
                            m11.J0 = vaVar.w0;
                            m11.K0 = vaVar.x0;
                            if (vaVar.B0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i10 = -1;
                    }
                    int i22 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i10 > i11) {
                            i22 = hs.t4;
                        }
                    } else if (i11 > i10 && i22 != 0) {
                        i22 = 0;
                    }
                    f7 m112 = f7.m(vaVar.H1, i22);
                    m112.J0 = vaVar.w0;
                    m112.K0 = vaVar.x0;
                    if (vaVar.B0.j()) {
                        vaVar.L1 = m112;
                        gi.u8.a(i21, m112);
                        vaVar.M1 = false;
                        if (u10Var2 != null) {
                            u10Var2.a(new q9(s9Var, i13));
                            break;
                        } else {
                            vaVar.J(1, true);
                            break;
                        }
                    } else {
                        vaVar.H1 = null;
                        if (vaVar.B0.l(m112)) {
                            f7 a10 = f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
                            vaVar.L1 = a10;
                            gi.u8.a(i21, a10);
                            vaVar.M1 = false;
                            if (u10Var2 != null) {
                                u10Var2.a(null);
                            }
                        } else if (u10Var2 != null) {
                            u10Var2.a(null);
                        }
                        vaVar.l0(true);
                        break;
                    }
                }
                break;
            case 19:
                ab abVar = (ab) obj2;
                Float f11 = (Float) obj;
                abVar.i = f11.floatValue();
                za zaVar = ((fb) obj3).a;
                if (zaVar != null) {
                    zaVar.H(f11.floatValue(), abVar.a);
                    break;
                }
                break;
            case 20:
                ii.s0 s0Var = (ii.s0) obj3;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) obj2;
                int[] iArr = (int[]) obj;
                s0Var.getClass();
                boolean z11 = false;
                while (i15 < iArr.length) {
                    if (iArr[i15] == 0) {
                        z11 = true;
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
                pVar.a(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 21:
                ii.s0 s0Var2 = (ii.s0) obj3;
                Runnable runnable2 = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                s0Var2.getClass();
                boolean z12 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z12 = true;
                    }
                    i15++;
                }
                s0Var2.d = z12;
                s0Var2.e = z12;
                s0Var2.k();
                Iterator it2 = s0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 22:
                ((File[]) obj3)[0] = (File) obj;
                ((ii.b1) obj2).run();
                break;
            case 23:
                ((ii.v2) obj3).d.E.F((String) obj2, (String) obj, false);
                break;
            case 24:
                ji.e eVar = (ji.e) obj3;
                eVar.getClass();
                eVar.b0(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 25:
                ji.e eVar2 = (ji.e) obj3;
                eVar2.getClass();
                eVar2.a0((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 26:
                ji.b0 b0Var = (ji.b0) obj3;
                b0Var.K0((TLRPC.Chat) obj2, b0Var.m1, ((Boolean) obj).booleanValue());
                break;
            case 27:
                View view = (View) obj3;
                lg.s sVar = (lg.s) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                org.telegram.messenger.g0.v1(sVar);
                org.telegram.messenger.g0.i3(runnable3, 80L);
                break;
            case 28:
                lg.t1 t1Var = (lg.t1) obj2;
                lg.u1 f12 = lg.u1.f(h10.t0);
                bi biVar = ((lg.h0) obj3).b;
                long b12 = biVar.b1();
                int i23 = f12.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = hp.s1(i23).j1(b12);
                tL_messages_sendQuickReplyMessages.shortcut_id = t1Var.a;
                qr a02 = qr.a0(i23);
                a02.a.c(new z3(f12, a02, t1Var, tL_messages_sendQuickReplyMessages, 23));
                biVar.dismiss();
                break;
            default:
                lg.d1.b0((lg.d1) obj3, (View) obj2, (String) obj);
                break;
        }
    }
}
