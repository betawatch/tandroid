package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d61 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.c6 {
    public int e;
    public final /* synthetic */ h61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(h61 h61Var, Context context) {
        super(context);
        this.f = h61Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jj));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Jj, false);
            if (x02 != this.e) {
                this.e = x02;
                h0Var.setOuterColor(x02);
                h0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
