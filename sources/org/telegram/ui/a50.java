package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ j60 b;

    public a50(j60 j60Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = j60Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.b;
        j60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.q2 = null;
        j60Var.a2.j(this.a);
        AndroidUtilities.updateVisibleRows(j60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
