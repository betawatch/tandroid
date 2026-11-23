package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c61 extends org.telegram.ui.Cells.j0 implements org.telegram.ui.ActionBar.b6 {
    public int e;
    public final /* synthetic */ g61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(g61 g61Var, Context context) {
        super(context);
        this.f = g61Var;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Cells.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
            if (x02 != this.e) {
                this.e = x02;
                i0Var.setOuterColor(x02);
                i0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
