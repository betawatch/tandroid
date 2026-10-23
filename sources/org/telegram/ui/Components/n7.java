package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements am0 {
    public final /* synthetic */ int a;

    public /* synthetic */ n7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    break;
                }
                break;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.w.b(s5Var);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                int i11 = yh.c.a0;
                break;
            default:
                int i12 = yh.m.A0;
                break;
        }
    }

    private final void a(int i10, View view) {
    }
}
