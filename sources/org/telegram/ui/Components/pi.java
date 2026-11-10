package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pi extends uh {
    public bi.q1 n;
    public int r;
    public ei.h s;
    public ka w;
    public int x;
    public q0.a y;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        bi.q1 q1Var = this.n;
        ka kaVar = this.w;
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
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int L = ((i7 - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(10.0f)) / this.x;
        if (this.r != L) {
            this.r = L;
            kaVar.f();
        }
        this.s.y1(Math.max(1, ((this.x - 1) * org.telegram.messenger.g0.L(5.0f)) + (this.x * L)));
        int ceil = (int) Math.ceil((((ArrayList) kaVar.e).size() - 1) / this.x);
        Math.max(0, ((i10 - ((org.telegram.messenger.g0.L(5.0f) * (ceil - 1)) + (L * ceil))) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(60.0f));
        if (!org.telegram.messenger.g0.Q1()) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                int L2 = i11 - org.telegram.messenger.g0.L(52.0f);
                i12 = L2 >= 0 ? L2 : 0;
                if (q1Var.getPaddingTop() == i12) {
                    q1Var.setPadding(org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int L22 = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L22 >= 0) {
        }
        if (q1Var.getPaddingTop() == i12) {
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void H(uh uhVar) {
        ci ciVar = this.b;
        try {
            ciVar.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        ciVar.U2.setTitle(org.telegram.messenger.id.M0(2131745663, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void J() {
        this.n.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.n;
        if (q1Var.getChildCount() <= 0) {
            q1Var.setTopGlowOffset(q1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        q1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
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
