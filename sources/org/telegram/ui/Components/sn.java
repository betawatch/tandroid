package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class sn extends ki {
    public final ty n;
    public final ck0 r;
    public final int s;
    public final org.telegram.ui.y7 w;
    public int x;

    public sn(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        this.s = i7;
        ty tyVar = new ty(context, i6Var);
        this.n = tyVar;
        tyVar.setText(org.telegram.messenger.gd.M0(2131747988, null));
        tyVar.setOnTouchListener(null);
        tyVar.setTextSize(16);
        addView(tyVar, c8.ma.c(-2.0f, -1));
        tyVar.a(R.raw.media_forbidden, org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2);
        TLRPC.Chat Z0 = this.b.Z0();
        int i10 = 4;
        int i11 = 7;
        if (i7 == 1) {
            tyVar.setText(org.telegram.messenger.v3.L(7, Z0));
        } else if (i7 == 3) {
            tyVar.setText(org.telegram.messenger.v3.L(18, Z0));
        } else if (i7 == 4) {
            tyVar.setText(org.telegram.messenger.v3.L(19, Z0));
        } else {
            tyVar.setText(org.telegram.messenger.v3.L(22, Z0));
        }
        tyVar.c();
        ck0 ck0Var = new ck0(context, i6Var);
        this.r = ck0Var;
        ck0Var.setSectionsType(2);
        ck0Var.setVerticalScrollBarEnabled(false);
        ck0Var.setLayoutManager(new v4.c0());
        ck0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i10);
        this.w = y7Var;
        ck0Var.setAdapter(y7Var);
        ck0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ck0Var.setOnScrollListener(new oa(this, i11));
        addView(ck0Var, c8.ma.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        ck0 ck0Var;
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
                ck0Var = this.r;
                if (ck0Var.getPaddingTop() == i12) {
                    ck0Var.setPadding(org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(48.0f));
                    return;
                }
                return;
            }
        }
        i11 = (i10 / 5) * 2;
        int L2 = i11 - org.telegram.messenger.g0.L(52.0f);
        if (L2 >= 0) {
        }
        ck0Var = this.r;
        if (ck0Var.getPaddingTop() == i12) {
        }
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        ck0 ck0Var = this.r;
        if (ck0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = ck0Var.getChildAt(0);
        kj0 kj0Var = (kj0) ck0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && kj0Var != null && kj0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || kj0Var == null || kj0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }
}
