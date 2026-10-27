package hi;

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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o4 extends li implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public i4 I;
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
    public f4 U;
    public boolean V;
    public int W;
    public e3 n;
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

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        e3 e3Var = this.n;
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
        if (e3Var.getWebView() != null) {
            e3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if (r2Var != null) {
            e3Var.setParentActivity(r2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (e3Var.R) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(tiVar.a1.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.li
    public final void H() {
        if (this.n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new f4(this, 0));
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        d3 d3Var = this.J;
        d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
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
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new h4(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.show();
        f7.V((TextView) e2Var.d(-1), y6.q7, this.a);
        return false;
    }

    public final void O() {
        ti tiVar = this.b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if ((r2Var instanceof wn) && ((wn) r2Var).j1.Q() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(tiVar.f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new f4(this, 1), 250L);
        } else {
            tiVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            tiVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e3 e3Var = this.n;
        if (i10 != NotificationCenter.webViewResultSent) {
            if (i10 == NotificationCenter.didSetNewTheme) {
                e3Var.n.b(y6.w0(y6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            e3Var.h();
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
        d3 d3Var = this.J;
        return (int) (d3Var.getOffsetY() + d3Var.getSwipeOffsetY());
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

    public org.telegram.ui.web.a1 getWebViewContainer() {
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

    @Override // org.telegram.ui.Components.li
    public final void o() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z l4 = this.b.a1.l();
        org.telegram.ui.ActionBar.w0 w0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        l4.removeView(w0Var);
        this.n.h();
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

    @Override // org.telegram.ui.Components.li
    public final boolean r() {
        N();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.li
    public final void s() {
        ti tiVar = this.b;
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
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

    @Override // org.telegram.ui.Components.li
    public final void t() {
        this.K.setVisibility(8);
        this.P = false;
        e3 e3Var = this.n;
        boolean z10 = e3Var.R;
        ti tiVar = this.b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(tiVar.a1.getBackButton(), R.drawable.ic_ab_back);
        }
        tiVar.a1.setBackground(null);
        if (e3Var.T) {
            e3Var.h();
            this.H = true;
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void v(int i10) {
        i4 i4Var = this.I;
        e3 e3Var = this.n;
        if (i10 == -1) {
            if (e3Var.C()) {
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
            tiVar.f0.presentFragment(new wn(bundle));
            tiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (e3Var.getWebView() != null) {
                e3Var.getWebView().animate().cancel();
                e3Var.getWebView().animate().alpha(0.0f).start();
            }
            i4Var.setLoadProgress(0.0f);
            i4Var.setAlpha(1.0f);
            i4Var.setVisibility(0);
            e3Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            e3Var.s(this.F, this.v);
            NotificationCenter.getInstance(e3Var.M).doOnIdle(new org.telegram.ui.web.t(e3Var, 2));
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
            e3Var.getClass();
            e3Var.P = System.currentTimeMillis();
            e3Var.y("settings_button_pressed", null);
        } else {
            if (i10 == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i10 == R.id.menu_tos_bot) {
                qf.d.r(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i10 == R.id.menu_report_bot) {
                int i13 = this.F;
                Context context = getContext();
                wc wcVar = new wc(lb.a(getContext()), this.a);
                long j10 = this.v;
                int i14 = x21.w;
                x21.N(i13, context, j10, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void x() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.li
    public final void y(int i10, boolean z10) {
        boolean z11;
        e3 e3Var = this.n;
        d3 d3Var = this.J;
        if (z10) {
            e3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY());
            if (d3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                d3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.b.u1.Q() + i10;
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
            if (e3Var.getWebView() != null) {
                int scrollY = e3Var.getWebView().getScrollY();
                int i11 = (Q - i10) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(mi.m.V);
                int i12 = 1;
                this.r.addUpdateListener(new g4(this, i12));
                this.r.addListener(new y2(this, i11, i12));
                this.r.start();
            }
        }
    }
}
