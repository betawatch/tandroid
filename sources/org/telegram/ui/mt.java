package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt implements org.telegram.messenger.us {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ mt(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.b;
                if (i10 == 259) {
                    x9Var.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ActionBar.q2) this.b).invalidate();
                break;
        }
    }
}
