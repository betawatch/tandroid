package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements ml0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    break;
                }
                break;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                    u5Var.w.b(u5Var);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                int i11 = xh.c.a0;
                break;
            default:
                int i12 = xh.m.A0;
                break;
        }
    }

    private final void a(int i10, View view) {
    }
}
