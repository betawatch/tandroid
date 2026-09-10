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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iq extends org.telegram.ui.ActionBar.h3 {
    public final Drawable b;
    public final fq c;
    public final hq d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.eb v;

    public iq(Activity activity, TLRPC.Chat chat) {
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
        eq eqVar = new eq(this, activity);
        eqVar.setFillViewport(true);
        eqVar.setWillNotDraw(false);
        eqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        eqVar.setPadding(i12, 0, i12, 0);
        this.containerView = eqVar;
        fq fqVar = new fq(this, activity);
        this.c = fqVar;
        fqVar.setOrientation(1);
        eqVar.addView(fqVar, w7.a6.x(-1, -2, 80));
        setCustomView(fqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        kj0 kj0Var = new kj0(activity);
        kj0Var.setAutoRepeat(false);
        kj0Var.f(R.raw.utyan_private, 120, 120, null);
        kj0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        kj0Var.d();
        fqVar.addView(kj0Var, w7.a6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.em.j(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        fqVar.addView(textView, w7.a6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        fqVar.addView(textView2, w7.a6.t(-2, -2, 49, 30, 22, 30, 20));
        ew0 ew0Var = new ew0(activity, null);
        ew0Var.setCallback(new gq(this, eqVar));
        ew0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        fqVar.addView(ew0Var, w7.a6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        vq vqVar = new vq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        vqVar.w = true;
        frameLayout.setBackgroundDrawable(vqVar);
        fqVar.addView(frameLayout, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(activity, null);
        f9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(f9Var);
        hq hqVar = new hq(activity);
        this.d = hqVar;
        hqVar.setBackgroundColor(getThemedColor(i11));
        hqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        hqVar.a.setOnClickListener(new h0(this, 9));
        frameLayout.addView(hqVar);
        p(false);
    }

    public static void m(iq iqVar) {
        View childAt = iqVar.c.getChildAt(0);
        int[] iArr = iqVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(iqVar.e ? 6.0f : 19.0f), 0);
        if (iqVar.f != max) {
            iqVar.f = max;
            iqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.n;
        int i11 = this.r;
        hq hqVar = this.d;
        if (i10 != i11 || this.e) {
            hqVar.setVisibility(0);
            if (z10) {
                hqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                hqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            hqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            hqVar.setVisibility(4);
            hqVar.setAlpha(0.0f);
        }
    }
}
