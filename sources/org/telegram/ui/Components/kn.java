package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kn extends uh {
    public final xy n;
    public final tk0 r;
    public final int s;
    public final org.telegram.ui.x7 w;
    public int x;

    public kn(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        this.s = i10;
        xy xyVar = new xy(context, p6Var);
        this.n = xyVar;
        xyVar.setText(org.telegram.messenger.cd.L0(2131748197, null));
        xyVar.setOnTouchListener(null);
        xyVar.setTextSize(16);
        addView(xyVar, w7.b6.c(-2.0f, -1));
        xyVar.a(R.raw.media_forbidden, org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2);
        TLRPC.Chat X0 = this.b.X0();
        int i11 = 19;
        int i12 = 4;
        if (i10 == 1) {
            xyVar.setText(org.telegram.messenger.w3.L(7, X0));
        } else if (i10 == 3) {
            xyVar.setText(org.telegram.messenger.w3.L(18, X0));
        } else if (i10 == 4) {
            xyVar.setText(org.telegram.messenger.w3.L(19, X0));
        } else {
            xyVar.setText(org.telegram.messenger.w3.L(22, X0));
        }
        xyVar.c();
        tk0 tk0Var = new tk0(context, p6Var);
        this.r = tk0Var;
        tk0Var.setSectionsType(2);
        tk0Var.setVerticalScrollBarEnabled(false);
        tk0Var.setLayoutManager(new s4.a0());
        tk0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, i12);
        this.w = x7Var;
        tk0Var.setAdapter(x7Var);
        tk0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
        tk0Var.setOnScrollListener(new ag.u(this, i11));
        addView(tk0Var, w7.b6.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int i13;
        tk0 tk0Var;
        int max = Math.max(0, i11 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
        if (this.x != max) {
            this.x = max;
            this.w.f();
        }
        if (!org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                int L = i12 - org.telegram.messenger.i0.L(52.0f);
                i13 = L >= 0 ? L : 0;
                tk0Var = this.r;
                if (tk0Var.getPaddingTop() == i13) {
                    tk0Var.setPadding(org.telegram.messenger.i0.L(6.0f), i13, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int L2 = i12 - org.telegram.messenger.i0.L(52.0f);
        if (L2 >= 0) {
        }
        tk0Var = this.r;
        if (tk0Var.getPaddingTop() == i13) {
        }
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        tk0 tk0Var = this.r;
        if (tk0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = tk0Var.getChildAt(0);
        ck0 ck0Var = (ck0) tk0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
        if (top > 0 && ck0Var != null && ck0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || ck0Var == null || ck0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.i0.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.i0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
    }
}
