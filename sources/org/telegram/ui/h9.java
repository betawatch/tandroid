package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h9 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.g6 a;
    public final org.telegram.ui.Components.ag0 b;
    public TLRPC.Chat c;

    public h9(Context context) {
        super(context);
        String M0 = org.telegram.messenger.id.M0(2131743442, null);
        org.telegram.ui.Components.ag0 ag0Var = new org.telegram.ui.Components.ag0(context);
        this.b = ag0Var;
        int ceil = (int) Math.ceil(ag0Var.getPaint().measureText(M0));
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.a = g6Var;
        g6Var.M0 = true;
        g6Var.E0 = true;
        g6Var.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(44.0f) + ceil : 0, 0, org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(44.0f) + ceil, 0);
        int i7 = -org.telegram.messenger.g0.L(4.0f);
        g6Var.b0 = 0;
        g6Var.c0 = i7;
        addView(g6Var, c8.ha.c(-1.0f, -1));
        ag0Var.setText(M0);
        ag0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(ag0Var, org.telegram.ui.ActionBar.m6.Gi, null);
        ag0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bi, false));
        int i10 = org.telegram.ui.ActionBar.m6.Vl;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false);
        ag0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 16.0f));
        Drawable background = ag0Var.getBackground();
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        ag0Var.setBackground(background);
        org.telegram.ui.ActionBar.t6.j(ag0Var, background, M, null, null);
        ag0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(ag0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
