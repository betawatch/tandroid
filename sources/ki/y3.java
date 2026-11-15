package ki;

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
import org.telegram.messenger.is;
import org.telegram.messenger.j6;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ta;
import org.telegram.ui.an;
import org.telegram.ui.my0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class y3 extends ci implements is {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public t3 J;
    public o2 K;
    public org.telegram.ui.ActionBar.q0 L;
    public org.telegram.ui.ActionBar.z0 M;
    public org.telegram.ui.ActionBar.z0 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public p3 V;
    public boolean W;
    public int a0;
    public p2 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        float f10;
        o2 o2Var = this.K;
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                this.b.r0 = true;
                if (i11 < 0) {
                    i11 = 0;
                }
                f10 = i11;
                if (o2Var.getOffsetY() == f10) {
                    this.s = true;
                    o2Var.setOffsetY(f10);
                    this.s = false;
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        this.b.r0 = true;
        if (i11 < 0) {
        }
        f10 = i11;
        if (o2Var.getOffsetY() == f10) {
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        p2 p2Var = this.n;
        CharSequence p10 = q10.p(np.s1(this.G).a2(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = j6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        ki kiVar = this.b;
        kiVar.V2.setTitle(p10);
        this.K.setSwipeOffsetY(0.0f);
        if (p2Var.getWebView() != null) {
            p2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if (e2Var != null) {
            p2Var.setParentActivity(e2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (p2Var.S) {
            return;
        }
        org.telegram.messenger.g0.Q3(kiVar.V2.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.ci
    public final void J() {
        if (this.n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.h3(new p3(this, 0));
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        o2 o2Var = this.K;
        o2Var.e(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        if (!this.T) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User a22 = np.s1(this.G).a2(Long.valueOf(this.w));
        String m10 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = m10;
        t1Var.U = hd.M0(2131752917, null);
        alertDialog$Builder.k(hd.M0(2131752916, null), new r3(this));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        t1Var.show();
        q6.U((TextView) t1Var.d(-1), org.telegram.ui.ActionBar.j6.q7, this.a);
        return false;
    }

    public final void Q() {
        ki kiVar = this.b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if ((e2Var instanceof an) && ((an) e2Var).m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(kiVar.a2.getFragmentView());
            org.telegram.messenger.g0.i3(new p3(this, 1), 250L);
        } else {
            kiVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            kiVar.A0(true);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p2 p2Var = this.n;
        if (i7 != ns.z1) {
            if (i7 == ns.n4) {
                p2Var.n.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.a), ns.j2);
                return;
            }
            return;
        }
        if (this.y == ((Long) objArr[0]).longValue()) {
            p2Var.h();
            this.I = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean g() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        o2 o2Var = this.K;
        return (int) (o2Var.getOffsetY() + o2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.ci
    public int getCustomActionBarBackground() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.ci
    public int getCustomBackground() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public org.telegram.ui.web.v0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean h() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.ci
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean k() {
        if (this.n.D()) {
            return true;
        }
        P();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.P) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void p() {
        ns.f(this.G).n(this, ns.z1);
        ns.e().n(this, ns.n4);
        org.telegram.ui.ActionBar.y s5 = this.b.V2.s();
        org.telegram.ui.ActionBar.q0 q0Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        s5.removeView(q0Var);
        this.n.h();
        this.U = true;
        org.telegram.messenger.g0.r(this.V);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean s() {
        P();
        return false;
    }

    public void setAllowSwipes(boolean z10) {
        this.K.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i7) {
        this.W = true;
        this.a0 = i7;
    }

    public void setCustomBackground(int i7) {
        this.S = i7;
        this.R = true;
    }

    public void setDelegate(org.telegram.ui.web.c0 c0Var) {
        this.n.setDelegate(c0Var);
    }

    public void setMeasureOffsetY(int i7) {
        this.O = i7;
        this.K.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.T = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void t() {
        ki kiVar = this.b;
        kiVar.A0(false);
        kiVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        p2 p2Var = this.n;
        boolean z10 = p2Var.S;
        ki kiVar = this.b;
        if (!z10) {
            org.telegram.messenger.g0.Q3(kiVar.V2.getBackButton(), R.drawable.ic_ab_back);
        }
        kiVar.V2.setBackground(null);
        if (p2Var.U) {
            p2Var.h();
            this.I = true;
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i7) {
        t3 t3Var = this.J;
        p2 p2Var = this.n;
        if (i7 == -1) {
            if (p2Var.D()) {
                return;
            }
            P();
            return;
        }
        ki kiVar = this.b;
        if (i7 == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            kiVar.a2.presentFragment(new an(bundle));
            kiVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == R.id.menu_reload_page) {
            if (p2Var.getWebView() != null) {
                p2Var.getWebView().animate().cancel();
                p2Var.getWebView().animate().alpha(0.0f).start();
            }
            t3Var.setLoadProgress(0.0f);
            t3Var.setAlpha(1.0f);
            t3Var.setVisibility(0);
            p2Var.setBotUser(np.s1(this.G).a2(Long.valueOf(this.w)));
            p2Var.s(this.G, this.w);
            ns.f(p2Var.N).d(new org.telegram.ui.web.q(p2Var, 1));
            return;
        }
        if (i7 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.b0(this.G).b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    kiVar.k1(tL_attachMenuBot2, np.s1(this.G).a2(Long.valueOf(this.w)));
                    return;
                }
            }
            return;
        }
        if (i7 == R.id.menu_settings) {
            p2Var.getClass();
            p2Var.Q = System.currentTimeMillis();
            p2Var.y("settings_button_pressed", null);
        } else {
            if (i7 == R.id.menu_add_to_home_screen_bot) {
                si.b0(this.G).y0(this.w, si.d2, null);
                return;
            }
            if (i7 == R.id.menu_tos_bot) {
                vf.c.t(getContext(), hd.M0(2131752893, null));
                return;
            }
            if (i7 == R.id.menu_report_bot) {
                int i11 = this.G;
                Context context = getContext();
                cc ccVar = new cc(ta.a(getContext()), this.a);
                long j3 = this.w;
                int i12 = my0.w1;
                my0.J0(i11, context, j3, false, false, new ArrayList(), ccVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final void z(int i7, boolean z10) {
        boolean z11;
        p2 p2Var = this.n;
        o2 o2Var = this.K;
        if (z10) {
            p2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY());
            if (o2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                o2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.b.p3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.P = true;
            o2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (p2Var.getWebView() != null) {
                int scrollY = p2Var.getWebView().getScrollY();
                int i10 = (Q - i7) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(pi.k.V);
                this.r.addUpdateListener(new q3(this, 0));
                this.r.addListener(new j2(this, i10, 1));
                this.r.start();
            }
        }
    }
}
