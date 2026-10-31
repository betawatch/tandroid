package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ fr(int i10) {
        this.a = i10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                    v5Var.c(v5Var.getPhotoEntry() != null && v5Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    v5Var.setHighQuality(v5Var.getPhotoEntry() != null && v5Var.getPhotoEntry().c());
                    v5Var.f(v5Var.getPhotoEntry() != null ? v5Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.s1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.qm0) {
                    ((org.telegram.ui.Components.qm0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.qm0) {
                    ((org.telegram.ui.Components.qm0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
