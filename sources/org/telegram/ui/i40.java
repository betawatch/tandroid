package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class i40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ s50 b;

    public i40(s50 s50Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = s50Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.b;
        s50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.q2 = null;
        s50Var.a2.j(this.a);
        AndroidUtilities.updateVisibleRows(s50Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
