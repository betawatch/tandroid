package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements al0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.al0
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
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.w.b(s5Var);
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
