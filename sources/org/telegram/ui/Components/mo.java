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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mo extends qi {
    public final c00 n;
    public final qm0 r;
    public final int s;
    public final org.telegram.ui.v7 v;
    public int w;

    public mo(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        this.s = i10;
        c00 c00Var = new c00(context, e6Var);
        this.n = c00Var;
        c00Var.setText(LocaleController.getString(R.string.NoPhotos));
        c00Var.setOnTouchListener(null);
        c00Var.setTextSize(16);
        addView(c00Var, w7.x5.d(-2.0f, -1));
        c00Var.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat m12 = this.b.m1();
        if (i10 == 1) {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 7));
        } else if (i10 == 3) {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 18));
        } else if (i10 == 4) {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 19));
        } else {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 22));
        }
        c00Var.c();
        qm0 qm0Var = new qm0(context, e6Var);
        this.r = qm0Var;
        qm0Var.setSectionsType(2);
        qm0Var.setVerticalScrollBarEnabled(false);
        qm0Var.setLayoutManager(new s4.d0());
        qm0Var.setClipToPadding(false);
        org.telegram.ui.v7 v7Var = new org.telegram.ui.v7(this, 4);
        this.v = v7Var;
        qm0Var.setAdapter(v7Var);
        qm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        qm0Var.setOnScrollListener(new ai.r(this, 23));
        addView(qm0Var, w7.x5.d(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i10, int i11) {
        int i12;
        int i13;
        qm0 qm0Var;
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
                qm0Var = this.r;
                if (qm0Var.getPaddingTop() == i13) {
                    qm0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        qm0Var = this.r;
        if (qm0Var.getPaddingTop() == i13) {
        }
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        qm0 qm0Var = this.r;
        if (qm0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = qm0Var.getChildAt(0);
        am0 am0Var = (am0) qm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && am0Var != null && am0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || am0Var == null || am0Var.b() != 0) {
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
}
