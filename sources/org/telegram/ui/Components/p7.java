package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p7 implements zl0 {
    public final /* synthetic */ int a;

    public /* synthetic */ p7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    break;
                }
                break;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
                    x5Var.w.b(x5Var);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                int i11 = zh.c.a0;
                break;
            default:
                int i12 = zh.m.A0;
                break;
        }
    }

    private final void a(int i10, View view) {
    }
}
