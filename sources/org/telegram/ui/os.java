package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements org.telegram.messenger.gs {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ os(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.b;
                if (i7 == 262) {
                    x9Var.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ActionBar.n2) this.b).invalidate();
                break;
        }
    }
}
