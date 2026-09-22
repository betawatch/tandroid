package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements zk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.zk0
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
                    t5Var.w.b(t5Var);
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
