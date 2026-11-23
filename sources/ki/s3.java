package ki;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class s3 extends mi implements gs {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public n3 J;
    public j2 K;
    public org.telegram.ui.ActionBar.q0 L;
    public org.telegram.ui.ActionBar.y0 M;
    public org.telegram.ui.ActionBar.y0 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public j3 V;
    public boolean W;
    public int a0;
    public k2 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // org.telegram.ui.Components.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        float f10;
        j2 j2Var = this.K;
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                this.b.r0 = true;
                if (i11 < 0) {
                    i11 = 0;
                }
                f10 = i11;
                if (j2Var.getOffsetY() == f10) {
                    this.s = true;
                    j2Var.setOffsetY(f10);
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
        if (j2Var.getOffsetY() == f10) {
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void I(mi miVar) {
        k2 k2Var = this.n;
        CharSequence q10 = p10.q(np.u1(this.G).c2(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            q10 = j6.m(q10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        ui uiVar = this.b;
        uiVar.V2.setTitle(q10);
        this.K.setSwipeOffsetY(0.0f);
        if (k2Var.getWebView() != null) {
            k2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
        if (g2Var != null) {
            k2Var.setParentActivity(g2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (k2Var.S) {
            return;
        }
        org.telegram.messenger.g0.P3(uiVar.V2.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.mi
    public final void J() {
        if (this.n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.g3(new j3(this, 0));
    }

    @Override // org.telegram.ui.Components.mi
    public final void K() {
        j2 j2Var = this.K;
        j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        if (!this.T) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User c22 = np.u1(this.G).c2(Long.valueOf(this.w));
        String m10 = c22 != null ? i5.m(0, c22.first_name, c22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = m10;
        t1Var.U = hd.N0(2131752905, null);
        alertDialog$Builder.k(hd.N0(2131752904, null), new l3(this));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        t1Var.show();
        t6.U((TextView) t1Var.d(-1), m6.q7, this.a);
        return false;
    }

    public final void Q() {
        ui uiVar = this.b;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
        if ((g2Var instanceof bn) && ((bn) g2Var).m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(uiVar.a2.getFragmentView());
            org.telegram.messenger.g0.h3(new j3(this, 1), 250L);
        } else {
            uiVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            uiVar.A0(true);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        k2 k2Var = this.n;
        if (i7 != ls.z1) {
            if (i7 == ls.q4) {
                k2Var.n.b(m6.w0(m6.h5, this.a), ls.j2);
                return;
            }
            return;
        }
        if (this.y == ((Long) objArr[0]).longValue()) {
            k2Var.h();
            this.I = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean g() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.mi
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.mi
    public int getCurrentItemTop() {
        j2 j2Var = this.K;
        return (int) (j2Var.getOffsetY() + j2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.mi
    public int getCustomActionBarBackground() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.mi
    public int getCustomBackground() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.mi
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.mi
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public org.telegram.ui.web.v0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean h() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.mi
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.mi
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

    @Override // org.telegram.ui.Components.mi
    public final void p() {
        ls.f(this.G).n(this, ls.z1);
        ls.e().n(this, ls.q4);
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

    @Override // org.telegram.ui.Components.mi
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

    @Override // org.telegram.ui.Components.mi
    public final void t() {
        ui uiVar = this.b;
        uiVar.A0(false);
        uiVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.mi
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        k2 k2Var = this.n;
        boolean z10 = k2Var.S;
        ui uiVar = this.b;
        if (!z10) {
            org.telegram.messenger.g0.P3(uiVar.V2.getBackButton(), R.drawable.ic_ab_back);
        }
        uiVar.V2.setBackground(null);
        if (k2Var.U) {
            k2Var.h();
            this.I = true;
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void w(int i7) {
        n3 n3Var = this.J;
        k2 k2Var = this.n;
        if (i7 == -1) {
            if (k2Var.D()) {
                return;
            }
            P();
            return;
        }
        ui uiVar = this.b;
        if (i7 == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            uiVar.a2.presentFragment(new bn(bundle));
            uiVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == R.id.menu_reload_page) {
            if (k2Var.getWebView() != null) {
                k2Var.getWebView().animate().cancel();
                k2Var.getWebView().animate().alpha(0.0f).start();
            }
            n3Var.setLoadProgress(0.0f);
            n3Var.setAlpha(1.0f);
            n3Var.setVisibility(0);
            k2Var.setBotUser(np.u1(this.G).c2(Long.valueOf(this.w)));
            k2Var.s(this.G, this.w);
            ls.f(k2Var.N).d(new org.telegram.ui.web.q(k2Var, 1));
            return;
        }
        if (i7 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.d0(this.G).b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    uiVar.l1(tL_attachMenuBot2, np.u1(this.G).c2(Long.valueOf(this.w)));
                    return;
                }
            }
            return;
        }
        if (i7 == R.id.menu_settings) {
            k2Var.getClass();
            k2Var.Q = System.currentTimeMillis();
            k2Var.y("settings_button_pressed", null);
        } else {
            if (i7 == R.id.menu_add_to_home_screen_bot) {
                si.d0(this.G).A0(this.w, si.f2, null);
                return;
            }
            if (i7 == R.id.menu_tos_bot) {
                vf.c.t(getContext(), hd.N0(2131752881, null));
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

    @Override // org.telegram.ui.Components.mi
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.mi
    public final void z(int i7, boolean z10) {
        boolean z11;
        k2 k2Var = this.n;
        j2 j2Var = this.K;
        if (z10) {
            k2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY());
            if (j2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                j2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.b.p3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.P = true;
            j2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (k2Var.getWebView() != null) {
                int scrollY = k2Var.getWebView().getScrollY();
                int i10 = (Q - i7) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(pi.k.V);
                this.r.addUpdateListener(new k3(this, 0));
                this.r.addListener(new e2(this, i10, 1));
                this.r.start();
            }
        }
    }
}
