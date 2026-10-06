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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ci implements org.telegram.ui.web.h0 {
    public ValueAnimator a;
    public final /* synthetic */ ei.r4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ xi e;

    public ci(xi xiVar, ei.r4 r4Var, String str, long j3) {
        this.e = xiVar;
        this.b = r4Var;
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
        xi xiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(xiVar.J1);
        long j3 = this.d;
        return mediaDataController.botInAttachMenu(j3) || MessagesController.getInstance(xiVar.J1).whitelistedBots.contains(Long.valueOf(j3));
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
        org.telegram.ui.ActionBar.d6 d6Var;
        xi xiVar = this.e;
        int i10 = xiVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.r4 r4Var = this.b;
        org.telegram.ui.so0 so0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xiVar.getContext(), 3, null);
            b2Var.q(150L);
            yh.u5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(b2Var, 1), new org.telegram.ui.qc(18, r4Var, str));
            AndroidUtilities.hideKeyboard(r4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            so0Var = new org.telegram.ui.so0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            so0Var = new org.telegram.ui.so0((TLRPC.PaymentReceipt) tLObject);
        }
        if (so0Var != null) {
            r4Var.E();
            AndroidUtilities.hideKeyboard(r4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = xi.H2;
            md0 md0Var = new md0(parentActivity);
            md0Var.show();
            so0Var.Z0 = new ai.q5(md0Var, r4Var, str, 24);
            d6Var = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
            so0Var.Y0 = d6Var;
            md0Var.c(so0Var);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        xi xiVar = this.e;
        RadialProgressView radialProgressView = xiVar.C1;
        p6 p6Var = xiVar.E1;
        pi piVar = xiVar.y0;
        ei.r4 r4Var = this.b;
        if (piVar == r4Var) {
            if (r4Var.P || this.c != null) {
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
                boolean z14 = org.telegram.ui.web.c1.P0;
                p6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(i10, i0.a.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (xiVar.D1 != z10) {
                    xiVar.D1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new k6(this, 9));
                    this.a.addListener(new vh(this, z10, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (xiVar.B1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new vh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void s() {
        pi piVar = this.e.y0;
        ei.r4 r4Var = this.b;
        if (piVar == r4Var && !r4Var.J.c) {
            r4Var.E();
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        xi xiVar = this.e;
        final int i12 = xiVar.D2.b;
        final ei.d2 d2Var = new ei.d2();
        int i13 = xiVar.a0 ? i12 : 0;
        d6Var = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
        d2Var.c(d2Var.a, i13, d6Var);
        xiVar.a0 = z10;
        int i14 = z10 ? i11 : 0;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
        d2Var.c(d2Var.b, i14, d6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(tr.f);
        final ei.r4 r4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.th
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, i12, i11);
                xi xiVar2 = ci.this.e;
                xiVar2.n2 = d;
                xiVar2.m2 = true;
                y7 y7Var = xiVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                xiVar2.D2.a(d);
                jh.f fVar = xiVar2.v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                r4Var.setCustomActionBarBackground(d);
                xiVar2.y0.invalidate();
                xiVar2.r1.invalidate();
                d2Var.b(y7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.h0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        xi xiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
            if (n2Var instanceof org.telegram.ui.yn) {
                ((org.telegram.ui.yn) n2Var).W.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            xiVar.dismiss(true);
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
        Context context = xiVar.getContext();
        int i10 = xi.H2;
        md0 md0Var = new md0(context);
        uyVar.C2 = new a1.d(this, user, str, md0Var, 7);
        md0Var.show();
        md0Var.c(uyVar);
    }

    @Override // org.telegram.ui.web.h0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.h0
    public final void y() {
        xi xiVar = this.e;
        if (xiVar.y0 != this.b) {
            return;
        }
        xiVar.setFocusable(false);
        xiVar.getWindow().setSoftInputMode(48);
        xiVar.dismiss();
        AndroidUtilities.runOnUIThread(new uh(0), 150L);
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ ei.b1 z() {
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
