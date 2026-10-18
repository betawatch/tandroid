package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements wl0 {
    public final /* synthetic */ int a;

    public /* synthetic */ n7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.wl0
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
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.w.c(s5Var);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                int i11 = yh.c.a0;
                break;
            default:
                int i12 = yh.n.A0;
                break;
        }
    }

    private final void b(int i10, View view) {
    }
}
