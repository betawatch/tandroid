package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bs extends f2.l {
    public final /* synthetic */ ds F;

    public bs(ds dsVar) {
        this.F = dsVar;
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
