package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
