package mh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g4 extends ci implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public int B;
    public String C;
    public boolean D;
    public a4 E;
    public t2 F;
    public org.telegram.ui.ActionBar.w0 G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.g1 I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public w3 Q;
    public boolean R;
    public int S;
    public z3 n;
    public ValueAnimator r;
    public boolean s;
    public long v;
    public long w;
    public long x;
    public int y;

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        z3 z3Var = this.n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        ki kiVar = this.b;
        kiVar.T0.setTitle(userName);
        this.F.setSwipeOffsetY(0.0f);
        if (z3Var.getWebView() != null) {
            z3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (o2Var != null) {
            z3Var.setParentActivity(o2Var.getParentActivity());
        }
        this.G.setVisibility(0);
        if (z3Var.N) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(kiVar.T0.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.ci
    public final void E() {
        if (this.n.J) {
            K();
        }
        this.F.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new w3(this, 0));
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        t2 t2Var = this.F;
        t2Var.e(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()));
    }

    public final boolean J() {
        if (!this.O) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.N = formatName;
        alertDialog$Builder.a.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new y3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        ((TextView) c2Var.d(-1)).setTextColor(f6.v0(f6.q7, this.a));
        return false;
    }

    public final void K() {
        ki kiVar = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if ((o2Var instanceof qn) && ((qn) o2Var).T0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(kiVar.b0.getFragmentView());
            AndroidUtilities.runOnUIThread(new w3(this, 1), 250L);
        } else {
            kiVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            kiVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z3 z3Var = this.n;
        if (i9 != NotificationCenter.webViewResultSent) {
            if (i9 == NotificationCenter.didSetNewTheme) {
                z3Var.n.b(f6.v0(f6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            z3Var.h();
            this.D = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean e() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean f() {
        return this.M;
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.F.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        t2 t2Var = this.F;
        return (int) (t2Var.getOffsetY() + t2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.ci
    public int getCustomActionBarBackground() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.ci
    public int getCustomBackground() {
        return this.N;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return (int) this.F.getOffsetY();
    }

    public String getStartCommand() {
        return this.C;
    }

    public org.telegram.ui.web.y0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean i() {
        if (this.n.z()) {
            return true;
        }
        J();
        return true;
    }

    @Override // org.telegram.ui.Components.ci
    public final void m() {
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.b.T0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
        this.n.h();
        this.P = true;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.K) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i9, i10);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean p() {
        J();
        return false;
    }

    @Override // org.telegram.ui.Components.ci
    public final void q() {
        ki kiVar = this.b;
        kiVar.setFocusable(false);
        kiVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.ci
    public final void r() {
        this.G.setVisibility(8);
        this.L = false;
        z3 z3Var = this.n;
        boolean z10 = z3Var.N;
        ki kiVar = this.b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(kiVar.T0.getBackButton(), R.drawable.ic_ab_back);
        }
        kiVar.T0.setBackground(null);
        if (z3Var.P) {
            z3Var.h();
            this.D = true;
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
        this.F.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i9) {
        this.R = true;
        this.S = i9;
    }

    public void setCustomBackground(int i9) {
        this.N = i9;
        this.M = true;
    }

    public void setDelegate(org.telegram.ui.web.e0 e0Var) {
        this.n.setDelegate(e0Var);
    }

    public void setMeasureOffsetY(int i9) {
        this.J = i9;
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

    @Override // org.telegram.ui.Components.ci
    public final void t(int i9) {
        a4 a4Var = this.E;
        z3 z3Var = this.n;
        if (i9 == -1) {
            if (z3Var.z()) {
                return;
            }
            J();
            return;
        }
        int i10 = R.id.menu_open_bot;
        ki kiVar = this.b;
        if (i9 == i10) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            kiVar.b0.presentFragment(new qn(bundle));
            kiVar.dismiss();
            return;
        }
        int i11 = 0;
        if (i9 == R.id.menu_reload_page) {
            if (z3Var.getWebView() != null) {
                z3Var.getWebView().animate().cancel();
                z3Var.getWebView().animate().alpha(0.0f).start();
            }
            a4Var.setLoadProgress(0.0f);
            a4Var.setAlpha(1.0f);
            a4Var.setVisibility(0);
            z3Var.setBotUser(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
            z3Var.q(this.B, this.v);
            NotificationCenter.getInstance(z3Var.I).doOnIdle(new org.telegram.ui.web.t(z3Var, 2));
            return;
        }
        if (i9 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.B).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    kiVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
            return;
        }
        if (i9 == R.id.menu_settings) {
            z3Var.getClass();
            z3Var.L = System.currentTimeMillis();
            z3Var.v("settings_button_pressed", null);
        } else {
            if (i9 == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.B).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i9 == R.id.menu_tos_bot) {
                ve.e.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i9 == R.id.menu_report_bot) {
                int i12 = this.B;
                Context context = getContext();
                oc ocVar = new oc(cb.a(getContext()), this.a);
                long j10 = this.v;
                int i13 = y21.v;
                y21.J(i12, context, j10, false, false, new ArrayList(), ocVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void v() {
        this.K = false;
        this.F.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i9, boolean z10) {
        boolean z11;
        z3 z3Var = this.n;
        t2 t2Var = this.F;
        if (z10) {
            z3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY());
            if (t2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                t2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.b.n1.R() + i9;
            setMeasuredDimension(getMeasuredWidth(), i9);
            this.K = true;
            t2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (z3Var.getWebView() != null) {
                int scrollY = z3Var.getWebView().getScrollY();
                int i10 = (R - i9) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(rh.m.V);
                int i11 = 1;
                this.r.addUpdateListener(new x3(this, i11));
                this.r.addListener(new o2(this, i10, i11));
                this.r.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int i11;
        float f10;
        t2 t2Var = this.F;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                this.b.setAllowNestedScroll(true);
                if (i11 < 0) {
                    i11 = 0;
                }
                f10 = i11;
                if (t2Var.getOffsetY() == f10) {
                    this.s = true;
                    t2Var.setOffsetY(f10);
                    this.s = false;
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        this.b.setAllowNestedScroll(true);
        if (i11 < 0) {
        }
        f10 = i11;
        if (t2Var.getOffsetY() == f10) {
        }
    }
}
