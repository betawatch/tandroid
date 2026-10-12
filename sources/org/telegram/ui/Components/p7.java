package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p7 implements am0 {
    public final /* synthetic */ int a;

    public /* synthetic */ p7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    break;
                }
                break;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.w.c(t5Var);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                int i11 = yh.d.a0;
                break;
            default:
                int i12 = yh.n.A0;
                break;
        }
    }

    private final void b(int i10, View view) {
    }
}
