package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements org.telegram.messenger.fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ os(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) this.b;
                if (i7 == 261) {
                    w9Var.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ActionBar.o2) this.b).invalidate();
                break;
        }
    }
}
