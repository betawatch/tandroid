package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements org.telegram.messenger.ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ls(int i7, View view) {
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
                ((org.telegram.ui.ActionBar.m2) this.b).invalidate();
                break;
        }
    }
}
