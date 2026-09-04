package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements zk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ n7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.zk0
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
                int i12 = yh.m.A0;
                break;
        }
    }

    private final void b(int i10, View view) {
    }
}
