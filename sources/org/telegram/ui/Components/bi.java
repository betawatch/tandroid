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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bi implements org.telegram.ui.web.i0 {
    public ValueAnimator a;
    public final /* synthetic */ fi.r4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ vi e;

    public bi(vi viVar, fi.r4 r4Var, String str, long j3) {
        this.e = viVar;
        this.b = r4Var;
        this.c = str;
        this.d = j3;
    }

    @Override // org.telegram.ui.web.i0
    public final void b() {
        y();
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.i0
    public final boolean h() {
        vi viVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(viVar.J1);
        long j3 = this.d;
        return mediaDataController.botInAttachMenu(j3) || MessagesController.getInstance(viVar.J1).whitelistedBots.contains(Long.valueOf(j3));
    }

    @Override // org.telegram.ui.web.i0
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.X0.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.i0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.i0
    public final void k(boolean z10) {
        this.b.setNeedCloseConfirmation(z10);
    }

    @Override // org.telegram.ui.web.i0
    public final void m(int i10) {
        this.b.setCustomBackground(i10);
    }

    @Override // org.telegram.ui.web.i0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.f6 f6Var;
        vi viVar = this.e;
        int i10 = viVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        fi.r4 r4Var = this.b;
        org.telegram.ui.xo0 xo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(viVar.getContext(), 3, null);
            b2Var.q(150L);
            zh.s5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(b2Var, 1), new org.telegram.ui.nf(12, r4Var, str));
            AndroidUtilities.hideKeyboard(r4Var);
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
            r4Var.G();
            AndroidUtilities.hideKeyboard(r4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = vi.O2;
            ad0 ad0Var = new ad0(parentActivity);
            ad0Var.show();
            xo0Var.Z0 = new androidx.car.app.utils.a(ad0Var, r4Var, str, 24);
            f6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
            xo0Var.Y0 = f6Var;
            ad0Var.c(xo0Var);
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        vi viVar = this.e;
        RadialProgressView radialProgressView = viVar.C1;
        q6 q6Var = viVar.E1;
        ni niVar = viVar.y0;
        fi.r4 r4Var = this.b;
        if (niVar == r4Var) {
            if (r4Var.P || this.c != null) {
                q6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new z5(j3, 1.4f, q6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    q6Var.setText(spannableStringBuilder);
                } else {
                    q6Var.setText(str);
                }
                q6Var.setTextColor(i11);
                q6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.d1.P0;
                q6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(i10, i0.a.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (viVar.D1 != z10) {
                    viVar.D1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new l6(this, 9));
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

    @Override // org.telegram.ui.web.i0
    public final void s() {
        ni niVar = this.e.y0;
        fi.r4 r4Var = this.b;
        if (niVar == r4Var && !r4Var.J.c) {
            r4Var.G();
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = this.b.L;
        if (f1Var != null) {
            f1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void u(int i10, final int i11, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        vi viVar = this.e;
        final int color = viVar.F2.a.getColor();
        final fi.c2 c2Var = new fi.c2();
        int i12 = viVar.a0 ? color : 0;
        f6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.a, i12, f6Var);
        viVar.a0 = z10;
        int i13 = z10 ? i11 : 0;
        f6Var2 = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.b, i13, f6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(pr.f);
        final fi.r4 r4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.sh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                vi viVar2 = bi.this.e;
                viVar2.n2 = d;
                viVar2.m2 = true;
                z7 z7Var = viVar2.X0;
                if (z7Var != null) {
                    z7Var.d();
                    z7Var.invalidate();
                }
                viVar2.F2.a(d);
                kh.f fVar = viVar2.v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                r4Var.setCustomActionBarBackground(d);
                viVar2.y0.invalidate();
                viVar2.r1.invalidate();
                c2Var.b(z7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.i0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        vi viVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
            if (n2Var instanceof org.telegram.ui.co) {
                ((org.telegram.ui.co) n2Var).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        ad0 ad0Var = new ad0(context);
        uyVar.C2 = new a1.d(this, user, str, ad0Var, 7);
        ad0Var.show();
        ad0Var.c(uyVar);
    }

    @Override // org.telegram.ui.web.i0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.i0
    public final void y() {
        vi viVar = this.e;
        if (viVar.y0 != this.b) {
            return;
        }
        viVar.setFocusable(false);
        viVar.getWindow().setSoftInputMode(48);
        viVar.dismiss();
        AndroidUtilities.runOnUIThread(new ue(1), 150L);
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ fi.a1 z() {
        return null;
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
