package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xc;
import org.telegram.ui.s21;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f4 extends li implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public z3 I;
    public u2 J;
    public org.telegram.ui.ActionBar.u0 K;
    public org.telegram.ui.ActionBar.e1 L;
    public org.telegram.ui.ActionBar.e1 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public w3 U;
    public boolean V;
    public int W;
    public v2 n;
    public ValueAnimator r;
    public boolean s;
    public long v;
    public long w;
    public long x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        float f7;
        u2 u2Var = this.J;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                this.b.setAllowNestedScroll(true);
                if (i12 < 0) {
                    i12 = 0;
                }
                f7 = i12;
                if (u2Var.getOffsetY() == f7) {
                    this.s = true;
                    u2Var.setOffsetY(f7);
                    this.s = false;
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        this.b.setAllowNestedScroll(true);
        if (i12 < 0) {
        }
        f7 = i12;
        if (u2Var.getOffsetY() == f7) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void F(li liVar) {
        v2 v2Var = this.n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        ti tiVar = this.b;
        tiVar.a1.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (v2Var.getWebView() != null) {
            v2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
        if (o2Var != null) {
            v2Var.setParentActivity(o2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (v2Var.R) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(tiVar.a1.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.li
    public final void I() {
        if (this.n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new w3(this, 0));
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        u2 u2Var = this.J;
        u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
    }

    public final boolean N() {
        if (!this.S) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.R = formatName;
        alertDialog$Builder.a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new y3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        r6.W((TextView) c2Var.d(-1), k6.q7, this.a);
        return false;
    }

    public final void O() {
        ti tiVar = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
        if ((o2Var instanceof sn) && ((sn) o2Var).j1.Q() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(tiVar.f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new w3(this, 1), 250L);
        } else {
            tiVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            tiVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v2 v2Var = this.n;
        if (i10 != NotificationCenter.webViewResultSent) {
            if (i10 == NotificationCenter.didSetNewTheme) {
                v2Var.n.b(k6.w0(k6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            v2Var.h();
            this.H = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean f() {
        return this.V;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean g() {
        return this.Q;
    }

    @Override // org.telegram.ui.Components.li
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        u2 u2Var = this.J;
        return (int) (u2Var.getOffsetY() + u2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.li
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.li
    public int getCustomBackground() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.b1 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean j() {
        if (this.n.C()) {
            return true;
        }
        N();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void p() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.y m10 = this.b.a1.m();
        org.telegram.ui.ActionBar.u0 u0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        m10.removeView(u0Var);
        this.n.h();
        this.T = true;
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.li
    public final boolean s() {
        N();
        return false;
    }

    public void setAllowSwipes(boolean z10) {
        this.J.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i10) {
        this.V = true;
        this.W = i10;
    }

    public void setCustomBackground(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setDelegate(org.telegram.ui.web.h0 h0Var) {
        this.n.setDelegate(h0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.N = i10;
        this.J.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.S = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
        ti tiVar = this.b;
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.li
    public final void u() {
        this.K.setVisibility(8);
        this.P = false;
        v2 v2Var = this.n;
        boolean z10 = v2Var.R;
        ti tiVar = this.b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(tiVar.a1.getBackButton(), R.drawable.ic_ab_back);
        }
        tiVar.a1.setBackground(null);
        if (v2Var.T) {
            v2Var.h();
            this.H = true;
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void w(int i10) {
        z3 z3Var = this.I;
        v2 v2Var = this.n;
        if (i10 == -1) {
            if (v2Var.C()) {
                return;
            }
            N();
            return;
        }
        int i11 = R.id.menu_open_bot;
        ti tiVar = this.b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            tiVar.f0.presentFragment(new sn(bundle));
            tiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (v2Var.getWebView() != null) {
                v2Var.getWebView().animate().cancel();
                v2Var.getWebView().animate().alpha(0.0f).start();
            }
            z3Var.setLoadProgress(0.0f);
            z3Var.setAlpha(1.0f);
            z3Var.setVisibility(0);
            v2Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            v2Var.s(this.F, this.v);
            NotificationCenter.getInstance(v2Var.M).doOnIdle(new org.telegram.ui.web.t(v2Var, 2));
            return;
        }
        if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    tiVar.C1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
            return;
        }
        if (i10 == R.id.menu_settings) {
            v2Var.getClass();
            v2Var.P = System.currentTimeMillis();
            v2Var.y("settings_button_pressed", null);
        } else {
            if (i10 == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i10 == R.id.menu_tos_bot) {
                pf.d.r(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i10 == R.id.menu_report_bot) {
                int i13 = this.F;
                Context context = getContext();
                xc xcVar = new xc(lb.a(getContext()), this.a);
                long j10 = this.v;
                int i14 = s21.w;
                s21.N(i13, context, j10, false, false, new ArrayList(), xcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.li
    public final void z(int i10, boolean z10) {
        boolean z11;
        v2 v2Var = this.n;
        u2 u2Var = this.J;
        if (z10) {
            v2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY());
            if (u2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                u2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.b.u1.Q() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            u2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (v2Var.getWebView() != null) {
                int scrollY = v2Var.getWebView().getScrollY();
                int i11 = (Q - i10) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(li.m.V);
                int i12 = 1;
                this.r.addUpdateListener(new x3(this, i12));
                this.r.addListener(new p2(this, i11, i12));
                this.r.start();
            }
        }
    }
}
