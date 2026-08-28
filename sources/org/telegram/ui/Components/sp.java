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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sp extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final pp c;
    public final rp d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.wa v;

    public sp(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.id);
        int i9 = chatFull != null ? chatFull.ttl_period : 0;
        if (i9 == 0) {
            this.n = 0;
            this.r = 0;
        } else if (i9 == 86400) {
            this.n = 1;
            this.r = 1;
        } else if (i9 == 604800) {
            this.n = 2;
            this.r = 2;
        } else {
            this.n = 3;
            this.r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.b = mutate;
        int i10 = org.telegram.ui.ActionBar.f6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        op opVar = new op(this, activity);
        opVar.setFillViewport(true);
        opVar.setWillNotDraw(false);
        opVar.setClipToPadding(false);
        int i11 = this.backgroundPaddingLeft;
        opVar.setPadding(i11, 0, i11, 0);
        this.containerView = opVar;
        pp ppVar = new pp(this, activity);
        this.c = ppVar;
        ppVar.setOrientation(1);
        opVar.addView(ppVar, g7.e6.x(-1, -2, 80));
        setCustomView(ppVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i12 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        pi0 pi0Var = new pi0(activity);
        pi0Var.setAutoRepeat(false);
        pi0Var.f(R.raw.utyan_private, 120, 120, null);
        pi0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        pi0Var.d();
        ppVar.addView(pi0Var, g7.e6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.ll.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        ppVar.addView(textView, g7.e6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        ppVar.addView(textView2, g7.e6.t(-2, -2, 49, 30, 22, 30, 20));
        bv0 bv0Var = new bv0(activity, null);
        bv0Var.setCallback(new qp(this, opVar));
        bv0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        ppVar.addView(bv0Var, g7.e6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        fq fqVar = new fq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.f6.a7)), org.telegram.ui.ActionBar.f6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
        fqVar.w = true;
        frameLayout.setBackgroundDrawable(fqVar);
        ppVar.addView(frameLayout, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(activity, null);
        b9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(b9Var);
        rp rpVar = new rp(activity);
        this.d = rpVar;
        rpVar.setBackgroundColor(getThemedColor(i10));
        rpVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        rpVar.a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(rpVar);
        p(false);
    }

    public static void m(sp spVar) {
        View childAt = spVar.c.getChildAt(0);
        int[] iArr = spVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(spVar.e ? 6.0f : 19.0f), 0);
        if (spVar.f != max) {
            spVar.f = max;
            spVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i9 = this.n;
        int i10 = this.r;
        rp rpVar = this.d;
        if (i9 != i10 || this.e) {
            rpVar.setVisibility(0);
            if (z10) {
                rpVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                rpVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            rpVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            rpVar.setVisibility(4);
            rpVar.setAlpha(0.0f);
        }
    }
}
