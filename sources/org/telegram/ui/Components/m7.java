package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements kl0 {
    public final /* synthetic */ int a;

    public /* synthetic */ m7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.kl0
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
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.w.a(t5Var);
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
