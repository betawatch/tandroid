package ei;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.u31;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class q4 extends oi implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public k4 I;
    public a3 J;
    public org.telegram.ui.ActionBar.v0 K;
    public org.telegram.ui.ActionBar.f1 L;
    public org.telegram.ui.ActionBar.f1 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public g4 U;
    public boolean V;
    public int W;
    public j4 n;
    public ValueAnimator r;
    public boolean s;
    public long v;
    public long w;
    public long x;
    public int y;

    @Override // org.telegram.ui.Components.oi
    public final void E(oi oiVar) {
        j4 j4Var = this.n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        wi wiVar = this.b;
        wiVar.X0.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (j4Var.getWebView() != null) {
            j4Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f0;
        if (n2Var != null) {
            j4Var.setParentActivity(n2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (j4Var.R) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(wiVar.X0.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.oi
    public final void F() {
        if (this.n.N) {
            L();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new g4(this, 0));
    }

    @Override // org.telegram.ui.Components.oi
    public final void G() {
        a3 a3Var = this.J;
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    public final boolean K() {
        if (!this.S) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.R = formatName;
        alertDialog$Builder.a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new i4(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.show();
        ((TextView) b2Var.d(-1)).setTextColor(h6.v0(h6.q7, this.a));
        return false;
    }

    public final void L() {
        wi wiVar = this.b;
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f0;
        if ((n2Var instanceof xn) && ((xn) n2Var).X0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(wiVar.f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new g4(this, 1), 250L);
        } else {
            wiVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            wiVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j4 j4Var = this.n;
        if (i10 != NotificationCenter.webViewResultSent) {
            if (i10 == NotificationCenter.didSetNewTheme) {
                j4Var.n.b(h6.v0(h6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            j4Var.i();
            this.H = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean e() {
        return this.V;
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean f() {
        return this.Q;
    }

    @Override // org.telegram.ui.Components.oi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.oi
    public int getCurrentItemTop() {
        a3 a3Var = this.J;
        return (int) (a3Var.getOffsetY() + a3Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.oi
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.oi
    public int getCustomBackground() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.oi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.oi
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.b1 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.oi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean i() {
        if (this.n.D()) {
            return true;
        }
        K();
        return true;
    }

    @Override // org.telegram.ui.Components.oi
    public final void m() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.b.X0.n();
        org.telegram.ui.ActionBar.v0 v0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(v0Var);
        this.n.i();
        this.T = true;
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean p() {
        K();
        return false;
    }

    @Override // org.telegram.ui.Components.oi
    public final void q() {
        wi wiVar = this.b;
        wiVar.setFocusable(false);
        wiVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.oi
    public final void r() {
        this.K.setVisibility(8);
        this.P = false;
        j4 j4Var = this.n;
        boolean z10 = j4Var.R;
        wi wiVar = this.b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(wiVar.X0.getBackButton(), R.drawable.ic_ab_back);
        }
        wiVar.X0.setBackground(null);
        if (j4Var.T) {
            j4Var.i();
            this.H = true;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
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

    public void setDelegate(org.telegram.ui.web.g0 g0Var) {
        this.n.setDelegate(g0Var);
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

    @Override // org.telegram.ui.Components.oi
    public final void t(int i10) {
        k4 k4Var = this.I;
        j4 j4Var = this.n;
        if (i10 == -1) {
            if (j4Var.D()) {
                return;
            }
            K();
            return;
        }
        int i11 = R.id.menu_open_bot;
        wi wiVar = this.b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            wiVar.f0.presentFragment(new xn(bundle));
            wiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (j4Var.getWebView() != null) {
                j4Var.getWebView().animate().cancel();
                j4Var.getWebView().animate().alpha(0.0f).start();
            }
            k4Var.setLoadProgress(0.0f);
            k4Var.setAlpha(1.0f);
            k4Var.setVisibility(0);
            j4Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            j4Var.t(this.F, this.v);
            NotificationCenter.getInstance(j4Var.M).doOnIdle(new org.telegram.ui.web.s(j4Var, 2));
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
                    wiVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
            return;
        }
        if (i10 == R.id.menu_settings) {
            j4Var.getClass();
            j4Var.P = System.currentTimeMillis();
            j4Var.z("settings_button_pressed", null);
        } else {
            if (i10 == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i10 == R.id.menu_tos_bot) {
                nf.f.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i10 == R.id.menu_report_bot) {
                int i13 = this.F;
                Context context = getContext();
                xc xcVar = new xc(lb.a(getContext()), this.a);
                long j3 = this.v;
                int i14 = u31.v;
                u31.K(i13, context, j3, false, false, new ArrayList(), xcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.oi
    public final void v() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.oi
    public final void w(int i10, boolean z10) {
        boolean z11;
        j4 j4Var = this.n;
        a3 a3Var = this.J;
        if (z10) {
            j4Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY());
            if (a3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                a3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.b.r1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (j4Var.getWebView() != null) {
                int scrollY = j4Var.getWebView().getScrollY();
                int i11 = (R - i10) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(ji.n.V);
                int i12 = 1;
                this.r.addUpdateListener(new h4(this, i12));
                this.r.addListener(new v2(this, i11, i12));
                this.r.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // org.telegram.ui.Components.oi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        float f7;
        a3 a3Var = this.J;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                this.b.setAllowNestedScroll(true);
                if (i12 < 0) {
                    i12 = 0;
                }
                f7 = i12;
                if (a3Var.getOffsetY() == f7) {
                    this.s = true;
                    a3Var.setOffsetY(f7);
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
        if (a3Var.getOffsetY() == f7) {
        }
    }
}
