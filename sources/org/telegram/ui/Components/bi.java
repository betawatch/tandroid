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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class bi implements org.telegram.ui.web.h0 {
    public ValueAnimator a;
    public final /* synthetic */ ei.q4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ vi e;

    public bi(vi viVar, ei.q4 q4Var, String str, long j3) {
        this.e = viVar;
        this.b = q4Var;
        this.c = str;
        this.d = j3;
    }

    @Override // org.telegram.ui.web.h0
    public final void b() {
        y();
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.h0
    public final boolean h() {
        vi viVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(viVar.J1);
        long j3 = this.d;
        return mediaDataController.botInAttachMenu(j3) || MessagesController.getInstance(viVar.J1).whitelistedBots.contains(Long.valueOf(j3));
    }

    @Override // org.telegram.ui.web.h0
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.X0.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.h0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.h0
    public final void k(boolean z10) {
        this.b.setNeedCloseConfirmation(z10);
    }

    @Override // org.telegram.ui.web.h0
    public final void m(int i10) {
        this.b.setCustomBackground(i10);
    }

    @Override // org.telegram.ui.web.h0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.e6 e6Var;
        vi viVar = this.e;
        int i10 = viVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.q4 q4Var = this.b;
        org.telegram.ui.xo0 xo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(viVar.getContext(), 3, null);
            b2Var.q(150L);
            yh.t5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new b2(b2Var, 1), new org.telegram.ui.of(12, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            xo0Var = new org.telegram.ui.xo0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            xo0Var = new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (xo0Var != null) {
            q4Var.G();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = vi.O2;
            jd0 jd0Var = new jd0(parentActivity);
            jd0Var.show();
            xo0Var.Z0 = new ai.r5(jd0Var, q4Var, str, 24);
            e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
            xo0Var.Y0 = e6Var;
            jd0Var.c(xo0Var);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        vi viVar = this.e;
        RadialProgressView radialProgressView = viVar.C1;
        p6 p6Var = viVar.E1;
        ni niVar = viVar.y0;
        ei.q4 q4Var = this.b;
        if (niVar == q4Var) {
            if (q4Var.P || this.c != null) {
                p6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new z5(j3, 1.4f, p6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    p6Var.setText(spannableStringBuilder);
                } else {
                    p6Var.setText(str);
                }
                p6Var.setTextColor(i11);
                p6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.d1.P0;
                p6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(i10, i0.a.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (viVar.D1 != z10) {
                    viVar.D1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new k6(this, 9));
                    this.a.addListener(new th(this, z10, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (viVar.B1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new th(this, z12, 1)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void s() {
        ni niVar = this.e.y0;
        ei.q4 q4Var = this.b;
        if (niVar == q4Var && !q4Var.J.c) {
            q4Var.G();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = this.b.L;
        if (f1Var != null) {
            f1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void u(int i10, final int i11, boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        vi viVar = this.e;
        final int color = viVar.F2.a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i12 = viVar.a0 ? color : 0;
        e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.a, i12, e6Var);
        viVar.a0 = z10;
        int i13 = z10 ? i11 : 0;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.b, i13, e6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(qr.f);
        final ei.q4 q4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                vi viVar2 = bi.this.e;
                viVar2.n2 = d;
                viVar2.m2 = true;
                y7 y7Var = viVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                viVar2.F2.a(d);
                jh.f fVar = viVar2.v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                viVar2.y0.invalidate();
                viVar2.r1.invalidate();
                c2Var.b(y7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.h0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        vi viVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
            if (n2Var instanceof org.telegram.ui.zn) {
                ((org.telegram.ui.zn) n2Var).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            viVar.dismiss(true);
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
        org.telegram.ui.uy uyVar = new org.telegram.ui.uy(bundle);
        Context context = viVar.getContext();
        int i10 = vi.O2;
        jd0 jd0Var = new jd0(context);
        uyVar.C2 = new a1.d(this, user, str, jd0Var, 7);
        jd0Var.show();
        jd0Var.c(uyVar);
    }

    @Override // org.telegram.ui.web.h0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.h0
    public final void y() {
        vi viVar = this.e;
        if (viVar.y0 != this.b) {
            return;
        }
        viVar.setFocusable(false);
        viVar.getWindow().setSoftInputMode(48);
        viVar.dismiss();
        AndroidUtilities.runOnUIThread(new sh(0), 150L);
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ ei.a1 z() {
        return null;
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
