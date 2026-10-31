package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qi extends uh {
    public ag.b1 n;
    public int r;
    public oi s;
    public fa w;
    public int x;
    public q0.a y;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int i13;
        ag.b1 b1Var = this.n;
        fa faVar = this.w;
        if (org.telegram.messenger.i0.Q1()) {
            this.x = 4;
        } else {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                this.x = 4;
            } else {
                this.x = 3;
            }
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int L = ((i10 - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(10.0f)) / this.x;
        if (this.r != L) {
            this.r = L;
            faVar.f();
        }
        this.s.y1(Math.max(1, ((this.x - 1) * org.telegram.messenger.i0.L(5.0f)) + (this.x * L)));
        int ceil = (int) Math.ceil((((ArrayList) faVar.e).size() - 1) / this.x);
        Math.max(0, ((i11 - ((org.telegram.messenger.i0.L(5.0f) * (ceil - 1)) + (L * ceil))) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(60.0f));
        if (!org.telegram.messenger.i0.Q1()) {
            Point point2 = org.telegram.messenger.i0.q;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
                int L2 = i12 - org.telegram.messenger.i0.L(52.0f);
                i13 = L2 >= 0 ? L2 : 0;
                if (b1Var.getPaddingTop() == i13) {
                    b1Var.setPadding(org.telegram.messenger.i0.L(6.0f), i13, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int L22 = i12 - org.telegram.messenger.i0.L(52.0f);
        if (L22 >= 0) {
        }
        if (b1Var.getPaddingTop() == i13) {
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        bi biVar = this.b;
        try {
            biVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        biVar.R2.setTitle(org.telegram.messenger.cd.L0(2131745680, null));
        this.s.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.n.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        ag.b1 b1Var = this.n;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        b1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.y = aVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
        invalidate();
    }
}
