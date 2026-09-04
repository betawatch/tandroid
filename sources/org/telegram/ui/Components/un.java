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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class un extends ni {
    public final mz n;
    public final ll0 r;
    public final int s;
    public final org.telegram.ui.w7 v;
    public int w;

    public un(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.s = i10;
        mz mzVar = new mz(context, f6Var);
        this.n = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoPhotos));
        mzVar.setOnTouchListener(null);
        mzVar.setTextSize(16);
        addView(mzVar, w7.x5.c(-2.0f, -1));
        mzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i10 == 1) {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        mzVar.c();
        ll0 ll0Var = new ll0(context, f6Var);
        this.r = ll0Var;
        ll0Var.setSectionsType(2);
        ll0Var.setVerticalScrollBarEnabled(false);
        ll0Var.setLayoutManager(new s4.c0());
        ll0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        ll0Var.setAdapter(w7Var);
        ll0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        ll0Var.setOnScrollListener(new ah.e0(this, 24));
        addView(ll0Var, w7.x5.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        ll0 ll0Var = this.r;
        if (ll0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = ll0Var.getChildAt(0);
        vk0 vk0Var = (vk0) ll0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || vk0Var == null || vk0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
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
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        ll0 ll0Var;
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
                ll0Var = this.r;
                if (ll0Var.getPaddingTop() == i13) {
                    ll0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        ll0Var = this.r;
        if (ll0Var.getPaddingTop() == i13) {
        }
    }
}
