package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements hk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    break;
                }
                break;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                    v5Var.x.d(v5Var);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                int i11 = ph.c.S1;
                break;
            default:
                int i12 = ph.m.s2;
                break;
        }
    }

    private final void a(int i10, View view) {
    }
}
