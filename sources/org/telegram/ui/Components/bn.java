package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bn extends th {
    public final gy n;
    public final tj0 r;
    public final int s;
    public final org.telegram.ui.y7 w;
    public int x;

    public bn(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        this.s = i3;
        gy gyVar = new gy(context, e6Var);
        this.n = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748188, null));
        gyVar.setOnTouchListener(null);
        gyVar.setTextSize(16);
        addView(gyVar, b8.mf.c(-2.0f, -1));
        gyVar.a(R.raw.media_forbidden, org.telegram.messenger.hs.g2, org.telegram.messenger.hs.g2);
        TLRPC.Chat Y0 = this.b.Y0();
        int i10 = 4;
        if (i3 == 1) {
            gyVar.setText(org.telegram.messenger.t3.L(7, Y0));
        } else if (i3 == 3) {
            gyVar.setText(org.telegram.messenger.t3.L(18, Y0));
        } else if (i3 == 4) {
            gyVar.setText(org.telegram.messenger.t3.L(19, Y0));
        } else {
            gyVar.setText(org.telegram.messenger.t3.L(22, Y0));
        }
        gyVar.c();
        tj0 tj0Var = new tj0(context, e6Var);
        this.r = tj0Var;
        tj0Var.setSectionsType(2);
        tj0Var.setVerticalScrollBarEnabled(false);
        tj0Var.setLayoutManager(new u4.b0());
        tj0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i10);
        this.w = y7Var;
        tj0Var.setAdapter(y7Var);
        tj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        tj0Var.setOnScrollListener(new ji(this, 6));
        addView(tj0Var, b8.mf.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int i11;
        int i12;
        tj0 tj0Var;
        int max = Math.max(0, i10 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        if (this.x != max) {
            this.x = max;
            this.w.f();
        }
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                i11 = (int) (i10 / 3.5f);
                int L = i11 - org.telegram.messenger.g0.L(52.0f);
                i12 = L >= 0 ? L : 0;
                tj0Var = this.r;
                if (tj0Var.getPaddingTop() == i12) {
                    tj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int L2 = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L2 >= 0) {
        }
        tj0Var = this.r;
        if (tj0Var.getPaddingTop() == i12) {
        }
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        tj0 tj0Var = this.r;
        if (tj0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i3 = 0;
        View childAt = tj0Var.getChildAt(0);
        bj0 bj0Var = (bj0) tj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = top;
        }
        if (top < 0 || bj0Var == null || bj0Var.b() != 0) {
            top = i3;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }
}
