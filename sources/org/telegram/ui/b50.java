package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ k60 b;

    public b50(k60 k60Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = k60Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.b;
        k60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.q2 = null;
        k60Var.a2.j(this.a);
        AndroidUtilities.updateVisibleRows(k60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
