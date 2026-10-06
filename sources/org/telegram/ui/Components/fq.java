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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class fq extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final cq c;
    public final eq d;
    public final boolean e;
    public int f;
    public final int[] h;
    public final int n;
    public int r;
    public boolean s;
    public org.telegram.ui.eb v;

    public fq(Activity activity, TLRPC.Chat chat) {
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
        int i11 = org.telegram.ui.ActionBar.i6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        bq bqVar = new bq(this, activity);
        bqVar.setFillViewport(true);
        bqVar.setWillNotDraw(false);
        bqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        bqVar.setPadding(i12, 0, i12, 0);
        this.containerView = bqVar;
        cq cqVar = new cq(this, activity);
        this.c = cqVar;
        cqVar.setOrientation(1);
        bqVar.addView(cqVar, w7.z5.x(-1, -2, 80));
        setCustomView(cqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        nj0 nj0Var = new nj0(activity);
        nj0Var.setAutoRepeat(false);
        nj0Var.f(R.raw.utyan_private, 120, 120, null);
        nj0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        nj0Var.d();
        cqVar.addView(nj0Var, w7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.bi.j(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        cqVar.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        cqVar.addView(textView2, w7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        qw0 qw0Var = new qw0(activity, null);
        qw0Var.setCallback(new dq(this, bqVar));
        qw0Var.b(this.n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        cqVar.addView(qw0Var, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        sq sqVar = new sq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.i6.a7)), org.telegram.ui.ActionBar.i6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7));
        sqVar.w = true;
        frameLayout.setBackgroundDrawable(sqVar);
        cqVar.addView(frameLayout, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        eq eqVar = new eq(activity);
        this.d = eqVar;
        eqVar.setBackgroundColor(getThemedColor(i11));
        eqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        eqVar.a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(eqVar);
        p(false);
    }

    public static void m(fq fqVar) {
        View childAt = fqVar.c.getChildAt(0);
        int[] iArr = fqVar.h;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(fqVar.e ? 6.0f : 19.0f), 0);
        if (fqVar.f != max) {
            fqVar.f = max;
            fqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.n;
        int i11 = this.r;
        eq eqVar = this.d;
        if (i10 != i11 || this.e) {
            eqVar.setVisibility(0);
            if (z10) {
                eqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                eqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            eqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            eqVar.setVisibility(4);
            eqVar.setAlpha(0.0f);
        }
    }
}
