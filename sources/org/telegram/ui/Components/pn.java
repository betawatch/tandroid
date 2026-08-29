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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pn extends fi {
    public final hz n;
    public final jl0 r;
    public final int s;
    public final org.telegram.ui.u7 v;
    public int w;

    public pn(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.s = i10;
        hz hzVar = new hz(context, c6Var);
        this.n = hzVar;
        hzVar.setText(LocaleController.getString(R.string.NoPhotos));
        hzVar.setOnTouchListener(null);
        hzVar.setTextSize(16);
        addView(hzVar, i7.f6.c(-2.0f, -1));
        hzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat k12 = this.b.k1();
        if (i10 == 1) {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        hzVar.c();
        jl0 jl0Var = new jl0(context, c6Var);
        this.r = jl0Var;
        jl0Var.setSectionsType(2);
        jl0Var.setVerticalScrollBarEnabled(false);
        jl0Var.setLayoutManager(new f2.j0());
        jl0Var.setClipToPadding(false);
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, 4);
        this.v = u7Var;
        jl0Var.setAdapter(u7Var);
        jl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        jl0Var.setOnScrollListener(new cg.g2(this, 26));
        addView(jl0Var, i7.f6.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        jl0 jl0Var = this.r;
        if (jl0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = jl0Var.getChildAt(0);
        vk0 vk0Var = (vk0) jl0Var.G(childAt);
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

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        jl0 jl0Var;
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
                jl0Var = this.r;
                if (jl0Var.getPaddingTop() == i13) {
                    jl0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        jl0Var = this.r;
        if (jl0Var.getPaddingTop() == i13) {
        }
    }
}
