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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class yn extends pi {
    public final pz n;
    public final zl0 r;
    public final int s;
    public final org.telegram.ui.z7 v;
    public int w;

    public yn(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        this.s = i10;
        pz pzVar = new pz(context, d6Var);
        this.n = pzVar;
        pzVar.setText(LocaleController.getString(R.string.NoPhotos));
        pzVar.setOnTouchListener(null);
        pzVar.setTextSize(16);
        addView(pzVar, w7.z5.c(-2.0f, -1));
        pzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i10 == 1) {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        pzVar.c();
        zl0 zl0Var = new zl0(context, d6Var);
        this.r = zl0Var;
        zl0Var.setSectionsType(2);
        zl0Var.setVerticalScrollBarEnabled(false);
        zl0Var.setLayoutManager(new s4.c0());
        zl0Var.setClipToPadding(false);
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 4);
        this.v = z7Var;
        zl0Var.setAdapter(z7Var);
        zl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        zl0Var.setOnScrollListener(new ai.r(this, 24));
        addView(zl0Var, w7.z5.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.pi
    public int getCurrentItemTop() {
        zl0 zl0Var = this.r;
        if (zl0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = zl0Var.getChildAt(0);
        il0 il0Var = (il0) zl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || il0Var == null || il0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.pi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.pi
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
    @Override // org.telegram.ui.Components.pi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        zl0 zl0Var;
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
                zl0Var = this.r;
                if (zl0Var.getPaddingTop() == i13) {
                    zl0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        zl0Var = this.r;
        if (zl0Var.getPaddingTop() == i13) {
        }
    }
}
