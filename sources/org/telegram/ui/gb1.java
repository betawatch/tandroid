package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class gb1 extends org.telegram.ui.Cells.j0 implements org.telegram.ui.ActionBar.p6 {
    public int e;

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Cells.i0 i0Var = this.d;
        if (i0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
            if (x02 != this.e) {
                this.e = x02;
                i0Var.setOuterColor(x02);
                i0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
