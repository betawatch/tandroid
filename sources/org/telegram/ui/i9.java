package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i9 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Cells.k6 a;
    public final org.telegram.ui.Components.dh0 b;
    public TLRPC.Chat c;

    public i9(Context context) {
        super(context);
        String L0 = org.telegram.messenger.dd.L0(2131743468, null);
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
        this.b = dh0Var;
        int ceil = (int) Math.ceil(dh0Var.getPaint().measureText(L0));
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.a = k6Var;
        k6Var.M0 = true;
        k6Var.E0 = true;
        k6Var.setPadding(org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(44.0f) + ceil : 0, 0, org.telegram.messenger.dd.X ? 0 : org.telegram.messenger.i0.L(44.0f) + ceil, 0);
        int i10 = -org.telegram.messenger.i0.L(4.0f);
        k6Var.b0 = 0;
        k6Var.c0 = i10;
        addView(k6Var, w7.b6.c(-1.0f, -1));
        dh0Var.setText(L0);
        dh0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(dh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
        dh0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
        int i11 = org.telegram.ui.ActionBar.t6.Vl;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        dh0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 16.0f));
        Drawable background = dh0Var.getBackground();
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        dh0Var.setBackground(background);
        org.telegram.ui.ActionBar.a7.k(dh0Var, background, N, null, null);
        dh0Var.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        addView(dh0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
