package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class bq extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final yp c;
    public final aq d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.cb v;

    public bq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.f6) null, false);
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.id);
        int i10 = chatFull != null ? chatFull.ttl_period : 0;
        if (i10 == 0) {
            this.n = 0;
            this.r = 0;
        } else if (i10 == 86400) {
            this.n = 1;
            this.r = 1;
        } else if (i10 == 604800) {
            this.n = 2;
            this.r = 2;
        } else {
            this.n = 3;
            this.r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.b = mutate;
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        xp xpVar = new xp(this, activity);
        xpVar.setFillViewport(true);
        xpVar.setWillNotDraw(false);
        xpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        xpVar.setPadding(i12, 0, i12, 0);
        this.containerView = xpVar;
        yp ypVar = new yp(this, activity);
        this.c = ypVar;
        ypVar.setOrientation(1);
        xpVar.addView(ypVar, w7.x5.x(-1, -2, 80));
        setCustomView(ypVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        aj0 aj0Var = new aj0(activity);
        aj0Var.setAutoRepeat(false);
        aj0Var.f(R.raw.utyan_private, 120, 120, null);
        aj0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        aj0Var.d();
        ypVar.addView(aj0Var, w7.x5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.vl.j(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        ypVar.addView(textView, w7.x5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        ypVar.addView(textView2, w7.x5.t(-2, -2, 49, 30, 22, 30, 20));
        sv0 sv0Var = new sv0(activity, null);
        sv0Var.setCallback(new zp(this, xpVar));
        sv0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        ypVar.addView(sv0Var, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        oq oqVar = new oq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        oqVar.w = true;
        frameLayout.setBackgroundDrawable(oqVar);
        ypVar.addView(frameLayout, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        aq aqVar = new aq(activity);
        this.d = aqVar;
        aqVar.setBackgroundColor(getThemedColor(i11));
        aqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        aqVar.a.setOnClickListener(new g0(this, 9));
        frameLayout.addView(aqVar);
        p(false);
    }

    public static void m(bq bqVar) {
        View childAt = bqVar.c.getChildAt(0);
        int[] iArr = bqVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(bqVar.e ? 6.0f : 19.0f), 0);
        if (bqVar.f != max) {
            bqVar.f = max;
            bqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.n;
        int i11 = this.r;
        aq aqVar = this.d;
        if (i10 != i11 || this.e) {
            aqVar.setVisibility(0);
            if (z10) {
                aqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                aqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            aqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            aqVar.setVisibility(4);
            aqVar.setAlpha(0.0f);
        }
    }
}
