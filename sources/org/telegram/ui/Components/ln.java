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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ln extends ci {
    public final yy n;
    public final wk0 r;
    public final int s;
    public final org.telegram.ui.v7 v;
    public int w;

    public ln(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        this.s = i9;
        yy yyVar = new yy(context, b6Var);
        this.n = yyVar;
        yyVar.setText(LocaleController.getString(R.string.NoPhotos));
        yyVar.setOnTouchListener(null);
        yyVar.setTextSize(16);
        addView(yyVar, g7.e6.c(-2.0f, -1));
        yyVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i9 == 1) {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i9 == 3) {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i9 == 4) {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        yyVar.c();
        wk0 wk0Var = new wk0(context, b6Var);
        this.r = wk0Var;
        wk0Var.setSectionsType(2);
        wk0Var.setVerticalScrollBarEnabled(false);
        wk0Var.setLayoutManager(new f2.m0());
        wk0Var.setClipToPadding(false);
        org.telegram.ui.v7 v7Var = new org.telegram.ui.v7(this, 4);
        this.v = v7Var;
        wk0Var.setAdapter(v7Var);
        wk0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        wk0Var.setOnScrollListener(new kn(this, 0));
        addView(wk0Var, g7.e6.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        wk0 wk0Var = this.r;
        if (wk0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i9 = 0;
        View childAt = wk0Var.getChildAt(0);
        ik0 ik0Var = (ik0) wk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = top;
        }
        if (top < 0 || ik0Var == null || ik0Var.b() != 0) {
            top = i9;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
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
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int i11;
        int i12;
        wk0 wk0Var;
        int max = Math.max(0, i10 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        if (this.w != max) {
            this.w = max;
            this.v.l();
        }
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                int dp = i11 - AndroidUtilities.dp(52.0f);
                i12 = dp >= 0 ? dp : 0;
                wk0Var = this.r;
                if (wk0Var.getPaddingTop() == i12) {
                    wk0Var.setPadding(AndroidUtilities.dp(6.0f), i12, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int dp2 = i11 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        wk0Var = this.r;
        if (wk0Var.getPaddingTop() == i12) {
        }
    }
}
