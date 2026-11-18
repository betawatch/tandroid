package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ y60 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(y60 y60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = y60Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.h1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        y60 y60Var = this.p;
        y60.a(y60Var, viewGroup);
        Runnable runnable = y60Var.p;
        if (runnable != null) {
            runnable.run();
            y60Var.p = null;
        }
    }
}
