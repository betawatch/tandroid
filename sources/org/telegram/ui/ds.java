package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ds extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ is o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(is isVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = isVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ms msVar = this.o.a;
        msVar.k = null;
        msVar.K = false;
        if (msVar.R) {
            msVar.m();
        }
    }
}
