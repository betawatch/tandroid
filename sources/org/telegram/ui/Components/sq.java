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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sq extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final pq c;
    public final rq d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.db v;

    public sq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.e6) null, false);
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
        int i11 = org.telegram.ui.ActionBar.i6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        oq oqVar = new oq(this, activity);
        oqVar.setFillViewport(true);
        oqVar.setWillNotDraw(false);
        oqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        oqVar.setPadding(i12, 0, i12, 0);
        this.containerView = oqVar;
        pq pqVar = new pq(this, activity);
        this.c = pqVar;
        pqVar.setOrientation(1);
        oqVar.addView(pqVar, w7.x5.x(-1, -2, 80));
        setCustomView(pqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        fk0 fk0Var = new fk0(activity);
        fk0Var.setAutoRepeat(false);
        fk0Var.f(R.raw.utyan_private, 120, 120, null);
        fk0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        fk0Var.d();
        pqVar.addView(fk0Var, w7.x5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.bi.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        pqVar.addView(textView, w7.x5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        pqVar.addView(textView2, w7.x5.t(-2, -2, 49, 30, 22, 30, 20));
        ww0 ww0Var = new ww0(activity, null);
        ww0Var.setCallback(new qq(this, oqVar));
        ww0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        pqVar.addView(ww0Var, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        fr frVar = new fr(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.i6.a7)), org.telegram.ui.ActionBar.i6.W0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7));
        frVar.w = true;
        frameLayout.setBackgroundDrawable(frVar);
        pqVar.addView(frameLayout, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        rq rqVar = new rq(activity);
        this.d = rqVar;
        rqVar.setBackgroundColor(getThemedColor(i11));
        rqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        rqVar.a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(rqVar);
        r(false);
    }

    public static void o(sq sqVar) {
        View childAt = sqVar.c.getChildAt(0);
        int[] iArr = sqVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(sqVar.e ? 6.0f : 19.0f), 0);
        if (sqVar.f != max) {
            sqVar.f = max;
            sqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void r(boolean z10) {
        int i10 = this.n;
        int i11 = this.r;
        rq rqVar = this.d;
        if (i10 != i11 || this.e) {
            rqVar.setVisibility(0);
            if (z10) {
                rqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                rqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            rqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            rqVar.setVisibility(4);
            rqVar.setAlpha(0.0f);
        }
    }
}
