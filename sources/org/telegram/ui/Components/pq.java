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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pq extends org.telegram.ui.ActionBar.e3 {
    public final Drawable b;
    public final mq c;
    public final oq d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.hb v;

    public pq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.c6) null, false);
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
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        lq lqVar = new lq(this, activity);
        lqVar.setFillViewport(true);
        lqVar.setWillNotDraw(false);
        lqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        lqVar.setPadding(i12, 0, i12, 0);
        this.containerView = lqVar;
        mq mqVar = new mq(this, activity);
        this.c = mqVar;
        mqVar.setOrientation(1);
        lqVar.addView(mqVar, w7.z5.x(-1, -2, 80));
        setCustomView(mqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        bk0 bk0Var = new bk0(activity);
        bk0Var.setAutoRepeat(false);
        bk0Var.f(R.raw.utyan_private, 120, 120, null);
        bk0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        bk0Var.d();
        mqVar.addView(bk0Var, w7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.sk.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        mqVar.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        mqVar.addView(textView2, w7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        sw0 sw0Var = new sw0(activity, null);
        sw0Var.setCallback(new nq(this, lqVar));
        sw0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        mqVar.addView(sw0Var, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        cr crVar = new cr(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.W0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
        crVar.w = true;
        frameLayout.setBackgroundDrawable(crVar);
        mqVar.addView(frameLayout, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        oq oqVar = new oq(activity);
        this.d = oqVar;
        oqVar.setBackgroundColor(getThemedColor(i11));
        oqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        oqVar.a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(oqVar);
        r(false);
    }

    public static void n(pq pqVar) {
        View childAt = pqVar.c.getChildAt(0);
        int[] iArr = pqVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(pqVar.e ? 6.0f : 19.0f), 0);
        if (pqVar.f != max) {
            pqVar.f = max;
            pqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void r(boolean z10) {
        int i10 = this.n;
        int i11 = this.r;
        oq oqVar = this.d;
        if (i10 != i11 || this.e) {
            oqVar.setVisibility(0);
            if (z10) {
                oqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                oqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            oqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            oqVar.setVisibility(4);
            oqVar.setAlpha(0.0f);
        }
    }
}
