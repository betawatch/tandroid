package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ o50 b;

    public f40(o50 o50Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = o50Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        o50 o50Var = this.b;
        o50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        o50Var.m2 = null;
        o50Var.W1.j(this.a);
        AndroidUtilities.updateVisibleRows(o50Var.i2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
