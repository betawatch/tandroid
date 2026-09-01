package org.telegram.ui.Components;

import android.app.Activity;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cq extends org.telegram.ui.ActionBar.h3 {
    public final Drawable b;
    public final zp c;
    public final bq d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.za v;

    public cq(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
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
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        yp ypVar = new yp(this, activity);
        ypVar.setFillViewport(true);
        ypVar.setWillNotDraw(false);
        ypVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        ypVar.setPadding(i12, 0, i12, 0);
        this.containerView = ypVar;
        zp zpVar = new zp(this, activity);
        this.c = zpVar;
        zpVar.setOrientation(1);
        ypVar.addView(zpVar, k7.c6.x(-1, -2, 80));
        setCustomView(zpVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        lj0 lj0Var = new lj0(activity);
        lj0Var.setAutoRepeat(false);
        lj0Var.f(R.raw.utyan_private, 120, 120, null);
        lj0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        lj0Var.d();
        zpVar.addView(lj0Var, k7.c6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        zpVar.addView(textView, k7.c6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        zpVar.addView(textView2, k7.c6.t(-2, -2, 49, 30, 22, 30, 20));
        vv0 vv0Var = new vv0(activity, null);
        vv0Var.setCallback(new aq(this, ypVar));
        vv0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        zpVar.addView(vv0Var, k7.c6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        pq pqVar = new pq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.k6.a7)), org.telegram.ui.ActionBar.k6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        pqVar.w = true;
        frameLayout.setBackgroundDrawable(pqVar);
        zpVar.addView(frameLayout, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(activity, null);
        a9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(a9Var);
        bq bqVar = new bq(activity);
        this.d = bqVar;
        bqVar.setBackgroundColor(getThemedColor(i11));
        bqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        bqVar.a.setOnClickListener(new g0(this, 9));
        frameLayout.addView(bqVar);
        p(false);
    }

    public static void m(cq cqVar) {
        View childAt = cqVar.c.getChildAt(0);
        int[] iArr = cqVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(cqVar.e ? 6.0f : 19.0f), 0);
        if (cqVar.f != max) {
            cqVar.f = max;
            cqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z4) {
        int i10 = this.n;
        int i11 = this.r;
        bq bqVar = this.d;
        if (i10 != i11 || this.e) {
            bqVar.setVisibility(0);
            if (z4) {
                bqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                bqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z4) {
            bqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            bqVar.setVisibility(4);
            bqVar.setAlpha(0.0f);
        }
    }
}
