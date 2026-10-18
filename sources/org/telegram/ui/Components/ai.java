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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ai implements org.telegram.ui.web.g0 {
    public ValueAnimator a;
    public final /* synthetic */ gi.f4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ti e;

    public ai(ti tiVar, gi.f4 f4Var, String str, long j10) {
        this.e = tiVar;
        this.b = f4Var;
        this.c = str;
        this.d = j10;
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
        org.telegram.ui.ActionBar.d6 d6Var;
        ti tiVar = this.e;
        int i10 = tiVar.M1;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        gi.f4 f4Var = this.b;
        org.telegram.ui.go0 go0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(tiVar.getContext(), 3, null);
            b2Var.q(150L);
            ai.ga.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(b2Var, 1), new org.telegram.ui.ActionBar.j3(24, f4Var, str));
            AndroidUtilities.hideKeyboard(f4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            go0Var = new org.telegram.ui.go0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            go0Var = new org.telegram.ui.go0((TLRPC.PaymentReceipt) tLObject);
        }
        if (go0Var != null) {
            f4Var.J();
            AndroidUtilities.hideKeyboard(f4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = ti.R2;
            td0 td0Var = new td0(parentActivity);
            td0Var.show();
            go0Var.Z0 = new ai.t2(td0Var, f4Var, str, 25);
            d6Var = ((org.telegram.ui.ActionBar.f3) tiVar).resourcesProvider;
            go0Var.Y0 = d6Var;
            td0Var.c(go0Var);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        ti tiVar = this.e;
        RadialProgressView radialProgressView = tiVar.F1;
        q6 q6Var = tiVar.H1;
        li liVar = tiVar.B0;
        gi.f4 f4Var = this.b;
        if (liVar == f4Var) {
            if (f4Var.P || this.c != null) {
                q6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new a6(j10, 1.4f, q6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    q6Var.setText(spannableStringBuilder);
                } else {
                    q6Var.setText(str);
                }
                q6Var.setTextColor(i11);
                q6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.a1.P0;
                q6Var.setBackground(org.telegram.ui.ActionBar.h6.h0(i10, i0.a.h(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (tiVar.G1 != z10) {
                    tiVar.G1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new l6(this, 9));
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
        gi.f4 f4Var = this.b;
        if (liVar == f4Var && !f4Var.J.c) {
            f4Var.J();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = this.b.L;
        if (e1Var != null) {
            e1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void u(int i10, final int i11, boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        ti tiVar = this.e;
        final int color = tiVar.I2.a.getColor();
        final gi.w1 w1Var = new gi.w1();
        int i12 = tiVar.a0 ? color : 0;
        d6Var = ((org.telegram.ui.ActionBar.f3) tiVar).resourcesProvider;
        w1Var.c(w1Var.a, i12, d6Var);
        tiVar.a0 = z10;
        int i13 = z10 ? i11 : 0;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) tiVar).resourcesProvider;
        w1Var.c(w1Var.b, i13, d6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(bs.f);
        final gi.f4 f4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f7 = i0.a.f(floatValue, color, i11);
                ti tiVar2 = ai.this.e;
                tiVar2.q2 = f7;
                tiVar2.p2 = true;
                z7 z7Var = tiVar2.a1;
                if (z7Var != null) {
                    z7Var.d();
                    z7Var.invalidate();
                }
                tiVar2.I2.a(f7);
                kh.f fVar = tiVar2.y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                f4Var.setCustomActionBarBackground(f7);
                tiVar2.B0.invalidate();
                tiVar2.u1.invalidate();
                w1Var.b(z7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.g0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ti tiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
            if (n2Var instanceof org.telegram.ui.sn) {
                ((org.telegram.ui.sn) n2Var).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        org.telegram.ui.ey eyVar = new org.telegram.ui.ey(bundle);
        Context context = tiVar.getContext();
        int i10 = ti.R2;
        td0 td0Var = new td0(context);
        eyVar.C2 = new a1.d(this, user, str, td0Var, 9);
        td0Var.show();
        td0Var.c(eyVar);
    }

    @Override // org.telegram.ui.web.g0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.g0
    public final void y() {
        ti tiVar = this.e;
        if (tiVar.B0 != this.b) {
            return;
        }
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
        tiVar.dismiss();
        AndroidUtilities.runOnUIThread(new rc(5), 150L);
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ gi.y0 z() {
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
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
