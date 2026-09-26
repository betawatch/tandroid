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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class wn extends oi {
    public final nz n;
    public final wl0 r;
    public final int s;
    public final org.telegram.ui.w7 v;
    public int w;

    public wn(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.s = i10;
        nz nzVar = new nz(context, d6Var);
        this.n = nzVar;
        nzVar.setText(LocaleController.getString(R.string.NoPhotos));
        nzVar.setOnTouchListener(null);
        nzVar.setTextSize(16);
        addView(nzVar, w7.y5.c(-2.0f, -1));
        nzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i10 == 1) {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        nzVar.c();
        wl0 wl0Var = new wl0(context, d6Var);
        this.r = wl0Var;
        wl0Var.setSectionsType(2);
        wl0Var.setVerticalScrollBarEnabled(false);
        wl0Var.setLayoutManager(new s4.c0());
        wl0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        wl0Var.setAdapter(w7Var);
        wl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        wl0Var.setOnScrollListener(new ai.r(this, 23));
        addView(wl0Var, w7.y5.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.oi
    public int getCurrentItemTop() {
        wl0 wl0Var = this.r;
        if (wl0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = wl0Var.getChildAt(0);
        gl0 gl0Var = (gl0) wl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && gl0Var != null && gl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || gl0Var == null || gl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.oi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.oi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.oi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        wl0 wl0Var;
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
                wl0Var = this.r;
                if (wl0Var.getPaddingTop() == i13) {
                    wl0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        wl0Var = this.r;
        if (wl0Var.getPaddingTop() == i13) {
        }
    }
}
