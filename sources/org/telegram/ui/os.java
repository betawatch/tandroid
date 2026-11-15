package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements org.telegram.messenger.is {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ os(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) this.b;
                if (i7 == 259) {
                    v9Var.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ActionBar.l2) this.b).invalidate();
                break;
        }
    }
}
