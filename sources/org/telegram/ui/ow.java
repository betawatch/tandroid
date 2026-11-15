package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ow extends org.telegram.ui.Components.iz {
    public final /* synthetic */ yw C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(yw ywVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.C0 = ywVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.C0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
