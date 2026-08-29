package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ r50 b;

    public i40(r50 r50Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = r50Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        r50 r50Var = this.b;
        r50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        r50Var.m2 = null;
        r50Var.W1.j(this.a);
        AndroidUtilities.updateVisibleRows(r50Var.i2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
