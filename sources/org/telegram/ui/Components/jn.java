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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jn extends yh {
    public final az n;
    public final zk0 r;
    public final int s;
    public final org.telegram.ui.w7 v;
    public int w;

    public jn(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        this.s = i10;
        az azVar = new az(context, c6Var);
        this.n = azVar;
        azVar.setText(LocaleController.getString(R.string.NoPhotos));
        azVar.setOnTouchListener(null);
        azVar.setTextSize(16);
        addView(azVar, h7.z5.c(-2.0f, -1));
        azVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i10 == 1) {
            azVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            azVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            azVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            azVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        azVar.c();
        zk0 zk0Var = new zk0(context, c6Var);
        this.r = zk0Var;
        zk0Var.setSectionsType(2);
        zk0Var.setVerticalScrollBarEnabled(false);
        zk0Var.setLayoutManager(new f2.k0());
        zk0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        zk0Var.setAdapter(w7Var);
        zk0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        zk0Var.setOnScrollListener(new xm(this, 1));
        addView(zk0Var, h7.z5.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        zk0 zk0Var = this.r;
        if (zk0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = zk0Var.getChildAt(0);
        lk0 lk0Var = (lk0) zk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && lk0Var != null && lk0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
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
    @Override // org.telegram.ui.Components.yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i10, int i11) {
        int i12;
        int i13;
        zk0 zk0Var;
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
                zk0Var = this.r;
                if (zk0Var.getPaddingTop() == i13) {
                    zk0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        zk0Var = this.r;
        if (zk0Var.getPaddingTop() == i13) {
        }
    }
}
