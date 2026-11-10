package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements bj0 {
    public final /* synthetic */ int a;

    public /* synthetic */ f7(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    break;
                }
                break;
            case 1:
                boolean z9 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.y.d(q5Var);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                int i10 = zh.d.V1;
                break;
            default:
                int i11 = zh.l.v2;
                break;
        }
    }

    private final void a(int i7, View view) {
    }
}
