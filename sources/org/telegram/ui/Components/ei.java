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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ei implements org.telegram.ui.web.g0 {
    public ValueAnimator a;
    public final /* synthetic */ ei.p4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ yi e;

    public ei(yi yiVar, ei.p4 p4Var, String str, long j3) {
        this.e = yiVar;
        this.b = p4Var;
        this.c = str;
        this.d = j3;
    }

    @Override // org.telegram.ui.web.g0
    public final void b() {
        y();
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.g0
    public final boolean h() {
        yi yiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(yiVar.M1);
        long j3 = this.d;
        return mediaDataController.botInAttachMenu(j3) || MessagesController.getInstance(yiVar.M1).whitelistedBots.contains(Long.valueOf(j3));
    }

    @Override // org.telegram.ui.web.g0
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.a1.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.g0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.g0
    public final void k(boolean z10) {
        this.b.setNeedCloseConfirmation(z10);
    }

    @Override // org.telegram.ui.web.g0
    public final void m(int i10) {
        this.b.setCustomBackground(i10);
    }

    @Override // org.telegram.ui.web.g0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.e6 e6Var;
        yi yiVar = this.e;
        int i10 = yiVar.M1;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.p4 p4Var = this.b;
        org.telegram.ui.vo0 vo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(yiVar.getContext(), 3, null);
            b2Var.q(150L);
            yh.m5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(b2Var, 1), new org.telegram.ui.pc(18, p4Var, str));
            AndroidUtilities.hideKeyboard(p4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            vo0Var = new org.telegram.ui.vo0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            vo0Var = new org.telegram.ui.vo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (vo0Var != null) {
            p4Var.J();
            AndroidUtilities.hideKeyboard(p4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = yi.R2;
            ae0 ae0Var = new ae0(parentActivity);
            ae0Var.show();
            vo0Var.Z0 = new ai.r5(ae0Var, p4Var, str, 24);
            e6Var = ((org.telegram.ui.ActionBar.f3) yiVar).resourcesProvider;
            vo0Var.Y0 = e6Var;
            ae0Var.c(vo0Var);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        yi yiVar = this.e;
        RadialProgressView radialProgressView = yiVar.F1;
        r6 r6Var = yiVar.H1;
        qi qiVar = yiVar.B0;
        ei.p4 p4Var = this.b;
        if (qiVar == p4Var) {
            if (p4Var.P || this.c != null) {
                r6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new b6(j3, 1.4f, r6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    r6Var.setText(spannableStringBuilder);
                } else {
                    r6Var.setText(str);
                }
                r6Var.setTextColor(i11);
                r6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.b1.P0;
                r6Var.setBackground(org.telegram.ui.ActionBar.i6.h0(i10, i0.a.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (yiVar.G1 != z10) {
                    yiVar.G1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new m6(this, 9));
                    this.a.addListener(new wh(this, z10, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (yiVar.E1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new wh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void s() {
        qi qiVar = this.e.B0;
        ei.p4 p4Var = this.b;
        if (qiVar == p4Var && !p4Var.J.c) {
            p4Var.J();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = this.b.L;
        if (f1Var != null) {
            f1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void u(int i10, final int i11, boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        yi yiVar = this.e;
        final int color = yiVar.I2.a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i12 = yiVar.a0 ? color : 0;
        e6Var = ((org.telegram.ui.ActionBar.f3) yiVar).resourcesProvider;
        c2Var.c(c2Var.a, i12, e6Var);
        yiVar.a0 = z10;
        int i13 = z10 ? i11 : 0;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) yiVar).resourcesProvider;
        c2Var.c(c2Var.b, i13, e6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(hs.f);
        final ei.p4 p4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.uh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                yi yiVar2 = ei.this.e;
                yiVar2.q2 = d;
                yiVar2.p2 = true;
                a8 a8Var = yiVar2.a1;
                if (a8Var != null) {
                    a8Var.e();
                    a8Var.invalidate();
                }
                yiVar2.I2.a(d);
                jh.f fVar = yiVar2.y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                p4Var.setCustomActionBarBackground(d);
                yiVar2.B0.invalidate();
                yiVar2.u1.invalidate();
                c2Var.b(a8Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.g0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        yi yiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
            if (n2Var instanceof org.telegram.ui.zn) {
                ((org.telegram.ui.zn) n2Var).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            yiVar.dismiss(true);
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
        org.telegram.ui.ty tyVar = new org.telegram.ui.ty(bundle);
        Context context = yiVar.getContext();
        int i10 = yi.R2;
        ae0 ae0Var = new ae0(context);
        tyVar.C2 = new a1.d(this, user, str, ae0Var, 7);
        ae0Var.show();
        ae0Var.c(tyVar);
    }

    @Override // org.telegram.ui.web.g0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.g0
    public final void y() {
        yi yiVar = this.e;
        if (yiVar.B0 != this.b) {
            return;
        }
        yiVar.setFocusable(false);
        yiVar.getWindow().setSoftInputMode(48);
        yiVar.dismiss();
        AndroidUtilities.runOnUIThread(new vh(0), 150L);
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ ei.a1 z() {
        return null;
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
