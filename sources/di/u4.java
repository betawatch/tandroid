package di;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.eo;
import org.telegram.ui.h41;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u4 extends qi implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public o4 I;
    public d3 J;
    public org.telegram.ui.ActionBar.w0 K;
    public org.telegram.ui.ActionBar.g1 L;
    public org.telegram.ui.ActionBar.g1 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public j4 U;
    public boolean V;
    public int W;
    public n4 n;
    public ValueAnimator r;
    public boolean s;
    public long v;
    public long w;
    public long x;
    public int y;

    @Override // org.telegram.ui.Components.qi
    public final void D(qi qiVar) {
        n4 n4Var = this.n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        yi yiVar = this.b;
        yiVar.X0.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (n4Var.getWebView() != null) {
            n4Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
        if (p2Var != null) {
            n4Var.setParentActivity(p2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (n4Var.R) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(yiVar.X0.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.qi
    public final void E() {
        if (this.n.N) {
            L();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new j4(this, 0));
    }

    @Override // org.telegram.ui.Components.qi
    public final void F() {
        d3 d3Var = this.J;
        d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
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
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new m4(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.show();
        ((TextView) d2Var.d(-1)).setTextColor(j6.v0(j6.q7, this.a));
        return false;
    }

    public final void L() {
        yi yiVar = this.b;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
        if ((p2Var instanceof eo) && ((eo) p2Var).X0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(yiVar.f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new j4(this, 1), 250L);
        } else {
            yiVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            yiVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        n4 n4Var = this.n;
        if (i10 != NotificationCenter.webViewResultSent) {
            if (i10 == NotificationCenter.didSetNewTheme) {
                n4Var.n.b(j6.v0(j6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            n4Var.i();
            this.H = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean e() {
        return this.V;
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean f() {
        return this.Q;
    }

    @Override // org.telegram.ui.Components.qi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        d3 d3Var = this.J;
        return (int) (d3Var.getOffsetY() + d3Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.qi
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.qi
    public int getCustomBackground() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.qi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.qi
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.c1 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.qi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean i() {
        if (this.n.D()) {
            return true;
        }
        K();
        return true;
    }

    @Override // org.telegram.ui.Components.qi
    public final void m() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.b.X0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
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

    @Override // org.telegram.ui.Components.qi
    public final boolean p() {
        K();
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final void q() {
        yi yiVar = this.b;
        yiVar.setFocusable(false);
        yiVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.qi
    public final void r() {
        this.K.setVisibility(8);
        this.P = false;
        n4 n4Var = this.n;
        boolean z10 = n4Var.R;
        yi yiVar = this.b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(yiVar.X0.getBackButton(), R.drawable.ic_ab_back);
        }
        yiVar.X0.setBackground(null);
        if (n4Var.T) {
            n4Var.i();
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

    @Override // org.telegram.ui.Components.qi
    public final void t(int i10) {
        o4 o4Var = this.I;
        n4 n4Var = this.n;
        if (i10 == -1) {
            if (n4Var.D()) {
                return;
            }
            K();
            return;
        }
        int i11 = R.id.menu_open_bot;
        yi yiVar = this.b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            yiVar.f0.presentFragment(new eo(bundle));
            yiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (n4Var.getWebView() != null) {
                n4Var.getWebView().animate().cancel();
                n4Var.getWebView().animate().alpha(0.0f).start();
            }
            o4Var.setLoadProgress(0.0f);
            o4Var.setAlpha(1.0f);
            o4Var.setVisibility(0);
            n4Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            n4Var.t(this.F, this.v);
            NotificationCenter.getInstance(n4Var.M).doOnIdle(new org.telegram.ui.web.t(n4Var, 2));
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
                    yiVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
            return;
        }
        if (i10 == R.id.menu_settings) {
            n4Var.getClass();
            n4Var.P = System.currentTimeMillis();
            n4Var.y("settings_button_pressed", null);
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
                wc wcVar = new wc(kb.a(getContext()), this.a);
                long j3 = this.v;
                int i14 = h41.v;
                h41.K(i13, context, j3, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final void v() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.qi
    public final void w(int i10, boolean z10) {
        boolean z11;
        n4 n4Var = this.n;
        d3 d3Var = this.J;
        if (z10) {
            n4Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY());
            if (d3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                d3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.b.r1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            d3Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (n4Var.getWebView() != null) {
                int scrollY = n4Var.getWebView().getScrollY();
                int i11 = (R - i10) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(ii.n.V);
                int i12 = 1;
                this.r.addUpdateListener(new l4(this, i12));
                this.r.addListener(new y2(this, i11, i12));
                this.r.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        float f7;
        d3 d3Var = this.J;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                this.b.setAllowNestedScroll(true);
                if (i12 < 0) {
                    i12 = 0;
                }
                f7 = i12;
                if (d3Var.getOffsetY() == f7) {
                    this.s = true;
                    d3Var.setOffsetY(f7);
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
        if (d3Var.getOffsetY() == f7) {
        }
    }
}
