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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ao extends qi {
    public final tz n;
    public final vl0 r;
    public final int s;
    public final org.telegram.ui.w7 v;
    public int w;

    public ao(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        this.s = i10;
        tz tzVar = new tz(context, f6Var);
        this.n = tzVar;
        tzVar.setText(LocaleController.getString(R.string.NoPhotos));
        tzVar.setOnTouchListener(null);
        tzVar.setTextSize(16);
        addView(tzVar, w7.a6.c(-2.0f, -1));
        tzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i10 == 1) {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        tzVar.c();
        vl0 vl0Var = new vl0(context, f6Var);
        this.r = vl0Var;
        vl0Var.setSectionsType(2);
        vl0Var.setVerticalScrollBarEnabled(false);
        vl0Var.setLayoutManager(new s4.c0());
        vl0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        vl0Var.setAdapter(w7Var);
        vl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        vl0Var.setOnScrollListener(new bi.a2(this, 21));
        addView(vl0Var, w7.a6.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        vl0 vl0Var = this.r;
        if (vl0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = vl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) vl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.qi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.qi
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
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        vl0 vl0Var;
        int max = Math.max(0, i11 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
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
                vl0Var = this.r;
                if (vl0Var.getPaddingTop() == i13) {
                    vl0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        vl0Var = this.r;
        if (vl0Var.getPaddingTop() == i13) {
        }
    }
}
