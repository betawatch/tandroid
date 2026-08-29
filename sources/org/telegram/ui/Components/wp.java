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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wp extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final tp c;
    public final vp d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.va v;

    public wp(Activity activity, TLRPC.Chat chat) {
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
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        sp spVar = new sp(this, activity);
        spVar.setFillViewport(true);
        spVar.setWillNotDraw(false);
        spVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        spVar.setPadding(i12, 0, i12, 0);
        this.containerView = spVar;
        tp tpVar = new tp(this, activity);
        this.c = tpVar;
        tpVar.setOrientation(1);
        spVar.addView(tpVar, i7.f6.x(-1, -2, 80));
        setCustomView(tpVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        aj0 aj0Var = new aj0(activity);
        aj0Var.setAutoRepeat(false);
        aj0Var.f(R.raw.utyan_private, 120, 120, null);
        aj0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        aj0Var.d();
        tpVar.addView(aj0Var, i7.f6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        tpVar.addView(textView, i7.f6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        tpVar.addView(textView2, i7.f6.t(-2, -2, 49, 30, 22, 30, 20));
        lv0 lv0Var = new lv0(activity, null);
        lv0Var.setCallback(new up(this, spVar));
        lv0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        tpVar.addView(lv0Var, i7.f6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        jq jqVar = new jq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
        jqVar.w = true;
        frameLayout.setBackgroundDrawable(jqVar);
        tpVar.addView(frameLayout, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(activity, null);
        y8Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(y8Var);
        vp vpVar = new vp(activity);
        this.d = vpVar;
        vpVar.setBackgroundColor(getThemedColor(i11));
        vpVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        vpVar.a.setOnClickListener(new h0(this, 9));
        frameLayout.addView(vpVar);
        p(false);
    }

    public static void m(wp wpVar) {
        View childAt = wpVar.c.getChildAt(0);
        int[] iArr = wpVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(wpVar.e ? 6.0f : 19.0f), 0);
        if (wpVar.f != max) {
            wpVar.f = max;
            wpVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.n;
        int i11 = this.r;
        vp vpVar = this.d;
        if (i10 != i11 || this.e) {
            vpVar.setVisibility(0);
            if (z10) {
                vpVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                vpVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            vpVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            vpVar.setVisibility(4);
            vpVar.setAlpha(0.0f);
        }
    }
}
