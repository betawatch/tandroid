package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sn extends ei {
    public final oz n;
    public final sl0 r;
    public final int s;
    public final org.telegram.ui.y7 v;
    public int w;

    public sn(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        this.s = i10;
        oz ozVar = new oz(context, g6Var);
        this.n = ozVar;
        ozVar.setText(LocaleController.getString(R.string.NoPhotos));
        ozVar.setOnTouchListener(null);
        ozVar.setTextSize(16);
        addView(ozVar, k7.c6.c(-2.0f, -1));
        ozVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i10 == 1) {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        ozVar.c();
        sl0 sl0Var = new sl0(context, g6Var);
        this.r = sl0Var;
        sl0Var.setSectionsType(2);
        sl0Var.setVerticalScrollBarEnabled(false);
        sl0Var.setLayoutManager(new f2.j0());
        sl0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 4);
        this.v = y7Var;
        sl0Var.setAdapter(y7Var);
        sl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        sl0Var.setOnScrollListener(new fg.e2(this, 24));
        addView(sl0Var, k7.c6.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        sl0 sl0Var = this.r;
        if (sl0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = sl0Var.getChildAt(0);
        el0 el0Var = (el0) sl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || el0Var == null || el0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        sl0 sl0Var;
        int max = Math.max(0, i11 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        if (this.w != max) {
            this.w = max;
            this.v.l();
        }
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                int dp = i12 - AndroidUtilities.dp(52.0f);
                i13 = dp >= 0 ? dp : 0;
                sl0Var = this.r;
                if (sl0Var.getPaddingTop() == i13) {
                    sl0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        sl0Var = this.r;
        if (sl0Var.getPaddingTop() == i13) {
        }
    }
}
