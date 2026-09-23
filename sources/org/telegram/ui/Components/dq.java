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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dq extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final aq c;
    public final cq d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.cb v;

    public dq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.d6) null, false);
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
        int i11 = org.telegram.ui.ActionBar.h6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        zp zpVar = new zp(this, activity);
        zpVar.setFillViewport(true);
        zpVar.setWillNotDraw(false);
        zpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        zpVar.setPadding(i12, 0, i12, 0);
        this.containerView = zpVar;
        aq aqVar = new aq(this, activity);
        this.c = aqVar;
        aqVar.setOrientation(1);
        zpVar.addView(aqVar, w7.x5.x(-1, -2, 80));
        setCustomView(aqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        bj0 bj0Var = new bj0(activity);
        bj0Var.setAutoRepeat(false);
        bj0Var.f(R.raw.utyan_private, 120, 120, null);
        bj0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        bj0Var.d();
        aqVar.addView(bj0Var, w7.x5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.ul.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        aqVar.addView(textView, w7.x5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        aqVar.addView(textView2, w7.x5.t(-2, -2, 49, 30, 22, 30, 20));
        tv0 tv0Var = new tv0(activity, null);
        tv0Var.setCallback(new bq(this, zpVar));
        tv0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        aqVar.addView(tv0Var, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        qq qqVar = new qq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.h6.a7)), org.telegram.ui.ActionBar.h6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
        qqVar.w = true;
        frameLayout.setBackgroundDrawable(qqVar);
        aqVar.addView(frameLayout, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(activity, null);
        f9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(f9Var);
        cq cqVar = new cq(activity);
        this.d = cqVar;
        cqVar.setBackgroundColor(getThemedColor(i11));
        cqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        cqVar.a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(cqVar);
        p(false);
    }

    public static void m(dq dqVar) {
        View childAt = dqVar.c.getChildAt(0);
        int[] iArr = dqVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(dqVar.e ? 6.0f : 19.0f), 0);
        if (dqVar.f != max) {
            dqVar.f = max;
            dqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.n;
        int i11 = this.r;
        cq cqVar = this.d;
        if (i10 != i11 || this.e) {
            cqVar.setVisibility(0);
            if (z10) {
                cqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                cqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            cqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            cqVar.setVisibility(4);
            cqVar.setAlpha(0.0f);
        }
    }
}
