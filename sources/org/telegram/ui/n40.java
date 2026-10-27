package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ x50 b;

    public n40(x50 x50Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = x50Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        x50 x50Var = this.b;
        x50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        x50Var.q2 = null;
        x50Var.a2.j(this.a);
        AndroidUtilities.updateVisibleRows(x50Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
