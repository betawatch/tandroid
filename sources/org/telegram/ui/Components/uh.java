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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uh implements org.telegram.ui.web.f0 {
    public ValueAnimator a;
    public final /* synthetic */ ph.n3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ni e;

    public uh(ni niVar, ph.n3 n3Var, String str, long j10) {
        this.e = niVar;
        this.b = n3Var;
        this.c = str;
        this.d = j10;
    }

    @Override // org.telegram.ui.web.f0
    public final void b() {
        y();
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.f0
    public final boolean h() {
        ni niVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(niVar.F1);
        long j10 = this.d;
        return mediaDataController.botInAttachMenu(j10) || MessagesController.getInstance(niVar.F1).whitelistedBots.contains(Long.valueOf(j10));
    }

    @Override // org.telegram.ui.web.f0
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.T0.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.f0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.f0
    public final void k(boolean z10) {
        this.b.setNeedCloseConfirmation(z10);
    }

    @Override // org.telegram.ui.web.f0
    public final void m(int i10) {
        this.b.setCustomBackground(i10);
    }

    @Override // org.telegram.ui.web.f0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.c6 c6Var;
        ni niVar = this.e;
        int i10 = niVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ph.n3 n3Var = this.b;
        org.telegram.ui.bo0 bo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(niVar.getContext(), 3, null);
            c2Var.q(150L);
            jh.s7.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e2(c2Var, 1), new org.telegram.ui.tm(7, n3Var, str));
            AndroidUtilities.hideKeyboard(n3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            bo0Var = new org.telegram.ui.bo0(paymentForm, null, str, o2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            bo0Var = new org.telegram.ui.bo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (bo0Var != null) {
            n3Var.F();
            AndroidUtilities.hideKeyboard(n3Var);
            Activity parentActivity = o2Var.getParentActivity();
            int i11 = ni.K2;
            vc0 vc0Var = new vc0(parentActivity);
            vc0Var.show();
            bo0Var.V0 = new androidx.car.app.utils.a(vc0Var, n3Var, str, 21);
            c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
            bo0Var.U0 = c6Var;
            vc0Var.c(bo0Var);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        ni niVar = this.e;
        RadialProgressView radialProgressView = niVar.y1;
        o6 o6Var = niVar.A1;
        fi fiVar = niVar.u0;
        ph.n3 n3Var = this.b;
        if (fiVar == n3Var) {
            if (n3Var.L || this.c != null) {
                o6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new y5(j10, 1.4f, o6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    o6Var.setText(spannableStringBuilder);
                } else {
                    o6Var.setText(str);
                }
                o6Var.setTextColor(i11);
                o6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.z0.I0;
                o6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(i10, i0.a.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (niVar.z1 != z10) {
                    niVar.z1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new j6(this, 9));
                    this.a.addListener(new lh(this, z10, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (niVar.x1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new lh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void s() {
        fi fiVar = this.e.u0;
        ph.n3 n3Var = this.b;
        if (fiVar == n3Var && !n3Var.F.c) {
            n3Var.F();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.b.H;
        if (g1Var != null) {
            g1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void u(int i10, final int i11, boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        ni niVar = this.e;
        final int color = niVar.B2.a.getColor();
        final ph.o1 o1Var = new ph.o1();
        int i12 = niVar.W ? color : 0;
        c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        o1Var.c(o1Var.a, i12, c6Var);
        niVar.W = z10;
        int i13 = z10 ? i11 : 0;
        c6Var2 = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        o1Var.c(o1Var.b, i13, c6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(jr.f);
        final ph.n3 n3Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                ni niVar2 = uh.this.e;
                niVar2.j2 = d;
                niVar2.i2 = true;
                cg.m1 m1Var = niVar2.T0;
                if (m1Var != null) {
                    m1Var.e();
                    m1Var.invalidate();
                }
                niVar2.B2.a(d);
                ug.f fVar = niVar2.r1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                n3Var.setCustomActionBarBackground(d);
                niVar2.u0.invalidate();
                niVar2.n1.invalidate();
                o1Var.b(m1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.f0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ni niVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
            if (o2Var instanceof org.telegram.ui.tn) {
                ((org.telegram.ui.tn) o2Var).U.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            niVar.dismiss(true);
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
        org.telegram.ui.fy fyVar = new org.telegram.ui.fy(bundle);
        Context context = niVar.getContext();
        int i10 = ni.K2;
        vc0 vc0Var = new vc0(context);
        fyVar.y2 = new a1.d(this, user, str, vc0Var, 8);
        vc0Var.show();
        vc0Var.c(fyVar);
    }

    @Override // org.telegram.ui.web.f0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.f0
    public final void y() {
        ni niVar = this.e;
        if (niVar.u0 != this.b) {
            return;
        }
        niVar.setFocusable(false);
        niVar.getWindow().setSoftInputMode(48);
        niVar.dismiss();
        AndroidUtilities.runOnUIThread(new g5(7), 150L);
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ ph.u0 z() {
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
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
