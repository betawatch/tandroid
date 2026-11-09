package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cn extends vh {
    public final jy n;
    public final qj0 r;
    public final int s;
    public final org.telegram.ui.x7 w;
    public int x;

    public cn(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, di diVar) {
        super(context, g6Var, diVar);
        this.s = i7;
        jy jyVar = new jy(context, g6Var);
        this.n = jyVar;
        jyVar.setText(org.telegram.messenger.id.M0(2131748180, null));
        jyVar.setOnTouchListener(null);
        jyVar.setTextSize(16);
        addView(jyVar, c8.ha.c(-2.0f, -1));
        jyVar.a(R.raw.media_forbidden, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2);
        TLRPC.Chat Y0 = this.b.Y0();
        int i10 = 4;
        if (i7 == 1) {
            jyVar.setText(org.telegram.messenger.t3.L(7, Y0));
        } else if (i7 == 3) {
            jyVar.setText(org.telegram.messenger.t3.L(18, Y0));
        } else if (i7 == 4) {
            jyVar.setText(org.telegram.messenger.t3.L(19, Y0));
        } else {
            jyVar.setText(org.telegram.messenger.t3.L(22, Y0));
        }
        jyVar.c();
        qj0 qj0Var = new qj0(context, g6Var);
        this.r = qj0Var;
        qj0Var.setSectionsType(2);
        qj0Var.setVerticalScrollBarEnabled(false);
        qj0Var.setLayoutManager(new v4.b0());
        qj0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, i10);
        this.w = x7Var;
        qj0Var.setAdapter(x7Var);
        qj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        qj0Var.setOnScrollListener(new ui(this, i10));
        addView(qj0Var, c8.ha.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        qj0 qj0Var;
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
                qj0Var = this.r;
                if (qj0Var.getPaddingTop() == i12) {
                    qj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int L2 = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L2 >= 0) {
        }
        qj0Var = this.r;
        if (qj0Var.getPaddingTop() == i12) {
        }
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        qj0 qj0Var = this.r;
        if (qj0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = qj0Var.getChildAt(0);
        yi0 yi0Var = (yi0) qj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && yi0Var != null && yi0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || yi0Var == null || yi0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }
}
