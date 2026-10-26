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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oq extends org.telegram.ui.ActionBar.k3 {
    public int E;
    public final Drawable b;
    public final ArrayList c;
    public final lq d;
    public final nq e;
    public final boolean f;
    public int h;
    public final int[] n;
    public final int r;
    public int s;
    public boolean v;
    public org.telegram.ui.eb w;
    public int x;
    public int y;

    public oq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.u6) null, false);
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
        int i11 = org.telegram.ui.ActionBar.y6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        kq kqVar = new kq(this, activity);
        kqVar.setFillViewport(true);
        kqVar.setWillNotDraw(false);
        kqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        kqVar.setPadding(i12, 0, i12, 0);
        this.containerView = kqVar;
        lq lqVar = new lq(this, activity);
        this.d = lqVar;
        lqVar.setOrientation(1);
        kqVar.addView(lqVar, gb1.B(-1, -2, 80));
        setCustomView(lqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ak0 ak0Var = new ak0(activity);
        ak0Var.setAutoRepeat(false);
        ak0Var.f(R.raw.utyan_private, 120, 120, null);
        ak0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        ak0Var.d();
        lqVar.addView(ak0Var, gb1.x(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.vh.j(24.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        lqVar.addView(textView, gb1.x(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.r5, null);
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        lqVar.addView(textView2, gb1.x(-2, -2, 49, 30, 22, 30, 20));
        zw0 zw0Var = new zw0(activity, null);
        zw0Var.setCallback(new mq(this, kqVar));
        zw0Var.b(this.r, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        lqVar.addView(zw0Var, gb1.o(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        ar arVar = new ar(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.y6.a7)), org.telegram.ui.ActionBar.y6.X0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7));
        arVar.w = true;
        frameLayout.setBackgroundDrawable(arVar);
        arrayList.add(arVar);
        lqVar.addView(frameLayout, gb1.r(-1, -2));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(activity, null);
        i9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(i9Var);
        nq nqVar = new nq(activity);
        this.e = nqVar;
        org.telegram.ui.ActionBar.f7.i(i11, nqVar, null);
        nqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        nqVar.a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(nqVar);
        p(false);
    }

    public static void m(oq oqVar) {
        View childAt = oqVar.d.getChildAt(0);
        int[] iArr = oqVar.n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(oqVar.f ? 6.0f : 19.0f), 0);
        if (oqVar.h != max) {
            oqVar.h = max;
            oqVar.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        Drawable drawable;
        ArrayList arrayList = this.c;
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.b7);
            if (themedColor == this.y) {
                if (themedColor2 != this.E) {
                }
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.h5);
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
                ar arVar = (ar) arrayList.get(i10);
                org.telegram.ui.ActionBar.y6.y1(arVar, themedColor, false);
                if (arVar.b != null) {
                    org.telegram.ui.ActionBar.y6.y1(arVar, themedColor2, true);
                }
                arVar.invalidateSelf();
            }
            int themedColor32 = getThemedColor(org.telegram.ui.ActionBar.y6.h5);
            drawable = this.b;
            if (drawable != null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p(boolean z10) {
        int i10 = this.r;
        int i11 = this.s;
        nq nqVar = this.e;
        if (i10 != i11 || this.f) {
            nqVar.setVisibility(0);
            if (z10) {
                nqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                nqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            nqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            nqVar.setVisibility(4);
            nqVar.setAlpha(0.0f);
        }
    }
}
