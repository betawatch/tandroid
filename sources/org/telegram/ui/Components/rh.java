package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rh implements org.telegram.ui.web.f0 {
    public ValueAnimator a;
    public final /* synthetic */ sh.n3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ mi e;

    public rh(mi miVar, sh.n3 n3Var, String str, long j10) {
        this.e = miVar;
        this.b = n3Var;
        this.c = str;
        this.d = j10;
    }

    @Override // org.telegram.ui.web.f0
    public final void b() {
        y();
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ String g(boolean z4, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.f0
    public final boolean h() {
        mi miVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(miVar.G1);
        long j10 = this.d;
        return mediaDataController.botInAttachMenu(j10) || MessagesController.getInstance(miVar.G1).whitelistedBots.contains(Long.valueOf(j10));
    }

    @Override // org.telegram.ui.web.f0
    public final void i(boolean z4) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.U0.getBackButton(), z4 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.f0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.f0
    public final void k(boolean z4) {
        this.b.setNeedCloseConfirmation(z4);
    }

    @Override // org.telegram.ui.web.f0
    public final void m(int i10) {
        this.b.setCustomBackground(i10);
    }

    @Override // org.telegram.ui.web.f0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.g6 g6Var;
        mi miVar = this.e;
        int i10 = miVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        boolean z4 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        sh.n3 n3Var = this.b;
        org.telegram.ui.lo0 lo0Var = null;
        if (z4) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(miVar.getContext(), 3, null);
            d2Var.q(150L);
            mh.t7.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(d2Var, 1), new lh.a1(29, n3Var, str));
            AndroidUtilities.hideKeyboard(n3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            lo0Var = new org.telegram.ui.lo0(paymentForm, null, str, p2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            lo0Var = new org.telegram.ui.lo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (lo0Var != null) {
            n3Var.F();
            AndroidUtilities.hideKeyboard(n3Var);
            Activity parentActivity = p2Var.getParentActivity();
            int i11 = mi.L2;
            dd0 dd0Var = new dd0(parentActivity);
            dd0Var.show();
            lo0Var.W0 = new androidx.car.app.utils.a(dd0Var, n3Var, str, 19);
            g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
            lo0Var.V0 = g6Var;
            dd0Var.c(lo0Var);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
        mi miVar = this.e;
        RadialProgressView radialProgressView = miVar.z1;
        k6 k6Var = miVar.B1;
        ei eiVar = miVar.v0;
        sh.n3 n3Var = this.b;
        if (eiVar == n3Var) {
            if (n3Var.M || this.c != null) {
                k6Var.setClickable(z10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new u5(j10, 1.4f, k6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    k6Var.setText(spannableStringBuilder);
                } else {
                    k6Var.setText(str);
                }
                k6Var.setTextColor(i11);
                k6Var.setEmojiColor(i11);
                boolean z13 = org.telegram.ui.web.a1.J0;
                k6Var.setBackground(org.telegram.ui.ActionBar.k6.g0(i10, i0.a.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (miVar.A1 != z4) {
                    miVar.A1 = z4;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new f6(this, 9));
                    this.a.addListener(new ih(this, z4, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (miVar.y1 != z11) {
                    radialProgressView.animate().cancel();
                    if (z11) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).setDuration(250L).setListener(new ih(this, z11, 1)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void s() {
        ei eiVar = this.e.v0;
        sh.n3 n3Var = this.b;
        if (eiVar == n3Var && !n3Var.G.c) {
            n3Var.F();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void t(boolean z4) {
        org.telegram.ui.ActionBar.g1 g1Var = this.b.I;
        if (g1Var != null) {
            g1Var.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void u(int i10, final int i11, boolean z4) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        mi miVar = this.e;
        final int color = miVar.C2.a.getColor();
        final sh.o1 o1Var = new sh.o1();
        int i12 = miVar.X ? color : 0;
        g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        o1Var.c(o1Var.a, i12, g6Var);
        miVar.X = z4;
        int i13 = z4 ? i11 : 0;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        o1Var.c(o1Var.b, i13, g6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(pr.f);
        final sh.n3 n3Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                mi miVar2 = rh.this.e;
                miVar2.k2 = d;
                miVar2.j2 = true;
                fg.k1 k1Var = miVar2.U0;
                if (k1Var != null) {
                    k1Var.e();
                    k1Var.invalidate();
                }
                miVar2.C2.a(d);
                xg.f fVar = miVar2.s1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                n3Var.setCustomActionBarBackground(d);
                miVar2.v0.invalidate();
                miVar2.o1.invalidate();
                o1Var.b(k1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.f0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        mi miVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
            if (p2Var instanceof org.telegram.ui.xn) {
                ((org.telegram.ui.xn) p2Var).V.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            miVar.dismiss(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        org.telegram.ui.py pyVar = new org.telegram.ui.py(bundle);
        Context context = miVar.getContext();
        int i10 = mi.L2;
        dd0 dd0Var = new dd0(context);
        pyVar.z2 = new a1.d(this, user, str, dd0Var, 8);
        dd0Var.show();
        dd0Var.c(pyVar);
    }

    @Override // org.telegram.ui.web.f0
    public final void x(boolean z4) {
        this.b.setAllowSwipes(z4);
    }

    @Override // org.telegram.ui.web.f0
    public final void y() {
        mi miVar = this.e;
        if (miVar.v0 != this.b) {
            return;
        }
        miVar.setFocusable(false);
        miVar.getWindow().setSoftInputMode(48);
        miVar.dismiss();
        AndroidUtilities.runOnUIThread(new jc(5), 150L);
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ sh.u0 z() {
        return null;
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void p(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void w(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void o(int i10, boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
    }
}
