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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zh implements org.telegram.ui.web.g0 {
    public ValueAnimator a;
    public final /* synthetic */ hi.o4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ti e;

    public zh(ti tiVar, hi.o4 o4Var, String str, long j10) {
        this.e = tiVar;
        this.b = o4Var;
        this.c = str;
        this.d = j10;
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ hi.f1 A() {
        return null;
    }

    @Override // org.telegram.ui.web.g0
    public final void b() {
        z();
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.g0
    public final boolean h() {
        ti tiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(tiVar.M1);
        long j10 = this.d;
        return mediaDataController.botInAttachMenu(j10) || MessagesController.getInstance(tiVar.M1).whitelistedBots.contains(Long.valueOf(j10));
    }

    @Override // org.telegram.ui.web.g0
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.a1.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.g0
    public final void j() {
        z();
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
        org.telegram.ui.ActionBar.u6 u6Var;
        ti tiVar = this.e;
        int i10 = tiVar.M1;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        hi.o4 o4Var = this.b;
        org.telegram.ui.po0 po0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(tiVar.getContext(), 3, null);
            e2Var.r(150L);
            bi.ca.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e2(e2Var, 1), new li.s2(26, o4Var, str));
            AndroidUtilities.hideKeyboard(o4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            po0Var = new org.telegram.ui.po0(paymentForm, null, str, r2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            po0Var = new org.telegram.ui.po0((TLRPC.PaymentReceipt) tLObject);
        }
        if (po0Var != null) {
            o4Var.J();
            AndroidUtilities.hideKeyboard(o4Var);
            Activity parentActivity = r2Var.getParentActivity();
            int i11 = ti.N2;
            sd0 sd0Var = new sd0(parentActivity);
            sd0Var.show();
            po0Var.Z0 = new androidx.car.app.utils.a(sd0Var, o4Var, str, 25);
            u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
            po0Var.Y0 = u6Var;
            sd0Var.c(po0Var);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        ti tiVar = this.e;
        RadialProgressView radialProgressView = tiVar.F1;
        s6 s6Var = tiVar.H1;
        li liVar = tiVar.B0;
        hi.o4 o4Var = this.b;
        if (liVar == o4Var) {
            if (o4Var.P || this.c != null) {
                s6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new c6(j10, 1.4f, s6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    s6Var.setText(spannableStringBuilder);
                } else {
                    s6Var.setText(str);
                }
                s6Var.setTextColor(i11);
                s6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.a1.Q0;
                s6Var.setBackground(org.telegram.ui.ActionBar.y6.h0(i10, i0.a.h(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (tiVar.G1 != z10) {
                    tiVar.G1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new n6(this, 10));
                    this.a.addListener(new sh(this, z10, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (tiVar.E1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new sh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void s() {
        li liVar = this.e.B0;
        hi.o4 o4Var = this.b;
        if (liVar == o4Var && !o4Var.J.c) {
            o4Var.J();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.b.L;
        if (g1Var != null) {
            g1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void u(int i10, final int i11, boolean z10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        ti tiVar = this.e;
        final int i12 = tiVar.J2.b;
        final hi.d2 d2Var = new hi.d2();
        int i13 = tiVar.a0 ? i12 : 0;
        u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
        d2Var.c(d2Var.a, i13, u6Var);
        tiVar.a0 = z10;
        int i14 = z10 ? i11 : 0;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
        d2Var.c(d2Var.b, i14, u6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(ds.f);
        final hi.o4 o4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f7 = i0.a.f(floatValue, i12, i11);
                ti tiVar2 = zh.this.e;
                tiVar2.q2 = f7;
                tiVar2.p2 = true;
                b8 b8Var = tiVar2.a1;
                if (b8Var != null) {
                    b8Var.updateColors();
                    b8Var.invalidate();
                }
                tiVar2.J2.a(f7);
                lh.f fVar = tiVar2.y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                o4Var.setCustomActionBarBackground(f7);
                tiVar2.B0.invalidate();
                tiVar2.u1.invalidate();
                d2Var.b(b8Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.g0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ti tiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
            if (r2Var instanceof org.telegram.ui.un) {
                ((org.telegram.ui.un) r2Var).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            tiVar.dismiss(true);
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
        org.telegram.ui.cy cyVar = new org.telegram.ui.cy(bundle);
        Context context = tiVar.getContext();
        int i10 = ti.N2;
        sd0 sd0Var = new sd0(context);
        cyVar.C2 = new a1.d(this, user, str, sd0Var, 9);
        sd0Var.show();
        sd0Var.c(cyVar);
    }

    @Override // org.telegram.ui.web.g0
    public final void y(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.g0
    public final void z() {
        ti tiVar = this.e;
        if (tiVar.B0 != this.b) {
            return;
        }
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
        tiVar.dismiss();
        AndroidUtilities.runOnUIThread(new k5(7), 150L);
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
    public final void x(int i10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
