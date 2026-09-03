package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w extends f2.l {
    public final /* synthetic */ z F;

    public w(z zVar) {
        this.F = zVar;
    }

    @Override // f2.l
    public final void P(f2.m1 m1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
