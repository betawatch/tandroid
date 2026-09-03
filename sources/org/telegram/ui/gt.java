package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gt extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ mt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(mt mtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = mtVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        qt qtVar = this.o.a;
        qtVar.k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
