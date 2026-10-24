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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mq extends org.telegram.ui.ActionBar.h3 {
    public int E;
    public final Drawable b;
    public final ArrayList c;
    public final jq d;
    public final lq e;
    public final boolean f;
    public int h;
    public final int[] n;
    public final int r;
    public int s;
    public boolean v;
    public org.telegram.ui.db w;
    public int x;
    public int y;

    public mq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.g6) null, false);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.n = new int[2];
        this.f = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.id);
        int i10 = chatFull != null ? chatFull.ttl_period : 0;
        if (i10 == 0) {
            this.r = 0;
            this.s = 0;
        } else if (i10 == 86400) {
            this.r = 1;
            this.s = 1;
        } else if (i10 == 604800) {
            this.r = 2;
            this.s = 2;
        } else {
            this.r = 3;
            this.s = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.b = mutate;
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        iq iqVar = new iq(this, activity);
        iqVar.setFillViewport(true);
        iqVar.setWillNotDraw(false);
        iqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        iqVar.setPadding(i12, 0, i12, 0);
        this.containerView = iqVar;
        jq jqVar = new jq(this, activity);
        this.d = jqVar;
        jqVar.setOrientation(1);
        iqVar.addView(jqVar, w7.z5.x(-1, -2, 80));
        setCustomView(jqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        bk0 bk0Var = new bk0(activity);
        bk0Var.setAutoRepeat(false);
        bk0Var.f(R.raw.utyan_private, 120, 120, null);
        bk0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        bk0Var.d();
        jqVar.addView(bk0Var, w7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.sl.k(24.0f, 1, textView);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        jqVar.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        jqVar.addView(textView2, w7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        sw0 sw0Var = new sw0(activity, null);
        sw0Var.setCallback(new kq(this, iqVar));
        sw0Var.b(this.r, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        jqVar.addView(sw0Var, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        yq yqVar = new yq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.k6.a7)), org.telegram.ui.ActionBar.k6.X0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        yqVar.w = true;
        frameLayout.setBackgroundDrawable(yqVar);
        arrayList.add(yqVar);
        jqVar.addView(frameLayout, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        lq lqVar = new lq(activity);
        this.e = lqVar;
        org.telegram.ui.ActionBar.r6.i(i11, lqVar, null);
        lqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        lqVar.a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(lqVar);
        q(false);
    }

    public static void m(mq mqVar) {
        View childAt = mqVar.d.getChildAt(0);
        int[] iArr = mqVar.n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(mqVar.f ? 6.0f : 19.0f), 0);
        if (mqVar.h != max) {
            mqVar.h = max;
            mqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        Drawable drawable;
        ArrayList arrayList = this.c;
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.b7);
            if (themedColor == this.y) {
                if (themedColor2 != this.E) {
                }
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
                drawable = this.b;
                if (drawable != null || themedColor3 == this.x) {
                }
                this.x = themedColor3;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
                return;
            }
            this.y = themedColor;
            this.E = themedColor2;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                yq yqVar = (yq) arrayList.get(i10);
                org.telegram.ui.ActionBar.k6.y1(yqVar, themedColor, false);
                if (yqVar.b != null) {
                    org.telegram.ui.ActionBar.k6.y1(yqVar, themedColor2, true);
                }
                yqVar.invalidateSelf();
            }
            int themedColor32 = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
            drawable = this.b;
            if (drawable != null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q(boolean z10) {
        int i10 = this.r;
        int i11 = this.s;
        lq lqVar = this.e;
        if (i10 != i11 || this.f) {
            lqVar.setVisibility(0);
            if (z10) {
                lqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                lqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            lqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            lqVar.setVisibility(4);
            lqVar.setAlpha(0.0f);
        }
    }
}
