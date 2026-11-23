package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i9 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.h6 a;
    public final org.telegram.ui.Components.pg0 b;
    public TLRPC.Chat c;

    public i9(Context context) {
        super(context);
        String N0 = org.telegram.messenger.hd.N0(2131743197, null);
        org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(context);
        this.b = pg0Var;
        int ceil = (int) Math.ceil(pg0Var.getPaint().measureText(N0));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.a = h6Var;
        h6Var.N0 = true;
        h6Var.F0 = true;
        h6Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(44.0f) + ceil : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(44.0f) + ceil, 0);
        int i7 = -org.telegram.messenger.g0.L(4.0f);
        h6Var.c0 = 0;
        h6Var.d0 = i7;
        addView(h6Var, c8.ma.c(-1.0f, -1));
        pg0Var.setText(N0);
        pg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, null);
        pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
        int i10 = org.telegram.ui.ActionBar.m6.Yl;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
        pg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x02, 16.0f));
        Drawable background = pg0Var.getBackground();
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        pg0Var.setBackground(background);
        org.telegram.ui.ActionBar.t6.j(pg0Var, background, M, null, null);
        pg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(pg0Var, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
