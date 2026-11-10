package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements org.telegram.messenger.ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ os(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) this.b;
                if (i7 == 259) {
                    w9Var.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ActionBar.n2) this.b).invalidate();
                break;
        }
    }
}
