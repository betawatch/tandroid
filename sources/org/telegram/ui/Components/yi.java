package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yi extends ci {
    public di.c1 n;
    public int r;
    public gi.g s;
    public ha w;
    public int x;
    public q0.a y;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        di.c1 c1Var = this.n;
        ha haVar = this.w;
        if (org.telegram.messenger.g0.Q1()) {
            this.x = 4;
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.x = 4;
            } else {
                this.x = 3;
            }
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int L = ((i7 - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(10.0f)) / this.x;
        if (this.r != L) {
            this.r = L;
            haVar.f();
        }
        this.s.y1(Math.max(1, ((this.x - 1) * org.telegram.messenger.g0.L(5.0f)) + (this.x * L)));
        int ceil = (int) Math.ceil((((ArrayList) haVar.e).size() - 1) / this.x);
        Math.max(0, ((i10 - ((org.telegram.messenger.g0.L(5.0f) * (ceil - 1)) + (L * ceil))) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(60.0f));
        if (!org.telegram.messenger.g0.Q1()) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                int L2 = i11 - org.telegram.messenger.g0.L(52.0f);
                i12 = L2 >= 0 ? L2 : 0;
                if (c1Var.getPaddingTop() == i12) {
                    c1Var.setPadding(org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int L22 = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L22 >= 0) {
        }
        if (c1Var.getPaddingTop() == i12) {
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        ki kiVar = this.b;
        try {
            kiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131745663, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.n.y0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        di.c1 c1Var = this.n;
        if (c1Var.getChildCount() <= 0) {
            c1Var.setTopGlowOffset(c1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        c1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.y = aVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        invalidate();
    }
}
