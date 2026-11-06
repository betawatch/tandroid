package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.xa;
import org.telegram.ui.an;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class c4 extends vh implements ls {
    public int D;
    public long E;
    public int F;
    public String G;
    public boolean H;
    public v3 I;
    public r2 J;
    public org.telegram.ui.ActionBar.r0 K;
    public org.telegram.ui.ActionBar.z0 L;
    public org.telegram.ui.ActionBar.z0 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public s3 U;
    public boolean V;
    public int W;
    public s2 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        float f10;
        r2 r2Var = this.J;
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                this.b.q0 = true;
                if (i11 < 0) {
                    i11 = 0;
                }
                f10 = i11;
                if (r2Var.getOffsetY() == f10) {
                    this.s = true;
                    r2Var.setOffsetY(f10);
                    this.s = false;
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        this.b.q0 = true;
        if (i11 < 0) {
        }
        f10 = i11;
        if (r2Var.getOffsetY() == f10) {
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        s2 s2Var = this.n;
        CharSequence p10 = t10.p(qp.s1(this.F).a2(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        di diVar = this.b;
        diVar.R2.setTitle(p10);
        this.J.setSwipeOffsetY(0.0f);
        if (s2Var.getWebView() != null) {
            s2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var != null) {
            s2Var.setParentActivity(f2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (s2Var.R) {
            return;
        }
        org.telegram.messenger.g0.R3(diVar.R2.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.vh
    public final void I() {
        if (this.n.N) {
            P();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.h3(new s3(this, 0));
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        r2 r2Var = this.J;
        r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean M() {
        return false;
    }

    public final boolean O() {
        if (!this.S) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User a22 = qp.s1(this.F).a2(Long.valueOf(this.w));
        String m10 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = m10;
        u1Var.T = hd.M0(2131752917, null);
        alertDialog$Builder.k(hd.M0(2131752916, null), new u3(this));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        u1Var.show();
        r6.V((TextView) u1Var.d(-1), k6.q7, this.a);
        return false;
    }

    public final void P() {
        di diVar = this.b;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if ((f2Var instanceof an) && ((an) f2Var).l1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(diVar.W1.getFragmentView());
            org.telegram.messenger.g0.i3(new s3(this, 1), 250L);
        } else {
            diVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            diVar.A0(true);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        s2 s2Var = this.n;
        if (i7 != qs.z1) {
            if (i7 == qs.n4) {
                s2Var.n.b(k6.w0(k6.h5, this.a), qs.j2);
                return;
            }
            return;
        }
        if (this.y == ((Long) objArr[0]).longValue()) {
            s2Var.h();
            this.H = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean g() {
        return this.V;
    }

    @Override // org.telegram.ui.Components.vh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        r2 r2Var = this.J;
        return (int) (r2Var.getOffsetY() + r2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.vh
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.vh
    public int getCustomBackground() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.x0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean h() {
        return this.Q;
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean k() {
        if (this.n.D()) {
            return true;
        }
        O();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
        qs.f(this.F).n(this, qs.z1);
        qs.e().n(this, qs.n4);
        org.telegram.ui.ActionBar.y q10 = this.b.R2.q();
        org.telegram.ui.ActionBar.r0 r0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        q10.removeView(r0Var);
        this.n.h();
        this.T = true;
        org.telegram.messenger.g0.r(this.U);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean s() {
        O();
        return false;
    }

    public void setAllowSwipes(boolean z9) {
        this.J.setAllowSwipes(z9);
    }

    public void setCustomActionBarBackground(int i7) {
        this.V = true;
        this.W = i7;
    }

    public void setCustomBackground(int i7) {
        this.R = i7;
        this.Q = true;
    }

    public void setDelegate(org.telegram.ui.web.d0 d0Var) {
        this.n.setDelegate(d0Var);
    }

    public void setMeasureOffsetY(int i7) {
        this.N = i7;
        this.J.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z9) {
        this.S = z9;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.vh
    public final void t() {
        di diVar = this.b;
        diVar.A0(false);
        diVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        this.K.setVisibility(8);
        this.P = false;
        s2 s2Var = this.n;
        boolean z9 = s2Var.R;
        di diVar = this.b;
        if (!z9) {
            org.telegram.messenger.g0.R3(diVar.R2.getBackButton(), R.drawable.ic_ab_back);
        }
        diVar.R2.setBackground(null);
        if (s2Var.T) {
            s2Var.h();
            this.H = true;
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void w(int i7) {
        v3 v3Var = this.I;
        s2 s2Var = this.n;
        if (i7 == -1) {
            if (s2Var.D()) {
                return;
            }
            O();
            return;
        }
        di diVar = this.b;
        if (i7 == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            diVar.W1.presentFragment(new an(bundle));
            diVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == R.id.menu_reload_page) {
            if (s2Var.getWebView() != null) {
                s2Var.getWebView().animate().cancel();
                s2Var.getWebView().animate().alpha(0.0f).start();
            }
            v3Var.setLoadProgress(0.0f);
            v3Var.setAlpha(1.0f);
            v3Var.setVisibility(0);
            s2Var.setBotUser(qp.s1(this.F).a2(Long.valueOf(this.w)));
            s2Var.s(this.F, this.w);
            qs.f(s2Var.M).d(new org.telegram.ui.web.p(s2Var, 1));
            return;
        }
        if (i7 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(this.F).b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    diVar.k1(tL_attachMenuBot2, qp.s1(this.F).a2(Long.valueOf(this.w)));
                    return;
                }
            }
            return;
        }
        if (i7 == R.id.menu_settings) {
            s2Var.getClass();
            s2Var.P = System.currentTimeMillis();
            s2Var.y("settings_button_pressed", null);
        } else {
            if (i7 == R.id.menu_add_to_home_screen_bot) {
                ui.b0(this.F).y0(this.w, ui.c2, null);
                return;
            }
            if (i7 == R.id.menu_tos_bot) {
                vf.c.t(getContext(), hd.M0(2131752893, null));
                return;
            }
            if (i7 == R.id.menu_report_bot) {
                int i11 = this.F;
                Context context = getContext();
                hc hcVar = new hc(xa.a(getContext()), this.a);
                long j3 = this.w;
                int i12 = oy0.s1;
                oy0.J0(i11, context, j3, false, false, new ArrayList(), hcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.vh
    public final void z(int i7, boolean z9) {
        boolean z10;
        s2 s2Var = this.n;
        r2 r2Var = this.J;
        if (z9) {
            s2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY());
            if (r2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                r2Var.e(topActionBarOffsetY);
                z10 = true;
            } else {
                z10 = false;
            }
            int Q = this.b.l3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.O = true;
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z10) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (s2Var.getWebView() != null) {
                int scrollY = s2Var.getWebView().getScrollY();
                int i10 = (Q - i7) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(mi.l.V);
                this.r.addUpdateListener(new t3(this, 0));
                this.r.addListener(new m2(this, i10, 1));
                this.r.start();
            }
        }
    }
}
