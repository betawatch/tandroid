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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zp extends org.telegram.ui.ActionBar.g3 {
    public final Drawable b;
    public final wp c;
    public final yp d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.bb v;

    public zp(Activity activity, TLRPC.Chat chat) {
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
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        vp vpVar = new vp(this, activity);
        vpVar.setFillViewport(true);
        vpVar.setWillNotDraw(false);
        vpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        vpVar.setPadding(i12, 0, i12, 0);
        this.containerView = vpVar;
        wp wpVar = new wp(this, activity);
        this.c = wpVar;
        wpVar.setOrientation(1);
        vpVar.addView(wpVar, k7.b6.x(-1, -2, 80));
        setCustomView(wpVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        jj0 jj0Var = new jj0(activity);
        jj0Var.setAutoRepeat(false);
        jj0Var.f(R.raw.utyan_private, 120, 120, null);
        jj0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        jj0Var.d();
        wpVar.addView(jj0Var, k7.b6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        wpVar.addView(textView, k7.b6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        wpVar.addView(textView2, k7.b6.t(-2, -2, 49, 30, 22, 30, 20));
        uv0 uv0Var = new uv0(activity, null);
        uv0Var.setCallback(new xp(this, vpVar));
        uv0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        wpVar.addView(uv0Var, k7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        mq mqVar = new mq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        mqVar.w = true;
        frameLayout.setBackgroundDrawable(mqVar);
        wpVar.addView(frameLayout, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(z8Var);
        yp ypVar = new yp(activity);
        this.d = ypVar;
        ypVar.setBackgroundColor(getThemedColor(i11));
        ypVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        ypVar.a.setOnClickListener(new g0(this, 9));
        frameLayout.addView(ypVar);
        p(false);
    }

    public static void m(zp zpVar) {
        View childAt = zpVar.c.getChildAt(0);
        int[] iArr = zpVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(zpVar.e ? 6.0f : 19.0f), 0);
        if (zpVar.f != max) {
            zpVar.f = max;
            zpVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z4) {
        int i10 = this.n;
        int i11 = this.r;
        yp ypVar = this.d;
        if (i10 != i11 || this.e) {
            ypVar.setVisibility(0);
            if (z4) {
                ypVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                ypVar.setAlpha(1.0f);
                return;
            }
        }
        if (z4) {
            ypVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            ypVar.setVisibility(4);
            ypVar.setAlpha(0.0f);
        }
    }
}
