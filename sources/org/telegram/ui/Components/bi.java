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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bi implements org.telegram.ui.web.h0 {
    public ValueAnimator a;
    public final /* synthetic */ fi.q4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ vi e;

    public bi(vi viVar, fi.q4 q4Var, String str, long j10) {
        this.e = viVar;
        this.b = q4Var;
        this.c = str;
        this.d = j10;
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
        MediaDataController mediaDataController = MediaDataController.getInstance(viVar.M1);
        long j10 = this.d;
        return mediaDataController.botInAttachMenu(j10) || MessagesController.getInstance(viVar.M1).whitelistedBots.contains(Long.valueOf(j10));
    }

    @Override // org.telegram.ui.web.h0
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.a1.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
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
        org.telegram.ui.ActionBar.c6 c6Var;
        vi viVar = this.e;
        int i10 = viVar.M1;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        fi.q4 q4Var = this.b;
        org.telegram.ui.cp0 cp0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(viVar.getContext(), 3, null);
            a2Var.q(150L);
            zh.n5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(a2Var, 1), new org.telegram.ui.vc(18, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            cp0Var = new org.telegram.ui.cp0(paymentForm, null, str, m2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            cp0Var = new org.telegram.ui.cp0((TLRPC.PaymentReceipt) tLObject);
        }
        if (cp0Var != null) {
            q4Var.J();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = m2Var.getParentActivity();
            int i11 = vi.R2;
            zd0 zd0Var = new zd0(parentActivity);
            zd0Var.show();
            cp0Var.Z0 = new androidx.car.app.utils.a(zd0Var, q4Var, str, 24);
            c6Var = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
            cp0Var.Y0 = c6Var;
            zd0Var.c(cp0Var);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        vi viVar = this.e;
        RadialProgressView radialProgressView = viVar.F1;
        s6 s6Var = viVar.H1;
        ni niVar = viVar.B0;
        fi.q4 q4Var = this.b;
        if (niVar == q4Var) {
            if (q4Var.P || this.c != null) {
                s6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new b6(j10, 1.4f, s6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    s6Var.setText(spannableStringBuilder);
                } else {
                    s6Var.setText(str);
                }
                s6Var.setTextColor(i11);
                s6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.b1.P0;
                s6Var.setBackground(org.telegram.ui.ActionBar.g6.h0(i10, i0.a.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (viVar.G1 != z10) {
                    viVar.G1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new n6(this, 9));
                    this.a.addListener(new th(this, z10, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (viVar.E1 != z12) {
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
        ni niVar = this.e.B0;
        fi.q4 q4Var = this.b;
        if (niVar == q4Var && !q4Var.J.c) {
            q4Var.J();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = this.b.L;
        if (e1Var != null) {
            e1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void u(int i10, final int i11, boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        vi viVar = this.e;
        final int color = viVar.I2.a.getColor();
        final fi.b2 b2Var = new fi.b2();
        int i12 = viVar.a0 ? color : 0;
        c6Var = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
        b2Var.c(b2Var.a, i12, c6Var);
        viVar.a0 = z10;
        int i13 = z10 ? i11 : 0;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
        b2Var.c(b2Var.b, i13, c6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(es.f);
        final fi.q4 q4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.sh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                vi viVar2 = bi.this.e;
                viVar2.q2 = d;
                viVar2.p2 = true;
                b8 b8Var = viVar2.a1;
                if (b8Var != null) {
                    b8Var.d();
                    b8Var.invalidate();
                }
                viVar2.I2.a(d);
                kh.f fVar = viVar2.y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                viVar2.B0.invalidate();
                viVar2.u1.invalidate();
                b2Var.b(b8Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.h0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        vi viVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
            if (m2Var instanceof org.telegram.ui.fo) {
                ((org.telegram.ui.fo) m2Var).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        org.telegram.ui.yy yyVar = new org.telegram.ui.yy(bundle);
        Context context = viVar.getContext();
        int i10 = vi.R2;
        zd0 zd0Var = new zd0(context);
        yyVar.C2 = new a1.d(this, user, str, zd0Var, 7);
        zd0Var.show();
        zd0Var.c(yyVar);
    }

    @Override // org.telegram.ui.web.h0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.h0
    public final void y() {
        vi viVar = this.e;
        if (viVar.B0 != this.b) {
            return;
        }
        viVar.setFocusable(false);
        viVar.getWindow().setSoftInputMode(48);
        viVar.dismiss();
        AndroidUtilities.runOnUIThread(new ve(1), 150L);
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ fi.z0 z() {
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
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
