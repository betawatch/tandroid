package nh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.yh;
import org.telegram.ui.rn;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class e4 extends yh implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public int B;
    public String C;
    public boolean D;
    public y3 E;
    public s2 F;
    public org.telegram.ui.ActionBar.v0 G;
    public org.telegram.ui.ActionBar.f1 H;
    public org.telegram.ui.ActionBar.f1 I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public u3 Q;
    public boolean R;
    public int S;
    public x3 n;
    public ValueAnimator r;
    public boolean s;
    public long v;
    public long w;
    public long x;
    public int y;

    @Override // org.telegram.ui.Components.yh
    public final void E(yh yhVar) {
        x3 x3Var = this.n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        gi giVar = this.b;
        giVar.T0.setTitle(userName);
        this.F.setSwipeOffsetY(0.0f);
        if (x3Var.getWebView() != null) {
            x3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        if (n2Var != null) {
            x3Var.setParentActivity(n2Var.getParentActivity());
        }
        this.G.setVisibility(0);
        if (x3Var.N) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(giVar.T0.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.yh
    public final void F() {
        if (this.n.J) {
            L();
        }
        this.F.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new u3(this, 0));
    }

    @Override // org.telegram.ui.Components.yh
    public final void G() {
        s2 s2Var = this.F;
        s2Var.e(s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY()));
    }

    public final boolean K() {
        if (!this.O) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.N = formatName;
        alertDialog$Builder.a.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new w3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.show();
        ((TextView) b2Var.d(-1)).setTextColor(g6.v0(g6.q7, this.a));
        return false;
    }

    public final void L() {
        gi giVar = this.b;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        if ((n2Var instanceof rn) && ((rn) n2Var).T0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(giVar.b0.getFragmentView());
            AndroidUtilities.runOnUIThread(new u3(this, 1), 250L);
        } else {
            giVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            giVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var = this.n;
        if (i10 != NotificationCenter.webViewResultSent) {
            if (i10 == NotificationCenter.didSetNewTheme) {
                x3Var.n.b(g6.v0(g6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            x3Var.h();
            this.D = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean e() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean f() {
        return this.M;
    }

    @Override // org.telegram.ui.Components.yh
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.F.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        s2 s2Var = this.F;
        return (int) (s2Var.getOffsetY() + s2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.yh
    public int getCustomActionBarBackground() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.yh
    public int getCustomBackground() {
        return this.N;
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
    public int getListTopPadding() {
        return (int) this.F.getOffsetY();
    }

    public String getStartCommand() {
        return this.C;
    }

    public org.telegram.ui.web.z0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.yh
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean i() {
        if (this.n.z()) {
            return true;
        }
        K();
        return true;
    }

    @Override // org.telegram.ui.Components.yh
    public final void m() {
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.b.T0.n();
        org.telegram.ui.ActionBar.v0 v0Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(v0Var);
        this.n.h();
        this.P = true;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.K) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean q() {
        K();
        return false;
    }

    @Override // org.telegram.ui.Components.yh
    public final void r() {
        gi giVar = this.b;
        giVar.setFocusable(false);
        giVar.getWindow().setSoftInputMode(48);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.yh
    public final void s() {
        this.G.setVisibility(8);
        this.L = false;
        x3 x3Var = this.n;
        boolean z10 = x3Var.N;
        gi giVar = this.b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(giVar.T0.getBackButton(), R.drawable.ic_ab_back);
        }
        giVar.T0.setBackground(null);
        if (x3Var.P) {
            x3Var.h();
            this.D = true;
        }
    }

    public void setAllowSwipes(boolean z10) {
        this.F.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i10) {
        this.R = true;
        this.S = i10;
    }

    public void setCustomBackground(int i10) {
        this.N = i10;
        this.M = true;
    }

    public void setDelegate(org.telegram.ui.web.f0 f0Var) {
        this.n.setDelegate(f0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.J = i10;
        this.F.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.O = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.yh
    public final void u(int i10) {
        y3 y3Var = this.E;
        x3 x3Var = this.n;
        if (i10 == -1) {
            if (x3Var.z()) {
                return;
            }
            K();
            return;
        }
        int i11 = R.id.menu_open_bot;
        gi giVar = this.b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            giVar.b0.presentFragment(new rn(bundle));
            giVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (x3Var.getWebView() != null) {
                x3Var.getWebView().animate().cancel();
                x3Var.getWebView().animate().alpha(0.0f).start();
            }
            y3Var.setLoadProgress(0.0f);
            y3Var.setAlpha(1.0f);
            y3Var.setVisibility(0);
            x3Var.setBotUser(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
            x3Var.q(this.B, this.v);
            NotificationCenter.getInstance(x3Var.I).doOnIdle(new org.telegram.ui.web.u(x3Var, 2));
            return;
        }
        if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.B).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    giVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
            return;
        }
        if (i10 == R.id.menu_settings) {
            x3Var.getClass();
            x3Var.L = System.currentTimeMillis();
            x3Var.v("settings_button_pressed", null);
        } else {
            if (i10 == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.B).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i10 == R.id.menu_tos_bot) {
                we.e.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i10 == R.id.menu_report_bot) {
                int i13 = this.B;
                Context context = getContext();
                mc mcVar = new mc(ab.a(getContext()), this.a);
                long j10 = this.v;
                int i14 = x21.v;
                x21.K(i13, context, j10, false, false, new ArrayList(), mcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void w() {
        this.K = false;
        this.F.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.yh
    public final void x(int i10, boolean z10) {
        boolean z11;
        x3 x3Var = this.n;
        s2 s2Var = this.F;
        if (z10) {
            x3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY());
            if (s2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                s2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.b.n1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.K = true;
            s2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (x3Var.getWebView() != null) {
                int scrollY = x3Var.getWebView().getScrollY();
                int i11 = (R - i10) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(sh.m.V);
                int i12 = 1;
                this.r.addUpdateListener(new v3(this, i12));
                this.r.addListener(new n2(this, i11, i12));
                this.r.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // org.telegram.ui.Components.yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i10, int i11) {
        int i12;
        float f10;
        s2 s2Var = this.F;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                this.b.setAllowNestedScroll(true);
                if (i12 < 0) {
                    i12 = 0;
                }
                f10 = i12;
                if (s2Var.getOffsetY() == f10) {
                    this.s = true;
                    s2Var.setOffsetY(f10);
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
        f10 = i12;
        if (s2Var.getOffsetY() == f10) {
        }
    }
}
