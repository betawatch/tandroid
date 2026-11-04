package ii;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.wa;
import org.telegram.ui.ey0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d4 extends th implements cs {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public w3 J;
    public r2 K;
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
    public s3 V;
    public boolean W;
    public int a0;
    public s2 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int i11;
        float f10;
        r2 r2Var = this.K;
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                this.b.r0 = true;
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
        this.b.r0 = true;
        if (i11 < 0) {
        }
        f10 = i11;
        if (r2Var.getOffsetY() == f10) {
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        s2 s2Var = this.n;
        CharSequence p10 = l10.p(hp.s1(this.G).a2(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        bi biVar = this.b;
        biVar.S2.setTitle(p10);
        this.K.setSwipeOffsetY(0.0f);
        if (s2Var.getWebView() != null) {
            s2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var != null) {
            s2Var.setParentActivity(d2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (s2Var.S) {
            return;
        }
        org.telegram.messenger.g0.R3(biVar.S2.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.th
    public final void I() {
        if (this.n.O) {
            P();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.h3(new s3(this, 0));
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        r2 r2Var = this.K;
        r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.Components.th
    public final boolean M() {
        return false;
    }

    public final boolean O() {
        if (!this.T) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User a22 = hp.s1(this.G).a2(Long.valueOf(this.w));
        String m10 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = m10;
        s1Var.U = bd.M0(2131752917, null);
        alertDialog$Builder.k(bd.M0(2131752916, null), new u3(this));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        s1Var.show();
        r6.V((TextView) s1Var.d(-1), k6.q7, this.a);
        return false;
    }

    public final void P() {
        bi biVar = this.b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if ((d2Var instanceof wm) && ((wm) d2Var).m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(biVar.X1.getFragmentView());
            org.telegram.messenger.g0.i3(new s3(this, 1), 250L);
        } else {
            biVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            biVar.A0(true);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        s2 s2Var = this.n;
        if (i3 != hs.z1) {
            if (i3 == hs.n4) {
                s2Var.n.b(k6.w0(k6.h5, this.a), hs.j2);
                return;
            }
            return;
        }
        if (this.y == ((Long) objArr[0]).longValue()) {
            s2Var.h();
            this.I = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.th
    public final boolean g() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.th
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        r2 r2Var = this.K;
        return (int) (r2Var.getOffsetY() + r2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.th
    public int getCustomActionBarBackground() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.th
    public int getCustomBackground() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public org.telegram.ui.web.w0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.th
    public final boolean h() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.th
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.th
    public final boolean k() {
        if (this.n.C()) {
            return true;
        }
        O();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.P) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i3, i10);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void p() {
        hs.f(this.G).n(this, hs.z1);
        hs.e().n(this, hs.n4);
        org.telegram.ui.ActionBar.x q10 = this.b.S2.q();
        org.telegram.ui.ActionBar.q0 q0Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        q10.removeView(q0Var);
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

    @Override // org.telegram.ui.Components.th
    public final boolean s() {
        O();
        return false;
    }

    public void setAllowSwipes(boolean z10) {
        this.K.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i3) {
        this.W = true;
        this.a0 = i3;
    }

    public void setCustomBackground(int i3) {
        this.S = i3;
        this.R = true;
    }

    public void setDelegate(org.telegram.ui.web.d0 d0Var) {
        this.n.setDelegate(d0Var);
    }

    public void setMeasureOffsetY(int i3) {
        this.O = i3;
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

    @Override // org.telegram.ui.Components.th
    public final void t() {
        bi biVar = this.b;
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.th
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        s2 s2Var = this.n;
        boolean z10 = s2Var.S;
        bi biVar = this.b;
        if (!z10) {
            org.telegram.messenger.g0.R3(biVar.S2.getBackButton(), R.drawable.ic_ab_back);
        }
        biVar.S2.setBackground(null);
        if (s2Var.U) {
            s2Var.h();
            this.I = true;
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void w(int i3) {
        w3 w3Var = this.J;
        s2 s2Var = this.n;
        if (i3 == -1) {
            if (s2Var.C()) {
                return;
            }
            O();
            return;
        }
        bi biVar = this.b;
        if (i3 == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            biVar.X1.presentFragment(new wm(bundle));
            biVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i3 == R.id.menu_reload_page) {
            if (s2Var.getWebView() != null) {
                s2Var.getWebView().animate().cancel();
                s2Var.getWebView().animate().alpha(0.0f).start();
            }
            w3Var.setLoadProgress(0.0f);
            w3Var.setAlpha(1.0f);
            w3Var.setVisibility(0);
            s2Var.setBotUser(hp.s1(this.G).a2(Long.valueOf(this.w)));
            s2Var.s(this.G, this.w);
            hs.f(s2Var.N).d(new org.telegram.ui.web.r(s2Var, 1));
            return;
        }
        if (i3 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(this.G).b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    biVar.k1(tL_attachMenuBot2, hp.s1(this.G).a2(Long.valueOf(this.w)));
                    return;
                }
            }
            return;
        }
        if (i3 == R.id.menu_settings) {
            s2Var.getClass();
            s2Var.Q = System.currentTimeMillis();
            s2Var.y("settings_button_pressed", null);
        } else {
            if (i3 == R.id.menu_add_to_home_screen_bot) {
                li.b0(this.G).y0(this.w, li.d2, null);
                return;
            }
            if (i3 == R.id.menu_tos_bot) {
                sf.c.t(getContext(), bd.M0(2131752893, null));
                return;
            }
            if (i3 == R.id.menu_report_bot) {
                int i11 = this.G;
                Context context = getContext();
                fc fcVar = new fc(wa.a(getContext()), this.a);
                long j10 = this.w;
                int i12 = ey0.t1;
                ey0.J0(i11, context, j10, false, false, new ArrayList(), fcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.th
    public final void z(int i3, boolean z10) {
        boolean z11;
        s2 s2Var = this.n;
        r2 r2Var = this.K;
        if (z10) {
            s2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY());
            if (r2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                r2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.b.m3.Q() + i3;
            setMeasuredDimension(getMeasuredWidth(), i3);
            this.P = true;
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (s2Var.getWebView() != null) {
                int scrollY = s2Var.getWebView().getScrollY();
                int i10 = (Q - i3) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(ni.l.V);
                this.r.addUpdateListener(new t3(this, 0));
                this.r.addListener(new m2(this, i10, 1));
                this.r.start();
            }
        }
    }
}
