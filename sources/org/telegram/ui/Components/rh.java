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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rh implements org.telegram.ui.web.e0 {
    public ValueAnimator a;
    public final /* synthetic */ mh.g4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ki e;

    public rh(ki kiVar, mh.g4 g4Var, String str, long j10) {
        this.e = kiVar;
        this.b = g4Var;
        this.c = str;
        this.d = j10;
    }

    @Override // org.telegram.ui.web.e0
    public final void b() {
        y();
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.e0
    public final boolean h() {
        ki kiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(kiVar.F1);
        long j10 = this.d;
        return mediaDataController.botInAttachMenu(j10) || MessagesController.getInstance(kiVar.F1).whitelistedBots.contains(Long.valueOf(j10));
    }

    @Override // org.telegram.ui.web.e0
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.e.T0.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.e0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.e0
    public final void k(boolean z10) {
        this.b.setNeedCloseConfirmation(z10);
    }

    @Override // org.telegram.ui.web.e0
    public final void m(int i9) {
        this.b.setCustomBackground(i9);
    }

    @Override // org.telegram.ui.web.e0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.b6 b6Var;
        ki kiVar = this.e;
        int i9 = kiVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        mh.g4 g4Var = this.b;
        org.telegram.ui.co0 co0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(kiVar.getContext(), 3, null);
            c2Var.q(150L);
            gh.v7.y(i9, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(c2Var, 1), new org.telegram.ui.df(14, g4Var, str));
            AndroidUtilities.hideKeyboard(g4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i9).putUsers(paymentForm.users, false);
            co0Var = new org.telegram.ui.co0(paymentForm, null, str, o2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            co0Var = new org.telegram.ui.co0((TLRPC.PaymentReceipt) tLObject);
        }
        if (co0Var != null) {
            g4Var.F();
            AndroidUtilities.hideKeyboard(g4Var);
            Activity parentActivity = o2Var.getParentActivity();
            int i10 = ki.K2;
            gc0 gc0Var = new gc0(parentActivity);
            gc0Var.show();
            co0Var.V0 = new androidx.car.app.utils.a(gc0Var, g4Var, str, 23);
            b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
            co0Var.U0 = b6Var;
            gc0Var.c(co0Var);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void q(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13) {
        ki kiVar = this.e;
        RadialProgressView radialProgressView = kiVar.y1;
        j6 j6Var = kiVar.A1;
        ci ciVar = kiVar.u0;
        mh.g4 g4Var = this.b;
        if (ciVar == g4Var) {
            if (g4Var.L || this.c != null) {
                j6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new t5(j10, 1.4f, j6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    j6Var.setText(spannableStringBuilder);
                } else {
                    j6Var.setText(str);
                }
                j6Var.setTextColor(i10);
                j6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.y0.I0;
                j6Var.setBackground(org.telegram.ui.ActionBar.f6.g0(i9, i0.a.f(i9) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (kiVar.z1 != z10) {
                    kiVar.z1 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new e6(this, 9));
                    this.a.addListener(new ih(this, z10, 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (kiVar.x1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new ih(this, z12, 1)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void s() {
        ci ciVar = this.e.u0;
        mh.g4 g4Var = this.b;
        if (ciVar == g4Var && !g4Var.F.c) {
            g4Var.F();
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.b.H;
        if (g1Var != null) {
            g1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void u(int i9, final int i10, boolean z10) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        ki kiVar = this.e;
        final int color = kiVar.B2.a.getColor();
        final mh.w1 w1Var = new mh.w1();
        int i11 = kiVar.W ? color : 0;
        b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        w1Var.c(w1Var.a, i11, b6Var);
        kiVar.W = z10;
        int i12 = z10 ? i10 : 0;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        w1Var.c(w1Var.b, i12, b6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(gr.f);
        final mh.g4 g4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i10);
                ki kiVar2 = rh.this.e;
                kiVar2.j2 = d;
                kiVar2.i2 = true;
                r7 r7Var = kiVar2.T0;
                if (r7Var != null) {
                    r7Var.d();
                    r7Var.invalidate();
                }
                kiVar2.B2.a(d);
                rg.f fVar = kiVar2.r1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                g4Var.setCustomActionBarBackground(d);
                kiVar2.u0.invalidate();
                kiVar2.n1.invalidate();
                w1Var.b(r7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.e0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ki kiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
            if (o2Var instanceof org.telegram.ui.qn) {
                ((org.telegram.ui.qn) o2Var).U.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            kiVar.dismiss(true);
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
        org.telegram.ui.dy dyVar = new org.telegram.ui.dy(bundle);
        Context context = kiVar.getContext();
        int i9 = ki.K2;
        gc0 gc0Var = new gc0(context);
        dyVar.y2 = new a1.d(this, user, str, gc0Var, 9);
        gc0Var.show();
        gc0Var.c(dyVar);
    }

    @Override // org.telegram.ui.web.e0
    public final void x(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.e0
    public final void y() {
        ki kiVar = this.e;
        if (kiVar.u0 != this.b) {
            return;
        }
        kiVar.setFocusable(false);
        kiVar.getWindow().setSoftInputMode(48);
        kiVar.dismiss();
        AndroidUtilities.runOnUIThread(new hc(5), 150L);
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ mh.y0 z() {
        return null;
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void r(int i9) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void o(int i9, boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final void l(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13, String str2) {
    }
}
