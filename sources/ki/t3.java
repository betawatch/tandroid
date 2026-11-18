package ki;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.si;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class t3 extends ki implements fs {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public o3 J;
    public k2 K;
    public org.telegram.ui.ActionBar.r0 L;
    public org.telegram.ui.ActionBar.z0 M;
    public org.telegram.ui.ActionBar.z0 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public k3 V;
    public boolean W;
    public int a0;
    public l2 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        float f10;
        k2 k2Var = this.K;
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                this.b.r0 = true;
                if (i11 < 0) {
                    i11 = 0;
                }
                f10 = i11;
                if (k2Var.getOffsetY() == f10) {
                    this.s = true;
                    k2Var.setOffsetY(f10);
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
        if (k2Var.getOffsetY() == f10) {
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        l2 l2Var = this.n;
        CharSequence q10 = o10.q(mp.u1(this.G).c2(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            q10 = j6.m(q10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        si siVar = this.b;
        siVar.V2.setTitle(q10);
        this.K.setSwipeOffsetY(0.0f);
        if (l2Var.getWebView() != null) {
            l2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
        if (h2Var != null) {
            l2Var.setParentActivity(h2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (l2Var.S) {
            return;
        }
        org.telegram.messenger.g0.P3(siVar.V2.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.ki
    public final void J() {
        if (this.n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.g3(new k3(this, 0));
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        k2 k2Var = this.K;
        k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        if (!this.T) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User c22 = mp.u1(this.G).c2(Long.valueOf(this.w));
        String m10 = c22 != null ? i5.m(0, c22.first_name, c22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = m10;
        u1Var.U = gd.M0(2131752906, null);
        alertDialog$Builder.k(gd.M0(2131752905, null), new m3(this));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        u1Var.show();
        u6.U((TextView) u1Var.d(-1), n6.q7, this.a);
        return false;
    }

    public final void Q() {
        si siVar = this.b;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
        if ((h2Var instanceof bn) && ((bn) h2Var).m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(siVar.a2.getFragmentView());
            org.telegram.messenger.g0.h3(new k3(this, 1), 250L);
        } else {
            siVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            siVar.A0(true);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l2 l2Var = this.n;
        if (i7 != ks.z1) {
            if (i7 == ks.p4) {
                l2Var.n.b(n6.w0(n6.h5, this.a), ks.j2);
                return;
            }
            return;
        }
        if (this.y == ((Long) objArr[0]).longValue()) {
            l2Var.h();
            this.I = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean g() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.ki
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        k2 k2Var = this.K;
        return (int) (k2Var.getOffsetY() + k2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.ki
    public int getCustomActionBarBackground() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.ki
    public int getCustomBackground() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public org.telegram.ui.web.v0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean h() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.ki
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ki
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

    @Override // org.telegram.ui.Components.ki
    public final void p() {
        ks.f(this.G).n(this, ks.z1);
        ks.e().n(this, ks.p4);
        org.telegram.ui.ActionBar.z t6 = this.b.V2.t();
        org.telegram.ui.ActionBar.r0 r0Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        t6.removeView(r0Var);
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

    @Override // org.telegram.ui.Components.ki
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

    @Override // org.telegram.ui.Components.ki
    public final void t() {
        si siVar = this.b;
        siVar.A0(false);
        siVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.ki
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        l2 l2Var = this.n;
        boolean z10 = l2Var.S;
        si siVar = this.b;
        if (!z10) {
            org.telegram.messenger.g0.P3(siVar.V2.getBackButton(), R.drawable.ic_ab_back);
        }
        siVar.V2.setBackground(null);
        if (l2Var.U) {
            l2Var.h();
            this.I = true;
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void w(int i7) {
        o3 o3Var = this.J;
        l2 l2Var = this.n;
        if (i7 == -1) {
            if (l2Var.D()) {
                return;
            }
            P();
            return;
        }
        si siVar = this.b;
        if (i7 == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            siVar.a2.presentFragment(new bn(bundle));
            siVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == R.id.menu_reload_page) {
            if (l2Var.getWebView() != null) {
                l2Var.getWebView().animate().cancel();
                l2Var.getWebView().animate().alpha(0.0f).start();
            }
            o3Var.setLoadProgress(0.0f);
            o3Var.setAlpha(1.0f);
            o3Var.setVisibility(0);
            l2Var.setBotUser(mp.u1(this.G).c2(Long.valueOf(this.w)));
            l2Var.s(this.G, this.w);
            ks.f(l2Var.N).d(new org.telegram.ui.web.q(l2Var, 1));
            return;
        }
        if (i7 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(this.G).b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    siVar.l1(tL_attachMenuBot2, mp.u1(this.G).c2(Long.valueOf(this.w)));
                    return;
                }
            }
            return;
        }
        if (i7 == R.id.menu_settings) {
            l2Var.getClass();
            l2Var.Q = System.currentTimeMillis();
            l2Var.y("settings_button_pressed", null);
        } else {
            if (i7 == R.id.menu_add_to_home_screen_bot) {
                ri.d0(this.G).A0(this.w, ri.f2, null);
                return;
            }
            if (i7 == R.id.menu_tos_bot) {
                vf.c.t(getContext(), gd.M0(2131752882, null));
                return;
            }
            if (i7 == R.id.menu_report_bot) {
                int i11 = this.G;
                Context context = getContext();
                lc lcVar = new lc(cb.a(getContext()), this.a);
                long j3 = this.w;
                int i12 = qy0.w1;
                qy0.K0(i11, context, j3, false, false, new ArrayList(), lcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.ki
    public final void z(int i7, boolean z10) {
        boolean z11;
        l2 l2Var = this.n;
        k2 k2Var = this.K;
        if (z10) {
            l2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY());
            if (k2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                k2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.b.p3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.P = true;
            k2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (l2Var.getWebView() != null) {
                int scrollY = l2Var.getWebView().getScrollY();
                int i10 = (Q - i7) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(pi.k.V);
                this.r.addUpdateListener(new l3(this, 0));
                this.r.addListener(new f2(this, i10, 1));
                this.r.start();
            }
        }
    }
}
