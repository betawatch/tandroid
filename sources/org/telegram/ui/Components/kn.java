package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kn extends ci {
    public final ny n;
    public final uj0 r;
    public final int s;
    public final org.telegram.ui.y7 w;
    public int x;

    public kn(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        this.s = i7;
        ny nyVar = new ny(context, e6Var);
        this.n = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748180, null));
        nyVar.setOnTouchListener(null);
        nyVar.setTextSize(16);
        addView(nyVar, c8.ja.c(-2.0f, -1));
        nyVar.a(R.raw.media_forbidden, org.telegram.messenger.ns.g2, org.telegram.messenger.ns.g2);
        TLRPC.Chat Y0 = this.b.Y0();
        int i10 = 4;
        if (i7 == 1) {
            nyVar.setText(org.telegram.messenger.t3.L(7, Y0));
        } else if (i7 == 3) {
            nyVar.setText(org.telegram.messenger.t3.L(18, Y0));
        } else if (i7 == 4) {
            nyVar.setText(org.telegram.messenger.t3.L(19, Y0));
        } else {
            nyVar.setText(org.telegram.messenger.t3.L(22, Y0));
        }
        nyVar.c();
        uj0 uj0Var = new uj0(context, e6Var);
        this.r = uj0Var;
        uj0Var.setSectionsType(2);
        uj0Var.setVerticalScrollBarEnabled(false);
        uj0Var.setLayoutManager(new v4.b0());
        uj0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i10);
        this.w = y7Var;
        uj0Var.setAdapter(y7Var);
        uj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        uj0Var.setOnScrollListener(new ri(this, 6));
        addView(uj0Var, c8.ja.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        uj0 uj0Var;
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
                uj0Var = this.r;
                if (uj0Var.getPaddingTop() == i12) {
                    uj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int L2 = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L2 >= 0) {
        }
        uj0Var = this.r;
        if (uj0Var.getPaddingTop() == i12) {
        }
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        uj0 uj0Var = this.r;
        if (uj0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = uj0Var.getChildAt(0);
        cj0 cj0Var = (cj0) uj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || cj0Var == null || cj0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }
}
