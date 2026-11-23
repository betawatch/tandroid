package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rn extends li {
    public final sy n;
    public final ek0 r;
    public final int s;
    public final org.telegram.ui.z7 w;
    public int x;

    public rn(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
        this.s = i7;
        sy syVar = new sy(context, i6Var);
        this.n = syVar;
        syVar.setText(org.telegram.messenger.gd.N0(2131747987, null));
        syVar.setOnTouchListener(null);
        syVar.setTextSize(16);
        addView(syVar, c8.na.c(-2.0f, -1));
        syVar.a(R.raw.media_forbidden, org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2);
        TLRPC.Chat Z0 = this.b.Z0();
        int i10 = 4;
        int i11 = 7;
        if (i7 == 1) {
            syVar.setText(org.telegram.messenger.v3.L(7, Z0));
        } else if (i7 == 3) {
            syVar.setText(org.telegram.messenger.v3.L(18, Z0));
        } else if (i7 == 4) {
            syVar.setText(org.telegram.messenger.v3.L(19, Z0));
        } else {
            syVar.setText(org.telegram.messenger.v3.L(22, Z0));
        }
        syVar.c();
        ek0 ek0Var = new ek0(context, i6Var);
        this.r = ek0Var;
        ek0Var.setSectionsType(2);
        ek0Var.setVerticalScrollBarEnabled(false);
        ek0Var.setLayoutManager(new v4.c0());
        ek0Var.setClipToPadding(false);
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, i10);
        this.w = z7Var;
        ek0Var.setAdapter(z7Var);
        ek0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ek0Var.setOnScrollListener(new na(this, i11));
        addView(ek0Var, c8.na.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        ek0 ek0Var;
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
                ek0Var = this.r;
                if (ek0Var.getPaddingTop() == i12) {
                    ek0Var.setPadding(org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int L2 = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L2 >= 0) {
        }
        ek0Var = this.r;
        if (ek0Var.getPaddingTop() == i12) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ek0 ek0Var = this.r;
        if (ek0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = ek0Var.getChildAt(0);
        mj0 mj0Var = (mj0) ek0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || mj0Var == null || mj0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }
}
