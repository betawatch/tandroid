package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ js(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) this.b;
                if (i3 == 259) {
                    v9Var.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ActionBar.k2) this.b).invalidate();
                break;
        }
    }
}
